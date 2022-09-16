package defpackage;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat$Token;
/* compiled from: PG */
/* renamed from: arc  reason: default package */
/* loaded from: classes2.dex */
final class arc implements Runnable {
    final /* synthetic */ MediaSessionCompat$Token a;
    final /* synthetic */ arf b;

    public arc(arf arfVar, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.b = arfVar;
        this.a = mediaSessionCompat$Token;
    }

    @Override // java.lang.Runnable
    public final void run() {
        arf arfVar = this.b;
        MediaSessionCompat$Token mediaSessionCompat$Token = this.a;
        if (!arfVar.a.isEmpty()) {
            ih a = mediaSessionCompat$Token.a();
            if (a != null) {
                for (Bundle bundle : arfVar.a) {
                    bundle.putBinder("extra_session_binder", a.asBinder());
                }
            }
            arfVar.a.clear();
        }
        arfVar.b.setSessionToken((MediaSession.Token) mediaSessionCompat$Token.b);
    }
}
