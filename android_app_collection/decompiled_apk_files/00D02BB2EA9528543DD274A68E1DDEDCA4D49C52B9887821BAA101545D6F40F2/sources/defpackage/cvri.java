package defpackage;
/* compiled from: PG */
/* renamed from: cvri  reason: default package */
/* loaded from: classes5.dex */
public final class cvri implements cvql {
    private final cvsn a;

    public cvri(cvsn cvsnVar) {
        this.a = cvsnVar;
    }

    @Override // defpackage.cvql
    public final float a(dsfz dsfzVar) {
        dsfe dsfeVar = dsfzVar.g;
        if (dsfeVar == null) {
            dsfeVar = dsfe.f;
        }
        return dsfeVar.a;
    }

    @Override // defpackage.cvql
    public final dbsg<Float> b(dsfz dsfzVar) {
        float f;
        dbsg<cvms> a = this.a.a.a();
        if (!a.a()) {
            return dbpy.a;
        }
        cvms b = a.b();
        dsfe dsfeVar = dsfzVar.g;
        if (dsfeVar == null) {
            dsfeVar = dsfe.f;
        }
        cvms cvmsVar = cvms.FILTER_ALL;
        int ordinal = b.ordinal();
        if (ordinal == 0) {
            f = dsfeVar.e;
        } else if (ordinal == 1) {
            f = dsfeVar.b;
        } else if (ordinal != 2) {
            f = ordinal != 3 ? -1.0f : dsfeVar.d;
        } else {
            f = dsfeVar.c;
        }
        if (f == -1.0f) {
            return dbpy.a;
        }
        return dbsg.i(Float.valueOf(f));
    }
}
