package defpackage;

import android.os.Parcel;
/* compiled from: PG */
/* renamed from: dezb  reason: default package */
/* loaded from: classes6.dex */
final class dezb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dyjb b(int i, Parcel parcel) {
        dyjb a = dyjb.a((i >> 16) & 255);
        return (i & 32) != 0 ? a.g(parcel.readString()) : a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(0);
        parcel.writeInt(i);
        parcel.setDataPosition(dataPosition);
    }
}
