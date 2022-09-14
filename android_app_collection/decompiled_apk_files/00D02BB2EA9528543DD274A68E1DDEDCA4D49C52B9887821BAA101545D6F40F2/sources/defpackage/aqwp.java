package defpackage;
/* compiled from: PG */
/* renamed from: aqwp  reason: default package */
/* loaded from: classes2.dex */
public final class aqwp {
    public final bvjj a;

    public aqwp(bvjj bvjjVar) {
        this.a = bvjjVar;
    }

    public static bvjk c(btlu btluVar) {
        String valueOf = String.valueOf(btluVar.d);
        return new bvjk(valueOf.length() != 0 ? "consumer_messaging_data_latest_sync_time_millis_prefix".concat(valueOf) : new String("consumer_messaging_data_latest_sync_time_millis_prefix"), bvjk.b);
    }

    private static bvjk d(btlu btluVar) {
        String valueOf = String.valueOf(btluVar.d);
        return new bvjk(valueOf.length() != 0 ? "consumer_messaging_data_prefix".concat(valueOf) : new String("consumer_messaging_data_prefix"), bvjk.b);
    }

    public final dbsg<apzp> a(apzp apzpVar, btlu btluVar) {
        bvjj bvjjVar = this.a;
        bvjk d = d(btluVar);
        aqxl bZ = aqxm.b.bZ();
        boolean a = apzpVar.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((aqxm) bZ.b).a = a;
        bvjjVar.am(d, btluVar, bZ.bK());
        this.a.aa(c(btluVar), btluVar, System.currentTimeMillis());
        return b(btluVar);
    }

    public final dbsg<apzp> b(btlu btluVar) {
        aqxm aqxmVar = (aqxm) this.a.N(d(btluVar), btluVar, (dssr) aqxm.b.cu(7), null);
        if (aqxmVar == null) {
            return dbpy.a;
        }
        apzo c = apzp.c();
        c.b(aqxmVar.a);
        return dbsg.i(c.a());
    }
}
