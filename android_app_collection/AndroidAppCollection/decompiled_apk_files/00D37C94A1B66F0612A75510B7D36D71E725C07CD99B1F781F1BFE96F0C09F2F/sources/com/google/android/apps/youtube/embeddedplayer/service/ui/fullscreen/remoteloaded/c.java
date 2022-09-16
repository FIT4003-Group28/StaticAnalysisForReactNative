package com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded;

import android.app.ActionBar;
import android.content.Context;
import android.os.RemoteException;
import android.view.Window;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.bn;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.bp;
import com.google.android.apps.youtube.embeddedplayer.service.model.g;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c implements yzx {
    public final com.google.android.apps.youtube.embeddedplayer.service.jar.a a;
    public final yzt b;
    public final ActionBar c;
    public final Window d;
    public g e = g.a;
    public boolean f;
    public boolean g;
    public final bn h;

    public c(Context context, com.google.android.apps.youtube.embeddedplayer.service.jar.a aVar, bn bnVar, yzt yztVar) {
        context.getClass();
        this.a = aVar;
        this.h = bnVar;
        this.c = aVar.c();
        this.d = aVar.d();
        this.b = yztVar;
        this.f = true;
    }

    @Override // defpackage.yzx
    public final void w() {
        if (!this.f || !this.g) {
            return;
        }
        bp bpVar = this.h.a;
        if (bpVar.f()) {
            try {
                bpVar.c.J();
                return;
            } catch (RemoteException e) {
                pcu.h(e);
                return;
            }
        }
        pcu.i();
    }
}
