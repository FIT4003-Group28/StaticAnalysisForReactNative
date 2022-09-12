package defpackage;
/* compiled from: PG */
/* renamed from: aegf  reason: default package */
/* loaded from: classes.dex */
public final class aegf implements aegg {
    private final float a;

    public aegf(float f) {
        this.a = f;
    }

    @Override // defpackage.aegg
    public final int a(acyu acyuVar) {
        return Math.round(bvsc.b(acyuVar.o()) * this.a);
    }
}
