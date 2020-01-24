//package com.example.ble_connection;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.app.ListActivity;
//import android.bluetooth.BluetoothAdapter;
//import android.bluetooth.BluetoothDevice;
//import android.bluetooth.BluetoothManager;
//import android.content.Context;
//import android.os.Bundle;
//import android.os.Handler;
//
///**
// * Activity for scanning and displaying available BLE devices.
// */
//public class DeviceScanActivity extends ListActivity {
//
//    final BluetoothManager bluetoothManager =(BluetoothManager) getSystemService(Context.BLUETOOTH_SERVICE);
//    private BluetoothAdapter bluetoothAdapter = bluetoothManager.getAdapter();
//    private boolean mScanning;
//    private Handler handler;
//
//    // Stops scanning after 30 seconds.
//    private static final long SCAN_PERIOD = 30000;
//
//    private LeDeviceListAdapter leDeviceListAdapter;
//
//    // Device scan callback.
//    private BluetoothAdapter.LeScanCallback leScanCallback =
//            new BluetoothAdapter.LeScanCallback() {
//                @Override
//                public void onLeScan(final BluetoothDevice device, int rssi,
//                                     byte[] scanRecord) {
//                    runOnUiThread(new Runnable() {
//                        @Override
//                        public void run() {
//                            leDeviceListAdapter.addDevice(device);
//                            leDeviceListAdapter.notifyDataSetChanged();
//                        }
//                    });
//                }
//            };
//
//    private void scanLeDevice(final boolean enable) {
//        if (enable) {
//            // Stops scanning after a pre-defined scan period.
//            handler.postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    mScanning = false;
//                    bluetoothAdapter.stopLeScan(leScanCallback);
//                }
//            }, SCAN_PERIOD);
//
//            mScanning = true;
//            bluetoothAdapter.s
//            bluetoothAdapter.startLeScan(leScanCallback);
//        } else {
//            mScanning = false;
//            bluetoothAdapter.stopLeScan(leScanCallback);
//        }
//    }
//}
