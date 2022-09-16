package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import com.google.android.youtube.R;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: akmx  reason: default package */
/* loaded from: classes.dex */
public final class akmx extends akmz implements akpf {
    public ajmy ae;
    public ajsg af;
    public akkv ag;
    public akku ah;
    public ViewSwitcher ai;
    public ViewGroup aj;
    public Object ak;
    private akoi al;
    private ajsf am;

    @Override // defpackage.akmz, defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        this.al = new akoi(activity, this.ae);
        ajsm ajsmVar = new ajsm();
        ajqw ajqwVar = new ajqw();
        ajqwVar.f(vez.class, new weo((Context) activity, 4, (short[]) null));
        ajsf a = this.af.a(ajqwVar);
        this.am = a;
        a.h(ajsmVar);
        akkv akkvVar = this.ag;
        akoi akoiVar = this.al;
        int orElse = zhn.j(activity, R.attr.ytTextPrimary).orElse(0);
        Context context = (Context) akkvVar.a.get();
        context.getClass();
        aafo aafoVar = (aafo) akkvVar.b.get();
        aafoVar.getClass();
        zjb zjbVar = (zjb) akkvVar.c.get();
        zjbVar.getClass();
        ziw ziwVar = (ziw) akkvVar.d.get();
        ziwVar.getClass();
        akph akphVar = (akph) akkvVar.e.get();
        akphVar.getClass();
        akoiVar.getClass();
        this.ah = new akku(context, aafoVar, zjbVar, ziwVar, akphVar, this, ajsmVar, akoiVar, orElse);
        this.am.rZ(new akmw(this.ah));
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        akku akkuVar = this.ah;
        zjc zjcVar = akkuVar.f;
        if (zjcVar != null) {
            akkuVar.a.a(zjcVar);
            akkuVar.f = null;
        }
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        akku akkuVar = this.ah;
        akkuVar.e();
        if (akkuVar.c != null && akkuVar.g != null) {
            zjc zjcVar = akkuVar.f;
            if (zjcVar != null) {
                akkuVar.a.a(zjcVar);
            }
            akkuVar.f = new zjc(akkuVar, Arrays.asList(akkuVar.g, akkuVar.c));
            ziw ziwVar = akkuVar.a;
            zjc zjcVar2 = akkuVar.f;
            ylr.c();
            aqxo.p(true);
            for (Uri uri : zjcVar2.b) {
                zew.M(ziwVar.a, uri, zjcVar2.a);
            }
            ((zjd) ziwVar.b.get()).g(zjcVar2.b, akkuVar);
        }
        akkuVar.d();
    }

    @Override // defpackage.akpf
    public final void aE() {
        ViewSwitcher viewSwitcher = this.ai;
        if (viewSwitcher == null || viewSwitcher.getCurrentView() == null || this.ai.getCurrentView().getId() != R.id.progress_spinner) {
            return;
        }
        this.ai.showNext();
    }

    @Override // defpackage.akpf
    public final void aF(dt dtVar) {
        super.qv(dtVar.getSupportFragmentManager(), null);
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        mN(1, 0);
        Bundle bundle2 = this.m;
        if (bundle2.containsKey("CONTEXT_MENU")) {
            try {
                this.ah.g((atep) aphq.i(bundle2, "CONTEXT_MENU", atep.a, aoos.b()), this.ak);
            } catch (aopx unused) {
                ku();
                zep.l("Conversation bottom sheet failed to merge MenuRenderer.");
            }
        }
        akku akkuVar = this.ah;
        String string = bundle2.getString("CONTACT_PATH_KEY");
        Object obj = this.ak;
        if (TextUtils.isEmpty(string)) {
            return;
        }
        akkuVar.g = new Uri.Builder().path(string).build();
        akkuVar.h = obj;
        akkuVar.h();
        akkuVar.d();
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.share_bottom_sheet_list_fragment, viewGroup, false);
        viewGroup2.setBackgroundColor(zhn.j(viewGroup2.getContext(), R.attr.ytBrandBackgroundSolid).orElse(0));
        RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.bottom_sheet_list_view);
        recyclerView.ag(new LinearLayoutManager(1));
        recyclerView.ad(this.am);
        recyclerView.setPadding(0, rh().getDimensionPixelSize(R.dimen.bottom_sheet_padding_top), 0, 0);
        this.aj = viewGroup2;
        viewGroup2.addOnLayoutChangeListener(new akmv(this));
        this.aj.addView(this.al.a, 0);
        ViewSwitcher viewSwitcher = (ViewSwitcher) layoutInflater.inflate(R.layout.conversation_bottom_sheet_fragment, viewGroup, false);
        this.ai = viewSwitcher;
        viewSwitcher.addView(this.aj);
        return this.ai;
    }
}
