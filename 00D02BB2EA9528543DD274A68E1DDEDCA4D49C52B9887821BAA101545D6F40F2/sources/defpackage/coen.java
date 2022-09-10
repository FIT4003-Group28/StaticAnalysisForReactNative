package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;
/* compiled from: PG */
/* renamed from: coen  reason: default package */
/* loaded from: classes5.dex */
public final class coen extends cla implements IInterface {
    public coen(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
    }

    public final void e(Bundle bundle, long j, GoogleHelp googleHelp, coem coemVar) {
        Parcel a = a();
        clc.e(a, bundle);
        a.writeLong(j);
        clc.e(a, googleHelp);
        clc.f(a, coemVar);
        Sj(8, a);
    }

    public final void f(GoogleHelp googleHelp, coem coemVar) {
        Parcel a = a();
        clc.e(a, googleHelp);
        clc.e(a, null);
        clc.f(a, coemVar);
        Sk(2, a);
    }
}
