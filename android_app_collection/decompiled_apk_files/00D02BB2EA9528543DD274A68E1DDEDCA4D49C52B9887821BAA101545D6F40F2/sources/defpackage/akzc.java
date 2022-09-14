package defpackage;
/* compiled from: PG */
/* renamed from: akzc  reason: default package */
/* loaded from: classes.dex */
public final class akzc {
    public final float[] a;
    public final cqat b;
    public akzb c;
    public akzb d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public boolean j;

    public akzc() {
        cqaz cqazVar = new cqaz();
        this.a = new float[8];
        this.c = new akzb();
        this.d = new akzb();
        this.b = cqazVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(float f, float f2) {
        return f2 == 0.0f ? f : (f * 0.3f) + (f2 * 0.7f);
    }

    public final boolean a(@dzsi bnrs bnrsVar, akse akseVar) {
        if (bnrsVar == null) {
            return false;
        }
        if (!this.j || bnrsVar != this.c.d) {
            if (bnrsVar != this.d.d) {
                return false;
            }
            akseVar.r(0.0f, 0.0f);
            return true;
        }
        akseVar.r(this.e, this.f);
        return true;
    }

    @dzsi
    public final bnrs b() {
        return this.d.d;
    }
}
