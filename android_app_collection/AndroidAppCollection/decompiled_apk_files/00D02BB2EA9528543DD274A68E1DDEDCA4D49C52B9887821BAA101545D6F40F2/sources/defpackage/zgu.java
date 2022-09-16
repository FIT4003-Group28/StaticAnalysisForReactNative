package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: zgu  reason: default package */
/* loaded from: classes7.dex */
public class zgu implements zbi {
    private final aaap a;
    private final cqtd b;
    private final CharSequence c;
    private final String d;
    private final cjtd e;

    public zgu(Activity activity, aaap aaapVar, vtn vtnVar, dozz dozzVar) {
        doys doysVar;
        doys doysVar2;
        this.a = aaapVar;
        this.b = yzx.a(dozzVar, vtnVar, vyt.h);
        alcb a = alcc.a();
        a.a = activity;
        a.b = vtnVar;
        a.d = cqrp.f(16.0d).e(activity);
        this.c = a.a().b(dozzVar.m);
        if (dozzVar.b == 29) {
            doysVar = (doys) dozzVar.c;
        } else {
            doysVar = doys.c;
        }
        this.d = doysVar.a;
        cjta b = cjtd.b();
        b.d = dtxn.aj;
        if (dozzVar.b == 29) {
            doysVar2 = (doys) dozzVar.c;
        } else {
            doysVar2 = doys.c;
        }
        b.g(doysVar2.b);
        this.e = b.a();
    }

    @Override // defpackage.zbi
    public cqtd a() {
        return this.b;
    }

    @Override // defpackage.zbi
    public CharSequence b() {
        return this.c;
    }

    @Override // defpackage.zbi
    public cqkl c() {
        aaap aaapVar = this.a;
        aaan g = aaao.g();
        aaaj aaajVar = (aaaj) g;
        aaajVar.a = this.d;
        aaajVar.b = dpuk.MAJOR_EVENT;
        aaapVar.i(g.a());
        return cqkl.a;
    }

    @Override // defpackage.zbi
    public cjtd d() {
        return this.e;
    }
}
