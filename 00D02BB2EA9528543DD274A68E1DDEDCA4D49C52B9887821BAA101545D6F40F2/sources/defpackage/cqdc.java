package defpackage;
/* compiled from: PG */
/* renamed from: cqdc  reason: default package */
/* loaded from: classes5.dex */
final class cqdc {
    public static final dcco<cqdb, dskp> a;

    static {
        dccm b = dcco.b();
        b.d(cqdb.ALREADY_CONSENTED, dskp.ALREADY_CONSENTED);
        b.d(cqdb.CAN_ASK_FOR_CONSENT, dskp.CAN_ASK_FOR_CONSENT);
        b.d(cqdb.CANNOT_CONSENT, dskp.CANNOT_CONSENT);
        b.d(cqdb.CONSENT_DEPRECATED, dskp.CONSENT_DEPRECATED);
        a = b.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cqdb a(dslz dslzVar) {
        int a2;
        if (dxyj.a.a().h()) {
            return cqdb.CONSENT_DEPRECATED;
        }
        int i = dslzVar.b;
        int i2 = 1;
        int i3 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 1 : 3;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 == 0) {
            return cqdb.CAN_ASK_FOR_CONSENT;
        }
        if (i4 != 1) {
            return cqdb.CANNOT_CONSENT;
        }
        if (i == 2 && (a2 = dsly.a(((Integer) dslzVar.c).intValue())) != 0) {
            i2 = a2;
        }
        if (i2 - 1 == 3) {
            return cqdb.ALREADY_CONSENTED;
        }
        if (dslzVar.b == 2) {
            Integer num = (Integer) dslzVar.c;
        }
        return cqdb.CANNOT_CONSENT;
    }
}
