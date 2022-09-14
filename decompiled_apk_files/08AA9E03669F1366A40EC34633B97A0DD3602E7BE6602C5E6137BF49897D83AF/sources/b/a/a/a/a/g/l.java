package b.a.a.a.a.g;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DefaultSettingsSpiCall.java */
/* loaded from: classes.dex */
public class l extends b.a.a.a.a.b.a implements x {
    boolean a(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    public l(b.a.a.a.i iVar, String str, String str2, b.a.a.a.a.e.e eVar) {
        this(iVar, str, str2, eVar, b.a.a.a.a.e.c.GET);
    }

    l(b.a.a.a.i iVar, String str, String str2, b.a.a.a.a.e.e eVar, b.a.a.a.a.e.c cVar) {
        super(iVar, str, str2, eVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
    @Override // b.a.a.a.a.g.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject a(b.a.a.a.a.g.w r8) {
        /*
            r7 = this;
            r0 = 0
            java.util.Map r1 = r7.b(r8)     // Catch: java.lang.Throwable -> L75 b.a.a.a.a.e.d.c -> L7a
            b.a.a.a.a.e.d r2 = r7.getHttpRequest(r1)     // Catch: java.lang.Throwable -> L75 b.a.a.a.a.e.d.c -> L7a
            b.a.a.a.a.e.d r8 = r7.a(r2, r8)     // Catch: java.lang.Throwable -> L6f b.a.a.a.a.e.d.c -> L72
            b.a.a.a.l r2 = b.a.a.a.c.h()     // Catch: b.a.a.a.a.e.d.c -> L6d java.lang.Throwable -> Laa
            java.lang.String r3 = "Fabric"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: b.a.a.a.a.e.d.c -> L6d java.lang.Throwable -> Laa
            r4.<init>()     // Catch: b.a.a.a.a.e.d.c -> L6d java.lang.Throwable -> Laa
            java.lang.String r5 = "Requesting settings from "
            r4.append(r5)     // Catch: b.a.a.a.a.e.d.c -> L6d java.lang.Throwable -> Laa
            java.lang.String r5 = r7.getUrl()     // Catch: b.a.a.a.a.e.d.c -> L6d java.lang.Throwable -> Laa
            r4.append(r5)     // Catch: b.a.a.a.a.e.d.c -> L6d java.lang.Throwable -> Laa
            java.lang.String r4 = r4.toString()     // Catch: b.a.a.a.a.e.d.c -> L6d java.lang.Throwable -> Laa
            r2.a(r3, r4)     // Catch: b.a.a.a.a.e.d.c -> L6d java.lang.Throwable -> Laa
            b.a.a.a.l r2 = b.a.a.a.c.h()     // Catch: b.a.a.a.a.e.d.c -> L6d java.lang.Throwable -> Laa
            java.lang.String r3 = "Fabric"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: b.a.a.a.a.e.d.c -> L6d java.lang.Throwable -> Laa
            r4.<init>()     // Catch: b.a.a.a.a.e.d.c -> L6d java.lang.Throwable -> Laa
            java.lang.String r5 = "Settings query params were: "
            r4.append(r5)     // Catch: b.a.a.a.a.e.d.c -> L6d java.lang.Throwable -> Laa
            r4.append(r1)     // Catch: b.a.a.a.a.e.d.c -> L6d java.lang.Throwable -> Laa
            java.lang.String r1 = r4.toString()     // Catch: b.a.a.a.a.e.d.c -> L6d java.lang.Throwable -> Laa
            r2.a(r3, r1)     // Catch: b.a.a.a.a.e.d.c -> L6d java.lang.Throwable -> Laa
            org.json.JSONObject r1 = r7.a(r8)     // Catch: b.a.a.a.a.e.d.c -> L6d java.lang.Throwable -> Laa
            if (r8 == 0) goto L6b
            b.a.a.a.l r0 = b.a.a.a.c.h()
            java.lang.String r2 = "Fabric"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Settings request ID: "
            r3.append(r4)
            java.lang.String r4 = "X-REQUEST-ID"
            java.lang.String r8 = r8.b(r4)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            r0.a(r2, r8)
        L6b:
            r0 = r1
            goto La9
        L6d:
            r1 = move-exception
            goto L7c
        L6f:
            r0 = move-exception
            r8 = r2
            goto Lab
        L72:
            r1 = move-exception
            r8 = r2
            goto L7c
        L75:
            r8 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
            goto Lab
        L7a:
            r1 = move-exception
            r8 = r0
        L7c:
            b.a.a.a.l r2 = b.a.a.a.c.h()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r3 = "Fabric"
            java.lang.String r4 = "Settings request failed."
            r2.e(r3, r4, r1)     // Catch: java.lang.Throwable -> Laa
            if (r8 == 0) goto La9
            b.a.a.a.l r1 = b.a.a.a.c.h()
            java.lang.String r2 = "Fabric"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Settings request ID: "
            r3.append(r4)
            java.lang.String r4 = "X-REQUEST-ID"
            java.lang.String r8 = r8.b(r4)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            r1.a(r2, r8)
        La9:
            return r0
        Laa:
            r0 = move-exception
        Lab:
            if (r8 == 0) goto Lcd
            b.a.a.a.l r1 = b.a.a.a.c.h()
            java.lang.String r2 = "Fabric"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Settings request ID: "
            r3.append(r4)
            java.lang.String r4 = "X-REQUEST-ID"
            java.lang.String r8 = r8.b(r4)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            r1.a(r2, r8)
        Lcd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.a.g.l.a(b.a.a.a.a.g.w):org.json.JSONObject");
    }

    JSONObject a(b.a.a.a.a.e.d dVar) {
        int b2 = dVar.b();
        b.a.a.a.l h = b.a.a.a.c.h();
        h.a("Fabric", "Settings result was: " + b2);
        if (a(b2)) {
            return a(dVar.e());
        }
        b.a.a.a.l h2 = b.a.a.a.c.h();
        h2.e("Fabric", "Failed to retrieve settings from " + getUrl());
        return null;
    }

    private JSONObject a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            b.a.a.a.l h = b.a.a.a.c.h();
            h.a("Fabric", "Failed to parse settings JSON from " + getUrl(), e);
            b.a.a.a.l h2 = b.a.a.a.c.h();
            h2.a("Fabric", "Settings response " + str);
            return null;
        }
    }

    private Map<String, String> b(w wVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", wVar.h);
        hashMap.put("display_version", wVar.g);
        hashMap.put("source", Integer.toString(wVar.i));
        if (wVar.j != null) {
            hashMap.put("icon_hash", wVar.j);
        }
        String str = wVar.f;
        if (!b.a.a.a.a.b.i.d(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    private b.a.a.a.a.e.d a(b.a.a.a.a.e.d dVar, w wVar) {
        a(dVar, b.a.a.a.a.b.a.HEADER_API_KEY, wVar.f1246a);
        a(dVar, b.a.a.a.a.b.a.HEADER_CLIENT_TYPE, b.a.a.a.a.b.a.ANDROID_CLIENT_TYPE);
        a(dVar, b.a.a.a.a.b.a.HEADER_CLIENT_VERSION, this.kit.getVersion());
        a(dVar, b.a.a.a.a.b.a.HEADER_ACCEPT, b.a.a.a.a.b.a.ACCEPT_JSON_VALUE);
        a(dVar, "X-CRASHLYTICS-DEVICE-MODEL", wVar.f1247b);
        a(dVar, "X-CRASHLYTICS-OS-BUILD-VERSION", wVar.f1248c);
        a(dVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", wVar.f1249d);
        a(dVar, "X-CRASHLYTICS-INSTALLATION-ID", wVar.e);
        return dVar;
    }

    private void a(b.a.a.a.a.e.d dVar, String str, String str2) {
        if (str2 != null) {
            dVar.a(str, str2);
        }
    }
}
