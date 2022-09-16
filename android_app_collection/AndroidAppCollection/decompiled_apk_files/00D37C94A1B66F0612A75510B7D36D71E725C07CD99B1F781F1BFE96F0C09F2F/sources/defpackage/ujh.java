package defpackage;

import android.text.TextUtils;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLException;
/* compiled from: PG */
/* renamed from: ujh  reason: default package */
/* loaded from: classes4.dex */
public final class ujh {
    private static final vil a = new vil();
    private final ucj b;
    private final axnm c;
    private final uhz d;

    public ujh(uhz uhzVar, ucj ucjVar, axnm axnmVar) {
        this.d = uhzVar;
        this.b = ucjVar;
        this.c = axnmVar;
    }

    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object, aoqu] */
    public final ujf a(String str, String str2, aoqu aoquVar, aoqu aoquVar2) {
        String str3;
        String concat;
        Map map;
        try {
            aoquVar.getClass();
            aoquVar2.getClass();
            byte[] byteArray = aoquVar.toByteArray();
            uhs uhsVar = new uhs();
            uhsVar.c = new HashMap();
            ucj ucjVar = this.b;
            vil vilVar = a;
            vgt vgtVar = vil.c;
            if ("true".equals(viv.a("debug.social", "true")) && "true".equals(viv.a(vgtVar.a, "true"))) {
                str3 = viv.a(vilVar.a, vilVar.b);
                if (str3 != null && str3.length() == 91) {
                    StringBuilder sb = new StringBuilder(str3);
                    int i = 2;
                    while (true) {
                        int i2 = i + 1;
                        StringBuilder sb2 = new StringBuilder(27);
                        sb2.append("chime.server.url");
                        sb2.append(i);
                        String a2 = viv.a(sb2.toString(), "");
                        sb.append(a2);
                        if (a2.length() != 91) {
                            break;
                        }
                        i = i2;
                    }
                    str3 = sb.toString();
                }
            } else {
                str3 = vilVar.b;
            }
            if (TextUtils.isEmpty(str3)) {
                concat = ucjVar.c.f;
            } else {
                String valueOf = String.valueOf(str3);
                concat = valueOf.length() != 0 ? "https://".concat(valueOf) : new String("https://");
            }
            String valueOf2 = String.valueOf(concat);
            uhsVar.a = new URL(str.length() != 0 ? valueOf2.concat(str) : new String(valueOf2));
            uhsVar.d = byteArray;
            uhsVar.b = "application/x-protobuf";
            if (TextUtils.isEmpty(str2)) {
                if (!TextUtils.isEmpty(null)) {
                    uhsVar.b(uhr.a("X-Goog-Api-Key"), null);
                } else {
                    throw new Exception("One of Account Name or API Key must be set.");
                }
            } else {
                String b = this.d.b(str2);
                uhr a3 = uhr.a("Authorization");
                String valueOf3 = String.valueOf(b);
                uhsVar.b(a3, valueOf3.length() != 0 ? "Bearer ".concat(valueOf3) : new String("Bearer "));
            }
            uhq uhqVar = (uhq) this.c.get();
            URL url = uhsVar.a;
            if (url != null && (map = uhsVar.c) != null) {
                uhv a4 = uhqVar.a(new uht(url, uhsVar.b, map, uhsVar.d));
                if (a4.b() != null) {
                    ujd a5 = ujf.a();
                    a5.b = a4.b();
                    Throwable b2 = a4.b();
                    boolean z = true;
                    if (b2 == null || (!(b2 instanceof SocketException) && !(b2 instanceof UnknownHostException) && !(b2 instanceof SSLException) && (!(b2 instanceof uhw) || ((uhw) b2).a != 401))) {
                        z = false;
                    }
                    a5.b(z);
                    return a5.a();
                }
                ?? j = aoquVar2.getParserForType().j(a4.a);
                ujd a6 = ujf.a();
                a6.a = j;
                return a6.a();
            }
            StringBuilder sb3 = new StringBuilder();
            if (uhsVar.a == null) {
                sb3.append(" url");
            }
            if (uhsVar.c == null) {
                sb3.append(" headers");
            }
            String valueOf4 = String.valueOf(sb3);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 28);
            sb4.append("Missing required properties:");
            sb4.append(valueOf4);
            throw new IllegalStateException(sb4.toString());
        } catch (Exception e) {
            ujd a7 = ujf.a();
            a7.b = e;
            a7.b(false);
            return a7.a();
        }
    }
}
