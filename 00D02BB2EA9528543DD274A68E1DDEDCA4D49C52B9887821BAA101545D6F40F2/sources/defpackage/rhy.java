package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: rhy  reason: default package */
/* loaded from: classes7.dex */
public final class rhy {
    public final rik a;
    public final dnkn b;
    public final rhs c;
    public final List<rhx> d;

    public rhy(rik rikVar, dnkn dnknVar) {
        dnki dnkiVar;
        dbsg dbsgVar;
        dbsg dbsgVar2;
        this.a = rikVar;
        if (dnknVar.b == 2) {
            dnkiVar = (dnki) dnknVar.c;
        } else {
            dnkiVar = dnki.f;
        }
        if (dnkiVar != null) {
            this.c = new rhs(dnkiVar);
            rhx[] rhxVarArr = new rhx[2];
            if ((dnknVar.a & 8) != 0) {
                dnli dnliVar = dnknVar.e;
                dbsgVar = dbsg.i(dnliVar == null ? dnli.c : dnliVar);
            } else {
                dbsgVar = dbpy.a;
            }
            rhxVarArr[0] = new rhx(this, dbsgVar);
            if ((dnknVar.a & 16) != 0) {
                dnli dnliVar2 = dnknVar.f;
                dbsgVar2 = dbsg.i(dnliVar2 == null ? dnli.c : dnliVar2);
            } else {
                dbsgVar2 = dbpy.a;
            }
            rhxVarArr[1] = new rhx(this, dbsgVar2);
            this.d = Arrays.asList(rhxVarArr);
            dnkj ca = dnkn.g.ca(dnknVar);
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dnkn dnknVar2 = (dnkn) ca.b;
            if (dnknVar2.b == 2) {
                dnknVar2.b = 0;
                dnknVar2.c = null;
            }
            dnknVar2.e = null;
            int i = dnknVar2.a & (-9);
            dnknVar2.a = i;
            dnknVar2.f = null;
            dnknVar2.a = i & (-17);
            this.b = ca.bK();
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    public final String a() {
        return this.b.d;
    }

    public final rhx b(int i) {
        return this.d.get(i - 1);
    }
}
