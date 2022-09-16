package defpackage;
/* compiled from: PG */
/* renamed from: cbch  reason: default package */
/* loaded from: classes4.dex */
final class cbch implements degu<ilo> {
    final /* synthetic */ ilo a;
    final /* synthetic */ boolean b;
    final /* synthetic */ cbcl c;

    public cbch(cbcl cbclVar, ilo iloVar, boolean z) {
        this.c = cbclVar;
        this.a = iloVar;
        this.b = z;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        bvoo.h("Failed to fetch the placemark", new Object[0]);
        cbcl cbclVar = this.c;
        if (cbclVar.ak == this.a) {
            cbclVar.q(null, this.b);
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi ilo iloVar) {
        ilo iloVar2 = iloVar;
        if (this.c.ak != this.a || iloVar2.aj() == null) {
            return;
        }
        this.c.q(iloVar2, this.b);
    }
}
