package defpackage;
/* compiled from: PG */
/* renamed from: bnoo  reason: default package */
/* loaded from: classes3.dex */
final class bnoo extends bnor {
    private final String a;
    private final String b;

    public bnoo(@dzsi String str, String str2) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
            return;
        }
        throw new NullPointerException("Null contentId");
    }

    @Override // defpackage.bnor
    @dzsi
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bnor
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bnor) {
            bnor bnorVar = (bnor) obj;
            String str = this.a;
            if (str != null ? str.equals(bnorVar.a()) : bnorVar.a() == null) {
                if (this.b.equals(bnorVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + str2.length());
        sb.append("Key{gmmAccountId=");
        sb.append(str);
        sb.append(", contentId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
