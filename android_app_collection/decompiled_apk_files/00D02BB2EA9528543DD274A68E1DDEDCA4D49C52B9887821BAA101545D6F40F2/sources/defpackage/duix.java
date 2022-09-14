package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.vr.dynamite.client.ILoadedInstanceCreator;
import com.google.vr.dynamite.client.INativeLibraryLoader;
import com.google.vr.dynamite.client.IObjectWrapper;
/* compiled from: PG */
/* renamed from: duix  reason: default package */
/* loaded from: classes6.dex */
public final class duix extends cla implements ILoadedInstanceCreator {
    public duix(IBinder iBinder) {
        super(iBinder, "com.google.vr.dynamite.client.ILoadedInstanceCreator");
    }

    @Override // com.google.vr.dynamite.client.ILoadedInstanceCreator
    public final INativeLibraryLoader newNativeLibraryLoader(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        INativeLibraryLoader duiyVar;
        Parcel a = a();
        clc.f(a, iObjectWrapper);
        clc.f(a, iObjectWrapper2);
        Parcel Si = Si(1, a);
        IBinder readStrongBinder = Si.readStrongBinder();
        if (readStrongBinder == null) {
            duiyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.dynamite.client.INativeLibraryLoader");
            if (queryLocalInterface instanceof INativeLibraryLoader) {
                duiyVar = (INativeLibraryLoader) queryLocalInterface;
            } else {
                duiyVar = new duiy(readStrongBinder);
            }
        }
        Si.recycle();
        return duiyVar;
    }
}
