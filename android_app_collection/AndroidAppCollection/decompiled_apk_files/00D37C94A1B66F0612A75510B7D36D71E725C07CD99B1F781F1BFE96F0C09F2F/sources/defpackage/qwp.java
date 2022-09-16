package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
/* compiled from: PG */
/* renamed from: qwp  reason: default package */
/* loaded from: classes4.dex */
public final class qwp extends qwh {
    public final IBinder g;
    final /* synthetic */ qwr h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwp(qwr qwrVar, int i, IBinder iBinder, Bundle bundle) {
        super(qwrVar, i, bundle);
        this.h = qwrVar;
        this.g = iBinder;
    }

    @Override // defpackage.qwh
    protected final void a(ConnectionResult connectionResult) {
        qwj qwjVar = this.h.z;
        if (qwjVar != null) {
            qwjVar.c(connectionResult);
        }
        this.h.q();
    }

    @Override // defpackage.qwh
    protected final boolean c() {
        try {
            IBinder iBinder = this.g;
            qnm.b(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.h.c().equals(interfaceDescriptor)) {
                String c = this.h.c();
                StringBuilder sb = new StringBuilder(c.length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(c);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface b = this.h.b(this.g);
            if (b == null || (!this.h.J(2, 4, b) && !this.h.J(3, 4, b))) {
                return false;
            }
            qwr qwrVar = this.h;
            qwrVar.C = null;
            qwrVar.r();
            qwi qwiVar = this.h.y;
            if (qwiVar == null) {
                return true;
            }
            qwiVar.b();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
