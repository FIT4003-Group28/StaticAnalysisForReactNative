package defpackage;
/* compiled from: PG */
/* renamed from: ajbt  reason: default package */
/* loaded from: classes.dex */
public final class ajbt implements ajbv {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;

    public ajbt() {
        this.b = -1L;
    }

    public ajbt(ajbv ajbvVar) {
        this.b = -1L;
        ajfj ajfjVar = (ajfj) ajbvVar;
        this.a = ajfjVar.e;
        this.b = ajfjVar.f;
        this.c = ajfjVar.g;
        this.d = ajfjVar.h;
        this.e = ajfjVar.i;
        this.f = ajfjVar.j;
        this.g = ajbvVar.c();
    }

    @Override // defpackage.ajbv
    public final long a() {
        return this.e;
    }

    @Override // defpackage.ajbv
    public final long b() {
        return this.b;
    }

    @Override // defpackage.ajbv
    public final long c() {
        return this.g;
    }

    @Override // defpackage.ajbv
    public final long d() {
        return this.f;
    }

    @Override // defpackage.ajbv
    public final long f() {
        return this.d;
    }

    @Override // defpackage.ajbv
    public final long g() {
        return this.a;
    }

    @Override // defpackage.ajbv
    public final long h() {
        return this.c;
    }
}
