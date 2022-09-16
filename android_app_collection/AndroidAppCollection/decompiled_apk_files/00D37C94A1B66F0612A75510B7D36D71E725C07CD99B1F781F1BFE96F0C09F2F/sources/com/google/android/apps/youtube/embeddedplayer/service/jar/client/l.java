package com.google.android.apps.youtube.embeddedplayer.service.jar.client;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class l {
    public final /* synthetic */ alyf a;

    public l(alyf alyfVar) {
        this.a = alyfVar;
    }

    public final void a(boolean z) {
        alyf alyfVar = this.a;
        if (!alyfVar.au()) {
            return;
        }
        alyfVar.L = alyfVar.B();
        alyfVar.ar();
        if (!z) {
            if (!alyfVar.G.isShowing()) {
                return;
            }
            alyfVar.G.dismiss();
        } else if (alyfVar.G.isShowing()) {
        } else {
            alyfVar.G.show();
        }
    }

    public final void b(boolean z) {
        this.a.am(z);
    }
}
