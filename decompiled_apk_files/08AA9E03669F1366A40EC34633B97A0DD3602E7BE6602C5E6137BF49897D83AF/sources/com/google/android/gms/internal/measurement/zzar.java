package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public abstract class zzar extends zzaq {
    private boolean zzvo;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzar(zzat zzatVar) {
        super(zzatVar);
    }

    public final boolean isInitialized() {
        return this.zzvo;
    }

    protected abstract void zzac();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzch() {
        if (!isInitialized()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzm() {
        zzac();
        this.zzvo = true;
    }
}
