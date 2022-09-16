package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
/* compiled from: PG */
/* renamed from: akvu  reason: default package */
/* loaded from: classes.dex */
public final class akvu {
    public final akwh a;
    public aopa b;

    public akvu(akwh akwhVar) {
        this.a = akwhVar;
    }

    public static void b(akwh akwhVar, azqb azqbVar) {
        aphf aphfVar;
        int i = akvp.a;
        List<File> d = akpq.d(akwhVar, akwi.ANR);
        File file = new File(akwhVar.b.getCacheDir(), akwi.ANR.d);
        try {
            if (file.exists()) {
                d.add(file);
            }
        } catch (SecurityException e) {
            akpq.f(String.format("AnrJV2 !v1journal '%s'", file), e);
        }
        for (File file2 : d) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file2);
                aphfVar = (aphf) aopi.parseFrom(aphf.a, fileInputStream, aoos.b());
                fileInputStream.close();
            } catch (Exception e2) {
                akpq.f(String.format("AnrJV2 !read '%s'", file2), e2);
                aphfVar = null;
            }
            if (aphfVar != null) {
                String.valueOf(String.valueOf(aphfVar)).length();
                arrf a = arrh.a();
                a.copyOnWrite();
                ((arrh) a.instance).bX(aphfVar);
                ((acrr) azqbVar.get()).c((arrh) a.mo39build());
            }
            akpq.e(file2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(Thread thread) {
        StackTraceElement[] stackTrace;
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
            if (sb.length() + stackTraceElement.toString().length() > 2000) {
                break;
            }
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.b = null;
        akpq.e(akpq.h(this.a));
    }
}
