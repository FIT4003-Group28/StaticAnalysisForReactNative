package defpackage;
/* compiled from: PG */
/* renamed from: brai  reason: default package */
/* loaded from: classes4.dex */
final class brai extends brav {
    private final dfpo a;
    private final dcdc<brod> b;
    private final dcdc<dmni> c;

    public brai(@dzsi dfpo dfpoVar, dcdc<brod> dcdcVar, dcdc<dmni> dcdcVar2) {
        this.a = dfpoVar;
        this.b = dcdcVar;
        this.c = dcdcVar2;
    }

    @Override // defpackage.brav
    @dzsi
    public final dfpo a() {
        return this.a;
    }

    @Override // defpackage.brav
    public final dcdc<brod> b() {
        return this.b;
    }

    @Override // defpackage.brav
    public final dcdc<dmni> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof brav) {
            brav bravVar = (brav) obj;
            dfpo dfpoVar = this.a;
            if (dfpoVar != null ? dfpoVar.equals(bravVar.a()) : bravVar.a() == null) {
                if (dchl.m(this.b, bravVar.b()) && dchl.m(this.c, bravVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 86 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("OnMapResultsState{searchPipeMetadata=");
        sb.append(valueOf);
        sb.append(", clientInjectedResults=");
        sb.append(valueOf2);
        sb.append(", serverProvidedResults=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i;
        dfpo dfpoVar = this.a;
        if (dfpoVar == null) {
            i = 0;
        } else {
            int i2 = dfpoVar.bC;
            if (i2 == 0) {
                i2 = dsst.a.b(dfpoVar).c(dfpoVar);
                dfpoVar.bC = i2;
            }
            i = i2;
        }
        return ((((i ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
