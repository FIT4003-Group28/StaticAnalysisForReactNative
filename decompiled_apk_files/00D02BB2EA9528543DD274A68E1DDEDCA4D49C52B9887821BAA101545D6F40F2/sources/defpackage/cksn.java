package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: cksn  reason: default package */
/* loaded from: classes4.dex */
public final class cksn {
    public final bvrb a;
    public final File b;
    public final File c;
    private final AtomicInteger d = new AtomicInteger(0);

    public cksn(File file, cqat cqatVar, bvrb bvrbVar) {
        this.b = file;
        this.a = bvrbVar;
        long b = cqatVar.b();
        StringBuilder sb = new StringBuilder(24);
        sb.append("tts-");
        sb.append(b);
        File file2 = new File(file, sb.toString());
        this.c = file2;
        file2.mkdir();
    }

    public final File a() {
        return new File(this.c, String.valueOf(this.d.getAndIncrement()));
    }
}
