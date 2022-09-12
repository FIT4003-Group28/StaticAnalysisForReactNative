package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: bzrl  reason: default package */
/* loaded from: classes4.dex */
public final class bzrl extends bzrt {
    private final Bitmap a;
    private final Bitmap b;

    public bzrl(Bitmap bitmap, Bitmap bitmap2) {
        this.a = bitmap;
        this.b = bitmap2;
    }

    @Override // defpackage.bzrt
    public final Bitmap a() {
        return this.a;
    }

    @Override // defpackage.bzrt
    public final Bitmap b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzrt) {
            bzrt bzrtVar = (bzrt) obj;
            if (this.a.equals(bzrtVar.a()) && this.b.equals(bzrtVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(valueOf2).length());
        sb.append("NotificationIcon{collapsed=");
        sb.append(valueOf);
        sb.append(", expanded=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
