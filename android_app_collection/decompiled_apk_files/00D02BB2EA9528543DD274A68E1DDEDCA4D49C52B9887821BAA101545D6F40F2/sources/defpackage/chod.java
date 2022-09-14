package defpackage;
/* compiled from: PG */
/* renamed from: chod  reason: default package */
/* loaded from: classes4.dex */
final class chod extends chsa {
    private final String a;
    private final String b;
    private final dspd c;

    public chod(String str, @dzsi String str2, @dzsi dspd dspdVar) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            this.c = dspdVar;
            return;
        }
        throw new NullPointerException("Null accountId");
    }

    @Override // defpackage.chsa
    public final String a() {
        return this.a;
    }

    @Override // defpackage.chsa
    @dzsi
    public final String b() {
        return this.b;
    }

    @Override // defpackage.chsa
    @dzsi
    public final dspd c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        String str;
        dspd dspdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof chsa) {
            chsa chsaVar = (chsa) obj;
            if (this.a.equals(chsaVar.a()) && ((str = this.b) != null ? str.equals(chsaVar.b()) : chsaVar.b() == null) && ((dspdVar = this.c) != null ? dspdVar.equals(chsaVar.c()) : chsaVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        dspd dspdVar = this.c;
        if (dspdVar != null) {
            i = dspdVar.hashCode();
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 81 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("TodoPhotoResponseCacheKey{accountId=");
        sb.append(str);
        sb.append(", continuationToken=");
        sb.append(str2);
        sb.append(", photoModeContentToken=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
