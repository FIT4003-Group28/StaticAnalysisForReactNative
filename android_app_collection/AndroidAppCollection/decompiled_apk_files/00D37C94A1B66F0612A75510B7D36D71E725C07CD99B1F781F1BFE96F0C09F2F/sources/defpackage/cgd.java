package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cgd  reason: default package */
/* loaded from: classes2.dex */
public class cgd extends ctd implements Cloneable {
    private cgd A;
    private boolean B = true;
    private boolean C;
    private boolean D;
    private final Context s;
    private final cgg t;
    private final Class u;
    private final cfs v;
    private cgh w;
    private Object x;
    private List y;
    private cgd z;

    static {
        ctm ctmVar = (ctm) ((ctm) ((ctm) new ctm().s(ckb.b)).B(cfv.LOW)).K();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cgd(cfk cfkVar, cgg cggVar, Class cls, Context context) {
        this.t = cggVar;
        this.u = cls;
        this.s = context;
        cfs cfsVar = cggVar.a.b;
        cgh cghVar = (cgh) cfsVar.e.get(cls);
        if (cghVar == null) {
            for (Map.Entry entry : cfsVar.e.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    cghVar = (cgh) entry.getValue();
                }
            }
        }
        this.w = cghVar == null ? cfs.a : cghVar;
        this.v = cfkVar.b;
        for (ctl ctlVar : cggVar.d) {
            a(ctlVar);
        }
        l(cggVar.h());
    }

    private final cth M(Object obj, ctz ctzVar, ctl ctlVar, ctj ctjVar, cgh cghVar, cfv cfvVar, int i, int i2, ctd ctdVar, Executor executor) {
        cte cteVar;
        ctj ctjVar2;
        cth N;
        int i3;
        int i4;
        cfv cfvVar2;
        int i5;
        int i6;
        if (this.A != null) {
            ctj cteVar2 = new cte(obj, ctjVar);
            cteVar = cteVar2;
            ctjVar2 = cteVar2;
        } else {
            cteVar = null;
            ctjVar2 = ctjVar;
        }
        cgd cgdVar = this.z;
        if (cgdVar == null) {
            N = N(obj, ctzVar, ctlVar, ctdVar, ctjVar2, cghVar, cfvVar, i, i2, executor);
        } else if (!this.D) {
            cgh cghVar2 = true == cgdVar.B ? cghVar : cgdVar.w;
            if (super.E(8)) {
                cfvVar2 = this.z.c;
            } else {
                int i7 = cgc.b[cfvVar.ordinal()];
                if (i7 == 1) {
                    cfvVar2 = cfv.NORMAL;
                } else if (i7 == 2) {
                    cfvVar2 = cfv.HIGH;
                } else if (i7 == 3 || i7 == 4) {
                    cfvVar2 = cfv.IMMEDIATE;
                } else {
                    String valueOf = String.valueOf(this.c);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    sb.append("unknown priority: ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            cfv cfvVar3 = cfvVar2;
            cgd cgdVar2 = this.z;
            int i8 = cgdVar2.j;
            int i9 = cgdVar2.i;
            if (!cvd.o(i, i2) || this.z.F()) {
                i5 = i9;
                i6 = i8;
            } else {
                i6 = ctdVar.j;
                i5 = ctdVar.i;
            }
            ctp ctpVar = new ctp(obj, ctjVar2);
            cth N2 = N(obj, ctzVar, ctlVar, ctdVar, ctpVar, cghVar, cfvVar, i, i2, executor);
            this.D = true;
            cgd cgdVar3 = this.z;
            cth M = cgdVar3.M(obj, ctzVar, ctlVar, ctpVar, cghVar2, cfvVar3, i6, i5, cgdVar3, executor);
            this.D = false;
            ctpVar.a = N2;
            ctpVar.b = M;
            N = ctpVar;
        } else {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        if (cteVar == null) {
            return N;
        }
        cgd cgdVar4 = this.A;
        int i10 = cgdVar4.j;
        int i11 = cgdVar4.i;
        if (!cvd.o(i, i2) || this.A.F()) {
            i3 = i11;
            i4 = i10;
        } else {
            i4 = ctdVar.j;
            i3 = ctdVar.i;
        }
        cgd cgdVar5 = this.A;
        cth M2 = cgdVar5.M(obj, ctzVar, ctlVar, cteVar, cgdVar5.w, cgdVar5.c, i4, i3, cgdVar5, executor);
        cteVar.a = N;
        cteVar.b = M2;
        return cteVar;
    }

    private final cth N(Object obj, ctz ctzVar, ctl ctlVar, ctd ctdVar, ctj ctjVar, cgh cghVar, cfv cfvVar, int i, int i2, Executor executor) {
        Context context = this.s;
        cfs cfsVar = this.v;
        return new cto(context, cfsVar, obj, this.x, this.u, ctdVar, i, i2, cfvVar, ctzVar, ctlVar, this.y, ctjVar, cfsVar.f, cghVar.a, executor);
    }

    private final void O(ctz ctzVar, ctl ctlVar, ctd ctdVar, Executor executor) {
        hy.N(ctzVar);
        if (this.C) {
            cth M = M(new Object(), ctzVar, ctlVar, null, this.w, ctdVar.c, ctdVar.j, ctdVar.i, ctdVar, executor);
            cth c = ctzVar.c();
            if (M.m(c) && (ctdVar.h || !c.l())) {
                hy.N(c);
                if (c.n()) {
                    return;
                }
                c.b();
                return;
            }
            this.t.j(ctzVar);
            ctzVar.h(M);
            this.t.q(ctzVar, M);
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public cgd a(ctl ctlVar) {
        if (this.p) {
            return m().a(ctlVar);
        }
        if (ctlVar != null) {
            if (this.y == null) {
                this.y = new ArrayList();
            }
            this.y.add(ctlVar);
        }
        J();
        return this;
    }

    @Override // defpackage.ctd
    /* renamed from: b */
    public cgd l(ctd ctdVar) {
        hy.N(ctdVar);
        return (cgd) super.l(ctdVar);
    }

    @Override // defpackage.ctd
    /* renamed from: c */
    public cgd m() {
        cgd cgdVar = (cgd) super.clone();
        cgdVar.w = cgdVar.w.clone();
        List list = cgdVar.y;
        if (list != null) {
            cgdVar.y = new ArrayList(list);
        }
        cgd cgdVar2 = cgdVar.z;
        if (cgdVar2 != null) {
            cgdVar.z = cgdVar2.m();
        }
        cgd cgdVar3 = cgdVar.A;
        if (cgdVar3 != null) {
            cgdVar.A = cgdVar3.m();
        }
        return cgdVar;
    }

    public cgd d(ctl ctlVar) {
        if (this.p) {
            return m().d(ctlVar);
        }
        this.y = null;
        return a(ctlVar);
    }

    public cgd e(Drawable drawable) {
        return j(drawable).l(ctm.b(ckb.a));
    }

    public cgd f(Uri uri) {
        return j(uri);
    }

    public cgd g(Integer num) {
        cgd j = j(num);
        Context context = this.s;
        int i = cum.b;
        return j.l(ctm.c(new cum(context.getResources().getConfiguration().uiMode & 48, cun.a(context))));
    }

    public cgd h(Object obj) {
        return j(obj);
    }

    public cgd i(byte[] bArr) {
        cgd j = j(bArr);
        if (!super.E(4)) {
            j = j.l(ctm.b(ckb.a));
        }
        if (!super.E(256)) {
            if (ctm.s == null) {
                ctm.s = (ctm) ((ctm) new ctm().K()).q();
            }
            return j.l(ctm.s);
        }
        return j;
    }

    public final cgd j(Object obj) {
        if (this.p) {
            return m().j(obj);
        }
        this.x = obj;
        this.C = true;
        J();
        return this;
    }

    public cgd k(cgh cghVar) {
        if (this.p) {
            return m().k(cghVar);
        }
        hy.N(cghVar);
        this.w = cghVar;
        this.B = false;
        J();
        return this;
    }

    public final ctg n() {
        ctk ctkVar = new ctk();
        O(ctkVar, ctkVar, this, cux.b);
        return ctkVar;
    }

    public final void o(int i, int i2) {
        p(new ctx(this.t, i, i2));
    }

    public final void p(ctz ctzVar) {
        O(ctzVar, null, this, cux.a);
    }
}
