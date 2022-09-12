package defpackage;

import java.util.Iterator;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: ebq  reason: default package */
/* loaded from: classes6.dex */
public final class ebq implements ebj {
    private final dkfr a;
    private final dkfr b;
    private final dkgj c;

    public ebq(dkgl dkglVar, dkfr dkfrVar, dkfr dkfrVar2) {
        dkgj dkgjVar;
        this.a = dkfrVar;
        this.b = dkfrVar2;
        dspd dspdVar = dkfrVar.a;
        Iterator<dkgj> it = dkglVar.b.iterator();
        while (true) {
            if (it.hasNext()) {
                dkgjVar = it.next();
                if (dspdVar.equals(dkgjVar.a)) {
                    break;
                }
            } else {
                dkgjVar = dkgj.d;
                break;
            }
        }
        this.c = dkgjVar;
    }

    private final dkfr i() {
        return dkfr.d.equals(this.b) ? this.a : this.b;
    }

    @Override // defpackage.ebj
    public jic a() {
        dkgn dkgnVar = this.a.c;
        if (dkgnVar == null) {
            dkgnVar = dkgn.h;
        }
        return new jic(dkgnVar.d, ckqc.FIFE_MERGE, (cqtd) null, 80);
    }

    @Override // defpackage.ebj
    public String b() {
        dkgn dkgnVar = i().c;
        if (dkgnVar == null) {
            dkgnVar = dkgn.h;
        }
        return dkgnVar.b;
    }

    @Override // defpackage.ebj
    public String c() {
        dkgn dkgnVar = i().c;
        if (dkgnVar == null) {
            dkgnVar = dkgn.h;
        }
        return dkgnVar.c;
    }

    @Override // defpackage.ebj
    public String d() {
        return String.format(Locale.getDefault(), "%d", Long.valueOf(this.c.b));
    }

    @Override // defpackage.ebj
    public String e() {
        return String.format(Locale.getDefault(), "%d", Long.valueOf(i().b));
    }

    @Override // defpackage.ebj
    public Float f() {
        return Float.valueOf(this.c.c);
    }

    @Override // defpackage.ebj
    public cqss g() {
        dkgn dkgnVar = this.a.c;
        if (dkgnVar == null) {
            dkgnVar = dkgn.h;
        }
        return cqta.e(dkgnVar.g);
    }

    @Override // defpackage.ebj
    public cqss h() {
        if (f().floatValue() < 1.0f) {
            return irg.b();
        }
        return g();
    }
}
