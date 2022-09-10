package defpackage;
/* compiled from: PG */
/* renamed from: amvk  reason: default package */
/* loaded from: classes2.dex */
public final class amvk {
    public boolean b;
    private final akra e;
    private final float f;
    private final float g;
    private final ahmp h;
    private final ahmp i;
    private final float j;
    private final dzlf k;
    public int d = 1;
    public int c = 0;
    public float a = 0.0f;

    public amvk(akra akraVar, float f, float f2, ahmp ahmpVar, ahmp ahmpVar2, @dzsi dzlf dzlfVar, float f3) {
        this.e = akraVar;
        this.f = f;
        this.g = f2;
        this.h = ahmpVar;
        this.j = f3;
        this.i = ahmpVar2;
        if (dzlfVar.isEmpty()) {
            this.k = dzlh.a;
        } else {
            this.k = dzlfVar;
        }
        this.b = false;
    }

    public final amvl a() {
        return new amvl(this.e, this.f, this.g, this.h, this.i, this.k, this.a, this.j, this.b, this.d, this.c);
    }
}
