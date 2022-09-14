package com.google.android.gms.internal.measurement;

import com.google.android.gms.tagmanager.zzdi;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes.dex */
final class zzwl implements zzwm {
    private HttpURLConnection zzbkv;
    private InputStream zzbkw = null;

    @Override // com.google.android.gms.internal.measurement.zzwm
    public final void close() {
        HttpURLConnection httpURLConnection = this.zzbkv;
        try {
            if (this.zzbkw != null) {
                this.zzbkw.close();
            }
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            zzdi.zza(valueOf.length() != 0 ? "HttpUrlConnectionNetworkClient: Error when closing http input stream: ".concat(valueOf) : new String("HttpUrlConnectionNetworkClient: Error when closing http input stream: "), e);
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzwm
    public final InputStream zzej(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setConnectTimeout(20000);
        this.zzbkv = httpURLConnection;
        HttpURLConnection httpURLConnection2 = this.zzbkv;
        int responseCode = httpURLConnection2.getResponseCode();
        if (responseCode == 200) {
            this.zzbkw = httpURLConnection2.getInputStream();
            return this.zzbkw;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Bad response: ");
        sb.append(responseCode);
        String sb2 = sb.toString();
        if (responseCode == 404) {
            throw new FileNotFoundException(sb2);
        }
        if (responseCode != 503) {
            throw new IOException(sb2);
        }
        throw new zzwo(sb2);
    }
}
