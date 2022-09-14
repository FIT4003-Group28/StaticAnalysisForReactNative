package b.a.a.a.a.g;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbstractAppSpiCall.java */
/* loaded from: classes.dex */
public abstract class a extends b.a.a.a.a.b.a {
    public a(b.a.a.a.i iVar, String str, String str2, b.a.a.a.a.e.e eVar, b.a.a.a.a.e.c cVar) {
        super(iVar, str, str2, eVar, cVar);
    }

    public boolean a(d dVar) {
        b.a.a.a.a.e.d b2 = b(a(getHttpRequest(), dVar), dVar);
        b.a.a.a.l h = b.a.a.a.c.h();
        h.a("Fabric", "Sending app info to " + getUrl());
        if (dVar.j != null) {
            b.a.a.a.l h2 = b.a.a.a.c.h();
            h2.a("Fabric", "App icon hash is " + dVar.j.f1220a);
            b.a.a.a.l h3 = b.a.a.a.c.h();
            h3.a("Fabric", "App icon size is " + dVar.j.f1222c + "x" + dVar.j.f1223d);
        }
        int b3 = b2.b();
        String str = "POST".equals(b2.p()) ? "Create" : "Update";
        b.a.a.a.l h4 = b.a.a.a.c.h();
        h4.a("Fabric", str + " app request ID: " + b2.b(b.a.a.a.a.b.a.HEADER_REQUEST_ID));
        b.a.a.a.l h5 = b.a.a.a.c.h();
        h5.a("Fabric", "Result was " + b3);
        return b.a.a.a.a.b.s.a(b3) == 0;
    }

    private b.a.a.a.a.e.d a(b.a.a.a.a.e.d dVar, d dVar2) {
        return dVar.a(b.a.a.a.a.b.a.HEADER_API_KEY, dVar2.f1201a).a(b.a.a.a.a.b.a.HEADER_CLIENT_TYPE, b.a.a.a.a.b.a.ANDROID_CLIENT_TYPE).a(b.a.a.a.a.b.a.HEADER_CLIENT_VERSION, this.kit.getVersion());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private b.a.a.a.a.e.d b(b.a.a.a.a.e.d r8, b.a.a.a.a.g.d r9) {
        /*
            r7 = this;
            java.lang.String r0 = "app[identifier]"
            java.lang.String r1 = r9.f1202b
            b.a.a.a.a.e.d r8 = r8.e(r0, r1)
            java.lang.String r0 = "app[name]"
            java.lang.String r1 = r9.f
            b.a.a.a.a.e.d r8 = r8.e(r0, r1)
            java.lang.String r0 = "app[display_version]"
            java.lang.String r1 = r9.f1203c
            b.a.a.a.a.e.d r8 = r8.e(r0, r1)
            java.lang.String r0 = "app[build_version]"
            java.lang.String r1 = r9.f1204d
            b.a.a.a.a.e.d r8 = r8.e(r0, r1)
            java.lang.String r0 = "app[source]"
            int r1 = r9.g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            b.a.a.a.a.e.d r8 = r8.a(r0, r1)
            java.lang.String r0 = "app[minimum_sdk_version]"
            java.lang.String r1 = r9.h
            b.a.a.a.a.e.d r8 = r8.e(r0, r1)
            java.lang.String r0 = "app[built_sdk_version]"
            java.lang.String r1 = r9.i
            b.a.a.a.a.e.d r8 = r8.e(r0, r1)
            java.lang.String r0 = r9.e
            boolean r0 = b.a.a.a.a.b.i.d(r0)
            if (r0 != 0) goto L4b
            java.lang.String r0 = "app[instance_identifier]"
            java.lang.String r1 = r9.e
            r8.e(r0, r1)
        L4b:
            b.a.a.a.a.g.n r0 = r9.j
            if (r0 == 0) goto Lc6
            r0 = 0
            b.a.a.a.i r1 = r7.kit     // Catch: java.lang.Throwable -> L94 android.content.res.Resources.NotFoundException -> L97
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L94 android.content.res.Resources.NotFoundException -> L97
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Throwable -> L94 android.content.res.Resources.NotFoundException -> L97
            b.a.a.a.a.g.n r2 = r9.j     // Catch: java.lang.Throwable -> L94 android.content.res.Resources.NotFoundException -> L97
            int r2 = r2.f1221b     // Catch: java.lang.Throwable -> L94 android.content.res.Resources.NotFoundException -> L97
            java.io.InputStream r1 = r1.openRawResource(r2)     // Catch: java.lang.Throwable -> L94 android.content.res.Resources.NotFoundException -> L97
            java.lang.String r0 = "app[icon][hash]"
            b.a.a.a.a.g.n r2 = r9.j     // Catch: android.content.res.Resources.NotFoundException -> L92 java.lang.Throwable -> Lbf
            java.lang.String r2 = r2.f1220a     // Catch: android.content.res.Resources.NotFoundException -> L92 java.lang.Throwable -> Lbf
            b.a.a.a.a.e.d r0 = r8.e(r0, r2)     // Catch: android.content.res.Resources.NotFoundException -> L92 java.lang.Throwable -> Lbf
            java.lang.String r2 = "app[icon][data]"
            java.lang.String r3 = "icon.png"
            java.lang.String r4 = "application/octet-stream"
            b.a.a.a.a.e.d r0 = r0.a(r2, r3, r4, r1)     // Catch: android.content.res.Resources.NotFoundException -> L92 java.lang.Throwable -> Lbf
            java.lang.String r2 = "app[icon][width]"
            b.a.a.a.a.g.n r3 = r9.j     // Catch: android.content.res.Resources.NotFoundException -> L92 java.lang.Throwable -> Lbf
            int r3 = r3.f1222c     // Catch: android.content.res.Resources.NotFoundException -> L92 java.lang.Throwable -> Lbf
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.content.res.Resources.NotFoundException -> L92 java.lang.Throwable -> Lbf
            b.a.a.a.a.e.d r0 = r0.a(r2, r3)     // Catch: android.content.res.Resources.NotFoundException -> L92 java.lang.Throwable -> Lbf
            java.lang.String r2 = "app[icon][height]"
            b.a.a.a.a.g.n r3 = r9.j     // Catch: android.content.res.Resources.NotFoundException -> L92 java.lang.Throwable -> Lbf
            int r3 = r3.f1223d     // Catch: android.content.res.Resources.NotFoundException -> L92 java.lang.Throwable -> Lbf
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.content.res.Resources.NotFoundException -> L92 java.lang.Throwable -> Lbf
            r0.a(r2, r3)     // Catch: android.content.res.Resources.NotFoundException -> L92 java.lang.Throwable -> Lbf
            goto Lb9
        L92:
            r0 = move-exception
            goto L9b
        L94:
            r8 = move-exception
            r1 = r0
            goto Lc0
        L97:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L9b:
            b.a.a.a.l r2 = b.a.a.a.c.h()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r3 = "Fabric"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbf
            r4.<init>()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r5 = "Failed to find app icon with resource ID: "
            r4.append(r5)     // Catch: java.lang.Throwable -> Lbf
            b.a.a.a.a.g.n r5 = r9.j     // Catch: java.lang.Throwable -> Lbf
            int r5 = r5.f1221b     // Catch: java.lang.Throwable -> Lbf
            r4.append(r5)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lbf
            r2.e(r3, r4, r0)     // Catch: java.lang.Throwable -> Lbf
        Lb9:
            java.lang.String r0 = "Failed to close app icon InputStream."
            b.a.a.a.a.b.i.a(r1, r0)
            goto Lc6
        Lbf:
            r8 = move-exception
        Lc0:
            java.lang.String r9 = "Failed to close app icon InputStream."
            b.a.a.a.a.b.i.a(r1, r9)
            throw r8
        Lc6:
            java.util.Collection<b.a.a.a.k> r0 = r9.k
            if (r0 == 0) goto Lf3
            java.util.Collection<b.a.a.a.k> r9 = r9.k
            java.util.Iterator r9 = r9.iterator()
        Ld0:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lf3
            java.lang.Object r0 = r9.next()
            b.a.a.a.k r0 = (b.a.a.a.k) r0
            java.lang.String r1 = r7.a(r0)
            java.lang.String r2 = r0.b()
            r8.e(r1, r2)
            java.lang.String r1 = r7.b(r0)
            java.lang.String r0 = r0.c()
            r8.e(r1, r0)
            goto Ld0
        Lf3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.a.g.a.b(b.a.a.a.a.e.d, b.a.a.a.a.g.d):b.a.a.a.a.e.d");
    }

    String a(b.a.a.a.k kVar) {
        return String.format(Locale.US, "app[build][libraries][%s][version]", kVar.a());
    }

    String b(b.a.a.a.k kVar) {
        return String.format(Locale.US, "app[build][libraries][%s][type]", kVar.a());
    }
}
