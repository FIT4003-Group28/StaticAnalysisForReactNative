package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ alyf b;
    private final /* synthetic */ int c;

    public /* synthetic */ d(alyf alyfVar, boolean z) {
        this.b = alyfVar;
        this.a = z;
    }

    public /* synthetic */ d(alyf alyfVar, boolean z, int i) {
        this.c = i;
        this.b = alyfVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            alyf alyfVar = this.b;
            boolean z = this.a;
            alyk alykVar = alyfVar.P;
            if (alykVar == null || !alyfVar.au()) {
                return;
            }
            try {
                Parcel pv = alykVar.pv();
                dve.e(pv, z);
                alykVar.px(4, pv);
                return;
            } catch (RemoteException e) {
                throw new alyv(e);
            }
        }
        alyf alyfVar2 = this.b;
        boolean z2 = this.a;
        alyj alyjVar = alyfVar2.Q;
        if (alyjVar == null || !alyfVar2.au()) {
            return;
        }
        try {
            Parcel pv2 = alyjVar.pv();
            dve.e(pv2, z2);
            alyjVar.px(1, pv2);
        } catch (RemoteException e2) {
            throw new alyv(e2);
        }
    }
}
