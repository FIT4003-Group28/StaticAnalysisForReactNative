package defpackage;
/* compiled from: PG */
/* renamed from: cvrj  reason: default package */
/* loaded from: classes5.dex */
public final class cvrj implements cvql {
    private final cvsd a;

    public cvrj(cvsd cvsdVar) {
        this.a = cvsdVar;
    }

    @Override // defpackage.cvql
    public final float a(dsfz dsfzVar) {
        dsft dsftVar = dsfzVar.d;
        if (dsftVar == null) {
            dsftVar = dsft.d;
        }
        dsfg dsfgVar = dsftVar.a;
        if (dsfgVar == null) {
            dsfgVar = dsfg.d;
        }
        return dsfgVar.a;
    }

    @Override // defpackage.cvql
    public final dbsg<Float> b(dsfz dsfzVar) {
        float f;
        dbsg<cvse> a = this.a.a();
        if (!a.a()) {
            return dbpy.a;
        }
        cvse b = a.b();
        dsft dsftVar = dsfzVar.d;
        if (dsftVar == null) {
            dsftVar = dsft.d;
        }
        dsfg dsfgVar = dsftVar.a;
        if (dsfgVar == null) {
            dsfgVar = dsfg.d;
        }
        cvse cvseVar = cvse.CELLULAR;
        int ordinal = b.ordinal();
        if (ordinal == 0) {
            f = dsfgVar.b;
        } else if (ordinal != 1) {
            throw new AssertionError("Unknown NetworkTransport not caught by compiler!");
        } else {
            f = dsfgVar.c;
        }
        if (f == -1.0f) {
            return dbpy.a;
        }
        return dbsg.i(Float.valueOf(f));
    }
}
