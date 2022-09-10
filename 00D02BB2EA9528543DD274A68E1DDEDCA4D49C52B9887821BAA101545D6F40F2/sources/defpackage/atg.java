package defpackage;

import android.content.Context;
import android.media.MediaRouter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atg  reason: default package */
/* loaded from: classes2.dex */
public class atg extends atf {
    public atg(Context context, ath athVar) {
        super(context, athVar);
    }

    @Override // defpackage.ate
    protected final void A(Object obj) {
        ((MediaRouter) this.a).selectRoute(8388611, (MediaRouter.RouteInfo) obj);
    }

    @Override // defpackage.ate
    protected final Object B() {
        return ((MediaRouter) this.a).getDefaultRoute();
    }

    @Override // defpackage.atf
    protected final boolean D(atc atcVar) {
        return ((MediaRouter.RouteInfo) atcVar.a).isConnecting();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.atf, defpackage.ate
    public void m(atc atcVar, aqm aqmVar) {
        super.m(atcVar, aqmVar);
        CharSequence description = ((MediaRouter.RouteInfo) atcVar.a).getDescription();
        if (description != null) {
            aqmVar.d(description.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ate
    public final void x(atd atdVar) {
        super.x(atdVar);
        ((MediaRouter.UserRouteInfo) atdVar.b).setDescription(atdVar.a.e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.atf, defpackage.ate
    public final void y() {
        if (this.o) {
            ase.a(this.a, this.b);
        }
        this.o = true;
        Object obj = this.a;
        ((MediaRouter) obj).addCallback(this.m, (MediaRouter.Callback) this.b, (this.n ? 1 : 0) | 2);
    }
}
