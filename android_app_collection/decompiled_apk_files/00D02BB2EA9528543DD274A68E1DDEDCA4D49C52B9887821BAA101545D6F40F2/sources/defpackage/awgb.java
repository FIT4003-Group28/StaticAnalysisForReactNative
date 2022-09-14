package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: awgb  reason: default package */
/* loaded from: classes3.dex */
public class awgb implements awgh {
    private final Activity a;
    private final cqkf<awgh> c;
    private dcdc<awgq> d = dcdc.e();
    private int e = 0;
    private final cjkp b = cjkr.B();

    public awgb(Activity activity, cqhn cqhnVar, cqkj cqkjVar) {
        this.a = activity;
        this.c = cqkjVar.e(new awgg());
    }

    @Override // defpackage.awgh
    public List<awgq> a() {
        return this.d;
    }

    public void b(dcdc<awgq> dcdcVar, int i) {
        this.d = dcdcVar;
        this.e = i;
        h(i);
    }

    public awgb c(CharSequence charSequence, View.OnClickListener onClickListener, @dzsi cjtd cjtdVar) {
        this.b.z(charSequence, onClickListener, null);
        return this;
    }

    public awgb d(CharSequence charSequence, View.OnClickListener onClickListener, @dzsi cjtd cjtdVar) {
        this.b.y(charSequence, onClickListener, null);
        return this;
    }

    public awgb e(String str) {
        this.b.t(str);
        return this;
    }

    public awgb f(CharSequence charSequence) {
        ((cjke) this.b).e = charSequence;
        return this;
    }

    public void g(int i) {
        h(i);
        cqkx.p(this);
    }

    public void h(int i) {
        dcdc<awgq> dcdcVar = this.d;
        int size = dcdcVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            awgq awgqVar = dcdcVar.get(i2);
            awgqVar.e(Boolean.valueOf(awgqVar.h().intValue() == i));
        }
    }

    public int i() {
        dcdc<awgq> dcdcVar = this.d;
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            awgq awgqVar = dcdcVar.get(i);
            i++;
            if (awgqVar.d().booleanValue()) {
                return awgqVar.h().intValue();
            }
        }
        return 0;
    }

    public int j() {
        return this.e;
    }

    public boolean k() {
        return this.e != i();
    }

    public View l() {
        return this.c.c();
    }

    public void m() {
        ((cjke) this.b).f = cqgr.fT(this.c.j(), this);
        this.b.u(this.a).u();
    }
}
