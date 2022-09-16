package defpackage;
/* compiled from: PG */
/* renamed from: ahhx  reason: default package */
/* loaded from: classes.dex */
public class ahhx implements ajbv {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final boolean h;
    private final String i;

    public ahhx(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, String str) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = z;
        this.i = str;
    }

    public ahhx(ajbv ajbvVar, boolean z, String str) {
        this(ajbvVar.g(), ajbvVar.b(), ajbvVar.h(), ajbvVar.f(), ajbvVar.a(), ajbvVar.d(), ajbvVar.c(), z, str);
    }

    @Override // defpackage.ajbv
    public long a() {
        return this.e;
    }

    @Override // defpackage.ajbv
    public long b() {
        return this.b;
    }

    @Override // defpackage.ajbv
    public long c() {
        return this.g;
    }

    @Override // defpackage.ajbv
    public long d() {
        return this.f;
    }

    public long e() {
        return g();
    }

    @Override // defpackage.ajbv
    public long f() {
        return this.d;
    }

    @Override // defpackage.ajbv
    public long g() {
        return this.a;
    }

    @Override // defpackage.ajbv
    public long h() {
        return this.c;
    }

    public String i() {
        return this.i;
    }

    public boolean j() {
        return this.h;
    }
}
