package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
/* compiled from: PG */
/* renamed from: cnug  reason: default package */
/* loaded from: classes.dex */
public final class cnug extends cntz {
    public final IBinder g;
    final /* synthetic */ cnui h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnug(cnui cnuiVar, int i, IBinder iBinder, Bundle bundle) {
        super(cnuiVar, i, bundle);
        this.h = cnuiVar;
        this.g = iBinder;
    }

    @Override // defpackage.cntz
    protected final boolean a() {
        try {
            IBinder iBinder = this.g;
            cnwc.a(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.h.b().equals(interfaceDescriptor)) {
                String b = this.h.b();
                StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(b);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                sb.toString();
                return false;
            }
            IInterface e = this.h.e(this.g);
            if (e == null) {
                return false;
            }
            if (!this.h.F(2, 4, e) && !this.h.F(3, 4, e)) {
                return false;
            }
            cnui cnuiVar = this.h;
            cnuiVar.l = null;
            cnuu cnuuVar = cnuiVar.p;
            if (cnuuVar != null) {
                cnuuVar.a.Ph(null);
            }
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // defpackage.cntz
    protected final void b(ConnectionResult connectionResult) {
        cnuv cnuvVar = this.h.q;
        if (cnuvVar != null) {
            cnuvVar.a(connectionResult);
        }
        this.h.D(connectionResult);
    }
}
