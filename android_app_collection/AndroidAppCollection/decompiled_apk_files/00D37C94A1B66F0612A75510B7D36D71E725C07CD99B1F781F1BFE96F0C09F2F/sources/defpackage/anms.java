package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: anms  reason: default package */
/* loaded from: classes.dex */
public final class anms {
    private final anrf a;

    private anms(anrf anrfVar) {
        this.a = anrfVar;
    }

    public static final anms a(anrf anrfVar) {
        if (anrfVar == null || anrfVar.c.size() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new anms(anrfVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[Catch: aopx -> 0x00ae, TryCatch #2 {aopx -> 0x00ae, blocks: (B:3:0x000e, B:4:0x0019, B:6:0x001f, B:8:0x0029, B:9:0x002b, B:13:0x0039, B:15:0x003d, B:16:0x003f, B:20:0x004a, B:22:0x004e, B:23:0x0050, B:26:0x005a, B:28:0x0064, B:29:0x0066, B:45:0x008c, B:47:0x0093, B:48:0x0095, B:49:0x00a1, B:50:0x00a2, B:2:0x0000), top: B:58:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093 A[Catch: aopx -> 0x00ae, TryCatch #2 {aopx -> 0x00ae, blocks: (B:3:0x000e, B:4:0x0019, B:6:0x001f, B:8:0x0029, B:9:0x002b, B:13:0x0039, B:15:0x003d, B:16:0x003f, B:20:0x004a, B:22:0x004e, B:23:0x0050, B:26:0x005a, B:28:0x0064, B:29:0x0066, B:45:0x008c, B:47:0x0093, B:48:0x0095, B:49:0x00a1, B:50:0x00a2, B:2:0x0000), top: B:58:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.anms c(defpackage.anmf r7) {
        /*
            java.io.InputStream r0 = r7.a     // Catch: java.lang.Throwable -> La7
            aoos r1 = defpackage.aoos.a()     // Catch: java.lang.Throwable -> La7
            anrf r2 = defpackage.anrf.a     // Catch: java.lang.Throwable -> La7
            aopi r0 = defpackage.aopi.parseFrom(r2, r0, r1)     // Catch: java.lang.Throwable -> La7
            anrf r0 = (defpackage.anrf) r0     // Catch: java.lang.Throwable -> La7
            java.io.InputStream r7 = r7.a     // Catch: defpackage.aopx -> Lae
            r7.close()     // Catch: defpackage.aopx -> Lae
            aopu r7 = r0.c     // Catch: defpackage.aopx -> Lae
            java.util.Iterator r7 = r7.iterator()     // Catch: defpackage.aopx -> Lae
        L19:
            boolean r1 = r7.hasNext()     // Catch: defpackage.aopx -> Lae
            if (r1 == 0) goto La2
            java.lang.Object r1 = r7.next()     // Catch: defpackage.aopx -> Lae
            anre r1 = (defpackage.anre) r1     // Catch: defpackage.aopx -> Lae
            anrb r2 = r1.b     // Catch: defpackage.aopx -> Lae
            if (r2 != 0) goto L2b
            anrb r2 = defpackage.anrb.a     // Catch: defpackage.aopx -> Lae
        L2b:
            int r2 = r2.d     // Catch: defpackage.aopx -> Lae
            int r2 = defpackage.answ.j(r2)     // Catch: defpackage.aopx -> Lae
            r3 = 4
            r4 = 3
            r5 = 2
            if (r2 != 0) goto L37
            goto L39
        L37:
            if (r2 == r5) goto L5a
        L39:
            anrb r2 = r1.b     // Catch: defpackage.aopx -> Lae
            if (r2 != 0) goto L3f
            anrb r2 = defpackage.anrb.a     // Catch: defpackage.aopx -> Lae
        L3f:
            int r2 = r2.d     // Catch: defpackage.aopx -> Lae
            int r2 = defpackage.answ.j(r2)     // Catch: defpackage.aopx -> Lae
            if (r2 != 0) goto L48
            goto L4a
        L48:
            if (r2 == r4) goto L5a
        L4a:
            anrb r2 = r1.b     // Catch: defpackage.aopx -> Lae
            if (r2 != 0) goto L50
            anrb r2 = defpackage.anrb.a     // Catch: defpackage.aopx -> Lae
        L50:
            int r2 = r2.d     // Catch: defpackage.aopx -> Lae
            int r2 = defpackage.answ.j(r2)     // Catch: defpackage.aopx -> Lae
            if (r2 == 0) goto L19
            if (r2 != r3) goto L19
        L5a:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch: defpackage.aopx -> Lae
            java.lang.String r0 = "keyset contains key material of type %s for type url %s"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch: defpackage.aopx -> Lae
            anrb r6 = r1.b     // Catch: defpackage.aopx -> Lae
            if (r6 != 0) goto L66
            anrb r6 = defpackage.anrb.a     // Catch: defpackage.aopx -> Lae
        L66:
            int r6 = r6.d     // Catch: defpackage.aopx -> Lae
            int r6 = defpackage.answ.j(r6)     // Catch: defpackage.aopx -> Lae
            if (r6 != 0) goto L6f
            goto L7b
        L6f:
            if (r6 == r5) goto L8a
            if (r6 == r4) goto L87
            if (r6 == r3) goto L84
            r3 = 5
            if (r6 == r3) goto L81
            r3 = 6
            if (r6 == r3) goto L7e
        L7b:
            java.lang.String r3 = "UNRECOGNIZED"
            goto L8c
        L7e:
            java.lang.String r3 = "REMOTE"
            goto L8c
        L81:
            java.lang.String r3 = "ASYMMETRIC_PUBLIC"
            goto L8c
        L84:
            java.lang.String r3 = "ASYMMETRIC_PRIVATE"
            goto L8c
        L87:
            java.lang.String r3 = "SYMMETRIC"
            goto L8c
        L8a:
            java.lang.String r3 = "UNKNOWN_KEYMATERIAL"
        L8c:
            r4 = 0
            r2[r4] = r3     // Catch: defpackage.aopx -> Lae
            anrb r1 = r1.b     // Catch: defpackage.aopx -> Lae
            if (r1 != 0) goto L95
            anrb r1 = defpackage.anrb.a     // Catch: defpackage.aopx -> Lae
        L95:
            r3 = 1
            java.lang.String r1 = r1.b     // Catch: defpackage.aopx -> Lae
            r2[r3] = r1     // Catch: defpackage.aopx -> Lae
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch: defpackage.aopx -> Lae
            r7.<init>(r0)     // Catch: defpackage.aopx -> Lae
            throw r7     // Catch: defpackage.aopx -> Lae
        La2:
            anms r7 = a(r0)     // Catch: defpackage.aopx -> Lae
            return r7
        La7:
            r0 = move-exception
            java.io.InputStream r7 = r7.a     // Catch: defpackage.aopx -> Lae
            r7.close()     // Catch: defpackage.aopx -> Lae
            throw r0     // Catch: defpackage.aopx -> Lae
        Lae:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r0 = "invalid keyset"
            r7.<init>(r0)
            goto Lb7
        Lb6:
            throw r7
        Lb7:
            goto Lb6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anms.c(anmf):anms");
    }

    public final Object b(Class cls) {
        byte[] array;
        anmz anmzVar = (anmz) annh.a.get(cls);
        Class a = anmzVar == null ? null : anmzVar.a();
        if (a == null) {
            String valueOf = String.valueOf(cls.getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "No wrapper found for ".concat(valueOf) : new String("No wrapper found for "));
        }
        anni.b(this.a);
        anmy anmyVar = new anmy(a);
        for (anre anreVar : this.a.c) {
            int i = answ.i(anreVar.c);
            if (i != 0 && i == 3) {
                anrb anrbVar = anreVar.b;
                if (anrbVar == null) {
                    anrbVar = anrb.a;
                }
                Object c = annh.c(anrbVar, a);
                int i2 = answ.i(anreVar.c);
                if (i2 != 0 && i2 == 3) {
                    int h = answ.h(anreVar.e);
                    int i3 = 1;
                    if (h == 0) {
                        h = 1;
                    }
                    int i4 = h - 2;
                    if (i4 == 1) {
                        array = ByteBuffer.allocate(5).put((byte) 1).putInt(anreVar.d).array();
                    } else {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                array = anmh.a;
                            } else if (i4 != 4) {
                                throw new GeneralSecurityException("unknown output prefix type");
                            }
                        }
                        array = ByteBuffer.allocate(5).put((byte) 0).putInt(anreVar.d).array();
                    }
                    int i5 = answ.i(anreVar.c);
                    if (i5 == 0) {
                        i5 = 1;
                    }
                    int h2 = answ.h(anreVar.e);
                    if (h2 != 0) {
                        i3 = h2;
                    }
                    int i6 = anreVar.d;
                    anmw anmwVar = new anmw(c, array, i5, i3);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(anmwVar);
                    anmx anmxVar = new anmx(anmwVar.a());
                    List list = (List) anmyVar.a.put(anmxVar, Collections.unmodifiableList(arrayList));
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(list);
                        arrayList2.add(anmwVar);
                        anmyVar.a.put(anmxVar, Collections.unmodifiableList(arrayList2));
                    }
                    if (anreVar.d != this.a.b) {
                        continue;
                    } else if (anmwVar.b == 3) {
                        if (!anmyVar.a(anmwVar.a()).isEmpty()) {
                            anmyVar.b = anmwVar;
                        } else {
                            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
                        }
                    } else {
                        throw new IllegalArgumentException("the primary entry has to be ENABLED");
                    }
                } else {
                    throw new GeneralSecurityException("only ENABLED key is allowed");
                }
            }
        }
        anmz anmzVar2 = (anmz) annh.a.get(cls);
        if (anmzVar2 == null) {
            String valueOf2 = String.valueOf(anmyVar.c.getName());
            throw new GeneralSecurityException(valueOf2.length() != 0 ? "No wrapper found for ".concat(valueOf2) : new String("No wrapper found for "));
        } else if (!anmzVar2.a().equals(anmyVar.c)) {
            String valueOf3 = String.valueOf(anmzVar2.a());
            String valueOf4 = String.valueOf(anmyVar.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 44 + String.valueOf(valueOf4).length());
            sb.append("Wrong input primitive class, expected ");
            sb.append(valueOf3);
            sb.append(", got ");
            sb.append(valueOf4);
            throw new GeneralSecurityException(sb.toString());
        } else {
            return anmzVar2.c(anmyVar);
        }
    }

    public final String toString() {
        return anni.a(this.a).toString();
    }
}
