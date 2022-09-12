package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: cuuu  reason: default package */
/* loaded from: classes5.dex */
final class cuuu extends cuuz {
    public final Bitmap a;
    private final dbsg<String> b;
    private final int c;

    public cuuu(Bitmap bitmap, dbsg<String> dbsgVar, int i) {
        this.a = bitmap;
        this.b = dbsgVar;
        this.c = i;
    }

    @Override // defpackage.cuuz
    public final Bitmap a() {
        return this.a;
    }

    @Override // defpackage.cuuz
    public final dbsg<String> b() {
        return this.b;
    }

    @Override // defpackage.cuuz
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cuuz) {
            cuuz cuuzVar = (cuuz) obj;
            if (this.a.equals(cuuzVar.a()) && this.b.equals(cuuzVar.b()) && this.c == cuuzVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59 + String.valueOf(valueOf2).length());
        sb.append("CacheValue{avatar=");
        sb.append(valueOf);
        sb.append(", imageUrl=");
        sb.append(valueOf2);
        sb.append(", profileHashCode=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
