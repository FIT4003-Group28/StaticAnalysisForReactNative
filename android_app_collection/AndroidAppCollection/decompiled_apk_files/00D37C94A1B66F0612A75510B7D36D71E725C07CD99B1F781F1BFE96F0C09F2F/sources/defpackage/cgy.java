package defpackage;
/* compiled from: PG */
/* renamed from: cgy  reason: default package */
/* loaded from: classes2.dex */
final class cgy implements ctl {
    private final agp a;

    public cgy(agp agpVar) {
        this.a = agpVar;
    }

    @Override // defpackage.ctl
    public final boolean jY(ckq ckqVar, Object obj, ctz ctzVar, boolean z) {
        agp agpVar = this.a;
        Throwable th = ckqVar;
        if (ckqVar == null) {
            th = new RuntimeException("Unknown error");
        }
        agpVar.d(th);
        return true;
    }

    @Override // defpackage.ctl
    public final boolean jZ(Object obj, int i) {
        try {
            this.a.c(new cgz(obj));
            return true;
        } catch (Throwable th) {
            this.a.d(th);
            return true;
        }
    }
}
