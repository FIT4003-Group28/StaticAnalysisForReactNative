package defpackage;

import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: deqg  reason: default package */
/* loaded from: classes6.dex */
public final class deqg extends cla implements deqi {
    public deqg(IBinder iBinder) {
        super(iBinder, "com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
    }

    @Override // defpackage.deqi
    public final void e(deqf deqfVar, String str) {
        Parcel a = a();
        clc.f(a, deqfVar);
        a.writeString(str);
        Sk(1, a);
    }
}
