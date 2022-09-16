package defpackage;

import android.content.res.Resources;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: aszw  reason: default package */
/* loaded from: classes2.dex */
public class aszw implements Serializable, aszu {
    private final transient aszv a;
    private final transient Resources b;
    private amvh c;
    private transient CharSequence d;
    private transient CharSequence e;
    private transient CharSequence f;
    private transient cqss g;
    private transient cqtd h;
    private transient cjtd i;
    private int j;
    private boolean k;

    public aszw(aszv aszvVar, Resources resources, crqg crqgVar, int i, boolean z) {
        this.a = aszvVar;
        this.b = resources;
        this.j = i;
        this.k = z;
        i(crqgVar);
    }

    @Override // defpackage.aszu
    public cqtd a() {
        return this.h;
    }

    @Override // defpackage.aszu
    public CharSequence b() {
        return this.d;
    }

    @Override // defpackage.aszu
    public CharSequence c() {
        return this.e;
    }

    @Override // defpackage.aszu
    public CharSequence d() {
        return this.f;
    }

    @Override // defpackage.aszu
    public cqss e() {
        return this.g;
    }

    @Override // defpackage.aszu
    public Boolean f() {
        return Boolean.valueOf(this.k);
    }

    @Override // defpackage.aszu
    public cqkl g() {
        this.a.a(this.c);
        return cqkl.a;
    }

    @Override // defpackage.aszu
    public cjtd h() {
        return this.i;
    }

    public void i(crqg crqgVar) {
        cray crayVar = crqgVar.b;
        amvh amvhVar = crqgVar.a;
        this.c = amvhVar;
        this.d = amvhVar.s(this.b);
        this.e = bvtb.e(this.b, crayVar.a(), bvsz.ABBREVIATED).toString();
        this.g = yyq.a(crayVar.f());
        bvsi bvsiVar = new bvsi(this.b);
        bvsiVar.d(this.c.p());
        bvsiVar.d(bvtb.e(this.b, crayVar.a(), bvsz.EXTENDED));
        this.f = bvsiVar.toString();
        cjta b = cjtd.b();
        b.b = crayVar.a.f();
        b.g(crayVar.a.g());
        b.d = dtxp.aF;
        b.i(this.j);
        this.i = b.a();
        dpjs dpjsVar = dpjs.ENTITY_TYPE_MY_LOCATION;
        int ordinal = this.c.b.ordinal();
        if (ordinal == 1) {
            this.h = cqrt.f(2131232715);
        } else if (ordinal == 2) {
            this.h = cqrt.f(2131232990);
        } else {
            this.h = cqrt.f(2131232846);
        }
    }

    public void j(int i) {
        if (this.j == i) {
            return;
        }
        this.j = i;
        cjta c = cjtd.c(this.i);
        c.i(i);
        this.i = c.a();
    }

    public void k(boolean z) {
        this.k = z;
    }
}
