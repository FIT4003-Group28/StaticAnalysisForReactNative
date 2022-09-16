package com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service;

import android.os.Handler;
import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.h;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.j;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.k;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c {
    private final SparseArray a = new SparseArray();
    private f b;
    private h c;
    private final rvx d;

    public c(List list, Handler handler, rvx rvxVar, f fVar, byte[] bArr) {
        this.d = rvxVar;
        this.b = fVar;
        this.c = new h(handler, rvxVar, null);
        amzt listIterator = ((amuk) list).listIterator();
        while (listIterator.hasNext()) {
            final int intValue = ((Integer) listIterator.next()).intValue();
            k kVar = new k() { // from class: com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.a
                @Override // com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.k
                public final void a(boolean z) {
                    c.this.a(intValue, z);
                }
            };
            this.a.put(intValue, kVar);
            rvxVar.b(intValue, kVar);
        }
        try {
            h hVar = this.c;
            if (hVar == null) {
                return;
            }
            fVar.a(hVar);
        } catch (RemoteException unused) {
        }
    }

    public final synchronized void a(int i, boolean z) {
        f fVar = this.b;
        if (fVar != null) {
            try {
                fVar.f(i, z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final synchronized void b() {
        this.c = null;
        this.b = null;
        for (int i = 0; i < this.a.size(); i++) {
            rvx rvxVar = this.d;
            int keyAt = this.a.keyAt(i);
            k kVar = (k) this.a.valueAt(i);
            j jVar = (j) rvxVar.a.get(keyAt);
            if (jVar != null) {
                jVar.b.remove(kVar);
            }
        }
        this.a.clear();
    }
}
