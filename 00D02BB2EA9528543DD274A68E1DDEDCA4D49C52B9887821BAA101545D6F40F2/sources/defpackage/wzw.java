package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: wzw  reason: default package */
/* loaded from: classes7.dex */
public class wzw implements wyr {
    private static final cqrp j = cqrp.d(22.0d);
    public final Activity a;
    public final wvi b;
    public drhj c;
    public boolean d;
    private final vtn e;
    private final wzj f;
    private final wyy g;
    private final wvy h;
    private final wvw i;
    private wzi k;
    private String l = null;
    private CharSequence m = "";

    public wzw(Activity activity, cqhn cqhnVar, vtn vtnVar, wzj wzjVar, wyy wyyVar, wvi wviVar, wvy wvyVar, wvw wvwVar) {
        this.a = activity;
        this.e = vtnVar;
        this.f = wzjVar;
        this.g = wyyVar;
        this.b = wviVar;
        this.h = wvyVar;
        this.i = wvwVar;
        this.c = wvyVar.a() == null ? wvwVar.f() : wvyVar.a();
        this.d = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e4  */
    @Override // defpackage.wyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.jib a() {
        /*
            r8 = this;
            wvw r0 = r8.i
            dcdc r0 = r0.b()
            r1 = 0
            if (r0 == 0) goto L80
            wvw r0 = r8.i
            dcdc r0 = r0.b()
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r0.next()
            dpce r2 = (defpackage.dpce) r2
            int r3 = r2.b
            int r3 = defpackage.dpcd.a(r3)
            if (r3 == 0) goto L13
            r4 = 6
            if (r3 != r4) goto L13
            int r3 = r2.a
            r3 = r3 & 4
            if (r3 == 0) goto L13
            goto L32
        L31:
            r2 = r1
        L32:
            if (r2 != 0) goto L3f
            wvw r0 = r8.i
            dcdc r0 = r0.b()
            dpce r2 = defpackage.alcf.m(r0)
            goto L5f
        L3f:
            java.lang.String r0 = defpackage.alcf.c(r2)
            if (r0 != 0) goto L5f
            zbd r0 = new zbd
            android.app.Activity r3 = r8.a
            r0.<init>(r3)
            wvw r3 = r8.i
            dcdc r3 = r3.b()
            java.lang.String r3 = defpackage.alcf.n(r3)
            r0.b(r3)
            java.lang.String r0 = r0.toString()
            r8.l = r0
        L5f:
            if (r2 == 0) goto L80
            alcb r0 = defpackage.alcc.a()
            android.app.Activity r3 = r8.a
            r0.a = r3
            vtn r3 = r8.e
            r0.b = r3
            cqrp r3 = defpackage.wzw.j
            android.app.Activity r4 = r8.a
            int r3 = r3.e(r4)
            r0.d = r3
            alcc r0 = r0.a()
            java.lang.CharSequence r0 = r0.c(r2)
            goto L81
        L80:
            r0 = r1
        L81:
            if (r0 == 0) goto L86
            r8.m = r0
            goto L8a
        L86:
            java.lang.String r0 = ""
            r8.m = r0
        L8a:
            jhz r0 = defpackage.jhz.a()
            java.lang.CharSequence r2 = r8.m
            r0.a = r2
            wvw r2 = r8.i
            java.lang.String r2 = r2.c()
            wvw r3 = r8.i
            dgaw r3 = r3.d()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto Lc0
            android.app.Activity r6 = r8.a
            java.lang.String r3 = defpackage.bvtb.h(r6, r3)
            if (r2 == 0) goto Lbf
            android.app.Activity r6 = r8.a
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r4] = r2
            r7[r5] = r3
            r2 = 2131958391(0x7f131a77, float:1.9553393E38)
            java.lang.String r2 = r6.getString(r2, r7)
            goto Lc0
        Lbf:
            r2 = r3
        Lc0:
            r0.b = r2
            r0.x = r4
            cqtd r2 = defpackage.ibq.E()
            r0.d = r2
            wzt r2 = new wzt
            r2.<init>(r8)
            r0.f(r2)
            ddho r2 = defpackage.dtyc.ep
            cjtd r2 = defpackage.cjtd.a(r2)
            r0.o = r2
            r0.p = r1
            r0.F = r5
            r0.G = r5
            java.lang.String r1 = r8.l
            if (r1 == 0) goto Le6
            r0.n = r1
        Le6:
            jib r0 = r0.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzw.a():jib");
    }

    @Override // defpackage.wyr
    public wyn b() {
        drhj drhjVar = this.c;
        if (drhjVar != null) {
            djws a = this.b.a(drhjVar);
            wzi wziVar = this.k;
            if (wziVar != null) {
                drhj drhjVar2 = wziVar.h().c;
                if (drhjVar2 == null) {
                    drhjVar2 = drhj.c;
                }
                if (drhjVar2.equals(this.c)) {
                    return this.k;
                }
            }
            wzj wzjVar = this.f;
            final Activity activity = this.a;
            activity.getClass();
            wzg wzgVar = new wzg(activity) { // from class: wzu
                private final Activity a;

                {
                    this.a = activity;
                }

                @Override // defpackage.wzg
                public final void a() {
                    this.a.onBackPressed();
                }
            };
            wvy wvyVar = this.h;
            wvw wvwVar = this.i;
            wzp a2 = wzjVar.a.a();
            wzj.a(a2, 1);
            wzc a3 = wzjVar.b.a();
            wzj.a(a3, 2);
            wze a4 = wzjVar.c.a();
            wzj.a(a4, 3);
            wvp a5 = wzjVar.d.a();
            wzj.a(a5, 4);
            cqhn a6 = wzjVar.e.a();
            wzj.a(a6, 5);
            Activity activity2 = (Activity) ((dxjd) wzjVar.f).a;
            wzj.a(activity2, 6);
            xaz a7 = wzjVar.g.a();
            wzj.a(a7, 7);
            wzj.a(wzgVar, 8);
            wzj.a(wvyVar, 9);
            wzj.a(a, 10);
            wzj.a(wvwVar, 11);
            wzi wziVar2 = new wzi(a2, a3, a4, a5, a6, activity2, a7, wzgVar, wvyVar, a, wvwVar);
            this.k = wziVar2;
            return wziVar2;
        }
        return null;
    }

    @Override // defpackage.wyr
    public wyj c() {
        if (this.c != null) {
            return null;
        }
        this.k = null;
        wyy wyyVar = this.g;
        wyu wyuVar = new wyu(this) { // from class: wzv
            private final wzw a;

            {
                this.a = this;
            }

            @Override // defpackage.wyu
            public final void a(drhj drhjVar) {
                wzw wzwVar = this.a;
                wzwVar.d = true;
                wzwVar.c = drhjVar;
                String str = drhjVar.b;
                wzwVar.f(wzwVar.b.a(drhjVar).f);
                cqkx.p(wzwVar);
            }
        };
        wvw wvwVar = this.i;
        gga a = wyyVar.a.a();
        wyy.a(a, 1);
        wyw a2 = wyyVar.b.a();
        wyy.a(a2, 2);
        wvi a3 = wyyVar.c.a();
        wyy.a(a3, 3);
        wvp a4 = wyyVar.d.a();
        wyy.a(a4, 4);
        wyy.a(wyuVar, 5);
        wyy.a(wvwVar, 6);
        return new wyx(a, a2, a3, a4, wyuVar, wvwVar);
    }

    public boolean d() {
        if (!this.d) {
            return false;
        }
        this.d = false;
        this.c = null;
        cqkx.p(this);
        f(this.a.getString(R.string.TRANSIT_TRIP_ATTRIBUTES_VIEW_ALL));
        return true;
    }

    public wvy e() {
        wzi wziVar = this.k;
        if (wziVar != null) {
            return wziVar.f();
        }
        return null;
    }

    public final void f(String str) {
        View o = cqkx.o(this);
        if (o != null) {
            cpv.a.b(o, str);
        }
    }
}
