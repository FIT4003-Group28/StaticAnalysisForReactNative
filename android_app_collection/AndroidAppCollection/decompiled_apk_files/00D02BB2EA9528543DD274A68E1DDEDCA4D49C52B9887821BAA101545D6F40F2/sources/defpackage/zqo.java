package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zqo  reason: default package */
/* loaded from: classes7.dex */
public class zqo implements zfp {
    @dzsi
    private final vou a;
    private final zqn b;
    @dzsi
    private final String c;
    @dzsi
    private final String d;
    @dzsi
    private final cjtd e;
    private final boolean f;
    private final int g;
    private final long h;
    private final String i;
    @dzsi
    private final izl j;
    private zfn k;
    private boolean l;
    protected final int o;

    public zqo(Context context, amve amveVar, int i, zfo zfoVar, @dzsi vou vouVar, long j) {
        this(context, amveVar, i, zfoVar, vouVar, j, null);
    }

    @Override // defpackage.zfp
    public zfn M() {
        return this.k;
    }

    @Override // defpackage.zfp
    @dzsi
    public dqvj N() {
        return ((zgp) this.b).a;
    }

    @Override // defpackage.zfp
    @dzsi
    public String O() {
        return ((zgp) this.b).b;
    }

    public void OU(zfn zfnVar) {
        this.k = zfnVar;
    }

    @Override // defpackage.zfp
    @dzsi
    public cqtd P() {
        return ((zgp) this.b).c;
    }

    @Override // defpackage.zfp
    @dzsi
    public String Q() {
        return this.i;
    }

    @Override // defpackage.zfp
    @dzsi
    public String R() {
        return this.c;
    }

    @Override // defpackage.zfp
    @dzsi
    public String S() {
        return this.d;
    }

    @Override // defpackage.zfp
    public cqkl T() {
        vou vouVar = this.a;
        if (vouVar != null) {
            vouVar.c(this.o, false);
        }
        return cqkl.a;
    }

    @Override // defpackage.zfp
    public Boolean U() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.zfp
    public Integer V() {
        return Integer.valueOf(this.g);
    }

    @Override // defpackage.zfp
    public Boolean W() {
        return Boolean.valueOf(this.h > 0);
    }

    @Override // defpackage.zfp
    public Boolean X() {
        return Boolean.valueOf(this.l);
    }

    @Override // defpackage.zfp
    public cqkl Y() {
        vou vouVar = this.a;
        if (vouVar != null) {
            ddho ddhoVar = dtyb.e;
            cjsb cjsbVar = new cjsb();
            dnqg dnqgVar = cjsbVar.a;
            if (dnqgVar.c) {
                dnqgVar.bF();
                dnqgVar.c = false;
            }
            dnqh dnqhVar = (dnqh) dnqgVar.b;
            dnqh dnqhVar2 = dnqh.p;
            dnqhVar.a |= 2048;
            dnqhVar.j = false;
            cjsbVar.i(ddhoVar);
            vouVar.b(cjsbVar.a());
        }
        return cqkl.a;
    }

    @Override // defpackage.zfp
    public cjtd Z(@dzsi ddho ddhoVar) {
        cjta c = cjtd.c(this.e);
        c.i(this.o);
        c.d = ddhoVar;
        return c.a();
    }

    @Override // defpackage.zfp
    @dzsi
    public izl aa() {
        return this.j;
    }

    @Override // defpackage.zfp
    public cjtd ab() {
        return Z(dtxn.dS);
    }

    public cqkl af() {
        vou vouVar = this.a;
        if (vouVar != null) {
            vouVar.c(this.o, true);
        }
        return cqkl.a;
    }

    public void ag(boolean z) {
        this.l = true;
    }

    @Override // defpackage.zca
    @dzsi
    public CharSequence k() {
        return null;
    }

    @Override // defpackage.zca
    public boolean l() {
        return false;
    }

    @Override // defpackage.zca
    public void m(Context context) {
        cqkx.p(this);
    }

    @Override // defpackage.zca
    public boolean n() {
        return false;
    }

    @Override // defpackage.zca
    public boolean o() {
        return false;
    }

    public zqo(Context context, amve amveVar, int i, zfo zfoVar, @dzsi vou vouVar, long j, @dzsi izl izlVar) {
        dbsk.s(amveVar);
        this.o = i;
        this.a = vouVar;
        this.j = izlVar;
        this.b = zqn.d(context, vyb.b(amveVar));
        String F = vyb.F(context, j);
        this.i = F == null ? "" : context.getResources().getString(R.string.SAVE_THIS_ROUTE_SAVED, F);
        this.c = zfoVar.a();
        this.d = zfoVar.b();
        this.e = vyb.t(amveVar);
        this.f = amveVar.b().i;
        this.g = cqir.a();
        this.h = j;
        this.k = zfn.CARDUI_DIRECTIONS_SUMMARY_COMPACT;
        this.l = false;
    }
}
