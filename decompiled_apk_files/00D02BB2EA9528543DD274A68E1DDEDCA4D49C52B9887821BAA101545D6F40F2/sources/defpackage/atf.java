package defpackage;

import android.content.Context;
import android.media.MediaRouter;
import android.view.Display;
/* compiled from: PG */
/* renamed from: atf  reason: default package */
/* loaded from: classes2.dex */
class atf extends ate implements arx {
    private asf r;
    private ash s;

    public atf(Context context, ath athVar) {
        super(context, athVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ate
    public void m(atc atcVar, aqm aqmVar) {
        super.m(atcVar, aqmVar);
        if (!((MediaRouter.RouteInfo) atcVar.a).isEnabled()) {
            aqmVar.f(false);
        }
        if (D(atcVar)) {
            aqmVar.c(1);
        }
        Display a = asi.a(atcVar.a);
        if (a != null) {
            aqmVar.i(a.getDisplayId());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ate
    public void y() {
        super.y();
        if (this.r == null) {
            this.r = new asf();
        }
        throw null;
    }

    @Override // defpackage.ate
    protected final Object z() {
        return new asg(this);
    }

    protected boolean D(atc atcVar) {
        if (this.s == null) {
            this.s = new ash();
        }
        Object obj = atcVar.a;
        throw null;
    }
}
