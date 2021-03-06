// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from http_client.djinni

package com.ledger.reactnative;

import co.ledger.core.Error;
import co.ledger.core.HttpReadBodyResult;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.TimeZone;
import java.util.UUID;

/** Structure representing Http response body. */
@ReactModule(name = "RCTCoreHttpReadBodyResult")
public class RCTCoreHttpReadBodyResult extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;
    private Map<String, HttpReadBodyResult> javaObjects;
    private Map<String, Object> implementationsData;
    public Map<String, HttpReadBodyResult> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreHttpReadBodyResult(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, HttpReadBodyResult>();
        this.implementationsData = new HashMap<>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreHttpReadBodyResult";
    }
    @ReactMethod
    public void release(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            this.javaObjects.remove(uid);
            promise.resolve(0);
        }
        else
        {
            promise.reject("Failed to release instance of RCTCoreHttpReadBodyResult", "First parameter of RCTCoreHttpReadBodyResult::release should be an instance of RCTCoreHttpReadBodyResult");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, HttpReadBodyResult> elem : this.javaObjects.entrySet())
        {
            result.pushString(elem.getKey());
        }
        promise.resolve(result);
    }
    @ReactMethod
    public void flush(Promise promise)
    {
        this.javaObjects.clear();
        promise.resolve(0);
    }
    @ReactMethod
    public void isNull(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            if (this.javaObjects.get(uid) == null)
            {
                promise.resolve(true);
                return;
            }
            else
            {
                promise.resolve(false);
                return;
            }
        }
        promise.resolve(true);
    }
    public static byte[] hexStringToByteArray(String hexString)
    {
        int hexStringLength = hexString.length();
        byte[] data = new byte[hexStringLength / 2];
        for (int i = 0; i < hexStringLength; i += 2)
        {
            data[i / 2] = (byte) ((Character.digit(hexString.charAt(i), 16) << 4) + Character.digit(hexString.charAt(i+1), 16));
        }
        return data;
    }
    static final String HEXES = "0123456789ABCDEF";
    public static String byteArrayToHexString( byte [] data)
    {
        if (data == null)
        {
            return null;
        }
        final StringBuilder hexStringBuilder = new StringBuilder( 2 * data.length );
        for ( final byte b : data )
        {
            hexStringBuilder.append(HEXES.charAt((b & 0xF0) >> 4)).append(HEXES.charAt((b & 0x0F)));
        }
        return hexStringBuilder.toString();
    }

    @ReactMethod
    public void init(Optional<ReadableMap> error, String data, Promise promise) {
        WritableNativeMap implementationsData = new WritableNativeMap();
        RCTCoreError rctParam_error = this.reactContext.getNativeModule(RCTCoreError.class);
        Error javaParam_0 = rctParam_error.getJavaObjects().get(error.get().getString("uid"));
        implementationsData.putString("error", error.get().getString("uid"));
        byte [] javaParam_1 = hexStringToByteArray(data);

        HttpReadBodyResult javaResult = new HttpReadBodyResult(javaParam_0, javaParam_1);

        String uuid = UUID.randomUUID().toString();
        this.javaObjects.put(uuid, javaResult);
        WritableNativeMap finalResult = new WritableNativeMap();
        finalResult.putString("type","RCTCoreHttpReadBodyResult");
        finalResult.putString("uid",uuid);
        this.implementationsData.put(uuid, implementationsData);
        promise.resolve(finalResult);
    }
    public void mapImplementationsData(ReadableMap currentInstance)
    {
        String currentInstanceUid = currentInstance.getString("uid");
        HttpReadBodyResult javaImpl = this.javaObjects.get(currentInstanceUid);
        WritableNativeMap implementationsData = new WritableNativeMap();
        Error field_0 = javaImpl.getError();
        String field_0_uuid = UUID.randomUUID().toString();
        RCTCoreError rctImpl_field_0 = this.reactContext.getNativeModule(RCTCoreError.class);
        rctImpl_field_0.getJavaObjects().put(field_0_uuid, field_0);
        WritableNativeMap converted_field_0 = new WritableNativeMap();
        converted_field_0.putString("type","RCTCoreError");
        converted_field_0.putString("uid",field_0_uuid);
        implementationsData.putMap("error", converted_field_0);
        this.implementationsData.put(currentInstanceUid, implementationsData);
    }
    @ReactMethod
    public void getError(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            if (!this.implementationsData.containsKey(uid))
            {
                this.mapImplementationsData(currentInstance);
            }
            ReadableNativeMap data = (ReadableNativeMap)this.implementationsData.get(uid);
            WritableNativeMap result = new WritableNativeMap();
            result.merge(data.getMap("error"));
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreHttpReadBodyResult::getError", "First parameter of RCTCoreHttpReadBodyResult::getError should be an instance of RCTCoreHttpReadBodyResult");
        }
    }

    @ReactMethod
    public void getData(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            HttpReadBodyResult javaObj = this.javaObjects.get(uid);
            byte[] result = javaObj.getData();
            String converted_result = byteArrayToHexString(result);
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putString("value", converted_result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreHttpReadBodyResult::getData", "First parameter of RCTCoreHttpReadBodyResult::getData should be an instance of RCTCoreHttpReadBodyResult");
        }
    }

}
