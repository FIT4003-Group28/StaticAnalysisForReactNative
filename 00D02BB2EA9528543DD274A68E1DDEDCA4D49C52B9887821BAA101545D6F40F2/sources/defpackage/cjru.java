package defpackage;
/* compiled from: PG */
/* renamed from: cjru  reason: default package */
/* loaded from: classes.dex */
final class cjru extends cjsy {
    private final ddhn a;
    private final ddow b;
    private final ddjf c;
    private final ddgm d;
    private final ddcy e;

    public cjru(ddhn ddhnVar, @dzsi ddow ddowVar, @dzsi ddjf ddjfVar, @dzsi ddgm ddgmVar, @dzsi ddcy ddcyVar) {
        this.a = ddhnVar;
        this.b = ddowVar;
        this.c = ddjfVar;
        this.d = ddgmVar;
        this.e = ddcyVar;
    }

    @Override // defpackage.cjsy
    public final ddhn a() {
        return this.a;
    }

    @Override // defpackage.cjsy
    @dzsi
    public final ddno b() {
        return null;
    }

    @Override // defpackage.cjsy
    @dzsi
    public final ddqk c() {
        return null;
    }

    @Override // defpackage.cjsy
    @dzsi
    public final ddmq d() {
        return null;
    }

    @Override // defpackage.cjsy
    @dzsi
    public final ddow e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        ddow ddowVar;
        ddjf ddjfVar;
        ddgm ddgmVar;
        ddcy ddcyVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjsy) {
            cjsy cjsyVar = (cjsy) obj;
            if (this.a.equals(cjsyVar.a()) && cjsyVar.b() == null && cjsyVar.c() == null && cjsyVar.d() == null && ((ddowVar = this.b) != null ? ddowVar.equals(cjsyVar.e()) : cjsyVar.e() == null) && ((ddjfVar = this.c) != null ? ddjfVar.equals(cjsyVar.f()) : cjsyVar.f() == null) && ((ddgmVar = this.d) != null ? ddgmVar.equals(cjsyVar.g()) : cjsyVar.g() == null) && ((ddcyVar = this.e) != null ? ddcyVar.equals(cjsyVar.h()) : cjsyVar.h() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cjsy
    @dzsi
    public final ddjf f() {
        return this.c;
    }

    @Override // defpackage.cjsy
    @dzsi
    public final ddgm g() {
        return this.d;
    }

    @Override // defpackage.cjsy
    @dzsi
    public final ddcy h() {
        return this.e;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (this.a.hashCode() ^ 1000003) * 1525764945;
        ddow ddowVar = this.b;
        int i4 = 0;
        if (ddowVar == null) {
            i = 0;
        } else {
            i = ddowVar.bC;
            if (i == 0) {
                i = dsst.a.b(ddowVar).c(ddowVar);
                ddowVar.bC = i;
            }
        }
        int i5 = (hashCode ^ i) * 1000003;
        ddjf ddjfVar = this.c;
        if (ddjfVar == null) {
            i2 = 0;
        } else {
            i2 = ddjfVar.bC;
            if (i2 == 0) {
                i2 = dsst.a.b(ddjfVar).c(ddjfVar);
                ddjfVar.bC = i2;
            }
        }
        int i6 = (i5 ^ i2) * 1000003;
        ddgm ddgmVar = this.d;
        if (ddgmVar == null) {
            i3 = 0;
        } else {
            i3 = ddgmVar.bC;
            if (i3 == 0) {
                i3 = dsst.a.b(ddgmVar).c(ddgmVar);
                ddgmVar.bC = i3;
            }
        }
        int i7 = (i6 ^ i3) * 1000003;
        ddcy ddcyVar = this.e;
        if (ddcyVar != null && (i4 = ddcyVar.bC) == 0) {
            i4 = dsst.a.b(ddcyVar).c(ddcyVar);
            ddcyVar.bC = i4;
        }
        return i7 ^ i4;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = "null".length();
        int length3 = "null".length();
        int length4 = "null".length();
        int length5 = String.valueOf(valueOf2).length();
        int length6 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 183 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("RequestLogParams{requestType=");
        sb.append(valueOf);
        sb.append(", navigationSDKParams=");
        sb.append("null");
        sb.append(", placesheetParams=");
        sb.append("null");
        sb.append(", freeScrollingBottomSheetParams=");
        sb.append("null");
        sb.append(", notificationBlockChange=");
        sb.append(valueOf2);
        sb.append(", arWalkingNavParams=");
        sb.append(valueOf3);
        sb.append(", streetViewData=");
        sb.append(valueOf4);
        sb.append(", geoPhotoData=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
