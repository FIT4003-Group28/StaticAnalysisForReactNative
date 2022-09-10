package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.apps.gmm.sharing.sms.api.AutoValue_SmsController_GroupSmsMessage;
import com.google.android.apps.gmm.sharing.sms.api.AutoValue_SmsController_SmsResult;
import com.google.android.apps.gmm.sharing.sms.api.SmsController$GroupSmsMessage;
import com.google.android.apps.gmm.sharing.sms.api.SmsController$SmsMessage;
import com.google.android.apps.gmm.sharing.sms.api.SmsController$SmsResult;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bwhf  reason: default package */
/* loaded from: classes4.dex */
public final class bwhf extends fd implements bwhq {
    @dzsi
    private bwhm c;
    @dzsi
    private bwho d;
    @dzsi
    private ArrayList<SmsController$SmsMessage> e;
    @dzsi
    private SmsController$GroupSmsMessage g;
    private int a = 0;
    private int b = 0;
    private ArrayList<SmsController$SmsResult> f = dchl.a();
    private final List<dehn<SmsController$SmsResult>> ad = dchl.a();

    private final int aJ(SmsController$GroupSmsMessage smsController$GroupSmsMessage) {
        bwhp f = SmsController$SmsMessage.f();
        f.c(smsController$GroupSmsMessage.b());
        f.d(TextUtils.join(";", dcft.o(smsController$GroupSmsMessage.a(), bwhd.a)));
        bwhh bwhhVar = (bwhh) f;
        bwhhVar.a = smsController$GroupSmsMessage.c();
        bwhhVar.b = smsController$GroupSmsMessage.d();
        return aK(f.a());
    }

    private final int aK(SmsController$SmsMessage smsController$SmsMessage) {
        Intent intent = new Intent();
        intent.addFlags(134742016);
        intent.putExtra("sms_body", smsController$SmsMessage.b());
        intent.putExtra("android.intent.extra.TEXT", smsController$SmsMessage.b());
        String valueOf = String.valueOf(smsController$SmsMessage.a());
        intent.setData(Uri.parse(valueOf.length() != 0 ? "sms:".concat(valueOf) : new String("sms:")));
        intent.putExtra("address", smsController$SmsMessage.a());
        if (!dbsj.d(smsController$SmsMessage.c())) {
            String c = smsController$SmsMessage.c();
            dbsk.s(c);
            intent.putExtra("subject", c);
        }
        if (!dbsj.d(smsController$SmsMessage.d())) {
            intent.setType("image/*");
            String d = smsController$SmsMessage.d();
            dbsk.s(d);
            intent.putExtra("android.intent.extra.STREAM", Uri.parse(d));
            intent.addFlags(1);
        }
        intent.setAction("android.intent.action.SENDTO");
        intent.setPackage(Telephony.Sms.getDefaultSmsPackage(H()));
        if (H().getPackageManager().resolveActivity(intent, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != null) {
            if (J() instanceof gga) {
                afha wc = ((afgz) btsq.b(afgz.class, J())).wc();
                dbsk.s(wc);
                wc.i(this, intent, 4);
                return 6;
            }
            Y(intent);
            return 6;
        }
        return 8;
    }

    private final void aL(int i) {
        this.b = i;
        this.a = 1;
    }

    private final void aM(SmsController$SmsMessage smsController$SmsMessage, int i, dbsg<Integer> dbsgVar) {
        this.f.add(new AutoValue_SmsController_SmsResult(smsController$SmsMessage, i, dbsgVar));
        bwho bwhoVar = this.d;
        if (bwhoVar != null) {
            ArrayList<SmsController$SmsResult> arrayList = this.f;
            ArrayList<SmsController$SmsMessage> arrayList2 = this.e;
            dbsk.s(arrayList2);
            ArrayList<SmsController$SmsMessage> arrayList3 = this.e;
            dbsk.s(arrayList3);
            bwhoVar.w(arrayList, arrayList2, arrayList3.isEmpty());
        }
    }

    private final void aN(SmsController$SmsMessage smsController$SmsMessage, int i) {
        SmsController$SmsResult smsController$SmsResult;
        Iterator<SmsController$SmsResult> it = this.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                smsController$SmsResult = null;
                break;
            }
            smsController$SmsResult = it.next();
            if (smsController$SmsResult.a().equals(smsController$SmsMessage)) {
                it.remove();
                break;
            }
        }
        if (smsController$SmsResult == null) {
            aM(smsController$SmsMessage, i, dbpy.a);
        } else {
            aM(smsController$SmsMessage, i, smsController$SmsResult.c());
        }
    }

    private final void q() {
        boolean z = false;
        dbsk.l(this.a == 1);
        if (this.b == 1) {
            z = true;
        }
        dbsk.l(z);
        SmsController$GroupSmsMessage smsController$GroupSmsMessage = this.g;
        dbsk.s(smsController$GroupSmsMessage);
        if (!smsController$GroupSmsMessage.e()) {
            this.a = 2;
            bwhm bwhmVar = this.c;
            if (bwhmVar == null) {
                return;
            }
            bwhmVar.q(5, dbpy.a);
            return;
        }
        int aJ = aJ(smsController$GroupSmsMessage);
        this.a = 2;
        bwhm bwhmVar2 = this.c;
        if (bwhmVar2 == null) {
            return;
        }
        bwhmVar2.q(aJ, dbpy.a);
    }

    private final void w() {
        dbsk.l(this.a == 1);
        dbsk.l(this.b == 2);
        ArrayList<SmsController$SmsMessage> arrayList = this.e;
        dbsk.s(arrayList);
        ArrayList c = dchl.c(arrayList);
        int size = c.size();
        for (int i = 0; i < size; i++) {
            SmsController$SmsMessage smsController$SmsMessage = (SmsController$SmsMessage) c.get(i);
            if (!smsController$SmsMessage.e()) {
                ArrayList<SmsController$SmsMessage> arrayList2 = this.e;
                dbsk.s(arrayList2);
                arrayList2.remove(smsController$SmsMessage);
                aM(smsController$SmsMessage, 5, dbpy.a);
            }
        }
        dbsk.s(this.e);
        ArrayList<SmsController$SmsMessage> arrayList3 = this.e;
        dbsk.s(arrayList3);
        if (arrayList3.isEmpty()) {
            this.a = 2;
            return;
        }
        ArrayList<SmsController$SmsMessage> arrayList4 = this.e;
        dbsk.s(arrayList4);
        if (arrayList4.size() == 1) {
            ArrayList<SmsController$SmsMessage> arrayList5 = this.e;
            dbsk.s(arrayList5);
            SmsController$SmsMessage smsController$SmsMessage2 = (SmsController$SmsMessage) dcft.c(arrayList5);
            int aK = aK(smsController$SmsMessage2);
            ArrayList<SmsController$SmsMessage> arrayList6 = this.e;
            dbsk.s(arrayList6);
            arrayList6.clear();
            aN(smsController$SmsMessage2, aK);
        } else {
            ArrayList<SmsController$SmsMessage> arrayList7 = this.e;
            dbsk.s(arrayList7);
            ArrayList a = dchl.a();
            Iterator<SmsController$SmsMessage> it = arrayList7.iterator();
            AutoValue_SmsController_GroupSmsMessage autoValue_SmsController_GroupSmsMessage = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            boolean z = true;
            while (true) {
                if (!it.hasNext()) {
                    bwhg bwhgVar = new bwhg();
                    bwhgVar.a(true);
                    dbsk.s(str);
                    bwhgVar.b = str;
                    dcdc r = dcdc.r(a);
                    if (r != null) {
                        bwhgVar.a = r;
                        bwhgVar.c = str2;
                        bwhgVar.d = str3;
                        bwhgVar.a(z);
                        String str4 = bwhgVar.a == null ? " messageRecipients" : "";
                        if (bwhgVar.b == null) {
                            str4 = str4.concat(" messageContents");
                        }
                        if (bwhgVar.e == null) {
                            str4 = String.valueOf(str4).concat(" allowFallbackToIntent");
                        }
                        if (!str4.isEmpty()) {
                            String valueOf = String.valueOf(str4);
                            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                        }
                        autoValue_SmsController_GroupSmsMessage = new AutoValue_SmsController_GroupSmsMessage(bwhgVar.a, bwhgVar.b, bwhgVar.c, bwhgVar.d, bwhgVar.e.booleanValue());
                    } else {
                        throw new NullPointerException("Null messageRecipients");
                    }
                } else {
                    SmsController$SmsMessage next = it.next();
                    if (str == null) {
                        str = next.b();
                    } else if (!str.equals(next.b())) {
                        break;
                    }
                    if (str2 == null) {
                        str2 = next.c();
                    } else if (!str2.equals(next.c())) {
                        break;
                    }
                    if (str3 == null) {
                        str3 = next.d();
                    } else if (!str3.equals(next.d())) {
                        break;
                    }
                    z = z && next.e();
                    a.add(next.a());
                }
            }
            int aJ = autoValue_SmsController_GroupSmsMessage != null ? aJ(autoValue_SmsController_GroupSmsMessage) : 7;
            ArrayList<SmsController$SmsMessage> arrayList8 = this.e;
            dbsk.s(arrayList8);
            Iterator<SmsController$SmsMessage> it2 = arrayList8.iterator();
            while (it2.hasNext()) {
                it2.remove();
                aN(it2.next(), aJ);
            }
        }
        this.a = 2;
    }

    @Override // defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    @Override // defpackage.bwhq
    public final void d() {
        dbsk.l(this.a == 0);
    }

    @Override // defpackage.bwhq
    public final void e(SmsController$GroupSmsMessage smsController$GroupSmsMessage) {
        boolean z = false;
        dbsk.l(this.a == 0);
        if (this.b == 0) {
            z = true;
        }
        dbsk.l(z);
        aL(1);
        this.g = smsController$GroupSmsMessage;
        dbsk.s(smsController$GroupSmsMessage);
        q();
    }

    @Override // defpackage.bwhq
    public final void f(bwhm bwhmVar) {
        dbsk.l(this.c == null);
        this.c = bwhmVar;
    }

    @Override // defpackage.bwhq
    public final void g() {
        this.c = null;
    }

    @Override // defpackage.bwhq
    public final void h(List<SmsController$SmsMessage> list) {
        boolean z = true;
        dbsk.l(this.a == 0);
        if (this.b != 0) {
            z = false;
        }
        dbsk.l(z);
        aL(2);
        ArrayList<SmsController$SmsMessage> c = dchl.c(list);
        this.e = c;
        dbsk.s(c);
        w();
    }

    @Override // defpackage.bwhq
    public final void i(bwho bwhoVar) {
        dbsk.l(this.d == null);
        this.d = bwhoVar;
    }

    @Override // defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        aG();
        if (bundle == null) {
            return;
        }
        this.a = bundle.getInt("state", 0);
        this.b = bundle.getInt("mode", 0);
        if (bundle.containsKey("results_key")) {
            this.f = bundle.getParcelableArrayList("results_key");
        }
        int i = this.b;
        if (i == 1) {
            if (bundle.containsKey("pending_group_message_key")) {
                this.g = (SmsController$GroupSmsMessage) bundle.getParcelable("pending_group_message_key");
            } else {
                this.b = 0;
            }
        } else if (i == 2) {
            if (bundle.containsKey("pending_messages_key")) {
                this.e = bundle.getParcelableArrayList("pending_messages_key");
            } else {
                this.b = 0;
            }
        }
        if (this.a != 1) {
            return;
        }
        int i2 = this.b;
        if (i2 == 2) {
            dbsk.s(this.e);
            w();
        } else if (i2 != 1) {
        } else {
            dbsk.s(this.g);
            q();
        }
    }

    @Override // defpackage.bwhq
    public final void p() {
        this.d = null;
    }

    @Override // defpackage.fd
    public final void t(Bundle bundle) {
        ArrayList<SmsController$SmsMessage> arrayList;
        SmsController$GroupSmsMessage smsController$GroupSmsMessage;
        bundle.putInt("state", this.a);
        bundle.putInt("mode", this.b);
        if (this.b != 0) {
            bundle.putParcelableArrayList("results_key", this.f);
        }
        if (this.b == 1 && (smsController$GroupSmsMessage = this.g) != null) {
            bundle.putParcelable("pending_group_message_key", smsController$GroupSmsMessage);
        }
        if (this.b == 2 && (arrayList = this.e) != null) {
            bundle.putParcelableArrayList("pending_messages_key", arrayList);
        }
        for (dehn<SmsController$SmsResult> dehnVar : this.ad) {
            dehnVar.cancel(true);
        }
        this.ad.clear();
    }
}
