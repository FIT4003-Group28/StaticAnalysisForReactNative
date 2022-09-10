package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bbmn  reason: default package */
/* loaded from: classes3.dex */
public abstract class bbmn {
    static final bbmn b = c(dpot.m);
    public static final /* synthetic */ int c = 0;

    public static bbmn c(dpot dpotVar) {
        return new bbmk(dpotVar, dcdc.r(dchl.k(dpotVar.h, bbml.a)));
    }

    public abstract dpot a();

    public abstract dcdc<bbmo> b();

    public final dbsg<bbmo> d(akqi akqiVar) {
        int e = e(akqiVar);
        return e == -1 ? dbpy.a : dbsg.i(b().get(e));
    }

    public final int e(final akqi akqiVar) {
        return dcft.n(a().h, new dbsl(akqiVar) { // from class: bbmm
            private final akqi a;

            {
                this.a = akqiVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                dppv dppvVar;
                akqi akqiVar2 = this.a;
                dppl dpplVar = (dppl) obj;
                int i = bbmn.c;
                if (dpplVar.b == 2) {
                    dppvVar = (dppv) dpplVar.c;
                } else {
                    dppvVar = dppv.g;
                }
                dpsn dpsnVar = dppvVar.b;
                if (dpsnVar == null) {
                    dpsnVar = dpsn.d;
                }
                return dpsnVar.c == akqiVar2.c;
            }
        });
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bbmn) {
            return a().equals(((bbmn) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a()});
    }
}
