package defpackage;
/* compiled from: PG */
/* renamed from: avyu  reason: default package */
/* loaded from: classes.dex */
final class avyu extends avze {
    private final btlu b;
    private final String c;
    private final avzd d;

    public avyu(@dzsi btlu btluVar, @dzsi String str, avzd avzdVar) {
        this.b = btluVar;
        this.c = str;
        if (avzdVar != null) {
            this.d = avzdVar;
            return;
        }
        throw new NullPointerException("Null offlineInstanceType");
    }

    @Override // defpackage.avze
    @dzsi
    @Deprecated
    public final btlu a() {
        return this.b;
    }

    @Override // defpackage.avze
    @dzsi
    public final String b() {
        return this.c;
    }

    @Override // defpackage.avze
    public final avzd c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof avze) {
            avze avzeVar = (avze) obj;
            btlu btluVar = this.b;
            if (btluVar != null ? btluVar.equals(avzeVar.a()) : avzeVar.a() == null) {
                String str = this.c;
                if (str != null ? str.equals(avzeVar.b()) : avzeVar.b() == null) {
                    if (this.d.equals(avzeVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        btlu btluVar = this.b;
        int i = 0;
        int hashCode = ((btluVar == null ? 0 : btluVar.hashCode()) ^ 1000003) * 1000003;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        String valueOf2 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 56 + String.valueOf(str).length() + String.valueOf(valueOf2).length());
        sb.append("OfflineInstanceId{account=");
        sb.append(valueOf);
        sb.append(", sdId=");
        sb.append(str);
        sb.append(", offlineInstanceType=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
