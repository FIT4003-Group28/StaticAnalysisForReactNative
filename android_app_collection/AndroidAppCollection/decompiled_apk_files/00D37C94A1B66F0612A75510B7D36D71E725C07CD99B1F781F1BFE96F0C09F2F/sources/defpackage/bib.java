package defpackage;

import android.content.Context;
import android.media.MediaRouter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bib  reason: default package */
/* loaded from: classes2.dex */
public final class bib extends bih {
    public bib(Context context, bii biiVar) {
        super(context, biiVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bih, defpackage.big, defpackage.bif
    public final void m(bid bidVar, bfz bfzVar) {
        super.m(bidVar, bfzVar);
        bfzVar.f(((MediaRouter.RouteInfo) bidVar.a).getDeviceType());
    }
}
