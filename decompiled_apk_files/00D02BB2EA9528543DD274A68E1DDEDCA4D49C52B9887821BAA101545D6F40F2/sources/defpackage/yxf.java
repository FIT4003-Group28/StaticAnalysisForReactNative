package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yxf  reason: default package */
/* loaded from: classes7.dex */
public final class yxf implements amfq {
    @dzsi
    private yxg a;

    public yxf(yxg yxgVar) {
        this.a = yxgVar;
    }

    @Override // defpackage.amfq
    public final void a(amfu amfuVar) {
        yxg yxgVar = this.a;
        if (yxgVar != null) {
            yxgVar.hashCode();
            if (!yxgVar.S()) {
                return;
            }
            if (amfuVar.a()) {
                yxgVar.aT(amfuVar);
            } else {
                yxgVar.aR(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.a = null;
    }
}
