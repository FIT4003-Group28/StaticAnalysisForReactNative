package com.google.android.apps.youtube.app.extensions.mediabrowser.impl;

import android.support.v4.media.session.MediaSessionCompat$Token;
import java.util.Collections;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MainAppMediaBrowserService extends gsi {
    public gsk f;
    public azqb g;
    public azqb h;

    @Override // defpackage.arx
    public final void b(arm armVar) {
        armVar.b(Collections.emptyList());
    }

    @Override // defpackage.arx
    public final ynv e(String str) {
        if (str.equals("com.android.systemui")) {
            return null;
        }
        return new ynv(null);
    }

    @Override // defpackage.gsi, defpackage.arx, android.app.Service
    public final void onCreate() {
        super.onCreate();
        iz izVar = (iz) this.f.e.get();
        izVar.l();
        MediaSessionCompat$Token b = izVar.b();
        if (b != null) {
            if (this.e == null) {
                this.e = b;
                this.a.c(b);
                return;
            }
            throw new IllegalStateException("The session token has already been set");
        }
        throw new IllegalArgumentException("Session token may not be null");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ((ainq) this.h.get()).b(((airw) this.g.get()).r().k);
    }
}
