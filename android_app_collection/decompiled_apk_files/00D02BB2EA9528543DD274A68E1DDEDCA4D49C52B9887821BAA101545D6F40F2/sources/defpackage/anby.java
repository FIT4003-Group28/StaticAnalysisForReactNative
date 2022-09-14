package defpackage;
/* compiled from: PG */
/* renamed from: anby  reason: default package */
/* loaded from: classes2.dex */
public final class anby extends andb {
    public final String a;
    public final int b;

    public anby(int i, @dzsi String str) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.andb
    @dzsi
    public final String a() {
        return this.a;
    }

    @Override // defpackage.andb
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof andb) {
            andb andbVar = (andb) obj;
            if (this.b == andbVar.b() && ((str = this.a) != null ? str.equals(andbVar.a()) : andbVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.b ^ 1000003) * 1000003;
        String str = this.a;
        return i ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.b;
        String str = i != 1 ? i != 2 ? i != 3 ? "WORKING" : "SHOW_ADDRESS" : "INITIAL_WORKING" : "INITIAL";
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 30 + String.valueOf(str2).length());
        sb.append("GeocoderState{state=");
        sb.append(str);
        sb.append(", string=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
