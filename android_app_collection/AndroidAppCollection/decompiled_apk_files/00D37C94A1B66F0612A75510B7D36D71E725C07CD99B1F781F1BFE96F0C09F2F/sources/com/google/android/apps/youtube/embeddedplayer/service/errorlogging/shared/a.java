package com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.model.RemoteEmbedExceptionData;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends dvc implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.IEmbedErrorLoggingService");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.c
    public final void a(RemoteEmbedExceptionData remoteEmbedExceptionData) {
        Parcel pv = pv();
        dve.g(pv, remoteEmbedExceptionData);
        py(1, pv);
    }
}
