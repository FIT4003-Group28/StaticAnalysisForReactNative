package defpackage;

import android.content.Context;
import android.media.MediaRouter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ata  reason: default package */
/* loaded from: classes2.dex */
public final class ata extends atg {
    public ata(Context context, ath athVar) {
        super(context, athVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.atg, defpackage.atf, defpackage.ate
    public final void m(atc atcVar, aqm aqmVar) {
        super.m(atcVar, aqmVar);
        aqmVar.e(((MediaRouter.RouteInfo) atcVar.a).getDeviceType());
    }
}
