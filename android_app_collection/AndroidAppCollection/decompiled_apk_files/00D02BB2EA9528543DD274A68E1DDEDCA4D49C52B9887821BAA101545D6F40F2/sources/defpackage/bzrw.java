package defpackage;

import android.content.ContentValues;
/* compiled from: PG */
/* renamed from: bzrw  reason: default package */
/* loaded from: classes4.dex */
final class bzrw extends bzsy {
    private final ContentValues a;

    public bzrw(ContentValues contentValues) {
        this.a = contentValues;
    }

    @Override // defpackage.bzto
    public final ContentValues a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bzsy)) {
            return false;
        }
        return this.a.equals(((bzsy) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("UpdateImpl{contentValues=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
