package defpackage;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.view.Choreographer;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.gmm.car.androidauto.CarNavigationProviderService;
import com.google.android.apps.maps.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: mum  reason: default package */
/* loaded from: classes.dex */
public class mum extends mun implements jtr, kcv, btph {
    @dzsi
    private jtu D;
    @dzsi
    private View E;
    private final HashSet<Object> F = new HashSet<>();
    private kcx G;
    jtv c;
    Application d;
    cqat e;
    btvo f;
    ckcw g;
    cjqy h;
    cjqq i;
    bvjj j;
    akfa k;
    dxio<bvrv> l;
    dxio<brlh> m;
    ktu n;
    nfi o;
    nef p;
    nes q;
    lyp r;
    dbsg<vxn> s;
    dehq t;
    jvp u;
    kes v;

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.cmvs, defpackage.jtr
    public final Context Ol() {
        Context baseContext = getBaseContext();
        dbsk.s(baseContext);
        return baseContext;
    }

    @Override // defpackage.kcv
    public final void b() {
        ((cli) this).a.b.b(3);
        Nr().getDecorView().setSystemUiVisibility(Nr().getDecorView().getSystemUiVisibility() | 8192);
        View view = this.E;
        if (view != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{-436207617, 16777215});
            view.setBackground(gradientDrawable);
        }
    }

    @Override // defpackage.kcv
    public final void d() {
        ((cli) this).a.b.b(2);
        Nr().getDecorView().setSystemUiVisibility(Nr().getDecorView().getSystemUiVisibility() & (-8193));
        View view = this.E;
        if (view != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{-452984832, 0});
            view.setBackground(gradientDrawable);
        }
    }

    @Override // defpackage.cli, defpackage.cmwh, defpackage.cmwf, defpackage.cmvs, defpackage.cmvt
    public final void e(@dzsi Bundle bundle) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        q().a(this);
        ((ckhe) this.g.a(ckee.j)).a();
        ((ckhe) this.g.a(ckee.k)).a();
        ((ckhe) this.g.a(ckee.m)).a();
        ((ckhe) this.g.a(ckee.n)).a();
        ((ckhe) this.g.a(ckee.o)).c();
        ckcw ckcwVar = this.g;
        dcdc<ckhf> dcdcVar = kty.a;
        int size = dcdcVar.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ((ckhe) ckcwVar.a(dcdcVar.get(i))).a();
        }
        kty.b = true;
        final dbty a = dbud.a(new dbty(this) { // from class: mue
            private final mum a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return new mvv(((cli) this.a).a.d);
            }
        });
        final dbty a2 = dbud.a(new dbty(this) { // from class: muf
            private final mum a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return new mvu(((cli) this.a).a.c);
            }
        });
        vxo vxoVar = new vxo(btsp.c(this.j), btsp.c(this.k), null, this.s);
        this.G = new kcx(this, this.j);
        jtv jtvVar = this.c;
        kes kesVar = this.v;
        dbpy<Object> dbpyVar = dbpy.a;
        a.getClass();
        dbty dbtyVar = new dbty(a) { // from class: mug
            private final dbty a;

            {
                this.a = a;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.a();
            }
        };
        a2.getClass();
        dbty dbtyVar2 = new dbty(a2) { // from class: muh
            private final dbty a;

            {
                this.a = a2;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.a();
            }
        };
        muj mujVar = new muj(this);
        brlh a3 = this.f.getCarParameters().l ? this.m.a() : null;
        Intent action = new Intent(this, CarNavigationProviderService.class).setAction("com.google.android.apps.gmm.INTERNAL");
        nfi nfiVar = this.o;
        Context Ol = Ol();
        nes nesVar = this.q;
        nef nefVar = this.p;
        nef.a(this, 1);
        bvjj a4 = nefVar.a.a();
        nef.a(a4, 2);
        nee neeVar = new nee(this, a4);
        nes.a(neeVar, 1);
        akfa a5 = nesVar.a.a();
        nes.a(a5, 2);
        bxtx a6 = nesVar.b.a();
        nes.a(a6, 3);
        bxtv a7 = nesVar.c.a();
        nes.a(a7, 4);
        ner nerVar = new ner(neeVar, a5, a6, a7);
        nfi.a(this, 1);
        nfi.a(Ol, 2);
        bvjj a8 = nfiVar.a.a();
        nfi.a(a8, 3);
        btxv a9 = nfiVar.b.a();
        nfi.a(a9, 4);
        Executor a10 = nfiVar.c.a();
        nfi.a(a10, 5);
        nfi.a(nerVar, 6);
        nfh nfhVar = new nfh(this, Ol, a8, a9, a10, nerVar);
        Runnable runnable = mui.a;
        kcx kcxVar = this.G;
        muk mukVar = new muk();
        nfk nfkVar = new nfk();
        jvp jvpVar = this.u;
        boolean x = x();
        jtv.a(this, 1);
        jtv.a(this, 2);
        jtv.a(kesVar, 3);
        jtd a11 = jtvVar.a.a();
        jtv.a(a11, 4);
        jtv.a(jtvVar.b.a(), 5);
        akpw a12 = jtvVar.c.a();
        jtv.a(a12, 6);
        Application a13 = jtvVar.d.a();
        jtv.a(a13, 7);
        cqat a14 = jtvVar.e.a();
        jtv.a(a14, 8);
        bvrb a15 = jtvVar.f.a();
        jtv.a(a15, 9);
        dehq a16 = jtvVar.g.a();
        jtv.a(a16, 10);
        dehq a17 = jtvVar.h.a();
        jtv.a(a17, 11);
        btvo a18 = jtvVar.i.a();
        jtv.a(a18, 12);
        dxio a19 = ((dxjh) jtvVar.j).a();
        jtv.a(a19, 13);
        dxio a20 = ((dxjh) jtvVar.k).a();
        jtv.a(a20, 14);
        dxio a21 = ((dxjh) jtvVar.l).a();
        jtv.a(a21, 15);
        ckcw a22 = jtvVar.m.a();
        jtv.a(a22, 16);
        btmv a23 = jtvVar.n.a();
        jtv.a(a23, 17);
        btrm a24 = jtvVar.o.a();
        jtv.a(a24, 18);
        crzm<Boolean> a25 = jtvVar.p.a();
        jtv.a(a25, 19);
        cjwt a26 = jtvVar.q.a();
        jtv.a(a26, 20);
        cjqy a27 = jtvVar.r.a();
        jtv.a(a27, 21);
        cjqq a28 = jtvVar.s.a();
        jtv.a(a28, 22);
        kwz a29 = jtvVar.t.a();
        jtv.a(a29, 23);
        btpc a30 = jtvVar.u.a();
        jtv.a(a30, 24);
        bvjj a31 = jtvVar.v.a();
        jtv.a(a31, 25);
        bttf a32 = jtvVar.w.a();
        jtv.a(a32, 26);
        bvtd a33 = jtvVar.x.a();
        jtv.a(a33, 27);
        jtv.a(dbpyVar, 28);
        aufc a34 = jtvVar.y.a();
        jtv.a(a34, 29);
        akfa a35 = jtvVar.z.a();
        jtv.a(a35, 30);
        crem a36 = jtvVar.A.a();
        jtv.a(a36, 31);
        dxio a37 = ((dxjh) jtvVar.B).a();
        jtv.a(a37, 32);
        dxio a38 = ((dxjh) jtvVar.C).a();
        jtv.a(a38, 33);
        dxio a39 = ((dxjh) jtvVar.D).a();
        jtv.a(a39, 34);
        dxio a40 = ((dxjh) jtvVar.E).a();
        jtv.a(a40, 35);
        dxio a41 = ((dxjh) jtvVar.F).a();
        jtv.a(a41, 36);
        dxio a42 = ((dxjh) jtvVar.G).a();
        jtv.a(a42, 37);
        bvkx a43 = jtvVar.H.a();
        jtv.a(a43, 38);
        buyt a44 = jtvVar.I.a();
        jtv.a(a44, 39);
        buxy a45 = jtvVar.J.a();
        jtv.a(a45, 40);
        jzp a46 = jtvVar.K.a();
        jtv.a(a46, 41);
        mgl a47 = jtvVar.L.a();
        jtv.a(a47, 42);
        dxio a48 = ((dxjh) jtvVar.M).a();
        jtv.a(a48, 43);
        dxio a49 = ((dxjh) jtvVar.N).a();
        jtv.a(a49, 44);
        dxio a50 = ((dxjh) jtvVar.O).a();
        jtv.a(a50, 45);
        jtv.a(dbtyVar, 46);
        jtv.a(dbtyVar2, 47);
        ktu a51 = jtvVar.P.a();
        jtv.a(a51, 48);
        jtv.a(mujVar, 49);
        Boolean a52 = jtvVar.Q.a();
        jtv.a(a52, 51);
        boolean booleanValue = a52.booleanValue();
        jtv.a(action, 52);
        dxio a53 = ((dxjh) jtvVar.R).a();
        jtv.a(a53, 53);
        jtv.a(nfhVar, 54);
        jtv.a(runnable, 55);
        bxtv a54 = jtvVar.S.a();
        jtv.a(a54, 56);
        ite a55 = jtvVar.T.a();
        jtv.a(a55, 57);
        kth a56 = jtvVar.U.a();
        jtv.a(a56, 58);
        jzn a57 = jtvVar.V.a();
        jtv.a(a57, 59);
        jtv.a(kcxVar, 60);
        jtv.a(vxoVar, 61);
        brpd a58 = jtvVar.W.a();
        jtv.a(a58, 64);
        brop a59 = jtvVar.X.a();
        jtv.a(a59, 65);
        brpt a60 = jtvVar.Y.a();
        jtv.a(a60, 66);
        jtv.a(mukVar, 67);
        lye a61 = jtvVar.Z.a();
        jtv.a(a61, 68);
        jtv.a(nfkVar, 69);
        jtv.a(((dxjh) jtvVar.aa).a(), 70);
        ksw a62 = jtvVar.ab.a();
        jtv.a(a62, 71);
        cqhn a63 = jtvVar.ac.a();
        jtv.a(a63, 72);
        cjvm a64 = jtvVar.ad.a();
        jtv.a(a64, 73);
        kaj a65 = jtvVar.ae.a();
        jtv.a(a65, 75);
        jtv.a(jvpVar, 76);
        ktz a66 = jtvVar.af.a();
        jtv.a(a66, 78);
        alja a67 = jtvVar.ag.a();
        jtv.a(a67, 79);
        final jtu jtuVar = new jtu(this, this, kesVar, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30, a31, a32, a33, dbpyVar, a34, a35, a36, a37, a38, a39, a40, a41, a42, a43, a44, a45, a46, a47, a48, a49, a50, dbtyVar, dbtyVar2, a51, mujVar, a3, booleanValue, action, a53, nfhVar, runnable, a54, a55, a56, a57, kcxVar, vxoVar, null, null, a58, a59, a60, mukVar, a61, nfkVar, a62, a63, a64, null, a65, jvpVar, x, a66, a67);
        this.D = jtuVar;
        dbsk.l(!jtuVar.ag);
        jtuVar.B.a();
        Runnable a68 = jtuVar.o.a(jtuVar.p);
        if (a68 != null) {
            jtuVar.B.k(a68, jtuVar.f, bvkw.ON_STARTUP_FULLY_COMPLETE);
        }
        ily.a(jtuVar.a.Ol());
        kpm.a = btlu.n(jtuVar.v.j());
        jtuVar.Z.e = true;
        super.e(null);
        cms cmsVar = ((cli) this).a.d;
        cmq cmqVar = (cmq) a.a();
        String valueOf = String.valueOf(cmqVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("setSearchCallback ");
        sb.append(valueOf);
        sb.toString();
        if (cmsVar.a == null) {
            cmsVar.a = new cmr();
            try {
                cmsVar.b.h(cmsVar.a);
            } catch (RemoteException unused) {
            }
        }
        cmsVar.a.a = cmqVar;
        dbsk.l(!jtuVar.ag);
        if (!jtuVar.a.Ol().bindService(jtuVar.V, jtuVar.am, 65)) {
            String valueOf2 = String.valueOf(jtuVar.V.getComponent());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
            sb2.append("Could not bind to local service ");
            sb2.append(valueOf2);
            throw new RuntimeException(sb2.toString());
        }
        jtuVar.ai = true;
        jtuVar.a.Oi();
        cqkj g = jtuVar.X.g();
        Context context = g.d;
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout frameLayout3 = new FrameLayout(context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        FrameLayout frameLayout5 = new FrameLayout(context);
        FrameLayout frameLayout6 = new FrameLayout(context);
        FrameLayout frameLayout7 = new FrameLayout(context);
        ktq ktqVar = new ktq(new jtm(jtuVar, frameLayout7, frameLayout6, frameLayout4, frameLayout5));
        jtuVar.af = ktqVar;
        jtz jtzVar = new jtz(context, Choreographer.getInstance(), jtuVar.r, jtuVar.s, jtuVar.P, jtuVar.k, jtuVar.U, jtuVar.T, jtuVar.v, new FrameLayout(context), new jty(context, ktqVar), frameLayout3, frameLayout2, frameLayout, frameLayout6, frameLayout4, frameLayout5, frameLayout7, new FrameLayout(context), new FrameLayout(context), new FrameLayout(context), new FrameLayout(context));
        jtuVar.ae = jtzVar;
        jtzVar.r.addView(jtzVar.o);
        jtzVar.r.addView(jtzVar.l);
        jtzVar.r.addView(jtzVar.n);
        jtzVar.r.addView(jtzVar.m);
        jtzVar.g.addView(jtzVar.r);
        jtzVar.s.addView(jtzVar.e);
        jtzVar.s.addView(jtzVar.f);
        jtzVar.s.addView(jtzVar.g);
        jtzVar.s.addView(jtzVar.q);
        jtzVar.s.addView(jtzVar.h);
        jtzVar.s.addView(jtzVar.i);
        jtzVar.s.addView(jtzVar.j);
        jtzVar.s.addView(jtzVar.k);
        if (btlu.n(jtzVar.d.j())) {
            LinearLayout linearLayout = new LinearLayout(jtzVar.a);
            linearLayout.setOrientation(1);
            linearLayout.addView(jtzVar.p);
            linearLayout.addView(jtzVar.s);
            jtzVar.addView(linearLayout);
        } else {
            jtzVar.addView(jtzVar.s);
        }
        jtzVar.b.postFrameCallback(jtzVar.w);
        jtuVar.a.m(jtzVar);
        mvv a69 = jtuVar.D.a();
        kqp a70 = jtuVar.E.a();
        jtuVar.as.a();
        jtuVar.x.a().z(2);
        Application application = jtuVar.c;
        cqat cqatVar = jtuVar.d;
        bvrb bvrbVar = jtuVar.e;
        Executor executor = jtuVar.f;
        btvo btvoVar = jtuVar.g;
        dxio<bvsf> dxioVar = jtuVar.i;
        dxio<ahjq> dxioVar2 = jtuVar.j;
        ckcw ckcwVar2 = jtuVar.k;
        btmv btmvVar = jtuVar.l;
        btrm btrmVar = jtuVar.m;
        bvjj bvjjVar = jtuVar.r;
        bvtd bvtdVar = jtuVar.ap;
        btsp c = btsp.c(jtuVar.v);
        dxio<axwq> dxioVar3 = jtuVar.x;
        dxio<vtn> dxioVar4 = jtuVar.y;
        dxio<pez> dxioVar5 = jtuVar.z;
        dxio<aeht> dxioVar6 = jtuVar.A;
        jtg jtgVar = jtuVar.O;
        bvrj.UI_THREAD.c();
        final dxio<akox> b = jtgVar.a.b();
        buxy buxyVar = jtuVar.R;
        boolean z2 = jtuVar.H;
        bxtv bxtvVar = jtuVar.W;
        btsp b2 = btsp.b(new mfu(application, btvoVar, dxioVar, cqatVar, dxioVar5, dxioVar2, bvjjVar, bvtdVar, dxioVar6, c, b, dxioVar3, z2));
        bwjh bwjhVar = new bwjh(btrmVar, new bwjr(b, btrmVar, cqatVar, dxioVar2, bvrbVar, bvjjVar, new bwiz(application, btmvVar, executor), dxioVar4, c, new bwjl(ckcwVar2, bvjjVar, buxyVar, c)), executor, application);
        b.getClass();
        mfs mfsVar = new mfs(bvrbVar, btrmVar, dxioVar2, dxioVar3, new dxio(b) { // from class: mft
            private final dxio a;

            {
                this.a = b;
            }

            @Override // defpackage.dxio
            public final Object a() {
                return this.a.a();
            }
        }, bwjhVar, b2, bxtvVar, bvjjVar);
        mfsVar.d.e();
        jtuVar.ad = mfsVar;
        jtuVar.F.f(new jti(jtuVar));
        muj mujVar2 = jtuVar.aq;
        kcx kcxVar2 = jtuVar.as;
        Context Ol2 = mujVar2.a.Ol();
        mum mumVar = mujVar2.a;
        final mwj mwjVar = new mwj(Ol2, mumVar.n, ktqVar, mumVar.h, mumVar.i, kcxVar2, g, frameLayout3, new ktp(), mujVar2.a.t);
        jtuVar.ac = mwjVar;
        nml nmlVar = new nml(jtuVar.s, jtuVar.a.Ol(), jtuVar.G, jtuVar.n, (NotificationManager) jtuVar.a.Ol().getSystemService("notification"), jtuVar.p, jtuVar.q, jtuVar.b, jtuVar.as, ktqVar, mwjVar, jtuVar.P, g, frameLayout2, jtuVar.C, jtuVar.ab);
        jtuVar.e.b(new Runnable(jtuVar) { // from class: jtj
            private final jtu a;

            {
                this.a = jtuVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r9 = this;
                    java.lang.String r0 = ""
                    jtu r1 = r9.a
                    jtr r2 = r1.a
                    android.content.Context r2 = r2.Ol()
                    boolean r2 = defpackage.kge.a(r2)
                    if (r2 == 0) goto Le3
                    jtr r2 = r1.a
                    android.content.Context r2 = r2.Ol()
                    boolean r3 = defpackage.kge.a(r2)
                    r4 = 0
                    if (r3 == 0) goto L2c
                    java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.io.IOException -> L2c
                    java.io.FileReader r5 = new java.io.FileReader     // Catch: java.io.IOException -> L2c
                    java.io.File r2 = defpackage.kge.b(r2)     // Catch: java.io.IOException -> L2c
                    r5.<init>(r2)     // Catch: java.io.IOException -> L2c
                    r3.<init>(r5)     // Catch: java.io.IOException -> L2c
                    goto L2d
                L2c:
                    r3 = r4
                L2d:
                    if (r3 != 0) goto L35
                    dcdc r0 = defpackage.dcdc.e()
                    goto Ld7
                L35:
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                L3a:
                    java.lang.String r5 = r3.readLine()     // Catch: java.io.IOException -> Ld3
                    if (r5 == 0) goto Lcb
                L40:
                    java.lang.String r6 = " \\"
                    boolean r6 = r5.endsWith(r6)     // Catch: java.io.IOException -> Ld3
                    if (r6 == 0) goto L85
                    java.lang.String r6 = r3.readLine()     // Catch: java.io.IOException -> Ld3
                    boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.io.IOException -> Ld3
                    if (r7 != 0) goto L40
                    r7 = 0
                    int r8 = r5.length()     // Catch: java.io.IOException -> Ld3
                    int r8 = r8 + (-2)
                    java.lang.String r5 = r5.substring(r7, r8)     // Catch: java.io.IOException -> Ld3
                    java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch: java.io.IOException -> Ld3
                    int r7 = r7.length()     // Catch: java.io.IOException -> Ld3
                    int r7 = r7 + 14
                    java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch: java.io.IOException -> Ld3
                    int r8 = r8.length()     // Catch: java.io.IOException -> Ld3
                    int r7 = r7 + r8
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Ld3
                    r8.<init>(r7)     // Catch: java.io.IOException -> Ld3
                    r8.append(r5)     // Catch: java.io.IOException -> Ld3
                    java.lang.String r5 = "<next_element>"
                    r8.append(r5)     // Catch: java.io.IOException -> Ld3
                    r8.append(r6)     // Catch: java.io.IOException -> Ld3
                    java.lang.String r5 = r8.toString()     // Catch: java.io.IOException -> Ld3
                    goto L40
                L85:
                    if (r5 != 0) goto L89
                    r5 = r4
                    goto Lc6
                L89:
                    java.lang.String r6 = "#.*$"
                    java.lang.String r5 = r5.replaceFirst(r6, r0)     // Catch: java.io.IOException -> Ld3
                    java.lang.String r6 = "\\s*$"
                    java.lang.String r5 = r5.replaceFirst(r6, r0)     // Catch: java.io.IOException -> Ld3
                    java.lang.String r6 = "^\\s*"
                    java.lang.String r5 = r5.replaceFirst(r6, r0)     // Catch: java.io.IOException -> Ld3
                    java.lang.String r6 = "\\s*=\\s*"
                    java.lang.String r7 = "="
                    java.lang.String r5 = r5.replaceAll(r6, r7)     // Catch: java.io.IOException -> Ld3
                    java.lang.String r6 = "^(\\w*)=(.*)$"
                    java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)     // Catch: java.io.IOException -> Ld3
                    java.util.regex.Matcher r5 = r6.matcher(r5)     // Catch: java.io.IOException -> Ld3
                    boolean r6 = r5.matches()     // Catch: java.io.IOException -> Ld3
                    if (r6 != 0) goto Lb6
                    kgc r5 = defpackage.kgd.b     // Catch: java.io.IOException -> Ld3
                    goto Lc6
                Lb6:
                    kgc r6 = new kgc     // Catch: java.io.IOException -> Ld3
                    r7 = 1
                    java.lang.String r7 = r5.group(r7)     // Catch: java.io.IOException -> Ld3
                    r8 = 2
                    java.lang.String r5 = r5.group(r8)     // Catch: java.io.IOException -> Ld3
                    r6.<init>(r7, r5)     // Catch: java.io.IOException -> Ld3
                    r5 = r6
                Lc6:
                    r2.add(r5)     // Catch: java.io.IOException -> Ld3
                    goto L3a
                Lcb:
                    r3.close()     // Catch: java.io.IOException -> Ld3
                    dcdc r0 = defpackage.dcdc.r(r2)
                    goto Ld7
                Ld3:
                    dcdc r0 = defpackage.dcdc.e()
                Ld7:
                    bvrb r2 = r1.e
                    jtk r3 = new jtk
                    r3.<init>(r1, r0)
                    bvrj r0 = defpackage.bvrj.UI_THREAD
                    r2.b(r3, r0)
                Le3:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.jtj.run():void");
            }
        }, bvrj.BACKGROUND_THREADPOOL);
        mwjVar.c.b();
        dbsk.l(mwjVar.k == null);
        mwjVar.k = new crzp(mwjVar) { // from class: mwh
            private final mwj a;

            {
                this.a = mwjVar;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                mwi mwiVar;
                mwj mwjVar2 = this.a;
                bvrj.UI_THREAD.c();
                if (mwjVar2.n) {
                    return;
                }
                dcep dcepVar = (dcep) crzmVar.l();
                dbsk.s(dcepVar);
                if (dcepVar.isEmpty()) {
                    mwiVar = mwi.NO_LOCKOUT;
                } else if (dcepVar.contains(ktr.LOCATION_PERMISSION_NOT_ACCEPTED)) {
                    mwiVar = mwi.LOCATION_PERMISSION_LOCKOUT;
                } else if (dcepVar.contains(ktr.GPS_DISABLED_BY_POWER_SAVE_MODE)) {
                    mwiVar = mwi.POWER_SAVE_LOCATION_LOCKOUT;
                } else if (dcepVar.contains(ktr.GPS_DISABLED)) {
                    mwiVar = mwi.LOCATION_DISABLED_LOCKOUT;
                } else if (!dcepVar.contains(ktr.KR_NOT_ALLOWED)) {
                    mwiVar = mwi.NO_LOCKOUT;
                } else {
                    mwiVar = mwi.KOREA_LOCKOUT;
                }
                if (mwjVar2.m == mwiVar) {
                    return;
                }
                if (mwjVar2.l == null) {
                    mwjVar2.l = mwjVar2.d.c(new ktn(), mwjVar2.f);
                    mwjVar2.l.e(mwjVar2.e);
                }
                dbsk.l(!mwjVar2.n);
                mwi mwiVar2 = mwjVar2.m;
                if (mwiVar2 != mwiVar) {
                    if (mwiVar2.f != null) {
                        cjqq cjqqVar = mwjVar2.i;
                        cqkf<kto> cqkfVar = mwjVar2.l;
                        dbsk.s(cqkfVar);
                        cjqqVar.h(cqkfVar.c());
                        cjqy cjqyVar = mwjVar2.h;
                        ddho ddhoVar = mwjVar2.m.f;
                        dbsk.s(ddhoVar);
                        cjqyVar.o(cjtd.a(ddhoVar));
                    }
                    if (mwiVar.f != null) {
                        cjqp e = mwjVar2.i.e(mwjVar2.h.r(mwjVar2.j), mwjVar2.j);
                        cjqq cjqqVar2 = mwjVar2.i;
                        cqkf<kto> cqkfVar2 = mwjVar2.l;
                        dbsk.s(cqkfVar2);
                        cjqqVar2.i(e, cqkfVar2.c());
                        ddho ddhoVar2 = mwiVar.f;
                        dbsk.s(ddhoVar2);
                        e.d(cjtd.a(ddhoVar2));
                    }
                }
                dbsk.l(!mwjVar2.n);
                kto ktoVar = mwjVar2.e;
                Resources resources = mwjVar2.a.getResources();
                int ordinal = mwiVar.ordinal();
                String str = "";
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        str = resources.getString(R.string.CAR_PROJECTION_MNC_LOCATION_PERMISSION_LOCKOUT);
                    } else if (ordinal == 2) {
                        str = resources.getString(R.string.CAR_PROJECTION_LOCATION_SETTING_LOCKOUT);
                    } else if (ordinal == 3) {
                        str = resources.getString(R.string.CAR_PROJECTION_POWER_SAVE_MODE_LOCKOUT);
                    } else if (ordinal == 4) {
                        str = resources.getString(R.string.CAR_KR_NOT_ALLOWED_LOCKOUT);
                    }
                }
                ktoVar.b(str);
                if (mwjVar2.e.a().length() != 0) {
                    if (!mwjVar2.e.c().booleanValue()) {
                        dbsk.l(!mwjVar2.g.a);
                        mwjVar2.g.a();
                        mwjVar2.o.b(true);
                    }
                    mwjVar2.e.d(true);
                } else {
                    if (mwjVar2.e.c().booleanValue()) {
                        dbsk.l(mwjVar2.g.a);
                        mwjVar2.g.b();
                        mwjVar2.o.c();
                    }
                    mwjVar2.e.d(false);
                }
                mwjVar2.m = mwiVar;
            }
        };
        crzm<dcep<ktr>> a71 = mwjVar.c.a();
        crzp<dcep<ktr>> crzpVar = mwjVar.k;
        dbsk.s(crzpVar);
        a71.a(crzpVar, mwjVar.b);
        if (!nmlVar.a.b() && nmb.b(nmlVar.a)) {
            nmb.a(nmlVar.a);
        }
        if (nmlVar.a.b()) {
            nmlVar.f.a();
        } else {
            nmlVar.n = nmlVar.h.c(new nmx(), nmlVar.m);
            ((nst) nmlVar.n.c()).setDefaultViewProvider(nmlVar.p);
            nmlVar.o = new nnb(nmlVar, nmlVar.q, nmlVar.a, nmlVar.c, nmlVar.d, nmlVar.g, nmlVar.b, new nmc(nmlVar), nmlVar.j, nmlVar.i, nmlVar.a.b() ? nmk.NONE : nmk.MAPS_TERMS_OF_SERVICE, nmlVar.k);
            nnb nnbVar = nmlVar.o;
            nnbVar.d.a(nnbVar.h, nnbVar.e);
            nmlVar.n.e(nmlVar.o);
            nmlVar.d.i(nmlVar.d.e(nmlVar.c.r(nmlVar.l), nmlVar.l), nmlVar.n.c());
            nmlVar.e.a();
        }
        jtg jtgVar2 = jtuVar.O;
        bvrj.UI_THREAD.c();
        if (jtgVar2.k == 1) {
            z = true;
        }
        dbsk.l(z);
        jtgVar2.g = jtzVar;
        jtgVar2.j = a69;
        jtgVar2.h = a70;
        jtgVar2.i = mfsVar;
        ((ckhe) jtgVar2.b.a(ckee.az)).a();
        jtgVar2.k = 2;
        jtgVar2.a();
        Intent No = jtuVar.a.No();
        if (No != null) {
            jtuVar.M.a(No);
        }
        jtuVar.r.f(jtuVar.an);
        jtuVar.ag = true;
        Nr().getDecorView().setSystemUiVisibility(1280);
        if (btlu.n(this.k.j())) {
            this.G.b(true);
        }
        this.G.a();
        cmu cmuVar = ((cli) this).a.b;
        cmuVar.a = 2;
        clh clhVar = cmuVar.b;
        if (clhVar != null) {
            ViewGroup viewGroup = clhVar.b.b;
            final int i2 = clhVar.a;
            viewGroup.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(i2) { // from class: clg
                private final int a;

                {
                    this.a = i2;
                }

                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    int i3 = this.a;
                    return windowInsets.getSystemWindowInsetTop() >= i3 ? windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop() - i3, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom()) : windowInsets;
                }
            });
        }
        try {
            cmuVar.c.s();
        } catch (RemoteException unused2) {
        }
        ((ckcp) this.g.a(ckee.a)).a(this.e.e() - elapsedRealtime);
    }

    @Override // defpackage.cli, defpackage.cmwh, defpackage.cmwf, defpackage.cmvs, defpackage.cmvt
    public final void f() {
        dukj dukjVar;
        ckcq a = ((ckcr) this.g.a(ckee.c)).a();
        super.f();
        jtu jtuVar = this.D;
        dbsk.s(jtuVar);
        dbsk.l(jtuVar.ag);
        jtuVar.Y.f(jtuVar.a.Ol().getResources().getConfiguration());
        jtuVar.Y.hashCode();
        jtuVar.u.d(jtuVar.Y);
        jtuVar.u.i().d(jtuVar.S, jtuVar.G);
        final jsq jsqVar = jtuVar.Z;
        jsqVar.b.g().d(cjtd.a(dtxm.aO));
        if (jsqVar.g) {
            jsqVar.b.g().d(cjtd.a(dtxm.aP));
        }
        if (jsqVar.e) {
            dukjVar = dukj.PROJECTED_APP_STARTED_COLD;
        } else {
            dukjVar = dukj.PROJECTED_APP_STARTED_HOT;
        }
        if (jsqVar.e) {
            jsqVar.d.j(new Runnable(jsqVar) { // from class: jsp
                private final jsq a;

                {
                    this.a = jsqVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    jsq jsqVar2 = this.a;
                    jsqVar2.a.R(dukj.RUNNING, null, null, jsqVar2.c.a().a(), null, null);
                }
            }, bvrj.BACKGROUND_THREADPOOL, bvkw.ON_STARTUP_FULLY_COMPLETE);
        }
        jsqVar.a.J(dukjVar);
        jsqVar.e = false;
        jsqVar.f = true;
        jtuVar.at.a.add(ktz.a(jtuVar.al ? ddkt.LIMITED_ACTIVITY : ddkt.MAIN_ACTIVITY));
        mfs mfsVar = jtuVar.ad;
        dbsk.s(mfsVar);
        mfsVar.d.i();
        btrm btrmVar = mfsVar.b;
        mfr mfrVar = mfsVar.i;
        dceq a2 = dcet.a();
        a2.b(gds.class, new mfv(0, gds.class, mfrVar, bvrj.UI_THREAD));
        a2.b(amqo.class, new mfv(1, amqo.class, mfrVar, bvrj.UI_THREAD));
        btrmVar.g(mfrVar, a2.a());
        jtuVar.ar.b().d(jtuVar.ah, jtuVar.G);
        if (jtuVar.al) {
            jtuVar.b();
        }
        jtg jtgVar = jtuVar.O;
        bvrj.UI_THREAD.c();
        dbsk.l(jtgVar.k == 2);
        jtgVar.k = 3;
        jtgVar.a();
        jtuVar.w.a().a();
        jtuVar.k.f(ckhc.GMM_CAR_ACTIVITY);
        mfs mfsVar2 = jtuVar.ad;
        dbsk.s(mfsVar2);
        if (!mfsVar2.h) {
            mfsVar2.h = true;
            mfsVar2.a();
        }
        if (jtuVar.P.h()) {
            jtz jtzVar = jtuVar.ae;
            dbsk.s(jtzVar);
            nol.b(jtzVar);
        }
        btrm btrmVar2 = jtuVar.m;
        jts jtsVar = jtuVar.ao;
        dceq a3 = dcet.a();
        a3.b(dcpy.class, new jtw(0, dcpy.class, jtsVar, bvrj.CURRENT));
        a3.b(bvpc.class, new jtw(1, bvpc.class, jtsVar, bvrj.UI_THREAD));
        btrmVar2.g(jtsVar, a3.a());
        lyp lypVar = this.r;
        btrm btrmVar3 = lypVar.a;
        dceq a4 = dcet.a();
        a4.b(crhp.class, new lyq(crhp.class, lypVar, bvrj.UI_THREAD));
        btrmVar3.g(lypVar, a4.a());
        a.b();
    }

    @Override // defpackage.cli, defpackage.cmwh, defpackage.cmwf, defpackage.cmvs, defpackage.cmvt
    public final void g() {
        ckcq a = ((ckcr) this.g.a(ckee.f)).a();
        lyp lypVar = this.r;
        lypVar.a.a(lypVar);
        jtu jtuVar = this.D;
        dbsk.s(jtuVar);
        dbsk.l(jtuVar.ag);
        jtuVar.m.a(jtuVar.ao);
        jtuVar.k.g(ckhc.GMM_CAR_ACTIVITY);
        jtuVar.w.a().d();
        jtg jtgVar = jtuVar.O;
        bvrj.UI_THREAD.c();
        dbsk.l(jtgVar.k == 3);
        jtgVar.k = 2;
        jtgVar.a();
        jtuVar.ar.b().c(jtuVar.ah);
        jtuVar.u.i().c(jtuVar.S);
        jtuVar.at.a.remove(ktz.a(jtuVar.al ? ddkt.LIMITED_ACTIVITY : ddkt.MAIN_ACTIVITY));
        jsq jsqVar = jtuVar.Z;
        jsqVar.f = false;
        jsqVar.a.J(dukj.PROJECTED_APP_BACKGROUNDED);
        mfs mfsVar = jtuVar.ad;
        dbsk.s(mfsVar);
        mfsVar.b.a(mfsVar.i);
        mfsVar.d.g();
        super.g();
        a.b();
    }

    @Override // defpackage.kcv
    public final void h(Object obj) {
        if (!this.F.remove(obj)) {
            obj.toString();
        }
        if (this.F.isEmpty()) {
            cmu cmuVar = ((cli) this).a.b;
            try {
                cmuVar.c.e();
            } catch (RemoteException unused) {
            }
            cmuVar.a(true);
            try {
                cmuVar.c.m();
            } catch (RemoteException unused2) {
            }
        }
    }

    @Override // defpackage.kcv
    public final void i(Object obj) {
        if (!this.F.add(obj)) {
            obj.toString();
        }
        cmu cmuVar = ((cli) this).a.b;
        try {
            cmuVar.c.f();
        } catch (RemoteException unused) {
        }
        cmuVar.a(false);
        try {
            cmuVar.c.n();
        } catch (RemoteException unused2) {
        }
    }

    @Override // defpackage.cli, defpackage.cmvs, defpackage.cmvt
    public final void j(boolean z, boolean z2) {
        ckcq a = ((ckcr) this.g.a(ckee.i)).a();
        super.j(z, z2);
        jtu jtuVar = this.D;
        dbsk.s(jtuVar);
        jtg jtgVar = jtuVar.O;
        bvrj.UI_THREAD.c();
        if (!jtgVar.f) {
            if (!jtgVar.c) {
                jtgVar.b(0);
            }
            jtgVar.f = true;
        }
        dbsk.s(jtuVar.ac);
        a.b();
    }

    @Override // defpackage.kcv
    public final void k(String str, int i) {
        cmx cmxVar = ((cli) this).a.e;
        Context Ol = Ol();
        cmc cmcVar = cmxVar.a;
        if (cmcVar != null) {
            try {
                cmcVar.e(str, i);
                return;
            } catch (RemoteException unused) {
                return;
            }
        }
        Context context = new cmp(Ol).b;
        DisplayManager displayManager = (DisplayManager) Ol.getSystemService("display");
        Display display = null;
        if (displayManager != null) {
            Display[] displays = displayManager.getDisplays();
            int length = displays.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Display display2 = displays[i2];
                String name = display2.getName();
                if (display2.getState() == 2 && name.split("/").length == 2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 37);
                    sb.append("found display ");
                    sb.append(name);
                    sb.append(" for showing the toast.");
                    sb.toString();
                    display = display2;
                    break;
                }
                i2++;
            }
        }
        if (display != null) {
            context = context.createDisplayContext(display);
        }
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(new cll(context, context));
        frameLayout.setClipChildren(false);
        int a = cmo.a(cmm.TOAST_PADDING, context, resources);
        frameLayout.setPadding(a, a, a, a);
        ((TextView) ((ViewGroup) LayoutInflater.from(context).inflate(resources.getIdentifier(cmn.a.b, "layout", context.getPackageName()), frameLayout)).findViewById(16908299)).setText(str);
        Toast toast = new Toast(context);
        toast.setView(frameLayout);
        toast.setDuration(i);
        toast.setGravity(87, 0, cmo.a(cmm.TOAST_Y_OFFSET, context, resources));
        if (Build.VERSION.SDK_INT >= 25 && display != null) {
            try {
                Field declaredField = toast.getClass().getDeclaredField("mTN");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(toast);
                Class<?> cls = Class.forName("android.widget.Toast$TN");
                Field declaredField2 = cls.getDeclaredField("mParams");
                declaredField2.setAccessible(true);
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) declaredField2.get(obj);
                layoutParams.type = 2030;
                declaredField2.set(obj, layoutParams);
                Field declaredField3 = cls.getDeclaredField("mHandler");
                declaredField3.setAccessible(true);
                Handler handler = (Handler) declaredField3.get(obj);
                Field declaredField4 = cls.getDeclaredField("SHOW");
                Field declaredField5 = cls.getDeclaredField("CANCEL");
                declaredField4.setAccessible(true);
                declaredField5.setAccessible(true);
                int i3 = declaredField4.getInt(obj);
                int i4 = declaredField5.getInt(obj);
                if (handler != null) {
                    declaredField3.set(obj, new clk(handler, i3, i4));
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb2.append("unable to modify toast: ");
                sb2.append(valueOf);
                sb2.toString();
            }
        }
        toast.show();
    }

    @Override // defpackage.cli, defpackage.cmwh, defpackage.cmvs, defpackage.cmvt
    public final void l(Configuration configuration) {
        lkr lkrVar;
        ckcq a = ((ckcr) this.g.a(ckee.h)).a();
        super.l(configuration);
        jtu jtuVar = this.D;
        dbsk.s(jtuVar);
        jtuVar.Y.f(configuration);
        jtuVar.X.s(configuration);
        jtg jtgVar = jtuVar.O;
        bvrj.UI_THREAD.c();
        if (jtgVar.k == 3 && jtgVar.c) {
            jtc jtcVar = jtgVar.a;
            bvrj.UI_THREAD.c();
            jvl jvlVar = jtcVar.Y;
            if (jvlVar != null && (lkrVar = jvlVar.i.l) != null) {
                lju ljuVar = lkrVar.s;
                ljuVar.n.d.t();
                if (ljuVar.l.o()) {
                    noj nojVar = ljuVar.B;
                    int i = configuration.screenWidthDp;
                    int i2 = configuration.screenHeightDp;
                    ljuVar.C.b(nojVar.b());
                }
            }
            jtcVar.N.n();
        }
        a.b();
    }

    @Override // defpackage.cli, defpackage.jtr
    public final void m(View view) {
        FrameLayout frameLayout = new FrameLayout(Ol());
        frameLayout.addView(view);
        GradientDrawable gradientDrawable = new GradientDrawable();
        if ((Nr().getDecorView().getSystemUiVisibility() & 8192) != 0) {
            gradientDrawable.setColors(new int[]{-452984832, 0});
        } else {
            gradientDrawable.setColors(new int[]{-436207617, 16777215});
        }
        View view2 = new View(Ol());
        view2.setBackground(gradientDrawable);
        view2.setVisibility(8);
        frameLayout.addView(view2);
        this.E = view2;
        frameLayout.setOnApplyWindowInsetsListener(new mul(this, view2));
        super.m((View) frameLayout);
    }

    @Override // defpackage.kcv
    public final void o() {
        PackageInfo packageInfo;
        try {
            packageInfo = Ol().getPackageManager().getPackageInfo("com.google.android.projection.gearhead", 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo == null || (Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() < 36000000 : packageInfo.versionCode < 36000000)) {
            C(16908290).dispatchKeyEvent(new KeyEvent(1, 22));
            return;
        }
        try {
            ((cli) this).a.f.a.e();
        } catch (RemoteException unused2) {
        }
    }

    @Override // defpackage.kcv
    public final boolean p() {
        PackageInfo packageInfo;
        ckco ckcoVar = (ckco) this.g.a(ckee.ar);
        TelephonyManager telephonyManager = (TelephonyManager) this.d.getSystemService("phone");
        if (telephonyManager == null || telephonyManager.getCallState() == 0) {
            try {
                packageInfo = Ol().getPackageManager().getPackageInfo("com.google.android.projection.gearhead", 4096);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
            if (packageInfo != null) {
                for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                    if (packageInfo.requestedPermissions[i].equals("android.permission.RECORD_AUDIO") && (packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                        ckcoVar.a(0);
                        return true;
                    }
                }
            }
            ckcoVar.a(2);
            return false;
        }
        ckcoVar.a(1);
        return false;
    }

    protected mtr q() {
        mty mtyVar = new mty();
        mtyVar.a = this;
        kgh kghVar = (kgh) btsr.a(kgh.class);
        dxjg.b(kghVar);
        mtyVar.b = kghVar;
        iqz iqzVar = (iqz) btsr.a(iqz.class);
        dxjg.b(iqzVar);
        mtyVar.c = iqzVar;
        dxjg.a(mtyVar.a, cli.class);
        dxjg.a(mtyVar.b, kgh.class);
        dxjg.a(mtyVar.c, iqz.class);
        return (mup) btsr.b(new mua(mtyVar.b, mtyVar.c, mtyVar.a));
    }

    @Override // defpackage.cmwh, defpackage.cmwf, defpackage.cmvs, defpackage.cmvt
    public final void r() {
        ckcq a = ((ckcr) this.g.a(ckee.d)).a();
        super.r();
        a.b();
        ((ckhe) this.g.a(ckee.k)).c();
    }

    @Override // defpackage.cmwh, defpackage.cmwf, defpackage.cmvs, defpackage.cmvt
    public final void s() {
        ckcq a = ((ckcr) this.g.a(ckee.e)).a();
        super.s();
        a.b();
    }

    @Override // defpackage.cmwh, defpackage.cmwf, defpackage.cmvs, defpackage.cmvt
    public final void t() {
        cryz<lzf> cryzVar;
        ckcq a = ((ckcr) this.g.a(ckee.g)).a();
        ((ckhe) this.g.a(ckee.o)).e();
        jtu jtuVar = this.D;
        dbsk.s(jtuVar);
        dbsk.l(jtuVar.ag);
        jtuVar.ag = false;
        jtuVar.r.g(jtuVar.an);
        ArrayList<nhe> arrayList = jtuVar.aa;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a.h = true;
        }
        if (!jtuVar.al) {
            jtuVar.b();
        }
        jtg jtgVar = jtuVar.O;
        bvrj.UI_THREAD.c();
        dbsk.l(jtgVar.k == 2);
        jtgVar.k = 1;
        jtgVar.a();
        kts ktsVar = jtuVar.ac;
        dbsk.s(ktsVar);
        mwj mwjVar = (mwj) ktsVar;
        crzm<dcep<ktr>> a2 = mwjVar.c.a();
        crzp<dcep<ktr>> crzpVar = mwjVar.k;
        dbsk.s(crzpVar);
        a2.c(crzpVar);
        mwjVar.k = null;
        mwjVar.c.d();
        jtuVar.ac = null;
        jtuVar.F.f(null);
        mfs mfsVar = jtuVar.ad;
        dbsk.s(mfsVar);
        mfsVar.d.f();
        jtuVar.ad = null;
        jtuVar.X.c();
        if (jtuVar.ai) {
            jtuVar.a.Ol().unbindService(jtuVar.am);
            jtuVar.ai = false;
        }
        kgd kgdVar = jtuVar.aj;
        if (kgdVar != null) {
            for (String str : kgdVar.h) {
                Runnable runnable = kgdVar.g.get(str);
                if (runnable != null) {
                    runnable.run();
                }
            }
            kgdVar.h.clear();
        }
        kgg kggVar = jtuVar.ak;
        if (kggVar != null && (cryzVar = kggVar.d) != null) {
            cryzVar.c();
            kggVar.d = null;
        }
        jtuVar.B.b();
        jtz jtzVar = jtuVar.ae;
        dbsk.s(jtzVar);
        jtzVar.b.removeFrameCallback(jtzVar.w);
        jtuVar.ae = null;
        this.l.a().a();
        this.D = null;
        super.t();
        a.b();
        this.l.a().a();
    }

    @Override // defpackage.cmwf, defpackage.cmvs
    public final void u() {
        jtu jtuVar = this.D;
        dbsk.s(jtuVar);
        cjtd a = cjtd.a(dtxm.a);
        jtuVar.p.j(jtuVar.q.g().d(a), a);
        ktq ktqVar = jtuVar.af;
        dbsk.s(ktqVar);
        if (!ktqVar.a) {
            jtg jtgVar = jtuVar.O;
            bvrj.UI_THREAD.c();
            if (jtgVar.a.a()) {
                return;
            }
        }
        super.u();
    }

    @Override // defpackage.cmwh, defpackage.cmvs, defpackage.cmvt
    public final void v(Intent intent) {
        ckcq a = ((ckcr) this.g.a(ckee.b)).a();
        super.v(intent);
        jtu jtuVar = this.D;
        dbsk.s(jtuVar);
        jtuVar.M.a(intent);
        jtuVar.a.Np(intent);
        jtuVar.a();
        a.b();
    }

    @Override // defpackage.cmvs, defpackage.cmvt
    public final void w(int i) {
        jtg jtgVar;
        jtu jtuVar = this.D;
        if (jtuVar == null || (jtgVar = jtuVar.O) == null) {
            return;
        }
        bvrj.UI_THREAD.c();
        jtc jtcVar = jtgVar.a;
        bvrj.UI_THREAD.c();
        jtcVar.N.g(i);
    }

    protected boolean x() {
        return false;
    }

    @Override // defpackage.cmwh
    public final void z(String str, @dzsi FileDescriptor fileDescriptor, PrintWriter printWriter, @dzsi String[] strArr) {
        String str2;
        super.z(str, fileDescriptor, printWriter, strArr);
        dbtp c = dbtp.c(dbpc.a);
        eapd a = eapd.a();
        jtu jtuVar = this.D;
        if (jtuVar != null) {
            printWriter.println(str.concat("GmmCarActivityImpl:"));
            Intent No = jtuVar.a.No();
            if (No != null) {
                Bundle extras = No.getExtras();
                if (extras != null) {
                    printWriter.println(str.concat("  pending intent with extras:"));
                    for (String str3 : extras.keySet()) {
                        StringBuilder sb = new StringBuilder(str.length() + 4 + String.valueOf(str3).length());
                        sb.append(str);
                        sb.append("    ");
                        sb.append(str3);
                        printWriter.println(sb.toString());
                    }
                } else {
                    printWriter.println(str.concat(" pending intent with no extras"));
                }
            } else {
                printWriter.println(str.concat("  no pending intent"));
            }
            jtuVar.p.NX(str, printWriter);
            jtg jtgVar = jtuVar.O;
            bvrj.UI_THREAD.c();
            printWriter.println(str.concat("DelayedCoreUiManager:"));
            String a2 = jtf.a(jtgVar.k);
            StringBuilder sb2 = new StringBuilder(str.length() + 25 + String.valueOf(a2).length());
            sb2.append(str);
            sb2.append("  externalActivityState: ");
            sb2.append(a2);
            printWriter.println(sb2.toString());
            String a3 = jtf.a(jtgVar.l);
            StringBuilder sb3 = new StringBuilder(str.length() + 30 + String.valueOf(a3).length());
            sb3.append(str);
            sb3.append("  coreUiManagerActivityState: ");
            sb3.append(a3);
            printWriter.println(sb3.toString());
            boolean z = jtgVar.c;
            StringBuilder sb4 = new StringBuilder(str.length() + 34);
            sb4.append(str);
            sb4.append("  hasDelayedStartupFinished: ");
            sb4.append(z);
            printWriter.println(sb4.toString());
            jtc jtcVar = jtgVar.a;
            String concat = str.concat("  ");
            bvrj.UI_THREAD.c();
            printWriter.println(String.valueOf(concat).concat("CoreUiManager:"));
            String concat2 = String.valueOf(concat).concat("  ");
            boolean z2 = jtcVar.aa;
            StringBuilder sb5 = new StringBuilder(String.valueOf(concat2).length() + 14);
            sb5.append(concat2);
            sb5.append("created: ");
            sb5.append(z2);
            printWriter.println(sb5.toString());
            boolean z3 = jtcVar.ab;
            StringBuilder sb6 = new StringBuilder(String.valueOf(concat2).length() + 14);
            sb6.append(concat2);
            sb6.append("started: ");
            sb6.append(z3);
            printWriter.println(sb6.toString());
            jvl jvlVar = jtcVar.Y;
            if (jvlVar != null) {
                jvlVar.h.NX(concat2, printWriter);
            }
            lnh lnhVar = jtcVar.C;
            printWriter.println(String.valueOf(concat2).concat("CarJourneySharingChecker:"));
            switch (lnhVar.d) {
                case 1:
                    str2 = "JOURNEY_SHARING_ALLOWED";
                    break;
                case 2:
                    str2 = "CLIENT_PARAM_DISABLED";
                    break;
                case 3:
                    str2 = "SIGNED_OUT";
                    break;
                case 4:
                    str2 = "NO_AUTH_TOKEN_AVAILABLE";
                    break;
                case 5:
                    str2 = "LOCATION_SHARING_TOS_NOT_ACCEPTED";
                    break;
                case 6:
                    str2 = "LOCATION_HISTORY_NOT_ENABLED";
                    break;
                case 7:
                    str2 = "DISABLED_IN_EMBEDDED";
                    break;
                case 8:
                    str2 = "DEVICE_OFFLINE";
                    break;
                case 9:
                    str2 = "INCOGNITO";
                    break;
                default:
                    str2 = "null";
                    break;
            }
            StringBuilder sb7 = new StringBuilder(String.valueOf(concat2).length() + 20 + str2.length());
            sb7.append(concat2);
            sb7.append("  mostRecentResult: ");
            sb7.append(str2);
            printWriter.println(sb7.toString());
            vxo vxoVar = jtcVar.E;
            printWriter.println(String.valueOf(concat2).concat("StickyNonTransitRouteOptionsController"));
            EnumSet<vux> a4 = vxoVar.a();
            if (a4.isEmpty()) {
                printWriter.println(String.valueOf(concat2).concat("  no route options set"));
            } else {
                Iterator it = a4.iterator();
                while (it.hasNext()) {
                    String valueOf = String.valueOf((vux) it.next());
                    StringBuilder sb8 = new StringBuilder(String.valueOf(concat2).length() + 2 + String.valueOf(valueOf).length());
                    sb8.append(concat2);
                    sb8.append("  ");
                    sb8.append(valueOf);
                    printWriter.println(sb8.toString());
                }
            }
            kdg kdgVar = jtcVar.ak;
            printWriter.println(String.valueOf(concat2).concat("UiStatus:"));
            String valueOf2 = String.valueOf(concat2);
            String valueOf3 = String.valueOf(kdgVar.toString());
            printWriter.println(valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2));
            ksh kshVar = jtcVar.al;
            printWriter.println(String.valueOf(concat2).concat("Dialer:"));
            boolean z4 = kshVar.b;
            StringBuilder sb9 = new StringBuilder(String.valueOf(concat2).length() + 20);
            sb9.append(concat2);
            sb9.append("  canMakeCall: ");
            sb9.append(z4);
            printWriter.println(sb9.toString());
            jtcVar.w.a().NX(concat2, printWriter);
            kzc kzcVar = jtcVar.S;
            printWriter.println(String.valueOf(concat2).concat("CompassController:"));
            boolean z5 = kzcVar.j;
            StringBuilder sb10 = new StringBuilder(String.valueOf(concat2).length() + 18);
            sb10.append(concat2);
            sb10.append("  isCreated: ");
            sb10.append(z5);
            printWriter.println(sb10.toString());
            String valueOf4 = String.valueOf(kzcVar.h.d());
            StringBuilder sb11 = new StringBuilder(String.valueOf(concat2).length() + 13 + String.valueOf(valueOf4).length());
            sb11.append(concat2);
            sb11.append("  isVisible: ");
            sb11.append(valueOf4);
            printWriter.println(sb11.toString());
            npm.a(jtcVar.m, concat2, printWriter);
            if (jtcVar.U == null) {
                printWriter.println(String.valueOf(concat2).concat("MapButtonsController: null"));
            } else {
                printWriter.println(String.valueOf(concat2).concat("MapButtonsController:"));
            }
            laf lafVar = jtcVar.V;
            if (lafVar == null) {
                printWriter.println(String.valueOf(concat2).concat("speedLimitAndWatermarkController: null"));
            } else {
                printWriter.println(String.valueOf(concat2).concat("speedLimitAndWatermarkController:"));
                String concat3 = String.valueOf(concat2).concat(" ");
                printWriter.println(String.valueOf(concat3).concat("SpeedLimitManager: "));
                auax auaxVar = lafVar.b;
                String concat4 = String.valueOf(concat3).concat("  ");
                int i = auaxVar.l;
                StringBuilder sb12 = new StringBuilder(String.valueOf(concat4).length() + 23);
                sb12.append(concat4);
                sb12.append("speedLimit: ");
                sb12.append(i);
                printWriter.println(sb12.toString());
                int i2 = auaxVar.m;
                StringBuilder sb13 = new StringBuilder(String.valueOf(concat4).length() + 32);
                sb13.append(concat4);
                sb13.append("currentAverageSpeed: ");
                sb13.append(i2);
                printWriter.println(sb13.toString());
                boolean z6 = auaxVar.n;
                StringBuilder sb14 = new StringBuilder(String.valueOf(concat4).length() + 31);
                sb14.append(concat4);
                sb14.append("speedLimitSettingEnabled: ");
                sb14.append(z6);
                printWriter.println(sb14.toString());
                boolean z7 = auaxVar.o;
                StringBuilder sb15 = new StringBuilder(String.valueOf(concat4).length() + 32);
                sb15.append(concat4);
                sb15.append("speedometerSettingEnabled: ");
                sb15.append(z7);
                printWriter.println(sb15.toString());
                boolean z8 = auaxVar.p;
                StringBuilder sb16 = new StringBuilder(String.valueOf(concat4).length() + 30);
                sb16.append(concat4);
                sb16.append("isSpeedLimitPromptShown: ");
                sb16.append(z8);
                printWriter.println(sb16.toString());
                int visibility = lafVar.h.getVisibility();
                StringBuilder sb17 = new StringBuilder(String.valueOf(concat3).length() + 38);
                sb17.append(concat3);
                sb17.append("speedLimitView visibility: ");
                sb17.append(visibility);
                printWriter.println(sb17.toString());
                int visibility2 = lafVar.i.getVisibility();
                StringBuilder sb18 = new StringBuilder(String.valueOf(concat3).length() + 37);
                sb18.append(concat3);
                sb18.append("watermarkView visibility: ");
                sb18.append(visibility2);
                printWriter.println(sb18.toString());
            }
            jtuVar.P.NX(str, printWriter);
            jtuVar.N.NX(str, printWriter);
            jtuVar.Y.NX(str, printWriter);
            jtuVar.u.NX(str, printWriter);
            jtuVar.ar.NX(str, printWriter);
            jtuVar.t.NX(str, printWriter);
            kts ktsVar = jtuVar.ac;
            if (ktsVar != null) {
                printWriter.println(str.concat("ProjectedLockoutScreenController"));
                mwj mwjVar = (mwj) ktsVar;
                boolean z9 = mwjVar.n;
                StringBuilder sb19 = new StringBuilder(str.length() + 28);
                sb19.append(str);
                sb19.append("  isLockoutSuppressed: ");
                sb19.append(z9);
                printWriter.println(sb19.toString());
                String valueOf5 = String.valueOf(mwjVar.m);
                StringBuilder sb20 = new StringBuilder(str.length() + 19 + String.valueOf(valueOf5).length());
                sb20.append(str);
                sb20.append("  previousLockout: ");
                sb20.append(valueOf5);
                printWriter.println(sb20.toString());
                mwjVar.c.NX(str.concat("  "), printWriter);
            }
            jtuVar.v.F(str, printWriter);
            kgd kgdVar = jtuVar.aj;
            if (kgdVar == null) {
                printWriter.println(str.concat(" no demoModeController"));
            } else {
                printWriter.println(str.concat("DemoModeController:"));
                String valueOf6 = String.valueOf(kgdVar.h);
                StringBuilder sb21 = new StringBuilder(str.length() + 18 + String.valueOf(valueOf6).length());
                sb21.append(str);
                sb21.append("  appliedOptions: ");
                sb21.append(valueOf6);
                printWriter.println(sb21.toString());
            }
            jtuVar.W.NX(str, printWriter);
            mfs mfsVar = jtuVar.ad;
            if (mfsVar == null) {
                printWriter.println(str.concat("*Recents* no odelayController"));
            } else {
                mfsVar.d.a.g.NX(str, printWriter);
            }
            jtuVar.h.a().NX(str, printWriter);
            jtuVar.k.p(dcdc.g(ckgy.CAR, ckgy.REQUEST_PERFORMANCE), str, printWriter);
        }
        if (!this.F.isEmpty()) {
            Iterator<Object> it2 = this.F.iterator();
            while (it2.hasNext()) {
                String valueOf7 = String.valueOf(it2.next());
                StringBuilder sb22 = new StringBuilder(str.length() + 22 + String.valueOf(valueOf7).length());
                sb22.append(str);
                sb22.append("AppHeader suppressor: ");
                sb22.append(valueOf7);
                printWriter.println(sb22.toString());
            }
        }
        printWriter.println(str.concat("Dump Timing:"));
        String valueOf8 = String.valueOf(a.c());
        StringBuilder sb23 = new StringBuilder(str.length() + 9 + String.valueOf(valueOf8).length());
        sb23.append(str);
        sb23.append("  Start: ");
        sb23.append(valueOf8);
        printWriter.println(sb23.toString());
        c.g();
        String valueOf9 = String.valueOf(c);
        StringBuilder sb24 = new StringBuilder(str.length() + 12 + String.valueOf(valueOf9).length());
        sb24.append(str);
        sb24.append("  Duration: ");
        sb24.append(valueOf9);
        printWriter.println(sb24.toString());
    }
}
