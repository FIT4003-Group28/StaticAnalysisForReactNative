package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acle  reason: default package */
/* loaded from: classes.dex */
public final class acle implements akev {
    final /* synthetic */ acll a;

    public acle(acll acllVar) {
        this.a = acllVar;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        akfq akfqVar = (akfq) obj;
        if (i != 4) {
            acll acllVar = this.a;
            if (acllVar.aG.i()) {
                ylx.n(acllVar, acllVar.aM.a.b(new aapz(13), anjk.a), aclb.a, zbx.r);
            } else {
                acllVar.aK.edit().putBoolean("HAS_SEEN_SCREENCAST_TOOLTIP", true).apply();
            }
        }
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        akfq akfqVar = (akfq) obj;
    }
}
