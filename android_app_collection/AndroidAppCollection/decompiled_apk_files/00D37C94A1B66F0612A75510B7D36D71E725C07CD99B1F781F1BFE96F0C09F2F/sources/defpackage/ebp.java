package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ebp */
/* loaded from: classes3.dex */
public final class ebp extends ebm implements gbp, njc {
    public azqb ae;
    public ajsg af;
    public ajin ag;
    public azqb ah;
    public gbq ai;
    public azqb aj;
    public abdm ak;
    public HatsController al;
    public Executor am;
    public ezh an;
    public gfu ao;
    public ajsm ap;
    public ajyw aq;
    public acti ar;
    public boolean as;
    private ajsf at;

    public static final ajyv aK(ajxf ajxfVar, ajyw ajywVar) {
        ajyu a = ajyv.a();
        a.d = ajywVar;
        a.a = ajxfVar;
        return a.a();
    }

    @Override // defpackage.dp
    public final void U() {
        super.U();
        ((oev) this.aj.get()).d(this);
    }

    @Override // defpackage.dp
    public final void aB() {
        dismiss();
    }

    public final void aG() {
        this.ap.clear();
    }

    @Override // defpackage.gbp
    public final void aI(gbr gbrVar) {
        dismiss();
    }

    @Override // defpackage.njc
    public final void aJ(ezu ezuVar) {
    }

    @Override // defpackage.njc
    public final void aL() {
        dismiss();
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        this.ap = new ajsm();
        ajsi ajsiVar = new ajsi();
        ajsiVar.f(ajhh.class, new ajsc(this.ae));
        ajsiVar.f(ajyv.class, new ajsc(this.ah));
        ajsf a = this.af.a(ajsiVar);
        this.at = a;
        a.h(this.ap);
        this.at.rZ(new ajrc(this.ar));
        this.ai.l(this);
        ((oev) this.aj.get()).a(this);
        mN(2, this.ao.a() == gfs.LIGHT ? 2132083921 : 2132083920);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.profile_card_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.list);
        recyclerView.ad(this.at);
        recyclerView.ag(new LinearLayoutManager());
        this.ap.add(aK(ajxe.a(), null));
        return inflate;
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.as) {
            abdl a = this.ak.a();
            a.i();
            aopa createBuilder = asdu.a.createBuilder();
            asdq asdqVar = asdq.a;
            createBuilder.copyOnWrite();
            asdu asduVar = (asdu) createBuilder.instance;
            asdqVar.getClass();
            asduVar.c = asdqVar;
            asduVar.b = 5;
            a.a = (asdu) createBuilder.mo39build();
            ylx.k(this.ak.b(a), this.am, dzl.e, new ebo(this));
        }
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        return new aljo(mJ(), this.b);
    }
}
