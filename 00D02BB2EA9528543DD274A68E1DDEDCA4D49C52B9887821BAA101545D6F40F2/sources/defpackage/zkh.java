package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: zkh  reason: default package */
/* loaded from: classes7.dex */
public class zkh extends zqo implements zch {
    private static final dcqe a = dcqe.c("zkh");
    private final Context b;
    private final qfr c;
    private final qhn d;
    private final zpu e;
    private final cwy f;
    private final zfo g;
    private final dqvj h;
    private final qib i;
    private final qhu j;
    private final dcdc<zdu> k;
    private final qfp l;
    private final zce m;
    private final boolean n;

    public zkh(Context context, cqhn cqhnVar, qfr qfrVar, bvsl bvslVar, zpu zpuVar, cwy cwyVar, dqvj dqvjVar, amve amveVar, int i, qib qibVar, zfo zfoVar, long j, @dzsi vou vouVar, @dzsi izl izlVar, final zce zceVar, final boolean z) {
        super(context, amveVar, i, zfoVar, vouVar, j, izlVar);
        this.b = context;
        this.c = qfrVar;
        this.d = new qhn(bvslVar);
        this.e = zpuVar;
        this.f = cwyVar;
        this.g = zfoVar;
        this.h = dqvjVar;
        this.i = qibVar;
        this.j = qibVar.c();
        this.k = zsa.a(amveVar, vtj.TRANSIT_AUTO);
        this.n = z;
        this.m = zceVar;
        qfp qfpVar = new qfp(this, z, zceVar) { // from class: zkg
            private final zkh a;
            private final boolean b;
            private final zce c;

            {
                this.a = this;
                this.b = z;
                this.c = zceVar;
            }

            @Override // defpackage.qfp
            public final void a() {
                zkh zkhVar = this.a;
                boolean z2 = this.b;
                zce zceVar2 = this.c;
                if (z2) {
                    zceVar2.d(3000L);
                }
                cqkx.p(zkhVar);
            }

            @Override // defpackage.qfp
            public final void b() {
            }

            @Override // defpackage.qfp
            public final void c() {
            }
        };
        this.l = qfpVar;
        qfrVar.a(qfpVar);
    }

    private final boolean u() {
        return this.j.e() == null && this.d.a(this.j.f(), this.b) == null;
    }

    @dzsi
    private final CharSequence v() {
        String e = e();
        String f = this.i.f();
        if (TextUtils.isEmpty(e) || TextUtils.isEmpty(f)) {
            if (!TextUtils.isEmpty(e)) {
                return e;
            }
            if (TextUtils.isEmpty(f)) {
                return null;
            }
            return f;
        }
        return TextUtils.concat(e, " · ", f);
    }

    @Override // defpackage.zbg
    public dcdc<zdu> a() {
        return this.k;
    }

    @Override // defpackage.zqo, defpackage.zfp
    public cjtd ab() {
        return Z(dtxn.dH);
    }

    @Override // defpackage.zbg
    public dcdc<zdu> b() {
        throw null;
    }

    @Override // defpackage.zbg
    public CharSequence c() {
        if (u()) {
            CharSequence v = v();
            return v != null ? v : "";
        }
        String e = this.j.e();
        CharSequence a2 = this.d.a(this.j.f(), this.b);
        if (e != null && a2 != null) {
            return TextUtils.concat(e, " ·", a2);
        }
        return e != null ? e : a2 != null ? a2 : "";
    }

    @Override // defpackage.zbg
    @dzsi
    public CharSequence d() {
        if (u()) {
            return null;
        }
        return v();
    }

    @Override // defpackage.zbg
    public CharSequence f() {
        return vxc.a(this.b.getResources(), this.i.e());
    }

    @Override // defpackage.zbg
    public CharSequence g() {
        return vxc.b(this.b.getResources(), this.i.e());
    }

    @Override // defpackage.zbg
    @dzsi
    public CharSequence h() {
        if (this.i.h()) {
            cwy cwyVar = this.f;
            Resources resources = this.b.getResources();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            cwyVar.b(spannableStringBuilder, resources);
            return spannableStringBuilder;
        }
        return null;
    }

    @Override // defpackage.zbg
    @dzsi
    public CharSequence i() {
        return this.i.g();
    }

    @Override // defpackage.zbg
    public Boolean j() {
        boolean z = true;
        if (h() == null && TextUtils.isEmpty(i())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zqo, defpackage.zca
    @dzsi
    public CharSequence k() {
        if (M() == zfn.DIRECTIONS_RESULT_TRIPCARD) {
            return null;
        }
        bvsi bvsiVar = new bvsi(this.b);
        bvsiVar.d(O());
        bvsiVar.c(S());
        bvsiVar.c(e());
        bvsiVar.e();
        for (zcg zcgVar : p()) {
            bvsiVar.c(zcgVar.b());
            bvsiVar.c(zcgVar.e() != null ? zcgVar.e() : zcgVar.d());
            bvsiVar.e();
        }
        bvsiVar.d(g());
        zfn M = M();
        if (M == zfn.INFO_SHEET_HEADER_COLLAPSED) {
            bvsiVar.d(this.b.getString(R.string.ACCESSIBILITY_ACTIVATE_TO_OPEN_STEP_LIST));
        } else if (M == zfn.INFO_SHEET_HEADER_EXPANDED || M == zfn.INFO_SHEET_HEADER_FULLY_EXPANDED) {
            bvsiVar.d(this.b.getString(R.string.ACCESSIBILITY_ACTIVATE_TO_CLOSE_STEP_LIST));
        }
        return bvsiVar.toString();
    }

    @Override // defpackage.zch
    public List<zcg> p() {
        amuk a2;
        zpu zpuVar = this.e;
        Context context = this.b;
        dqvj dqvjVar = this.h;
        qib qibVar = this.i;
        dccx<zcg> F = dcdc.F();
        if (dqvjVar.equals(dqvj.BICYCLE)) {
            zpuVar.a(context, F, qibVar.j());
            zpuVar.b(context, F, qibVar);
            qhs f = qibVar.c().f();
            if (f != null) {
                String i = zpuVar.a.i(f.a());
                zps f2 = zpt.f();
                f2.d(context.getDrawable(f.c()));
                zgn zgnVar = (zgn) f2;
                zgnVar.a = context.getString(R.string.BIKESHARING_X_BATTERY, String.format(Locale.getDefault(), "%d%%", Integer.valueOf(f.b())));
                zgnVar.b = true;
                f2.c(i);
                zgnVar.c = context.getString(R.string.BIKESHARING_BATTERY_DISTANCE_RANGE, i);
                F.g(f2.a());
            }
        } else {
            if (dqvjVar.equals(dqvj.WALK)) {
                zpuVar.a(context, F, qibVar.j());
                zpuVar.b(context, F, qibVar);
                a2 = qibVar.a();
            } else {
                zpuVar.b(context, F, qibVar);
                a2 = qibVar.a();
            }
            zpuVar.c(F, a2);
        }
        return F.f();
    }

    @Override // defpackage.zch
    public Boolean q() {
        vnk vnkVar = this.c.d;
        boolean z = false;
        if (vnkVar != null) {
            vnu l = vnkVar.l();
            if ((l.a().equals(dqvj.BICYCLE) || l.a().equals(dqvj.WALK)) && l.d().a()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zch
    public Boolean r() {
        return Boolean.valueOf(this.n);
    }

    @Override // defpackage.zch
    public zce s() {
        return this.m;
    }

    @Override // defpackage.zbg
    /* renamed from: t */
    public String e() {
        String d = this.g.d();
        if (d != null) {
            return d;
        }
        bvoo.h("failed to format distance text", new Object[0]);
        return "";
    }
}
