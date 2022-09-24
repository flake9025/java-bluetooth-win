package fr.vvlabs.bluetooth;

public class WindowsBluetoothManager {

	/**
	 * get Bluetooth Devices List
	 * @return devices ids
	 */
  public static native String[] getDevices();

	/**
	 * Get Bluetooth Device Name
	 * @param deviceId
	 * @return device friendly name
	 */
  public static native String getDeviceName(String deviceId);

	/**
	 * Get Device Services
	 * @param deviceId
	 * @return services uuids
	 */
  public static native String[] getDeviceServices(String deviceId);

	/**
	 * Get Device Service Characteristics
	 * @param deviceId
	 * @param serviceUuid
	 * @return characteristics uuids
	 */
  public static native String[] getDeviceServiceCharacteristics(String deviceId, String serviceUuid);

	/**
	 * Get Device Characteristic value
	 * @param deviceId
	 * @param serviceUuid
	 * @param characteristicUuid
	 * @return characteristic value
	 */
  public static native byte[] getCharacteristicValue(String deviceId, String serviceUuid, String characteristicUuid);

	/**
	 * Set Device Characteristic value
	 * @param deviceId
	 * @param serviceUuid
	 * @param characteristicUuid
	 * @param value
	 * @return true if set
	 */
  public static native boolean setCharacteristicValue(String deviceId, String serviceUuid, String characteristicUuid, byte[] value);
}
