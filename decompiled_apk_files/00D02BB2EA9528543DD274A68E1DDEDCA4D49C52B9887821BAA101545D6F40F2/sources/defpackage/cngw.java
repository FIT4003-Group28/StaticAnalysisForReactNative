package defpackage;

import android.os.RemoteException;
import android.view.Surface;
/* compiled from: PG */
/* renamed from: cngw  reason: default package */
/* loaded from: classes5.dex */
public final class cngw {
    final /* synthetic */ cnht a;

    public cngw(cnht cnhtVar) {
        this.a = cnhtVar;
    }

    public final void a(Surface surface) {
        cmxz cmxzVar = this.a.J;
        if (cmxzVar != null) {
            try {
                cmxzVar.u(surface);
            } catch (RemoteException unused) {
                int i = cnjc.a;
            }
        }
    }
}
