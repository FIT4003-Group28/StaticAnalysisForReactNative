package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
/* compiled from: PG */
/* renamed from: rgn  reason: default package */
/* loaded from: classes4.dex */
public final class rgn extends dvc implements IInterface {
    public rgn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void a(LocationRequestUpdateData locationRequestUpdateData) {
        Parcel pv = pv();
        dve.g(pv, locationRequestUpdateData);
        px(59, pv);
    }
}
