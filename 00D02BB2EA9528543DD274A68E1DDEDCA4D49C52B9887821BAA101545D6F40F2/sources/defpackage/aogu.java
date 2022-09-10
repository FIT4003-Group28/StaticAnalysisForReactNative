package defpackage;
/* compiled from: PG */
/* renamed from: aogu  reason: default package */
/* loaded from: classes2.dex */
public final class aogu {
    private static final dcqe b = dcqe.c("aogu");
    private static final dclu<dvay> d = dclu.f(dvax.STOP, dvax.ACTIVITY).g(new aogs());
    public final dcdc<aogt> a;
    private final dbty<dcdn<aoha, aogt>> c = dbud.a(new aogr(this));

    public aogu(dcdc<aogt> dcdcVar) {
        for (int i = 1; i < dcdcVar.size(); i++) {
            dbsk.b(dcdcVar.get(i - 1).e().equals(dcdcVar.get(i).d()), "last point of path segment is not equal to the first point of next path segment");
        }
        this.a = dcdcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015f  */
    /* JADX WARN: Type inference failed for: r0v10, types: [dbsg] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6, types: [dbsg] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [dbsg] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.aogu a(defpackage.dvab r22, defpackage.dcdc<defpackage.dvay> r23) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aogu.a(dvab, dcdc):aogu");
    }

    private static String c(dpop dpopVar) {
        dbsb c = dbsc.c(dwyn.class);
        c.g("startMillis", dpopVar.b);
        c.g("endMillis", dpopVar.c);
        return c.toString();
    }

    private static String d(dwyn dwynVar) {
        dbsb c = dbsc.c(dwyn.class);
        c.g("secsSinceEpoch", dwynVar.b);
        c.f("timeZoneOffsetMin", dwynVar.c);
        return c.toString();
    }

    public final dbsg<aogt> b(aoha aohaVar) {
        return dbsg.j(this.c.a().get(aohaVar));
    }
}
