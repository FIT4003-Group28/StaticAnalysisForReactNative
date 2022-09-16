package defpackage;

import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jpr  reason: default package */
/* loaded from: classes3.dex */
public final class jpr implements akev {
    final /* synthetic */ jpu a;

    public jpr(jpu jpuVar) {
        this.a = jpuVar;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        akfi akfiVar = (akfi) obj;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        akfi akfiVar = (akfi) obj;
        acti oi = this.a.e.oi();
        InteractionLoggingScreen c = oi.c();
        if (c != null) {
            acum acumVar = new acum(c, actj.OFFLINE_VIDEO_DOWNLOADING_SNACKBAR);
            acum acumVar2 = new acum(c, actj.OFFLINE_VIDEO_DOWNLOADING_SNACKBAR_VIEW_BUTTON);
            oi.n(acumVar);
            oi.o(acumVar2, acumVar);
        }
    }
}
