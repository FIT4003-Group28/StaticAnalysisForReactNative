package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
@VisibleForTesting
/* loaded from: classes.dex */
public class TagManager {
    private static TagManager zzbcu;
    private final DataLayer zzavu;
    private final zzal zzbav;
    private final zza zzbcr;
    private final zzfm zzbcs;
    private final ConcurrentMap<String, zzv> zzbct;
    private final Context zzqx;

    @VisibleForTesting
    /* loaded from: classes.dex */
    public interface zza {
        zzy zza(Context context, TagManager tagManager, Looper looper, String str, int i, zzal zzalVar);
    }

    @VisibleForTesting
    private TagManager(Context context, zza zzaVar, DataLayer dataLayer, zzfm zzfmVar) {
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.zzqx = context.getApplicationContext();
        this.zzbcs = zzfmVar;
        this.zzbcr = zzaVar;
        this.zzbct = new ConcurrentHashMap();
        this.zzavu = dataLayer;
        this.zzavu.zza(new zzga(this));
        this.zzavu.zza(new zzg(this.zzqx));
        this.zzbav = new zzal();
        this.zzqx.registerComponentCallbacks(new zzgc(this));
        com.google.android.gms.tagmanager.zza.zzh(this.zzqx);
    }

    public static TagManager getInstance(Context context) {
        TagManager tagManager;
        synchronized (TagManager.class) {
            if (zzbcu == null) {
                if (context == null) {
                    zzdi.e("TagManager.getInstance requires non-null context.");
                    throw new NullPointerException();
                }
                zzbcu = new TagManager(context, new zzgb(), new DataLayer(new zzat(context)), zzfn.zzox());
            }
            tagManager = zzbcu;
        }
        return tagManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzdl(String str) {
        for (zzv zzvVar : this.zzbct.values()) {
            zzvVar.zzco(str);
        }
    }

    public void dispatch() {
        this.zzbcs.dispatch();
    }

    public DataLayer getDataLayer() {
        return this.zzavu;
    }

    public PendingResult<ContainerHolder> loadContainerDefaultOnly(String str, int i) {
        zzy zza2 = this.zzbcr.zza(this.zzqx, this, null, str, i, this.zzbav);
        zza2.zzmn();
        return zza2;
    }

    public PendingResult<ContainerHolder> loadContainerDefaultOnly(String str, int i, Handler handler) {
        zzy zza2 = this.zzbcr.zza(this.zzqx, this, handler.getLooper(), str, i, this.zzbav);
        zza2.zzmn();
        return zza2;
    }

    public PendingResult<ContainerHolder> loadContainerPreferFresh(String str, int i) {
        zzy zza2 = this.zzbcr.zza(this.zzqx, this, null, str, i, this.zzbav);
        zza2.zzmp();
        return zza2;
    }

    public PendingResult<ContainerHolder> loadContainerPreferFresh(String str, int i, Handler handler) {
        zzy zza2 = this.zzbcr.zza(this.zzqx, this, handler.getLooper(), str, i, this.zzbav);
        zza2.zzmp();
        return zza2;
    }

    public PendingResult<ContainerHolder> loadContainerPreferNonDefault(String str, int i) {
        zzy zza2 = this.zzbcr.zza(this.zzqx, this, null, str, i, this.zzbav);
        zza2.zzmo();
        return zza2;
    }

    public PendingResult<ContainerHolder> loadContainerPreferNonDefault(String str, int i, Handler handler) {
        zzy zza2 = this.zzbcr.zza(this.zzqx, this, handler.getLooper(), str, i, this.zzbav);
        zza2.zzmo();
        return zza2;
    }

    public void setVerboseLoggingEnabled(boolean z) {
        zzdi.setLogLevel(z ? 2 : 5);
    }

    @VisibleForTesting
    public final int zza(zzv zzvVar) {
        this.zzbct.put(zzvVar.getContainerId(), zzvVar);
        return this.zzbct.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean zzb(Uri uri) {
        boolean z;
        zzeh zzof = zzeh.zzof();
        if (zzof.zzb(uri)) {
            String containerId = zzof.getContainerId();
            switch (zzgd.zzbcw[zzof.zzog().ordinal()]) {
                case 1:
                    zzv zzvVar = this.zzbct.get(containerId);
                    if (zzvVar != null) {
                        zzvVar.zzcp(null);
                        zzvVar.refresh();
                        break;
                    }
                    break;
                case 2:
                case 3:
                    for (String str : this.zzbct.keySet()) {
                        zzv zzvVar2 = this.zzbct.get(str);
                        if (str.equals(containerId)) {
                            zzvVar2.zzcp(zzof.zzoh());
                        } else if (zzvVar2.zzmk() != null) {
                            zzvVar2.zzcp(null);
                        }
                        zzvVar2.refresh();
                    }
                    break;
            }
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    @VisibleForTesting
    public final boolean zzb(zzv zzvVar) {
        return this.zzbct.remove(zzvVar.getContainerId()) != null;
    }
}
