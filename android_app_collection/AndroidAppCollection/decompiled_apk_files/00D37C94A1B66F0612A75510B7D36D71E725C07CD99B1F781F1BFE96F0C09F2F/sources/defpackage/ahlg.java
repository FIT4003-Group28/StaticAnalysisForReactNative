package defpackage;
/* compiled from: PG */
/* renamed from: ahlg  reason: default package */
/* loaded from: classes.dex */
public final class ahlg {
    final /* synthetic */ ahli a;
    private final ahlh b;

    public ahlg(ahli ahliVar, ahlh ahlhVar) {
        this.a = ahliVar;
        this.b = ahlhVar;
    }

    public final float a() {
        float f = this.a.b;
        if (f == 0.0f) {
            return -1.0f;
        }
        return (this.b.a[0] + (f / 2.0f)) / f;
    }

    public final boolean b() {
        ahli ahliVar = this.a;
        return ahliVar.b != 0.0f && ahliVar.c != 0.0f && Math.abs(this.b.a[0]) <= this.a.b / 2.0f && Math.abs(this.b.a[1]) <= this.a.c / 2.0f;
    }
}
