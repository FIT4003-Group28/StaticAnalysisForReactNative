package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.learning.InAppTrainerOptions;
/* compiled from: PG */
/* renamed from: coif  reason: default package */
/* loaded from: classes5.dex */
public final class coif extends cla implements IInterface {
    public coif(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.training.IInAppTrainer");
    }

    public final boolean e(coba cobaVar, coba cobaVar2, InAppTrainerOptions inAppTrainerOptions, cnrt cnrtVar) {
        Parcel a = a();
        clc.f(a, cobaVar);
        clc.f(a, cobaVar2);
        clc.e(a, inAppTrainerOptions);
        clc.f(a, cnrtVar);
        Parcel Si = Si(6, a);
        boolean a2 = clc.a(Si);
        Si.recycle();
        return a2;
    }

    public final boolean f(coba cobaVar, coba cobaVar2, InAppTrainerOptions inAppTrainerOptions, cnrt cnrtVar) {
        Parcel a = a();
        clc.f(a, cobaVar);
        clc.f(a, cobaVar2);
        clc.e(a, inAppTrainerOptions);
        clc.f(a, cnrtVar);
        Parcel Si = Si(7, a);
        boolean a2 = clc.a(Si);
        Si.recycle();
        return a2;
    }

    public final boolean g(coba cobaVar, coba cobaVar2, InAppTrainerOptions inAppTrainerOptions, cnrt cnrtVar) {
        Parcel a = a();
        clc.f(a, cobaVar);
        clc.f(a, cobaVar2);
        clc.e(a, inAppTrainerOptions);
        clc.f(a, cnrtVar);
        Parcel Si = Si(8, a);
        boolean a2 = clc.a(Si);
        Si.recycle();
        return a2;
    }

    public final boolean h(coba cobaVar, coba cobaVar2, InAppTrainerOptions inAppTrainerOptions, cnrt cnrtVar) {
        Parcel a = a();
        clc.f(a, cobaVar);
        clc.f(a, cobaVar2);
        clc.e(a, inAppTrainerOptions);
        clc.f(a, cnrtVar);
        Parcel Si = Si(9, a);
        boolean a2 = clc.a(Si);
        Si.recycle();
        return a2;
    }

    public final boolean i(coba cobaVar, coba cobaVar2, InAppTrainerOptions inAppTrainerOptions, cnrt cnrtVar) {
        Parcel a = a();
        clc.f(a, cobaVar);
        clc.f(a, cobaVar2);
        clc.e(a, inAppTrainerOptions);
        clc.f(a, cnrtVar);
        Parcel Si = Si(10, a);
        boolean a2 = clc.a(Si);
        Si.recycle();
        return a2;
    }

    public final void j(cnrt cnrtVar) {
        Parcel a = a();
        a.writeInt(0);
        clc.f(a, cnrtVar);
        Sk(3, a);
    }
}
