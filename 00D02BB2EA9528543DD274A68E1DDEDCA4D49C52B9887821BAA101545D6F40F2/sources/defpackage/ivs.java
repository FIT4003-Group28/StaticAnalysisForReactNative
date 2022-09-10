package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ivs  reason: default package */
/* loaded from: classes.dex */
public class ivs extends ivw {
    private final dxio<qbt> c;
    private final acyp d;
    private final gft e;
    @dzsi
    private final qcz f;

    public ivs(Activity activity, dxio<qbt> dxioVar, acyp acypVar, gft gftVar, @dzsi qcz qczVar, bsvm bsvmVar) {
        super(activity, ivu.FIXED, jaq.MOD_DAY_NIGHT_WHITE_ON_BLUE, cqrt.f(2131231604), activity.getString(R.string.NAVIGATION), cjtd.a(dtxv.J), true, R.id.on_map_directions_button, ivv.FULL);
        this.c = dxioVar;
        this.d = acypVar;
        this.e = gftVar;
        this.f = qczVar;
    }

    @Override // defpackage.ivw
    protected final boolean NE() {
        return false;
    }

    @Override // defpackage.ivw, defpackage.jar
    public Boolean NF() {
        return Boolean.valueOf(!this.d.d());
    }

    @Override // defpackage.ivw, defpackage.jar
    public Float NG() {
        return Float.valueOf(NF().booleanValue() ? 0.0f : super.NG().floatValue());
    }

    @Override // defpackage.jar
    public cqkl a(cjqm cjqmVar) {
        if (!this.e.bb()) {
            return cqkl.a;
        }
        if (this.f == null) {
            this.c.a().k();
        } else {
            this.c.a().m(this.f);
        }
        return cqkl.a;
    }

    @Override // defpackage.ivw, defpackage.jar
    public Boolean b() {
        return false;
    }

    @Override // defpackage.ivw, defpackage.jar
    public cqkl c() {
        return cqkl.a;
    }

    public ivs(Activity activity, dxio<qbt> dxioVar, acyp acypVar, gft gftVar, bsvm bsvmVar) {
        this(activity, dxioVar, acypVar, gftVar, null, bsvmVar);
    }
}
