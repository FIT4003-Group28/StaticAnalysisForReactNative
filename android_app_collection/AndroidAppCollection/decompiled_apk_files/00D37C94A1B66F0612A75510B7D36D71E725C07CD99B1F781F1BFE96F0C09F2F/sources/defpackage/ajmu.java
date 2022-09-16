package defpackage;
/* compiled from: PG */
/* renamed from: ajmu  reason: default package */
/* loaded from: classes.dex */
public final class ajmu {
    public static final ajmu a = a().a();
    public static final ajmu b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final ajmw h;
    public final ajnb i;
    public final int j;

    static {
        ajmt a2 = a();
        a2.d(true);
        b = a2.a();
        ajmt a3 = a();
        a3.e = 2;
        a3.a();
        ajmt a4 = a();
        a4.e = 3;
        a4.a();
    }

    public ajmu() {
    }

    public ajmu(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, ajmw ajmwVar, ajnb ajnbVar) {
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = z3;
        this.g = z4;
        this.j = i2;
        this.h = ajmwVar;
        this.i = ajnbVar;
    }

    public static ajmt a() {
        ajmt ajmtVar = new ajmt();
        ajmtVar.d(false);
        ajmtVar.c(true);
        ajmtVar.b(0);
        ajmtVar.a = true;
        ajmtVar.b = true;
        ajmtVar.c = null;
        ajmtVar.e = 1;
        return ajmtVar;
    }

    public final ajmt b() {
        return new ajmt(this);
    }

    public final boolean equals(Object obj) {
        ajmw ajmwVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajmu) {
            ajmu ajmuVar = (ajmu) obj;
            if (this.c == ajmuVar.c && this.d == ajmuVar.d && this.e == ajmuVar.e && this.f == ajmuVar.f && this.g == ajmuVar.g) {
                int i = this.j;
                int i2 = ajmuVar.j;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && ((ajmwVar = this.h) != null ? ajmwVar.equals(ajmuVar.h) : ajmuVar.h == null)) {
                    ajnb ajnbVar = this.i;
                    ajnb ajnbVar2 = ajmuVar.i;
                    if (ajnbVar != null ? ajnbVar.equals(ajnbVar2) : ajnbVar2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((((true != this.c ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003;
        if (true == this.g) {
            i = 1231;
        }
        int i3 = (i2 ^ i) * 1000003;
        int i4 = this.j;
        if (i4 != 0) {
            int i5 = (i3 ^ i4) * (-721379959);
            ajmw ajmwVar = this.h;
            int i6 = 0;
            int hashCode = (i5 ^ (ajmwVar == null ? 0 : ajmwVar.hashCode())) * 1000003;
            ajnb ajnbVar = this.i;
            if (ajnbVar != null) {
                i6 = ajnbVar.hashCode();
            }
            return hashCode ^ i6;
        }
        throw null;
    }

    public final String toString() {
        boolean z = this.c;
        boolean z2 = this.d;
        int i = this.e;
        boolean z3 = this.f;
        boolean z4 = this.g;
        int i2 = this.j;
        String str = i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "CACHE_PREFERRED" : "CACHE_ONLY" : "DEFAULT";
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.i);
        StringBuilder sb = new StringBuilder(str.length() + 240 + "null".length() + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("ImageLoadOptions{shouldUpdateOnLayoutChange=");
        sb.append(z);
        sb.append(", shouldAnimate=");
        sb.append(z2);
        sb.append(", placeholderResId=");
        sb.append(i);
        sb.append(", cleanUpDrawableWhenLoading=");
        sb.append(z3);
        sb.append(", waitLayoutRequest=");
        sb.append(z4);
        sb.append(", retrieveFromCacheOption=");
        sb.append(str);
        sb.append(", preloadRendererFactory=");
        sb.append("null");
        sb.append(", loadListener=");
        sb.append(valueOf);
        sb.append(", imageParams=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
