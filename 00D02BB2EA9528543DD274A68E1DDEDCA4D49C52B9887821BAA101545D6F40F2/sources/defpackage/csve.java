package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: csve  reason: default package */
/* loaded from: classes5.dex */
public final class csve implements dyey {
    public static final dyhs<String> a = dyhs.d("X-Goog-Api-Key", dyhw.b);
    public static final dyhs<String> b = dyhs.d("X-Android-Cert", dyhw.b);
    public static final dyhs<String> c = dyhs.d("X-Android-Package", dyhw.b);
    public final dbty<String> d;
    public final dbty<String> e;
    public final aqan f;

    public csve(aqan aqanVar, final Context context) {
        this.d = dbud.a(new dbty(context) { // from class: csvb
            private final Context a;

            {
                this.a = context;
            }

            @Override // defpackage.dbty
            public final Object a() {
                Context context2 = this.a;
                dyhs<String> dyhsVar = csve.a;
                return context2.getPackageName();
            }
        });
        this.e = dbud.a(new dbty(this, context) { // from class: csvc
            private final csve a;
            private final Context b;

            {
                this.a = this;
                this.b = context;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[Catch: NameNotFoundException -> 0x0063, TryCatch #0 {NameNotFoundException -> 0x0063, blocks: (B:3:0x0005, B:5:0x001c, B:7:0x0022, B:10:0x0029, B:14:0x003a, B:16:0x0044, B:17:0x005f), top: B:20:0x0005 }] */
            @Override // defpackage.dbty
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    r7 = this;
                    csve r0 = r7.a
                    android.content.Context r1 = r7.b
                    r2 = 0
                    dbty<java.lang.String> r0 = r0.d     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                    java.lang.Object r0 = r0.a()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                    java.lang.String r0 = (java.lang.String) r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                    android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                    r3 = 64
                    android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                    android.content.pm.Signature[] r1 = r0.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                    r3 = 0
                    if (r1 == 0) goto L36
                    android.content.pm.Signature[] r1 = r0.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                    int r1 = r1.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                    r4 = 1
                    if (r1 != r4) goto L36
                    java.security.MessageDigest r1 = defpackage.csva.a()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                    if (r1 != 0) goto L29
                    goto L36
                L29:
                    android.content.pm.Signature[] r0 = r0.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                    r0 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                    byte[] r0 = r0.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                    byte[] r0 = r1.digest(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                    goto L37
                L36:
                    r0 = r2
                L37:
                    if (r0 != 0) goto L3a
                    goto L63
                L3a:
                    int r1 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                    int r5 = r1 + r1
                    r4.<init>(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                L42:
                    if (r3 >= r1) goto L5f
                    char[] r5 = defpackage.csvt.a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                    r6 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                    r6 = r6 & 240(0xf0, float:3.36E-43)
                    int r6 = r6 >>> 4
                    char r5 = r5[r6]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                    r4.append(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                    char[] r5 = defpackage.csvt.a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                    r6 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                    r6 = r6 & 15
                    char r5 = r5[r6]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                    r4.append(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                    int r3 = r3 + 1
                    goto L42
                L5f:
                    java.lang.String r2 = r4.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
                L63:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.csvc.a():java.lang.Object");
            }
        });
        this.f = aqanVar;
    }

    @Override // defpackage.dyey
    public final <ReqT, RespT> dyex<ReqT, RespT> a(dyib<ReqT, RespT> dyibVar, dyet dyetVar, dyeu dyeuVar) {
        return new csvd(this, dyeuVar.a(dyibVar, dyetVar));
    }
}
