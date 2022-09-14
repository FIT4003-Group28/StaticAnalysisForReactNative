package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: aljy  reason: default package */
/* loaded from: classes2.dex */
final class aljy extends alrm {
    private final Bitmap a;
    private final amgk b;

    public aljy(Bitmap bitmap, amgk amgkVar) {
        this.a = bitmap;
        if (amgkVar != null) {
            this.b = amgkVar;
            return;
        }
        throw new NullPointerException("Null type");
    }

    @Override // defpackage.alrm
    public final Bitmap a() {
        return this.a;
    }

    @Override // defpackage.alrm
    public final amgk b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alrm) {
            alrm alrmVar = (alrm) obj;
            if (this.a.equals(alrmVar.a()) && this.b.equals(alrmVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30 + String.valueOf(valueOf2).length());
        sb.append("BitmapCacheKey{bitmap=");
        sb.append(valueOf);
        sb.append(", type=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
