package defpackage;

import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: byx  reason: default package */
/* loaded from: classes.dex */
public final class byx implements ThreadFactory {
    final boolean a;
    private final String b;
    private int c;

    public byx(String str, boolean z) {
        this.b = str;
        this.a = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final synchronized Thread newThread(Runnable runnable) {
        byw bywVar;
        String str = this.b;
        int i = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25);
        sb.append("glide-");
        sb.append(str);
        sb.append("-thread-");
        sb.append(i);
        bywVar = new byw(this, runnable, sb.toString());
        this.c++;
        return bywVar;
    }
}
