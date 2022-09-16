package defpackage;

import android.os.Bundle;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: alyh  reason: default package */
/* loaded from: classes.dex */
public final class alyh extends dvd implements alyi {
    public alyh() {
        super("com.google.android.youtube.player.internal.IJarEmbedFragmentClient");
    }

    @Override // defpackage.alyi
    public final String a(String str) {
        aqvb.k("Cannot get embed config, client disconnected.", new Object[0]);
        return "";
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                f((Bundle) dve.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
                g();
                parcel2.writeNoException();
                return true;
            case 4:
                l(parcel.readInt(), parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5:
                m(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 6:
                j(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 7:
                k(dve.j(parcel));
                parcel2.writeNoException();
                return true;
            case 8:
                String a = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 9:
                h(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 10:
                i(dve.j(parcel));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.alyi
    public final void f(Bundle bundle) {
        aqvb.k("Cannot set fullscreen, client disconnected.", new Object[0]);
    }

    @Override // defpackage.alyi
    public final void g() {
        aqvb.k("Cannot dismiss fullscreen, client disconnected.", new Object[0]);
    }

    @Override // defpackage.alyi
    public final void h(int i, int i2) {
        aqvb.k("Cannot send ad event, client disconnected.", new Object[0]);
    }

    @Override // defpackage.alyi
    public final void i(boolean z) {
        aqvb.k("Cannot handle ad authorization, client disconnected.", new Object[0]);
    }

    @Override // defpackage.alyi
    public final void j(int i) {
        aqvb.k("Cannot send error, client disconnected.", new Object[0]);
    }

    @Override // defpackage.alyi
    public final void k(boolean z) {
        aqvb.k("Cannot send fullscreen event, client disconnected.", new Object[0]);
    }

    @Override // defpackage.alyi
    public final void l(int i, String str, long j) {
        aqvb.k("Cannot send playback event, client disconnected.", new Object[0]);
    }

    @Override // defpackage.alyi
    public final void m(long j) {
        aqvb.k("Cannot update duration, client disconnected.", new Object[0]);
    }
}
