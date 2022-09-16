package defpackage;
/* compiled from: PG */
/* renamed from: aeqr  reason: default package */
/* loaded from: classes.dex */
final class aeqr extends zer {
    final /* synthetic */ aeqt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeqr(aeqt aeqtVar) {
        super("recentTFLiteBandwidthSamples");
        this.a = aeqtVar;
    }

    @Override // defpackage.zer
    protected final /* bridge */ /* synthetic */ Object a() {
        afks afksVar;
        aeqt aeqtVar = this.a;
        try {
            if (aeqtVar.b()) {
                awuj awujVar = (awuj) aeqtVar.a.c();
                if ((awujVar.b & 512) != 0) {
                    afksVar = awujVar.r;
                    if (afksVar == null) {
                        afksVar = afks.a;
                    }
                } else {
                    afksVar = null;
                }
                if (afksVar != null) {
                    return new aeqs(afksVar);
                }
            }
        } catch (ClassCastException | IllegalArgumentException unused) {
            aeqtVar.a();
        }
        return aeqs.a;
    }
}
