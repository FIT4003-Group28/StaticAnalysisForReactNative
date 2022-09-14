package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: bypu  reason: default package */
/* loaded from: classes4.dex */
final class bypu extends byqa {
    private final Bitmap a;
    private final int b;

    public bypu(@dzsi Bitmap bitmap, int i) {
        this.a = bitmap;
        this.b = i;
    }

    @Override // defpackage.byqa
    @dzsi
    public final Bitmap a() {
        return this.a;
    }

    @Override // defpackage.byqa
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof byqa) {
            byqa byqaVar = (byqa) obj;
            Bitmap bitmap = this.a;
            if (bitmap != null ? bitmap.equals(byqaVar.a()) : byqaVar.a() == null) {
                if (this.b == byqaVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        return (((bitmap == null ? 0 : bitmap.hashCode()) ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b != 1 ? "MINIMAP" : "FALLBACK";
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + str.length());
        sb.append("MinimapImage{image=");
        sb.append(valueOf);
        sb.append(", imageType=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
