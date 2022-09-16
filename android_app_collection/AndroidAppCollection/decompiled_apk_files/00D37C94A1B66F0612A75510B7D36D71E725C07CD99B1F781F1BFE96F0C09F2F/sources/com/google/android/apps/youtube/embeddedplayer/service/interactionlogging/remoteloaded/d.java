package com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded;

import android.os.RemoteException;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d implements b {
    private final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d b;
    private final int c;

    public d(com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d dVar, int i) {
        this.b = dVar;
        this.c = i;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b
    public final void a(byte[] bArr) {
        try {
            this.b.e(this.c, bArr);
        } catch (RemoteException e) {
            pcu.h(e);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b
    public final void b(int i) {
        try {
            this.b.j(this.c, i);
        } catch (RemoteException e) {
            pcu.h(e);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b
    public final void c(byte[] bArr) {
        try {
            this.b.k(this.c, bArr);
        } catch (RemoteException e) {
            pcu.h(e);
        }
    }
}
