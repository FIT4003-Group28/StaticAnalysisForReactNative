package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aacb  reason: default package */
/* loaded from: classes2.dex */
public final class aacb extends akvn<aktj<?, ?>> {
    final /* synthetic */ aacc a;
    private final String b;
    private final dpuk c;
    private final String d;
    private final int e;

    public aacb(aacc aaccVar, String str, dpuk dpukVar, String str2, int i) {
        this.a = aaccVar;
        this.b = str;
        this.c = dpukVar;
        this.d = str2;
        this.e = i;
    }

    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        cjta b = cjtd.b();
        b.d = dtxo.bz;
        b.g(this.d);
        b.i(this.e);
        this.a.d.a().i(b.a());
        aaan g = aaao.g();
        aaaj aaajVar = (aaaj) g;
        aaajVar.a = this.b;
        aaajVar.b = this.c;
        g.c(false);
        CharSequence d = this.a.e.d();
        if (d != null) {
            aaajVar.d = d.toString();
        }
        this.a.b.a(g.a());
    }
}
