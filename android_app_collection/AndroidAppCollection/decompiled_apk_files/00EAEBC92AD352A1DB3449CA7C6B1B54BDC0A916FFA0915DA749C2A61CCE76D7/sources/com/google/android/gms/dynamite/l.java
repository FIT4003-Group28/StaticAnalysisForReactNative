package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import c.e.a.b.c.a;
/* loaded from: classes.dex */
public final class l extends c.e.a.b.d.c.a implements k {
    /* JADX INFO: Access modifiers changed from: package-private */
    public l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    @Override // com.google.android.gms.dynamite.k
    public final c.e.a.b.c.a a(c.e.a.b.c.a aVar, String str, int i, c.e.a.b.c.a aVar2) {
        Parcel f2 = f();
        c.e.a.b.d.c.c.a(f2, aVar);
        f2.writeString(str);
        f2.writeInt(i);
        c.e.a.b.d.c.c.a(f2, aVar2);
        Parcel a2 = a(2, f2);
        c.e.a.b.c.a a3 = a.AbstractBinderC0096a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.dynamite.k
    public final c.e.a.b.c.a b(c.e.a.b.c.a aVar, String str, int i, c.e.a.b.c.a aVar2) {
        Parcel f2 = f();
        c.e.a.b.d.c.c.a(f2, aVar);
        f2.writeString(str);
        f2.writeInt(i);
        c.e.a.b.d.c.c.a(f2, aVar2);
        Parcel a2 = a(3, f2);
        c.e.a.b.c.a a3 = a.AbstractBinderC0096a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
