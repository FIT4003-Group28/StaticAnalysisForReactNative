package defpackage;
/* compiled from: PG */
/* renamed from: angg  reason: default package */
/* loaded from: classes2.dex */
public final class angg extends anhc {
    private final String a;

    public angg(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null mediaKey");
    }

    @Override // defpackage.anhc
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof anhc)) {
            return false;
        }
        return this.a.equals(((anhc) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 33);
        sb.append("MarkPhotoReceiptResult{mediaKey=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
