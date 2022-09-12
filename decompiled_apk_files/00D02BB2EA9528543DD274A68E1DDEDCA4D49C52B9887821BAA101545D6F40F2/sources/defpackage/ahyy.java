package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.gmm.locationsharing.interprocess.api.ShareCreationPrerequisitesState;
/* compiled from: PG */
/* renamed from: ahyy  reason: default package */
/* loaded from: classes2.dex */
public final class ahyy extends cla implements IInterface {
    public ahyy(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gmm.locationsharing.interprocess.api.IShareCreationPrerequisitesStateListener");
    }

    public final void e(ShareCreationPrerequisitesState shareCreationPrerequisitesState) {
        Parcel a = a();
        clc.e(a, shareCreationPrerequisitesState);
        Sj(2, a);
    }
}
