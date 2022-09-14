package defpackage;

import java.util.UUID;
/* compiled from: PG */
/* renamed from: cbcu  reason: default package */
/* loaded from: classes4.dex */
public final class cbcu {
    public static djjj a(djjd djjdVar, djjg djjgVar) {
        djjb bZ = djjj.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djjj djjjVar = (djjj) bZ.b;
        djjjVar.b = djjdVar.k;
        int i = djjjVar.a | 1;
        djjjVar.a = i;
        djjgVar.getClass();
        djjjVar.d = djjgVar;
        djjjVar.a = i | 4;
        return bZ.bK();
    }

    public static djjj b(djjd djjdVar, djjg djjgVar, djjg djjgVar2) {
        djjb bZ = djjj.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djjj djjjVar = (djjj) bZ.b;
        djjjVar.b = djjdVar.k;
        int i = djjjVar.a | 1;
        djjjVar.a = i;
        djjgVar.getClass();
        djjjVar.c = djjgVar;
        int i2 = i | 2;
        djjjVar.a = i2;
        djjgVar2.getClass();
        djjjVar.d = djjgVar2;
        djjjVar.a = i2 | 4;
        return bZ.bK();
    }

    public static djjj c(djjd djjdVar, djjg djjgVar) {
        djjb bZ = djjj.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djjj djjjVar = (djjj) bZ.b;
        djjjVar.b = djjdVar.k;
        int i = djjjVar.a | 1;
        djjjVar.a = i;
        djjgVar.getClass();
        djjjVar.c = djjgVar;
        djjjVar.a = i | 2;
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final djjg d(dprz dprzVar) {
        djje bZ = djjg.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djjg djjgVar = (djjg) bZ.b;
        djjgVar.b = Integer.valueOf(dprzVar.au);
        djjgVar.a = 8;
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final djjg e(dpvi dpviVar) {
        djje bZ = djjg.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djjg djjgVar = (djjg) bZ.b;
        dpviVar.getClass();
        djjgVar.b = dpviVar;
        djjgVar.a = 2;
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final djjg f(dpum dpumVar) {
        djje bZ = djjg.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djjg djjgVar = (djjg) bZ.b;
        dpumVar.getClass();
        djjgVar.b = dpumVar;
        djjgVar.a = 4;
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final djjg g(dpsd dpsdVar) {
        djje bZ = djjg.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djjg djjgVar = (djjg) bZ.b;
        dpsdVar.getClass();
        djjgVar.b = dpsdVar;
        djjgVar.a = 7;
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final djjg h(String str) {
        djje bZ = djjg.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djjg djjgVar = (djjg) bZ.b;
        str.getClass();
        djjgVar.a = 1;
        djjgVar.b = str;
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final djjg i(djji djjiVar) {
        djje bZ = djjg.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djjg djjgVar = (djjg) bZ.b;
        djjiVar.getClass();
        djjgVar.b = djjiVar;
        djjgVar.a = 3;
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void j(dprz dprzVar, dijl dijlVar) {
        dijlVar.a(a(djjd.EXPERIENCE_CATEGORY, d(dprzVar)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void k(String str, dijl dijlVar) {
        dijlVar.a(a(djjd.DESCRIPTION, h(str)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void l(dpvi dpviVar, dijl dijlVar) {
        dijlVar.a(a(djjd.END_DATETIME, e(dpviVar)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void m(dpsd dpsdVar, dijl dijlVar) {
        dijlVar.a(a(djjd.OCCURRENCE_PATTERN, g(dpsdVar)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void n(String str, dijl dijlVar) {
        dijlVar.a(a(djjd.WEBSITE, h(str)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final dijr o(int i, dijl dijlVar) {
        dijo bZ = dijr.e.bZ();
        dijn bK = dijlVar.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dijr dijrVar = (dijr) bZ.b;
        bK.getClass();
        dijrVar.c = bK;
        dijrVar.a |= 2;
        String uuid = UUID.randomUUID().toString();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dijr dijrVar2 = (dijr) bZ.b;
        uuid.getClass();
        int i2 = dijrVar2.a | 4;
        dijrVar2.a = i2;
        dijrVar2.d = uuid;
        dijrVar2.b = i - 1;
        dijrVar2.a = i2 | 1;
        return bZ.bK();
    }
}
