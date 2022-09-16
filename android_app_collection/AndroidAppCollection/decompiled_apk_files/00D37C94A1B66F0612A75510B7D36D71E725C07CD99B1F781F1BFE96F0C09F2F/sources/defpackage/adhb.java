package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: adhb  reason: default package */
/* loaded from: classes.dex */
public final class adhb extends adgq {
    public static final String ae = zep.a("MDX.MdxMediaRouteChooserDialogFragment");
    public bgo af;
    public azqb ag;
    public adfa ah;
    public adef ai;
    public yni aj;
    public adgl ak;
    public acyz al;
    public acyx am;
    public azqb an;
    public boolean ao;
    public azqb ap;
    public acwu aq;
    public aczr ar;
    public acth as;
    public Executor at;
    public adgj au;
    public iwl av;
    private bev aw;

    @Override // defpackage.bew
    public final bev aF(Context context) {
        adha adhaVar = new adha(context, (adnq) this.ag.get(), this.ai, this.ao, this.aj, this.ap, this.an, this.ah, this.ak, this.al, this.am, this.ar, this.aq, this.as.oi(), this.at, this.au);
        this.aw = adhaVar;
        adhaVar.f(this.af);
        this.aw.setCanceledOnTouchOutside(true);
        return this.aw;
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        iwl iwlVar = this.av;
        if (iwlVar != null) {
            iwt iwtVar = iwlVar.a;
            if (iwtVar.l) {
                iwtVar.f.b(iwtVar.m, "LR notification route selection canceled.", atcs.MDX_NOTIFICATION_GEL_ACTION_USER_CANCELLED);
            }
            iwtVar.g();
        }
    }

    @Override // defpackage.dh
    public final void qv(eo eoVar, String str) {
        try {
            ex l = eoVar.l();
            l.r(this, str);
            l.a();
        } catch (IllegalStateException unused) {
        }
    }
}
