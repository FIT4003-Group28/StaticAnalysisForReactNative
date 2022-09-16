package defpackage;
/* compiled from: PG */
/* renamed from: aegs  reason: default package */
/* loaded from: classes.dex */
public final class aegs {
    public static final aegx a = new aegx(3, 2);
    public static final aegx b = new aegx(3, 1);
    public static final aegx c = new aegx(2160, 144);
    public final aegx d;
    public final aegx e;
    public final boolean f;
    public final String g;
    public final int h;
    public final int i;
    public final long j;
    public final int k;
    public final int l;
    public final afmv m;

    public aegs(aegx aegxVar, aegx aegxVar2, boolean z, String str) {
        this(aegxVar, aegxVar2, z, str, -1, -2, -1L, Integer.MAX_VALUE, 0);
    }

    public final boolean a() {
        return (this.l & 32) > 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aegs)) {
            return false;
        }
        aegs aegsVar = (aegs) obj;
        return akzj.f(this.d, aegsVar.d) && akzj.f(this.e, aegsVar.e) && akzj.f(this.g, aegsVar.g) && this.f == aegsVar.f;
    }

    public final int hashCode() {
        return ((((this.d.hashCode() + 5363) * 31) + this.e.hashCode()) * 31) + (true != this.f ? 0 : 313);
    }

    public aegs(aegx aegxVar, aegx aegxVar2, boolean z, String str, int i, int i2, long j, int i3, int i4) {
        this(aegxVar, aegxVar2, z, str, i, i2, j, i3, i4, null);
    }

    public aegs(aegx aegxVar, aegx aegxVar2, boolean z, String str, int i, int i2, long j, int i3, int i4, afmv afmvVar) {
        afms.a(aegxVar);
        this.d = aegxVar;
        afms.a(aegxVar2);
        this.e = aegxVar2;
        this.f = z;
        this.g = str;
        this.h = i;
        this.i = i2;
        this.j = j;
        this.k = i3;
        this.l = i4;
        this.m = afmvVar;
    }
}
