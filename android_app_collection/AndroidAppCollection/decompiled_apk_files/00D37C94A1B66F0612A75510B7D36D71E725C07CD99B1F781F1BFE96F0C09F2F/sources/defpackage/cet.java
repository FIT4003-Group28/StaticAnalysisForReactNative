package defpackage;
/* compiled from: PG */
/* renamed from: cet  reason: default package */
/* loaded from: classes2.dex */
public class cet implements cfc {
    public int a;
    private int b;
    private final int c;
    private final float d;

    public cet() {
        this(2500, 1, 1.0f);
    }

    public cet(int i, int i2, float f) {
        this.b = i;
        this.c = i2;
        this.d = f;
    }

    @Override // defpackage.cfc
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cfc
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cfc
    public void c(cff cffVar) {
        int i = this.a + 1;
        this.a = i;
        int i2 = this.b;
        this.b = i2 + ((int) (i2 * this.d));
        if (i <= this.c) {
            return;
        }
        throw cffVar;
    }
}
