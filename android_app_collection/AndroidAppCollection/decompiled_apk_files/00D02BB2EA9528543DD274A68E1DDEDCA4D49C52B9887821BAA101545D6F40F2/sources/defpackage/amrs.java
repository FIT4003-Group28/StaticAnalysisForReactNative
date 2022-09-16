package defpackage;
/* compiled from: PG */
/* renamed from: amrs  reason: default package */
/* loaded from: classes2.dex */
public abstract class amrs extends amru {
    protected final amkz a;

    public amrs(amsa amsaVar) {
        super(amsaVar);
        this.a = new amkz(0.0f, 0.0f, 0.0f, 0.0f);
    }

    protected abstract void b(float f, float f2);

    @Override // defpackage.amru
    protected final float c(amkz amkzVar, akse akseVar) {
        b(akseVar.b, akseVar.c);
        return amsa.b(amkzVar, this.a);
    }
}
