package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amhu  reason: default package */
/* loaded from: classes.dex */
public final class amhu {
    public float b;
    public float c;
    public boolean d;
    public float e;
    public float f;
    public long g;
    public long h;
    public final alvi a = new alvi(new akra(), 2, 0.0f);
    public int i = 1;

    public final void a(amhv amhvVar) {
        synchronized (amhvVar.b) {
            alvi alviVar = this.a;
            alvi alviVar2 = amhvVar.t;
            alviVar.a.aa(alviVar2.a);
            alviVar.c = alviVar2.c;
            alviVar.b = alviVar2.b;
            this.b = amhvVar.C;
            this.c = amhvVar.D;
            this.d = amhvVar.w;
            this.e = amhvVar.x;
            this.f = amhvVar.y;
            this.i = amhvVar.s;
            this.g = amhvVar.o;
            this.h = amhvVar.m;
        }
    }
}
