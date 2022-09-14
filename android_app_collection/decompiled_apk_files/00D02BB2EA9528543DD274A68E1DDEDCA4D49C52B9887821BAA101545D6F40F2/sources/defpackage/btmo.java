package defpackage;

import android.os.SystemClock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btmo  reason: default package */
/* loaded from: classes.dex */
public final class btmo implements cssn {
    final /* synthetic */ btmv a;

    public btmo(btmv btmvVar) {
        this.a = btmvVar;
    }

    @Override // defpackage.cvgw
    public final /* bridge */ /* synthetic */ void a(cssm cssmVar) {
        btmv btmvVar = this.a;
        btmvVar.a.maxMemory();
        btmvVar.a.totalMemory();
        btmvVar.a.freeMemory();
        btmvVar.f();
        if (((float) btmvVar.f()) / ((float) btmvVar.a.maxMemory()) > (btmvVar.e.a().floatValue() >= 0.0f ? btmvVar.e.a().floatValue() : 0.5f)) {
            btmvVar.e(btmu.THRESHOLD_REACHED, btmvVar.f.a().floatValue());
        }
        bvpm.a("CacheManager.timeSinceTrim", btmvVar.g >= 0 ? Long.toString(SystemClock.elapsedRealtime() - btmvVar.g) : "never");
    }
}
