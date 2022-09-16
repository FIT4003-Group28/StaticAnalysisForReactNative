package com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b extends dvc implements d {
    public b(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.IEmbedInteractionLoggingService");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final int a(int i) {
        Parcel pv = pv();
        pv.writeInt(i);
        Parcel pw = pw(1, pv);
        int readInt = pw.readInt();
        pw.recycle();
        return readInt;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void b(int i) {
        Parcel pv = pv();
        pv.writeInt(i);
        px(7, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void c(byte[] bArr) {
        Parcel pv = pv();
        pv.writeByteArray(bArr);
        px(8, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void d(int i, int i2) {
        throw null;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void e(int i, byte[] bArr) {
        Parcel pv = pv();
        pv.writeInt(i);
        pv.writeByteArray(bArr);
        px(12, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void f(int i, SimplePlaybackDescriptor simplePlaybackDescriptor, boolean z) {
        Parcel pv = pv();
        pv.writeInt(i);
        dve.g(pv, simplePlaybackDescriptor);
        dve.e(pv, true);
        px(4, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void g(int i) {
        Parcel pv = pv();
        pv.writeInt(i);
        px(3, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void h(int i) {
        Parcel pv = pv();
        pv.writeInt(i);
        px(5, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void i(byte[] bArr) {
        Parcel pv = pv();
        pv.writeByteArray(bArr);
        px(6, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void j(int i, int i2) {
        Parcel pv = pv();
        pv.writeInt(i);
        pv.writeInt(i2);
        px(9, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void k(int i, byte[] bArr) {
        Parcel pv = pv();
        pv.writeInt(i);
        pv.writeByteArray(bArr);
        px(10, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void l(int i) {
        Parcel pv = pv();
        pv.writeInt(i);
        px(2, pv);
    }
}
