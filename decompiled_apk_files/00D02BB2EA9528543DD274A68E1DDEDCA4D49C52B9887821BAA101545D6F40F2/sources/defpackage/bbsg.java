package defpackage;
/* compiled from: PG */
/* renamed from: bbsg  reason: default package */
/* loaded from: classes3.dex */
public final class bbsg extends bbtn {
    private final decs a;
    private final decs b;
    private final String c;

    public bbsg(decs decsVar, @dzsi decs decsVar2, String str) {
        this.a = decsVar;
        this.b = decsVar2;
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null caption");
    }

    @Override // defpackage.bbtn
    public final decs a() {
        return this.a;
    }

    @Override // defpackage.bbtn
    @dzsi
    public final decs b() {
        return this.b;
    }

    @Override // defpackage.bbtn
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        decs decsVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbtn) {
            bbtn bbtnVar = (bbtn) obj;
            if (this.a.equals(bbtnVar.a()) && ((decsVar = this.b) != null ? decsVar.equals(bbtnVar.b()) : bbtnVar.b() == null) && this.c.equals(bbtnVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        decs decsVar = this.b;
        return ((hashCode ^ (decsVar == null ? 0 : decsVar.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String str = this.c;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 50 + String.valueOf(valueOf2).length() + str.length());
        sb.append("ImportingPhoto{photoId=");
        sb.append(valueOf);
        sb.append(", publicPhotoId=");
        sb.append(valueOf2);
        sb.append(", caption=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
