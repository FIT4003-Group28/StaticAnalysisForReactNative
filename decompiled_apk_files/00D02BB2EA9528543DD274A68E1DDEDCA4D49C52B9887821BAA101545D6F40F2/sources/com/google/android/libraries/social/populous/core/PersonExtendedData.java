package com.google.android.libraries.social.populous.core;

import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class PersonExtendedData implements Parcelable {
    public static PersonExtendedData c(boolean z, @dzsi DynamiteExtendedData dynamiteExtendedData) {
        return new AutoValue_PersonExtendedData(z, dynamiteExtendedData);
    }

    public abstract boolean a();

    @dzsi
    public abstract DynamiteExtendedData b();
}
