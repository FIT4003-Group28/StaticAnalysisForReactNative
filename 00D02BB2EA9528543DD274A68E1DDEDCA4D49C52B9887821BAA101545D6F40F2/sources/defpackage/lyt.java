package defpackage;
/* compiled from: PG */
/* renamed from: lyt  reason: default package */
/* loaded from: classes.dex */
public final class lyt {
    public final crfm a;
    public final btrm b;
    @dzsi
    public lys c;
    @dzsi
    public crhp d;
    @dzsi
    public arym e;
    public boolean f;

    public lyt(crfm crfmVar, btrm btrmVar) {
        dbsk.s(crfmVar);
        this.a = crfmVar;
        dbsk.s(btrmVar);
        this.b = btrmVar;
    }

    @dzsi
    public static arym c(crhp crhpVar) {
        if (crhpVar.d()) {
            return arym.GUIDED_NAV;
        }
        if (!crhpVar.f()) {
            return null;
        }
        return arym.FREE_NAV;
    }

    public final void a() {
        if (!this.f) {
            return;
        }
        crhp b = b();
        if (this.e != c(b)) {
            return;
        }
        if (b.b() && this.a.f() != b.c().e) {
            return;
        }
        this.f = false;
        lys lysVar = this.c;
        dbsk.s(lysVar);
        lysVar.a(b);
    }

    public final crhp b() {
        crhp crhpVar = this.d;
        dbsk.s(crhpVar);
        return crhpVar;
    }
}
