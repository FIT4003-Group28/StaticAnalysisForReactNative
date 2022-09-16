package com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared;

import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b extends dvd implements c {
    public final HashMap a;
    private f b;
    private final ajmy c;
    private final com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.b d;

    private b(f fVar, com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.b bVar, ajmy ajmyVar) {
        super("com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.IEmbedImageClientService");
        this.b = fVar;
        this.d = bVar;
        this.c = ajmyVar;
        this.a = new HashMap();
    }

    public static b d(f fVar, com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.b bVar, ajmy ajmyVar) {
        b bVar2 = new b(fVar, bVar, ajmyVar);
        try {
            f fVar2 = bVar2.b;
            if (fVar2 != null) {
                fVar2.f(bVar2);
            }
        } catch (RemoteException unused) {
        }
        return bVar2;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.c
    public final synchronized void a(BitmapKey bitmapKey) {
        com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.e eVar = (com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.e) this.a.get(bitmapKey);
        if (eVar != null) {
            eVar.c();
        }
        this.a.remove(bitmapKey);
    }

    public final synchronized void b(BitmapKey bitmapKey, yiw yiwVar) {
        Optional a = this.d.a(bitmapKey);
        if (!a.isPresent()) {
            return;
        }
        this.c.l((Uri) a.get(), yiwVar);
    }

    public final synchronized void c() {
        ArrayList arrayList = new ArrayList(this.a.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.e) arrayList.get(i)).c();
        }
        this.a.clear();
        this.b = null;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.c
    public final synchronized void f(final BitmapKey bitmapKey) {
        if (this.a.containsKey(bitmapKey)) {
            return;
        }
        com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.e eVar = new com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.e(bitmapKey, new WeakReference(this.b), new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.d
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.b.this;
                bVar.a.remove(bitmapKey);
            }
        });
        this.a.put(bitmapKey, eVar);
        b(bitmapKey, eVar);
    }

    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.IEmbedImageClientService");
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            f((BitmapKey) dve.a(parcel, BitmapKey.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            a((BitmapKey) dve.a(parcel, BitmapKey.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
