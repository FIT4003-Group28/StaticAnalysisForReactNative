package com.google.ar.core;

import android.content.Context;
import android.os.Build;
import com.google.ar.core.Config;
import com.google.ar.core.exceptions.FatalException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Session {
    private static final String TAG = "ARCore-Session";
    final dbar faceCache;
    final long nativeSymbolTableHandle;
    public long nativeWrapperHandle;
    private SharedCamera sharedCamera;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum Feature {
        FRONT_CAMERA(1),
        SHARED_CAMERA(1000),
        PREFER_WIDE_FOV_PARTNER(4),
        DO_NOT_USE_ACTIVE_DEPTH_SENSOR(5),
        MOTION_TRACKING_ODOMETRY(6),
        HIT_TEST_WITH_DEPTH(7);
        
        final int nativeCode;

        Feature(int i) {
            this.nativeCode = i;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum FeatureMapQuality {
        INSUFFICIENT(0),
        SUFFICIENT(1),
        GOOD(2);
        
        final int nativeCode;

        FeatureMapQuality(int i) {
            this.nativeCode = i;
        }

        static FeatureMapQuality forNumber(int i) {
            FeatureMapQuality[] values;
            for (FeatureMapQuality featureMapQuality : values()) {
                if (featureMapQuality.nativeCode == i) {
                    return featureMapQuality;
                }
            }
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected value for native FeatureMapQuality, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    protected Session() {
        this.faceCache = new dbar();
        this.sharedCamera = null;
        this.nativeWrapperHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    @Deprecated
    public static Session createForSharedCamera(Context context) {
        return new Session(context, EnumSet.of(Feature.SHARED_CAMERA));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ByteBuffer directByteBufferOrDefault(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        }
        return byteBuffer.order(ByteOrder.nativeOrder());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void loadDynamicSymbolsAfterSessionCreate() {
        if (Build.VERSION.SDK_INT >= 24) {
            ArImage.nativeLoadSymbols();
            ImageMetadata.nativeLoadSymbols();
        }
    }

    private native long[] nativeAcquireAllAnchors(long j);

    private native long nativeAcquireEarth(long j);

    private native int nativeCheckModuleAvailability(long j, int i);

    private native void nativeCloseSession(long j);

    private native void nativeConfigure(long j, long j2);

    private native long nativeCreateAnchor(long j, Pose pose);

    private native long nativeCreateAugmentedRegion(long j, float[] fArr);

    private static native long nativeCreateSessionAndWrapperWithFeatures(Context context, int[] iArr);

    private static native long nativeCreateSessionAndWrapperWithSettings(Context context, String str);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long nativeCreateSessionWrapperFromHandle(long j, long j2);

    private native void nativeEnableIncognitoMode(long j);

    private native int nativeEstimateFeatureMapQualityForHosting(long j, Pose pose);

    private native long nativeGetCameraConfig(long j);

    private native void nativeGetConfig(long j, long j2);

    private native void nativeGetDebugSessionIdLongs(long j, long[] jArr);

    private native int nativeGetFrameDelay(long j);

    private native int nativeGetPlaybackStatus(long j);

    private native void nativeGetRandomAccessStats(long j, long j2);

    private native int nativeGetRecordingStatus(long j);

    private native long[] nativeGetSupportedCameraConfigs(long j);

    private native long[] nativeGetSupportedCameraConfigsWithFilter(long j, long j2);

    private native long nativeGetSymbolTable(long j);

    private native long nativeHostCloudAnchor(long j, long j2);

    private native long nativeHostCloudAnchorWithTtl(long j, long j2, int i);

    private native boolean nativeIsSupported(long j, long j2);

    private native void nativePause(long j);

    private native void nativeRequestModuleInstallDeferred(long j, int[] iArr);

    private native void nativeRequestModuleInstallImmediate(long j, int[] iArr);

    private native long nativeResolveCloudAnchor(long j, String str);

    private native void nativeResume(long j);

    private native void nativeSetAnalyticsPolicy(long j, String str);

    private native int nativeSetCameraConfig(long j, long j2);

    private native void nativeSetCameraTextureName(long j, int i);

    private native void nativeSetCameraTextureNames(long j, int[] iArr);

    private native void nativeSetDisplayGeometry(long j, int i, int i2, int i3);

    private native void nativeSetPlaybackDataset(long j, String str);

    private native void nativeStartRecording(long j, long j2);

    private native void nativeStopRecording(long j);

    private native void nativeUpdate(long j, long j2);

    private void pauseSharedCameraIfInUse() {
        SharedCamera sharedCamera = this.sharedCamera;
        if (sharedCamera != null) {
            sharedCamera.pause();
        }
    }

    static void throwExceptionFromArStatus(int i) {
        throwExceptionFromArStatus(null, i, null, null);
    }

    public ModuleAvailability checkModuleAvailability(Module module) {
        return ModuleAvailability.forNumber(nativeCheckModuleAvailability(this.nativeWrapperHandle, module.nativeCode));
    }

    public void close() {
        nativeCloseSession(this.nativeWrapperHandle);
    }

    public void configure(Config config) {
        nativeConfigure(this.nativeWrapperHandle, config.nativeHandle);
    }

    public Collection<Anchor> convertNativeAnchorsToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(new Anchor(j, this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public List<CameraConfig> convertNativeCameraConfigsToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(new CameraConfig(this, j));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public <T extends Trackable> Collection<T> convertNativeTrackablesToCollection(Class<T> cls, long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            Trackable createTrackable = createTrackable(j);
            if (createTrackable != null) {
                arrayList.add(cls.cast(createTrackable));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Anchor createAnchor(Pose pose) {
        return new Anchor(nativeCreateAnchor(this.nativeWrapperHandle, pose), this);
    }

    public AugmentedRegion createAugmentedRegion(float[] fArr) {
        return new AugmentedRegion(nativeCreateAugmentedRegion(this.nativeWrapperHandle, fArr), this);
    }

    public Trackable createTrackable(long j) {
        dbbm dbbmVar;
        int internalGetType = TrackableBase.internalGetType(this.nativeWrapperHandle, j);
        dbbm[] values = dbbm.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                dbbmVar = null;
                break;
            }
            dbbmVar = values[i];
            if (dbbmVar.k == internalGetType) {
                break;
            }
            i++;
        }
        if (dbbmVar == null) {
            TrackableBase.internalReleaseNativeHandle(this.nativeSymbolTableHandle, j);
            return null;
        }
        switch (dbbmVar.ordinal()) {
            case 0:
            case 1:
                return null;
            case 2:
                return new Plane(j, this);
            case 3:
                return new Point(j, this);
            case 4:
                return new AugmentedImage(j, this);
            case 5:
                return this.faceCache.a(j, this);
            case 6:
                return getEarth();
            case 7:
                return new DepthPoint(j, this);
            case 8:
                return new InstantPlacementPoint(j, this);
            case 9:
                return new MagicalSurfacePoint(j, this);
            default:
                throw null;
        }
    }

    public void enableIncognitoMode() {
        nativeEnableIncognitoMode(this.nativeWrapperHandle);
    }

    public FeatureMapQuality estimateFeatureMapQualityForHosting(Pose pose) {
        return FeatureMapQuality.forNumber(nativeEstimateFeatureMapQualityForHosting(this.nativeWrapperHandle, pose));
    }

    protected void finalize() {
        long j = this.nativeWrapperHandle;
        if (j != 0) {
            nativeDestroySessionWrapper(j);
            this.nativeWrapperHandle = 0L;
        }
        super.finalize();
    }

    public Collection<Anchor> getAllAnchors() {
        return convertNativeAnchorsToCollection(nativeAcquireAllAnchors(this.nativeWrapperHandle));
    }

    public <T extends Trackable> Collection<T> getAllTrackables(Class<T> cls) {
        dbbm a = dbbm.a(cls);
        if (a == dbbm.UNKNOWN_TO_JAVA) {
            return Collections.emptyList();
        }
        return convertNativeTrackablesToCollection(cls, nativeAcquireAllTrackables(this.nativeWrapperHandle, a.k));
    }

    public CameraConfig getCameraConfig() {
        return new CameraConfig(this, nativeGetCameraConfig(this.nativeWrapperHandle));
    }

    public Config getConfig() {
        Config config = new Config(this);
        getConfig(config);
        return config;
    }

    public UUID getDebugSessionId() {
        long[] jArr = new long[2];
        nativeGetDebugSessionIdLongs(this.nativeWrapperHandle, jArr);
        return new UUID(jArr[0], jArr[1]);
    }

    public Earth getEarth() {
        return new Earth(nativeAcquireEarth(this.nativeWrapperHandle), this);
    }

    public int getFrameDelay() {
        return nativeGetFrameDelay(this.nativeWrapperHandle);
    }

    public PlaybackStatus getPlaybackStatus() {
        return PlaybackStatus.forNumber(nativeGetPlaybackStatus(this.nativeWrapperHandle));
    }

    public RecordingStatus getRecordingStatus() {
        return RecordingStatus.forNumber(nativeGetRecordingStatus(this.nativeWrapperHandle));
    }

    public SharedCamera getSharedCamera() {
        SharedCamera sharedCamera = this.sharedCamera;
        if (sharedCamera != null) {
            return sharedCamera;
        }
        throw new IllegalStateException("Shared camera is not in use, please create session using new Session(context, EnumSet.of(Session.Feature.SHARED_CAMERA)).");
    }

    @Deprecated
    public List<CameraConfig> getSupportedCameraConfigs() {
        return convertNativeCameraConfigsToCollection(nativeGetSupportedCameraConfigs(this.nativeWrapperHandle));
    }

    public Anchor hostCloudAnchor(Anchor anchor) {
        return new Anchor(nativeHostCloudAnchor(this.nativeWrapperHandle, anchor.nativeHandle), this);
    }

    public Anchor hostCloudAnchorWithTtl(Anchor anchor, int i) {
        return new Anchor(nativeHostCloudAnchorWithTtl(this.nativeWrapperHandle, anchor.nativeHandle, i), this);
    }

    public boolean isDepthModeSupported(Config.DepthMode depthMode) {
        return nativeIsDepthModeSupported(this.nativeWrapperHandle, depthMode.nativeCode);
    }

    public boolean isDepthModeSupportedPrivate(Config.DepthMode depthMode) {
        return nativeIsDepthModeSupportedPrivate(this.nativeWrapperHandle, depthMode.nativeCode);
    }

    public boolean isSegmentationModeSupported(Config.SegmentationMode segmentationMode) {
        return nativeIsSegmentationModeSupported(this.nativeWrapperHandle, segmentationMode.nativeCode);
    }

    boolean isSharedCameraUsed() {
        return this.sharedCamera != null;
    }

    @Deprecated
    public boolean isSupported(Config config) {
        return nativeIsSupported(this.nativeWrapperHandle, config.nativeHandle);
    }

    public native long[] nativeAcquireAllTrackables(long j, int i);

    public native void nativeDestroySessionWrapper(long j);

    public native long nativeGetSessionNativeHandle(long j);

    public native boolean nativeIsDepthModeSupported(long j, int i);

    public native boolean nativeIsDepthModeSupportedPrivate(long j, int i);

    public native boolean nativeIsSegmentationModeSupported(long j, int i);

    public native long nativeReleaseSessionOwnership(long j);

    public void pause() {
        pauseSharedCameraIfInUse();
        nativePause(this.nativeWrapperHandle);
    }

    public void requestModuleInstallDeferred(List<Module> list) {
        int[] iArr = new int[list.size()];
        int i = 0;
        for (Module module : list) {
            iArr[i] = module.nativeCode;
            i++;
        }
        nativeRequestModuleInstallDeferred(this.nativeWrapperHandle, iArr);
    }

    public void requestModuleInstallImmediate(List<Module> list) {
        int[] iArr = new int[list.size()];
        int i = 0;
        for (Module module : list) {
            iArr[i] = module.nativeCode;
            i++;
        }
        nativeRequestModuleInstallImmediate(this.nativeWrapperHandle, iArr);
    }

    public Anchor resolveCloudAnchor(String str) {
        return new Anchor(nativeResolveCloudAnchor(this.nativeWrapperHandle, str), this);
    }

    public void resume() {
        nativeResume(this.nativeWrapperHandle);
    }

    public void setAnalyticsPolicy(String str) {
        nativeSetAnalyticsPolicy(this.nativeWrapperHandle, str);
    }

    public void setCameraConfig(CameraConfig cameraConfig) {
        nativeSetCameraConfig(this.nativeWrapperHandle, cameraConfig.nativeHandle);
    }

    public void setCameraTextureName(int i) {
        nativeSetCameraTextureName(this.nativeWrapperHandle, i);
    }

    public void setCameraTextureNames(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("textureIds must be an array with at least 1 entry.");
        }
        nativeSetCameraTextureNames(this.nativeWrapperHandle, iArr);
    }

    public void setDisplayGeometry(int i, int i2, int i3) {
        nativeSetDisplayGeometry(this.nativeWrapperHandle, i, i2, i3);
    }

    public void setPlaybackDataset(String str) {
        nativeSetPlaybackDataset(this.nativeWrapperHandle, str);
    }

    public void startRecording(RecordingConfig recordingConfig) {
        if (recordingConfig == null) {
            throw new IllegalArgumentException();
        }
        nativeStartRecording(this.nativeWrapperHandle, recordingConfig.nativeHandle);
    }

    public void stopRecording() {
        nativeStopRecording(this.nativeWrapperHandle);
    }

    public Frame update() {
        Frame frame = new Frame(this);
        nativeUpdate(this.nativeWrapperHandle, frame.nativeHandle);
        return frame;
    }

    public Session(long j) {
        this.faceCache = new dbar();
        this.sharedCamera = null;
        this.nativeWrapperHandle = j;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(j);
    }

    static void throwExceptionFromArStatus(String str, int i, String[] strArr, int[] iArr) {
        dbbl[] values;
        int i2;
        for (dbbl dbblVar : dbbl.values()) {
            if (dbblVar.G == i) {
                Class<? extends Exception> cls = dbblVar.H;
                if (cls == null) {
                    return;
                }
                if (strArr == null || iArr == null || (i2 = strArr.length) != iArr.length) {
                    i2 = 0;
                }
                String str2 = dbblVar.I;
                if (str2 != null || str != null) {
                    if (str2 != null) {
                        if (str == null) {
                            str = str2;
                        } else {
                            String valueOf = String.valueOf(str2);
                            String valueOf2 = String.valueOf(str);
                            str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                        }
                    }
                    Exception newInstance = dbblVar.H.getConstructor(String.class).newInstance(str);
                    StackTraceElement[] stackTrace = newInstance.getStackTrace();
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[stackTrace.length + i2];
                    int i3 = 0;
                    while (i3 < i2) {
                        stackTraceElementArr[i3] = new StackTraceElement("ARCore", "native", strArr[i3], iArr[i3]);
                        i3++;
                    }
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        stackTraceElementArr[i3] = stackTraceElement;
                        i3++;
                    }
                    newInstance.setStackTrace(stackTraceElementArr);
                    throw newInstance;
                }
                throw cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            }
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Unexpected error code: ");
        sb.append(i);
        throw new FatalException(sb.toString());
    }

    public void getConfig(Config config) {
        nativeGetConfig(this.nativeWrapperHandle, config.nativeHandle);
    }

    public List<CameraConfig> getSupportedCameraConfigs(CameraConfigFilter cameraConfigFilter) {
        if (cameraConfigFilter == null) {
            throw new IllegalArgumentException();
        }
        long[] nativeGetSupportedCameraConfigsWithFilter = nativeGetSupportedCameraConfigsWithFilter(this.nativeWrapperHandle, cameraConfigFilter.nativeHandle);
        ArrayList arrayList = new ArrayList(nativeGetSupportedCameraConfigsWithFilter.length);
        for (long j : nativeGetSupportedCameraConfigsWithFilter) {
            arrayList.add(new CameraConfig(this, j));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Session(Context context) {
        this(context, EnumSet.noneOf(Feature.class));
    }

    public Session(Context context, String str) {
        this.faceCache = new dbar();
        this.sharedCamera = null;
        System.loadLibrary("arcore_sdk_jni");
        long nativeCreateSessionAndWrapperWithSettings = nativeCreateSessionAndWrapperWithSettings(context, str);
        this.nativeWrapperHandle = nativeCreateSessionAndWrapperWithSettings;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(nativeCreateSessionAndWrapperWithSettings);
        if (str.contains("camera_stack,java")) {
            this.sharedCamera = new SharedCamera(this);
        }
        loadDynamicSymbolsAfterSessionCreate();
    }

    public Session(Context context, Set<Feature> set) {
        this.faceCache = new dbar();
        this.sharedCamera = null;
        System.loadLibrary("arcore_sdk_jni");
        int[] iArr = new int[set.size() + 1];
        int i = 0;
        for (Feature feature : set) {
            iArr[i] = feature.nativeCode;
            i++;
        }
        iArr[i] = 0;
        long nativeCreateSessionAndWrapperWithFeatures = nativeCreateSessionAndWrapperWithFeatures(context, iArr);
        this.nativeWrapperHandle = nativeCreateSessionAndWrapperWithFeatures;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(nativeCreateSessionAndWrapperWithFeatures);
        if (set.contains(Feature.SHARED_CAMERA)) {
            this.sharedCamera = new SharedCamera(this);
        }
        loadDynamicSymbolsAfterSessionCreate();
    }
}
