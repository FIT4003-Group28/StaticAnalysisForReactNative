package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: mrg  reason: default package */
/* loaded from: classes7.dex */
public final class mrg extends nor {
    public final mth a;
    public ldm b;
    private final not c;
    private final asmp d;
    private final akox e;
    private final kxu f;
    private final cqkf<mte> g;
    private final ncm h;

    public mrg(final nop nopVar, final kdi kdiVar, ncm ncmVar, noo nooVar, cqkj cqkjVar, final not notVar, final ldm ldmVar, boolean z, ksh kshVar, cqat cqatVar, cjqy cjqyVar, cjqq cjqqVar, asmp asmpVar, akox akoxVar, kxu kxuVar, mti mtiVar) {
        super(cjqyVar, cjqqVar);
        this.h = ncmVar;
        this.b = ldmVar;
        this.c = notVar;
        this.d = asmpVar;
        this.e = akoxVar;
        this.f = kxuVar;
        Runnable runnable = new Runnable(nopVar, kdiVar, notVar, ldmVar) { // from class: mrd
            private final nop a;
            private final kdi b;
            private final not c;
            private final ldm d;

            {
                this.a = nopVar;
                this.b = kdiVar;
                this.c = notVar;
                this.d = ldmVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                nop nopVar2 = this.a;
                kdi kdiVar2 = this.b;
                not notVar2 = this.c;
                ldm b = ldm.b(this.d.d);
                dbsk.s(b);
                nopVar2.k(kdiVar2.p(notVar2, b, true));
            }
        };
        Runnable runnable2 = new Runnable(nopVar, kdiVar, ldmVar) { // from class: mre
            private final nop a;
            private final kdi b;
            private final ldm c;

            {
                this.a = nopVar;
                this.b = kdiVar;
                this.c = ldmVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                koe.a(this.a, this.b, this.c);
            }
        };
        Context context = cqkjVar.d;
        mti.a(nooVar, 1);
        mti.a(ldmVar, 2);
        mti.a(runnable, 3);
        mti.a(runnable2, 4);
        npo a = mtiVar.a.a();
        mti.a(a, 5);
        mti.a(kshVar, 7);
        mti.a(context, 8);
        mti.a(cqatVar, 9);
        this.a = new mth(nooVar, ldmVar, runnable, runnable2, a, z, kshVar, context, cqatVar);
        this.g = cqkjVar.d(new mrq(), notVar.a(), false);
    }

    @Override // defpackage.nor, defpackage.non
    public final void a() {
        this.h.a(this.b, new ksu(this) { // from class: mrf
            private final mrg a;

            {
                this.a = this;
            }

            @Override // defpackage.ksu
            public final void a(ldm ldmVar) {
                mrg mrgVar = this.a;
                mrgVar.b = ldmVar;
                mrgVar.a.d(ldmVar);
                mrgVar.k(ldmVar);
            }
        }, false);
        this.g.e(this.a);
    }

    @Override // defpackage.non
    @dzsi
    public final noq b() {
        s(new cjsz(dtxm.dg));
        k(this.b);
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        return this.g.c();
    }

    @Override // defpackage.nor, defpackage.non
    public final void e() {
        t();
    }

    @Override // defpackage.nor, defpackage.non
    public final void f() {
    }

    @Override // defpackage.non
    public final String g() {
        return "PreNavDestinationOverlay";
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.c.b(noeVar, this.g.c());
    }

    public final void k(ldm ldmVar) {
        if (ldmVar.o() == null) {
            return;
        }
        this.d.y();
        akox akoxVar = this.e;
        akqq o = ldmVar.o();
        dbsk.s(o);
        akoxVar.p(akyt.m(o, 15.0f, this.f.b()));
    }
}
