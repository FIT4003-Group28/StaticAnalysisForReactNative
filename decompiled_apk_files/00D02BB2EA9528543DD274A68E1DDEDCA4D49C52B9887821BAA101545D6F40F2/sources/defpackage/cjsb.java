package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: cjsb  reason: default package */
/* loaded from: classes.dex */
public final class cjsb {
    public final dnqg a;

    public cjsb() {
        this.a = dnqh.p.bZ();
    }

    public static dnqh b(ddho ddhoVar) {
        cjsb cjsbVar = new cjsb();
        cjsbVar.i(ddhoVar);
        return cjsbVar.a();
    }

    public static dnqh c(ddda dddaVar) {
        cjsb cjsbVar = new cjsb();
        cjsbVar.i(dddaVar);
        return cjsbVar.a();
    }

    public final dnqh a() {
        return this.a.bK();
    }

    public final void d() {
        dnqg dnqgVar = this.a;
        if (dnqgVar.c) {
            dnqgVar.bF();
            dnqgVar.c = false;
        }
        dnqh.b((dnqh) dnqgVar.b);
    }

    public final void e(@dzsi String str) {
        if (str != null) {
            dnqg dnqgVar = this.a;
            if (dnqgVar.c) {
                dnqgVar.bF();
                dnqgVar.c = false;
            }
            dnqh dnqhVar = (dnqh) dnqgVar.b;
            dnqh dnqhVar2 = dnqh.p;
            str.getClass();
            dnqhVar.a |= 4;
            dnqhVar.d = str;
        }
    }

    public final void f(@dzsi String str) {
        if (str != null) {
            dnqg dnqgVar = this.a;
            if (dnqgVar.c) {
                dnqgVar.bF();
                dnqgVar.c = false;
            }
            dnqh dnqhVar = (dnqh) dnqgVar.b;
            dnqh dnqhVar2 = dnqh.p;
            str.getClass();
            dnqhVar.a |= 2;
            dnqhVar.c = str;
        }
    }

    public final void g(ddgg ddggVar) {
        if (ddggVar != null) {
            dnqg dnqgVar = this.a;
            if (dnqgVar.c) {
                dnqgVar.bF();
                dnqgVar.c = false;
            }
            dnqh dnqhVar = (dnqh) dnqgVar.b;
            dnqh dnqhVar2 = dnqh.p;
            ddggVar.getClass();
            dnqhVar.k = ddggVar;
            dnqhVar.a |= 32768;
        }
    }

    public final void h(int i) {
        dnqg dnqgVar = this.a;
        if (dnqgVar.c) {
            dnqgVar.bF();
            dnqgVar.c = false;
        }
        dnqh dnqhVar = (dnqh) dnqgVar.b;
        dnqh dnqhVar2 = dnqh.p;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
    }

    public final void i(@dzsi ddhp ddhpVar) {
        if (ddhpVar != null) {
            dnqg dnqgVar = this.a;
            ddxw bZ = ddxx.j.bZ();
            int b = ddhpVar.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddxx ddxxVar = (ddxx) bZ.b;
            ddxxVar.a |= 8;
            ddxxVar.d = b;
            if (dnqgVar.c) {
                dnqgVar.bF();
                dnqgVar.c = false;
            }
            dnqh dnqhVar = (dnqh) dnqgVar.b;
            ddxx bK = bZ.bK();
            dnqh dnqhVar2 = dnqh.p;
            bK.getClass();
            dnqhVar.f = bK;
            dnqhVar.a |= 16;
        }
    }

    public final void j(@dzsi String str) {
        if (str != null) {
            dnqg dnqgVar = this.a;
            if (dnqgVar.c) {
                dnqgVar.bF();
                dnqgVar.c = false;
            }
            dnqh dnqhVar = (dnqh) dnqgVar.b;
            dnqh dnqhVar2 = dnqh.p;
            str.getClass();
            dnqhVar.a |= 8;
            dnqhVar.e = str;
        }
    }

    public cjsb(@dzsi dnqh dnqhVar) {
        if (dnqhVar == null) {
            this.a = dnqh.p.bZ();
        } else {
            this.a = dnqh.p.ca(dnqhVar);
        }
    }
}
