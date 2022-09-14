package com.google.android.gms.tagmanager;

import android.net.Uri;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
@VisibleForTesting
/* loaded from: classes.dex */
class zzeh {
    private static zzeh zzbae;
    private volatile zza zzbaf = zza.NONE;
    private volatile String zzbag = null;
    private volatile String zzavt = null;
    private volatile String zzbah = null;

    /* loaded from: classes.dex */
    enum zza {
        NONE,
        CONTAINER,
        CONTAINER_DEBUG
    }

    zzeh() {
    }

    private static String zzdh(String str) {
        return str.split("&")[0].split("=")[1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeh zzof() {
        zzeh zzehVar;
        synchronized (zzeh.class) {
            if (zzbae == null) {
                zzbae = new zzeh();
            }
            zzehVar = zzbae;
        }
        return zzehVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String getContainerId() {
        return this.zzavt;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean zzb(Uri uri) {
        try {
            String decode = URLDecoder.decode(uri.toString(), "UTF-8");
            if (decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) {
                String valueOf = String.valueOf(decode);
                zzdi.v(valueOf.length() != 0 ? "Container preview url: ".concat(valueOf) : new String("Container preview url: "));
                this.zzbaf = decode.matches(".*?&gtm_debug=x$") ? zza.CONTAINER_DEBUG : zza.CONTAINER;
                this.zzbah = uri.getQuery().replace("&gtm_debug=x", "");
                if (this.zzbaf == zza.CONTAINER || this.zzbaf == zza.CONTAINER_DEBUG) {
                    String valueOf2 = String.valueOf("/r?");
                    String valueOf3 = String.valueOf(this.zzbah);
                    this.zzbag = valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
                }
                this.zzavt = zzdh(this.zzbah);
                return true;
            } else if (!decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$")) {
                String valueOf4 = String.valueOf(decode);
                zzdi.zzaa(valueOf4.length() != 0 ? "Invalid preview uri: ".concat(valueOf4) : new String("Invalid preview uri: "));
                return false;
            } else if (!zzdh(uri.getQuery()).equals(this.zzavt)) {
                return false;
            } else {
                String valueOf5 = String.valueOf(this.zzavt);
                zzdi.v(valueOf5.length() != 0 ? "Exit preview mode for container: ".concat(valueOf5) : new String("Exit preview mode for container: "));
                this.zzbaf = zza.NONE;
                this.zzbag = null;
                return true;
            }
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zza zzog() {
        return this.zzbaf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzoh() {
        return this.zzbag;
    }
}
