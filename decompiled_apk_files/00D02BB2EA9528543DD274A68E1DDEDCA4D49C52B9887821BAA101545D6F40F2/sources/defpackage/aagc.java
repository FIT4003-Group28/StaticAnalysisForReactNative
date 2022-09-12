package defpackage;
/* compiled from: PG */
/* renamed from: aagc  reason: default package */
/* loaded from: classes2.dex */
public final class aagc {
    private final dxio<aaap> a;

    public aagc(dxio<aaap> dxioVar) {
        this.a = dxioVar;
    }

    public final void a(String str, int i) {
        b(str, dpuk.MAJOR_EVENT, null, i);
    }

    public final void b(String str, dpuk dpukVar, @dzsi diwb diwbVar, int i) {
        aaan g = aaao.g();
        aaaj aaajVar = (aaaj) g;
        aaajVar.a = str;
        aaajVar.b = dpukVar;
        boolean z = true;
        if (i != 2 && i != 3) {
            z = false;
        }
        g.c(z);
        aaao a = g.a();
        if (diwbVar == null) {
            this.a.a().i(a);
        } else {
            this.a.a().j(a, diwbVar);
        }
    }
}
