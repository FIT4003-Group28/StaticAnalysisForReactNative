package com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared;

import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.model.RemoteEmbedExceptionData;
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class b extends dvd implements c {
    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.IEmbedErrorLoggingService");
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a((RemoteEmbedExceptionData) dve.a(parcel, RemoteEmbedExceptionData.CREATOR));
            return true;
        }
        return false;
    }
}
