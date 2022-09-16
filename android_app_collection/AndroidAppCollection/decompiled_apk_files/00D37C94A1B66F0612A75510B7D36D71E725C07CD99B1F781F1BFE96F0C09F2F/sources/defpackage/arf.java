package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: arf  reason: default package */
/* loaded from: classes2.dex */
class arf implements arb {
    final List a = new ArrayList();
    MediaBrowserService b;
    Messenger c;
    final /* synthetic */ arx d;

    public arf(arx arxVar) {
        this.d = arxVar;
    }

    @Override // defpackage.arb
    public final IBinder a(Intent intent) {
        return this.b.onBind(intent);
    }

    @Override // defpackage.arb
    public void b() {
        are areVar = new are(this, this.d);
        this.b = areVar;
        areVar.onCreate();
    }

    @Override // defpackage.arb
    public final void c(MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.d.d.a(new arc(this, mediaSessionCompat$Token));
    }
}
