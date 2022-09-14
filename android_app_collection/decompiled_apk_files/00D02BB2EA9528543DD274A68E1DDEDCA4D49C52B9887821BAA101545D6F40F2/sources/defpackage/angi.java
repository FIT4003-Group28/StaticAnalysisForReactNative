package defpackage;
/* compiled from: PG */
/* renamed from: angi  reason: default package */
/* loaded from: classes2.dex */
public final class angi extends anhe {
    private final String a;

    public angi(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null mutateKey");
    }

    @Override // defpackage.anhe
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof anhe)) {
            return false;
        }
        return this.a.equals(((anhe) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 42);
        sb.append("RemovePhotoConfirmDialogResult{mutateKey=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
