package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: cuuq  reason: default package */
/* loaded from: classes5.dex */
final class cuuq extends cuuk {
    public final Bitmap a;
    private final dbsg<String> b;
    private final int c;
    private final boolean d;
    private final dbsg<String> e;
    private final dbsg<Integer> f;

    public cuuq(Bitmap bitmap, dbsg<String> dbsgVar, int i, boolean z, dbsg<String> dbsgVar2, dbsg<Integer> dbsgVar3) {
        this.a = bitmap;
        this.b = dbsgVar;
        this.c = i;
        this.d = z;
        this.e = dbsgVar2;
        this.f = dbsgVar3;
    }

    @Override // defpackage.cuuk
    public final Bitmap a() {
        return this.a;
    }

    @Override // defpackage.cuuk
    public final dbsg<String> b() {
        return this.b;
    }

    @Override // defpackage.cuuk
    public final int c() {
        return this.c;
    }

    @Override // defpackage.cuuk
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.cuuk
    public final dbsg<String> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cuuk) {
            cuuk cuukVar = (cuuk) obj;
            if (this.a.equals(cuukVar.a()) && this.b.equals(cuukVar.b()) && this.c == cuukVar.c() && this.d == cuukVar.d() && this.e.equals(cuukVar.e()) && this.f.equals(cuukVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cuuk
    public final dbsg<Integer> f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.c;
        boolean z = this.d;
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 143 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("CacheValue{avatar=");
        sb.append(valueOf);
        sb.append(", conversationImageUrl=");
        sb.append(valueOf2);
        sb.append(", conversationProfileHashCode=");
        sb.append(i);
        sb.append(", isDefault=");
        sb.append(z);
        sb.append(", contactImageUrl=");
        sb.append(valueOf3);
        sb.append(", contactProfileHashCode=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
