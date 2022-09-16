package defpackage;
/* compiled from: PG */
/* renamed from: akzu  reason: default package */
/* loaded from: classes.dex */
public abstract class akzu implements akzs {
    private final albf a;

    public akzu(albf albfVar) {
        this.a = albfVar;
    }

    @Override // defpackage.akzs
    public final alcw a(alcw alcwVar) {
        alcw b = b(alcwVar);
        if (alcwVar != null && !alcwVar.ad) {
            amuk amukVar = akzk.a;
            alcv a = alcv.a(alcwVar.X);
            if (a == null) {
                a = alcv.UNKNOWN;
            }
            if (!amukVar.contains(a) && !alcwVar.ac) {
                if (b == null) {
                    this.a.d(alcwVar.k, alcwVar.e, avul.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_COMPLETED);
                } else if (!b.ad || (b.s && !b.t)) {
                    amuk amukVar2 = akzk.a;
                    alcv a2 = alcv.a(b.X);
                    if (a2 == null) {
                        a2 = alcv.UNKNOWN;
                    }
                    if (amukVar2.contains(a2)) {
                        albf albfVar = this.a;
                        String str = alcwVar.k;
                        String str2 = alcwVar.e;
                        avtu a3 = avtv.a();
                        avul avulVar = avul.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_REJECTED;
                        a3.copyOnWrite();
                        ((avtv) a3.instance).y(avulVar);
                        aopa createBuilder = avtw.a.createBuilder();
                        createBuilder.copyOnWrite();
                        avtw avtwVar = (avtw) createBuilder.instance;
                        str.getClass();
                        avtwVar.b |= 1;
                        avtwVar.c = str;
                        a3.copyOnWrite();
                        ((avtv) a3.instance).F((avtw) createBuilder.mo39build());
                        arrf a4 = arrh.a();
                        a4.copyOnWrite();
                        ((arrh) a4.instance).dR((avtv) a3.mo39build());
                        albfVar.b(str2, (arrh) a4.mo39build());
                    } else if (b.ac && (!b.s || b.t)) {
                        this.a.e(alcwVar.k, alcwVar.e, avum.UPLOAD_PROCESSOR_ABANDONMENT_REASON_DELETED_PENDING_UPLOAD);
                    }
                } else {
                    albf albfVar2 = this.a;
                    String str3 = b.k;
                    String str4 = b.e;
                    avuo b2 = avuo.b(b.ae);
                    if (b2 == null) {
                        b2 = avuo.UPLOAD_PROCESSOR_TYPE_UNKNOWN;
                    }
                    avun b3 = avun.b(b.af);
                    if (b3 == null) {
                        b3 = avun.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN;
                    }
                    avtu a5 = avtv.a();
                    avul avulVar2 = avul.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_FAILED;
                    a5.copyOnWrite();
                    ((avtv) a5.instance).y(avulVar2);
                    aopa createBuilder2 = avtw.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    avtw avtwVar2 = (avtw) createBuilder2.instance;
                    str3.getClass();
                    avtwVar2.b |= 1;
                    avtwVar2.c = str3;
                    a5.copyOnWrite();
                    ((avtv) a5.instance).F((avtw) createBuilder2.mo39build());
                    a5.copyOnWrite();
                    ((avtv) a5.instance).A(b2);
                    a5.copyOnWrite();
                    ((avtv) a5.instance).z(b3);
                    arrf a6 = arrh.a();
                    a6.copyOnWrite();
                    ((arrh) a6.instance).dR((avtv) a5.mo39build());
                    albfVar2.b(str4, (arrh) a6.mo39build());
                }
            }
        }
        return b;
    }

    public abstract alcw b(alcw alcwVar);
}
