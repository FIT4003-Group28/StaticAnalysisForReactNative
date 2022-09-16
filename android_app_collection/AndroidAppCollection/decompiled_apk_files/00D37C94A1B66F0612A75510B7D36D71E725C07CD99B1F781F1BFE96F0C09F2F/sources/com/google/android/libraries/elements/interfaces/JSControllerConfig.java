package com.google.android.libraries.elements.interfaces;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class JSControllerConfig {
    public static final int DEFAULT_VM_CONTEXT_LRU_SIZE = 5;
    final boolean enableVmContextLru;
    final JSControllerInitializationMode initializationMode;
    final int vmContextLruSize;

    public JSControllerConfig(JSControllerInitializationMode jSControllerInitializationMode, boolean z, int i) {
        this.initializationMode = jSControllerInitializationMode;
        this.enableVmContextLru = z;
        this.vmContextLruSize = i;
    }

    public boolean getEnableVmContextLru() {
        return this.enableVmContextLru;
    }

    public JSControllerInitializationMode getInitializationMode() {
        return this.initializationMode;
    }

    public int getVmContextLruSize() {
        return this.vmContextLruSize;
    }

    public String toString() {
        String valueOf = String.valueOf(this.initializationMode);
        boolean z = this.enableVmContextLru;
        int i = this.vmContextLruSize;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 93);
        sb.append("JSControllerConfig{initializationMode=");
        sb.append(valueOf);
        sb.append(",enableVmContextLru=");
        sb.append(z);
        sb.append(",vmContextLruSize=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
