package defpackage;
/* compiled from: PG */
/* renamed from: ntv  reason: default package */
/* loaded from: classes3.dex */
public final class ntv implements ezg {
    public final ezh a;
    private final acti b;
    private ezx c = ezx.NONE;

    public ntv(ezh ezhVar, acti actiVar) {
        this.a = ezhVar;
        this.b = actiVar;
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pa(ezx ezxVar) {
    }

    @Override // defpackage.ezg
    public final void pb(ezx ezxVar, ezx ezxVar2) {
        if (ezxVar.j() || ezxVar.i()) {
            this.c = ezxVar;
        }
        if (ezxVar2.j()) {
            this.b.n(new acte(actj.MINI_PLAYER_EXPAND_BUTTON));
            this.b.n(new acte(actj.MINI_PLAYER_DISMISSAL_BUTTON));
            if (!this.c.i()) {
                return;
            }
            this.b.p(acuc.DEFAULT);
        } else if (!ezxVar2.i()) {
        } else {
            this.b.n(new acte(actj.WATCH_MINIMIZE_BUTTON));
            if (!this.c.j()) {
                return;
            }
            this.b.z(acuc.DEFAULT, this.b.c());
        }
    }
}
