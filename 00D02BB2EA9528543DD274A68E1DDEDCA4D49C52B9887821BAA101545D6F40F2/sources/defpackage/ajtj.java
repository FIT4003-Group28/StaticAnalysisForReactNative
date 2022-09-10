package defpackage;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: PG */
/* renamed from: ajtj  reason: default package */
/* loaded from: classes2.dex */
public final class ajtj extends ex implements ajhv, ajuh, ajyk {
    public static final dcqe ad = dcqe.c("ajtj");
    public dxio<afha> aA;
    public dehq aB;
    @dzsi
    private SendKitPickerResult aC;
    @dzsi
    private ahvk aD;
    private int aE;
    @dzsi
    private SendKitPickerResult aF;
    @dzsi
    private cqkf<ajtr> aG;
    public int ae = 0;
    @dzsi
    public String af;
    @dzsi
    public String ag;
    @dzsi
    public String ah;
    public bwfp ai;
    @dzsi
    public Intent aj;
    @dzsi
    public ajxy ak;
    public ajhx al;
    public boolean am;
    @dzsi
    public ajtr an;
    @dzsi
    public czwe ao;
    @dzsi
    public czha ap;
    @dzsi
    public Runnable aq;
    @dzsi
    public ajyl ar;
    @dzsi
    public ProgressDialog as;
    public cqkj at;
    public cztz au;
    public ajsj av;
    public cqhn aw;
    public ajus ax;
    public ajup ay;
    public bvjj az;

    static {
        dbsk.s(ajtj.class.getCanonicalName());
    }

    @Override // defpackage.ex, defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    @Override // defpackage.fd
    public final void Z(int i, int i2, Intent intent) {
        super.Z(i, i2, intent);
        if (i != 0) {
            return;
        }
        synchronized (this) {
            if (i2 == -1) {
                if (intent == null) {
                    return;
                }
                SendKitPickerResult sendKitPickerResult = (SendKitPickerResult) intent.getParcelableExtra("sendkit_result");
                if (this.am) {
                    aK(sendKitPickerResult);
                } else {
                    this.ae = 1;
                    this.aF = sendKitPickerResult;
                }
            }
        }
    }

    @Override // defpackage.ajyk
    public final void aJ() {
        if (this.ar != null) {
            Runnable runnable = this.aq;
            dbsk.s(runnable);
            runnable.run();
            ajyl ajylVar = this.ar;
            dbsk.s(ajylVar);
            ajylVar.f();
            this.ar = null;
            this.ap = null;
            this.aq = null;
        }
    }

    @Override // defpackage.ajuh
    public final void aK(SendKitPickerResult sendKitPickerResult) {
        synchronized (this) {
            int i = this.ae;
            if (i != 0) {
                bvoo.h("Attempted to start a SendKit journey share while in state %d", Integer.valueOf(i));
            } else if (D()) {
                bvoo.h("Attempted to start a SendKit journey share after onSaveInstanceState()", new Object[0]);
            } else {
                this.as = aL();
                this.aC = sendKitPickerResult;
                this.ae = 1;
                this.al.f(sendKitPickerResult, this.aE, false);
            }
        }
    }

    public final ProgressDialog aL() {
        ProgressDialog progressDialog = new ProgressDialog(H());
        progressDialog.setProgressStyle(0);
        progressDialog.setCancelable(false);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage(alp.a().b(Rp(R.string.DATA_LOADING_IN_PROGRESS)));
        progressDialog.show();
        return progressDialog;
    }

    @Override // defpackage.ajyk
    public final void aR() {
        ajyl ajylVar = this.ar;
        if (ajylVar != null) {
            ajylVar.f();
            this.ar = null;
            this.ap = null;
            this.aq = null;
        }
    }

    @Override // defpackage.ajyk
    public final void aS() {
        if (this.ar != null) {
            this.az.T(bvjk.gz, this.av.a(), true);
            ajyl ajylVar = this.ar;
            dbsk.s(ajylVar);
            ajylVar.f();
            this.ar = null;
            this.ap = null;
            this.aq = null;
        }
    }

    @Override // defpackage.fd
    public final void ab(int i, String[] strArr, int[] iArr) {
        ajxy ajxyVar = this.ak;
        if (ajxyVar != null) {
            ((ajty) ajxyVar).a.a(i, strArr, iArr);
        }
    }

    @Override // defpackage.fd
    public final void ak() {
        super.ak();
        SendKitPickerResult sendKitPickerResult = this.aF;
        if (sendKitPickerResult != null) {
            this.aC = sendKitPickerResult;
            synchronized (this) {
                this.al.f(this.aC, this.aE, false);
            }
            this.aF = null;
        }
    }

    @Override // defpackage.ex, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        synchronized (this) {
            if (this.o.containsKey("account_id")) {
                this.ag = this.o.getString("account_id");
            }
            if (this.o.containsKey("account_name")) {
                this.ah = this.o.getString("account_name");
            }
            if (this.o.containsKey("KEY_JOURNEY_SHARING_MODE")) {
                this.aD = ahvk.values()[this.o.getInt("KEY_JOURNEY_SHARING_MODE")];
            }
            if (this.o.containsKey("KEY_SHARE_MESSAGE_RESOURCE_ID")) {
                this.aE = this.o.getInt("KEY_SHARE_MESSAGE_RESOURCE_ID");
            }
            boolean z = false;
            this.ai = bwfp.f(H(), false);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.addFlags(134742016);
            intent.setType("text/plain");
            bwfp bwfpVar = this.ai;
            dbsk.s(bwfpVar);
            bwfpVar.g(intent);
            if (bundle != null) {
                this.ae = bundle.getInt("state", 0);
                this.ag = bundle.getString("account_id");
                this.ah = bundle.getString("account_name");
                this.aD = ahvk.values()[bundle.getInt("KEY_JOURNEY_SHARING_MODE")];
                this.aE = bundle.getInt("KEY_SHARE_MESSAGE_RESOURCE_ID");
                if (bundle.containsKey("saved_app_name")) {
                    this.af = bundle.getString("saved_app_name");
                }
                if (bundle.containsKey("saved_app_intent")) {
                    this.aj = (Intent) bundle.getParcelable("saved_app_intent");
                }
                if (bundle.containsKey("saved_sendkit_result")) {
                    this.aC = (SendKitPickerResult) bundle.getParcelable("saved_sendkit_result");
                }
            }
            String str = this.ag;
            dbsk.l(str != null && !str.isEmpty());
            String str2 = this.ah;
            if (str2 != null && !str2.isEmpty()) {
                z = true;
            }
            dbsk.l(z);
            Context H = H();
            dehq dehqVar = this.aB;
            cqhn cqhnVar = this.aw;
            ajus ajusVar = this.ax;
            String str3 = this.ah;
            dbsk.s(str3);
            this.an = new ajui(H, dehqVar, cqhnVar, this, ajusVar, str3, this.av.a(), this.ai);
            String str4 = this.ag;
            dbsk.s(str4);
            ahvk ahvkVar = this.aD;
            dbsk.s(ahvkVar);
            this.al = ajft.a(this, str4, ahvkVar, this.at);
        }
    }

    @Override // defpackage.ex
    public final Dialog q(@dzsi Bundle bundle) {
        ajti ajtiVar = new ajti(this, H());
        this.ao = ajtiVar;
        ajtiVar.setOnShowListener(new DialogInterface.OnShowListener(this) { // from class: ajth
            private final ajtj a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                czwe czweVar = this.a.ao;
                dbsk.s(czweVar);
                View findViewById = czweVar.findViewById(R.id.design_bottom_sheet);
                dbsk.s(findViewById);
                BottomSheetBehavior F = BottomSheetBehavior.F(findViewById);
                F.s(-1);
                F.y(3);
                F.m = true;
                F.v(false);
            }
        });
        this.aG = this.at.c(new ajts(), null);
        czwe czweVar = this.ao;
        dbsk.s(czweVar);
        czweVar.setContentView(this.aG.c());
        czwe czweVar2 = this.ao;
        dbsk.s(czweVar2);
        return czweVar2;
    }

    @Override // defpackage.ex, defpackage.fd
    public final void s() {
        super.s();
        this.am = true;
        cqkf<ajtr> cqkfVar = this.aG;
        dbsk.s(cqkfVar);
        ajtr ajtrVar = this.an;
        dbsk.s(ajtrVar);
        cqkfVar.e(ajtrVar);
        synchronized (this) {
            this.al.g(this);
            this.al.h(this.at);
        }
    }

    @Override // defpackage.ex, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        synchronized (this) {
            bundle.putInt("state", this.ae);
            bundle.putString("account_id", this.ag);
            bundle.putString("account_name", this.ah);
            bundle.putInt("KEY_SHARE_MESSAGE_RESOURCE_ID", this.aE);
            SendKitPickerResult sendKitPickerResult = this.aC;
            if (sendKitPickerResult != null) {
                bundle.putParcelable("saved_sendkit_result", sendKitPickerResult);
            }
            ahvk ahvkVar = this.aD;
            if (ahvkVar != null) {
                bundle.putInt("KEY_JOURNEY_SHARING_MODE", ahvkVar.ordinal());
            }
            Intent intent = this.aj;
            if (intent != null) {
                bundle.putParcelable("saved_app_intent", intent);
            }
            String str = this.af;
            if (str != null) {
                bundle.putString("saved_app_name", str);
            }
        }
    }

    @Override // defpackage.ex, defpackage.fd
    public final void u() {
        super.u();
        this.am = false;
        ajyl ajylVar = this.ar;
        if (ajylVar != null && this.ap != null && this.aq != null) {
            ajylVar.f();
            Runnable runnable = this.aq;
            dbsk.s(runnable);
            runnable.run();
            this.ap = null;
            this.aq = null;
        }
        cqkf<ajtr> cqkfVar = this.aG;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        synchronized (this) {
            this.al.i();
        }
    }

    @Override // defpackage.ajhv
    public final void w(ajhw ajhwVar) {
        dqyb dqybVar;
        if (this.as != null) {
            if (!J().isFinishing() && !J().isDestroyed()) {
                ProgressDialog progressDialog = this.as;
                dbsk.s(progressDialog);
                progressDialog.dismiss();
            }
            this.as = null;
        }
        synchronized (this) {
            if (((ajhq) ajhwVar).a == 3) {
                try {
                    SendKitPickerResult sendKitPickerResult = this.aC;
                    if (sendKitPickerResult != null) {
                        this.ay.e(sendKitPickerResult, J());
                        this.aC = null;
                    } else if (this.aj != null) {
                        this.ay.f(J());
                    }
                } catch (cxzr e) {
                    bvoo.f(new RuntimeException(e));
                }
                if (this.aj != null) {
                    dqzv dqzvVar = (dqzv) dcft.c(((ajhq) ajhwVar).c);
                    Intent intent = this.aj;
                    dbsk.s(intent);
                    int i = this.aE;
                    Object[] objArr = new Object[1];
                    if (dqzvVar.b != 2) {
                        dqybVar = dqyb.j;
                    } else {
                        dqybVar = (dqyb) dqzvVar.c;
                    }
                    objArr[0] = dqybVar.d;
                    intent.putExtra("android.intent.extra.TEXT", Rq(i, objArr));
                    try {
                        Intent intent2 = this.aj;
                        dbsk.s(intent2);
                        ahyp.a(intent2);
                        this.aA.a().i(this, intent2, 4);
                    } catch (SecurityException unused) {
                        bvoo.h("Permission Denied when attempting to start a third party app.", new Object[0]);
                        cztz cztzVar = this.au;
                        dbsk.s(cztzVar);
                        cztq a = cztt.a(cztzVar);
                        Resources Rn = Rn();
                        alp a2 = alp.a();
                        String str = this.af;
                        dbsk.s(str);
                        a.c = ajsb.a(Rn, a2, R.string.THIRD_PARTY_APP_SHARE_FAILED, str);
                        a.c();
                        bwfp bwfpVar = this.ai;
                        Intent intent3 = this.aj;
                        dbsk.s(intent3);
                        bwfpVar.d(intent3);
                    }
                }
                this.ae = 2;
                f();
            } else {
                cztq a3 = cztt.a(this.au);
                a3.c = Rp(R.string.UPDATE_SHARES_OPERATION_FAILED);
                a3.c();
                gn R = R();
                String str2 = this.av.a().d;
                ahvk ahvkVar = this.aD;
                dbsk.s(ahvkVar);
                ajhx b = ajft.b(R, str2, ahvkVar, this.at);
                this.al = b;
                b.g(this);
                this.ae = 0;
                this.aj = null;
                this.af = null;
                this.aC = null;
            }
        }
    }
}
