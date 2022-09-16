package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcp {
    private int zzabc;
    private ByteArrayOutputStream zzabd = new ByteArrayOutputStream();
    private final /* synthetic */ zzco zzabe;

    public zzcp(zzco zzcoVar) {
        this.zzabe = zzcoVar;
    }

    public final byte[] getPayload() {
        return this.zzabd.toByteArray();
    }

    public final boolean zze(zzch zzchVar) {
        byte[] bArr;
        Preconditions.checkNotNull(zzchVar);
        if (this.zzabc + 1 > zzbu.zzdy()) {
            return false;
        }
        String zza = this.zzabe.zza(zzchVar, false);
        if (zza == null) {
            this.zzabe.zzbu().zza(zzchVar, "Error formatting hit");
            return true;
        }
        byte[] bytes = zza.getBytes();
        int length = bytes.length;
        if (length > zzbu.zzdu()) {
            this.zzabe.zzbu().zza(zzchVar, "Hit size exceeds the maximum size limit");
            return true;
        }
        if (this.zzabd.size() > 0) {
            length++;
        }
        if (this.zzabd.size() + length > zzcc.zzzk.get().intValue()) {
            return false;
        }
        try {
            if (this.zzabd.size() > 0) {
                ByteArrayOutputStream byteArrayOutputStream = this.zzabd;
                bArr = zzco.zzabb;
                byteArrayOutputStream.write(bArr);
            }
            this.zzabd.write(bytes);
            this.zzabc++;
            return true;
        } catch (IOException e) {
            this.zzabe.zze("Failed to write payload when batching hits", e);
            return true;
        }
    }

    public final int zzfa() {
        return this.zzabc;
    }
}
