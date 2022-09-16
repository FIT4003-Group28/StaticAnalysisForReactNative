package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
/* loaded from: classes.dex */
public final class zzbb implements zzbx {
    private static final Object zzavh = new Object();
    private static zzbb zzaxy;
    private zzej zzawl;
    private zzby zzaxz;

    private zzbb(Context context) {
        this(zzbz.zzo(context), new zzfl());
    }

    @VisibleForTesting
    private zzbb(zzby zzbyVar, zzej zzejVar) {
        this.zzaxz = zzbyVar;
        this.zzawl = zzejVar;
    }

    public static zzbx zzi(Context context) {
        zzbb zzbbVar;
        synchronized (zzavh) {
            if (zzaxy == null) {
                zzaxy = new zzbb(context);
            }
            zzbbVar = zzaxy;
        }
        return zzbbVar;
    }

    @Override // com.google.android.gms.tagmanager.zzbx
    public final boolean zzcy(String str) {
        if (!this.zzawl.zzes()) {
            zzdi.zzaa("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
            return false;
        }
        this.zzaxz.zzdd(str);
        return true;
    }
}
