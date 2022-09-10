package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: nll  reason: default package */
/* loaded from: classes7.dex */
public final class nll {
    public final bvrb a;
    public final nln b;
    public final arpn c;
    public final bvny d;
    @dzsi
    public arpm e;
    @dzsi
    public nlk f;
    @dzsi
    private dcdc<dpjx> g;
    private boolean h;
    private final arpl i = new nlj(this);

    public nll(arpm arpmVar, bvrb bvrbVar, nln nlnVar, Context context) {
        dbsk.s(arpmVar);
        this.e = arpmVar;
        dbsk.s(bvrbVar);
        this.a = bvrbVar;
        dbsk.s(nlnVar);
        this.b = nlnVar;
        this.c = new arpn(context);
        this.d = new bvny(1000L);
    }

    public final void a(dcdc<dpjx> dcdcVar, nlk nlkVar) {
        dbsk.l(!this.h);
        dbsk.s(nlkVar);
        this.f = nlkVar;
        dbsk.s(dcdcVar);
        this.g = dcdcVar;
        arpm arpmVar = this.e;
        dbsk.s(arpmVar);
        arpmVar.c(this.i, bvrj.BACKGROUND_THREADPOOL);
        c();
        this.h = true;
    }

    public final void b() {
        arpm arpmVar = this.e;
        if (arpmVar == null) {
            return;
        }
        arpmVar.d();
        this.e = null;
    }

    public final void c() {
        arpm arpmVar = this.e;
        if (arpmVar == null) {
            return;
        }
        arpmVar.h(vul.OVERVIEW_SUGGESTIONS, dqvj.DRIVE, this.g);
    }
}
