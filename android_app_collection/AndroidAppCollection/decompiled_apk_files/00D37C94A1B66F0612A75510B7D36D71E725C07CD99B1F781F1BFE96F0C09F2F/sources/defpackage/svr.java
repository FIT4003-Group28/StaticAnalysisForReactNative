package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: svr  reason: default package */
/* loaded from: classes4.dex */
public final class svr extends cyr {
    @dfs(a = 5)
    List A;
    @dfs(a = 5)
    List B;
    @dfs(a = 5)
    List C;
    @dfs(a = 14)
    private svq D;
    @dfs(a = 10)
    cyr a;
    @dfs(a = 5)
    List b;
    @dfs(a = 5)
    List c;
    @dfs(a = 5)
    List d;
    @dfs(a = 5)
    List e;
    @dfs(a = 5)
    List f;
    @dfs(a = 3)
    boolean g;
    @dfs(a = 3)
    boolean v;
    @dfs(a = 3)
    boolean w;
    @dfs(a = 5)
    List x;
    @dfs(a = 5)
    List y;
    @dfs(a = 5)
    List z;

    public svr() {
        super("ElementEventWithGesture");
        this.D = new svq();
    }

    @Override // defpackage.czb, defpackage.dap
    public final Object K(daq daqVar, Object obj) {
        List<tdm> list;
        boolean z = true;
        boolean z2 = false;
        switch (daqVar.b) {
            case -1974694341:
                daw dawVar = (daw) obj;
                dbb dbbVar = daqVar.a;
                cyv cyvVar = (cyv) daqVar.c[0];
                View view = dawVar.a;
                boolean z3 = dawVar.b;
                List list2 = ((svr) dbbVar).e;
                return null;
            case -1932591986:
                dbb dbbVar2 = daqVar.a;
                cyv cyvVar2 = (cyv) daqVar.c[0];
                View view2 = ((dbl) obj).a;
                List<tdj> list3 = ((svr) dbbVar2).f;
                if (list3 != null) {
                    for (tdj tdjVar : list3) {
                        tdjVar.a(view2);
                    }
                }
                return null;
            case -1351902487:
                dbb dbbVar3 = daqVar.a;
                cyv cyvVar3 = (cyv) daqVar.c[0];
                View view3 = ((cyj) obj).a;
                svr svrVar = (svr) dbbVar3;
                List<tdl> list4 = svrVar.y;
                AtomicReference atomicReference = svrVar.D.d;
                if (list4 != null) {
                    for (tdl tdlVar : list4) {
                        tdlVar.a(view3, (tfi) atomicReference.get());
                    }
                }
                return null;
            case -1336101728:
                ddr ddrVar = (ddr) obj;
                dbb dbbVar4 = daqVar.a;
                cyv cyvVar4 = (cyv) daqVar.c[0];
                View view4 = ddrVar.a;
                MotionEvent motionEvent = ddrVar.b;
                svq svqVar = ((svr) dbbVar4).D;
                jz jzVar = svqVar.c;
                svs svsVar = svqVar.a;
                AtomicReference atomicReference2 = svqVar.d;
                if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 0) {
                    atomicReference2.set(new tfi(motionEvent.getX(), motionEvent.getY()));
                }
                svsVar.a(view4);
                jzVar.a(motionEvent);
                if (motionEvent.getActionMasked() != 0 || svsVar.d() || svsVar.e() || svsVar.b() || (svsVar.c == null && svsVar.f == null)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case -1270658234:
                dag dagVar = (dag) obj;
                dbb dbbVar5 = daqVar.a;
                cyv cyvVar5 = (cyv) daqVar.c[0];
                View view5 = dagVar.a;
                MotionEvent motionEvent2 = dagVar.b;
                svs svsVar2 = ((svr) dbbVar5).D.a;
                int actionMasked = motionEvent2.getActionMasked();
                if (actionMasked == 0) {
                    List<tdn> list5 = svsVar2.b;
                    if (list5 != null) {
                        for (tdn tdnVar : list5) {
                            tdnVar.a(view5, new tfi(motionEvent2.getX(), motionEvent2.getY()));
                        }
                    }
                } else if (actionMasked == 1) {
                    List<tdo> list6 = svsVar2.c;
                    if (list6 != null) {
                        for (tdo tdoVar : list6) {
                            tdoVar.a(view5, new tfi(motionEvent2.getX(), motionEvent2.getY()));
                        }
                    }
                } else if (actionMasked == 3 && (list = svsVar2.f) != null) {
                    for (tdm tdmVar : list) {
                        tdmVar.a(view5);
                    }
                }
                return null;
            case -1048037474:
                N((cyv) daqVar.c[0], (dao) obj);
                return null;
            case 71235917:
                dbb dbbVar6 = daqVar.a;
                cyv cyvVar6 = (cyv) daqVar.c[0];
                View view6 = ((dck) obj).a;
                svr svrVar2 = (svr) dbbVar6;
                List<tdk> list7 = svrVar2.x;
                AtomicReference atomicReference3 = svrVar2.D.d;
                if (list7 != null) {
                    tfi tfiVar = (tfi) atomicReference3.get();
                    for (tdk tdkVar : list7) {
                        tdkVar.a(view6, tfiVar);
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case 466811311:
                dcy dcyVar = (dcy) obj;
                dbb dbbVar7 = daqVar.a;
                cyv cyvVar7 = (cyv) daqVar.c[0];
                jo joVar = dcyVar.c;
                View view7 = dcyVar.a;
                mh mhVar = dcyVar.b;
                svr svrVar3 = (svr) dbbVar7;
                boolean z4 = svrVar3.g;
                boolean z5 = svrVar3.v;
                joVar.d(view7, mhVar);
                if (z4) {
                    mhVar.p(true);
                    mhVar.q(z5);
                }
                return null;
            case 1110660298:
                dbw dbwVar = (dbw) obj;
                dbb dbbVar8 = daqVar.a;
                cyv cyvVar8 = (cyv) daqVar.c[0];
                View view8 = dbwVar.a;
                View view9 = dbwVar.b;
                svr svrVar4 = (svr) dbbVar8;
                List<tdp> list8 = svrVar4.C;
                List<tdp> list9 = svrVar4.d;
                AtomicBoolean atomicBoolean = svrVar4.D.b;
                if (list9 != null && atomicBoolean.getAndSet(false)) {
                    for (tdp tdpVar : list9) {
                        tdpVar.b(view8, view9);
                    }
                }
                if (list8 != null) {
                    for (tdp tdpVar2 : list8) {
                        tdpVar2.b(view8, view9);
                    }
                }
                return null;
            case 1803022739:
                dev devVar = (dev) obj;
                dbb dbbVar9 = daqVar.a;
                cyv cyvVar9 = (cyv) daqVar.c[0];
                View view10 = devVar.a;
                View view11 = devVar.b;
                svr svrVar5 = (svr) dbbVar9;
                List<tdp> list10 = svrVar5.C;
                List<tdp> list11 = svrVar5.d;
                AtomicBoolean atomicBoolean2 = svrVar5.D.b;
                if (list11 != null && atomicBoolean2.getAndSet(false)) {
                    for (tdp tdpVar3 : list11) {
                        tdpVar3.b(view10, view11);
                    }
                }
                if (list10 != null) {
                    for (tdp tdpVar4 : list10) {
                        tdpVar4.b(view10, view11);
                    }
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void M(cyv cyvVar) {
        dcz dczVar = new dcz();
        dcz dczVar2 = new dcz();
        dcz dczVar3 = new dcz();
        dcz dczVar4 = new dcz();
        dczVar.a = new AtomicBoolean(true);
        svs svsVar = new svs();
        dczVar3.a = svsVar;
        dczVar2.a = new jz(cyvVar.b, new svu(svsVar), new Handler(Looper.getMainLooper()));
        dczVar4.a = new AtomicReference(null);
        Object obj = dczVar.a;
        if (obj != null) {
            this.D.b = (AtomicBoolean) obj;
        }
        Object obj2 = dczVar2.a;
        if (obj2 != null) {
            this.D.c = (jz) obj2;
        }
        Object obj3 = dczVar3.a;
        if (obj3 != null) {
            this.D.a = (svs) obj3;
        }
        Object obj4 = dczVar4.a;
        if (obj4 != null) {
            this.D.d = (AtomicReference) obj4;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void X(ddl ddlVar, ddl ddlVar2) {
        svq svqVar = (svq) ddlVar;
        svq svqVar2 = (svq) ddlVar2;
        svqVar2.a = svqVar.a;
        svqVar2.b = svqVar.b;
        svqVar2.c = svqVar.c;
        svqVar2.d = svqVar.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean aa() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean ac() {
        return true;
    }

    @Override // defpackage.czb
    public final void aq() {
        svs svsVar = this.D.a;
        List<syv> list = this.b;
        if (list != null) {
            for (syv syvVar : list) {
                syvVar.c();
            }
        }
        svsVar.b = null;
        svsVar.c = null;
        svsVar.d = null;
        svsVar.e = null;
        svsVar.f = null;
        svsVar.g = null;
        svsVar.a(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final cyr b(cyv cyvVar) {
        cyr cyrVar = this.a;
        List list = this.d;
        List list2 = this.C;
        boolean z = this.w;
        List list3 = this.f;
        svq svqVar = this.D;
        svs svsVar = svqVar.a;
        jz jzVar = svqVar.c;
        List list4 = this.y;
        List list5 = this.A;
        List list6 = this.B;
        List list7 = this.c;
        List list8 = this.z;
        List list9 = this.x;
        boolean z2 = this.g;
        dfa a = dfb.a(cyvVar);
        a.e(cyrVar);
        svsVar.b = list5;
        svsVar.c = list6;
        svsVar.d = list4;
        svsVar.e = list7;
        svsVar.f = list8;
        svsVar.g = list9;
        jzVar.a.a.setOnDoubleTapListener(svsVar.b() ? new svt(svsVar) : null);
        if (svsVar.f() || svsVar.c()) {
            a.Q(H(svr.class, cyvVar, -1336101728, new Object[]{cyvVar}));
        }
        if (svsVar.f()) {
            a.c.C().D().h(H(svr.class, cyvVar, -1270658234, new Object[]{cyvVar}));
        }
        if (svsVar.c()) {
            a.c.C().D().e(true);
        }
        if (!svsVar.b()) {
            if (svsVar.e()) {
                a.r(H(svr.class, cyvVar, -1351902487, new Object[]{cyvVar}));
            }
            if (svsVar.d()) {
                a.c.C().D().l(H(svr.class, cyvVar, 71235917, new Object[]{cyvVar}));
            }
        }
        if (list2 != null || list != null) {
            if (!z) {
                a.R(H(svr.class, cyvVar, 1803022739, new Object[]{cyvVar}));
            } else {
                daq H = H(svr.class, cyvVar, 1110660298, new Object[]{cyvVar});
                cyn c = a.c.C().c();
                c.a |= 1073741824;
                c.c = H;
            }
        }
        if (list3 != null) {
            a.K(H(svr.class, cyvVar, -1932591986, new Object[]{cyvVar}));
        }
        if (z2) {
            a.c.C().D().m(H(svr.class, cyvVar, 466811311, new Object[]{cyvVar}));
        }
        return a.a();
    }

    @Override // defpackage.cyr
    public final /* bridge */ /* synthetic */ cyr j() {
        svr svrVar = (svr) super.j();
        cyr cyrVar = svrVar.a;
        svrVar.a = cyrVar != null ? cyrVar.j() : null;
        svrVar.D = new svq();
        return svrVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final ddl m() {
        return this.D;
    }
}
