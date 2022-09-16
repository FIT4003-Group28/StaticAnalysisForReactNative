package com.google.vr.ndk.base;

import android.content.Context;
import android.util.Log;
import com.google.vr.sdk.proto.SdkConfiguration$SdkConfigurationRequest;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class SdkConfigurationReader {
    public static final anfs DEFAULT_PARAMS;
    static final anfs REQUESTED_PARAMS;
    static anfs sParams;

    static {
        aopa createBuilder = anfs.DEFAULT_INSTANCE.createBuilder();
        createBuilder.copyOnWrite();
        anfs anfsVar = (anfs) createBuilder.instance;
        anfsVar.bitField0_ |= 2;
        anfsVar.useSystemClockForSensorTimestamps_ = true;
        createBuilder.copyOnWrite();
        anfs anfsVar2 = (anfs) createBuilder.instance;
        anfsVar2.bitField0_ |= 4;
        anfsVar2.useMagnetometerInSensorFusion_ = true;
        createBuilder.copyOnWrite();
        anfs anfsVar3 = (anfs) createBuilder.instance;
        anfsVar3.bitField0_ |= 512;
        anfsVar3.useStationaryBiasCorrection_ = true;
        createBuilder.copyOnWrite();
        anfs anfsVar4 = (anfs) createBuilder.instance;
        anfsVar4.bitField0_ |= 8;
        anfsVar4.allowDynamicLibraryLoading_ = true;
        createBuilder.copyOnWrite();
        anfs anfsVar5 = (anfs) createBuilder.instance;
        anfsVar5.bitField0_ |= 16;
        anfsVar5.cpuLateLatchingEnabled_ = true;
        anfp anfpVar = anfp.DISABLED;
        createBuilder.copyOnWrite();
        anfs anfsVar6 = (anfs) createBuilder.instance;
        anfsVar6.daydreamImageAlignment_ = anfpVar.value;
        anfsVar6.bitField0_ |= 32;
        anfm anfmVar = anfm.DEFAULT_INSTANCE;
        createBuilder.copyOnWrite();
        anfs anfsVar7 = (anfs) createBuilder.instance;
        anfmVar.getClass();
        anfsVar7.asyncReprojectionConfig_ = anfmVar;
        anfsVar7.bitField0_ |= 64;
        createBuilder.copyOnWrite();
        anfs anfsVar8 = (anfs) createBuilder.instance;
        anfsVar8.bitField0_ |= 128;
        anfsVar8.useOnlineMagnetometerCalibration_ = true;
        createBuilder.copyOnWrite();
        anfs anfsVar9 = (anfs) createBuilder.instance;
        anfsVar9.bitField0_ |= 256;
        anfsVar9.useDeviceIdleDetection_ = true;
        createBuilder.copyOnWrite();
        anfs anfsVar10 = (anfs) createBuilder.instance;
        anfsVar10.bitField0_ |= 1024;
        anfsVar10.allowDynamicJavaLibraryLoading_ = true;
        createBuilder.copyOnWrite();
        anfs anfsVar11 = (anfs) createBuilder.instance;
        anfsVar11.bitField0_ |= 2048;
        anfsVar11.touchOverlayEnabled_ = true;
        createBuilder.copyOnWrite();
        anfs anfsVar12 = (anfs) createBuilder.instance;
        anfsVar12.bitField0_ |= 32768;
        anfsVar12.enableForcedTrackingCompat_ = true;
        createBuilder.copyOnWrite();
        anfs anfsVar13 = (anfs) createBuilder.instance;
        anfsVar13.bitField0_ |= 4096;
        anfsVar13.allowVrcoreHeadTracking_ = true;
        createBuilder.copyOnWrite();
        anfs anfsVar14 = (anfs) createBuilder.instance;
        anfsVar14.bitField0_ |= 8192;
        anfsVar14.allowVrcoreCompositing_ = true;
        anfr anfrVar = anfr.DEFAULT_INSTANCE;
        createBuilder.copyOnWrite();
        anfs anfsVar15 = (anfs) createBuilder.instance;
        anfrVar.getClass();
        anfsVar15.screenCaptureConfig_ = anfrVar;
        anfsVar15.bitField0_ |= 65536;
        createBuilder.copyOnWrite();
        anfs anfsVar16 = (anfs) createBuilder.instance;
        anfsVar16.bitField0_ |= 262144;
        anfsVar16.dimUiLayer_ = true;
        createBuilder.copyOnWrite();
        anfs anfsVar17 = (anfs) createBuilder.instance;
        anfsVar17.bitField0_ |= 131072;
        anfsVar17.disallowMultiview_ = true;
        createBuilder.copyOnWrite();
        anfs anfsVar18 = (anfs) createBuilder.instance;
        anfsVar18.bitField0_ |= 524288;
        anfsVar18.useDirectModeSensors_ = true;
        createBuilder.copyOnWrite();
        anfs anfsVar19 = (anfs) createBuilder.instance;
        anfsVar19.bitField0_ |= 1048576;
        anfsVar19.allowPassthrough_ = true;
        createBuilder.copyOnWrite();
        anfs.a((anfs) createBuilder.instance);
        REQUESTED_PARAMS = (anfs) createBuilder.mo39build();
        aopa createBuilder2 = anfs.DEFAULT_INSTANCE.createBuilder();
        createBuilder2.copyOnWrite();
        anfs anfsVar20 = (anfs) createBuilder2.instance;
        anfsVar20.bitField0_ |= 2;
        anfsVar20.useSystemClockForSensorTimestamps_ = false;
        createBuilder2.copyOnWrite();
        anfs anfsVar21 = (anfs) createBuilder2.instance;
        anfsVar21.bitField0_ |= 4;
        anfsVar21.useMagnetometerInSensorFusion_ = false;
        createBuilder2.copyOnWrite();
        anfs anfsVar22 = (anfs) createBuilder2.instance;
        anfsVar22.bitField0_ |= 512;
        anfsVar22.useStationaryBiasCorrection_ = false;
        createBuilder2.copyOnWrite();
        anfs anfsVar23 = (anfs) createBuilder2.instance;
        anfsVar23.bitField0_ |= 8;
        anfsVar23.allowDynamicLibraryLoading_ = false;
        createBuilder2.copyOnWrite();
        anfs anfsVar24 = (anfs) createBuilder2.instance;
        anfsVar24.bitField0_ |= 16;
        anfsVar24.cpuLateLatchingEnabled_ = false;
        anfp anfpVar2 = anfp.ENABLED_WITH_MEDIAN_FILTER;
        createBuilder2.copyOnWrite();
        anfs anfsVar25 = (anfs) createBuilder2.instance;
        anfsVar25.daydreamImageAlignment_ = anfpVar2.value;
        anfsVar25.bitField0_ |= 32;
        createBuilder2.copyOnWrite();
        anfs anfsVar26 = (anfs) createBuilder2.instance;
        anfsVar26.bitField0_ |= 128;
        anfsVar26.useOnlineMagnetometerCalibration_ = false;
        createBuilder2.copyOnWrite();
        anfs anfsVar27 = (anfs) createBuilder2.instance;
        anfsVar27.bitField0_ |= 256;
        anfsVar27.useDeviceIdleDetection_ = false;
        createBuilder2.copyOnWrite();
        anfs anfsVar28 = (anfs) createBuilder2.instance;
        anfsVar28.bitField0_ |= 1024;
        anfsVar28.allowDynamicJavaLibraryLoading_ = false;
        createBuilder2.copyOnWrite();
        anfs anfsVar29 = (anfs) createBuilder2.instance;
        anfsVar29.bitField0_ |= 2048;
        anfsVar29.touchOverlayEnabled_ = false;
        createBuilder2.copyOnWrite();
        anfs anfsVar30 = (anfs) createBuilder2.instance;
        anfsVar30.bitField0_ |= 32768;
        anfsVar30.enableForcedTrackingCompat_ = false;
        createBuilder2.copyOnWrite();
        anfs anfsVar31 = (anfs) createBuilder2.instance;
        anfsVar31.bitField0_ |= 4096;
        anfsVar31.allowVrcoreHeadTracking_ = false;
        createBuilder2.copyOnWrite();
        anfs anfsVar32 = (anfs) createBuilder2.instance;
        anfsVar32.bitField0_ |= 8192;
        anfsVar32.allowVrcoreCompositing_ = false;
        createBuilder2.copyOnWrite();
        anfs anfsVar33 = (anfs) createBuilder2.instance;
        anfsVar33.bitField0_ |= 262144;
        anfsVar33.dimUiLayer_ = false;
        createBuilder2.copyOnWrite();
        anfs anfsVar34 = (anfs) createBuilder2.instance;
        anfsVar34.bitField0_ |= 131072;
        anfsVar34.disallowMultiview_ = false;
        createBuilder2.copyOnWrite();
        anfs anfsVar35 = (anfs) createBuilder2.instance;
        anfsVar35.bitField0_ |= 524288;
        anfsVar35.useDirectModeSensors_ = false;
        createBuilder2.copyOnWrite();
        anfs anfsVar36 = (anfs) createBuilder2.instance;
        anfsVar36.bitField0_ |= 1048576;
        anfsVar36.allowPassthrough_ = false;
        createBuilder2.copyOnWrite();
        anfs.a((anfs) createBuilder2.instance);
        DEFAULT_PARAMS = (anfs) createBuilder2.mo39build();
    }

    public static anfs getParams(Context context) {
        synchronized (SdkConfigurationReader.class) {
            anfs anfsVar = sParams;
            if (anfsVar != null) {
                return anfsVar;
            }
            axfg d = awwd.d(context);
            anfs readParamsFromProvider = readParamsFromProvider(d);
            synchronized (SdkConfigurationReader.class) {
                sParams = readParamsFromProvider;
            }
            d.f();
            return sParams;
        }
    }

    private static anfs readParamsFromProvider(axfg axfgVar) {
        SdkConfiguration$SdkConfigurationRequest.Builder newBuilder = SdkConfiguration$SdkConfigurationRequest.newBuilder();
        newBuilder.setRequestedParams(REQUESTED_PARAMS);
        newBuilder.setSdkVersion("1.218.0");
        anfs a = axfgVar.a((SdkConfiguration$SdkConfigurationRequest) newBuilder.mo39build());
        if (a == null) {
            Log.w("SdkConfigurationReader", "VrParamsProvider returned null params, using defaults.");
            return DEFAULT_PARAMS;
        }
        String.valueOf(String.valueOf(a)).length();
        return a;
    }
}
