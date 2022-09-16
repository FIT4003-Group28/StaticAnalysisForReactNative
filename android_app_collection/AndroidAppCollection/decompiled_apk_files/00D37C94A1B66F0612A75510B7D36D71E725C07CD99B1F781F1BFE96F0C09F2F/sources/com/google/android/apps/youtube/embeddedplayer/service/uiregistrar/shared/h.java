package com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared;

import android.os.Handler;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.h;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class h extends dvd implements i {
    public final rvx a;
    private final Handler b;

    public h(Handler handler, rvx rvxVar, byte[] bArr) {
        super("com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.IUiElementRegistrarService");
        this.b = handler;
        this.a = rvxVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.i
    public final void a(final int i) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.b
            @Override // java.lang.Runnable
            public final void run() {
                h hVar = h.this;
                hVar.a.c(i);
            }
        });
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
        return false;
    }

    public h() {
        super("com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.IUiElementRegistrarService");
    }
}
