package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.google.android.apps.gmm.locationsharing.ui.sendkit.JourneySharingSendKitActivity;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ajuj  reason: default package */
/* loaded from: classes2.dex */
public final class ajuj extends fd implements ahvq, ajhv {
    private static final dcqe f = dcqe.c("ajuj");
    @dzsi
    private SendKitPickerResult ad;
    @dzsi
    private String ae;
    @dzsi
    private String af;
    private bwfp ag;
    @dzsi
    private Intent ah;
    @dzsi
    private ajxy ai;
    private ajhx aj;
    @dzsi
    private SendKitPickerResult ak;
    private boolean al;
    private boolean am;
    public btrm b;
    public dxio<afha> c;
    public cqkj d;
    public ajup e;
    private final Set<ahvp> g = dcnm.g();
    public int a = 0;

    private final void p(int i) {
        this.a = i;
        Iterator it = dcnm.e(this.g).iterator();
        while (it.hasNext()) {
            ((ahvp) it.next()).G();
        }
    }

    @Override // defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    @Override // defpackage.fd
    public final void Z(int i, int i2, Intent intent) {
        super.Z(i, i2, intent);
        if (i == 0 && i2 == -1 && intent != null) {
            SendKitPickerResult sendKitPickerResult = (SendKitPickerResult) intent.getParcelableExtra("sendkit_result");
            if (!this.am || D()) {
                p(1);
                this.ak = sendKitPickerResult;
                return;
            }
            e(sendKitPickerResult, this.al);
        }
    }

    @Override // defpackage.ahvq
    public final void a(ahvp ahvpVar) {
        this.g.add(ahvpVar);
    }

    @Override // defpackage.fd
    public final void ab(int i, String[] strArr, int[] iArr) {
        ajxy ajxyVar = this.ai;
        if (ajxyVar != null) {
            ajxy ajxyVar2 = ((atwz) ajxyVar).a;
            int i2 = atxm.H;
            ajxyVar2.a(i, strArr, iArr);
        }
    }

    @Override // defpackage.fd
    public final void ak() {
        super.ak();
        SendKitPickerResult sendKitPickerResult = this.ak;
        if (sendKitPickerResult != null) {
            this.ad = sendKitPickerResult;
            this.aj.f(sendKitPickerResult, R.string.SMS_SHARE_TEXT_JOURNEY_SHARE, this.al);
            this.ak = null;
        }
    }

    @Override // defpackage.ahvq
    public final void b(ahvp ahvpVar) {
        this.g.remove(ahvpVar);
    }

    @Override // defpackage.ahvq
    public final boolean c(String str) {
        return this.am && ac(str);
    }

    @Override // defpackage.ahvq
    public final int d() {
        return this.a;
    }

    @Override // defpackage.ahvq
    public final void e(SendKitPickerResult sendKitPickerResult, boolean z) {
        if (D()) {
            bvoo.h("createJourneyShare called after state saved..", new Object[0]);
        } else if (this.a != 0) {
            bvoo.h("createJourneyShare called when state is not idle.", new Object[0]);
        } else {
            p(1);
            this.ad = sendKitPickerResult;
            this.aj.f(sendKitPickerResult, R.string.SMS_SHARE_TEXT_JOURNEY_SHARE, z);
        }
    }

    @Override // defpackage.ahvq
    public final void f() {
        if (this.a != 0 || D()) {
            return;
        }
        ((ajfu) this.aj).c.e();
        p(2);
    }

    @Override // defpackage.ahvq
    public final void g(String[] strArr, ajxy ajxyVar) {
        if (this.am) {
            this.ai = ajxyVar;
            aa(strArr, 1234);
        }
    }

    @Override // defpackage.ahvq
    public final void h(ResolveInfo resolveInfo) {
        dbsk.l(this.a == 0 && !D());
        p(1);
        bwfp bwfpVar = this.ag;
        dbsk.s(bwfpVar);
        Intent b = bwfpVar.b(resolveInfo);
        if (b == null) {
            bvoo.h("Share app unresolvable.", new Object[0]);
            p(2);
            return;
        }
        bwfpVar.c(b);
        this.ah = b;
        String charSequence = resolveInfo.loadLabel(H().getPackageManager()).toString();
        this.ae = charSequence;
        ajhx ajhxVar = this.aj;
        dbsk.s(charSequence);
        ajhxVar.e(charSequence, true);
    }

    @Override // defpackage.ahvq
    public final void i(String str, boolean z, @dzsi SendKitPickerResult sendKitPickerResult) {
        if (!this.am || D()) {
            return;
        }
        dbsk.l(this.a == 0);
        this.al = true;
        Context H = H();
        String str2 = this.af;
        dbsk.s(str2);
        this.c.a().p(this, JourneySharingSendKitActivity.o(H, str2, str, z, true, 0, dbsg.j(sendKitPickerResult)), 0, 2);
    }

    @Override // defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (this.o.containsKey("account_id")) {
            this.af = this.o.getString("account_id");
        }
        boolean z = false;
        this.ag = bwfp.f(H(), false);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(134742016);
        intent.setType("text/plain");
        bwfp bwfpVar = this.ag;
        dbsk.s(bwfpVar);
        bwfpVar.g(intent);
        if (bundle != null) {
            this.a = bundle.getInt("state", 0);
            this.af = bundle.getString("account_id");
            this.al = bundle.getBoolean("location_sharing_notice_shown", false);
            if (bundle.containsKey("saved_app_name")) {
                this.ae = bundle.getString("saved_app_name");
            }
            if (bundle.containsKey("saved_app_intent")) {
                this.ah = (Intent) bundle.getParcelable("saved_app_intent");
            }
            if (bundle.containsKey("saved_sendkit_result")) {
                this.ad = (SendKitPickerResult) bundle.getParcelable("saved_sendkit_result");
            }
        }
        String str = this.af;
        if (str != null && !str.isEmpty()) {
            z = true;
        }
        dbsk.l(z);
        String str2 = this.af;
        dbsk.s(str2);
        this.aj = ajft.a(this, str2, ahvk.STANDARD_NAVIGATION, this.d);
    }

    @Override // defpackage.fd
    public final void s() {
        super.s();
        this.am = true;
        this.aj.g(this);
        this.aj.h(this.d);
    }

    @Override // defpackage.fd
    public final void t(Bundle bundle) {
        bundle.putInt("state", this.a);
        bundle.putString("account_id", this.af);
        SendKitPickerResult sendKitPickerResult = this.ad;
        if (sendKitPickerResult != null) {
            bundle.putParcelable("saved_sendkit_result", sendKitPickerResult);
        }
        Intent intent = this.ah;
        if (intent != null) {
            bundle.putParcelable("saved_app_intent", intent);
        }
        String str = this.ae;
        if (str != null) {
            bundle.putString("saved_app_name", str);
        }
    }

    @Override // defpackage.fd
    public final void u() {
        super.u();
        this.am = false;
        this.aj.i();
        this.g.clear();
    }

    @Override // defpackage.ajhv
    public final void w(ajhw ajhwVar) {
        dqyb dqybVar;
        ajhq ajhqVar = (ajhq) ajhwVar;
        if (ajhqVar.b.isEmpty()) {
            this.b.b(new aswc(1));
            p(2);
        } else if (ajhqVar.a != 1) {
            try {
                SendKitPickerResult sendKitPickerResult = this.ad;
                if (sendKitPickerResult != null) {
                    this.e.e(sendKitPickerResult, J());
                    this.ad = null;
                } else if (this.ah != null) {
                    this.e.f(J());
                }
            } catch (cxzr e) {
                bvoo.f(new RuntimeException(e));
            }
            if (this.ah != null) {
                dqzv dqzvVar = (dqzv) dcft.c(ajhqVar.c);
                Intent intent = this.ah;
                dbsk.s(intent);
                Object[] objArr = new Object[1];
                if (dqzvVar.b == 2) {
                    dqybVar = (dqyb) dqzvVar.c;
                } else {
                    dqybVar = dqyb.j;
                }
                objArr[0] = dqybVar.d;
                intent.putExtra("android.intent.extra.TEXT", Rq(R.string.SMS_SHARE_TEXT_JOURNEY_SHARE, objArr));
                try {
                    Intent intent2 = this.ah;
                    dbsk.s(intent2);
                    ahyp.a(intent2);
                    this.c.a().i(this, intent2, 4);
                } catch (SecurityException unused) {
                    bvoo.h("Permission Denied when attempting to start a third party app.", new Object[0]);
                    this.b.b(new aswc(1));
                    bwfp bwfpVar = this.ag;
                    dbsk.s(bwfpVar);
                    Intent intent3 = this.ah;
                    dbsk.s(intent3);
                    bwfpVar.d(intent3);
                    p(2);
                    return;
                }
            }
            this.b.b(new aswc(0));
            p(2);
        } else {
            this.b.b(new aswc(2));
            p(2);
        }
    }
}
