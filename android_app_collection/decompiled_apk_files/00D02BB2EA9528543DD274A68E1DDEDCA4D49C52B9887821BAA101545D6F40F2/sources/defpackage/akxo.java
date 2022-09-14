package defpackage;
/* compiled from: PG */
/* renamed from: akxo  reason: default package */
/* loaded from: classes2.dex */
final class akxo extends akxt {
    private final String a;
    private final int b;
    private final int c;

    public akxo(String str, int i, int i2) {
        if (str != null) {
            this.a = str;
            this.c = i;
            this.b = i2;
            return;
        }
        throw new NullPointerException("Null fprint");
    }

    @Override // defpackage.akxt
    public final String a() {
        return this.a;
    }

    @Override // defpackage.akxt
    public final int b() {
        return this.b;
    }

    @Override // defpackage.akxt
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akxt) {
            akxt akxtVar = (akxt) obj;
            if (this.a.equals(akxtVar.a()) && this.c == akxtVar.c() && this.b == akxtVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.b;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(Integer.toString(this.c));
        int i = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 67 + String.valueOf(valueOf).length());
        sb.append("HashableLoggedFeature{fprint=");
        sb.append(str);
        sb.append(", visibility=");
        sb.append(valueOf);
        sb.append(", appearance=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
