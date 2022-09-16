package defpackage;

import android.net.Uri;
import android.system.Os;
import android.system.StructStat;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vwr  reason: default package */
/* loaded from: classes4.dex */
public final class vwr {
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int a(int r17, int r18, java.lang.String r19, android.content.SharedPreferences r20, defpackage.wac r21, defpackage.wal r22, defpackage.vzm r23, defpackage.whp r24, defpackage.wea r25, defpackage.wge r26, defpackage.yni r27, defpackage.azqb r28) {
        /*
            r1 = r18
            r2 = r19
            r15 = r24
            android.content.Context r3 = r15.e
            java.lang.String r0 = "accountName must be provided"
            defpackage.qnm.m(r2, r0)
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            defpackage.qnm.i(r0)
            r0 = 8400000(0x802c80, float:1.1770907E-38)
            defpackage.qhz.g(r3, r0)
            com.google.android.gms.auth.AccountChangeEventsRequest r4 = new com.google.android.gms.auth.AccountChangeEventsRequest
            r4.<init>()
            r4.c = r2
            r14 = r17
            r4.b = r14
            defpackage.vbt.g(r3)
            boolean r0 = defpackage.axqx.b()
            if (r0 == 0) goto L6b
            boolean r0 = defpackage.qhz.i(r3)
            if (r0 == 0) goto L6b
            qie r0 = defpackage.qfl.j(r3)
            qvx r5 = defpackage.qvy.b()
            r6 = 1
            com.google.android.gms.common.Feature[] r6 = new com.google.android.gms.common.Feature[r6]
            r7 = 0
            com.google.android.gms.common.Feature r8 = defpackage.qhq.c
            r6[r7] = r8
            r5.b = r6
            qik r6 = new qik
            r6.<init>()
            r5.a = r6
            r6 = 1515(0x5eb, float:2.123E-42)
            r5.c = r6
            qvy r5 = r5.a()
            qst r0 = (defpackage.qst) r0
            rve r0 = r0.v(r5)
            java.lang.String r5 = "account change events retrieval"
            java.lang.Object r0 = defpackage.qhz.d(r0, r5)     // Catch: defpackage.qsp -> L67
            com.google.android.gms.auth.AccountChangeEventsResponse r0 = (com.google.android.gms.auth.AccountChangeEventsResponse) r0     // Catch: defpackage.qsp -> L67
            defpackage.qhz.j(r0)     // Catch: defpackage.qsp -> L67
            java.util.List r0 = r0.b     // Catch: defpackage.qsp -> L67
            goto L78
        L67:
            r0 = move-exception
            defpackage.qhz.h(r0, r5)
        L6b:
            qhw r0 = new qhw
            r0.<init>(r4)
            android.content.ComponentName r4 = defpackage.qhz.c
            java.lang.Object r0 = defpackage.qhz.c(r3, r4, r0)
            java.util.List r0 = (java.util.List) r0
        L78:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r0.size()
            r3.<init>(r4)
            int r4 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r4)
        L89:
            boolean r4 = r0.hasPrevious()
            if (r4 == 0) goto La3
            java.lang.Object r4 = r0.previous()
            com.google.android.gms.auth.AccountChangeEvent r4 = (com.google.android.gms.auth.AccountChangeEvent) r4
            r5 = -1
            if (r1 == r5) goto L9f
            int r5 = r4.b()
            if (r5 < r1) goto L9f
            goto La3
        L9f:
            r3.add(r4)
            goto L89
        La3:
            java.util.Iterator r0 = r3.iterator()
            r1 = r14
        La8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lea
            java.lang.Object r1 = r0.next()
            com.google.android.gms.auth.AccountChangeEvent r1 = (com.google.android.gms.auth.AccountChangeEvent) r1
            int r16 = r1.b()
            int r3 = r1.a()
            r4 = 3
            if (r3 != r4) goto Le3
            java.lang.String r1 = r1.c()
            r3 = r17
            r4 = r16
            r5 = r1
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r27
            r14 = r28
            a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r3 = r21
            r3.n(r1, r2)
            goto Le5
        Le3:
            r3 = r21
        Le5:
            r14 = r17
            r1 = r16
            goto La8
        Lea:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vwr.a(int, int, java.lang.String, android.content.SharedPreferences, wac, wal, vzm, whp, wea, wge, yni, azqb):int");
    }

    public static ankt b(final afvm afvmVar, final whp whpVar, Executor executor) {
        return anlz.u(new Callable() { // from class: vwp
            /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
                if (r1.d(r2) != false) goto L13;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    r5 = this;
                    afvm r0 = defpackage.afvm.this
                    whp r1 = r2
                    boolean r2 = r0 instanceof com.google.android.libraries.youtube.account.identity.AccountIdentity
                    r3 = 1
                    r4 = 0
                    if (r2 == 0) goto L2f
                    boolean r2 = r0.z()
                    if (r2 == 0) goto L11
                    goto L2f
                L11:
                    r2 = r0
                    com.google.android.libraries.youtube.account.identity.AccountIdentity r2 = (com.google.android.libraries.youtube.account.identity.AccountIdentity) r2     // Catch: java.lang.Exception -> L2f
                    java.lang.String r2 = r2.a()     // Catch: java.lang.Exception -> L2f
                    android.accounts.Account r2 = r1.b(r2)     // Catch: java.lang.Exception -> L2f
                    boolean r0 = defpackage.vwr.d(r0)     // Catch: java.lang.Exception -> L2f
                    if (r0 != 0) goto L2f
                    boolean r0 = r1.e(r2)     // Catch: java.lang.Exception -> L2f
                    if (r0 != 0) goto L30
                    boolean r0 = r1.d(r2)     // Catch: java.lang.Exception -> L2f
                    if (r0 == 0) goto L2f
                    goto L30
                L2f:
                    r3 = 0
                L30:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.vwp.call():java.lang.Object");
            }
        }, executor);
    }

    public static boolean c(afvm afvmVar) {
        if (afvmVar instanceof AccountIdentity) {
            AccountIdentity accountIdentity = (AccountIdentity) afvmVar;
            return accountIdentity.j() || accountIdentity.f();
        }
        return false;
    }

    public static boolean d(afvm afvmVar) {
        if (afvmVar instanceof AccountIdentity) {
            AccountIdentity accountIdentity = (AccountIdentity) afvmVar;
            if ((accountIdentity.j() || accountIdentity.f()) && !accountIdentity.i()) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(afvm afvmVar) {
        return (afvmVar instanceof AccountIdentity) && c(afvmVar) && ((AccountIdentity) afvmVar).l() == 3;
    }

    public static IOException f(vjb vjbVar, Uri uri, IOException iOException) {
        try {
            vkj b = vkj.b();
            b.d();
            File file = (File) vjbVar.c(uri, b);
            if (file.exists()) {
                if (file.isFile()) {
                    if (file.canRead()) {
                        if (file.canWrite()) {
                            return h(file, iOException);
                        }
                        return h(file, iOException);
                    } else if (file.canWrite()) {
                        return h(file, iOException);
                    } else {
                        return h(file, iOException);
                    }
                } else if (file.canRead()) {
                    if (file.canWrite()) {
                        return h(file, iOException);
                    }
                    return h(file, iOException);
                } else if (file.canWrite()) {
                    return h(file, iOException);
                } else {
                    return h(file, iOException);
                }
            }
            return h(file, iOException);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    private static IOException g(File file, IOException iOException) {
        String concat;
        try {
            String valueOf = String.valueOf(String.format(Locale.US, " canonical[%s] freeSpace[%d]", file.getCanonicalPath(), Long.valueOf(file.getFreeSpace())));
            concat = valueOf.length() != 0 ? "Inoperable file:".concat(valueOf) : new String("Inoperable file:");
            try {
                StructStat stat = Os.stat(file.getCanonicalPath());
                String valueOf2 = String.valueOf(concat);
                String valueOf3 = String.valueOf(String.format(Locale.US, " mode[%d]", Integer.valueOf(stat.st_mode)));
                concat = valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            concat = String.valueOf("Inoperable file:").concat(" failed");
        }
        return new IOException(concat, iOException);
    }

    private static IOException h(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return g(file, iOException);
        }
        if (parentFile.exists()) {
            if (parentFile.isDirectory()) {
                if (parentFile.canRead()) {
                    if (parentFile.canWrite()) {
                        return g(file, iOException);
                    }
                    return g(file, iOException);
                } else if (parentFile.canWrite()) {
                    return g(file, iOException);
                } else {
                    return g(file, iOException);
                }
            } else if (parentFile.canRead()) {
                if (parentFile.canWrite()) {
                    return g(file, iOException);
                }
                return g(file, iOException);
            } else if (parentFile.canWrite()) {
                return g(file, iOException);
            } else {
                return g(file, iOException);
            }
        }
        return g(file, iOException);
    }
}
