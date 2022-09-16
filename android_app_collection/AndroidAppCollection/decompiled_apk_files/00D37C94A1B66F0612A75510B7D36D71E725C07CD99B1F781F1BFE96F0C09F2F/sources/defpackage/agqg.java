package defpackage;
/* compiled from: PG */
/* renamed from: agqg  reason: default package */
/* loaded from: classes.dex */
public final class agqg implements agqi {
    public final agqf a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    private final int h;

    public agqg(agqf agqfVar, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.a = agqfVar;
        this.h = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = z;
    }

    public final int a() {
        return this.a.f - this.h;
    }

    @Override // defpackage.agqi
    public final int b() {
        return this.e;
    }

    public final int c() {
        return this.a.f;
    }

    public final String d() {
        return this.a.a;
    }

    @Override // defpackage.agqi
    public final boolean e() {
        return !f() && this.h == 0;
    }

    public final boolean f() {
        return this.a.h;
    }
}
