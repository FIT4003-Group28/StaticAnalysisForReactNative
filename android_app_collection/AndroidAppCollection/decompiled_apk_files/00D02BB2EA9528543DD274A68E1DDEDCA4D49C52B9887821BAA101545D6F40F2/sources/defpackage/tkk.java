package defpackage;
/* compiled from: PG */
/* renamed from: tkk  reason: default package */
/* loaded from: classes7.dex */
public final class tkk extends tkn {
    private final boolean a;
    private final dbsg<Integer> b;
    private final dbsg<Integer> c;
    private final dcdc<akqq> d;

    public tkk(boolean z, dbsg<Integer> dbsgVar, dbsg<Integer> dbsgVar2, dcdc<akqq> dcdcVar) {
        this.a = z;
        this.b = dbsgVar;
        this.c = dbsgVar2;
        if (dcdcVar != null) {
            this.d = dcdcVar;
            return;
        }
        throw new NullPointerException("Null vehiclePositionsToFrame");
    }

    @Override // defpackage.tkn
    public final boolean a() {
        return false;
    }

    @Override // defpackage.tkn
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.tkn
    public final dbsg<Integer> c() {
        return this.b;
    }

    @Override // defpackage.tkn
    public final dbsg<Integer> d() {
        return this.c;
    }

    @Override // defpackage.tkn
    public final dcdc<akqq> e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tkn) {
            tkn tknVar = (tkn) obj;
            if (!tknVar.a() && this.a == tknVar.b() && this.b.equals(tknVar.c()) && this.c.equals(tknVar.d()) && dchl.m(this.d, tknVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((true != this.a ? 1237 : 1231) ^ 385623362) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 139 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("MapFocusContext{forceViewportUpdate=");
        sb.append(false);
        sb.append(", shouldFrameFullRoute=");
        sb.append(z);
        sb.append(", pathIndexToFrame=");
        sb.append(valueOf);
        sb.append(", stepGroupIndexToFrame=");
        sb.append(valueOf2);
        sb.append(", vehiclePositionsToFrame=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
