package com.google.android.gms.tagmanager;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tagmanager.ContainerHolder;
/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzv implements ContainerHolder {
    private Status zzacu;
    private final Looper zzawb;
    private Container zzawc;
    private Container zzawd;
    private zzx zzawe;
    private zzw zzawf;
    private boolean zzawg;
    private TagManager zzawh;

    public zzv(Status status) {
        this.zzacu = status;
        this.zzawb = null;
    }

    public zzv(TagManager tagManager, Looper looper, Container container, zzw zzwVar) {
        this.zzawh = tagManager;
        this.zzawb = looper == null ? Looper.getMainLooper() : looper;
        this.zzawc = container;
        this.zzawf = zzwVar;
        this.zzacu = Status.RESULT_SUCCESS;
        tagManager.zza(this);
    }

    private final void zzml() {
        if (this.zzawe != null) {
            zzx zzxVar = this.zzawe;
            zzxVar.sendMessage(zzxVar.obtainMessage(1, this.zzawd.zzmi()));
        }
    }

    @Override // com.google.android.gms.tagmanager.ContainerHolder
    public final synchronized Container getContainer() {
        if (this.zzawg) {
            zzdi.e("ContainerHolder is released.");
            return null;
        }
        if (this.zzawd != null) {
            this.zzawc = this.zzawd;
            this.zzawd = null;
        }
        return this.zzawc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String getContainerId() {
        if (this.zzawg) {
            zzdi.e("getContainerId called on a released ContainerHolder.");
            return "";
        }
        return this.zzawc.getContainerId();
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zzacu;
    }

    @Override // com.google.android.gms.tagmanager.ContainerHolder
    public final synchronized void refresh() {
        if (this.zzawg) {
            zzdi.e("Refreshing a released ContainerHolder.");
        } else {
            this.zzawf.zzmm();
        }
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final synchronized void release() {
        if (this.zzawg) {
            zzdi.e("Releasing a released ContainerHolder.");
            return;
        }
        this.zzawg = true;
        this.zzawh.zzb(this);
        this.zzawc.release();
        this.zzawc = null;
        this.zzawd = null;
        this.zzawf = null;
        this.zzawe = null;
    }

    @Override // com.google.android.gms.tagmanager.ContainerHolder
    public final synchronized void setContainerAvailableListener(ContainerHolder.ContainerAvailableListener containerAvailableListener) {
        if (this.zzawg) {
            zzdi.e("ContainerHolder is released.");
        } else if (containerAvailableListener == null) {
            this.zzawe = null;
        } else {
            this.zzawe = new zzx(this, containerAvailableListener, this.zzawb);
            if (this.zzawd != null) {
                zzml();
            }
        }
    }

    public final synchronized void zza(Container container) {
        if (this.zzawg) {
            return;
        }
        this.zzawd = container;
        zzml();
    }

    public final synchronized void zzco(String str) {
        if (this.zzawg) {
            return;
        }
        this.zzawc.zzco(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzcp(String str) {
        if (this.zzawg) {
            zzdi.e("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
        } else {
            this.zzawf.zzcp(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzmk() {
        if (this.zzawg) {
            zzdi.e("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return "";
        }
        return this.zzawf.zzmk();
    }
}
