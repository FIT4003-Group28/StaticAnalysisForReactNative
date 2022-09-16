package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: anhe  reason: default package */
/* loaded from: classes.dex */
public class anhe {
    private static aopa a(Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        aopa createBuilder = angk.a.createBuilder();
        String name = th.getClass().getName();
        createBuilder.copyOnWrite();
        angk angkVar = (angk) createBuilder.instance;
        name.getClass();
        angkVar.b |= 1;
        angkVar.c = name;
        if (th.getMessage() != null) {
            String message = th.getMessage();
            createBuilder.copyOnWrite();
            angk angkVar2 = (angk) createBuilder.instance;
            message.getClass();
            angkVar2.b |= 2;
            angkVar2.d = message;
        }
        try {
            stackTraceElementArr = th.getStackTrace();
        } catch (NullPointerException unused) {
            stackTraceElementArr = null;
        }
        if (stackTraceElementArr != null) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                aopa createBuilder2 = angj.a.createBuilder();
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    createBuilder2.copyOnWrite();
                    angj angjVar = (angj) createBuilder2.instance;
                    className.getClass();
                    angjVar.b |= 1;
                    angjVar.c = className;
                    String methodName = stackTraceElement.getMethodName();
                    createBuilder2.copyOnWrite();
                    angj angjVar2 = (angj) createBuilder2.instance;
                    methodName.getClass();
                    angjVar2.b |= 2;
                    angjVar2.d = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    createBuilder2.copyOnWrite();
                    angj angjVar3 = (angj) createBuilder2.instance;
                    angjVar3.b |= 8;
                    angjVar3.f = lineNumber;
                    if (stackTraceElement.getFileName() != null) {
                        String fileName = stackTraceElement.getFileName();
                        createBuilder2.copyOnWrite();
                        angj angjVar4 = (angj) createBuilder2.instance;
                        fileName.getClass();
                        angjVar4.b |= 4;
                        angjVar4.e = fileName;
                    }
                }
                createBuilder.copyOnWrite();
                angk angkVar3 = (angk) createBuilder.instance;
                angj angjVar5 = (angj) createBuilder2.mo39build();
                angjVar5.getClass();
                aopu aopuVar = angkVar3.f;
                if (!aopuVar.c()) {
                    angkVar3.f = aopi.mutableCopy(aopuVar);
                }
                angkVar3.f.add(angjVar5);
            }
        }
        return createBuilder;
    }

    public static aopa c(Throwable th) {
        aopa createBuilder = angl.a.createBuilder();
        aopa a = a(th);
        createBuilder.copyOnWrite();
        angl anglVar = (angl) createBuilder.instance;
        angk angkVar = (angk) a.mo39build();
        angkVar.getClass();
        anglVar.c = angkVar;
        anglVar.b |= 1;
        while (th.getCause() != null) {
            aopa a2 = a(th.getCause());
            createBuilder.copyOnWrite();
            angl anglVar2 = (angl) createBuilder.instance;
            angk angkVar2 = (angk) a2.mo39build();
            angkVar2.getClass();
            anglVar2.a();
            anglVar2.d.add(angkVar2);
            th = th.getCause();
        }
        return createBuilder;
    }

    public static int d(int i) {
        if (i != 45) {
            switch (i) {
                case 0:
                    return 1;
                case 1:
                    return 2;
                case 2:
                    return 3;
                case 3:
                    return 4;
                case 4:
                    return 5;
                case 5:
                    return 6;
                case 6:
                    return 7;
                case 7:
                    return 8;
                case 8:
                    return 9;
                case 9:
                    return 10;
                case 10:
                    return 11;
                case 11:
                    return 12;
                case 12:
                    return 13;
                case 13:
                    return 14;
                case 14:
                    return 15;
                case 15:
                    return 16;
                case 16:
                    return 17;
                case 17:
                    return 18;
                case 18:
                    return 19;
                case 19:
                    return 20;
                case 20:
                    return 21;
                case 21:
                    return 22;
                case 22:
                    return 23;
                case 23:
                    return 24;
                case 24:
                    return 25;
                case 25:
                    return 26;
                case 26:
                    return 27;
                case 27:
                    return 28;
                case 28:
                    return 29;
                case 29:
                    return 30;
                case 30:
                    return 31;
                case 31:
                    return 32;
                case 32:
                    return 33;
                case 33:
                    return 34;
                case 34:
                    return 35;
                case 35:
                    return 36;
                case 36:
                    return 37;
                case 37:
                    return 38;
                case 38:
                    return 39;
                case 39:
                    return 40;
                case 40:
                    return 41;
                case 41:
                    return 42;
                default:
                    return 0;
            }
        }
        return 46;
    }

    public static void e(File file, File file2) {
        aqxo.w(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        anhg i = i(file);
        file2.getClass();
        amvn q = amvn.q(new aner[0]);
        anep a = anep.a();
        try {
            FileInputStream a2 = ((anes) i).a();
            a.c(a2);
            FileOutputStream e = anhc.e(file2, q);
            a.c(e);
            anek.g(a2, e);
        } finally {
        }
    }

    public static void f(File file) {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        String valueOf = String.valueOf(file);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("Unable to create parent directories of ");
        sb.append(valueOf);
        throw new IOException(sb.toString());
    }

    public static void g(byte[] bArr, File file) {
        file.getClass();
        anhc.d(bArr, file, amvn.q(new aner[0]));
    }

    public static byte[] h(File file) {
        return i(file).b();
    }

    public static anhg i(File file) {
        return new anes(file);
    }

    public static anhh j(File file, Charset charset) {
        return new aneh(i(file), charset, null, null);
    }

    public void b(int i) {
        throw null;
    }
}
