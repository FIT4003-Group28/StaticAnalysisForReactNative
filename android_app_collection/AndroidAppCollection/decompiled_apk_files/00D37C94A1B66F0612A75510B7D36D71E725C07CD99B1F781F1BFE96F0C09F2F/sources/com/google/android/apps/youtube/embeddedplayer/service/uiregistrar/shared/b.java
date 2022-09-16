package com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared;

import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class b extends dvd implements c {
    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.ISelectableItemRegistryService");
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a((SelectableItemKey) dve.a(parcel, SelectableItemKey.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
