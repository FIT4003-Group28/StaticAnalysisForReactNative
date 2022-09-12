package com.google.android.apps.gmm.offline.backends;

import com.google.android.apps.gmm.map.util.jni.NativeHelper;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class OfflineInfrastructureNativeImpl implements avoj {
    public static final /* synthetic */ int a = 0;
    private final crzd<Runnable> b = new crzd<>();

    static {
        NativeHelper.a();
        nativeInitClass();
    }

    private native byte[] nativeAbandonUnstartedUpdate(long j, byte[] bArr);

    private native byte[] nativeAddOperationIdToUpdate(long j, byte[] bArr);

    private native byte[] nativeAddRegion(long j, byte[] bArr);

    private native byte[] nativeAssessOfflineUpdateResponse(long j, byte[] bArr);

    private native byte[] nativeCancelUpdate(long j);

    private native byte[] nativeCheckForExpiry(long j);

    private native byte[] nativeDefaultDownloadConnectivityRequirementChanged(long j);

    private native byte[] nativeDeleteAllDataForOwner(long j, byte[] bArr);

    private native byte[] nativeDeleteRegions(long j, byte[] bArr);

    private native byte[] nativeExportActiveVisibleRegionDefinitions(long j);

    private native long nativeGenerateOperationId(long j);

    private native byte[] nativeGetAllOwners(long j);

    private native byte[] nativeGetAndClearNotifications(long j, byte[] bArr);

    private native byte[] nativeGetClientCapabilities(long j, byte[] bArr);

    private native byte[] nativeGetCommittedResources(long j);

    private native byte[] nativeGetDynamicPaddingLocationStatus(long j, byte[] bArr, double d, double d2);

    private native byte[] nativeGetInfrastructureStateForOwner(long j, byte[] bArr, long j2, int i);

    private native byte[] nativeGetInfrastructureStateWithAllOwners(long j, long j2, int i);

    private native byte[] nativeGetNextDownload(long j);

    private native byte[] nativeGetNextSteps(long j, long j2);

    private native byte[] nativeImportRegionDefinitions(long j, byte[] bArr);

    private static native boolean nativeInitClass();

    private native void nativeLogUpdateSuspended(long j);

    private native void nativeMarkLocationsUsed(long j, byte[] bArr, byte[] bArr2, byte[] bArr3);

    private native void nativeMarkRegionForUpdate(long j, byte[] bArr);

    private native void nativeMarkUpdateDynamic(long j, byte[] bArr, byte[] bArr2);

    private native byte[] nativeMaybeReportRegionUtilization(long j, byte[] bArr);

    private native void nativeMergeRegionMetadata(long j, byte[] bArr, byte[] bArr2);

    private native void nativeMigrateData(long j, byte[] bArr);

    private native byte[] nativeOptimizeIfNeeded(long j, int i);

    private native byte[] nativePauseUpdate(long j);

    private native byte[] nativePrepareUpdate(long j, byte[] bArr);

    private native byte[] nativeProcess(long j);

    private native void nativeRenameRegion(long j, byte[] bArr, String str);

    private native byte[] nativeResumeInterruptedWork(long j, byte[] bArr);

    private native byte[] nativeResumeUpdate(long j);

    private native void nativeSendDebugCommand(long j, byte[] bArr);

    private native void nativeSetClientDownloadId(long j, String str, String str2);

    private native void nativeSetDownloadProgress(long j, String str, double d);

    private native byte[] nativeSetDownloadResult(long j, String str, byte[] bArr);

    private native void nativeSetRegionMetadata(long j, byte[] bArr, byte[] bArr2);

    private native byte[] nativeShutdown(long j);

    private native byte[] nativeSideload(long j, byte[] bArr);

    private native byte[] nativeStartUpdate(long j, byte[] bArr);

    private native byte[] nativeTimeoutUpdate(long j);

    @Override // defpackage.avoj
    public final byte[] A(long j) {
        return nativeExportActiveVisibleRegionDefinitions(j);
    }

    @Override // defpackage.avoj
    public final byte[] B(long j, byte[] bArr) {
        return nativeImportRegionDefinitions(j, bArr);
    }

    @Override // defpackage.avoj
    public final void C(long j, String str, double d) {
        nativeSetDownloadProgress(j, str, d);
    }

    @Override // defpackage.avoj
    public final byte[] D(long j, byte[] bArr) {
        return nativeGetClientCapabilities(j, bArr);
    }

    @Override // defpackage.avoj
    public final void E(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        nativeMarkLocationsUsed(j, bArr, bArr2, bArr3);
    }

    @Override // defpackage.avoj
    public final byte[] F(long j, byte[] bArr) {
        return nativeDeleteAllDataForOwner(j, bArr);
    }

    @Override // defpackage.avoj
    public final long G(long j) {
        return nativeGenerateOperationId(j);
    }

    @Override // defpackage.avoj
    public final byte[] H(long j, byte[] bArr) {
        return nativeGetAndClearNotifications(j, bArr);
    }

    @Override // defpackage.avoj
    public final void I(Runnable runnable, Executor executor) {
        this.b.a(runnable, executor);
    }

    @Override // defpackage.avoj
    public final byte[] J(long j, byte[] bArr) {
        return nativeGetInfrastructureStateForOwner(j, bArr, 0L, 0);
    }

    @Override // defpackage.avoj
    public final byte[] K(long j) {
        return nativeGetInfrastructureStateWithAllOwners(j, 0L, 0);
    }

    @Override // defpackage.avoj
    public final byte[] a(long j, byte[] bArr) {
        return nativeResumeInterruptedWork(j, bArr);
    }

    @Override // defpackage.avoj
    public final byte[] b(long j, byte[] bArr) {
        return nativeAddOperationIdToUpdate(j, bArr);
    }

    @Override // defpackage.avoj
    public final byte[] c(long j, byte[] bArr) {
        return nativePrepareUpdate(j, bArr);
    }

    @Override // defpackage.avoj
    public final byte[] d(long j, byte[] bArr) {
        return nativeAssessOfflineUpdateResponse(j, bArr);
    }

    @Override // defpackage.avoj
    public final byte[] e(long j, byte[] bArr) {
        return nativeStartUpdate(j, bArr);
    }

    @Override // defpackage.avoj
    public final byte[] f(long j, byte[] bArr) {
        return nativeAbandonUnstartedUpdate(j, bArr);
    }

    @Override // defpackage.avoj
    public final byte[] g(long j) {
        return nativeCancelUpdate(j);
    }

    @Override // defpackage.avoj
    public final byte[] h(long j) {
        return nativeShutdown(j);
    }

    @Override // defpackage.avoj
    public final byte[] i(long j) {
        return nativeTimeoutUpdate(j);
    }

    @Override // defpackage.avoj
    public final byte[] j(long j) {
        return nativeDefaultDownloadConnectivityRequirementChanged(j);
    }

    @Override // defpackage.avoj
    public final byte[] k(long j) {
        return nativeGetNextDownload(j);
    }

    @Override // defpackage.avoj
    public final byte[] l(long j, byte[] bArr, double d, double d2) {
        return nativeGetDynamicPaddingLocationStatus(j, bArr, d, d2);
    }

    @Override // defpackage.avoj
    public final byte[] m(long j, String str, byte[] bArr) {
        return nativeSetDownloadResult(j, str, bArr);
    }

    @Override // defpackage.avoj
    public final void n(long j) {
        nativeLogUpdateSuspended(j);
    }

    @Override // defpackage.avoj
    public final byte[] o(long j) {
        return nativeProcess(j);
    }

    public void onInfrastructureStateChange() {
        this.b.d(avok.a);
    }

    @Override // defpackage.avoj
    public final byte[] p(long j, dluy dluyVar) {
        return nativeOptimizeIfNeeded(j, dluyVar.f);
    }

    @Override // defpackage.avoj
    public final byte[] q(long j, long j2) {
        return nativeGetNextSteps(j, j2);
    }

    @Override // defpackage.avoj
    public final void r(long j, byte[] bArr, byte[] bArr2) {
        nativeSetRegionMetadata(j, bArr, bArr2);
    }

    @Override // defpackage.avoj
    public final byte[] s(long j, byte[] bArr) {
        return nativeAddRegion(j, bArr);
    }

    @Override // defpackage.avoj
    public final void t(long j, byte[] bArr) {
        nativeMarkRegionForUpdate(j, bArr);
    }

    @Override // defpackage.avoj
    public final void u(long j, byte[] bArr, byte[] bArr2) {
        nativeMarkUpdateDynamic(j, bArr, bArr2);
    }

    @Override // defpackage.avoj
    public final byte[] v(long j, byte[] bArr) {
        return nativeDeleteRegions(j, bArr);
    }

    @Override // defpackage.avoj
    public final void w(long j, byte[] bArr, String str) {
        nativeRenameRegion(j, bArr, str);
    }

    @Override // defpackage.avoj
    public final byte[] x(long j) {
        return nativeCheckForExpiry(j);
    }

    @Override // defpackage.avoj
    public final byte[] y(long j, byte[] bArr) {
        return nativeMaybeReportRegionUtilization(j, bArr);
    }

    @Override // defpackage.avoj
    public final void z(long j, byte[] bArr) {
        nativeMigrateData(j, bArr);
    }
}
