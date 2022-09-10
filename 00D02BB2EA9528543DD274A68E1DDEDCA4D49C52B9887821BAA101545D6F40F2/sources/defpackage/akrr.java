package defpackage;
/* compiled from: PG */
/* renamed from: akrr  reason: default package */
/* loaded from: classes2.dex */
public final class akrr {
    public double a;
    public int b;
    public int c;
    public int d;
    public int e;
    private final akra f;

    public akrr() {
        this(0.0f);
    }

    public akrr(float f) {
        this.b = Integer.MAX_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = Integer.MIN_VALUE;
        this.e = Integer.MAX_VALUE;
        this.a = Math.toRadians(f);
        this.f = new akra();
    }

    public final void a(@dzsi akqq akqqVar) {
        if (akqqVar == null) {
            return;
        }
        b(akra.f(akqqVar));
    }

    public final void b(@dzsi akra akraVar) {
        if (akraVar == null) {
            return;
        }
        this.f.aa(akraVar);
        this.f.Y(this.a);
        this.c = Math.max(this.c, this.f.a);
        this.b = Math.min(this.b, this.f.a);
        this.e = Math.min(this.e, this.f.b);
        this.d = Math.max(this.d, this.f.b);
    }
}
