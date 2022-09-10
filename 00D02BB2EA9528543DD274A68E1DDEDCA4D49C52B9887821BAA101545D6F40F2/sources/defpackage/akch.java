package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akch  reason: default package */
/* loaded from: classes.dex */
public final class akch implements crzp<btvo> {
    final /* synthetic */ akcl a;

    public akch(akcl akclVar) {
        this.a = akclVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btvo> crzmVar) {
        boolean z;
        if (!this.a.r.isDone()) {
            this.a.r.j(crzmVar.l());
        }
        synchronized (this.a) {
            btvo l = crzmVar.l();
            z = false;
            if (l != null) {
                this.a.l = btsp.c(l);
                if (!this.a.i() && this.a.m.l()) {
                    z = true;
                }
            }
        }
        if (z) {
            this.a.r(akez.GAIA_LOGIN_DISABLED_IN_CLIENT_PARAMS);
        }
    }
}
