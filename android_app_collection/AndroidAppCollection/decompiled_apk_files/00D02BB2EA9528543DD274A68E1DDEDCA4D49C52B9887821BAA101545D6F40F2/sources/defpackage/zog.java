package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zog  reason: default package */
/* loaded from: classes7.dex */
public class zog implements zdm {
    private static final dcqe a = dcqe.c("zog");
    private final gga b;
    @dzsi
    private final wtr c;
    private final zfo d;
    private final wuv e;

    public zog(gga ggaVar, @dzsi wtr wtrVar, zfo zfoVar, wuv wuvVar) {
        this.b = ggaVar;
        this.c = wtrVar;
        this.e = wuvVar;
        this.d = zfoVar;
    }

    @Override // defpackage.zdm
    public CharSequence a() {
        String a2 = this.e.a();
        if (TextUtils.isEmpty(a2)) {
            bvoo.h("rickshaw trip was missing a text summary", new Object[0]);
        }
        return a2;
    }

    @Override // defpackage.zdm
    public CharSequence b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String a2 = this.d.a();
        if (!TextUtils.isEmpty(a2)) {
            bvsv a3 = new bvsx(this.b.getResources()).a(a2);
            a3.m(vyb.Y(this.e.t(), iva.a().booleanValue()));
            spannableStringBuilder.append((CharSequence) a3.c());
        }
        String d = this.d.d();
        if (!TextUtils.isEmpty(d)) {
            if (!TextUtils.isEmpty(a2)) {
                spannableStringBuilder.append((CharSequence) " (").append((CharSequence) d).append((CharSequence) ")");
            } else {
                spannableStringBuilder.append((CharSequence) d);
            }
        }
        String e = dbsj.e(vyb.j(this.b, this.e.t()));
        if (!TextUtils.isEmpty(e)) {
            if (!TextUtils.isEmpty(a2) || !TextUtils.isEmpty(d)) {
                spannableStringBuilder.append((CharSequence) " · ");
            }
            spannableStringBuilder.append((CharSequence) e);
        }
        return spannableStringBuilder;
    }

    @Override // defpackage.zdm
    @dzsi
    public CharSequence c() {
        return dbsj.f(this.e.n());
    }

    @Override // defpackage.zdm
    public CharSequence d() {
        return dbsj.e(this.e.y(this.b.getResources()));
    }

    @Override // defpackage.zdm
    public CharSequence e() {
        CharSequence z = this.e.z(this.b.getResources());
        return f().booleanValue() ? this.b.getString(R.string.ACCESSIBILITY_TAXI_RICKSHAW_FARE_BREAKDOWN_DESCRIPTION, new Object[]{z}) : z;
    }

    @Override // defpackage.zdm
    public Boolean f() {
        return Boolean.valueOf(this.e.l() != null);
    }

    @Override // defpackage.zdm
    public cqkl g() {
        drgz l = this.e.l();
        if (!this.b.g().J() && l != null) {
            wtw.a(l, dbsj.f(this.e.n())).aJ(this.b);
        }
        return cqkl.a;
    }

    @Override // defpackage.zdm
    public cqkl h() {
        wtr wtrVar = this.c;
        if (wtrVar != null) {
            wtrVar.b();
        }
        return cqkl.a;
    }

    @Override // defpackage.zdm
    public cjtd i() {
        cjta d;
        if (this.e.d() == null) {
            d = cjtd.b();
        } else {
            d = this.e.d();
        }
        dbsk.s(d);
        d.d = dtxn.dz;
        return d.a();
    }

    @Override // defpackage.zdm
    public Boolean j() {
        wtr wtrVar = this.c;
        boolean z = false;
        if (wtrVar != null && wtrVar.a()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zdm
    public CharSequence k() {
        return this.b.getString(true != j().booleanValue() ? R.string.NAVIGATION_FAB_LABEL_PREVIEW : R.string.DIRECTIONS_TAXI_NAVIGATION);
    }
}
