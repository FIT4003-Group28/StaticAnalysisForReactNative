package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import c.e.a.b.c.a;
/* loaded from: classes.dex */
public final class j extends c.e.a.b.d.c.a implements i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    @Override // com.google.android.gms.dynamite.i
    public final int a(c.e.a.b.c.a aVar, String str, boolean z) {
        Parcel f2 = f();
        c.e.a.b.d.c.c.a(f2, aVar);
        f2.writeString(str);
        c.e.a.b.d.c.c.a(f2, z);
        Parcel a2 = a(5, f2);
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.i
    public final c.e.a.b.c.a a(c.e.a.b.c.a aVar, String str, int i) {
        Parcel f2 = f();
        c.e.a.b.d.c.c.a(f2, aVar);
        f2.writeString(str);
        f2.writeInt(i);
        Parcel a2 = a(4, f2);
        c.e.a.b.c.a a3 = a.AbstractBinderC0096a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.dynamite.i
    public final int b(c.e.a.b.c.a aVar, String str, boolean z) {
        Parcel f2 = f();
        c.e.a.b.d.c.c.a(f2, aVar);
        f2.writeString(str);
        c.e.a.b.d.c.c.a(f2, z);
        Parcel a2 = a(3, f2);
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.i
    public final c.e.a.b.c.a b(c.e.a.b.c.a aVar, String str, int i) {
        Parcel f2 = f();
        c.e.a.b.d.c.c.a(f2, aVar);
        f2.writeString(str);
        f2.writeInt(i);
        Parcel a2 = a(2, f2);
        c.e.a.b.c.a a3 = a.AbstractBinderC0096a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.dynamite.i
    public final int d() {
        Parcel a2 = a(6, f());
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }
}
