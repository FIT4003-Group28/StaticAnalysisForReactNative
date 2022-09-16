package com.google.android.apps.youtube.embeddedplayer.service.jar;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.ax;
import com.google.android.apps.youtube.embeddedplayer.service.model.PlaybackEventData;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class n {
    public static final n a = new n(null);
    final WeakReference b;
    PlaybackEventData c;
    boolean d = false;

    public n(ax axVar) {
        this.b = new WeakReference(axVar);
    }

    public final synchronized void a() {
        com.google.android.apps.youtube.embeddedplayer.service.model.h g = PlaybackEventData.g();
        g.d(5);
        PlaybackEventData playbackEventData = this.c;
        g.a = playbackEventData != null ? playbackEventData.f() : null;
        g.e(Long.MIN_VALUE);
        g.c(0L);
        PlaybackEventData playbackEventData2 = this.c;
        g.b(playbackEventData2 != null ? playbackEventData2.a() : 1.0f);
        b(g.a());
    }

    public final synchronized void b(PlaybackEventData playbackEventData) {
        if (playbackEventData.equals(this.c)) {
            return;
        }
        final ax axVar = (ax) this.b.get();
        if (axVar == null) {
            return;
        }
        if (this.d && playbackEventData.b() == 1) {
            return;
        }
        if (playbackEventData.b() == 1) {
            this.d = true;
        } else if (playbackEventData.b() == 5) {
            this.d = false;
        }
        final long c = playbackEventData.c();
        axVar.d.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.av
            @Override // java.lang.Runnable
            public final void run() {
                ax axVar2 = ax.this;
                long j = c;
                try {
                    o oVar = axVar2.n;
                    if (oVar != null) {
                        oVar.a(j);
                    }
                    axVar2.k.m(j);
                } catch (RemoteException unused) {
                    aqvb.k("Problem sending playback event to client.", new Object[0]);
                }
            }
        });
        final int b = playbackEventData.b();
        final String f = playbackEventData.f();
        final long e = playbackEventData.e();
        axVar.d.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.au
            @Override // java.lang.Runnable
            public final void run() {
                ax axVar2 = ax.this;
                int i = b;
                String str = f;
                long j = e;
                try {
                    o oVar = axVar2.n;
                    if (oVar != null) {
                        oVar.b(i);
                    }
                    axVar2.k.l(i, str, j);
                } catch (RemoteException unused) {
                    aqvb.k("Problem sending playback event to client.", new Object[0]);
                }
            }
        });
        this.c = playbackEventData;
    }

    public final synchronized boolean c(ax axVar) {
        return akzj.f(this.b.get(), axVar);
    }
}
