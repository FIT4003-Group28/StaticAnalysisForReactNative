package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqiq  reason: default package */
/* loaded from: classes4.dex */
public class bqiq extends bqkl {
    public final String a;
    public final dbsg<bbtm> b;
    public final dbsg<dnwl> c;

    public bqiq(String str, dbsg<bbtm> dbsgVar, dbsg<dnwl> dbsgVar2) {
        if (str != null) {
            this.a = str;
            this.b = dbsgVar;
            this.c = dbsgVar2;
            return;
        }
        throw new NullPointerException("Null key");
    }

    @Override // defpackage.bqkl
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bqkl
    public final dbsg<bbtm> b() {
        return this.b;
    }

    @Override // defpackage.bqkl
    public final dbsg<dnwl> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqkl) {
            bqkl bqklVar = (bqkl) obj;
            if (this.a.equals(bqklVar.a()) && this.b.equals(bqklVar.b()) && this.c.equals(bqklVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 54 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("MediaEntry{key=");
        sb.append(str);
        sb.append(", gmmPhotoMetadata=");
        sb.append(valueOf);
        sb.append(", photoDescription=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
