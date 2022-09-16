package defpackage;

import android.content.Context;
import com.google.android.apps.auto.sdk.nav.ClientMode;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: nls  reason: default package */
/* loaded from: classes.dex */
public final class nls implements nlx {
    public final dxio<cjqy> a;
    public final dxio<cjqq> b;
    public final dxio<axwq> c;
    public final nlr d;
    @dzsi
    public ClientMode e;
    public final nlo f;
    @dzsi
    public nlz g;
    public final nlg h;
    private final Context i;
    private final ahjq j;
    private final akfa k;
    private final Executor l;
    private final btvo m;
    private final btrm n;
    private final cqat o;
    private final ksr p;
    private final bvrb q;
    private final dzsj<arpm> r;
    private final crfr s;

    public nls(Context context, ahjq ahjqVar, akfa akfaVar, Executor executor, btvo btvoVar, btrm btrmVar, ckcw ckcwVar, dxio dxioVar, dxio dxioVar2, dxio dxioVar3, cqat cqatVar, dxio dxioVar4, bvrb bvrbVar, ksr ksrVar, dzsj dzsjVar, crfr crfrVar) {
        dbsk.s(context);
        this.i = context;
        dbsk.s(ahjqVar);
        this.j = ahjqVar;
        this.k = akfaVar;
        this.l = executor;
        dbsk.s(btvoVar);
        this.m = btvoVar;
        dbsk.s(btrmVar);
        this.n = btrmVar;
        dbsk.s(dxioVar);
        this.a = dxioVar;
        dbsk.s(dxioVar2);
        this.b = dxioVar2;
        dbsk.s(cqatVar);
        this.o = cqatVar;
        dbsk.s(dxioVar4);
        this.c = dxioVar4;
        dbsk.s(bvrbVar);
        this.q = bvrbVar;
        dbsk.s(ksrVar);
        this.p = ksrVar;
        dbsk.s(dzsjVar);
        this.r = dzsjVar;
        dbsk.s(crfrVar);
        this.s = crfrVar;
        nlo nloVar = new nlo(dxioVar2, dxioVar3);
        this.f = nloVar;
        nlr nlrVar = new nlr(this);
        this.d = nlrVar;
        this.h = new nlg(ckcwVar, nloVar, nlrVar);
    }

    public final void a() {
        if (this.g != null) {
            return;
        }
        boolean z = this.m.getCarParameters().b;
        boolean z2 = this.m.getCarParameters().c;
        nln nlnVar = new nln(this.i);
        this.g = new nle(this.j, this.c.a(), this.k, this.l, this.n, this.o, this.p, nlnVar, new nlm(this.r, this.q, nlnVar, this.i), new nkz(nlq.a), this.q, this.s, z, z2, vul.OVERVIEW_SUGGESTIONS, 3);
    }

    @Override // defpackage.nlx
    public final void b(ldm ldmVar) {
        bvrj.UI_THREAD.c();
        a();
        nlz nlzVar = this.g;
        dbsk.s(nlzVar);
        nle nleVar = (nle) nlzVar;
        crqd crqdVar = nleVar.i;
        if (crqdVar == null) {
            return;
        }
        dcdc<crqg> i = nleVar.i(crqdVar);
        int size = i.size();
        int i2 = 0;
        while (i2 < size) {
            crqg crqgVar = i.get(i2);
            i2++;
            if (dbsd.a(ldmVar.h.d, crqgVar.a.d)) {
                nleVar.c.f(ldmVar, nleVar.a.a(), crqgVar.b.a.d());
                return;
            }
        }
    }
}
