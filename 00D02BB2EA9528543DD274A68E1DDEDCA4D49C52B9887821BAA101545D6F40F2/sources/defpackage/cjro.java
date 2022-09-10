package defpackage;
/* compiled from: PG */
/* renamed from: cjro  reason: default package */
/* loaded from: classes4.dex */
final class cjro extends cjrz {
    private final ddcu a;
    private final ddzg b;
    private final dddg c;
    private final boolean d;

    public cjro(ddcu ddcuVar, @dzsi ddzg ddzgVar, @dzsi dddg dddgVar, boolean z) {
        this.a = ddcuVar;
        this.b = ddzgVar;
        this.c = dddgVar;
        this.d = z;
    }

    @Override // defpackage.cjrz
    public final ddcu a() {
        return this.a;
    }

    @Override // defpackage.cjrz
    @dzsi
    public final ddzg b() {
        return this.b;
    }

    @Override // defpackage.cjrz
    @dzsi
    public final dddg c() {
        return this.c;
    }

    @Override // defpackage.cjrz
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        ddzg ddzgVar;
        dddg dddgVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjrz) {
            cjrz cjrzVar = (cjrz) obj;
            if (this.a.equals(cjrzVar.a()) && ((ddzgVar = this.b) != null ? ddzgVar.equals(cjrzVar.b()) : cjrzVar.b() == null) && ((dddgVar = this.c) != null ? dddgVar.equals(cjrzVar.c()) : cjrzVar.c() == null) && this.d == cjrzVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        ddzg ddzgVar = this.b;
        int i2 = 0;
        if (ddzgVar == null) {
            i = 0;
        } else {
            i = ddzgVar.bC;
            if (i == 0) {
                i = dsst.a.b(ddzgVar).c(ddzgVar);
                ddzgVar.bC = i;
            }
        }
        int i3 = (hashCode ^ i) * 1000003;
        dddg dddgVar = this.c;
        if (dddgVar != null && (i2 = dddgVar.bC) == 0) {
            i2 = dsst.a.b(dddgVar).c(dddgVar);
            dddgVar.bC = i2;
        }
        return ((i3 ^ i2) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 87 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("DataElement{dataElementType=");
        sb.append(valueOf);
        sb.append(", mapsData=");
        sb.append(valueOf2);
        sb.append(", geoUgcData=");
        sb.append(valueOf3);
        sb.append(", repressedForCounterfactual=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
