package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: coyi  reason: default package */
/* loaded from: classes.dex */
public final class coyi extends cla implements IInterface {
    public coyi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    public final void e(coyh coyhVar, String str, int i, String[] strArr, byte[] bArr) {
        Parcel a = a();
        clc.f(a, coyhVar);
        a.writeString(str);
        a.writeInt(i);
        a.writeStringArray(strArr);
        a.writeByteArray(bArr);
        Sk(1, a);
    }

    public final void f(coyh coyhVar, String str, String str2, String str3) {
        Parcel a = a();
        clc.f(a, coyhVar);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        Sk(11, a);
    }

    public final void g(coyh coyhVar, String str) {
        Parcel a = a();
        clc.f(a, coyhVar);
        a.writeString(str);
        Sk(5, a);
    }

    public final void h(coyh coyhVar, String str, int i, String[] strArr, int[] iArr) {
        Parcel a = a();
        clc.f(a, coyhVar);
        a.writeString(str);
        a.writeInt(i);
        a.writeStringArray(strArr);
        a.writeIntArray(iArr);
        a.writeByteArray(null);
        Sk(2, a);
    }
}
