package defpackage;
/* compiled from: PG */
/* renamed from: cdkv  reason: default package */
/* loaded from: classes4.dex */
public final class cdkv {
    private static final dcqe e = dcqe.c("cdkv");
    public final cdpd a;
    public final dnqh b;
    public final bbtu c;
    public final eaou d;

    public cdkv(bbtu bbtuVar, eaou eaouVar, cdpd cdpdVar, dnqh dnqhVar) {
        this.c = bbtuVar;
        this.d = eaouVar;
        this.a = cdpdVar;
        this.b = dnqhVar;
    }

    public final dhpj a() {
        dhpj b = dhpj.b(this.a.i);
        return b == null ? dhpj.UNKNOWN_CONTRIBUTION_SOURCE : b;
    }

    public final dbsg<cdph> b() {
        cdpd cdpdVar = this.a;
        if ((cdpdVar.a & 128) != 0) {
            cdph cdphVar = cdpdVar.j;
            if (cdphVar == null) {
                cdphVar = cdph.c;
            }
            return dbsg.i(cdphVar);
        }
        return dbpy.a;
    }

    public final boolean c() {
        return this.a.c;
    }

    public final dbsg<Class<? extends bqld>> d() {
        cdpd cdpdVar = this.a;
        if ((cdpdVar.a & 16) != 0) {
            String str = cdpdVar.f;
            try {
                Class<?> cls = Class.forName(str);
                if (!bqld.class.isAssignableFrom(cls)) {
                    bvoo.h("Listener fragment not implementing ReviewsFlowListenerFragment: %s", str);
                    return dbpy.a;
                }
                return dbsg.i(cls);
            } catch (ClassNotFoundException unused) {
                bvoo.h("Unrecognized listener fragment class: %s", str);
                return dbpy.a;
            }
        }
        return dbpy.a;
    }
}
