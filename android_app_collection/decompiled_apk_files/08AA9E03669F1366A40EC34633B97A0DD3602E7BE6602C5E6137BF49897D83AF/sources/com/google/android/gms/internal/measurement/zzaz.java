package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzaz implements ServiceConnection {
    final /* synthetic */ zzax zzwp;
    private volatile zzci zzwq;
    private volatile boolean zzwr;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzaz(zzax zzaxVar) {
        this.zzwp = zzaxVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzaz zzazVar;
        Preconditions.checkMainThread("AnalyticsServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.zzwp.zzt("Service connected with null binder");
                notifyAll();
                return;
            }
            zzci zzciVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(interfaceDescriptor)) {
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                        zzciVar = queryLocalInterface instanceof zzci ? (zzci) queryLocalInterface : new zzcj(iBinder);
                    }
                    this.zzwp.zzp("Bound to IAnalyticsService interface");
                } else {
                    this.zzwp.zze("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.zzwp.zzt("Service connect failed to get IAnalyticsService");
            }
            if (zzciVar == null) {
                try {
                    ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                    Context context = this.zzwp.getContext();
                    zzazVar = this.zzwp.zzwl;
                    connectionTracker.unbindService(context, zzazVar);
                } catch (IllegalArgumentException unused2) {
                }
            } else if (!this.zzwr) {
                this.zzwp.zzs("onServiceConnected received after the timeout limit");
                this.zzwp.zzbw().zza(new zzba(this, zzciVar));
            } else {
                this.zzwq = zzciVar;
            }
            notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("AnalyticsServiceConnection.onServiceDisconnected");
        this.zzwp.zzbw().zza(new zzbb(this, componentName));
    }

    public final zzci zzcw() {
        zzaz zzazVar;
        com.google.android.gms.analytics.zzk.zzab();
        Intent intent = new Intent("com.google.android.gms.analytics.service.START");
        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        Context context = this.zzwp.getContext();
        intent.putExtra(Constants.KEY_APP_PACKAGE_NAME, context.getPackageName());
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            this.zzwq = null;
            this.zzwr = true;
            zzazVar = this.zzwp.zzwl;
            boolean bindService = connectionTracker.bindService(context, intent, zzazVar, GmsClientSupervisor.DEFAULT_BIND_FLAGS);
            this.zzwp.zza("Bind to service requested", Boolean.valueOf(bindService));
            if (!bindService) {
                this.zzwr = false;
                return null;
            }
            try {
                wait(zzcc.zzzv.get().longValue());
            } catch (InterruptedException unused) {
                this.zzwp.zzs("Wait for service connect was interrupted");
            }
            this.zzwr = false;
            zzci zzciVar = this.zzwq;
            this.zzwq = null;
            if (zzciVar == null) {
                this.zzwp.zzt("Successfully bound to service but never got onServiceConnected callback");
            }
            return zzciVar;
        }
    }
}
