package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: afcl  reason: default package */
/* loaded from: classes2.dex */
public final class afcl implements afeb {
    static final afcf a = new afbt();
    static final afcf b = new afcg();
    static final afby c = new afci();
    static final afby d = new afch();
    static final afby e = new afbv();
    static final afby f = new afce();
    static final afby g = new afck();
    static final afcf h = new afbu();
    static final afcf i = new afbx();
    static final afcf j = new afcc();
    static final afcf k = new afbs();
    static final afcf l = new afcb();
    static final afcf m = new afbr();
    static final afcf n = new afca();
    private final bvjj o;
    private final dxio<akfa> p;
    private final dxio<btwr> q;
    private final dxio<afei> r;

    public afcl(bvjj bvjjVar, dxio<akfa> dxioVar, dxio<btwr> dxioVar2, dxio<afei> dxioVar3) {
        this.o = bvjjVar;
        this.p = dxioVar;
        this.q = dxioVar2;
        this.r = dxioVar3;
    }

    static void a(afcj afcjVar, afcf[] afcfVarArr, afei afeiVar) {
        int i2 = 0;
        boolean z = true;
        if (afcjVar.f() != 1) {
            z = false;
        }
        dbsk.l(z);
        int length = afcfVarArr.length - 1;
        while (i2 >= 0 && i2 <= length) {
            afeiVar.b();
            afcf afcfVar = afcfVarArr[i2];
            i(afcfVar);
            if (afcfVar instanceof afby) {
                b(afcjVar, (afby) afcfVar, afcjVar.a);
            } else if (!afcfVar.a(afcjVar)) {
                afcjVar.g(afcfVar);
            }
            i2 += afcjVar.b();
        }
    }

    static void b(afcj afcjVar, afby afbyVar, @dzsi File[] fileArr) {
        if (fileArr != null) {
            int length = fileArr.length - 1;
            int i2 = afcjVar.f() == 1 ? 0 : length;
            afbz afbzVar = afcjVar.b;
            while (i2 >= 0 && i2 <= length) {
                afbz afbzVar2 = new afbz(fileArr, i2);
                afcjVar.b = afbzVar2;
                File a2 = afbzVar2.a();
                if (a2 == null) {
                    i(afbyVar);
                } else {
                    String name = a2.getName();
                    if (!afdx.a.contains(name)) {
                        dcdc<Pattern> dcdcVar = afdx.b;
                        int size = dcdcVar.size();
                        int i3 = 0;
                        while (i3 < size) {
                            int i4 = i3 + 1;
                            if (!dcdcVar.get(i3).matcher(name).matches()) {
                                i3 = i4;
                            }
                        }
                        if (!a2.exists()) {
                            i(afbyVar);
                            a2.getAbsolutePath();
                        } else if (a2.isDirectory()) {
                            i(afbyVar);
                            a2.getAbsolutePath();
                            b(afcjVar, afbyVar, a2.listFiles());
                        } else if (name.startsWith("in3-")) {
                            i(afbyVar);
                            a2.getAbsolutePath();
                            a2.delete();
                        } else {
                            i(afbyVar);
                            a2.getAbsolutePath();
                            if (!afbyVar.a(afcjVar)) {
                                afcjVar.g(afbyVar);
                            }
                        }
                    }
                    i(afbyVar);
                    a2.getAbsolutePath();
                    break;
                }
                i2 += afcjVar.b();
            }
            afcjVar.b = afbzVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(afbz afbzVar) {
        File a2 = afbzVar.a();
        boolean z = true;
        if (a2 == null) {
            return true;
        }
        if (a2.exists() && !a2.delete()) {
            z = false;
        }
        if (z) {
            a2.getName();
            afbzVar.b(null);
            return z;
        }
        try {
            File createTempFile = File.createTempFile("in3-", "", a2.getParentFile());
            createTempFile.delete();
            return f(afbzVar, createTempFile.getName());
        } catch (IOException e2) {
            String valueOf = String.valueOf(a2.getName());
            new IOException(valueOf.length() != 0 ? "Failed deleteEventually on file: ".concat(valueOf) : new String("Failed deleteEventually on file: "), e2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(afbz afbzVar, String str) {
        File a2 = afbzVar.a();
        if (a2 == null) {
            return true;
        }
        String name = a2.getName();
        if (name.startsWith(str)) {
            return false;
        }
        String valueOf = String.valueOf(name);
        return f(afbzVar, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(afbz afbzVar, String str) {
        File a2 = afbzVar.a();
        if (a2 == null) {
            return true;
        }
        String name = a2.getName();
        if (name.startsWith(str)) {
            return f(afbzVar, name.substring(str.length()));
        }
        return false;
    }

    static boolean f(afbz afbzVar, String str) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean renameTo;
        File a2 = afbzVar.a();
        if (a2 == null) {
            return true;
        }
        File file = new File(a2.getParentFile(), str);
        File a3 = afbzVar.a();
        if (a3 == null) {
            return true;
        }
        boolean exists = a3.exists();
        boolean exists2 = file.exists();
        if (!exists) {
            z = !exists2;
            if (z) {
                afbzVar.b(file);
            }
            z2 = true;
            i2 = 0;
            i3 = 0;
        } else {
            int[] iArr = {10, 50, 100};
            boolean z3 = false;
            int i4 = 0;
            i2 = 0;
            i3 = 0;
            for (int i5 = 3; i4 < i5; i5 = 3) {
                int i6 = iArr[i4];
                String name = file.getName();
                File a4 = afbzVar.a();
                if (a4 == null) {
                    renameTo = true;
                } else {
                    File file2 = new File(a4.getParentFile(), name);
                    renameTo = a4.renameTo(file2);
                    if (renameTo) {
                        afbzVar.b(file2);
                    }
                }
                if (!renameTo) {
                    try {
                        Thread.sleep(i6);
                        i2++;
                        i3 += i6;
                        i4++;
                        z3 = renameTo;
                    } catch (InterruptedException unused) {
                    }
                }
                z = renameTo;
                break;
            }
            z = z3;
            z2 = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        a3.getName();
        file.getName();
        Integer valueOf2 = Integer.valueOf(i3);
        if (z == file.exists() && i2 == 0) {
            if (!z2) {
                return z;
            }
            i2 = 0;
        }
        g(new bvon("Incognito Operation TRAP renameTo success:%s    from:%s existed_before:%s exists_after:%s    to:%s existed_before:%s exists_after:%s    %d retries, slept %dms", valueOf, a3.getName(), Boolean.valueOf(exists), Boolean.valueOf(a3.exists()), file.getName(), Boolean.valueOf(exists2), Boolean.valueOf(file.exists()), Integer.valueOf(i2), valueOf2));
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(Exception exc) {
        exc.getMessage();
        bvoo.j(exc);
    }

    private static void i(afcf afcfVar) {
        afcfVar.toString().indexOf("IncognitoStateChangerImpl");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e9, code lost:
        if (r4.c == r10) goto L67;
     */
    @Override // defpackage.afeb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(android.content.Context r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afcl.h(android.content.Context, boolean):int");
    }
}
