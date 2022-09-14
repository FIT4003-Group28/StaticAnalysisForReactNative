package com.google.android.libraries.social.populous.core;

import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class AutocompletionCallbackMetadata implements Parcelable {
    public static cydr e() {
        cybv cybvVar = new cybv();
        cybvVar.a = 1;
        cybvVar.b = 1;
        cybvVar.b(cyds.DID_NOT_WAIT_FOR_RESULTS);
        return cybvVar;
    }

    public abstract cyds a();

    public abstract cydr b();

    public abstract int c();

    public abstract int d();
}
