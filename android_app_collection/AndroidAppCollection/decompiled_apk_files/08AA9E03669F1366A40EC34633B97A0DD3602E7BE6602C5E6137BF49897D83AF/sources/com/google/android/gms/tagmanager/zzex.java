package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzacf;
import com.google.android.gms.internal.measurement.zzacg;
import com.google.android.gms.internal.measurement.zzvz;
import com.google.android.gms.internal.measurement.zzwb;
import com.google.android.gms.internal.measurement.zzwf;
import com.google.android.gms.internal.measurement.zzwj;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzex implements zzah {
    private final ExecutorService zzalw = Executors.newSingleThreadExecutor();
    private final String zzavt;
    private zzdh<zzvz> zzbau;
    private final Context zzqx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzex(Context context, String str) {
        this.zzqx = context;
        this.zzavt = str;
    }

    private static zzwf zza(ByteArrayOutputStream byteArrayOutputStream) {
        try {
            return zzda.zzdf(byteArrayOutputStream.toString("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            zzdi.zzcx("Failed to convert binary resource to string for JSON parsing; the file format is not UTF-8 format.");
            return null;
        } catch (JSONException unused2) {
            zzdi.zzaa("Failed to extract the container from the resource file. Resource is a UTF-8 encoded string but doesn't contain a JSON container");
            return null;
        }
    }

    private static zzwf zze(byte[] bArr) {
        try {
            zzwf zza = zzwb.zza((com.google.android.gms.internal.measurement.zzi) zzacg.zza(new com.google.android.gms.internal.measurement.zzi(), bArr));
            if (zza != null) {
                zzdi.v("The container was successfully loaded from the resource (using binary file)");
            }
            return zza;
        } catch (zzacf unused) {
            zzdi.e("The resource file is corrupted. The container cannot be extracted from the binary file");
            return null;
        } catch (zzwj unused2) {
            zzdi.zzaa("The resource file is invalid. The container from the binary file is invalid");
            return null;
        }
    }

    @VisibleForTesting
    private final File zzol() {
        String valueOf = String.valueOf("resource_");
        String valueOf2 = String.valueOf(this.zzavt);
        return new File(this.zzqx.getDir("google_tagmanager", 0), valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final synchronized void release() {
        this.zzalw.shutdown();
    }

    @Override // com.google.android.gms.tagmanager.zzah
    public final void zza(zzvz zzvzVar) {
        this.zzalw.execute(new zzez(this, zzvzVar));
    }

    @Override // com.google.android.gms.tagmanager.zzah
    public final void zza(zzdh<zzvz> zzdhVar) {
        this.zzbau = zzdhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final boolean zzb(zzvz zzvzVar) {
        FileOutputStream fileOutputStream;
        File zzol = zzol();
        try {
            try {
                fileOutputStream = new FileOutputStream(zzol);
                try {
                    byte[] bArr = new byte[zzvzVar.zzvv()];
                    zzacg.zza(zzvzVar, bArr, 0, bArr.length);
                    fileOutputStream.write(bArr);
                    try {
                        fileOutputStream.close();
                        return true;
                    } catch (IOException unused) {
                        zzdi.zzaa("error closing stream for writing resource to disk");
                        return true;
                    }
                } catch (IOException unused2) {
                    zzdi.zzaa("Error writing resource to disk. Removing resource from disk.");
                    zzol.delete();
                    try {
                        fileOutputStream.close();
                        return false;
                    } catch (IOException unused3) {
                        zzdi.zzaa("error closing stream for writing resource to disk");
                        return false;
                    }
                }
            } catch (FileNotFoundException unused4) {
                zzdi.e("Error opening resource file for writing");
                return false;
            }
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (IOException unused5) {
                zzdi.zzaa("error closing stream for writing resource to disk");
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.tagmanager.zzah
    public final void zzms() {
        this.zzalw.execute(new zzey(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r0 == com.google.android.gms.tagmanager.zzeh.zza.CONTAINER_DEBUG) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @com.google.android.gms.common.util.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzok() {
        /*
            r3 = this;
            com.google.android.gms.tagmanager.zzdh<com.google.android.gms.internal.measurement.zzvz> r0 = r3.zzbau
            if (r0 != 0) goto Lc
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Callback must be set before execute"
            r0.<init>(r1)
            throw r0
        Lc:
            com.google.android.gms.tagmanager.zzdh<com.google.android.gms.internal.measurement.zzvz> r0 = r3.zzbau
            r0.zzmr()
            java.lang.String r0 = "Attempting to load resource from disk"
            com.google.android.gms.tagmanager.zzdi.v(r0)
            com.google.android.gms.tagmanager.zzeh r0 = com.google.android.gms.tagmanager.zzeh.zzof()
            com.google.android.gms.tagmanager.zzeh$zza r0 = r0.zzog()
            com.google.android.gms.tagmanager.zzeh$zza r1 = com.google.android.gms.tagmanager.zzeh.zza.CONTAINER
            if (r0 == r1) goto L2e
            com.google.android.gms.tagmanager.zzeh r0 = com.google.android.gms.tagmanager.zzeh.zzof()
            com.google.android.gms.tagmanager.zzeh$zza r0 = r0.zzog()
            com.google.android.gms.tagmanager.zzeh$zza r1 = com.google.android.gms.tagmanager.zzeh.zza.CONTAINER_DEBUG
            if (r0 != r1) goto L46
        L2e:
            java.lang.String r0 = r3.zzavt
            com.google.android.gms.tagmanager.zzeh r1 = com.google.android.gms.tagmanager.zzeh.zzof()
            java.lang.String r1 = r1.getContainerId()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            com.google.android.gms.tagmanager.zzdh<com.google.android.gms.internal.measurement.zzvz> r0 = r3.zzbau
            int r1 = com.google.android.gms.tagmanager.zzcz.zzazi
            r0.zzq(r1)
            return
        L46:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> Lb0
            java.io.File r1 = r3.zzol()     // Catch: java.io.FileNotFoundException -> Lb0
            r0.<init>(r1)     // Catch: java.io.FileNotFoundException -> Lb0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L7c java.lang.IllegalArgumentException -> L7e java.io.IOException -> L8e
            r1.<init>()     // Catch: java.lang.Throwable -> L7c java.lang.IllegalArgumentException -> L7e java.io.IOException -> L8e
            com.google.android.gms.internal.measurement.zzwb.zza(r0, r1)     // Catch: java.lang.Throwable -> L7c java.lang.IllegalArgumentException -> L7e java.io.IOException -> L8e
            byte[] r1 = r1.toByteArray()     // Catch: java.lang.Throwable -> L7c java.lang.IllegalArgumentException -> L7e java.io.IOException -> L8e
            com.google.android.gms.internal.measurement.zzvz r2 = new com.google.android.gms.internal.measurement.zzvz     // Catch: java.lang.Throwable -> L7c java.lang.IllegalArgumentException -> L7e java.io.IOException -> L8e
            r2.<init>()     // Catch: java.lang.Throwable -> L7c java.lang.IllegalArgumentException -> L7e java.io.IOException -> L8e
            com.google.android.gms.internal.measurement.zzacg r1 = com.google.android.gms.internal.measurement.zzacg.zza(r2, r1)     // Catch: java.lang.Throwable -> L7c java.lang.IllegalArgumentException -> L7e java.io.IOException -> L8e
            com.google.android.gms.internal.measurement.zzvz r1 = (com.google.android.gms.internal.measurement.zzvz) r1     // Catch: java.lang.Throwable -> L7c java.lang.IllegalArgumentException -> L7e java.io.IOException -> L8e
            com.google.android.gms.internal.measurement.zzi r2 = r1.zzpv     // Catch: java.lang.Throwable -> L7c java.lang.IllegalArgumentException -> L7e java.io.IOException -> L8e
            if (r2 != 0) goto L76
            com.google.android.gms.internal.measurement.zzl r2 = r1.zzbmj     // Catch: java.lang.Throwable -> L7c java.lang.IllegalArgumentException -> L7e java.io.IOException -> L8e
            if (r2 != 0) goto L76
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L7c java.lang.IllegalArgumentException -> L7e java.io.IOException -> L8e
            java.lang.String r2 = "Resource and SupplementedResource are NULL."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7c java.lang.IllegalArgumentException -> L7e java.io.IOException -> L8e
            throw r1     // Catch: java.lang.Throwable -> L7c java.lang.IllegalArgumentException -> L7e java.io.IOException -> L8e
        L76:
            com.google.android.gms.tagmanager.zzdh<com.google.android.gms.internal.measurement.zzvz> r2 = r3.zzbau     // Catch: java.lang.Throwable -> L7c java.lang.IllegalArgumentException -> L7e java.io.IOException -> L8e
            r2.onSuccess(r1)     // Catch: java.lang.Throwable -> L7c java.lang.IllegalArgumentException -> L7e java.io.IOException -> L8e
            goto L8a
        L7c:
            r1 = move-exception
            goto La6
        L7e:
            com.google.android.gms.tagmanager.zzdh<com.google.android.gms.internal.measurement.zzvz> r1 = r3.zzbau     // Catch: java.lang.Throwable -> L7c
            int r2 = com.google.android.gms.tagmanager.zzcz.zzazj     // Catch: java.lang.Throwable -> L7c
            r1.zzq(r2)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = "Failed to read the resource from disk. The resource is inconsistent"
            com.google.android.gms.tagmanager.zzdi.zzaa(r1)     // Catch: java.lang.Throwable -> L7c
        L8a:
            r0.close()     // Catch: java.io.IOException -> L9b
            goto La0
        L8e:
            com.google.android.gms.tagmanager.zzdh<com.google.android.gms.internal.measurement.zzvz> r1 = r3.zzbau     // Catch: java.lang.Throwable -> L7c
            int r2 = com.google.android.gms.tagmanager.zzcz.zzazj     // Catch: java.lang.Throwable -> L7c
            r1.zzq(r2)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = "Failed to read the resource from disk"
            com.google.android.gms.tagmanager.zzdi.zzaa(r1)     // Catch: java.lang.Throwable -> L7c
            goto L8a
        L9b:
            java.lang.String r0 = "Error closing stream for reading resource from disk"
            com.google.android.gms.tagmanager.zzdi.zzaa(r0)
        La0:
            java.lang.String r0 = "The Disk resource was successfully read."
            com.google.android.gms.tagmanager.zzdi.v(r0)
            return
        La6:
            r0.close()     // Catch: java.io.IOException -> Laa
            goto Laf
        Laa:
            java.lang.String r0 = "Error closing stream for reading resource from disk"
            com.google.android.gms.tagmanager.zzdi.zzaa(r0)
        Laf:
            throw r1
        Lb0:
            java.lang.String r0 = "Failed to find the resource in the disk"
            com.google.android.gms.tagmanager.zzdi.zzcx(r0)
            com.google.android.gms.tagmanager.zzdh<com.google.android.gms.internal.measurement.zzvz> r0 = r3.zzbau
            int r1 = com.google.android.gms.tagmanager.zzcz.zzazi
            r0.zzq(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzex.zzok():void");
    }

    @Override // com.google.android.gms.tagmanager.zzah
    public final zzwf zzr(int i) {
        String sb;
        try {
            InputStream openRawResource = this.zzqx.getResources().openRawResource(i);
            String resourceName = this.zzqx.getResources().getResourceName(i);
            StringBuilder sb2 = new StringBuilder(String.valueOf(resourceName).length() + 66);
            sb2.append("Attempting to load a container from the resource ID ");
            sb2.append(i);
            sb2.append(" (");
            sb2.append(resourceName);
            sb2.append(")");
            zzdi.v(sb2.toString());
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzwb.zza(openRawResource, byteArrayOutputStream);
                zzwf zza = zza(byteArrayOutputStream);
                if (zza == null) {
                    return zze(byteArrayOutputStream.toByteArray());
                }
                zzdi.v("The container was successfully loaded from the resource (using JSON file format)");
                return zza;
            } catch (IOException unused) {
                String resourceName2 = this.zzqx.getResources().getResourceName(i);
                StringBuilder sb3 = new StringBuilder(String.valueOf(resourceName2).length() + 67);
                sb3.append("Error reading the default container with resource ID ");
                sb3.append(i);
                sb3.append(" (");
                sb3.append(resourceName2);
                sb3.append(")");
                sb = sb3.toString();
                zzdi.zzaa(sb);
                return null;
            }
        } catch (Resources.NotFoundException unused2) {
            StringBuilder sb4 = new StringBuilder(98);
            sb4.append("Failed to load the container. No default container resource found with the resource ID ");
            sb4.append(i);
            sb = sb4.toString();
        }
    }
}
