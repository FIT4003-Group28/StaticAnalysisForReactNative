package defpackage;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import defpackage.bwdq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: bwdr  reason: default package */
/* loaded from: classes4.dex */
public abstract class bwdr<S extends bwdq> extends ex {
    private boolean aA;
    public cqkj ad;
    public gga ae;
    public cjqy af;
    public cjqq ag;
    public akfa ah;
    public bwig ai;
    public bwic aj;
    public bwik ak;
    public bwqv al;
    public btvo am;
    public bwfe an;
    public bweh ao;
    public dxio<afha> ap;
    public cxrj aq;
    public cxqo ar;
    public dehq as;
    S at;
    @dzsi
    public bwif au;
    public bwed av;
    private cqkf<bwhz> aw;
    private List<cxtp> ax;
    private bwij ay;
    @dzsi
    private bwib az;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void aJ(fd fdVar, bwqv bwqvVar, bwdq bwdqVar) {
        Bundle bundle = new Bundle();
        bwdqVar.a(bundle, bwqvVar);
        fdVar.B(bundle);
    }

    public static dbsg<String> aR(czha czhaVar) {
        czgu czguVar = czhaVar.d;
        if (czguVar == null) {
            czguVar = czgu.l;
        }
        if ((czguVar.a & 4) != 0) {
            czgu czguVar2 = czhaVar.d;
            if (czguVar2 == null) {
                czguVar2 = czgu.l;
            }
            return dbsg.i(czguVar2.d);
        }
        return dbpy.a;
    }

    @Override // defpackage.ex, defpackage.fd
    public void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    protected abstract boolean aK();

    @dzsi
    protected abstract Pair<bwhy, cqnm<bwhz>> aL();

    @dzsi
    protected bwdp<?> aM() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @dzsi
    public bwfs[] aN() {
        return null;
    }

    public abstract Class<S> aO();

    public final void aP(final cjql cjqlVar, final Intent intent, final boolean z) {
        deha.q(aS(this.at), bvqj.b(new bvqg(this, intent, cjqlVar, z) { // from class: bwdh
            private final bwdr a;
            private final Intent b;
            private final cjql c;
            private final boolean d;

            {
                this.a = this;
                this.b = intent;
                this.c = cjqlVar;
                this.d = z;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                bwdr bwdrVar = this.a;
                Intent intent2 = this.b;
                cjql cjqlVar2 = this.c;
                boolean z2 = this.d;
                bwdq bwdqVar = (bwdq) obj;
                bwep.b(intent2, bwdqVar.a, bwdrVar.ae);
                ComponentName component = intent2.getComponent();
                if (component != null && bwfr.b(component)) {
                    Intent intent3 = new Intent(intent2);
                    intent3.setComponent(null);
                    intent2.putExtra("android.intent.extra.INTENT", intent3);
                    intent2.setAction("android.intent.action.CHOOSER");
                    intent2.setType(null);
                }
                bwdrVar.f();
                bwdrVar.aQ(cjqlVar2, intent2, bwdqVar.b, z2);
            }
        }), dege.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aQ(cjql cjqlVar, Intent intent, cjtd cjtdVar, boolean z) {
        ResolveInfo resolveActivity = this.ae.getPackageManager().resolveActivity(intent, 0);
        if (z) {
            this.af.j(cjqlVar, bwhr.a(cjtdVar, dbsg.j(resolveActivity)));
        }
        deha.q(this.ap.a().f(this.ae, intent, 4), new bwdo(this, resolveActivity, intent), dege.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dehn<S> aS(S s) {
        return deha.a(s);
    }

    @Override // defpackage.fd
    public final void ab(int i, String[] strArr, int[] iArr) {
        List<cxtp> list = this.ax;
        if (list != null) {
            for (cxtp cxtpVar : list) {
                cxtpVar.i.d.k(i, iArr);
                cxwe cxweVar = cxtpVar.j;
                if (cxweVar != null) {
                    cxweVar.v(i, iArr);
                }
            }
        }
    }

    @Override // defpackage.fd
    public final void ak() {
        super.ak();
        List<cxtp> list = this.ax;
        if (list != null) {
            for (cxtp cxtpVar : list) {
                cxtpVar.h = false;
            }
        }
    }

    @Override // defpackage.fd
    public final void am() {
        super.am();
        List<cxtp> list = this.ax;
        if (list != null) {
            for (cxtp cxtpVar : list) {
                if (!cxtpVar.h) {
                    cxtpVar.e.j(3, cxtpVar.d.b());
                }
                cxtpVar.e.e();
                cxtpVar.d.j();
            }
        }
    }

    @Override // defpackage.ex, defpackage.fd
    public void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = (Bundle) dbsc.a(bundle, this.o);
        try {
            S s = (S) this.al.d(aO(), bundle2, "serializableState");
            dbsk.s(s);
            this.at = s;
            boolean z = false;
            if (aK() && this.ah.c() && bwhl.a(this.ae)) {
                z = true;
            }
            this.aA = z;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        List<cxtp> list = this.ax;
        if (list != null) {
            for (cxtp cxtpVar : list) {
                if (cxtpVar.j != null) {
                    ((InputMethodManager) cxtpVar.b.getSystemService("input_method")).hideSoftInputFromWindow(cxtpVar.a.getWindowToken(), 0);
                }
                cxtpVar.i.c.i();
                cxwe cxweVar = cxtpVar.j;
                if (cxweVar != null) {
                    cxweVar.f();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v22 */
    @Override // defpackage.ex
    public final Dialog q(@dzsi Bundle bundle) {
        int i;
        bwib bwibVar;
        cqmm fP;
        bwif bwifVar;
        View view;
        cxsq b;
        String charSequence;
        Pair<bwhy, cqnm<bwhz>> aL = aL();
        boolean z = this.aA;
        bwhy bwhyVar = aL != null ? (bwhy) aL.first : null;
        cqrp d = bwhyVar != null ? bwhyVar.d() : cqrp.d(dcyn.a);
        if (z) {
            int i2 = bwhyVar != null ? 64 : 0;
            bwig bwigVar = this.ai;
            gga a = bwigVar.a.a();
            bwig.a(a, 1);
            cqhn a2 = bwigVar.b.a();
            bwig.a(a2, 2);
            bwig.a(d, 4);
            bwif bwifVar2 = new bwif(a, a2, i2, d);
            this.au = bwifVar2;
            i = 0;
            bwibVar = bwifVar2;
        } else {
            bwic bwicVar = this.aj;
            btlu j = this.ah.j();
            Intent a3 = bwep.a(this.at.a, this.ae);
            S s = this.at;
            i = 0;
            bwib a4 = bwicVar.a(j, a3, s.a, null, s.b, d, new bvro(this) { // from class: bwdi
                private final bwdr a;

                {
                    this.a = this;
                }

                @Override // defpackage.bvro
                public final void a(Object obj, Object obj2) {
                    this.a.aP((cjql) obj, (Intent) obj2, false);
                }
            });
            this.az = a4;
            bwibVar = a4;
        }
        bwik bwikVar = this.ak;
        Runnable runnable = new Runnable(this) { // from class: bwdj
            private final bwdr a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.f();
            }
        };
        gga a5 = bwikVar.a.a();
        bwik.a(a5, 1);
        bwik.a(runnable, 2);
        bwik.a(bwibVar, 4);
        this.ay = new bwij(a5, runnable, bwhyVar, bwibVar);
        boolean z2 = this.aA;
        cqnm cqnmVar = aL != null ? (cqnm) aL.second : null;
        bwdp<?> aM = aM();
        if (z2) {
            fP = cqgr.fP(new bwgx(), cqkz.a(this.au), new cqmp[i]);
        } else {
            fP = cqgr.fP(new bwhc(), cqkz.a(this.az), new cqmp[i]);
        }
        if (z2) {
            cqkf<bwhz> c = this.ad.c(new bwgy(cqnmVar, fP), null);
            this.aw = c;
            c.e(this.ay);
            if (aM != null) {
                cqkf e = this.ad.e(aM.b());
                e.e(aM.a());
                view = e.c();
            } else {
                view = null;
            }
            cxtq b2 = cxtr.b();
            b2.a = H();
            b2.b = !this.am.getSharingParameters().e;
            b2.c = true;
            b2.d = this.am.getSharingParameters().f;
            if (((gch) btsr.a(gch.class)).sC().h()) {
                b = cxsq.c();
            } else {
                b = cxsq.b();
            }
            b2.f = b;
            if (view != null) {
                b2.e = view;
            }
            cxto cxtoVar = new cxto();
            cxtoVar.a = this.ae;
            cxtoVar.f = this.as;
            cxtoVar.k = b2.a();
            cxtoVar.d = this.aq;
            cxtoVar.c = this.ar;
            cxtoVar.h = new bwdm(this);
            cxtoVar.i = new bwdl(this);
            bwed bwedVar = this.av;
            Intent a6 = bwep.a(this.at.a, this.ae);
            Context H = H();
            bwfp f = bwfp.f(H, i);
            f.g(a6);
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            dcdc<ResolveInfo> a7 = f.a(bwedVar.c.a().j());
            int size = a7.size();
            for (int i3 = 0; i3 < size; i3++) {
                ResolveInfo resolveInfo = a7.get(i3);
                if (dbsj.d(resolveInfo.loadLabel(H.getPackageManager()).toString())) {
                    ((ckcn) bwedVar.d.a.a(ckjy.a)).a();
                } else {
                    Intent intent = new Intent(a6);
                    ComponentName componentName = new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name);
                    intent.setComponent(componentName);
                    if (!bwfr.b(componentName)) {
                        intent.addCategory("android.intent.category.LAUNCHER");
                        intent.setFlags(268435456);
                    }
                    cxwj d2 = cxwk.d();
                    d2.a = resolveInfo;
                    cxwk a8 = d2.a();
                    arrayList.add(a8);
                    hashMap.put(a8.a(), intent);
                }
            }
            cxtoVar.l = arrayList;
            cxtoVar.m = new bwdn(this, hashMap);
            String e2 = dbsj.e(this.ah.o());
            ApplicationInfo applicationInfo = H().getApplicationInfo();
            int i4 = applicationInfo.labelRes;
            if (i4 != 0) {
                charSequence = H().getString(i4);
            } else {
                charSequence = applicationInfo.nonLocalizedLabel.toString();
            }
            S s2 = this.at;
            int i5 = s2.d;
            czgq czgqVar = s2.c;
            int i6 = applicationInfo.icon;
            cxod cxodVar = new cxod();
            cxodVar.a(H());
            PeopleKitConfig a9 = cxst.a(e2, czgqVar, charSequence, i6, cxodVar);
            dbsk.a(true);
            cxtoVar.g = a9;
            bwed bwedVar2 = this.av;
            cqjg cqjgVar = bwgx.a;
            cqjg cqjgVar2 = bwgy.d;
            bwij bwijVar = this.ay;
            ArrayList arrayList2 = new ArrayList();
            cqhn cqhnVar = bwedVar2.a;
            for (View view2 : cqkx.n(bwijVar)) {
                cqhu cqhuVar = bwedVar2.b;
                View a10 = cqhu.a(view2, cqjgVar);
                dbsk.t(a10, "View needs minimized SK token");
                cqhu cqhuVar2 = bwedVar2.b;
                View a11 = cqhu.a(view2, cqjgVar2);
                dbsk.t(a11, "View needs maximized SK token");
                cxtoVar.b = (ViewGroup) a10;
                cxtoVar.j = (ViewGroup) a11;
                cxtp cxtpVar = new cxtp(cxtoVar);
                Stopwatch a12 = cxtpVar.f.a("InitToBindView");
                a12.d();
                cxqo cxqoVar = cxtpVar.f;
                eazd bZ = eaze.g.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eaze eazeVar = (eaze) bZ.b;
                eazeVar.b = 4;
                eazeVar.a |= 1;
                eazh bZ2 = eazi.e.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                eazi eaziVar = (eazi) bZ2.b;
                eaziVar.b = 11;
                eaziVar.a |= 1;
                long a13 = a12.a();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                eazi eaziVar2 = (eazi) bZ2.b;
                eaziVar2.a |= 2;
                eaziVar2.c = a13;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eaze eazeVar2 = (eaze) bZ.b;
                eazi bK = bZ2.bK();
                bK.getClass();
                eazeVar2.e = bK;
                eazeVar2.a |= 8;
                eazk bZ3 = eazl.e.bZ();
                int g = cxtpVar.f.g();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                eazl eazlVar = (eazl) bZ3.b;
                int i7 = g - 1;
                if (g == 0) {
                    throw null;
                }
                eazlVar.b = i7;
                eazlVar.a |= 1;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eaze eazeVar3 = (eaze) bZ.b;
                eazl bK2 = bZ3.bK();
                bK2.getClass();
                eazeVar3.c = bK2;
                eazeVar3.a |= 2;
                cxqoVar.b(bZ.bK());
                cxtpVar.f.d(-1, cxtpVar.g);
                cxtpVar.a.removeAllViews();
                cxtpVar.a.addView(cxtpVar.i.a);
                arrayList2.add(cxtpVar);
            }
            this.ax = arrayList2;
        } else {
            cqkf<bwhz> c2 = this.ad.c(new bwgh(cqnmVar, fP), null);
            this.aw = c2;
            c2.e(this.ay);
        }
        aefv aefvVar = (aefv) cqhu.a(this.aw.c(), bwgx.b);
        if (aefvVar != null && (bwifVar = this.au) != null) {
            aefvVar.h(bwifVar.b().intValue());
        }
        Dialog dialog = new Dialog(J(), 16973840);
        if (this.aA) {
            dialog.getWindow().setSoftInputMode(16);
        }
        View c3 = this.aw.c();
        dialog.setContentView(c3);
        Dialog dialog2 = this.d;
        if (dialog2 != null) {
            dialog2.getWindow().setLayout(-1, -1);
        }
        c3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this) { // from class: bwdg
            private final bwdr a;

            {
                this.a = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                bwdr bwdrVar = this.a;
                bwif bwifVar3 = bwdrVar.au;
                if (bwifVar3 == null || jmw.c(bwdrVar.ae) || bwifVar3.c().booleanValue()) {
                    return;
                }
                bwifVar3.e(true, true);
            }
        });
        dialog.getWindow().setBackgroundDrawableResource(R.color.qu_black_alpha_75);
        return dialog;
    }

    @Override // defpackage.ex, defpackage.fd
    public final void s() {
        super.s();
        this.ag.g().d(cjtd.a(this.aA ? dtyb.ds : dtyb.dn));
        if (!this.at.a.m()) {
            bwfe bwfeVar = this.an;
            bweo bweoVar = this.at.a;
            ArrayList arrayList = new ArrayList();
            for (bwen bwenVar : bweoVar.b) {
                if (bwenVar.g()) {
                    if (bwenVar.c()) {
                        deig d = deig.d();
                        dhrp bZ = dhru.g.bZ();
                        drrp e = bwenVar.e();
                        dbsk.s(e);
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dhru dhruVar = (dhru) bZ.b;
                        e.getClass();
                        dhruVar.b = e;
                        dhruVar.a |= 1;
                        dhrt f = bweoVar.f();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dhru dhruVar2 = (dhru) bZ.b;
                        f.getClass();
                        dhruVar2.f = f;
                        dhruVar2.a |= 16;
                        int e2 = bweoVar.e();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dhru dhruVar3 = (dhru) bZ.b;
                        int i = e2 - 1;
                        if (e2 != 0) {
                            dhruVar3.d = i;
                            dhruVar3.a |= 4;
                            dhru dhruVar4 = (dhru) bZ.b;
                            dhruVar4.c = 4;
                            dhruVar4.a |= 2;
                            boolean c = bweoVar.c();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dhru dhruVar5 = (dhru) bZ.b;
                            dhruVar5.a |= 8;
                            dhruVar5.e = c;
                            bwfeVar.c.b(bZ.bK(), new bwfc(bwenVar, d, bweoVar), bwfeVar.a);
                            arrayList.add(d);
                        } else {
                            throw null;
                        }
                    } else if (bwenVar.d()) {
                        deig d2 = deig.d();
                        dvsz bZ2 = dvta.c.bZ();
                        String b = bwenVar.b();
                        dbsk.s(b);
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dvta dvtaVar = (dvta) bZ2.b;
                        b.getClass();
                        dvtaVar.a |= 1;
                        dvtaVar.b = b;
                        bwfeVar.b.b(bZ2.bK(), new bwfd(bwenVar, d2, bweoVar), bwfeVar.a);
                        arrayList.add(d2);
                    }
                }
            }
            deha.p(arrayList);
        }
    }

    @Override // defpackage.ex, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.at.a(bundle, this.al);
        List<cxtp> list = this.ax;
        if (list != null) {
            for (cxtp cxtpVar : list) {
                bundle.putParcelable("PeopleKitSelectionModel", cxtpVar.d);
                bundle.putParcelable("PeopleKitDataLayer", cxtpVar.e);
                bundle.putParcelableArrayList("PeopleKitChipInfos", cxtpVar.i.a());
                bundle.putBoolean("PeopleKitIsMaximized", cxtpVar.c.getVisibility() == 0);
                bundle.putInt("PeopleKitStatusBar", cxtpVar.k);
                cxtpVar.h = true;
            }
        }
    }
}
