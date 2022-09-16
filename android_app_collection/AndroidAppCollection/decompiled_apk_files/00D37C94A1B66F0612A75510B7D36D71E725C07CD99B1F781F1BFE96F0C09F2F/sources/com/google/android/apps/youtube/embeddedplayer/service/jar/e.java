package com.google.android.apps.youtube.embeddedplayer.service.jar;

import com.google.android.apps.youtube.embeddedplayer.service.jar.client.aw;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.ax;
import com.google.android.apps.youtube.embeddedplayer.service.model.AdEventData;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e implements com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.c {
    public d a;
    public final ConcurrentMap b;

    public e() {
        this(new ConcurrentHashMap());
    }

    public e(ConcurrentMap concurrentMap) {
        this.b = concurrentMap;
    }

    public final void a(String str, ax axVar) {
        if (str == null || axVar == null) {
            return;
        }
        this.b.put(str, new WeakReference(axVar));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.c
    public final synchronized void b(BusSupported$Data busSupported$Data) {
        ax axVar;
        if (busSupported$Data.d().equals(com.google.android.apps.youtube.embeddedplayer.service.model.b.AD_EVENT_DATA) && (busSupported$Data instanceof AdEventData)) {
            AdEventData adEventData = (AdEventData) busSupported$Data;
            d dVar = this.a;
            if (dVar != null) {
                dVar.a(adEventData.b());
            }
            WeakReference weakReference = (WeakReference) this.b.get(adEventData.e());
            if (weakReference != null && (axVar = (ax) weakReference.get()) != null) {
                int b = adEventData.b();
                int a = adEventData.a();
                int i = axVar.t;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    axVar.a.add(aw.c(b, a));
                } else if (i2 == 1) {
                    axVar.k(b, a);
                } else if (i2 == 2) {
                    aqvb.l("Ad events are unauthorized", new Object[0]);
                }
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.c
    public final void e() {
    }
}
