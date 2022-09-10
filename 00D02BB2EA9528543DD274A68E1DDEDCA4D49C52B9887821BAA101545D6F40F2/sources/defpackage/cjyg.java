package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cjyg  reason: default package */
/* loaded from: classes4.dex */
public final class cjyg implements dbrn<cpwp, Boolean> {
    final /* synthetic */ cjyh a;

    public cjyg(cjyh cjyhVar) {
        this.a = cjyhVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Boolean a(cpwp cpwpVar) {
        cpwp cpwpVar2 = cpwpVar;
        this.a.i = cpwpVar2.a.contains(3);
        this.a.c.a().a(btyx.ASSISTANT, cpwpVar2.b);
        cjyh cjyhVar = this.a;
        if (cjyhVar.i) {
            cjsx i = cjsy.i();
            i.b(ddda.dz);
            cjyhVar.e.a().k(i.a());
        }
        return Boolean.valueOf(this.a.i);
    }
}
