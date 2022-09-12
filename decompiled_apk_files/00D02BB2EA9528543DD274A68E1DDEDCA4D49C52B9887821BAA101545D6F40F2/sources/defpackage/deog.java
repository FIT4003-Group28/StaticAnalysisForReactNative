package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: PG */
/* renamed from: deog  reason: default package */
/* loaded from: classes6.dex */
public abstract class deog extends clb implements deoh {
    public static deoh asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
        if (queryLocalInterface instanceof deoh) {
            return (deoh) queryLocalInterface;
        }
        return new deof(iBinder);
    }
}
