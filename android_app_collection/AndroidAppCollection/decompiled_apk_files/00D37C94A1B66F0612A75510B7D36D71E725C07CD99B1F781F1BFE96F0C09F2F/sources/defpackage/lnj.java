package defpackage;
/* compiled from: PG */
/* renamed from: lnj  reason: default package */
/* loaded from: classes3.dex */
public final class lnj {
    private final fud a;
    private final akge b;
    private final eo c;
    private final srr d;

    public lnj(fud fudVar, akge akgeVar, eo eoVar, srr srrVar) {
        this.a = fudVar;
        this.b = akgeVar;
        this.c = eoVar;
        this.d = srrVar;
    }

    public final void a() {
        this.b.f();
    }

    public final void b() {
        this.a.c(false);
        a();
        dp f = this.c.f("FilterDialogFragment");
        if (f instanceof dh) {
            ((dh) f).dismiss();
        }
        this.d.a();
    }
}
