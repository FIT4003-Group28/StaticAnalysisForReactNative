package defpackage;

import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: cngm  reason: default package */
/* loaded from: classes5.dex */
final class cngm implements cnfo {
    cnfp a;

    public cngm(cnfp cnfpVar) {
        this.a = cnfpVar;
    }

    @Override // defpackage.cnfo
    public final void a(int i, int i2, int i3, int i4) {
        cnfp cnfpVar = this.a;
        if (cnfpVar != null) {
            try {
                cnfpVar.e(i, i2, i3, i4);
            } catch (RemoteException unused) {
                this.a = null;
            }
        }
    }
}
