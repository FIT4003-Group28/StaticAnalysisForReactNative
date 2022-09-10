package defpackage;

import android.media.MediaRouter;
import android.view.Display;
import defpackage.atf;
/* compiled from: PG */
/* renamed from: asg  reason: default package */
/* loaded from: classes2.dex */
final class asg<T extends atf> extends ary<T> {
    public asg(atf atfVar) {
        super(atfVar);
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        atf atfVar = (atf) this.a;
        int s = atfVar.s(routeInfo);
        if (s >= 0) {
            atc atcVar = atfVar.p.get(s);
            Display a = asi.a(routeInfo);
            int displayId = a != null ? a.getDisplayId() : -1;
            if (displayId == atcVar.c.r()) {
                return;
            }
            aqm aqmVar = new aqm(atcVar.c);
            aqmVar.i(displayId);
            atcVar.c = aqmVar.a();
            atfVar.r();
        }
    }
}
