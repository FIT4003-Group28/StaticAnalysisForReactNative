package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: nud  reason: default package */
/* loaded from: classes3.dex */
public final class nud implements oak {
    public boolean a;
    public nmc b;
    private final nun c;
    private final nva d;
    private final nva e;
    private final nva f;
    private final nva g;
    private final String h;
    private nva i;

    public nud(nun nunVar, aacz aaczVar) {
        nva nvcVar;
        nuc nucVar = new nuc();
        nut nutVar = new nut();
        nvc nvcVar2 = new nvc();
        asxj asxjVar = aaczVar.b().e;
        if ((asxjVar == null ? asxj.a : asxjVar).co) {
            nvcVar = new nvb(aaczVar);
        } else {
            nvcVar = new nvc();
        }
        this.c = nunVar;
        this.d = nucVar;
        this.e = nutVar;
        this.f = nvcVar2;
        this.g = nvcVar;
        asxj asxjVar2 = aaczVar.b().e;
        this.h = (asxjVar2 == null ? asxj.a : asxjVar2).aD;
    }

    private final void c(nva nvaVar) {
        nmc nmcVar;
        if (nvaVar == this.i) {
            return;
        }
        this.c.h(nvaVar);
        if (((nvaVar instanceof nuc) || (nvaVar instanceof nvb) || (nvaVar instanceof nvc)) && ((nmcVar = this.b) == null || !nmcVar.w())) {
            this.c.g(1, false);
        }
        this.i = nvaVar;
    }

    public final void b() {
        nmc nmcVar;
        aqvq l;
        if (this.b != null) {
            if (TextUtils.isEmpty(this.h) || (nmcVar = this.b) == null || (l = nmcVar.l()) == null || !this.h.equals(ntr.d(l))) {
                nmc nmcVar2 = this.b;
                if (nmcVar2 == null || !nmcVar2.s()) {
                    c(this.d);
                    return;
                } else {
                    c(this.e);
                    return;
                }
            }
            c(this.g);
        } else if (!this.a) {
            this.i = null;
            nva f = this.c.f(0);
            if (!(f instanceof nut) && !(f instanceof nvc) && !(f instanceof nvb)) {
                return;
            }
            this.c.g(0, false);
        } else {
            c(this.f);
        }
    }

    @Override // defpackage.oak
    public final void pg(oan oanVar, oan oanVar2) {
        b();
    }
}
