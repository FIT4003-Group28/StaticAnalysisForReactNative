package defpackage;
/* compiled from: PG */
/* renamed from: ahzk  reason: default package */
/* loaded from: classes.dex */
public class ahzk implements zdx, ynl {
    public final ahzj n;
    public final axnm o;
    public final ajhl p;
    public final acti q;
    public int s = 0;
    public final azpa r = azpa.ar();

    public ahzk(ahzj ahzjVar, axnm axnmVar, ajhl ajhlVar, acti actiVar) {
        this.n = ahzjVar;
        this.o = axnmVar;
        this.p = ajhlVar;
        this.q = actiVar;
    }

    public void c(ahhm ahhmVar) {
        throw null;
    }

    public final void e(int i) {
        this.s = i;
        boolean z = false;
        if (i == 2) {
            this.n.m(0);
        } else {
            this.n.m(8);
        }
        azpa azpaVar = this.r;
        if (i == 2) {
            z = true;
        }
        azpaVar.c(Boolean.valueOf(z));
    }

    @Override // defpackage.zdx
    public final void j() {
        throw null;
    }

    public Class[] ky(Class cls, Object obj, int i) {
        throw null;
    }
}
