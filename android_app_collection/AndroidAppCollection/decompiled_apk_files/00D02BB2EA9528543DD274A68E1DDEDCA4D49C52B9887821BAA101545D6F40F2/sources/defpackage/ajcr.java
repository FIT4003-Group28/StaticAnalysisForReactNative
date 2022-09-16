package defpackage;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import com.google.android.apps.gmm.locationsharing.modui.shares.AutoValue_CreateSharesFlowFragment_SavedIntent;
import com.google.android.apps.gmm.locationsharing.modui.shares.CreateSharesFlowFragment$TargetData;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajcr  reason: default package */
/* loaded from: classes2.dex */
public final class ajcr extends ges implements ajdr, ajhy, ajyk, ajhv {
    public static final dcqe a = dcqe.c("ajcr");
    public bvjj aA;
    public dxio<afha> aB;
    public bvsx aC;
    public aigf aO;
    public ajae aP;
    public ajdt aQ;
    public ajcs aR;
    public ajcl aS;
    public Executor aT;
    private String aU;
    @dzsi
    private ajdb aV;
    @dzsi
    private SendKitPickerResult aW;
    @dzsi
    private ajhx aX;
    @dzsi
    private ProgressDialog aY;
    private cqkf<ajcw> aZ;
    @dzsi
    ajdu ad;
    @dzsi
    public ajwq ae;
    @dzsi
    public bwfp af;
    @dzsi
    public GmmLocation ag;
    @dzsi
    public czha ah;
    @dzsi
    public Runnable ai;
    @dzsi
    public ajxy aj;
    @dzsi
    public ajyl ak;
    public ajia al;
    public cqkj am;
    public efg an;
    public cqhn ao;
    public gga ap;
    public dxio<ahwf> aq;
    public ajus ar;
    public ajup as;
    public ajsj at;
    public btrm au;
    public aida av;
    public bvsl aw;
    public btpc ax;
    public aeun ay;
    public dxio<ahjq> az;
    public btlu b;
    private cqkf<ajdl> ba;
    public String c;
    public ajco d;
    public Integer e;
    @dzsi
    public CreateSharesFlowFragment$TargetData f;
    public int g = 0;
    private final ajcm bb = new ajcm(this);
    private final aigd bc = new ajci(this);

    private final dqyd bq() {
        int b = this.ax.b();
        if (b < 0 || b > 100) {
            b = 0;
        } else if (b == 0) {
            b = 1;
        }
        dqyc bZ = dqyd.d.bZ();
        boolean a2 = this.ax.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqyd dqydVar = (dqyd) bZ.b;
        int i = 1 | dqydVar.a;
        dqydVar.a = i;
        dqydVar.b = a2;
        dqydVar.a = i | 2;
        dqydVar.c = b;
        return bZ.bK();
    }

    @dzsi
    private final ahvk br() {
        if (this.d == ajco.LOCATION_SHARE) {
            return null;
        }
        return ahvk.TRANSIT_NAVIGATION;
    }

    private final boolean bs() {
        return Rn().getConfiguration().orientation == 2;
    }

    private final CharSequence bt() {
        dbsg i;
        if (this.d != ajco.LOCATION_SHARE) {
            return Rp(R.string.MOD_CREATE_SHARE_JOURNEY_SHARING_TITLE);
        }
        CreateSharesFlowFragment$TargetData createSharesFlowFragment$TargetData = this.f;
        if (createSharesFlowFragment$TargetData != null) {
            int d = createSharesFlowFragment$TargetData.d();
            if (d == 0) {
                throw null;
            }
            if (d == 3) {
                CreateSharesFlowFragment$TargetData createSharesFlowFragment$TargetData2 = this.f;
                dbsk.s(createSharesFlowFragment$TargetData2);
                Profile b = createSharesFlowFragment$TargetData2.h().b();
                if (!b.c().a()) {
                    i = dbpy.a;
                } else if (!b.e().a()) {
                    i = dbsg.i(Rn().getString(R.string.MOD_CREATE_SHARE_LOCATION_SHARING_WITH_TARGET_TITLE, b.c().b()));
                } else {
                    bvsv a2 = this.aC.a(b.e().b());
                    a2.n();
                    Spannable c = a2.c();
                    bvsu b2 = this.aC.b(Rn().getString(R.string.MOD_CREATE_SHARE_LOCATION_SHARING_WITH_TARGET_TITLE));
                    b2.a(b.c().b(), c);
                    i = dbsg.i(b2.c());
                }
                return (CharSequence) i.c(Rp(R.string.MOD_CREATE_SHARE_LOCATION_SHARING_TITLE));
            }
        }
        return Rp(R.string.MOD_CREATE_SHARE_LOCATION_SHARING_TITLE);
    }

    @Override // defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    @Override // defpackage.fd
    public final void Z(int i, int i2, @dzsi Intent intent) {
        if (i != awnn.LOCATION_SHARING_SENDKIT.ordinal()) {
            return;
        }
        if (i2 != -1) {
            aU();
            this.aq.a().q();
        } else if (intent == null) {
        } else {
            SendKitPickerResult sendKitPickerResult = (SendKitPickerResult) intent.getParcelableExtra("sendkit_result");
            dbsk.s(sendKitPickerResult);
            if (U()) {
                i(sendKitPickerResult);
            } else {
                this.aW = sendKitPickerResult;
            }
        }
    }

    @Override // defpackage.ajyk
    public final void aJ() {
        if (this.ak != null) {
            Runnable runnable = this.ai;
            dbsk.s(runnable);
            runnable.run();
            ajyl ajylVar = this.ak;
            dbsk.s(ajylVar);
            ajylVar.f();
            this.ak = null;
            this.ah = null;
            this.ai = null;
        }
    }

    @Override // defpackage.ajyk
    public final void aR() {
        ajyl ajylVar = this.ak;
        if (ajylVar != null) {
            ajylVar.f();
            this.ak = null;
            this.ah = null;
            this.ai = null;
        }
    }

    @Override // defpackage.ajyk
    public final void aS() {
        if (this.ak != null) {
            this.aA.T(bvjk.gz, this.b, true);
            ajyl ajylVar = this.ak;
            dbsk.s(ajylVar);
            ajylVar.f();
            this.ak = null;
            this.ah = null;
            this.ai = null;
        }
    }

    public final void aT() {
        boolean z;
        dqzx bK;
        if (this.f != null && this.g == 0) {
            this.g = 1;
            ProgressDialog progressDialog = new ProgressDialog(H());
            boolean z2 = false;
            progressDialog.setProgressStyle(0);
            progressDialog.setCancelable(false);
            progressDialog.setIndeterminate(true);
            progressDialog.setMessage(alp.a().b(Rp(R.string.DATA_LOADING_IN_PROGRESS)));
            progressDialog.show();
            this.aY = progressDialog;
            if (this.d == ajco.LOCATION_SHARE) {
                dbsk.l(this.g == 1);
                dccx F = dcdc.F();
                ajdu ajduVar = this.ad;
                dbsk.s(ajduVar);
                boolean booleanValue = ajduVar.q().c().booleanValue();
                ajdu ajduVar2 = this.ad;
                dbsk.s(ajduVar2);
                int o = ajduVar2.q().o();
                CreateSharesFlowFragment$TargetData createSharesFlowFragment$TargetData = this.f;
                dbsk.s(createSharesFlowFragment$TargetData);
                ahwj ahwjVar = ahwj.GAIA;
                int d = createSharesFlowFragment$TargetData.d();
                int i = d - 1;
                if (d != 0) {
                    if (i == 0) {
                        disr bZ = diss.d.bZ();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        diss dissVar = (diss) bZ.b;
                        dissVar.a |= 2;
                        dissVar.c = o;
                        dqzw bZ2 = dqzx.c.bZ();
                        dqxy bZ3 = dqyb.j.bZ();
                        String b = createSharesFlowFragment$TargetData.f().b().b();
                        dbsk.s(b);
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dqyb dqybVar = (dqyb) bZ3.b;
                        b.getClass();
                        dqybVar.b = 7;
                        dqybVar.c = b;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dqzx dqzxVar = (dqzx) bZ2.b;
                        dqyb bK2 = bZ3.bK();
                        bK2.getClass();
                        dqzxVar.b = bK2;
                        dqzxVar.a = 2;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        diss dissVar2 = (diss) bZ.b;
                        dqzx bK3 = bZ2.bK();
                        bK3.getClass();
                        dissVar2.b = bK3;
                        dissVar2.a |= 1;
                        F.g(bZ.bK());
                    } else if (i == 1) {
                        ajus ajusVar = this.ar;
                        czgw a2 = createSharesFlowFragment$TargetData.g().b().a();
                        dccx G = dcdc.G(a2.b.size());
                        dcdc r = dcdc.r(ajusVar.b(a2, true));
                        int size = r.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            dqzx dqzxVar2 = (dqzx) r.get(i2);
                            disr bZ4 = diss.d.bZ();
                            if (bZ4.c) {
                                bZ4.bF();
                                bZ4.c = false;
                            }
                            diss dissVar3 = (diss) bZ4.b;
                            dqzxVar2.getClass();
                            dissVar3.b = dqzxVar2;
                            int i3 = dissVar3.a | 1;
                            dissVar3.a = i3;
                            int i4 = dqzxVar2.a;
                            if (i4 != 1) {
                                z = booleanValue;
                            } else if (!booleanValue) {
                                dissVar3.a = i3 | 2;
                                dissVar3.c = o;
                                G.g(bZ4.bK());
                            } else {
                                i4 = 1;
                                z = true;
                            }
                            if (i4 == 2) {
                                int i5 = true != z ? o : 4320;
                                dissVar3.a = i3 | 2;
                                dissVar3.c = i5;
                            }
                            G.g(bZ4.bK());
                        }
                        F.i(G.f());
                    } else if (i == 2) {
                        disr bZ5 = diss.d.bZ();
                        Profile b2 = createSharesFlowFragment$TargetData.h().b();
                        PersonId a3 = b2.a();
                        String c = b2.b().c("");
                        int ordinal = a3.c.ordinal();
                        if (ordinal == 0) {
                            dqzw bZ6 = dqzx.c.bZ();
                            dqyi bZ7 = dqyj.f.bZ();
                            if (bZ7.c) {
                                bZ7.bF();
                                bZ7.c = false;
                            }
                            dqyj dqyjVar = (dqyj) bZ7.b;
                            c.getClass();
                            dqyjVar.a |= 8;
                            dqyjVar.d = c;
                            String g = a3.g();
                            if (bZ7.c) {
                                bZ7.bF();
                                bZ7.c = false;
                            }
                            dqyj dqyjVar2 = (dqyj) bZ7.b;
                            g.getClass();
                            dqyjVar2.a |= 1;
                            dqyjVar2.b = g;
                            if (bZ6.c) {
                                bZ6.bF();
                                bZ6.c = false;
                            }
                            dqzx dqzxVar3 = (dqzx) bZ6.b;
                            dqyj bK4 = bZ7.bK();
                            bK4.getClass();
                            dqzxVar3.b = bK4;
                            dqzxVar3.a = 1;
                            bK = bZ6.bK();
                        } else if (ordinal == 1) {
                            dqzw bZ8 = dqzx.c.bZ();
                            dqxy bZ9 = dqyb.j.bZ();
                            dqxz bZ10 = dqya.e.bZ();
                            if (bZ10.c) {
                                bZ10.bF();
                                bZ10.c = false;
                            }
                            dqya dqyaVar = (dqya) bZ10.b;
                            c.getClass();
                            dqyaVar.a |= 1;
                            dqyaVar.b = c;
                            dbsk.m(a3.c == ahwj.PHONE, "Trying to get phone number of non-phone instance.");
                            String str = a3.b;
                            if (bZ10.c) {
                                bZ10.bF();
                                bZ10.c = false;
                            }
                            dqya dqyaVar2 = (dqya) bZ10.b;
                            str.getClass();
                            dqyaVar2.a |= 4;
                            dqyaVar2.d = str;
                            if (bZ9.c) {
                                bZ9.bF();
                                bZ9.c = false;
                            }
                            dqyb dqybVar2 = (dqyb) bZ9.b;
                            dqya bK5 = bZ10.bK();
                            bK5.getClass();
                            dqybVar2.c = bK5;
                            dqybVar2.b = 6;
                            if (bZ8.c) {
                                bZ8.bF();
                                bZ8.c = false;
                            }
                            dqzx dqzxVar4 = (dqzx) bZ8.b;
                            dqyb bK6 = bZ9.bK();
                            bK6.getClass();
                            dqzxVar4.b = bK6;
                            dqzxVar4.a = 2;
                            bK = bZ8.bK();
                        } else if (ordinal == 2) {
                            dqzw bZ11 = dqzx.c.bZ();
                            dqxy bZ12 = dqyb.j.bZ();
                            dqxz bZ13 = dqya.e.bZ();
                            if (bZ13.c) {
                                bZ13.bF();
                                bZ13.c = false;
                            }
                            dqya dqyaVar3 = (dqya) bZ13.b;
                            c.getClass();
                            dqyaVar3.a |= 1;
                            dqyaVar3.b = c;
                            dbsk.m(a3.c == ahwj.EMAIL, "Trying to get email address of non-email instance.");
                            String str2 = a3.b;
                            if (bZ13.c) {
                                bZ13.bF();
                                bZ13.c = false;
                            }
                            dqya dqyaVar4 = (dqya) bZ13.b;
                            str2.getClass();
                            dqyaVar4.a |= 2;
                            dqyaVar4.c = str2;
                            if (bZ12.c) {
                                bZ12.bF();
                                bZ12.c = false;
                            }
                            dqyb dqybVar3 = (dqyb) bZ12.b;
                            dqya bK7 = bZ13.bK();
                            bK7.getClass();
                            dqybVar3.c = bK7;
                            dqybVar3.b = 6;
                            if (bZ11.c) {
                                bZ11.bF();
                                bZ11.c = false;
                            }
                            dqzx dqzxVar5 = (dqzx) bZ11.b;
                            dqyb bK8 = bZ12.bK();
                            bK8.getClass();
                            dqzxVar5.b = bK8;
                            dqzxVar5.a = 2;
                            bK = bZ11.bK();
                        } else {
                            if (ordinal == 3) {
                                throw new UnsupportedOperationException("You cannot recreate a token share.");
                            }
                            if (ordinal == 4) {
                                throw new UnsupportedOperationException("You cannot create a share with Santa.");
                            }
                            throw new UnsupportedOperationException("Unknown PersonId type");
                        }
                        if (bZ5.c) {
                            bZ5.bF();
                            bZ5.c = false;
                        }
                        diss dissVar4 = (diss) bZ5.b;
                        bK.getClass();
                        dissVar4.b = bK;
                        int i6 = dissVar4.a | 1;
                        dissVar4.a = i6;
                        if (!booleanValue) {
                            dissVar4.a = 2 | i6;
                            dissVar4.c = o;
                        }
                        F.g(bZ5.bK());
                    }
                    btlu btluVar = this.b;
                    dbsk.s(btluVar);
                    synchronized (this) {
                        ajia ajiaVar = this.al;
                        dbsk.s(ajiaVar);
                        dcdc f = F.f();
                        if (((ajga) ajiaVar).an != 0) {
                            bvoo.h("startCreateSharesFlow called when state is %d", Integer.valueOf(((ajga) ajiaVar).an));
                        } else {
                            ((ajga) ajiaVar).ai = f;
                            ((ajga) ajiaVar).ah = btluVar.d;
                            ((ajga) ajiaVar).aj = true;
                            ((ajga) ajiaVar).an = 1;
                            ((ajga) ajiaVar).g.f();
                        }
                    }
                    return;
                }
                throw null;
            }
            if (this.g == 1) {
                z2 = true;
            }
            dbsk.l(z2);
            CreateSharesFlowFragment$TargetData createSharesFlowFragment$TargetData2 = this.f;
            dbsk.s(createSharesFlowFragment$TargetData2);
            if (createSharesFlowFragment$TargetData2.d() == 0) {
                throw null;
            }
            synchronized (this) {
                CreateSharesFlowFragment$TargetData createSharesFlowFragment$TargetData3 = this.f;
                dbsk.s(createSharesFlowFragment$TargetData3);
                int d2 = createSharesFlowFragment$TargetData3.d();
                if (d2 == 0) {
                    throw null;
                }
                if (d2 == 1) {
                    ajhx ajhxVar = this.aX;
                    dbsk.s(ajhxVar);
                    String b3 = createSharesFlowFragment$TargetData3.f().b().b();
                    dbsk.s(b3);
                    ajhxVar.e(b3, true);
                } else {
                    ajhx ajhxVar2 = this.aX;
                    dbsk.s(ajhxVar2);
                    Integer num = this.e;
                    dbsk.s(num);
                    ajhxVar2.f(createSharesFlowFragment$TargetData3.g().b(), num.intValue(), true);
                }
            }
        }
    }

    public final void aU() {
        gga ggaVar = this.aE;
        if (ggaVar == null || D()) {
            return;
        }
        ggaVar.g().f();
    }

    public final boolean aV() {
        CreateSharesFlowFragment$TargetData createSharesFlowFragment$TargetData = this.f;
        if (createSharesFlowFragment$TargetData != null) {
            int d = createSharesFlowFragment$TargetData.d();
            if (d == 0) {
                throw null;
            }
            return d == 3;
        }
        return false;
    }

    public final void aX() {
        GmmLocation gmmLocation = this.ag;
        if (gmmLocation == null) {
            return;
        }
        final dehn<aeuk> b = this.ay.b(gmmLocation, 2);
        b.Pk(new Runnable(this, b) { // from class: ajch
            private final ajcr a;
            private final dehn b;

            {
                this.a = this;
                this.b = b;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ajcr ajcrVar = this.a;
                try {
                    aeuk aeukVar = (aeuk) deha.r(this.b);
                    if (ajcrVar.ae == null) {
                        return;
                    }
                    if (!aeukVar.b().isEmpty()) {
                        ajwq ajwqVar = ajcrVar.ae;
                        dbsk.s(ajwqVar);
                        ajwqVar.e(aeukVar.b());
                        return;
                    }
                    ajwq ajwqVar2 = ajcrVar.ae;
                    dbsk.s(ajwqVar2);
                    ajwqVar2.e(aeukVar.a());
                } catch (Exception unused) {
                }
            }
        }, this.aT);
    }

    @Override // defpackage.fd
    public final void ab(int i, String[] strArr, int[] iArr) {
        ajxy ajxyVar = this.aj;
        if (ajxyVar != null) {
            ajxyVar.a(i, strArr, iArr);
        }
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        super.ag(layoutInflater, viewGroup, bundle);
        this.aZ = this.am.c(new ajcx(), null);
        cqkf<ajdl> c = this.am.c(new ajdk(), null);
        this.ba = c;
        return c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        SendKitPickerResult sendKitPickerResult = this.aW;
        if (sendKitPickerResult != null) {
            i(sendKitPickerResult);
            this.aW = null;
        }
    }

    public final void bo() {
        if (this.aY != null) {
            if (!J().isFinishing() && !J().isDestroyed()) {
                ProgressDialog progressDialog = this.aY;
                dbsk.s(progressDialog);
                progressDialog.dismiss();
            }
            this.aY = null;
        }
    }

    public final void bp(CharSequence charSequence) {
        ckos.a(J().findViewById(16908290), charSequence, 0).c();
    }

    @Override // defpackage.ajvd
    public final void g(ResolveInfo resolveInfo) {
        if (!aV() && this.g == 0) {
            bwfp bwfpVar = this.af;
            dbsk.s(bwfpVar);
            Intent b = bwfpVar.b(resolveInfo);
            if (b == null) {
                bvoo.h("Share app unresolvable.", new Object[0]);
                bp(Rp(R.string.UPDATE_SHARES_OPERATION_FAILED));
                aU();
                return;
            }
            bwfpVar.c(b);
            AutoValue_CreateSharesFlowFragment_SavedIntent autoValue_CreateSharesFlowFragment_SavedIntent = new AutoValue_CreateSharesFlowFragment_SavedIntent(b, resolveInfo.loadLabel(this.ap.getPackageManager()).toString());
            ajcp e = CreateSharesFlowFragment$TargetData.e();
            ajce ajceVar = (ajce) e;
            ajceVar.d = 1;
            ajceVar.a = autoValue_CreateSharesFlowFragment_SavedIntent;
            this.f = e.a();
            aT();
        }
    }

    @Override // defpackage.ajdr
    public final void i(SendKitPickerResult sendKitPickerResult) {
        if (aV()) {
            return;
        }
        ajcp e = CreateSharesFlowFragment$TargetData.e();
        ajce ajceVar = (ajce) e;
        ajceVar.d = 2;
        ajceVar.b = sendKitPickerResult;
        this.f = e.a();
        aT();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        synchronized (this) {
            try {
                if (!this.o.isEmpty()) {
                    Bundle bundle2 = this.o;
                    String string = bundle2.getString("accountId");
                    dbsk.s(string);
                    this.c = string;
                    String string2 = bundle2.getString("account_name");
                    dbsk.s(string2);
                    this.aU = string2;
                    this.d = ajco.values()[bundle2.getInt("mode")];
                    this.e = Integer.valueOf(bundle2.getInt("KEY_SHARE_MESSAGE_RESOURCE_ID"));
                    if (bundle2.containsKey("target_data")) {
                        CreateSharesFlowFragment$TargetData createSharesFlowFragment$TargetData = (CreateSharesFlowFragment$TargetData) bundle2.getParcelable("target_data");
                        dbsk.s(createSharesFlowFragment$TargetData);
                        this.f = createSharesFlowFragment$TargetData;
                    }
                }
                if (bundle != null) {
                    this.g = bundle.getInt("state", 0);
                    String string3 = bundle.getString("accountId");
                    dbsk.s(string3);
                    this.c = string3;
                    String string4 = bundle.getString("account_name");
                    dbsk.s(string4);
                    this.aU = string4;
                    this.d = ajco.values()[bundle.getInt("mode")];
                    this.e = Integer.valueOf(bundle.getInt("KEY_SHARE_MESSAGE_RESOURCE_ID"));
                    if (bundle.containsKey("target_data")) {
                        CreateSharesFlowFragment$TargetData createSharesFlowFragment$TargetData2 = (CreateSharesFlowFragment$TargetData) bundle.getParcelable("target_data");
                        dbsk.s(createSharesFlowFragment$TargetData2);
                        this.f = createSharesFlowFragment$TargetData2;
                    }
                }
                dbsk.s(this.aU);
                dbsk.s(this.d);
                dbsk.s(this.e);
                dbsk.s(this.c);
                String str = this.c;
                dbsk.l(str != null && !str.isEmpty());
                String str2 = this.aU;
                dbsk.l(str2 != null && !str2.isEmpty());
                if (!aV()) {
                    this.aq.a().F();
                }
                if (this.d == ajco.LOCATION_SHARE) {
                    gn R = R();
                    String str3 = this.c;
                    dbsk.s(str3);
                    cqkj cqkjVar = this.am;
                    gz b = R.b();
                    ajga ajgaVar = (ajga) R.H("CREATE_SHARES_FLOW_CONTROLLER_TAG");
                    if (ajgaVar == null) {
                        ajgaVar = ajga.d(str3);
                        b.y(ajgaVar, "CREATE_SHARES_FLOW_CONTROLLER_TAG");
                    }
                    if (!b.q()) {
                        b.g();
                    }
                    ajgaVar.f(cqkjVar);
                    this.al = ajgaVar;
                } else {
                    try {
                        String str4 = this.c;
                        dbsk.s(str4);
                        ahvk br = br();
                        dbsk.s(br);
                        this.aX = ajft.a(this, str4, br, this.am);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                this.af = bwfp.f(this.ap, false);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.addFlags(134742016);
                intent.setType("text/plain");
                bwfp bwfpVar = this.af;
                dbsk.s(bwfpVar);
                bwfpVar.g(intent);
                if (this.b == null) {
                    btlu a2 = this.at.a();
                    if (!a2.d.equals(this.c)) {
                        aU();
                        this.aq.a().q();
                        return;
                    }
                    this.b = a2;
                }
                dbsk.s(this.c);
                cjtd a3 = br() == null ? aV() ? cjtd.a(dtxu.eP) : cjtd.a(dtxu.dC) : cjtd.a(dtxu.fG);
                Resources resources = H().getResources();
                aida aidaVar = this.av;
                alp a4 = alp.a();
                bvsl bvslVar = this.aw;
                cqhn cqhnVar = this.ao;
                String e = dbsj.e(this.b.v());
                String j = this.b.j();
                dbsk.s(j);
                this.ae = new ajwq(resources, aidaVar, a4, bvslVar, cqhnVar, e, PersonId.c(j), Integer.valueOf(bq().c), Boolean.valueOf(bq().b), this.b.i, null, a3);
                ajdt ajdtVar = this.aQ;
                Context H = H();
                bwfp bwfpVar2 = this.af;
                dbsk.s(bwfpVar2);
                String str5 = this.aU;
                btlu btluVar = this.b;
                ajwq ajwqVar = this.ae;
                dbsk.s(ajwqVar);
                CreateSharesFlowFragment$TargetData createSharesFlowFragment$TargetData3 = this.f;
                dbsg<Profile> h = createSharesFlowFragment$TargetData3 != null ? createSharesFlowFragment$TargetData3.h() : dbpy.a;
                CharSequence bt = bt();
                boolean z = br() == null;
                boolean z2 = br() != null;
                o oVar = this.Z;
                cqat a5 = ajdtVar.a.a();
                dbsk.s(a5);
                cqhn a6 = ajdtVar.b.a();
                dbsk.s(a6);
                ajus a7 = ajdtVar.c.a();
                dbsk.s(a7);
                dbsk.s(ajdtVar.d.a());
                dbsk.s(ajdtVar.e.a());
                dbsk.s(H);
                dbsk.s(str5);
                dbsk.s(btluVar);
                dbsk.s(h);
                dbsk.s(bt);
                dbsk.s(oVar);
                try {
                    ajdu ajduVar = new ajdu(a5, a6, a7, H, bwfpVar2, this, str5, btluVar, ajwqVar, h, bt, z, z2, oVar);
                    ajduVar.h.a(ajduVar.c);
                    this.ad = ajduVar;
                    this.aV = new ajdb(new ajcj(this), bt(), this.ao, J(), bs(), br() != null);
                    GmmLocation a8 = this.az.a().a();
                    this.ag = a8;
                    if (a8 != null) {
                        aX();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ajdb ajdbVar = this.aV;
        if (ajdbVar != null) {
            ajdbVar.c(bs());
        }
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return br() != null ? dtxy.a : aV() ? dtxu.eI : dtxu.ds;
    }

    @Override // defpackage.ajdr
    public final void q() {
        ajae ajaeVar = this.aP;
        gga ggaVar = this.aE;
        dbsk.s(ggaVar);
        ajaeVar.a(ggaVar, this.am);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        btrm btrmVar = this.au;
        ajcm ajcmVar = this.bb;
        dceq a2 = dcet.a();
        a2.b(amqo.class, new ajct(amqo.class, ajcmVar, bvrj.UI_THREAD));
        btrmVar.g(ajcmVar, a2.a());
        this.aO.a(this.bc);
        aX();
        this.aZ.e(this.aV);
        egj egjVar = new egj(this);
        egjVar.k(false);
        egjVar.ad(false);
        egjVar.f(false);
        egjVar.G(this.aZ.c(), 5);
        egjVar.ag(null);
        egjVar.D(0);
        egjVar.w(this.ba.c());
        egjVar.y(true);
        egjVar.x(egr.a);
        this.an.a(egjVar.a());
        this.ba.e(this.ad);
        ajdu ajduVar = this.ad;
        dbsk.s(ajduVar);
        View c = this.ba.c();
        ajcs ajcsVar = this.aR;
        ajcl ajclVar = this.aS;
        cjmt a3 = ajcsVar.a.a();
        ajcs.a(a3, 1);
        ajcs.a(ajclVar, 2);
        ajduVar.w(c, new ajck(a3, ajclVar));
        synchronized (this) {
            ajia ajiaVar = this.al;
            if (ajiaVar != null) {
                ajiaVar.e(this);
                this.al.f(this.am);
            }
            ajhx ajhxVar = this.aX;
            if (ajhxVar != null) {
                ajhxVar.g(this);
                this.aX.h(this.am);
            }
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        synchronized (this) {
            bundle.putInt("state", this.g);
            ajco ajcoVar = this.d;
            dbsk.s(ajcoVar);
            bundle.putInt("mode", ajcoVar.ordinal());
            bundle.putString("accountId", this.c);
            bundle.putString("account_name", this.aU);
            Integer num = this.e;
            dbsk.s(num);
            bundle.putInt("KEY_SHARE_MESSAGE_RESOURCE_ID", num.intValue());
            CreateSharesFlowFragment$TargetData createSharesFlowFragment$TargetData = this.f;
            if (createSharesFlowFragment$TargetData != null) {
                bundle.putParcelable("target_data", createSharesFlowFragment$TargetData);
            }
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        this.aO.c(this.bc);
        ajyl ajylVar = this.ak;
        if (ajylVar != null && this.ah != null && this.ai != null) {
            ajylVar.f();
            Runnable runnable = this.ai;
            dbsk.s(runnable);
            runnable.run();
            this.ah = null;
            this.ai = null;
        }
        this.au.a(this.bb);
        this.ba.e(null);
        this.aZ.e(null);
        synchronized (this) {
            ajia ajiaVar = this.al;
            if (ajiaVar != null) {
                ajiaVar.g();
            }
            ajhx ajhxVar = this.aX;
            if (ajhxVar != null) {
                ajhxVar.i();
            }
        }
    }

    @Override // defpackage.ajhv
    public final void w(ajhw ajhwVar) {
        dqyb dqybVar;
        if (D()) {
            bvoo.h("Received onCreateJourneySharesComplete callback after saving instance state.", new Object[0]);
            return;
        }
        bo();
        synchronized (this) {
            if (((ajhq) ajhwVar).a != 3) {
                bp(Rp(R.string.UPDATE_SHARES_OPERATION_FAILED));
                if (this.d != ajco.LOCATION_SHARE) {
                    if (D()) {
                        bvoo.h("Tried to reset create shares flow after saving instance state.", new Object[0]);
                    } else {
                        gn R = R();
                        String str = this.at.a().d;
                        ahvk br = br();
                        dbsk.s(br);
                        ajhx b = ajft.b(R, str, br, this.am);
                        this.aX = b;
                        b.g(this);
                        this.g = 0;
                    }
                }
            } else {
                bn();
                CreateSharesFlowFragment$TargetData createSharesFlowFragment$TargetData = this.f;
                if (createSharesFlowFragment$TargetData != null) {
                    int d = createSharesFlowFragment$TargetData.d();
                    if (d == 0) {
                        throw null;
                    }
                    if (d == 1) {
                        CreateSharesFlowFragment$TargetData createSharesFlowFragment$TargetData2 = this.f;
                        dbsk.s(createSharesFlowFragment$TargetData2);
                        dqzv dqzvVar = (dqzv) dcft.c(((ajhq) ajhwVar).c);
                        Intent a2 = createSharesFlowFragment$TargetData2.f().b().a();
                        dbsk.s(a2);
                        Integer num = this.e;
                        dbsk.s(num);
                        int intValue = num.intValue();
                        Object[] objArr = new Object[1];
                        if (dqzvVar.b != 2) {
                            dqybVar = dqyb.j;
                        } else {
                            dqybVar = (dqyb) dqzvVar.c;
                        }
                        objArr[0] = dqybVar.d;
                        a2.putExtra("android.intent.extra.TEXT", Rq(intValue, objArr));
                        try {
                            Intent a3 = createSharesFlowFragment$TargetData2.f().b().a();
                            dbsk.s(a3);
                            ahyp.a(a3);
                            this.aB.a().i(this, a3, 4);
                        } catch (SecurityException unused) {
                            bvoo.h("Permission Denied when attempting to start a third party app.", new Object[0]);
                            Resources Rn = Rn();
                            alp a4 = alp.a();
                            String b2 = createSharesFlowFragment$TargetData2.f().b().b();
                            dbsk.s(b2);
                            bp(ajsb.a(Rn, a4, R.string.THIRD_PARTY_APP_SHARE_FAILED, b2));
                            bwfp bwfpVar = this.af;
                            dbsk.s(bwfpVar);
                            Intent a5 = createSharesFlowFragment$TargetData2.f().b().a();
                            dbsk.s(a5);
                            bwfpVar.d(a5);
                        }
                    }
                }
                aU();
            }
        }
    }

    public final void bn() {
        try {
            CreateSharesFlowFragment$TargetData createSharesFlowFragment$TargetData = this.f;
            if (createSharesFlowFragment$TargetData != null) {
                int d = createSharesFlowFragment$TargetData.d();
                if (d == 0) {
                    throw null;
                }
                if (d == 2) {
                    this.as.e(this.f.g().b(), J());
                    this.f = null;
                    return;
                }
            }
            CreateSharesFlowFragment$TargetData createSharesFlowFragment$TargetData2 = this.f;
            if (createSharesFlowFragment$TargetData2 == null) {
                return;
            }
            int d2 = createSharesFlowFragment$TargetData2.d();
            if (d2 == 0) {
                throw null;
            }
            if (d2 != 1) {
                return;
            }
            this.as.f(J());
        } catch (cxzr e) {
            bvoo.f(new RuntimeException(e));
        }
    }
}
