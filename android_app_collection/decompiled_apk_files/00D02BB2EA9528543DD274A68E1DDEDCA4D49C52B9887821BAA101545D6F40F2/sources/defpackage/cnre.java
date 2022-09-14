package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: cnre  reason: default package */
/* loaded from: classes.dex */
final class cnre implements cnpe {
    final /* synthetic */ cnrn a;

    public cnre(cnrn cnrnVar) {
        this.a = cnrnVar;
    }

    @Override // defpackage.cnpe
    public final void a(boolean z) {
        Handler handler = this.a.n;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z)));
    }
}
