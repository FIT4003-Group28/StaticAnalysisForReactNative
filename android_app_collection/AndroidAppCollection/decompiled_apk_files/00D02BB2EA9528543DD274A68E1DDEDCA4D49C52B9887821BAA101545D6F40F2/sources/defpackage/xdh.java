package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: xdh  reason: default package */
/* loaded from: classes7.dex */
public final class xdh extends xdj {
    private final akqi a;
    private final akqq b;
    private final cqtd c;
    private final String d;
    private final Runnable e;

    public xdh(akqi akqiVar, akqq akqqVar, @dzsi cqtd cqtdVar, @dzsi String str, @dzsi Runnable runnable) {
        if (akqiVar != null) {
            this.a = akqiVar;
            this.b = akqqVar;
            this.c = cqtdVar;
            this.d = str;
            this.e = runnable;
            return;
        }
        throw new NullPointerException("Null featureId");
    }

    @Override // defpackage.xdj
    public final akqi a() {
        return this.a;
    }

    @Override // defpackage.xdj
    public final akqq b() {
        return this.b;
    }

    @Override // defpackage.xdj
    @dzsi
    public final cqtd c() {
        return this.c;
    }

    @Override // defpackage.xdj
    @dzsi
    public final String d() {
        return this.d;
    }

    @Override // defpackage.xdj
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        cqtd cqtdVar;
        String str;
        Runnable runnable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof xdj) {
            xdj xdjVar = (xdj) obj;
            if (this.a.equals(xdjVar.a()) && this.b.equals(xdjVar.b()) && ((cqtdVar = this.c) != null ? cqtdVar.equals(xdjVar.c()) : xdjVar.c() == null) && ((str = this.d) != null ? str.equals(xdjVar.d()) : xdjVar.d() == null) && xdjVar.e() && ((runnable = this.e) != null ? runnable.equals(xdjVar.f()) : xdjVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xdj
    @dzsi
    public final Runnable f() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        cqtd cqtdVar = this.c;
        int i = 0;
        int hashCode2 = (hashCode ^ (cqtdVar == null ? 0 : cqtdVar.hashCode())) * 1000003;
        String str = this.d;
        int hashCode3 = (((hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ 1231) * 1000003;
        Runnable runnable = this.e;
        if (runnable != null) {
            i = runnable.hashCode();
        }
        return hashCode3 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String str = this.d;
        String valueOf4 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 84 + length2 + length3 + String.valueOf(str).length() + String.valueOf(valueOf4).length());
        sb.append("MapMarker{featureId=");
        sb.append(valueOf);
        sb.append(", latLng=");
        sb.append(valueOf2);
        sb.append(", icon=");
        sb.append(valueOf3);
        sb.append(", labelText=");
        sb.append(str);
        sb.append(", labelTextOptional=");
        sb.append(true);
        sb.append(", onClick=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
