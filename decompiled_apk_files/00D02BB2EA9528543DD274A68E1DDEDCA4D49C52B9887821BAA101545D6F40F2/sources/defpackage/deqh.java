package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: PG */
/* renamed from: deqh  reason: default package */
/* loaded from: classes6.dex */
public abstract class deqh extends clb implements deqi {
    public static deqi asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
        if (queryLocalInterface instanceof deqi) {
            return (deqi) queryLocalInterface;
        }
        return new deqg(iBinder);
    }
}
