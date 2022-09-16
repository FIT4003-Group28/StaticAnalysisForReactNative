package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: nvt  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nvt implements View.OnClickListener {
    public final /* synthetic */ nvu a;
    private final /* synthetic */ int b;

    public /* synthetic */ nvt(nvu nvuVar) {
        this.a = nvuVar;
    }

    public /* synthetic */ nvt(nvu nvuVar, int i) {
        this.b = i;
        this.a = nvuVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            nvw nvwVar = this.a.c;
            if (nvwVar.b.e() == null) {
                return;
            }
            nvwVar.b.e().E();
        } else if (i == 1) {
            for (ahig ahigVar : this.a.c.c) {
                ahigVar.q(false);
            }
        } else {
            nvg nvgVar = this.a.c.g;
            azqb azqbVar = nvgVar.a;
            acti actiVar = nvgVar.b;
            long j = nvp.a;
            airr airrVar = (airr) azqbVar.get();
            if (airrVar.d()) {
                actiVar.H(3, new acte(actj.MINI_PLAYER_PAUSE_BUTTON), null);
                airrVar.a();
                return;
            }
            actiVar.H(3, new acte(actj.MINI_PLAYER_PLAY_BUTTON), null);
            airrVar.b();
        }
    }
}
