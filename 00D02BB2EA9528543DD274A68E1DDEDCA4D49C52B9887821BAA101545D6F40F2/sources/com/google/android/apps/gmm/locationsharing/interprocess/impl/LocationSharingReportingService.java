package com.google.android.apps.gmm.locationsharing.interprocess.impl;

import android.content.Intent;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class LocationSharingReportingService extends affo {
    public dxio<aiar> a;
    public ckcw b;
    public bvrv c;
    public btvo d;

    @Override // android.app.Service
    @dzsi
    public final IBinder onBind(Intent intent) {
        dkof dkofVar = this.d.getLocationSharingParameters().q;
        if (dkofVar == null) {
            dkofVar = dkof.s;
        }
        if (dkofVar.r || !this.d.getLocationSharingParameters().b || !this.d.getLocationSharingParameters().c) {
            return null;
        }
        return this.a.a();
    }

    @Override // android.app.Service
    public final void onCreate() {
        bvrj.UI_THREAD.c();
        dxiq.b(this);
        this.b.f(ckhc.LOCATION_SHARING_REPORTER_SERVICE);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.b.g(ckhc.LOCATION_SHARING_REPORTER_SERVICE);
        this.c.a();
    }

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String valueOf = String.valueOf(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(valueOf.length() != 0 ? "LocationSharingReportingService #".concat(valueOf) : new String("LocationSharingReportingService #"));
    }
}
