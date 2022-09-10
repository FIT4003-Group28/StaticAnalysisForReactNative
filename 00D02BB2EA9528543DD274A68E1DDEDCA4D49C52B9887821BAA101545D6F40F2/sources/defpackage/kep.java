package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: kep  reason: default package */
/* loaded from: classes7.dex */
public final class kep implements btph, kcv {
    public final keo a;
    public final kxb b;
    public final kea c;
    public final aueu d;
    public final mfo e;
    public final Executor f;
    public final Context g;
    public final bttf h;
    public final nqu i;
    public final ker j;
    public final keg k;
    public final kef l;
    public final kdr m;
    public final nqm n;
    public final kdw o;
    public final ktu p;
    public final ksw q;
    public final crzp<Boolean> r = new kem(this);
    public final crzp<aufb> s = new ken(this);
    public final kth t;

    public kep(final keo keoVar, ktu ktuVar, akpx akpxVar, akpw akpwVar, Application application, dxio dxioVar, ckcw ckcwVar, cqat cqatVar, bvnx bvnxVar, btmv btmvVar, bvrb bvrbVar, Executor executor, dehq dehqVar, btrm btrmVar, bvjj bvjjVar, bttf bttfVar, kth kthVar, cjqy cjqyVar, cjqq cjqqVar, bvkx bvkxVar, bvsl bvslVar, dxio dxioVar2, btvo btvoVar, btpa btpaVar, dxio dxioVar3, dxio dxioVar4, jzv jzvVar, vwv vwvVar, Executor executor2, dxio dxioVar5, kma kmaVar, ite iteVar, dzsj dzsjVar, ksw kswVar, cjvn cjvnVar, ckmm ckmmVar, alja aljaVar, alrd alrdVar) {
        this.a = keoVar;
        this.f = executor;
        aueu aueuVar = new aueu(bvjjVar, new crzo(), null);
        this.d = aueuVar;
        nqn nqnVar = new nqn(((cmvs) keoVar).getBaseContext(), kthVar.a(), new jzo(), aueuVar);
        this.g = nqnVar;
        this.h = bttfVar;
        this.p = ktuVar;
        this.t = kthVar;
        this.q = kswVar;
        this.i = new nqu(bvjjVar, aueuVar);
        mfo mfoVar = new mfo();
        this.e = mfoVar;
        amdq amdqVar = new amdq(akpxVar, akpwVar);
        nqm nqmVar = new nqm(nqnVar, dehqVar, aueuVar, cjqyVar, bvjjVar, iteVar);
        this.n = nqmVar;
        kwy kwyVar = new kwy(25L, application, nqnVar, keoVar.Ok(), akpxVar, akpwVar, amdqVar, dxioVar, ckcwVar, ckmmVar, cqatVar, bvnxVar, btmvVar, bvrbVar, executor, btrmVar, bvjjVar, cjqyVar, cjqqVar, new anax(cjqyVar, cjqqVar, cqatVar, executor2, akpwVar.i()), bvkxVar, bvslVar, dxioVar2, btvoVar, btpaVar, dxioVar3, dxioVar4, jzvVar, aueuVar, null, false, vwvVar, kthVar.a(), executor2, dxioVar5, kmaVar, dzsjVar, cjvnVar.a(2), ckme.AUXILIARY_CLUSTER_MAP, aljaVar, alrdVar);
        this.b = kwyVar;
        this.j = new ker(mfoVar, bvjjVar, executor);
        this.c = new kea(dxioVar, bvjjVar, kwyVar, btrmVar, aueuVar, nqnVar);
        kdr kdrVar = new kdr(kwyVar.j(), new dbty(keoVar) { // from class: kej
            private final keo a;

            {
                this.a = keoVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                keo keoVar2 = this.a;
                Rect rect = new Rect();
                keoVar2.a().getDefaultDisplay().getRectSize(rect);
                return rect;
            }
        });
        this.m = kdrVar;
        new FrameLayout(nqnVar);
        FrameLayout frameLayout = new FrameLayout(nqnVar);
        keoVar.getClass();
        keg kegVar = new keg(nqnVar, nqmVar, kwyVar, frameLayout, new bvqg(keoVar) { // from class: kek
            private final keo a;

            {
                this.a = keoVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                this.a.m((View) obj);
            }
        });
        this.k = kegVar;
        this.l = new kef(kdrVar, kegVar, executor);
        this.o = new kdw(nqnVar, frameLayout, kdrVar, ktuVar.a(), executor);
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.kcv
    public final void b() {
    }

    @Override // defpackage.kcv
    public final void d() {
    }

    @Override // defpackage.kcv
    public final void h(Object obj) {
    }

    @Override // defpackage.kcv
    public final void i(Object obj) {
    }

    @Override // defpackage.kcv
    public final void k(String str, int i) {
    }

    @Override // defpackage.kcv
    public final void n(Intent intent) {
    }

    @Override // defpackage.kcv
    public final void o() {
    }

    @Override // defpackage.kcv
    public final boolean p() {
        return false;
    }
}
