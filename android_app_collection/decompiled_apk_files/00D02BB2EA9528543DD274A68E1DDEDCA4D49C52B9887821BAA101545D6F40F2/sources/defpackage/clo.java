package defpackage;

import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: clo  reason: default package */
/* loaded from: classes5.dex */
public final class clo {
    public final cmj a;
    private final cls b;

    public clo(cls clsVar, cmj cmjVar) {
        this.b = clsVar;
        this.a = cmjVar;
        try {
            clsVar.e(new cln(this));
        } catch (RemoteException unused) {
        }
    }
}
