package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.framework.media.NotificationAction;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: qmz  reason: default package */
/* loaded from: classes4.dex */
public final class qmz extends dvc implements qna {
    public qmz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider");
    }

    @Override // defpackage.qna
    public final List a() {
        Parcel pw = pw(3, pv());
        ArrayList createTypedArrayList = pw.createTypedArrayList(NotificationAction.CREATOR);
        pw.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.qna
    public final int[] f() {
        Parcel pw = pw(4, pv());
        int[] createIntArray = pw.createIntArray();
        pw.recycle();
        return createIntArray;
    }
}
