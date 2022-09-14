package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
/* compiled from: PG */
/* renamed from: cksa  reason: default package */
/* loaded from: classes4.dex */
public final class cksa implements cksf {
    private static final int c = (int) TimeUnit.SECONDS.toMillis(2);
    public final btrm a;
    @dzsi
    public akra b = null;
    private final btvo d;
    private final crdz e;

    public cksa(btvo btvoVar, btrm btrmVar, crdz crdzVar) {
        this.d = btvoVar;
        this.a = btrmVar;
        this.e = crdzVar;
    }

    @Override // defpackage.cksf
    public final boolean a(crfk crfkVar, String str) {
        String sb;
        String str2;
        String replace;
        String str3 = ((crff) crfkVar).a;
        File file = new File(str);
        try {
            try {
                Locale locale = Locale.getDefault();
                akra akraVar = this.b;
                btvo btvoVar = this.d;
                crdz crdzVar = this.e;
                String replace2 = str3.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", " ");
                if (akraVar == null) {
                    akraVar = new akra(0, 0);
                }
                String str4 = btvoVar.getTextToSpeechParameters().f;
                if (str4 == null) {
                    replace = null;
                } else {
                    if (dbtw.a(locale.getCountry())) {
                        sb = locale.getLanguage();
                    } else {
                        String language = locale.getLanguage();
                        String country = locale.getCountry();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(language).length() + 1 + String.valueOf(country).length());
                        sb2.append(language);
                        sb2.append("-");
                        sb2.append(country);
                        sb = sb2.toString();
                    }
                    if (crdzVar.a()) {
                        str2 = crdzVar.b();
                    } else {
                        str2 = btvoVar.getTextToSpeechParameters().m;
                    }
                    replace = str4.replace("$VOICE", URLEncoder.encode(str2, "UTF-8")).replace("$LOCALE", URLEncoder.encode(sb, "UTF-8")).replace("$TEXT", URLEncoder.encode(replace2, "UTF-8")).replace("$LAT_E7", URLEncoder.encode(String.valueOf(akraVar.j()), "UTF-8")).replace("$LONG_E7", URLEncoder.encode(String.valueOf(akraVar.n()), "UTF-8"));
                }
                if (replace != null) {
                    URL url = new URL(replace);
                    SSLContext sSLContext = SSLContext.getInstance("TLS");
                    sSLContext.init(null, null, new SecureRandom());
                    cksu cksuVar = new cksu((HttpsURLConnection) url.openConnection());
                    cksuVar.a.setSSLSocketFactory(sSLContext.getSocketFactory());
                    cksuVar.a.setConnectTimeout(c);
                    InputStream inputStream = cksuVar.a.getInputStream();
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        try {
                            byte[] bArr = new byte[1024];
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                return false;
                            }
                            while (read != -1) {
                                fileOutputStream.write(bArr, 0, read);
                                read = inputStream.read(bArr);
                            }
                            return true;
                        } catch (NullPointerException e) {
                            btty.a(e);
                            throw e;
                        }
                    } finally {
                        inputStream.close();
                        fileOutputStream.close();
                    }
                }
            } catch (SocketTimeoutException | IOException | IllegalStateException | KeyManagementException | NoSuchAlgorithmException unused) {
            }
            return false;
        } catch (MalformedURLException e2) {
            bvoo.j(e2);
            return false;
        }
    }
}
