package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzah extends zzar {
    private static boolean zzuz;
    private AdvertisingIdClient.Info zzva;
    private final zzcz zzvb;
    private String zzvc;
    private boolean zzvd;
    private final Object zzve;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzah(zzat zzatVar) {
        super(zzatVar);
        this.zzvd = false;
        this.zzve = new Object();
        this.zzvb = new zzcz(zzatVar.zzbt());
    }

    private final boolean zza(AdvertisingIdClient.Info info, AdvertisingIdClient.Info info2) {
        String str = null;
        String id = info2 == null ? null : info2.getId();
        if (TextUtils.isEmpty(id)) {
            return true;
        }
        String zzdn = zzcc().zzdn();
        synchronized (this.zzve) {
            if (!this.zzvd) {
                this.zzvc = zzbm();
                this.zzvd = true;
            } else if (TextUtils.isEmpty(this.zzvc)) {
                if (info != null) {
                    str = info.getId();
                }
                if (str == null) {
                    String valueOf = String.valueOf(id);
                    String valueOf2 = String.valueOf(zzdn);
                    return zzo(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                }
                String valueOf3 = String.valueOf(str);
                String valueOf4 = String.valueOf(zzdn);
                this.zzvc = zzn(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            }
            String valueOf5 = String.valueOf(id);
            String valueOf6 = String.valueOf(zzdn);
            String zzn = zzn(valueOf6.length() != 0 ? valueOf5.concat(valueOf6) : new String(valueOf5));
            if (TextUtils.isEmpty(zzn)) {
                return false;
            }
            if (zzn.equals(this.zzvc)) {
                return true;
            }
            if (!TextUtils.isEmpty(this.zzvc)) {
                zzp("Resetting the client id because Advertising Id changed.");
                zzdn = zzcc().zzdo();
                zza("New client Id", zzdn);
            }
            String valueOf7 = String.valueOf(id);
            String valueOf8 = String.valueOf(zzdn);
            return zzo(valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new String(valueOf7));
        }
    }

    private final synchronized AdvertisingIdClient.Info zzbk() {
        if (this.zzvb.zzj(1000L)) {
            this.zzvb.start();
            AdvertisingIdClient.Info zzbl = zzbl();
            if (!zza(this.zzva, zzbl)) {
                zzt("Failed to reset client id on adid change. Not using adid");
                zzbl = new AdvertisingIdClient.Info("", false);
            }
            this.zzva = zzbl;
        }
        return this.zzva;
    }

    private final AdvertisingIdClient.Info zzbl() {
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(getContext());
        } catch (IllegalStateException unused) {
            zzs("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
            return null;
        } catch (Exception e) {
            if (zzuz) {
                return null;
            }
            zzuz = true;
            zzd("Error getting advertiser id", e);
            return null;
        }
    }

    private final String zzbm() {
        String str = null;
        try {
            FileInputStream openFileInput = getContext().openFileInput("gaClientIdData");
            byte[] bArr = new byte[128];
            int read = openFileInput.read(bArr, 0, 128);
            if (openFileInput.available() > 0) {
                zzs("Hash file seems corrupted, deleting it.");
                openFileInput.close();
                getContext().deleteFile("gaClientIdData");
                return null;
            } else if (read <= 0) {
                zzp("Hash file is empty.");
                openFileInput.close();
                return null;
            } else {
                String str2 = new String(bArr, 0, read);
                try {
                    openFileInput.close();
                } catch (FileNotFoundException unused) {
                } catch (IOException e) {
                    e = e;
                    str = str2;
                    zzd("Error reading Hash file, deleting it", e);
                    getContext().deleteFile("gaClientIdData");
                    return str;
                }
                return str2;
            }
        } catch (FileNotFoundException unused2) {
            return str;
        } catch (IOException e2) {
            e = e2;
        }
    }

    private static String zzn(String str) {
        MessageDigest messageDigest = zzdd.getMessageDigest("MD5");
        if (messageDigest == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest(str.getBytes())));
    }

    private final boolean zzo(String str) {
        try {
            String zzn = zzn(str);
            zzp("Storing hashed adid.");
            FileOutputStream openFileOutput = getContext().openFileOutput("gaClientIdData", 0);
            openFileOutput.write(zzn.getBytes());
            openFileOutput.close();
            this.zzvc = zzn;
            return true;
        } catch (IOException e) {
            zze("Error creating hash file", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzar
    protected final void zzac() {
    }

    public final boolean zzbc() {
        zzch();
        AdvertisingIdClient.Info zzbk = zzbk();
        return zzbk != null && !zzbk.isLimitAdTrackingEnabled();
    }

    public final String zzbj() {
        zzch();
        AdvertisingIdClient.Info zzbk = zzbk();
        String id = zzbk != null ? zzbk.getId() : null;
        if (TextUtils.isEmpty(id)) {
            return null;
        }
        return id;
    }
}
