package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: ckqx  reason: default package */
/* loaded from: classes4.dex */
public final class ckqx implements ckra {
    public final ckrn a;
    public final btrm b;
    public final ckrh c;
    @dzsi
    public crqf d;
    @dzsi
    public cray e;
    @dzsi
    public amut f;
    @dzsi
    public GmmLocation g;
    public boolean h;
    private final dxio<cref> i;
    private final crem j;

    public ckqx(dxio<cref> dxioVar, cqat cqatVar, btrm btrmVar, ckrh ckrhVar, crem cremVar) {
        ckqo ckqoVar = new ckqo();
        dceq a = dcet.a();
        a.b(creu.class, new ckqp(creu.class, ckqoVar));
        btrmVar.g(ckqoVar, a.a());
        this.h = false;
        this.i = dxioVar;
        this.a = new ckrn(cqatVar);
        this.b = btrmVar;
        this.c = ckrhVar;
        this.j = cremVar;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    private final void p(crfj crfjVar) {
        this.i.a().b(crfjVar, crej.RESPONSE, this.c.a());
    }

    private final crfe q() {
        return this.i.a().q();
    }

    @Override // defpackage.ckra
    public final boolean a() {
        return this.d != null;
    }

    @Override // defpackage.ckra
    public final boolean b() {
        cray crayVar = this.e;
        return crayVar != null && crayVar.a.ai() > 2;
    }

    @Override // defpackage.ckra
    public final boolean c() {
        cray crayVar = this.e;
        return crayVar != null && crayVar.a.h == dqvj.WALK;
    }

    @Override // defpackage.ckra
    public final void d() {
        p(q().e(true != a() ? R.string.DA_SPEECH_UNSUPPORTED_VOICE_ACTION : R.string.DA_SPEECH_UNSUPPORTED_VOICE_ACTION_NAVIGATION));
    }

    @Override // defpackage.ckra
    public final void e() {
        ((ckco) this.c.a.a(ckhi.aw)).a(ckre.a(o()));
    }

    @Override // defpackage.ckra
    public final void f() {
        if (!a()) {
            this.c.q(2);
            return;
        }
        cray crayVar = this.e;
        if (crayVar == null) {
            this.c.q(3);
        } else if (crayVar.h == -1) {
            this.c.q(4);
        } else {
            crfe q = q();
            int i = crayVar.h;
            crfc crfcVar = q.b;
            p(crfj.d(crfi.OTHER, crfc.a(crfcVar.b(crfcVar.b.b(q.e), false), i)));
            this.c.q(1);
        }
    }

    @Override // defpackage.ckra
    public final void g() {
        if (!a()) {
            this.c.p(2);
            return;
        }
        cray crayVar = this.e;
        if (crayVar == null) {
            this.c.p(3);
        } else if (crayVar.b() == -1) {
            this.c.p(4);
        } else {
            p(crfj.d(crfi.OTHER, q().b(crayVar.b())));
            this.c.p(1);
        }
    }

    @Override // defpackage.ckra
    public final void h() {
        if (!a()) {
            this.c.r(2);
            return;
        }
        cray crayVar = this.e;
        if (crayVar == null) {
            this.c.r(3);
        } else if (crayVar.b() == -1) {
            this.c.r(4);
        } else {
            p(q().d(crayVar.b()));
            this.c.r(1);
        }
    }

    @Override // defpackage.ckra
    public final void j(boolean z) {
        int i;
        cray crayVar = this.e;
        if (!a() || crayVar == null || crayVar.b() == -1) {
            k(z);
            return;
        }
        crfe q = q();
        cray crayVar2 = this.e;
        String str = null;
        dpej g = crayVar2 == null ? null : crayVar2.g();
        String b = q.b(crayVar.b());
        if (g != null) {
            int ordinal = g.ordinal();
            if (ordinal == 1) {
                i = R.string.DA_SPEECH_TRAFFIC_HEAVY;
            } else if (ordinal == 2) {
                i = R.string.DA_SPEECH_TRAFFIC_MEDIUM;
            } else if (ordinal == 3) {
                i = R.string.DA_SPEECH_TRAFFIC_LIGHT;
            }
            str = q.a.getString(i);
        }
        if (str != null) {
            String string = q.a.getString(R.string.ACCESSIBILITY_LONG_PAUSE);
            StringBuilder sb = new StringBuilder(str.length() + String.valueOf(string).length() + String.valueOf(b).length());
            sb.append(str);
            sb.append(string);
            sb.append(b);
            b = sb.toString();
        }
        this.i.a().b(crfj.d(crfi.OTHER_WITH_LOCALIZED_NAME, b), crej.RESPONSE, new ckqu(this, z));
    }

    public final void k(boolean z) {
        if (z) {
            this.c.b(3);
        } else {
            this.c.b(5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
        if (r0 == Integer.MAX_VALUE) goto L19;
     */
    @Override // defpackage.ckra
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckqx.m():void");
    }

    @Override // defpackage.ckra
    public final void l() {
        crqf crqfVar;
        String string;
        if (!a() || (crqfVar = this.d) == null) {
            this.c.w(4);
            return;
        }
        amvh l = crqfVar.g().a.l();
        if (l == null) {
            this.c.w(5);
            return;
        }
        crfe q = q();
        String p = l.p();
        if (dbsj.d(p)) {
            string = q.a.getString(R.string.DA_SPEECH_DESTINATION_NOT_FOUND);
        } else {
            string = q.a.getString(R.string.DA_SPEECH_DESTINATION, new Object[]{p});
        }
        p(crfj.d(crfi.OTHER_WITH_LOCALIZED_NAME, string));
        if (!dbsj.d(l.p())) {
            if (crqfVar.g().a.ai() > 2) {
                this.c.w(2);
                return;
            } else {
                this.c.w(1);
                return;
            }
        }
        this.c.w(3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
        if (r6.e(r3.a.W, r5.l) > 0.98d) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int o() {
        /*
            r11 = this;
            cray r0 = r11.e
            boolean r1 = r11.a()
            r2 = 1
            if (r1 == 0) goto L8b
            if (r0 != 0) goto Ld
            goto L8b
        Ld:
            bvrj r1 = defpackage.bvrj.UI_THREAD
            r1.c()
            cray r1 = r11.e
            if (r1 != 0) goto L18
            r3 = 0
            goto L1a
        L18:
            amuo r3 = r1.b
        L1a:
            r4 = 0
            if (r1 == 0) goto L5d
            if (r3 == 0) goto L5d
            java.util.List<amut> r1 = r3.D
            amut r3 = r11.f
            if (r3 == 0) goto L4f
            bvrj r3 = defpackage.bvrj.UI_THREAD
            r3.c()
            cray r3 = r11.e
            amut r5 = r11.f
            if (r5 == 0) goto L5d
            if (r3 != 0) goto L33
            goto L5d
        L33:
            amvw r6 = r3.n
            amuo r5 = r5.a()
            if (r6 == 0) goto L5d
            amub r3 = r3.a
            long r7 = r3.W
            int r3 = r5.l
            double r9 = (double) r3
            double r5 = r6.e(r7, r9)
            r7 = 4607002274814922588(0x3fef5c28f5c28f5c, double:0.98)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L5d
        L4f:
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L5d
            java.lang.Object r1 = r1.get(r4)
            amut r1 = (defpackage.amut) r1
            r11.f = r1
        L5d:
            amut r1 = r11.f
            crfe r3 = r11.q()
            crfj r1 = r3.j(r0, r1)
            if (r1 == 0) goto L6a
            goto L97
        L6a:
            boolean r0 = r0.k
            if (r0 != 0) goto L89
            crem r0 = r11.j
            cren r0 = r0.e()
            cren r1 = defpackage.cren.UNMUTED
            if (r0 == r1) goto L79
            goto L7a
        L79:
            r2 = 0
        L7a:
            r11.h = r2
            crfe r0 = r11.q()
            r1 = 2131953100(0x7f1305cc, float:1.9542661E38)
            crfj r1 = r0.e(r1)
            r2 = 3
            goto L97
        L89:
            r2 = 4
            goto L97
        L8b:
            crfe r0 = r11.q()
            r1 = 2131953116(0x7f1305dc, float:1.9542694E38)
            crfj r1 = r0.e(r1)
            r2 = 2
        L97:
            if (r1 == 0) goto Lac
            dxio<cref> r0 = r11.i
            java.lang.Object r0 = r0.a()
            cref r0 = (defpackage.cref) r0
            crej r3 = defpackage.crej.RESPONSE_KEEP_PLAYING_ON_STOP_NAVIGATION
            ckrh r4 = r11.c
            cree r4 = r4.a()
            r0.b(r1, r3, r4)
        Lac:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckqx.o():int");
    }

    @Override // defpackage.ckra
    public final int n(dmcf dmcfVar) {
        int i;
        if (!a()) {
            this.c.u(1, dmcfVar);
            return -1;
        }
        EnumMap k = dcjz.k(vux.class);
        cred credVar = cred.NEVER_PLAYED;
        switch (dmcfVar.ordinal()) {
            case 35:
                k.put((EnumMap) vux.AVOID_TOLLS, (vux) 1);
                i = R.string.DA_SPEECH_REROUTE_TO_AVOID_TOLLS;
                break;
            case com.google.android.filament.R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                k.put((EnumMap) vux.AVOID_TOLLS, (vux) 0);
                i = R.string.DA_SPEECH_REROUTE_TO_ALLOW_TOLLS;
                break;
            case com.google.android.filament.R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                k.put((EnumMap) vux.AVOID_FERRIES, (vux) 1);
                i = R.string.DA_SPEECH_REROUTE_TO_AVOID_FERRIES;
                break;
            case com.google.android.filament.R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                k.put((EnumMap) vux.AVOID_FERRIES, (vux) 0);
                i = R.string.DA_SPEECH_REROUTE_TO_ALLOW_FERRIES;
                break;
            case com.google.android.filament.R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                k.put((EnumMap) vux.AVOID_HIGHWAYS, (vux) 1);
                i = R.string.DA_SPEECH_REROUTE_TO_AVOID_HIGHWAYS;
                break;
            case com.google.android.filament.R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                k.put((EnumMap) vux.AVOID_HIGHWAYS, (vux) 0);
                i = R.string.DA_SPEECH_REROUTE_TO_ALLOW_HIGHWAYS;
                break;
            default:
                return -1;
        }
        this.b.b(new sri(null, new srh(k, true, true)));
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ckqt] */
    @Override // defpackage.ckra
    public final void i() {
        String string;
        GmmLocation gmmLocation;
        amvx t;
        String str = null;
        amuo amuoVar = null;
        if (a()) {
            cray crayVar = this.e;
            if (crayVar != null) {
                amuoVar = crayVar.b;
            }
            str = amux.k(amuoVar);
        }
        if (str == null && (gmmLocation = this.g) != null && gmmLocation.e() && (t = this.g.t()) != null) {
            str = t.a;
        }
        ckqs ckqsVar = new ckqs(this);
        ?? ckqtVar = new ckqt(this);
        cref a = this.i.a();
        crfe q = q();
        if (dbsj.d(str)) {
            string = q.a.getString(R.string.DA_SPEECH_CURRENT_ROAD_NOT_FOUND);
        } else {
            string = q.a.getString(R.string.DA_SPEECH_CURRENT_ROAD, new Object[]{str});
        }
        crfj d = crfj.d(crfi.OTHER_WITH_LOCALIZED_NAME, string);
        if (str != null) {
            ckqsVar = ckqtVar;
        }
        a.b(d, crej.RESPONSE, ckqsVar);
    }
}
