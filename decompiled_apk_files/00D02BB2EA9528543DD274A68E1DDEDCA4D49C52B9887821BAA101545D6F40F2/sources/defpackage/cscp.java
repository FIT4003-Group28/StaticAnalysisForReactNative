package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: cscp  reason: default package */
/* loaded from: classes5.dex */
public final class cscp implements ServiceConnection {
    @dzsi
    public ckyi a;
    final /* synthetic */ cscq b;
    private final ckyl c;

    public cscp(cscq cscqVar, ckyl ckylVar) {
        this.b = cscqVar;
        this.c = ckylVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ckyg ckygVar;
        synchronized (this.b.e) {
            cscq cscqVar = this.b;
            if (iBinder == null) {
                ckygVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
                if (queryLocalInterface instanceof ckyg) {
                    ckygVar = (ckyg) queryLocalInterface;
                } else {
                    ckygVar = new ckyg(iBinder);
                }
            }
            cscqVar.f = ckygVar;
            cscq cscqVar2 = this.b;
            ckyl ckylVar = this.c;
            ckyg ckygVar2 = cscqVar2.f;
            if (ckygVar2 != null && cscqVar2.g == null) {
                try {
                    cscqVar2.g = ckygVar2.e("PUBLIC_SEARCH_GMM_SESSION", ckylVar, clah.a.bS());
                } catch (Exception e) {
                    e.toString();
                }
            }
            ckyi ckyiVar = this.a;
            if (ckyiVar != null) {
                this.b.a(ckyiVar);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.b.e) {
            ckyl ckylVar = this.c;
            if (ckylVar != null) {
                try {
                    clae claeVar = (clae) claf.c.bZ();
                    if (claeVar.c) {
                        claeVar.bF();
                        claeVar.c = false;
                    }
                    claf clafVar = (claf) claeVar.b;
                    clafVar.b = 58;
                    clafVar.a |= 1;
                    ckylVar.b(((claf) claeVar.bK()).bS(), null);
                } catch (RemoteException e) {
                    e.toString();
                }
            }
            cscq cscqVar = this.b;
            cscqVar.g = null;
            cscqVar.f = null;
        }
    }
}
