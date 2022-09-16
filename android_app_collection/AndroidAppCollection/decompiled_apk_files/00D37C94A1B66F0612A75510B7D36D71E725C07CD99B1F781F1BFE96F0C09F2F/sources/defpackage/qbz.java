package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: qbz  reason: default package */
/* loaded from: classes4.dex */
public final class qbz {
    private final String a;

    public qbz(qby qbyVar) {
        String str;
        try {
            Parcel pw = qbyVar.pw(1, qbyVar.pv());
            str = pw.readString();
            pw.recycle();
        } catch (RemoteException e) {
            qfl.c(e);
            str = null;
        }
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }
}
