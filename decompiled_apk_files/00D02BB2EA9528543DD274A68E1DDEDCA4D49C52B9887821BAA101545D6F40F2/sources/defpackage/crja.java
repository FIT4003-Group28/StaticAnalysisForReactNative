package defpackage;
/* compiled from: PG */
/* renamed from: crja  reason: default package */
/* loaded from: classes5.dex */
final class crja implements crjl {
    final /* synthetic */ boolean a;
    final /* synthetic */ crjd b;

    public crja(crjd crjdVar, boolean z) {
        this.b = crjdVar;
        this.a = z;
    }

    @Override // defpackage.crjl
    public final void a() {
        qbn qbnVar;
        crjl crjlVar = this.b.c;
        if (crjlVar != null) {
            crjlVar.a();
        }
        if (this.a || (qbnVar = this.b.e) == null) {
            return;
        }
        qbnVar.b(null);
    }
}
