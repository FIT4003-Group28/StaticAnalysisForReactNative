package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: zmb  reason: default package */
/* loaded from: classes7.dex */
public class zmb extends zqo implements zct {
    private final boolean A;
    @dzsi
    private final String B;
    @dzsi
    private final zbi C;
    private final Boolean D;
    private final Boolean E;
    private final Boolean F;
    private final List<zfk> G;
    private final vtk H;
    private final vtk I;
    public final cqss a;
    @dzsi
    public String b;
    @dzsi
    public cqtd c;
    @dzsi
    public cqtd d;
    private final Context e;
    @dzsi
    private final String f;
    @dzsi
    private final String g;
    private final CharSequence h;
    private final CharSequence i;
    private final Boolean j;
    @dzsi
    private final String k;
    @dzsi
    private final String l;
    @dzsi
    private final String m;
    @dzsi
    private final String n;
    @dzsi
    private final String p;
    private final List<zcs> q;
    @dzsi
    private final String r;
    @dzsi
    private final String s;
    @dzsi
    private final zcy t;
    @dzsi
    private final String u;
    @dzsi
    private final cjtd v;
    @dzsi
    private final cjtd w;
    private final zfg x;
    private final boolean y;
    private final boolean z;

    /* JADX WARN: Removed duplicated region for block: B:112:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zmb(defpackage.btvo r17, defpackage.vtn r18, defpackage.cqat r19, defpackage.wgh r20, defpackage.zgv r21, defpackage.zqg r22, android.content.Context r23, defpackage.amve r24, int r25, defpackage.amvh r26, defpackage.zfo r27, defpackage.zfg r28, boolean r29, @defpackage.dzsi defpackage.vou r30, long r31, @defpackage.dzsi defpackage.izl r33, @defpackage.dzsi defpackage.dosz r34, boolean r35, @defpackage.dzsi defpackage.amub r36, defpackage.cqhn r37) {
        /*
            Method dump skipped, instructions count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zmb.<init>(btvo, vtn, cqat, wgh, zgv, zqg, android.content.Context, amve, int, amvh, zfo, zfg, boolean, vou, long, izl, dosz, boolean, amub, cqhn):void");
    }

    private static Boolean ah(amve amveVar) {
        return Boolean.valueOf(amveVar.f().c);
    }

    private static Boolean ai(amve amveVar) {
        return Boolean.valueOf(amveVar.c);
    }

    private static CharSequence aj(Context context, vtn vtnVar, amve amveVar, boolean z, boolean z2) {
        dozz q = amveVar.q();
        dozy b = dozy.b(q.f);
        if (b == null) {
            b = dozy.UNKNOWN;
        }
        CharSequence charSequence = "";
        if (b == dozy.CRISIS) {
            return charSequence;
        }
        alcb a = alcc.a();
        a.a = context;
        a.b = vtnVar;
        a.d = cqrp.d(14.0d).e(context);
        alcc a2 = a.a();
        if (ah(amveVar).booleanValue()) {
            if (z) {
                charSequence = a2.b(q.n);
            }
            return charSequence.length() == 0 ? a2.b(q.m) : charSequence;
        } else if (!ai(amveVar).booleanValue()) {
            return charSequence;
        } else {
            return context.getString(z2 ? R.string.LOADING_TRAFFIC_DATA : R.string.NO_TRAFFIC_DATA);
        }
    }

    private static cqss ak(amve amveVar, boolean z) {
        return cqrt.c(vyb.Y(vyb.e(amveVar), z));
    }

    @Override // defpackage.zct
    public dntm A() {
        zcy zcyVar = this.t;
        return zcyVar != null ? zcyVar.a() : dntm.UNKNOWN_PARKING_DIFFICULTY;
    }

    @Override // defpackage.zct
    @dzsi
    public String B() {
        if (ad().booleanValue()) {
            zcy zcyVar = this.t;
            dbsk.s(zcyVar);
            return zcyVar.b();
        }
        return null;
    }

    @Override // defpackage.zct
    @dzsi
    public cjtd C() {
        return this.v;
    }

    @Override // defpackage.zct
    @dzsi
    public cjtd D() {
        return this.w;
    }

    @Override // defpackage.zct
    public Boolean E() {
        return this.F;
    }

    @Override // defpackage.zct
    public Boolean F() {
        return this.E;
    }

    @Override // defpackage.zct
    public zfg G() {
        return this.x;
    }

    @Override // defpackage.zct
    public Boolean H() {
        return Boolean.valueOf(this.y);
    }

    @Override // defpackage.zct
    public Boolean I() {
        return Boolean.valueOf(this.z);
    }

    @Override // defpackage.zct
    @dzsi
    public zbi J() {
        return this.C;
    }

    @Override // defpackage.zct
    public List<zfk> K() {
        return this.G;
    }

    @Override // defpackage.zct
    public Boolean L() {
        return Boolean.valueOf(!this.G.isEmpty());
    }

    @Override // defpackage.zqo, defpackage.zfp
    @dzsi
    public String R() {
        if (this.A) {
            if (!dbsj.d(this.B)) {
                return this.e.getString(R.string.TBP_TIME_FORMAT_STRING, this.B);
            }
            String R = super.R();
            if (R == null) {
                return null;
            }
            return this.e.getString(R.string.TBP_TIME_FORMAT_STRING, R);
        }
        return super.R();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ac(bvsi bvsiVar) {
        bvsiVar.d(O());
        if (this.A) {
            bvsiVar.d(R());
            if (e().booleanValue()) {
                bvsiVar.d(d());
            }
        } else {
            bvsiVar.d(S());
        }
        bvsiVar.d(this.n);
        bvsiVar.d(p());
        bvsiVar.d(this.k);
        if (F().booleanValue()) {
            bvsiVar.d(this.x.e());
        }
        bvsiVar.d(h());
        bvsiVar.d(this.p);
        bvsiVar.d(w());
        bvsiVar.d(this.u);
    }

    public Boolean ad() {
        zcy zcyVar;
        boolean z = false;
        if (this.q.isEmpty() && (zcyVar = this.t) != null && !dbsj.d(zcyVar.b())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zqo, defpackage.zca
    @dzsi
    /* renamed from: ae */
    public String k() {
        if (this.b == null) {
            bvsi bvsiVar = new bvsi(this.e);
            ac(bvsiVar);
            this.b = bvsiVar.toString();
        }
        return this.b;
    }

    @Override // defpackage.zct
    @dzsi
    public String b() {
        return this.f;
    }

    @Override // defpackage.zct
    public Boolean c() {
        return Boolean.valueOf(!TextUtils.isEmpty(this.f));
    }

    @Override // defpackage.zct
    @dzsi
    public String d() {
        return this.g;
    }

    @Override // defpackage.zct
    public Boolean e() {
        return Boolean.valueOf(!TextUtils.isEmpty(this.g));
    }

    @Override // defpackage.zct
    public cqss f() {
        return this.a;
    }

    @Override // defpackage.zct
    public Boolean g() {
        return this.j;
    }

    @Override // defpackage.zct
    public CharSequence h() {
        return this.h;
    }

    @Override // defpackage.zct
    public CharSequence i() {
        return this.i;
    }

    @Override // defpackage.zct
    public Boolean j() {
        return Boolean.valueOf(this.h.length() > 0);
    }

    @Override // defpackage.zqo, defpackage.zca
    public boolean l() {
        return false;
    }

    @Override // defpackage.zct
    @dzsi
    public String p() {
        return this.l;
    }

    @Override // defpackage.zct
    @dzsi
    public String q() {
        return this.m;
    }

    @Override // defpackage.zct
    public Boolean r() {
        return this.D;
    }

    @Override // defpackage.zct
    public Boolean s() {
        return Boolean.valueOf(!this.q.isEmpty());
    }

    @Override // defpackage.zct
    public List<zcs> t() {
        return this.q;
    }

    @Override // defpackage.zct
    public Boolean u() {
        return Boolean.valueOf(v() != null);
    }

    @Override // defpackage.zct
    @dzsi
    public cqtd v() {
        return this.d;
    }

    @Override // defpackage.zct
    @dzsi
    public String w() {
        return this.r;
    }

    @Override // defpackage.zct
    @dzsi
    public cqtd x() {
        return this.c;
    }

    @Override // defpackage.zct
    @dzsi
    public String y() {
        return this.s;
    }

    @Override // defpackage.zct
    public Boolean z() {
        return Boolean.valueOf(this.t != null);
    }
}
