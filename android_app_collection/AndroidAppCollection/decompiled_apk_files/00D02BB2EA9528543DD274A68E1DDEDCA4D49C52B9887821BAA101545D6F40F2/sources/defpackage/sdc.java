package defpackage;
/* compiled from: PG */
/* renamed from: sdc  reason: default package */
/* loaded from: classes7.dex */
public class sdc {
    public final dzsj<qds> a;
    public final qjk b;
    private final rzv c;

    public sdc(dzsj<qds> dzsjVar, rzv rzvVar, qjk qjkVar) {
        this.a = dzsjVar;
        this.c = rzvVar;
        this.b = qjkVar;
    }

    public final dehn<sdv> a(sdu sduVar) {
        dnld dnldVar;
        dbsg<dnlg> p = this.b.p();
        if (!p.a()) {
            return deha.a(sdv.e(sduVar, 1));
        }
        dnlg b = p.b();
        if (b.a == 3) {
            dnldVar = (dnld) b.b;
        } else {
            dnldVar = dnld.e;
        }
        return b(sduVar, 1, dnldVar.c);
    }

    public final dehn<sdv> b(sdu sduVar, int i, dspd dspdVar) {
        deig d = deig.d();
        rzv rzvVar = this.c;
        deig d2 = deig.d();
        qcc qccVar = rzvVar.b;
        qad qadVar = new qad();
        if (dspdVar != null) {
            qadVar.a = dspdVar;
            String str = qadVar.a == null ? " routeToken" : "";
            if (!str.isEmpty()) {
                throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
            }
            qccVar.a(new qae(qadVar.a), new rzu(d2));
            deha.q(d2, new scz(this, d, sduVar, i), dege.a);
            return d;
        }
        throw new NullPointerException("Null routeToken");
    }
}
