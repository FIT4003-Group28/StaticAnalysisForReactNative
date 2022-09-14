package defpackage;
/* compiled from: PG */
/* renamed from: bbmp  reason: default package */
/* loaded from: classes3.dex */
public final class bbmp extends bbmo {
    public final dppl a;

    public bbmp(dppl dpplVar) {
        dzvx.c(dpplVar, "proto");
        this.a = dpplVar;
    }

    @Override // defpackage.bbmo
    public final dppl a() {
        return this.a;
    }

    @Override // defpackage.bbmo
    public final akqi b() {
        dppv dppvVar;
        dppv dppvVar2;
        dppl dpplVar = this.a;
        if (dpplVar.b == 2) {
            dppvVar = (dppv) dpplVar.c;
        } else {
            dppvVar = dppv.g;
        }
        dzvx.b(dppvVar, "proto.place");
        dpsn dpsnVar = dppvVar.b;
        if (dpsnVar == null) {
            dpsnVar = dpsn.d;
        }
        dzvx.b(dpsnVar, "proto.place.placeFeatureId");
        long j = dpsnVar.b;
        dppl dpplVar2 = this.a;
        if (dpplVar2.b == 2) {
            dppvVar2 = (dppv) dpplVar2.c;
        } else {
            dppvVar2 = dppv.g;
        }
        dzvx.b(dppvVar2, "proto.place");
        dpsn dpsnVar2 = dppvVar2.b;
        if (dpsnVar2 == null) {
            dpsnVar2 = dpsn.d;
        }
        dzvx.b(dpsnVar2, "proto.place.placeFeatureId");
        return new akqi(j, dpsnVar2.c);
    }

    @Override // defpackage.bbmo
    public final String c() {
        dppl dpplVar = this.a;
        if ((dpplVar.a & 16) != 0) {
            String str = dpplVar.e;
            dzvx.b(str, "proto.title");
            return str;
        }
        return "Unknown place";
    }

    @Override // defpackage.bbmo
    public final String d() {
        dppv dppvVar;
        dppl dpplVar = this.a;
        if (dpplVar.b == 2) {
            dppvVar = (dppv) dpplVar.c;
        } else {
            dppvVar = dppv.g;
        }
        dzvx.b(dppvVar, "proto.place");
        String str = dppvVar.e;
        dzvx.b(str, "proto.place.singleLineAddress");
        return str;
    }

    @Override // defpackage.bbmo
    public final boolean e(dpqg dpqgVar) {
        dzvx.c(dpqgVar, "type");
        dppa dppaVar = this.a.k;
        if (dppaVar == null) {
            dppaVar = dppa.d;
        }
        dzvx.b(dppaVar, "proto.customData");
        dpqh dpqhVar = dppaVar.b;
        if (dpqhVar == null) {
            dpqhVar = dpqh.c;
        }
        dzvx.b(dpqhVar, "proto.customData.localPersonalizationSentiment");
        dpqg b = dpqg.b(dpqhVar.b);
        if (b == null) {
            b = dpqg.TYPE_UNKNOWN;
        }
        return b == dpqgVar;
    }

    @Override // defpackage.bbmo
    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof bbmp) && dzvx.d(this.a, ((bbmp) obj).a);
        }
        return true;
    }

    @Override // defpackage.bbmo
    public final int hashCode() {
        dppl dpplVar = this.a;
        if (dpplVar != null) {
            int i = dpplVar.bC;
            if (i != 0) {
                return i;
            }
            int c = dsst.a.b(dpplVar).c(dpplVar);
            dpplVar.bC = c;
            return c;
        }
        return 0;
    }

    public final String toString() {
        return "PersonalizationListItemDataClass(proto=" + this.a + ")";
    }
}
