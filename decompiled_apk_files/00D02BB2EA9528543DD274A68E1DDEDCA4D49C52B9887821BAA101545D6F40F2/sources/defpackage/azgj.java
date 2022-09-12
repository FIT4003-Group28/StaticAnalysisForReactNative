package defpackage;
/* compiled from: PG */
/* renamed from: azgj  reason: default package */
/* loaded from: classes3.dex */
final class azgj extends azoh {
    private final String b;
    private final String c;

    public azgj(@dzsi String str, @dzsi String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.azoh
    @dzsi
    public final String a() {
        return this.b;
    }

    @Override // defpackage.azoh
    @dzsi
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof azoh) {
            azoh azohVar = (azoh) obj;
            String str = this.b;
            if (str != null ? str.equals(azohVar.a()) : azohVar.a() == null) {
                String str2 = this.c;
                if (str2 != null ? str2.equals(azohVar.b()) : azohVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(str2).length());
        sb.append("SyncTokens{syncToken=");
        sb.append(str);
        sb.append(", paginationToken=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
