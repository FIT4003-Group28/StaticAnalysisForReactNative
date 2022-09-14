package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzwb;
import com.google.android.gms.internal.measurement.zzwf;
import com.google.android.gms.internal.measurement.zzwj;
import com.google.android.gms.tagmanager.zzeh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
@VisibleForTesting
/* loaded from: classes.dex */
public class Container {
    private final String zzavt;
    private final DataLayer zzavu;
    private zzfb zzavv;
    private Map<String, FunctionCallMacroCallback> zzavw;
    private Map<String, FunctionCallTagCallback> zzavx;
    private volatile long zzavy;
    private volatile String zzavz;
    private final Context zzqx;

    /* loaded from: classes.dex */
    public interface FunctionCallMacroCallback {
        Object getValue(String str, Map<String, Object> map);
    }

    /* loaded from: classes.dex */
    public interface FunctionCallTagCallback {
        void execute(String str, Map<String, Object> map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class zza implements zzan {
        private zza() {
        }

        @Override // com.google.android.gms.tagmanager.zzan
        public final Object zza(String str, Map<String, Object> map) {
            FunctionCallMacroCallback zzcm = Container.this.zzcm(str);
            if (zzcm == null) {
                return null;
            }
            return zzcm.getValue(str, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class zzb implements zzan {
        private zzb() {
        }

        @Override // com.google.android.gms.tagmanager.zzan
        public final Object zza(String str, Map<String, Object> map) {
            FunctionCallTagCallback zzcn = Container.this.zzcn(str);
            if (zzcn != null) {
                zzcn.execute(str, map);
            }
            return zzgj.zzpi();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Container(Context context, DataLayer dataLayer, String str, long j, com.google.android.gms.internal.measurement.zzl zzlVar) {
        this.zzavw = new HashMap();
        this.zzavx = new HashMap();
        this.zzavz = "";
        this.zzqx = context;
        this.zzavu = dataLayer;
        this.zzavt = str;
        this.zzavy = j;
        com.google.android.gms.internal.measurement.zzi zziVar = zzlVar.zzpv;
        if (zziVar == null) {
            throw new NullPointerException();
        }
        try {
            zza(zzwb.zza(zziVar));
        } catch (zzwj e) {
            String valueOf = String.valueOf(zziVar);
            String zzwjVar = e.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(zzwjVar).length());
            sb.append("Not loading resource: ");
            sb.append(valueOf);
            sb.append(" because it is invalid: ");
            sb.append(zzwjVar);
            zzdi.e(sb.toString());
        }
        if (zzlVar.zzpu == null) {
            return;
        }
        com.google.android.gms.internal.measurement.zzk[] zzkVarArr = zzlVar.zzpu;
        ArrayList arrayList = new ArrayList();
        for (com.google.android.gms.internal.measurement.zzk zzkVar : zzkVarArr) {
            arrayList.add(zzkVar);
        }
        zzmj().zzf(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Container(Context context, DataLayer dataLayer, String str, long j, zzwf zzwfVar) {
        this.zzavw = new HashMap();
        this.zzavx = new HashMap();
        this.zzavz = "";
        this.zzqx = context;
        this.zzavu = dataLayer;
        this.zzavt = str;
        this.zzavy = 0L;
        zza(zzwfVar);
    }

    private final void zza(zzwf zzwfVar) {
        this.zzavz = zzwfVar.getVersion();
        String str = this.zzavz;
        zzeh.zzof().zzog().equals(zzeh.zza.CONTAINER_DEBUG);
        zza(new zzfb(this.zzqx, zzwfVar, this.zzavu, new zza(), new zzb(), new zzdq()));
        if (getBoolean("_gtm.loadEventEnabled")) {
            this.zzavu.pushEvent("gtm.load", DataLayer.mapOf("gtm.id", this.zzavt));
        }
    }

    private final synchronized void zza(zzfb zzfbVar) {
        this.zzavv = zzfbVar;
    }

    private final synchronized zzfb zzmj() {
        return this.zzavv;
    }

    public boolean getBoolean(String str) {
        String sb;
        zzfb zzmj = zzmj();
        if (zzmj == null) {
            sb = "getBoolean called for closed container.";
        } else {
            try {
                return zzgj.zzg(zzmj.zzdj(str).getObject()).booleanValue();
            } catch (Exception e) {
                String message = e.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 66);
                sb2.append("Calling getBoolean() threw an exception: ");
                sb2.append(message);
                sb2.append(" Returning default value.");
                sb = sb2.toString();
            }
        }
        zzdi.e(sb);
        return zzgj.zzpg().booleanValue();
    }

    public String getContainerId() {
        return this.zzavt;
    }

    public double getDouble(String str) {
        String sb;
        zzfb zzmj = zzmj();
        if (zzmj == null) {
            sb = "getDouble called for closed container.";
        } else {
            try {
                return zzgj.zzf(zzmj.zzdj(str).getObject()).doubleValue();
            } catch (Exception e) {
                String message = e.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 65);
                sb2.append("Calling getDouble() threw an exception: ");
                sb2.append(message);
                sb2.append(" Returning default value.");
                sb = sb2.toString();
            }
        }
        zzdi.e(sb);
        return zzgj.zzpf().doubleValue();
    }

    public long getLastRefreshTime() {
        return this.zzavy;
    }

    public long getLong(String str) {
        String sb;
        zzfb zzmj = zzmj();
        if (zzmj == null) {
            sb = "getLong called for closed container.";
        } else {
            try {
                return zzgj.zze(zzmj.zzdj(str).getObject()).longValue();
            } catch (Exception e) {
                String message = e.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 63);
                sb2.append("Calling getLong() threw an exception: ");
                sb2.append(message);
                sb2.append(" Returning default value.");
                sb = sb2.toString();
            }
        }
        zzdi.e(sb);
        return zzgj.zzpe().longValue();
    }

    public String getString(String str) {
        String sb;
        zzfb zzmj = zzmj();
        if (zzmj == null) {
            sb = "getString called for closed container.";
        } else {
            try {
                return zzgj.zzc(zzmj.zzdj(str).getObject());
            } catch (Exception e) {
                String message = e.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 65);
                sb2.append("Calling getString() threw an exception: ");
                sb2.append(message);
                sb2.append(" Returning default value.");
                sb = sb2.toString();
            }
        }
        zzdi.e(sb);
        return zzgj.zzpi();
    }

    public boolean isDefault() {
        return getLastRefreshTime() == 0;
    }

    public void registerFunctionCallMacroCallback(String str, FunctionCallMacroCallback functionCallMacroCallback) {
        if (functionCallMacroCallback == null) {
            throw new NullPointerException("Macro handler must be non-null");
        }
        synchronized (this.zzavw) {
            this.zzavw.put(str, functionCallMacroCallback);
        }
    }

    public void registerFunctionCallTagCallback(String str, FunctionCallTagCallback functionCallTagCallback) {
        if (functionCallTagCallback == null) {
            throw new NullPointerException("Tag callback must be non-null");
        }
        synchronized (this.zzavx) {
            this.zzavx.put(str, functionCallTagCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void release() {
        this.zzavv = null;
    }

    public void unregisterFunctionCallMacroCallback(String str) {
        synchronized (this.zzavw) {
            this.zzavw.remove(str);
        }
    }

    public void unregisterFunctionCallTagCallback(String str) {
        synchronized (this.zzavx) {
            this.zzavx.remove(str);
        }
    }

    @VisibleForTesting
    final FunctionCallMacroCallback zzcm(String str) {
        FunctionCallMacroCallback functionCallMacroCallback;
        synchronized (this.zzavw) {
            functionCallMacroCallback = this.zzavw.get(str);
        }
        return functionCallMacroCallback;
    }

    @VisibleForTesting
    public final FunctionCallTagCallback zzcn(String str) {
        FunctionCallTagCallback functionCallTagCallback;
        synchronized (this.zzavx) {
            functionCallTagCallback = this.zzavx.get(str);
        }
        return functionCallTagCallback;
    }

    @VisibleForTesting
    public final void zzco(String str) {
        zzmj().zzco(str);
    }

    @VisibleForTesting
    public final String zzmi() {
        return this.zzavz;
    }
}
