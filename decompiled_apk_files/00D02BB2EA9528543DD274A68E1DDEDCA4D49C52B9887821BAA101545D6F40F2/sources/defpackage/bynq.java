package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.apps.gmm.majorevents.api.MajorEvent;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: bynq  reason: default package */
/* loaded from: classes4.dex */
public class bynq implements byng {
    private static final dnqh U;
    private final PackageManager A;
    private final amfi B;
    private final boolean C;
    private final boolean D;
    @dzsi
    private final bynm E;
    private dgas F;
    private dgas G;
    private dgas H;
    @dzsi
    private CharSequence I;
    @dzsi
    private CharSequence J;
    @dzsi
    private CharSequence K;
    @dzsi
    private CharSequence L;
    @dzsi
    private dowb M;
    private final boolean N;
    @dzsi
    private CharSequence O;
    @dzsi
    private String P;
    @dzsi
    private cjtd Q;
    private long R;
    private dqkr S;
    private final bvgn V;
    final btzi<dwnn, dwnp> a;
    final amfq b;
    public final bvrb c;
    public final byno d;
    public final Context e;
    public final dxio<dbsg<afha>> f;
    public final cjqy g;
    public bynf h;
    public CharSequence i;
    @dzsi
    public cqtd j;
    @dzsi
    public dpad k;
    @dzsi
    public CharSequence l;
    @dzsi
    public CharSequence m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    @dzsi
    public bynn s;
    final bynp t;
    @dzsi
    bykw u;
    private final bvsl v;
    private final dxio<byej> w;
    private final dxio<dbsg<aagc>> x;
    private final dxio<dbsg<akgd>> y;
    private final cjqq z;

    static {
        dnqg bZ = dnqh.p.bZ();
        dnmu dnmuVar = dnmu.PROPERTY_GMM;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.l = dnmuVar.ap;
        dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        int i = ddda.aG.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar2 = (dnqh) bZ.b;
        dnqhVar2.a |= 64;
        dnqhVar2.g = i;
        U = bZ.bK();
    }

    public bynq(bvsl bvslVar, dxio dxioVar, dxio dxioVar2, dxio dxioVar3, dxio dxioVar4, cjqy cjqyVar, cjqq cjqqVar, amfi amfiVar, bvgl bvglVar, bvgn bvgnVar, bvrb bvrbVar, btvo btvoVar, byno bynoVar, Context context, amwb amwbVar, boolean z, boolean z2, bynm bynmVar, bykw bykwVar) {
        bynh bynhVar = new bynh(this);
        this.a = bynhVar;
        this.b = new bynj(this);
        this.t = new bynp(this);
        this.c = bvrbVar;
        this.d = bynoVar;
        this.e = context;
        this.v = bvslVar;
        this.w = dxioVar;
        this.f = dxioVar2;
        this.x = dxioVar3;
        this.y = dxioVar4;
        this.g = cjqyVar;
        this.z = cjqqVar;
        this.A = context.getPackageManager();
        this.B = amfiVar;
        this.C = z;
        this.D = z2;
        this.E = bynmVar;
        this.u = bykwVar;
        this.V = bvgnVar;
        this.i = context.getString(R.string.LOADING);
        this.F = dgas.e;
        this.G = dgas.e;
        this.H = dgas.e;
        this.h = bynf.LOADING;
        this.S = dqkr.UNKNOWN_INCIDENT_TYPE;
        this.N = btvoVar.getDirectionsPageParameters().H;
        if (amwbVar.d() == null || amwbVar.g() == null) {
            dwnm bZ = dwnn.b.bZ();
            bZ.a(amwbVar.a());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwnn.c((dwnn) bZ.b);
            bvglVar.a(bZ.bK(), bynhVar, bvrj.UI_THREAD);
            return;
        }
        P(amwbVar);
        if (bykwVar != null) {
            bykwVar.a(amwbVar);
        }
        this.h = bynf.LOADED;
    }

    @dzsi
    private final MajorEvent T() {
        if (this.y.a().a() && !TextUtils.isEmpty(this.L)) {
            return this.y.a().b().c(String.valueOf(this.L));
        }
        return null;
    }

    private final cqkl U(int i, int i2) {
        if (!x().booleanValue() || !z().booleanValue()) {
            return cqkl.a;
        }
        dkcv bZ = dkcw.i.bZ();
        dnqh dnqhVar = U;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkcw dkcwVar = (dkcw) bZ.b;
        dnqhVar.getClass();
        dkcwVar.b = dnqhVar;
        int i3 = dkcwVar.a | 1;
        dkcwVar.a = i3;
        dkcwVar.c = i2 - 1;
        int i4 = i3 | 2;
        dkcwVar.a = i4;
        dkcwVar.d = 5;
        int i5 = i4 | 4;
        dkcwVar.a = i5;
        dkcwVar.e = this.S.q;
        int i6 = i5 | 8;
        dkcwVar.a = i6;
        long j = this.R;
        dkcwVar.a = i6 | 16;
        dkcwVar.f = j;
        this.V.a(bZ.bK(), this.t, bvrj.UI_THREAD);
        this.n = true;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.byng
    @dzsi
    public CharSequence A() {
        return this.l;
    }

    @Override // defpackage.byng
    @dzsi
    public CharSequence B() {
        return this.m;
    }

    @Override // defpackage.byng
    public Boolean C() {
        boolean z = false;
        if (this.N && !TextUtils.isEmpty(this.P)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.byng
    @dzsi
    public CharSequence D() {
        return this.O;
    }

    @Override // defpackage.byng
    public CharSequence E() {
        return this.e.getString(R.string.TRAFFIC_INCIDENT_GET_MORE_INFO_LINK_LABEL);
    }

    @Override // defpackage.byng
    public cqkl F() {
        String str = this.P;
        if (this.f.a().a() && !TextUtils.isEmpty(str)) {
            this.f.a().b().m(str, 4);
        }
        return cqkl.a;
    }

    @Override // defpackage.byng
    public cjtd G() {
        return cjtd.a(dtyc.bt);
    }

    @Override // defpackage.byng
    public cqtd H() {
        return cqrt.g(2131232561, this.o ? ibl.H() : ire.f());
    }

    @Override // defpackage.byng
    public cqtd I() {
        return cqrt.g(2131232556, this.p ? ibl.H() : ire.f());
    }

    @Override // defpackage.byng
    public cqtd J() {
        return cqrt.g(2131232706, this.q ? ibl.H() : ire.f());
    }

    @Override // defpackage.byng
    public cqkl K() {
        this.p = true;
        cqkx.p(this);
        return U(6, 4);
    }

    @Override // defpackage.byng
    public cqkl L() {
        this.q = true;
        cqkx.p(this);
        return U(6, 5);
    }

    @Override // defpackage.byng
    public cqkl M() {
        this.o = true;
        cqkx.p(this);
        return U(6, 6);
    }

    @Override // defpackage.byng
    public cqkl N() {
        bynm bynmVar = this.E;
        if (bynmVar != null) {
            bynmVar.a();
        }
        return cqkl.a;
    }

    @Override // defpackage.byng
    @dzsi
    public cjtd O() {
        return this.Q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(defpackage.amwb r10) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bynq.P(amwb):void");
    }

    public void Q(int i) {
        dowb g = bynw.g(this.M, i);
        if (g == null) {
            return;
        }
        bynw.b(this.e.getResources(), this.v, g);
    }

    public void R(bynn bynnVar) {
        this.s = bynnVar;
    }

    public void S() {
        boolean z;
        dbsk.l(r().booleanValue());
        try {
            this.A.getPackageInfo("com.waze", 1);
            z = true;
        } catch (PackageManager.NameNotFoundException unused) {
            z = false;
        }
        new AlertDialog.Builder(this.e).setTitle(R.string.WAZE_ATTRIBUTION_DIALOG_TITLE).setMessage(z ? R.string.WAZE_ATTRIBUTION_DIALOG_CONTENT_ALREADY_INSTALLED : R.string.WAZE_ATTRIBUTION_DIALOG_CONTENT_NOT_INSTALLED).setNegativeButton(R.string.WAZE_ATTRIBUTION_DIALOG_DISMISS, new bynl(this)).setPositiveButton(true != z ? R.string.WAZE_ATTRIBUTION_DIALOG_GET_WAZE : R.string.WAZE_ATTRIBUTION_DIALOG_OPEN_WAZE, new bynk(this, z)).show();
    }

    @Override // defpackage.byng
    public Boolean a() {
        return Boolean.valueOf(this.D);
    }

    @Override // defpackage.byng
    public cqkl b() {
        if (this.d.a()) {
            this.w.a().f();
        }
        return cqkl.a;
    }

    @Override // defpackage.byng
    public CharSequence c() {
        return this.i;
    }

    @Override // defpackage.byng
    @dzsi
    public CharSequence d() {
        return this.I;
    }

    @Override // defpackage.byng
    public Boolean e() {
        return Boolean.valueOf(!TextUtils.isEmpty(this.J));
    }

    @Override // defpackage.byng
    @dzsi
    public CharSequence f() {
        return this.J;
    }

    @Override // defpackage.byng
    public Boolean g() {
        return Boolean.valueOf(!TextUtils.isEmpty(this.K));
    }

    @Override // defpackage.byng
    @dzsi
    public CharSequence h() {
        return this.K;
    }

    @Override // defpackage.byng
    public cqkl i() {
        MajorEvent T = T();
        if (this.d.a() && T != null && this.x.a().a()) {
            this.x.a().b().a(T.a(), 3);
        }
        return cqkl.a;
    }

    @Override // defpackage.byng
    @dzsi
    public CharSequence j() {
        MajorEvent T = T();
        if (T == null) {
            return null;
        }
        String string = this.e.getString(R.string.TRAFFIC_INCIDENT_CAUSE_LABEL);
        String f = T.f();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(f).length());
        sb.append(string);
        sb.append(" ");
        sb.append(f);
        return sb.toString();
    }

    @Override // defpackage.byng
    public Boolean k() {
        return Boolean.valueOf(!TextUtils.isEmpty(l()));
    }

    @Override // defpackage.byng
    public String l() {
        return this.F.c;
    }

    @Override // defpackage.byng
    public Boolean m() {
        return Boolean.valueOf(!TextUtils.isEmpty(n()));
    }

    @Override // defpackage.byng
    public String n() {
        return this.G.c;
    }

    @Override // defpackage.byng
    public Boolean o() {
        return Boolean.valueOf(!TextUtils.isEmpty(p()));
    }

    @Override // defpackage.byng
    public String p() {
        return this.H.c;
    }

    @Override // defpackage.byng
    @dzsi
    public cqtd q() {
        return this.j;
    }

    @Override // defpackage.byng
    public Boolean r() {
        return bynw.e(this.k);
    }

    @Override // defpackage.byng
    public Boolean s() {
        return Boolean.valueOf(!this.C);
    }

    @Override // defpackage.byng
    public cqtd t() {
        return cqrt.f(2131233175);
    }

    @Override // defpackage.byng
    public String u() {
        dpad dpadVar = this.k;
        return (dpadVar == null || TextUtils.isEmpty(dpadVar.d)) ? this.e.getString(R.string.REPORTED_VIA_WAZE_APP) : dpadVar.d;
    }

    @Override // defpackage.byng
    public bynf v() {
        return this.h;
    }

    @Override // defpackage.byng
    public cqkl w() {
        if (this.d.a()) {
            this.g.i(cjtd.a(dtyi.dj));
            S();
        }
        return cqkl.a;
    }

    @Override // defpackage.byng
    public Boolean x() {
        boolean z = false;
        if (!TextUtils.isEmpty(this.l) && !TextUtils.isEmpty(this.m)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.byng
    public Boolean y() {
        return Boolean.valueOf(this.r);
    }

    @Override // defpackage.byng
    public Boolean z() {
        boolean z = false;
        if (x().booleanValue() && !this.n) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
