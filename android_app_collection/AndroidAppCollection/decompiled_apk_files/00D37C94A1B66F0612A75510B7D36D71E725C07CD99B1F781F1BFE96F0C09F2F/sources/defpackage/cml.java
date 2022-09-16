package defpackage;

import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: cml  reason: default package */
/* loaded from: classes2.dex */
public final class cml implements ThreadFactory {
    final boolean a;
    private final String b;
    private int c;

    public cml(String str, boolean z) {
        this.b = str;
        this.a = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final synchronized Thread newThread(Runnable runnable) {
        cmk cmkVar;
        String str = this.b;
        int i = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25);
        sb.append("glide-");
        sb.append(str);
        sb.append("-thread-");
        sb.append(i);
        cmkVar = new cmk(this, runnable, sb.toString());
        this.c++;
        return cmkVar;
    }
}
