package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qol  reason: default package */
/* loaded from: classes4.dex */
public final class qol extends dvc implements qom {
    public qol(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
    }

    @Override // defpackage.qom
    public final Bitmap a(Uri uri) {
        Parcel pv = pv();
        dve.g(pv, uri);
        Parcel pw = pw(1, pv);
        Bitmap bitmap = (Bitmap) dve.a(pw, Bitmap.CREATOR);
        pw.recycle();
        return bitmap;
    }
}
