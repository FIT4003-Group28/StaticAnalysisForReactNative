package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: cmc  reason: default package */
/* loaded from: classes5.dex */
public final class cmc extends cla implements IInterface {
    public cmc(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.sdk.IToastController");
    }

    public final void e(CharSequence charSequence, int i) {
        Parcel a = a();
        if (charSequence != null) {
            a.writeInt(1);
            TextUtils.writeToParcel(charSequence, a, 0);
        } else {
            a.writeInt(0);
        }
        a.writeInt(i);
        Sk(1, a);
    }
}
