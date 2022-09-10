package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.gmm.shared.util.io.ProtoBufUtil$ParcelableProtoList;
import com.google.android.apps.gmm.sharing.sms.api.SmsController$SmsMessage;
import com.google.android.apps.gmm.sharing.sms.api.SmsController$SmsResult;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
import java.util.List;
/* compiled from: PG */
/* renamed from: ajfu  reason: default package */
/* loaded from: classes2.dex */
public final class ajfu extends fd implements ajhx, ajig, aiaz, bwhm, bwho {
    public static final dcqe a = dcqe.c("ajfu");
    @dzsi
    public dcdc<dqzv> ad;
    public btvo ae;
    public ckcw af;
    public ajus ag;
    private ajih ah;
    @dzsi
    private String ai;
    private cqkj aj;
    private boolean ak;
    @dzsi
    private ahvk al;
    @dzsi
    private dcdc<dqzx> an;
    @dzsi
    private ajhw ao;
    public aiba c;
    public bwhq d;
    @dzsi
    public SendKitPickerResult e;
    @dzsi
    public dcdc<dqzv> g;
    public int b = 0;
    public int f = R.string.SMS_SHARE_TEXT;
    @dzsi
    private ajhv am = null;

    private final void aL(dbsg<Integer> dbsgVar) {
        if (dbsgVar.a()) {
            ((ckco) this.af.a(ckgd.b)).a(dbsgVar.b().intValue());
        }
    }

    public static ajfu d(String str, ahvk ahvkVar) {
        ajfu ajfuVar = new ajfu();
        Bundle bundle = new Bundle();
        bundle.putString("account_id", str);
        bundle.putInt("KEY_JOURNEY_SHARING_MODE", ahvkVar.ordinal());
        ajfuVar.B(bundle);
        return ajfuVar;
    }

    @Override // defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    public final void aJ(int i) {
        dcdc<dqzx> dcdcVar = this.an;
        dbsk.s(dcdcVar);
        dcdc<dqzv> dcdcVar2 = this.g;
        dbsk.s(dcdcVar2);
        dcdc<dqzv> dcdcVar3 = this.ad;
        dbsk.s(dcdcVar3);
        ajhq ajhqVar = new ajhq(i, dcdcVar, dcdcVar2, dcdcVar3);
        this.ao = ajhqVar;
        this.b = 4;
        ajhv ajhvVar = this.am;
        if (ajhvVar != null) {
            dbsk.s(ajhqVar);
            ajhvVar.w(ajhqVar);
        }
    }

    @Override // defpackage.ajhx
    public final void e(String str, boolean z) {
        int i = this.b;
        if (i != 0) {
            bvoo.h("startCreateJourneySharesFlow (link share) called when state is %d", Integer.valueOf(i));
            return;
        }
        this.ad = dcdc.e();
        this.g = dcdc.e();
        this.ak = z;
        dqzw bZ = dqzx.c.bZ();
        dqxy bZ2 = dqyb.j.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dqyb dqybVar = (dqyb) bZ2.b;
        str.getClass();
        dqybVar.b = 7;
        dqybVar.c = str;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqzx dqzxVar = (dqzx) bZ.b;
        dqyb bK = bZ2.bK();
        bK.getClass();
        dqzxVar.b = bK;
        dqzxVar.a = 2;
        this.an = dcdc.f(bZ.bK());
        dkof dkofVar = this.ae.getLocationSharingParameters().q;
        if (dkofVar == null) {
            dkofVar = dkof.s;
        }
        if (dkofVar.f) {
            aJ(5);
        }
        this.b = 1;
        this.ah.f();
    }

    @Override // defpackage.ajhx
    public final void f(SendKitPickerResult sendKitPickerResult, int i, boolean z) {
        int i2 = this.b;
        if (i2 != 0) {
            bvoo.h("startCreateJourneySharesFlow (sendkit) called when state is %d", Integer.valueOf(i2));
            return;
        }
        this.e = sendKitPickerResult;
        this.f = i;
        this.ak = z;
        this.ad = dcdc.e();
        this.g = dcdc.e();
        dbsk.s(sendKitPickerResult);
        boolean e = ajus.e(sendKitPickerResult.a(), false);
        dccx dccxVar = new dccx();
        dcdc<dqzx> b = this.ag.b(sendKitPickerResult.a(), !e);
        dccxVar.i(b);
        if (b.size() != sendKitPickerResult.a().b.size()) {
            dbsk.l(e);
            dqzw bZ = dqzx.c.bZ();
            dqxy bZ2 = dqyb.j.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dqyb dqybVar = (dqyb) bZ2.b;
            dqybVar.b = 7;
            dqybVar.c = "Group SMS Journey Share";
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dqzx dqzxVar = (dqzx) bZ.b;
            dqyb bK = bZ2.bK();
            bK.getClass();
            dqzxVar.b = bK;
            dqzxVar.a = 2;
            dccxVar.g(bZ.bK());
        }
        this.an = dccxVar.f();
        dkof dkofVar = this.ae.getLocationSharingParameters().q;
        if (dkofVar == null) {
            dkofVar = dkof.s;
        }
        if (dkofVar.f) {
            aJ(5);
        }
        this.b = 1;
        this.ah.f();
    }

    @Override // defpackage.ajhx
    public final void g(ajhv ajhvVar) {
        dbsk.l(this.am == null);
        this.am = ajhvVar;
    }

    @Override // defpackage.ajhx
    public final void h(cqkj cqkjVar) {
        this.aj = cqkjVar;
        ajih ajihVar = this.ah;
        if (ajihVar != null) {
            ((ajhm) ajihVar).ak = cqkjVar;
        }
    }

    @Override // defpackage.ajhx
    public final void i() {
        this.am = null;
    }

    @Override // defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (this.o.containsKey("account_id")) {
            this.ai = this.o.getString("account_id");
        }
        if (this.o.containsKey("KEY_JOURNEY_SHARING_MODE")) {
            this.al = ahvk.values()[this.o.getInt("KEY_JOURNEY_SHARING_MODE")];
        }
        boolean z = true;
        if (bundle != null) {
            this.b = bundle.getInt("state", 0);
            this.ai = bundle.getString("account_id");
            this.al = ahvk.values()[bundle.getInt("KEY_JOURNEY_SHARING_MODE")];
            this.ak = bundle.getBoolean("notice_shown", false);
            if (bundle.containsKey("KEY_SAVED_RECIPIENTS_LIST")) {
                ProtoBufUtil$ParcelableProtoList protoBufUtil$ParcelableProtoList = (ProtoBufUtil$ParcelableProtoList) bundle.getParcelable("KEY_SAVED_RECIPIENTS_LIST");
                dbsk.s(protoBufUtil$ParcelableProtoList);
                dbsk.l(!protoBufUtil$ParcelableProtoList.b());
                this.an = dcdc.r(protoBufUtil$ParcelableProtoList.a((dssr) dqzx.c.cu(7)));
            }
            if (bundle.containsKey("saved_sendkit_result")) {
                this.e = (SendKitPickerResult) bundle.getParcelable("saved_sendkit_result");
            }
            if (bundle.containsKey("KEY_SHARE_MESSAGE_RESOURCE_ID")) {
                this.f = bundle.getInt("KEY_SHARE_MESSAGE_RESOURCE_ID");
            }
        }
        String str = this.ai;
        if (str == null || str.isEmpty()) {
            z = false;
        }
        dbsk.l(z);
        gn R = R();
        gz b = R.b();
        String str2 = this.ai;
        dbsk.s(str2);
        this.ah = ajhl.a(this, b, str2, 2, this.aj);
        aiba aibaVar = (aiba) R.H("CREATE_JOURNEY_SHARES_RETAIN_FRAGMENT_TAG");
        this.c = aibaVar;
        if (aibaVar == null) {
            String str3 = this.ai;
            dbsk.s(str3);
            ahvk ahvkVar = this.al;
            dbsk.s(ahvkVar);
            aiba aibaVar2 = new aiba();
            Bundle bundle2 = new Bundle();
            bundle2.putString("ACCOUNT_ID_KEY", str3);
            bundle2.putInt("JOURNEY_SHARING_MODE_KEY", ahvkVar.ordinal());
            aibaVar2.B(bundle2);
            this.c = aibaVar2;
            b.y(aibaVar2, "CREATE_JOURNEY_SHARES_RETAIN_FRAGMENT_TAG");
        }
        this.d = bwhe.a(R, b);
        dkof dkofVar = this.ae.getLocationSharingParameters().q;
        if (dkofVar == null) {
            dkofVar = dkof.s;
        }
        if (dkofVar.h) {
            this.d.d();
        }
        if (!b.q()) {
            b.g();
        }
    }

    @Override // defpackage.bwhm
    public final void q(int i, dbsg<Integer> dbsgVar) {
        int i2 = this.b;
        if (i2 != 3) {
            bvoo.h("onGroupMessageSent called when state is %d", Integer.valueOf(i2));
            return;
        }
        aK(i);
        aL(dbsgVar);
        if (i == 6) {
            dcdc<dqzv> dcdcVar = this.g;
            dbsk.s(dcdcVar);
            final dqzv dqzvVar = (dqzv) dcft.s(dcdcVar);
            dcdc<dqzv> dcdcVar2 = this.ad;
            dbsk.s(dcdcVar2);
            this.ad = dcdc.q(dcft.i(dcdcVar2, new dbsl(dqzvVar) { // from class: ajfr
                private final dqzv a;

                {
                    this.a = dqzvVar;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return ((dqzv) obj).equals(this.a);
                }
            }));
        }
        aJ(3);
    }

    @Override // defpackage.fd
    public final void s() {
        super.s();
        this.ah.d(this);
        ((ajhm) this.ah).ak = this.aj;
        aiba aibaVar = this.c;
        dbsk.l(aibaVar.ad == null);
        aibaVar.ad = this;
        this.d.i(this);
        this.d.f(this);
        dcdc<dqzx> dcdcVar = this.an;
        if (dcdcVar == null || this.b != 2) {
            return;
        }
        this.c.d(dcdcVar, this.ak);
    }

    @Override // defpackage.fd
    public final void t(Bundle bundle) {
        bundle.putString("account_id", this.ai);
        bundle.putInt("state", this.b);
        ahvk ahvkVar = this.al;
        if (ahvkVar != null) {
            bundle.putInt("KEY_JOURNEY_SHARING_MODE", ahvkVar.ordinal());
        }
        bundle.putInt("KEY_SHARE_MESSAGE_RESOURCE_ID", this.f);
        if (this.an != null) {
            bundle.putBoolean("notice_shown", this.ak);
            dcdc<dqzx> dcdcVar = this.an;
            dbsk.s(dcdcVar);
            bundle.putParcelable("KEY_SAVED_RECIPIENTS_LIST", new ProtoBufUtil$ParcelableProtoList(dcdcVar));
        }
        SendKitPickerResult sendKitPickerResult = this.e;
        if (sendKitPickerResult != null) {
            bundle.putParcelable("saved_sendkit_result", sendKitPickerResult);
        }
    }

    @Override // defpackage.fd
    public final void u() {
        super.u();
        this.ah.e();
        this.c.ad = null;
        this.d.g();
        this.d.p();
        i();
    }

    @Override // defpackage.bwho
    public final void w(List<SmsController$SmsResult> list, List<SmsController$SmsMessage> list2, boolean z) {
        int i = this.b;
        if (i != 3) {
            bvoo.h("onProgressUpdate (SMS) called when state is %d", Integer.valueOf(i));
        } else if (z) {
            dbsk.l(list2.isEmpty());
            for (final SmsController$SmsResult smsController$SmsResult : list) {
                aK(smsController$SmsResult.b());
                aL(smsController$SmsResult.c());
                if (smsController$SmsResult.b() == 4 || smsController$SmsResult.b() == 6) {
                    dcdc<dqzv> dcdcVar = this.ad;
                    dbsk.s(dcdcVar);
                    this.ad = dcdc.q(dcft.i(dcdcVar, new dbsl(smsController$SmsResult) { // from class: ajfs
                        private final SmsController$SmsResult a;

                        {
                            this.a = smsController$SmsResult;
                        }

                        @Override // defpackage.dbsl
                        public final boolean a(Object obj) {
                            dqyb dqybVar;
                            SmsController$SmsResult smsController$SmsResult2 = this.a;
                            dqzv dqzvVar = (dqzv) obj;
                            if (dqzvVar.b == 2) {
                                dqybVar = (dqyb) dqzvVar.c;
                            } else {
                                dqybVar = dqyb.j;
                            }
                            return dqybVar.b == 6 && ((dqya) dqybVar.c).d.equals(smsController$SmsResult2.a().a());
                        }
                    }));
                }
            }
            aJ(3);
        }
    }

    @Override // defpackage.ajig
    public final void p() {
        if (this.b != 1) {
            return;
        }
        int i = ((ajhm) this.ah).ap;
        if (i == 1) {
            this.b = 2;
            aiba aibaVar = this.c;
            dcdc<dqzx> dcdcVar = this.an;
            dbsk.s(dcdcVar);
            aibaVar.d(dcdcVar, this.ak);
        } else if (i == 2) {
            aJ(1);
        } else if (i == 3) {
            aJ(0);
        } else {
            bvoo.h("Unexpected state: %s", Integer.valueOf(i));
        }
    }

    private final void aK(int i) {
        if (i == 6) {
            ((ckco) this.af.a(ckgd.a)).a(ckfz.a(1));
        } else if (i != 8) {
        } else {
            ((ckco) this.af.a(ckgd.a)).a(ckfz.a(2));
        }
    }
}
