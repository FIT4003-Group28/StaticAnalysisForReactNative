package defpackage;

import android.os.Parcel;
/* compiled from: PG */
/* renamed from: deys  reason: default package */
/* loaded from: classes6.dex */
final class deys extends deyt {
    private final dyib<?, ?> c;
    private final dyhw d;
    private final dyvi e;

    public deys(dexw dexwVar, int i, dyib<?, ?> dyibVar, dyhw dyhwVar, dyvi dyviVar) {
        super(dexwVar, i, dyviVar);
        this.c = dyibVar;
        this.d = dyhwVar;
        this.e = dyviVar;
        this.b = true;
    }

    @Override // defpackage.deyt
    protected final int a(Parcel parcel) {
        parcel.writeString(this.c.b);
        deyn.a(parcel, this.d);
        this.e.b();
        dyhz dyhzVar = this.c.a;
        return (dyhzVar == dyhz.UNARY || dyhzVar == dyhz.CLIENT_STREAMING) ? 16 : 0;
    }

    @Override // defpackage.deyt
    protected final int b() {
        return 0;
    }
}
