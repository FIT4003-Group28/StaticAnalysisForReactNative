package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: clp  reason: default package */
/* loaded from: classes5.dex */
public final class clp extends cla implements IInterface {
    public clp(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.sdk.ICapabilityController");
    }

    public final List<String> e() {
        Parcel Si = Si(1, a());
        ArrayList<String> createStringArrayList = Si.createStringArrayList();
        Si.recycle();
        return createStringArrayList;
    }
}
