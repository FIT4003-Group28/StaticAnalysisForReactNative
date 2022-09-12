package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import com.google.android.gms.droidguard.internal.DroidGuardInitReply;
import java.util.Map;
/* compiled from: PG */
/* renamed from: coag  reason: default package */
/* loaded from: classes5.dex */
public final class coag extends cla implements IInterface {
    public coag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.droidguard.internal.IDroidGuardHandle");
    }

    public final byte[] e(Map map) {
        Parcel a = a();
        a.writeMap(map);
        Parcel Si = Si(2, a);
        byte[] createByteArray = Si.createByteArray();
        Si.recycle();
        return createByteArray;
    }

    public final void f() {
        Sj(3, a());
    }

    public final void g() {
        Parcel a = a();
        a.writeString("tachyon_registration");
        Sj(1, a);
    }

    public final DroidGuardInitReply h(DroidGuardResultsRequest droidGuardResultsRequest) {
        Parcel a = a();
        a.writeString("tachyon_registration");
        clc.e(a, droidGuardResultsRequest);
        Parcel Si = Si(5, a);
        DroidGuardInitReply droidGuardInitReply = (DroidGuardInitReply) clc.d(Si, DroidGuardInitReply.CREATOR);
        Si.recycle();
        return droidGuardInitReply;
    }
}
