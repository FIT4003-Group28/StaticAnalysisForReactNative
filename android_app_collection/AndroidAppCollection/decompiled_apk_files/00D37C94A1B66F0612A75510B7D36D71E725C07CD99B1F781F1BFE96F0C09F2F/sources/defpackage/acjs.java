package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.livechat.ui.view.LiveChatRecyclerView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: acjs  reason: default package */
/* loaded from: classes.dex */
public final class acjs extends acje {
    public abiq a;
    public abzc ae;
    public ajjr af;
    public tdu ag;
    public azqb ah;
    public abjy ai;
    public ajyi aj;
    public acjp ak;
    public Activity al;
    public LiveChatRecyclerView am;
    public View an;
    public apzg ao;
    public assp ap;
    public boolean aq;
    public boolean ar;
    public swq as;
    private acjq at;
    public abie b;
    public acti c;
    public ajsg d;
    public abks e;

    @Override // defpackage.acje, defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        this.al = activity;
        ajvv.b(activity.getApplicationContext());
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        this.a.r();
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        if (this.a.D()) {
            this.a.u();
        } else {
            o();
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.lc_live_chat_fragment, viewGroup, false);
        this.am = (LiveChatRecyclerView) inflate.findViewById(R.id.conversation_list);
        this.an = inflate.findViewById(R.id.more_comments_icon);
        this.e.c = true;
        this.at = new acjq(this, this.aj);
        this.am.setOnTouchListener(new acjo(this, new ScaleGestureDetector(mJ(), new acjr(this))));
        return inflate;
    }

    @Override // defpackage.dp
    public final void my() {
        super.my();
        this.a.C();
    }

    public final void o() {
        this.a.w(this.at);
        assp asspVar = this.ap;
        if (asspVar != null) {
            int i = asspVar.b;
            if ((i & 1) != 0) {
                abiq abiqVar = this.a;
                aumx aumxVar = asspVar.c;
                if (aumxVar == null) {
                    aumxVar = aumx.a;
                }
                abiqVar.z(ajna.g(aumxVar));
            } else if ((i & 2) != 0) {
                abiq abiqVar2 = this.a;
                avia aviaVar = asspVar.d;
                if (aviaVar == null) {
                    aviaVar = avia.a;
                }
                abiqVar2.z(ajna.g(aviaVar));
            } else if ((i & 4) != 0) {
                abiq abiqVar3 = this.a;
                askw askwVar = asspVar.e;
                if (askwVar == null) {
                    askwVar = askw.a;
                }
                abiqVar3.z(ajna.g(askwVar));
            } else if ((i & 8) != 0) {
                abiq abiqVar4 = this.a;
                assq assqVar = asspVar.f;
                if (assqVar == null) {
                    assqVar = assq.a;
                }
                abiqVar4.z(ajna.g(assqVar));
            } else if ((i & 16) != 0) {
                abiq abiqVar5 = this.a;
                aubu aubuVar = asspVar.g;
                if (aubuVar == null) {
                    aubuVar = aubu.a;
                }
                abiqVar5.z(ajna.g(aubuVar));
            }
        } else {
            apzg apzgVar = this.ao;
            if (apzgVar != null) {
                this.a.A(apzgVar);
            }
        }
        this.b.a = this.a;
    }
}
