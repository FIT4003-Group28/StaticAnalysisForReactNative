package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.gmm.shared.util.io.ProtoBufUtil$ParcelableProtoList;
import com.google.android.apps.gmm.sharing.sms.api.SmsController$GroupSmsMessage;
import com.google.android.apps.gmm.sharing.sms.api.SmsController$SmsMessage;
import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
import java.util.List;
/* compiled from: PG */
/* renamed from: aiba  reason: default package */
/* loaded from: classes2.dex */
public final class aiba extends fd {
    public aibo a;
    @dzsi
    public aiaz ad;
    @dzsi
    public dehn<aibb> ae;
    public akfa b;
    public bvrb c;
    @dzsi
    public dcdc<dqzx> d;
    @dzsi
    public btlu e;
    public String f;
    public ahvk g;

    @Override // defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    public final void d(dcdc<dqzx> dcdcVar, final boolean z) {
        dbsk.l(this.d == null);
        this.d = dcdcVar;
        final deig d = deig.d();
        this.c.b(new Runnable(this, d) { // from class: aiaw
            private final aiba a;
            private final deig b;

            {
                this.a = this;
                this.b = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final aiba aibaVar = this.a;
                final deig deigVar = this.b;
                aibaVar.e = aibaVar.b.n(aibaVar.f);
                if (aibaVar.e == null) {
                    return;
                }
                aibaVar.c.b(new Runnable(aibaVar, deigVar) { // from class: aiax
                    private final aiba a;
                    private final deig b;

                    {
                        this.a = aibaVar;
                        this.b = deigVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        aiba aibaVar2 = this.a;
                        deig deigVar2 = this.b;
                        btlu btluVar = aibaVar2.e;
                        dbsk.s(btluVar);
                        bvrj.UI_THREAD.c();
                        deigVar2.j(aibaVar2.a.c(666L, btluVar, aibaVar2.g));
                    }
                }, bvrj.UI_THREAD);
            }
        }, bvrj.BACKGROUND_THREADPOOL);
        this.ae = d;
        dbsk.s(d);
        d.Pk(new Runnable(this, z) { // from class: aiav
            private final aiba a;
            private final boolean b;

            {
                this.a = this;
                this.b = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final aiba aibaVar = this.a;
                boolean z2 = this.b;
                dehn<aibb> dehnVar = aibaVar.ae;
                dbsk.s(dehnVar);
                dcdc<dqzx> dcdcVar2 = aibaVar.d;
                dbsk.s(dcdcVar2);
                final dehn<List<dqzv>> d2 = ((aibb) deha.s(dehnVar)).d(dcdcVar2, z2);
                d2.Pk(new Runnable(aibaVar, d2) { // from class: aiay
                    private final aiba a;
                    private final dehn b;

                    {
                        this.a = aibaVar;
                        this.b = d2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        dbsg i;
                        aiba aibaVar2 = this.a;
                        dehn dehnVar2 = this.b;
                        aiaz aiazVar = aibaVar2.ad;
                        if (aiazVar != null) {
                            List<dqzv> list = (List) deha.s(dehnVar2);
                            ajfu ajfuVar = (ajfu) aiazVar;
                            boolean z3 = false;
                            if (ajfuVar.b != 2) {
                                bvoo.h("onCreateJourneySharesComplete called when state is %d", Integer.valueOf(ajfuVar.b));
                                return;
                            }
                            ajfuVar.g = dcdc.r(list);
                            ajfuVar.ad = dcdc.q(dcft.i(list, ajfq.a));
                            if (list.isEmpty()) {
                                ajfuVar.aJ(2);
                                return;
                            }
                            ajfuVar.b = 3;
                            if (ajfuVar.e == null) {
                                ajfuVar.aJ(3);
                                return;
                            }
                            dccx G = dcdc.G(list.size());
                            for (dqzv dqzvVar : list) {
                                dbsg<SmsController$SmsMessage> b = ajii.b(dqzvVar, ((fd) aiazVar).H(), ajfuVar.f);
                                if (b.a()) {
                                    G.g(b.b());
                                }
                            }
                            dqzv dqzvVar2 = (dqzv) dcft.s(list);
                            SendKitPickerResult sendKitPickerResult = ajfuVar.e;
                            dbsk.s(sendKitPickerResult);
                            Context H = ((fd) aiazVar).H();
                            int i2 = ajfuVar.f;
                            czgw a = sendKitPickerResult.a();
                            if (!ajus.e(a, false)) {
                                i = dbpy.a;
                            } else {
                                dccx dccxVar = new dccx();
                                for (czha czhaVar : a.b) {
                                    czgz b2 = czgz.b(czhaVar.b);
                                    if (b2 == null) {
                                        b2 = czgz.UNKNOWN_TYPE;
                                    }
                                    if (b2 == czgz.SMS) {
                                        dccxVar.g(czhaVar.c);
                                    }
                                }
                                dcdc f = dccxVar.f();
                                Object[] objArr = new Object[1];
                                objArr[0] = (dqzvVar2.b == 2 ? (dqyb) dqzvVar2.c : dqyb.j).d;
                                i = dbsg.i(SmsController$GroupSmsMessage.f(f, H.getString(i2, objArr)));
                            }
                            dcdc f2 = G.f();
                            if (f2.isEmpty() || !i.a()) {
                                z3 = true;
                            }
                            dbsk.l(z3);
                            if (f2.isEmpty() && !i.a()) {
                                ajfuVar.aJ(3);
                            } else if (i.a()) {
                                ajfuVar.d.e((SmsController$GroupSmsMessage) i.b());
                            } else {
                                ajfuVar.d.h(f2);
                            }
                        }
                    }
                }, aibaVar.c.h());
            }
        }, this.c.h());
    }

    public final void e() {
        dehn<aibb> dehnVar = this.ae;
        if (dehnVar == null) {
            return;
        }
        dehnVar.Pk(new Runnable(this) { // from class: aiau
            private final aiba a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aiba aibaVar = this.a;
                dehn<aibb> dehnVar2 = aibaVar.ae;
                dbsk.s(dehnVar2);
                aibb aibbVar = (aibb) deha.s(dehnVar2);
                dbsk.s(aibbVar);
                if (!aibbVar.b()) {
                    dbsk.s(aibbVar);
                    aibbVar.a();
                }
                aibaVar.ae = null;
            }
        }, this.c.h());
    }

    @Override // defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        dcdc<dqzx> dcdcVar;
        super.l(bundle);
        dbsk.l(this.o.containsKey("ACCOUNT_ID_KEY"));
        this.f = this.o.getString("ACCOUNT_ID_KEY");
        this.g = ahvk.values()[this.o.getInt("JOURNEY_SHARING_MODE_KEY")];
        if (bundle != null) {
            this.f = bundle.getString("ACCOUNT_ID_KEY");
            this.g = ahvk.values()[bundle.getInt("JOURNEY_SHARING_MODE_KEY")];
            if (bundle.containsKey("SAVED_RECIPIENTS_LIST_KEY")) {
                ProtoBufUtil$ParcelableProtoList protoBufUtil$ParcelableProtoList = (ProtoBufUtil$ParcelableProtoList) bundle.getParcelable("SAVED_RECIPIENTS_LIST_KEY");
                dbsk.s(protoBufUtil$ParcelableProtoList);
                dbsk.l(!protoBufUtil$ParcelableProtoList.b());
                dcdcVar = dcdc.r(protoBufUtil$ParcelableProtoList.a((dssr) dqzx.c.cu(7)));
            } else {
                dcdcVar = null;
            }
            this.d = dcdcVar;
        }
    }

    @Override // defpackage.fd
    public final void t(Bundle bundle) {
        bundle.putString("ACCOUNT_ID_KEY", this.f);
        bundle.putInt("JOURNEY_SHARING_MODE_KEY", this.g.ordinal());
        dcdc<dqzx> dcdcVar = this.d;
        if (dcdcVar != null) {
            bundle.putParcelable("SAVED_RECIPIENTS_LIST_KEY", new ProtoBufUtil$ParcelableProtoList(dcdcVar));
        }
        e();
    }
}
