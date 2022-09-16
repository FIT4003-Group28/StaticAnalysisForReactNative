package defpackage;
/* compiled from: PG */
/* renamed from: acwh  reason: default package */
/* loaded from: classes.dex */
final class acwh implements ynj {
    final /* synthetic */ acwi a;
    private final acvo b;

    public acwh(acwi acwiVar, acvo acvoVar) {
        this.a = acwiVar;
        acvoVar.getClass();
        this.b = acvoVar;
    }

    @Override // defpackage.ynj
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ymg a = this.b.a((ymg) obj);
        if (a != null) {
            if (!this.a.a.isEmpty()) {
                for (acvk acvkVar : this.a.a) {
                    acvkVar.a(a);
                }
            }
            if (this.a.b.isEmpty()) {
                return;
            }
            for (acvk acvkVar2 : this.a.b) {
                acvkVar2.a(a);
            }
        }
    }
}
