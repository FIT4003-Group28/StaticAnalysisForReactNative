package defpackage;
/* compiled from: PG */
/* renamed from: acoi  reason: default package */
/* loaded from: classes2.dex */
public class acoi implements acoe {
    private final bbb b = new acof(this);
    public final acnw x = new acog(this);
    private final acod c = new acoh(this);
    public Float w = Float.valueOf(0.0f);
    private int a = 0;
    @dzsi
    protected acnw v = null;

    private final boolean a(int i, float f) {
        float f2 = i + f;
        if (this.w.floatValue() == f2) {
            return false;
        }
        this.w = Float.valueOf(f2);
        if (f != 0.0f) {
            return true;
        }
        this.a = i;
        return true;
    }

    @Override // defpackage.acoe
    public bbb E() {
        return this.b;
    }

    @Override // defpackage.acoe
    public Integer Os() {
        return Integer.valueOf(this.a);
    }

    @Override // defpackage.acoe
    public acod Ot() {
        return this.c;
    }

    public final void X(int i, float f, boolean z, boolean z2) {
        int i2 = this.a;
        boolean a = a(i, f);
        acnw acnwVar = this.v;
        if (acnwVar != null && f == 0.0f) {
            int i3 = this.a;
            if (i2 == i3) {
                if (!z) {
                    z = false;
                }
            }
            acnwVar.a(i2, i3, z, z2);
        }
        if (a) {
            cqkx.p(this.c);
        }
        if (i2 != this.a) {
            cqkx.p(this);
        }
    }

    public void Y(@dzsi acnw acnwVar) {
        this.v = acnwVar;
    }

    public void Z(int i) {
        a(i, 0.0f);
    }
}
