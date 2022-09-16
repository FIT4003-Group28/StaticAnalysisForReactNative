package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.YpcOffersListDialogFragmentController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint;
import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;
/* compiled from: PG */
/* renamed from: irh  reason: default package */
/* loaded from: classes3.dex */
public final class irh extends iph implements mte, xzd {
    public YpcOffersListDialogFragmentController aA;
    private TextView aB;
    private View aC;
    private RecyclerView aD;
    private View aE;
    private yfh aF;
    private zdx aG;
    private String aH = null;
    public Activity ae;
    public aafo af;
    public afvn ag;
    public afwc ah;
    public acth ai;
    public abem aj;
    public yzj ak;
    public azqb al;
    public xzn am;
    public yag an;
    public ycs ao;
    public yao ap;
    public ajsg aq;
    public feu ar;
    public xyw as;
    apzg at;
    public String au;
    public AlertDialog av;
    public TextView aw;
    public EditText ax;
    public AlertDialog ay;
    public ajsm az;

    @Override // defpackage.iph, defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        this.ae = activity;
    }

    public final yfh aG() {
        if (this.aF == null) {
            this.aF = new yfh(this.ae, this.ak);
        }
        return this.aF;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aH() {
        this.aE.setVisibility(8);
        this.aD.setVisibility(0);
        this.aD.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aI() {
        auxy auxyVar;
        if (this.at == null) {
            zep.b("No navigation endpoint provided.");
            dismiss();
        }
        if (this.at.qn(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint)) {
            aK(null);
        } else if (this.at.qn(ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.managePurchaseEndpoint)) {
            ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint managePurchaseEndpointOuterClass$ManagePurchaseEndpoint = (ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint) this.at.qm(ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.managePurchaseEndpoint);
            aszj aszjVar = managePurchaseEndpointOuterClass$ManagePurchaseEndpoint.b;
            if (aszjVar == null) {
                aszjVar = aszj.a;
            }
            if (aszjVar.b != 173521720) {
                return;
            }
            aszj aszjVar2 = managePurchaseEndpointOuterClass$ManagePurchaseEndpoint.b;
            if (aszjVar2 == null) {
                aszjVar2 = aszj.a;
            }
            if (aszjVar2.b == 173521720) {
                auxyVar = (auxy) aszjVar2.c;
            } else {
                auxyVar = auxy.a;
            }
            aJ();
            aH();
            aL("");
            this.az.add(auxyVar);
        } else {
            String valueOf = String.valueOf(this.at);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb.append("Unknown navigation endpoint provided: ");
            sb.append(valueOf);
            zep.b(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aJ() {
        if (this.az == null) {
            ajqw ajqwVar = new ajqw();
            ajqwVar.f(awia.class, new ajsc(this.al));
            ajqwVar.f(atec.class, new ird(this, 1));
            ajqwVar.f(auxy.class, new ird(this));
            ajqwVar.f(avlq.class, new ird(this, 2));
            ajqwVar.f(awid.class, new mtd(this.ae, this));
            ajqwVar.f(mjg.class, new weo(this.ae, 1));
            ajsf a = this.aq.a(ajqwVar);
            ajsm ajsmVar = new ajsm();
            a.h(ajsmVar);
            a.rZ(new ajrc(this.ai.oi()));
            this.aD.ad(a);
            this.az = ajsmVar;
        }
        this.az.clear();
    }

    public final void aK(String str) {
        this.aE.setVisibility(0);
        this.aD.setVisibility(4);
        this.aD.setClickable(false);
        apzg apzgVar = this.at;
        if (apzgVar == null || !apzgVar.qn(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint)) {
            zep.b("Invalid navigation endpoint provided.");
            dismiss();
            return;
        }
        abel a = this.aj.a();
        a.t((YpcOffersEndpoint$YPCOffersEndpoint) this.at.qm(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint));
        a.k(eog.bl(this.at));
        if (!TextUtils.isEmpty(str)) {
            a.a = abel.g(str);
        }
        this.au = str;
        this.aj.b(a, new irg(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aL(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.aB.setVisibility(8);
            this.aC.setVisibility(8);
            return;
        }
        this.aC.setVisibility(0);
        this.aB.setVisibility(0);
        this.aB.setText(charSequence);
    }

    public final void aM(awid awidVar) {
        awhu awhuVar;
        CharSequence charSequence;
        aJ();
        this.az.addAll(yce.c(awidVar));
        awic awicVar = awidVar.f;
        if (awicVar == null) {
            awicVar = awic.a;
        }
        CharSequence charSequence2 = null;
        if ((awicVar.b & 1) != 0) {
            awic awicVar2 = awidVar.f;
            if (awicVar2 == null) {
                awicVar2 = awic.a;
            }
            awhuVar = awicVar2.c;
            if (awhuVar == null) {
                awhuVar = awhu.a;
            }
        } else {
            awhuVar = null;
        }
        arag aragVar = awidVar.e;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        if (!TextUtils.isEmpty(ajgl.b(aragVar)) && awhuVar != null) {
            this.az.add(awidVar);
        }
        if (awidVar.g.size() > 0 || awidVar.i.size() > 0) {
            ajsm ajsmVar = this.az;
            CharSequence[] e = yce.e(awidVar.g, this.af);
            CharSequence[] e2 = yce.e(awidVar.i, this.af);
            CharSequence concat = TextUtils.concat(System.getProperty("line.separator"), System.getProperty("line.separator"));
            if (e != null) {
                for (CharSequence charSequence3 : e) {
                    charSequence2 = TextUtils.isEmpty(charSequence2) ? charSequence3 : TextUtils.concat(charSequence2, concat, charSequence3);
                }
            }
            if (e2 != null) {
                charSequence = charSequence2;
                for (CharSequence charSequence4 : e2) {
                    charSequence = TextUtils.isEmpty(charSequence) ? charSequence4 : TextUtils.concat(charSequence, concat, charSequence4);
                }
            } else {
                charSequence = charSequence2;
            }
            ajsmVar.add(new mjg(charSequence2, charSequence));
        }
        aH();
        arag aragVar2 = awidVar.c;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        aL(ajgl.b(aragVar2));
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        mN(1, 0);
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mS() {
        super.mS();
        this.aH = this.ar.a();
        if (!this.ag.t()) {
            this.d.hide();
            this.ah.c(this.ae, null, new irf(this));
            return;
        }
        aI();
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mc(layoutInflater, viewGroup, bundle);
        if (bundle == null) {
            bundle = this.m;
        }
        this.at = aafr.b(bundle.getByteArray("navigation_endpoint"));
        this.aG = this.ao.a(new ire(this));
        View inflate = layoutInflater.inflate(R.layout.ypc_offers_list_item, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.offers);
        this.aD = recyclerView;
        recyclerView.ag(new LinearLayoutManager());
        this.aB = (TextView) inflate.findViewById(R.id.title);
        this.aC = inflate.findViewById(R.id.separator);
        this.aE = inflate.findViewById(R.id.progress);
        aL(null);
        return inflate;
    }

    @Override // defpackage.dh, defpackage.dp
    public final void my() {
        super.my();
        this.ar.b(this.aH);
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.aA.h(this);
        ycq ycqVar = (ycq) this.aG;
        ycs ycsVar = ycqVar.a;
        ycsVar.a.remove(ycqVar.b);
        amzs it = amvn.p(this.as.a).iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
    }
}
