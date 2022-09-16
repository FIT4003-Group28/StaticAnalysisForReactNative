package defpackage;
/* compiled from: PG */
/* renamed from: ghh  reason: default package */
/* loaded from: classes3.dex */
public final class ghh extends ghg {
    public final boolean e;
    public final int f;
    public final boolean g;

    private ghh(boolean z, int i, boolean z2, int i2, int i3, int i4, int i5) {
        super(i2, i3, i4, i5);
        this.e = z;
        this.f = i;
        this.g = z2;
    }

    public static ghh a(bip bipVar, int i, int i2, int i3, int i4) {
        boolean z = (bipVar == null || bipVar.b <= 0 || bipVar.a == 0) ? false : true;
        int i5 = z ? bipVar.b : 0;
        boolean z2 = z && i5 >= i;
        if (z) {
            i2 = bipVar.a;
        }
        int i6 = i2;
        int o = etk.o(i6);
        if (z) {
            i4 = bipVar.b();
        }
        int i7 = i4;
        if (z) {
            i3 = bipVar.a();
        }
        return new ghh(z, i5, z2, o, i6, i7, i3);
    }
}
