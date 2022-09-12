package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: mve  reason: default package */
/* loaded from: classes.dex */
public final class mve extends mun implements keo {
    public dbsg<kep> c = dbpy.a;

    @Override // defpackage.keo
    public final WindowManager a() {
        return (WindowManager) getBaseContext().getSystemService("window");
    }

    @Override // defpackage.cli, defpackage.cmwh, defpackage.cmwf, defpackage.cmvs, defpackage.cmvt
    public final void e(@dzsi Bundle bundle) {
        super.e(null);
        mut mutVar = new mut();
        mutVar.a = this;
        dbug dbugVar = dbpc.a;
        dxjg.b(dbugVar);
        mutVar.b = dbugVar;
        mvt mvtVar = (mvt) btsr.a(mvt.class);
        dxjg.b(mvtVar);
        mutVar.e = mvtVar;
        kgh kghVar = (kgh) btsr.a(kgh.class);
        dxjg.b(kghVar);
        mutVar.c = kghVar;
        iqz iqzVar = (iqz) btsr.a(iqz.class);
        dxjg.b(iqzVar);
        mutVar.d = iqzVar;
        dxjg.a(mutVar.a, keo.class);
        dxjg.a(mutVar.b, dbug.class);
        dxjg.a(mutVar.c, kgh.class);
        dxjg.a(mutVar.d, iqz.class);
        dxjg.a(mutVar.e, mvt.class);
        kep m = ((mvf) btsr.b(new muv(mutVar.c, mutVar.d, mutVar.a))).m();
        this.c = dbsg.i(m);
        final kef kefVar = m.l;
        bvrj.UI_THREAD.c();
        keg kegVar = kefVar.a;
        bvrj.UI_THREAD.c();
        kegVar.a.NU(kegVar.b);
        kegVar.f.b(kegVar.b, true);
        kegVar.b.addView(kegVar.c, -1, -1);
        kegVar.b.addView(kegVar.d, -1, -1);
        crzp<Rect> crzpVar = new crzp(kefVar) { // from class: kec
            private final kef a;

            {
                this.a = kefVar;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                this.a.a(crzmVar);
            }
        };
        kefVar.c = dbsg.i(crzpVar);
        kefVar.b.a().a(crzpVar, kefVar.d);
        kefVar.a(kefVar.b.a());
        m.p.b();
        final kdw kdwVar = m.o;
        bvrj.UI_THREAD.c();
        kdwVar.a.addView(kdwVar.f);
        kdwVar.f.getLayoutParams().width = -1;
        kdwVar.f.getLayoutParams().height = -1;
        kdwVar.f.setGravity(17);
        kdwVar.f.setTextColor(-855638017);
        kdwVar.f.setTextSize(nqo.c.a(kdwVar.g));
        kdwVar.a.setBackgroundColor(-16777216);
        kdwVar.e = new crzp(kdwVar) { // from class: kds
            private final kdw a;

            {
                this.a = kdwVar;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                this.a.a(crzmVar);
            }
        };
        kdwVar.c.a(kdwVar.e, kdwVar.d);
        kdwVar.a(kdwVar.c);
        crzp<Rect> crzpVar2 = new crzp(kdwVar) { // from class: kdt
            private final kdw a;

            {
                this.a = kdwVar;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                kdw kdwVar2 = this.a;
                Rect rect = (Rect) crzmVar.l();
                dbsk.s(rect);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) kdwVar2.f.getLayoutParams();
                marginLayoutParams.leftMargin = rect.left;
                marginLayoutParams.topMargin = rect.top;
                marginLayoutParams.rightMargin = rect.right;
                marginLayoutParams.bottomMargin = rect.bottom;
                kdwVar2.f.setLayoutParams(marginLayoutParams);
            }
        };
        kdwVar.h = dbsg.i(crzpVar2);
        kdwVar.b.a().d(crzpVar2, kdwVar.d);
        m.a.Nr().addFlags(8);
        if (!m.h.b() && nmb.b(m.h)) {
            nmb.a(m.h);
        }
        keg kegVar2 = m.k;
        kei keiVar = new kei(m.i);
        cqkp cqkpVar = cqkp.T;
        bvrj.UI_THREAD.c();
        kegVar2.e.g().c(keiVar, kegVar2.c).e(cqkpVar);
        Context context = m.g;
        dbpy<Object> dbpyVar = dbpy.a;
        final keg kegVar3 = m.k;
        kegVar3.getClass();
        bvor.a(dbpyVar, new mw(kegVar3) { // from class: kel
            private final keg a;

            {
                this.a = kegVar3;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                keg kegVar4 = this.a;
                bvrj.UI_THREAD.c();
                kegVar4.c.addView((jen) obj);
            }
        });
        Nr().getDecorView().setSystemUiVisibility(1280);
    }

    @Override // defpackage.cli, defpackage.cmwh, defpackage.cmwf, defpackage.cmvs, defpackage.cmvt
    public final void f() {
        super.f();
        bvor.a(this.c, muz.a);
    }

    @Override // defpackage.cli, defpackage.cmwh, defpackage.cmwf, defpackage.cmvs, defpackage.cmvt
    public final void g() {
        bvor.a(this.c, mva.a);
        super.g();
    }

    @Override // defpackage.cli, defpackage.cmwh, defpackage.cmvs, defpackage.cmvt
    public final void l(final Configuration configuration) {
        super.l(configuration);
        bvor.a(this.c, new mw(configuration) { // from class: muw
            private final Configuration a;

            {
                this.a = configuration;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                Configuration configuration2 = this.a;
                kep kepVar = (kep) obj;
                kepVar.e.f(configuration2);
                kepVar.n.s(configuration2);
                kepVar.b.n();
            }
        });
    }

    @Override // defpackage.cli, defpackage.jtr
    public final void m(View view) {
        cqtv c = cqsz.c();
        cqtv d = cqsz.d();
        final int a = (int) c.a(getBaseContext());
        final int a2 = (int) d.a(getBaseContext());
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this, a, a2) { // from class: muy
            private final mve a;
            private final int b;
            private final int c;

            {
                this.a = this;
                this.b = a;
                this.c = a2;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, final WindowInsets windowInsets) {
                mve mveVar = this.a;
                final int i = this.b;
                final int i2 = this.c;
                windowInsets.getSystemWindowInsetLeft();
                windowInsets.getSystemWindowInsetTop();
                windowInsets.getSystemWindowInsetRight();
                windowInsets.getSystemWindowInsetBottom();
                bvor.a(mveVar.c, new mw(windowInsets, i, i2) { // from class: mvd
                    private final WindowInsets a;
                    private final int b;
                    private final int c;

                    {
                        this.a = windowInsets;
                        this.b = i;
                        this.c = i2;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj) {
                        WindowInsets windowInsets2 = this.a;
                        Rect rect = new Rect(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), this.b - windowInsets2.getSystemWindowInsetRight(), this.c - windowInsets2.getSystemWindowInsetBottom());
                        kdr kdrVar = ((kep) obj).m;
                        dbsg i3 = dbsg.i(rect);
                        Runnable runnable = new Runnable(kdrVar, rect) { // from class: kdm
                            private final kdr a;
                            private final Rect b;

                            {
                                this.a = kdrVar;
                                this.b = rect;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                kdr kdrVar2 = this.a;
                                Rect rect2 = this.b;
                                kxn k = kxo.k();
                                ((kxi) k).b = rect2;
                                kxo j = k.j();
                                kdrVar2.c.a(rect2);
                                kdrVar2.a.j(j);
                                Rect a3 = kdrVar2.d.a();
                                kdrVar2.b.a(new Rect(rect2.left - a3.left, rect2.top - a3.top, a3.right - rect2.right, a3.bottom - rect2.bottom));
                                kdrVar2.f = 3;
                            }
                        };
                        int i4 = kdrVar.f;
                        runnable.run();
                        int i5 = kdrVar.f;
                        Rect l = kdrVar.b.a.l();
                        dbsk.s(l);
                        kdrVar.e.add(new kdl(i4, i5, i3, dbsg.j(kdrVar.b.a.l()), l));
                    }
                });
                return windowInsets.replaceSystemWindowInsets(0, 0, 0, 0);
            }
        });
        super.m(view);
    }

    @Override // defpackage.cmwh, defpackage.cmwf, defpackage.cmvs, defpackage.cmvt
    public final void t() {
        bvor.a(this.c, mvb.a);
        this.c = dbpy.a;
        super.t();
    }

    @Override // defpackage.cmvs, defpackage.cmvt
    public final void w(final int i) {
        bvor.a(this.c, new mw(i) { // from class: mux
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                int i2 = this.a;
                bvrj.UI_THREAD.c();
                ((kep) obj).b.g(i2);
            }
        });
    }

    @Override // defpackage.cmwh
    public final void z(final String str, @dzsi FileDescriptor fileDescriptor, final PrintWriter printWriter, @dzsi String[] strArr) {
        super.z(str, fileDescriptor, printWriter, strArr);
        bvor.a(this.c, new mw(str, printWriter) { // from class: mvc
            private final String a;
            private final PrintWriter b;

            {
                this.a = str;
                this.b = printWriter;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                String str2 = this.a;
                PrintWriter printWriter2 = this.b;
                kep kepVar = (kep) obj;
                kea keaVar = kepVar.c;
                bvrj.UI_THREAD.c();
                printWriter2.println(str2.concat("AuxiliaryMapController:"));
                boolean z = true;
                boolean z2 = keaVar.g != null;
                StringBuilder sb = new StringBuilder(str2.length() + 27);
                sb.append(str2);
                sb.append("  isGuidedNavRunning: ");
                sb.append(z2);
                printWriter2.println(sb.toString());
                crqf crqfVar = keaVar.g;
                if (crqfVar != null) {
                    Iterator<amub> it = crqfVar.f().iterator();
                    while (it.hasNext()) {
                        amub next = it.next();
                        Object e = dcdc.e();
                        dpeq dpeqVar = next.s;
                        if (dpeqVar != null && (dpeqVar.a & 16) != 0) {
                            dpep dpepVar = dpeqVar.k;
                            if (dpepVar == null) {
                                dpepVar = dpep.b;
                            }
                            e = dchl.k(dpepVar.a, kdx.a);
                        }
                        String valueOf = String.valueOf(next);
                        String valueOf2 = String.valueOf(e);
                        StringBuilder sb2 = new StringBuilder(str2.length() + 25 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
                        sb2.append(str2);
                        sb2.append("  route:  ");
                        sb2.append(valueOf);
                        sb2.append("  trafficData: ");
                        sb2.append(valueOf2);
                        printWriter2.println(sb2.toString());
                    }
                }
                String valueOf3 = String.valueOf(keaVar.h);
                StringBuilder sb3 = new StringBuilder(str2.length() + 36 + String.valueOf(valueOf3).length());
                sb3.append(str2);
                sb3.append("  last NavigationServiceStateEvent: ");
                sb3.append(valueOf3);
                printWriter2.println(sb3.toString());
                String valueOf4 = String.valueOf(keaVar.i);
                StringBuilder sb4 = new StringBuilder(str2.length() + 24 + String.valueOf(valueOf4).length());
                sb4.append(str2);
                sb4.append("  last event timestamp: ");
                sb4.append(valueOf4);
                printWriter2.println(sb4.toString());
                String a = kea.a(keaVar.k);
                StringBuilder sb5 = new StringBuilder(str2.length() + 30 + String.valueOf(a).length());
                sb5.append(str2);
                sb5.append("  LastDrawnPolylineTimestamp: ");
                sb5.append(a);
                printWriter2.println(sb5.toString());
                String a2 = kea.a(keaVar.j);
                StringBuilder sb6 = new StringBuilder(str2.length() + 32 + String.valueOf(a2).length());
                sb6.append(str2);
                sb6.append("  LastClearedPolylineTimestamp: ");
                sb6.append(a2);
                printWriter2.println(sb6.toString());
                keaVar.f.a().NX(str2.concat("  "), printWriter2);
                kepVar.e.NX(str2, printWriter2);
                kepVar.d.NX(str2, printWriter2);
                kepVar.b.NX(str2, printWriter2);
                kdw kdwVar = kepVar.o;
                printWriter2.println(str2.concat("AuxiliaryLockoutController:"));
                String valueOf5 = String.valueOf(kdwVar.c.l());
                StringBuilder sb7 = new StringBuilder(str2.length() + 12 + String.valueOf(valueOf5).length());
                sb7.append(str2);
                sb7.append("  lockouts: ");
                sb7.append(valueOf5);
                printWriter2.println(sb7.toString());
                if (kdwVar.e == null) {
                    z = false;
                }
                StringBuilder sb8 = new StringBuilder(str2.length() + 21);
                sb8.append(str2);
                sb8.append("  observer set: ");
                sb8.append(z);
                printWriter2.println(sb8.toString());
                kdr kdrVar = kepVar.m;
                printWriter2.println(str2.concat("AuxiliaryDisplayViewport"));
                String a3 = kdn.a(kdrVar.f);
                StringBuilder sb9 = new StringBuilder(str2.length() + 18 + a3.length());
                sb9.append(str2);
                sb9.append("  viewport state: ");
                sb9.append(a3);
                printWriter2.println(sb9.toString());
                String valueOf6 = String.valueOf(kdrVar.c.a.l());
                StringBuilder sb10 = new StringBuilder(str2.length() + 23 + String.valueOf(valueOf6).length());
                sb10.append(str2);
                sb10.append("  unobscured viewport: ");
                sb10.append(valueOf6);
                printWriter2.println(sb10.toString());
                String valueOf7 = String.valueOf(kdrVar.a().l());
                StringBuilder sb11 = new StringBuilder(str2.length() + 31 + String.valueOf(valueOf7).length());
                sb11.append(str2);
                sb11.append("  unobscured viewport margins: ");
                sb11.append(valueOf7);
                printWriter2.println(sb11.toString());
                for (kdq kdqVar : kdrVar.e) {
                    String valueOf8 = String.valueOf(kdqVar);
                    StringBuilder sb12 = new StringBuilder(str2.length() + 2 + String.valueOf(valueOf8).length());
                    sb12.append(str2);
                    sb12.append("  ");
                    sb12.append(valueOf8);
                    printWriter2.println(sb12.toString());
                }
                printWriter2.println(str2.concat("  "));
                kepVar.t.NX(str2, printWriter2);
                kepVar.q.NX(str2, printWriter2);
            }
        });
    }
}
