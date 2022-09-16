package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
/* compiled from: PG */
/* renamed from: cmpp  reason: default package */
/* loaded from: classes5.dex */
public final class cmpp {
    public static final void a(String str) {
        try {
            try {
                coix coixVar = coiy.a;
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
                        sb.append("Received non-success response code ");
                        sb.append(responseCode);
                        sb.append(" from pinging URL: ");
                        sb.append(str);
                        sb.toString();
                    }
                    coix coixVar2 = coiy.a;
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                e = e;
                String message = e.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
                sb2.append("Error while pinging URL: ");
                sb2.append(str);
                sb2.append(". ");
                sb2.append(message);
                sb2.toString();
                coix coixVar3 = coiy.a;
            } catch (IndexOutOfBoundsException e2) {
                String message2 = e2.getMessage();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
                sb3.append("Error while parsing ping URL: ");
                sb3.append(str);
                sb3.append(". ");
                sb3.append(message2);
                sb3.toString();
                coix coixVar4 = coiy.a;
            } catch (RuntimeException e3) {
                e = e3;
                String message3 = e.getMessage();
                StringBuilder sb22 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
                sb22.append("Error while pinging URL: ");
                sb22.append(str);
                sb22.append(". ");
                sb22.append(message3);
                sb22.toString();
                coix coixVar32 = coiy.a;
            }
        } catch (Throwable th) {
            coix coixVar5 = coiy.a;
            throw th;
        }
    }
}
