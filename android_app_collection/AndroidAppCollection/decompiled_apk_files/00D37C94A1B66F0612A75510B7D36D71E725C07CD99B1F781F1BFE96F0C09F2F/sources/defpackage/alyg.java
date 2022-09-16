package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: alyg  reason: default package */
/* loaded from: classes.dex */
public final class alyg extends dvc implements alyi {
    public alyg(IBinder iBinder) {
        super(iBinder, "com.google.android.youtube.player.internal.IJarEmbedFragmentClient");
    }

    @Override // defpackage.alyi
    public final String a(String str) {
        Parcel pv = pv();
        pv.writeString(str);
        Parcel pw = pw(8, pv);
        String readString = pw.readString();
        pw.recycle();
        return readString;
    }

    @Override // defpackage.alyi
    public final void f(Bundle bundle) {
        Parcel pv = pv();
        dve.g(pv, bundle);
        px(2, pv);
    }

    @Override // defpackage.alyi
    public final void g() {
        px(3, pv());
    }

    @Override // defpackage.alyi
    public final void h(int i, int i2) {
        Parcel pv = pv();
        pv.writeInt(i);
        pv.writeInt(i2);
        px(9, pv);
    }

    @Override // defpackage.alyi
    public final void i(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(10, pv);
    }

    @Override // defpackage.alyi
    public final void j(int i) {
        Parcel pv = pv();
        pv.writeInt(i);
        px(6, pv);
    }

    @Override // defpackage.alyi
    public final void k(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(7, pv);
    }

    @Override // defpackage.alyi
    public final void l(int i, String str, long j) {
        Parcel pv = pv();
        pv.writeInt(i);
        pv.writeString(str);
        pv.writeLong(j);
        px(4, pv);
    }

    @Override // defpackage.alyi
    public final void m(long j) {
        Parcel pv = pv();
        pv.writeLong(j);
        px(5, pv);
    }
}
