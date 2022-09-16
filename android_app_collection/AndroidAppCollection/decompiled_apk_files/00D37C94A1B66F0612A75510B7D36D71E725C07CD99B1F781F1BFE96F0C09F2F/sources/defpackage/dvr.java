package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: dvr  reason: default package */
/* loaded from: classes3.dex */
public final class dvr extends dvc implements IInterface {
    public dvr(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSession");
    }

    public final void a(byte[] bArr) {
        Parcel pv = pv();
        pv.writeByteArray(bArr);
        py(1, pv);
    }
}
