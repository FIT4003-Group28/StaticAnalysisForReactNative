package defpackage;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.gmm.locationsharing.modui.shares.CreateSharesFlowFragment$TargetData;
import com.google.android.apps.gmm.shared.util.io.ProtoBufUtil$ParcelableProtoList;
import com.google.android.apps.gmm.sharing.sms.api.SmsController$SmsMessage;
import com.google.android.apps.gmm.sharing.sms.api.SmsController$SmsResult;
import com.google.android.apps.maps.R;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: ajga  reason: default package */
/* loaded from: classes2.dex */
public final class ajga extends fd implements ajig, ajib, bwho, bwhm, ajia {
    public static final dcqe a = dcqe.c("ajga");
    public ajid ad;
    public bwhq ae;
    @dzsi
    public ProgressDialog af;
    public boolean ag;
    @dzsi
    public String ah;
    @dzsi
    public List<diss> ai;
    public boolean aj;
    @dzsi
    public dcdc<disy> ak;
    @dzsi
    public List<disy> al;
    @dzsi
    public ajhz am;
    public int an = 0;
    public dehn<btlu> ao;
    private cqkj ap;
    @dzsi
    private ajhy aq;
    public bvrb b;
    public akfa c;
    public cztz d;
    public ckcw e;
    public btvo f;
    public ajih g;

    private final void aL(dbsg<Integer> dbsgVar) {
        if (dbsgVar.a()) {
            ((ckco) this.e.a(ckgd.b)).a(dbsgVar.b().intValue());
        }
    }

    public static ajga d(String str) {
        ajga ajgaVar = new ajga();
        Bundle bundle = new Bundle();
        bundle.putString("account_id", str);
        ajgaVar.B(bundle);
        return ajgaVar;
    }

    @Override // defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    public final void aJ() {
        this.an = 4;
        ajhy ajhyVar = this.aq;
        if (ajhyVar != null) {
            ajhz ajhzVar = this.am;
            dbsk.s(ajhzVar);
            fd fdVar = (fd) ajhyVar;
            if (fdVar.D()) {
                bvoo.h("Received onCreateSharesFlowComplete callback after saving instance state.", new Object[0]);
                return;
            }
            ajcr ajcrVar = (ajcr) ajhyVar;
            ajcrVar.bo();
            ajhr ajhrVar = (ajhr) ajhzVar;
            if (ajhrVar.a != 3) {
                CreateSharesFlowFragment$TargetData createSharesFlowFragment$TargetData = ajcrVar.f;
                if (createSharesFlowFragment$TargetData != null) {
                    int d = createSharesFlowFragment$TargetData.d();
                    if (d == 0) {
                        throw null;
                    }
                    if (d != 3) {
                        ajcrVar.f = null;
                    }
                }
                ajcrVar.g = 0;
                if (ajcrVar.d != ajco.LOCATION_SHARE) {
                    return;
                }
                synchronized (ajhyVar) {
                    if (((fd) ajhyVar).D()) {
                        bvoo.h("Tried to reset create shares flow after saving instance state.", new Object[0]);
                        return;
                    }
                    gn R = ((fd) ajhyVar).R();
                    String str = ((ajcr) ajhyVar).c;
                    dbsk.s(str);
                    cqkj cqkjVar = ((ajcr) ajhyVar).am;
                    gz b = R.b();
                    ajga ajgaVar = (ajga) R.H("CREATE_SHARES_FLOW_CONTROLLER_TAG");
                    if (ajgaVar != null) {
                        ajgaVar.g();
                        b.u(ajgaVar);
                    }
                    gz b2 = R.b();
                    ajga d2 = d(str);
                    d2.f(cqkjVar);
                    b2.y(d2, "CREATE_SHARES_FLOW_CONTROLLER_TAG");
                    b2.g();
                    ((ajcr) ajhyVar).al = d2;
                    ((ajcr) ajhyVar).al.e(ajhyVar);
                    return;
                }
            }
            ajcrVar.bn();
            CreateSharesFlowFragment$TargetData createSharesFlowFragment$TargetData2 = ajcrVar.f;
            if (createSharesFlowFragment$TargetData2 != null) {
                int d3 = createSharesFlowFragment$TargetData2.d();
                if (d3 == 0) {
                    throw null;
                }
                if (d3 == 1) {
                    CreateSharesFlowFragment$TargetData createSharesFlowFragment$TargetData3 = ajcrVar.f;
                    dbsk.s(createSharesFlowFragment$TargetData3);
                    Intent a2 = createSharesFlowFragment$TargetData3.f().b().a();
                    dbsk.s(a2);
                    Integer num = ajcrVar.e;
                    dbsk.s(num);
                    int intValue = num.intValue();
                    Object[] objArr = new Object[1];
                    dqzv dqzvVar = ((disy) dcft.c(ajhrVar.b)).c;
                    if (dqzvVar == null) {
                        dqzvVar = dqzv.h;
                    }
                    objArr[0] = (dqzvVar.b == 2 ? (dqyb) dqzvVar.c : dqyb.j).d;
                    a2.putExtra("android.intent.extra.TEXT", fdVar.Rq(intValue, objArr));
                    try {
                        Intent a3 = createSharesFlowFragment$TargetData3.f().b().a();
                        dbsk.s(a3);
                        ahyp.a(a3);
                        ((ajcr) ajhyVar).aB.a().i((fd) ajhyVar, a3, 4);
                    } catch (SecurityException unused) {
                        bvoo.h("Permission Denied when attempting to start a third party app.", new Object[0]);
                        Resources Rn = fdVar.Rn();
                        alp a4 = alp.a();
                        String b3 = createSharesFlowFragment$TargetData3.f().b().b();
                        dbsk.s(b3);
                        ajcrVar.bp(ajsb.a(Rn, a4, R.string.THIRD_PARTY_APP_SHARE_FAILED, b3));
                        bwfp bwfpVar = ajcrVar.af;
                        dbsk.s(bwfpVar);
                        Intent a5 = createSharesFlowFragment$TargetData3.f().b().a();
                        dbsk.s(a5);
                        bwfpVar.d(a5);
                    }
                    ajcrVar.f = null;
                }
            }
            ajcrVar.aU();
            ajcrVar.aq.a().B(ahwe.NEW_SHARE);
        }
    }

    @Override // defpackage.ajia
    public final void e(ajhy ajhyVar) {
        dbsk.l(this.aq == null);
        this.aq = ajhyVar;
    }

    @Override // defpackage.ajia
    public final void f(cqkj cqkjVar) {
        this.ap = cqkjVar;
        ajih ajihVar = this.g;
        if (ajihVar != null) {
            ((ajhm) ajihVar).ak = cqkjVar;
        }
    }

    @Override // defpackage.ajia
    public final void g() {
        this.aq = null;
    }

    public final void h() {
        if (this.af != null) {
            if (!J().isFinishing() && !J().isDestroyed()) {
                ProgressDialog progressDialog = this.af;
                dbsk.s(progressDialog);
                progressDialog.dismiss();
            }
            this.af = null;
        }
    }

    public final void i() {
        List<diss> list = this.ai;
        dbsk.s(list);
        dcdc<disy> dcdcVar = this.ak;
        dbsk.s(dcdcVar);
        List<disy> list2 = this.al;
        dbsk.s(list2);
        this.am = ajhz.e(3, list, dcdcVar, list2);
        h();
        aJ();
    }

    @Override // defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        if (bundle2.containsKey("account_id")) {
            this.ah = bundle2.getString("account_id");
        }
        if (bundle != null) {
            dbsk.l(bundle.containsKey("state"));
            this.an = bundle.getInt("state", 0);
            dbsk.l(bundle.containsKey("account_id"));
            this.ah = bundle.getString("account_id");
            if (this.an != 0) {
                dbsk.l(bundle.containsKey("requested_shares"));
                ProtoBufUtil$ParcelableProtoList protoBufUtil$ParcelableProtoList = (ProtoBufUtil$ParcelableProtoList) bundle.getParcelable("requested_shares");
                dbsk.s(protoBufUtil$ParcelableProtoList);
                dbsk.l(!protoBufUtil$ParcelableProtoList.b());
                this.ai = dcdc.r(protoBufUtil$ParcelableProtoList.a((dssr) diss.d.cu(7)));
                this.aj = bundle.getBoolean("notice_shown", false);
                if (this.an == 3) {
                    dbsk.l(bundle.containsKey("created_shares"));
                    ProtoBufUtil$ParcelableProtoList protoBufUtil$ParcelableProtoList2 = (ProtoBufUtil$ParcelableProtoList) bundle.getParcelable("created_shares");
                    dbsk.s(protoBufUtil$ParcelableProtoList2);
                    dbsk.l(!protoBufUtil$ParcelableProtoList2.b());
                    this.ak = dcdc.r(protoBufUtil$ParcelableProtoList2.a((dssr) disy.d.cu(7)));
                    dbsk.l(bundle.containsKey("undelivered_shares"));
                    ProtoBufUtil$ParcelableProtoList protoBufUtil$ParcelableProtoList3 = (ProtoBufUtil$ParcelableProtoList) bundle.getParcelable("undelivered_shares");
                    dbsk.s(protoBufUtil$ParcelableProtoList3);
                    dbsk.l(!protoBufUtil$ParcelableProtoList3.b());
                    this.al = dcdc.r(protoBufUtil$ParcelableProtoList3.a((dssr) disy.d.cu(7)));
                }
            }
        }
        gn R = R();
        gz b = R.b();
        ajgc ajgcVar = (ajgc) R().H("CREATE_SHARES_TAG");
        if (ajgcVar == null) {
            ajgcVar = new ajgc();
            b.y(ajgcVar, "CREATE_SHARES_TAG");
        }
        this.ad = ajgcVar;
        String str = this.ah;
        dbsk.s(str);
        this.g = ajhl.a(this, b, str, 1, this.ap);
        this.ae = bwhe.a(R, b);
        if (!b.q()) {
            b.g();
        }
        dkof dkofVar = this.f.getLocationSharingParameters().q;
        if (dkofVar == null) {
            dkofVar = dkof.s;
        }
        if (dkofVar.h) {
            this.ae.d();
        }
        final deig d = deig.d();
        this.b.b(new Runnable(this, d) { // from class: ajfv
            private final ajga a;
            private final deig b;

            {
                this.a = this;
                this.b = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final ajga ajgaVar = this.a;
                final deig deigVar = this.b;
                akfa akfaVar = ajgaVar.c;
                String str2 = ajgaVar.ah;
                dbsk.s(str2);
                final btlu n = akfaVar.n(str2);
                ajgaVar.b.b(new Runnable(ajgaVar, n, deigVar) { // from class: ajfz
                    private final ajga a;
                    private final btlu b;
                    private final deig c;

                    {
                        this.a = ajgaVar;
                        this.b = n;
                        this.c = deigVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ajga ajgaVar2 = this.a;
                        btlu btluVar = this.b;
                        deig deigVar2 = this.c;
                        if (btluVar == null) {
                            ajgaVar2.am = ajhz.e(4, dcdc.e(), dcdc.e(), dcdc.e());
                            ajgaVar2.aJ();
                        }
                        deigVar2.j(btluVar);
                    }
                }, bvrj.UI_THREAD);
            }
        }, bvrj.BACKGROUND_THREADPOOL);
        this.ao = d;
    }

    @Override // defpackage.ajig
    public final void p() {
        if (D() || !this.ag) {
            bvoo.h("onPrerequisiteCheckComplete callback after saving state or when stopped.", new Object[0]);
        } else if (this.an != 1) {
        } else {
            int i = ((ajhm) this.g).ap;
            if (i == 1) {
                this.an = 0;
                this.ao.Pk(new Runnable(this) { // from class: ajfy
                    private final ajga a;

                    {
                        this.a = this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:101:0x0245  */
                    /* JADX WARN: Removed duplicated region for block: B:115:0x0267 A[SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 646
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajfy.run():void");
                    }
                }, this.b.h());
            } else if (i != 2) {
                if (i == 3) {
                    List<diss> list = this.ai;
                    dbsk.s(list);
                    this.am = ajhz.e(0, list, dcdc.e(), dcdc.e());
                    aJ();
                    return;
                }
                bvoo.h("Unexpected state: %s", Integer.valueOf(i));
            } else {
                cztq a2 = cztt.a(this.d);
                a2.c = Rp(R.string.UPDATE_SHARES_OPERATION_FAILED);
                a2.c();
                List<diss> list2 = this.ai;
                dbsk.s(list2);
                this.am = ajhz.e(1, list2, dcdc.e(), dcdc.e());
                aJ();
            }
        }
    }

    @Override // defpackage.fd
    public final void s() {
        super.s();
        this.ag = true;
        this.g.d(this);
        ((ajhm) this.g).ak = this.ap;
        this.ae.i(this);
        this.ae.f(this);
        this.b.b(new Runnable(this) { // from class: ajfw
            private final ajga a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ajga ajgaVar = this.a;
                ajid ajidVar = ajgaVar.ad;
                bvrj.UI_THREAD.c();
                ajgc ajgcVar = (ajgc) ajidVar;
                ajgcVar.b = ajgaVar;
                if (ajgcVar.c) {
                    ajgcVar.e();
                }
            }
        }, bvrj.UI_THREAD);
        if (((ajhm) this.g).ap > 0) {
            this.b.b(new Runnable(this) { // from class: ajfx
                private final ajga a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.p();
                }
            }, bvrj.UI_THREAD);
        }
    }

    @Override // defpackage.fd
    public final void t(Bundle bundle) {
        bundle.putString("account_id", this.ah);
        bundle.putInt("state", this.an);
        bundle.putBoolean("notice_shown", this.aj);
        List<diss> list = this.ai;
        if (list != null) {
            bundle.putParcelable("requested_shares", new ProtoBufUtil$ParcelableProtoList(list));
        }
        dcdc<disy> dcdcVar = this.ak;
        if (dcdcVar != null) {
            bundle.putParcelable("created_shares", new ProtoBufUtil$ParcelableProtoList(dcdcVar));
        }
        List<disy> list2 = this.al;
        if (list2 != null) {
            bundle.putParcelable("undelivered_shares", new ProtoBufUtil$ParcelableProtoList(list2));
        }
    }

    @Override // defpackage.fd
    public final void u() {
        super.u();
        this.ag = false;
        ((ajgc) this.ad).b = null;
        this.g.e();
        this.ae.g();
        this.ae.p();
        h();
    }

    @Override // defpackage.bwhm
    public final void q(int i, dbsg<Integer> dbsgVar) {
        if (D() || !this.ag) {
            bvoo.h("Received onGroupMessageSent callback after saving instance state or when stopped.", new Object[0]);
            return;
        }
        aK(i);
        aL(dbsgVar);
        if (i == 6) {
            dcdc<disy> dcdcVar = this.ak;
            dbsk.s(dcdcVar);
            List<disy> list = this.al;
            dbsk.s(list);
            list.remove((disy) dcft.s(dcdcVar));
        }
        h();
        i();
    }

    @Override // defpackage.bwho
    public final void w(List<SmsController$SmsResult> list, List<SmsController$SmsMessage> list2, boolean z) {
        dqyb dqybVar;
        if (D() || !this.ag) {
            bvoo.h("Received onProgressUpdate callback after saving instance state or when stopped.", new Object[0]);
        } else if (z) {
            dbsk.l(list2.isEmpty());
            for (SmsController$SmsResult smsController$SmsResult : list) {
                aK(smsController$SmsResult.b());
                aL(smsController$SmsResult.c());
                if (smsController$SmsResult.b() == 4 || smsController$SmsResult.b() == 6) {
                    List<disy> list3 = this.al;
                    dbsk.s(list3);
                    Iterator<disy> it = list3.iterator();
                    while (it.hasNext()) {
                        dqzv dqzvVar = it.next().c;
                        if (dqzvVar == null) {
                            dqzvVar = dqzv.h;
                        }
                        if (dqzvVar.b == 2) {
                            dqybVar = (dqyb) dqzvVar.c;
                        } else {
                            dqybVar = dqyb.j;
                        }
                        if (dqybVar.b == 6 && ((dqya) dqybVar.c).d.equals(smsController$SmsResult.a().a())) {
                            it.remove();
                        }
                    }
                }
            }
            h();
            i();
        }
    }

    private final void aK(int i) {
        if (i == 6) {
            ((ckco) this.e.a(ckgd.a)).a(ckfz.a(1));
        } else if (i != 8) {
        } else {
            ((ckco) this.e.a(ckgd.a)).a(ckfz.a(2));
        }
    }
}
