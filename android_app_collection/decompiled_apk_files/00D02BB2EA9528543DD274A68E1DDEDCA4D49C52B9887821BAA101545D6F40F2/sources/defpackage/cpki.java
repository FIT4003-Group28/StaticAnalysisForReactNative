package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.google.android.apps.maps.R;
import com.google.android.gms.auth.TokenData;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
/* compiled from: PG */
/* renamed from: cpki  reason: default package */
/* loaded from: classes5.dex */
public final class cpki {
    public static final aim<String, String> a;
    public final Executor b;
    public final cpkq<CronetEngine> c;
    public final Uri d;
    private final String e;
    private final Context f;
    private final cmri g;

    static {
        aim<String, String> aimVar = new aim<>();
        a = aimVar;
        aimVar.put("User-Agent", "Report abuse Google-API-Java-Client Google-HTTP-Java-Client/1.22.0-SNAPSHOT (gzip)");
    }

    public cpki(cmri cmriVar, Context context, Executor executor, cpkq cpkqVar, String str) {
        char c;
        String str2;
        this.g = cmriVar;
        cmriVar.getClass();
        this.f = context;
        this.b = executor;
        this.c = cpkqVar;
        int hashCode = str.hashCode();
        int i = 0;
        if (hashCode == -1897523141) {
            if (str.equals("staging")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 3449687) {
            if (hashCode == 3556498 && str.equals("test")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("prod")) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            str2 = "test-abusereporting-pa.corp.googleapis.com";
        } else if (c == 1) {
            str2 = "staging-abusereporting-pa.sandbox.googleapis.com";
        } else if (c != 2) {
            throw new IllegalArgumentException("Environment can only be test, staging or prod");
        } else {
            str2 = "abusereporting-pa.googleapis.com";
        }
        this.d = new Uri.Builder().scheme("https").authority(str2).build();
        String[] stringArray = context.getResources().getStringArray(R.array.authentication_scopes);
        StringBuilder sb = new StringBuilder("oauth2:");
        while (true) {
            int length = stringArray.length - 1;
            if (i < length) {
                sb.append(String.valueOf(stringArray[i]).concat(" "));
                i++;
            } else {
                sb.append(stringArray[length]);
                this.e = sb.toString();
                return;
            }
        }
    }

    public final void a(UrlRequest.Builder builder, String str) {
        cpcq b;
        if (str != null) {
            try {
                try {
                    b = cpda.a(cmrb.e(this.g.a, new Account(str, "com.google"), this.e));
                } catch (cmra | IOException e) {
                    b = cpda.b(e);
                }
                String valueOf = String.valueOf(((TokenData) cpda.d(b)).b);
                builder.mo41addHeader("Authorization", valueOf.length() != 0 ? "Bearer ".concat(valueOf) : new String("Bearer "));
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IOException(e2);
            } catch (ExecutionException e3) {
                if (e3.getCause() instanceof cmra) {
                    throw ((cmra) e3.getCause());
                }
                throw new IOException(e3);
            }
        }
    }
}
