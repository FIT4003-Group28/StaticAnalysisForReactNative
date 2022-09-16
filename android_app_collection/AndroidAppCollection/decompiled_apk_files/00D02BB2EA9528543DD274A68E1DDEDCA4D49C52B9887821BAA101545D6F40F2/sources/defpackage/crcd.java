package defpackage;

import android.app.Application;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: crcd  reason: default package */
/* loaded from: classes5.dex */
public final class crcd implements crby {
    public final String a;
    private final Map<crca, crbz> b = new HashMap();
    private final btvo c;
    private final bvjj d;
    @dzsi
    private crcb e;
    private final buxe f;
    private final crdz g;
    @dzsi
    private crbt h;

    public crcd(Application application, bvjj bvjjVar, buxe buxeVar, btvo btvoVar, crdz crdzVar) {
        int i;
        crbz crbzVar;
        this.d = bvjjVar;
        this.f = buxeVar;
        this.c = btvoVar;
        this.g = crdzVar;
        char c = 0;
        this.a = String.valueOf(bvog.n(application, false, "testdata", true).getPath()).concat("/voice/");
        String[] split = bvjjVar.z(bvjk.eM, "").split(",");
        int length = split.length;
        int i2 = 0;
        while (i2 < length) {
            String str = split[i2];
            String str2 = this.a;
            String[] split2 = str.split(":");
            if (split2.length != 5) {
                crbzVar = null;
                i = length;
            } else {
                i = length;
                crbzVar = new crbz(split2[c], split2[1], decs.c(split2[2], 16).a, decs.c(split2[3], 16).a, decs.c(split2[4], 16).a, str2);
            }
            if (crbzVar != null) {
                this.b.put(crbzVar.b(), crbzVar);
            }
            i2++;
            length = i;
            c = 0;
        }
        Iterator<crbz> it = this.b.values().iterator();
        while (it.hasNext()) {
            crbz next = it.next();
            if (System.currentTimeMillis() > next.c + 2592000000L) {
                i(next);
                it.remove();
            }
        }
        b();
    }

    private static void i(crbz crbzVar) {
        File a = crbzVar.a();
        String[] list = a.list();
        if (list == null) {
            return;
        }
        for (String str : list) {
            new File(a, str).delete();
        }
        a.delete();
    }

    private final File j(crbz crbzVar) {
        return new File(crbzVar.a(), g(crbzVar.a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
        if (r3 == null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    @Override // defpackage.crby
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.crbx a(java.util.Locale r11, defpackage.crbt r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = r11.toString()     // Catch: java.lang.Throwable -> Lba
            java.lang.String r0 = r10.g(r0)     // Catch: java.lang.Throwable -> Lba
            java.util.Map<crca, crbz> r1 = r10.b     // Catch: java.lang.Throwable -> Lba
            crca r2 = new crca     // Catch: java.lang.Throwable -> Lba
            java.lang.String r3 = r11.toString()     // Catch: java.lang.Throwable -> Lba
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> Lba
            crbz r1 = (defpackage.crbz) r1     // Catch: java.lang.Throwable -> Lba
            r2 = 0
            if (r1 == 0) goto L83
            java.io.File r3 = r10.j(r1)     // Catch: java.io.IOException -> L35 java.util.zip.ZipException -> L4d java.io.FileNotFoundException -> L65 java.lang.Throwable -> Lba
            crbx r3 = defpackage.crbx.a(r3)     // Catch: java.io.IOException -> L35 java.util.zip.ZipException -> L4d java.io.FileNotFoundException -> L65 java.lang.Throwable -> Lba
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L2f java.util.zip.ZipException -> L31 java.io.FileNotFoundException -> L33 java.lang.Throwable -> Lba
            r1.c = r4     // Catch: java.io.IOException -> L2f java.util.zip.ZipException -> L31 java.io.FileNotFoundException -> L33 java.lang.Throwable -> Lba
            r10.b()     // Catch: java.io.IOException -> L2f java.util.zip.ZipException -> L31 java.io.FileNotFoundException -> L33 java.lang.Throwable -> Lba
            goto L84
        L2f:
            r4 = move-exception
            goto L38
        L31:
            r4 = move-exception
            goto L50
        L33:
            r4 = move-exception
            goto L68
        L35:
            r3 = move-exception
            r4 = r3
            r3 = r2
        L38:
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lba
            int r5 = r5.length()     // Catch: java.lang.Throwable -> Lba
            if (r5 != 0) goto L49
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> Lba
            java.lang.String r6 = "Unable to parse speech bundle: "
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lba
        L49:
            defpackage.bvoo.j(r4)     // Catch: java.lang.Throwable -> Lba
            goto L84
        L4d:
            r3 = move-exception
            r4 = r3
            r3 = r2
        L50:
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lba
            int r5 = r5.length()     // Catch: java.lang.Throwable -> Lba
            if (r5 != 0) goto L61
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> Lba
            java.lang.String r6 = "Failed to zip "
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lba
        L61:
            defpackage.bvoo.j(r4)     // Catch: java.lang.Throwable -> Lba
            goto L84
        L65:
            r3 = move-exception
            r4 = r3
            r3 = r2
        L68:
            boolean r5 = defpackage.bvog.a()     // Catch: java.lang.Throwable -> Lba
            if (r5 != 0) goto L84
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lba
            int r5 = r5.length()     // Catch: java.lang.Throwable -> Lba
            if (r5 != 0) goto L7f
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> Lba
            java.lang.String r6 = "Missing bundle file: "
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lba
        L7f:
            defpackage.bvoo.j(r4)     // Catch: java.lang.Throwable -> Lba
            goto L84
        L83:
            r3 = r2
        L84:
            crcb r4 = r10.e     // Catch: java.lang.Throwable -> Lba
            if (r4 != 0) goto Lb8
            if (r1 == 0) goto L99
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lba
            long r6 = r1.d     // Catch: java.lang.Throwable -> Lba
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            long r6 = r6 + r8
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L99
            goto L9b
        L99:
            if (r3 != 0) goto Lb8
        L9b:
            if (r3 == 0) goto L9e
            goto L9f
        L9e:
            r1 = r2
        L9f:
            crcb r2 = new crcb     // Catch: java.lang.Throwable -> Lba
            r2.<init>(r11, r0, r1)     // Catch: java.lang.Throwable -> Lba
            r10.h = r12     // Catch: java.lang.Throwable -> Lba
            buxe r11 = r10.f     // Catch: java.lang.Throwable -> Lba
            dxai r12 = r2.a()     // Catch: java.lang.Throwable -> Lba
            crcc r0 = new crcc     // Catch: java.lang.Throwable -> Lba
            r0.<init>(r10, r2)     // Catch: java.lang.Throwable -> Lba
            bvrj r1 = defpackage.bvrj.BACKGROUND_THREADPOOL     // Catch: java.lang.Throwable -> Lba
            r11.a(r12, r0, r1)     // Catch: java.lang.Throwable -> Lba
            r10.e = r2     // Catch: java.lang.Throwable -> Lba
        Lb8:
            monitor-exit(r10)
            return r3
        Lba:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crcd.a(java.util.Locale, crbt):crbx");
    }

    public final synchronized void b() {
        dbrz e = dbrz.e(",");
        StringBuilder sb = new StringBuilder();
        e.m(sb, this.b.values());
        this.d.ac(bvjk.eM, sb.toString());
    }

    final synchronized void c(crbz crbzVar) {
        crbz crbzVar2 = this.b.get(crbzVar.b());
        this.b.put(crbzVar.b(), crbzVar);
        if (crbzVar2 != null && crbzVar2.b != crbzVar.b) {
            i(crbzVar2);
        }
        b();
    }

    public final synchronized void d(crcb crcbVar) {
        crcbVar.d--;
        this.f.a(crcbVar.a(), new crcc(this, crcbVar), bvrj.BACKGROUND_THREADPOOL);
        this.e = crcbVar;
    }

    public final synchronized void e(crcb crcbVar, crbz crbzVar, byte[] bArr) {
        File j = j(crbzVar);
        File parentFile = j.getParentFile();
        if (parentFile == null) {
            f(crcbVar);
            return;
        }
        parentFile.mkdirs();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(j);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                try {
                    crbx a = crbx.a(j);
                    crbt crbtVar = this.h;
                    if (crbtVar == null) {
                        try {
                            a.close();
                        } catch (IOException unused) {
                        }
                    } else {
                        synchronized (crbtVar.a.a) {
                            crbtVar.a.b = a;
                        }
                        this.h = null;
                    }
                    c(crbzVar);
                } catch (IOException e) {
                    if (String.valueOf(crbzVar.a).length() == 0) {
                        new String("Cannot parse bundle ");
                    }
                    bvoo.j(e);
                    j.delete();
                    f(crcbVar);
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    deki.a(th, th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e2) {
            String valueOf = String.valueOf(j);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Cannot save bundle to ");
            sb.append(valueOf);
            sb.toString();
            bvoo.j(e2);
            f(crcbVar);
        } catch (IOException e3) {
            String valueOf2 = String.valueOf(j);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 22);
            sb2.append("Cannot save bundle to ");
            sb2.append(valueOf2);
            sb2.toString();
            bvoo.j(e3);
            j.delete();
            f(crcbVar);
        }
    }

    public final synchronized void f(crcb crcbVar) {
        crcbVar.toString();
        if (this.h != null) {
            this.h = null;
        }
    }

    protected final String g(String str) {
        String z = this.d.z(bvjk.eK, "");
        if (!z.isEmpty()) {
            return z;
        }
        if (this.g.a()) {
            this.g.c();
            if (!this.g.b().isEmpty() && !this.g.d()) {
                String b = this.g.b();
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(b).length());
                sb.append(str);
                sb.append("/");
                sb.append(b);
                sb.append("/");
                sb.append("voice_instructions_unitless.zip");
                return sb.toString();
            }
        } else {
            String str2 = this.c.getTextToSpeechParameters().i;
            if (!str2.isEmpty()) {
                return str2;
            }
        }
        return "voice_instructions_unitless.zip";
    }
}
