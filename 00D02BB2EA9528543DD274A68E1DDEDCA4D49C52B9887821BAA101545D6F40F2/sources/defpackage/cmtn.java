package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
/* compiled from: PG */
/* renamed from: cmtn  reason: default package */
/* loaded from: classes5.dex */
public final class cmtn implements Runnable {
    private final String a;
    private final cnsx b;

    static {
        new cnxf("RevokeAccessOperation", new String[0]);
    }

    public cmtn(String str) {
        cnwc.l(str);
        this.a = str;
        this.b = new cnsx((GoogleApiClient) null);
    }

    public static cnoh<Status> a(String str) {
        if (str == null) {
            Status status = new Status(4);
            cnwc.e(!status.d(), "Status code must not be SUCCESS");
            cnoi cnoiVar = new cnoi(status);
            cnoiVar.p(status);
            return cnoiVar;
        }
        cmtn cmtnVar = new cmtn(str);
        new Thread(cmtnVar).start();
        return cmtnVar.b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.c;
        try {
            String str = this.a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(str) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.a;
                responseCode = 200;
            }
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            sb.toString();
        } catch (IOException e) {
            if (String.valueOf(e.toString()).length() == 0) {
                new String("IOException when revoking access: ");
            }
        } catch (Exception e2) {
            if (String.valueOf(e2.toString()).length() == 0) {
                new String("Exception when revoking access: ");
            }
        }
        this.b.p(status);
    }
}
