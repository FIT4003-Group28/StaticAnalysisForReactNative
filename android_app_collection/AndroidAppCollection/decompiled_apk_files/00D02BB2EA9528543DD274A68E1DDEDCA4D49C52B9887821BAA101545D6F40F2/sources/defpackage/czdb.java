package defpackage;
/* compiled from: PG */
/* renamed from: czdb  reason: default package */
/* loaded from: classes5.dex */
public class czdb {
    private final cyxd a;
    private final czda b;

    /* JADX INFO: Access modifiers changed from: protected */
    public czdb(cyxd cyxdVar, czda czdaVar) {
        this.a = cyxdVar;
        this.b = czdaVar;
    }

    public static final dcdc<dudl> c(String str) {
        return dcdc.f(dudm.d(str));
    }

    public static final dcdc<dudl> d(String str, boolean z) {
        return z ? c(str) : dudm.b(str);
    }

    public final dcfc<dudl> a(String str) {
        Iterable f;
        if (dbsj.d(str)) {
            return dcms.a;
        }
        cyxd cyxdVar = this.a;
        if (dbsj.d(str)) {
            f = dcmr.a;
        } else {
            dcen O = dcep.O(6);
            O.b(str);
            cyuj cyujVar = (cyuj) cyxdVar;
            String b = cyujVar.b(str);
            if (!b.isEmpty()) {
                O.b(b);
            }
            String a = cyujVar.a(str);
            if (!a.isEmpty()) {
                O.b(a);
            }
            String a2 = cyujVar.a(b);
            if (!a2.isEmpty()) {
                O.b(a2);
            }
            String c = cyuj.c(str);
            if (!c.isEmpty()) {
                O.b(c);
            }
            String a3 = cyujVar.a(c);
            if (!a3.isEmpty()) {
                O.b(a3);
            }
            f = O.f();
        }
        dcfa T = dcfc.T(dudl.b);
        dcpd it = f.iterator();
        while (it.hasNext()) {
            T.m(dudm.e((String) it.next()));
        }
        return T.f();
    }

    public final boolean b(dudl dudlVar, dudl dudlVar2, boolean z) {
        if (dudlVar.c.equals(dudlVar2.c)) {
            return true;
        }
        boolean b = this.b.b(dudlVar.c, dudlVar2.c);
        return z ? b && this.b.b(dudlVar2.c, dudlVar.c) : b;
    }
}
