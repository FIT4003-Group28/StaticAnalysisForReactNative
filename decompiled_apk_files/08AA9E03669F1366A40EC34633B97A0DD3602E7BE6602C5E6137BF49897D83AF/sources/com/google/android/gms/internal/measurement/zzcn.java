package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzcn extends BroadcastReceiver {
    @VisibleForTesting
    private static final String zzaaw = "com.google.android.gms.internal.measurement.zzcn";
    private boolean zzaax;
    private boolean zzaay;
    private final zzat zzvn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcn(zzat zzatVar) {
        Preconditions.checkNotNull(zzatVar);
        this.zzvn = zzatVar;
    }

    private final void zzev() {
        this.zzvn.zzbu();
        this.zzvn.zzby();
    }

    @VisibleForTesting
    private final boolean zzex() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.zzvn.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
        } catch (SecurityException unused) {
        }
        return false;
    }

    public final boolean isConnected() {
        if (!this.zzaax) {
            this.zzvn.zzbu().zzs("Connectivity unknown. Receiver not registered");
        }
        return this.zzaay;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        zzev();
        String action = intent.getAction();
        this.zzvn.zzbu().zza("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean zzex = zzex();
            if (this.zzaay == zzex) {
                return;
            }
            this.zzaay = zzex;
            zzai zzby = this.zzvn.zzby();
            zzby.zza("Network connectivity status changed", Boolean.valueOf(zzex));
            zzby.zzbw().zza(new zzak(zzby, zzex));
        } else if (!"com.google.analytics.RADIO_POWERED".equals(action)) {
            this.zzvn.zzbu().zzd("NetworkBroadcastReceiver received unknown action", action);
        } else if (intent.hasExtra(zzaaw)) {
        } else {
            zzai zzby2 = this.zzvn.zzby();
            zzby2.zzp("Radio powered up");
            zzby2.zzbo();
        }
    }

    public final void unregister() {
        if (!this.zzaax) {
            return;
        }
        this.zzvn.zzbu().zzp("Unregistering connectivity change receiver");
        this.zzaax = false;
        this.zzaay = false;
        try {
            this.zzvn.getContext().unregisterReceiver(this);
        } catch (IllegalArgumentException e) {
            this.zzvn.zzbu().zze("Failed to unregister the network broadcast receiver", e);
        }
    }

    public final void zzeu() {
        zzev();
        if (this.zzaax) {
            return;
        }
        Context context = this.zzvn.getContext();
        context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
        intentFilter.addCategory(context.getPackageName());
        context.registerReceiver(this, intentFilter);
        this.zzaay = zzex();
        this.zzvn.zzbu().zza("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzaay));
        this.zzaax = true;
    }

    @VisibleForTesting
    public final void zzew() {
        Context context = this.zzvn.getContext();
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(context.getPackageName());
        intent.putExtra(zzaaw, true);
        context.sendOrderedBroadcast(intent, null);
    }
}
