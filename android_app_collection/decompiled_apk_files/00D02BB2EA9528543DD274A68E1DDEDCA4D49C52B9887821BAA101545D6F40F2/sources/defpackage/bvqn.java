package defpackage;

import android.os.Process;
/* compiled from: PG */
/* renamed from: bvqn  reason: default package */
/* loaded from: classes.dex */
final class bvqn implements Runnable {
    final /* synthetic */ bvrj a;
    final /* synthetic */ String b;
    final /* synthetic */ Runnable c;

    public bvqn(bvrj bvrjVar, String str, Runnable runnable) {
        this.a = bvrjVar;
        this.b = str;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a.J;
        try {
            Process.setThreadPriority(i);
        } catch (SecurityException unused) {
            String str = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 60);
            sb.append("Hey, you don't have permission to set thread ");
            sb.append(str);
            sb.append(" to ");
            sb.append(i);
            bvqq.a(sb.toString());
        }
        this.c.run();
    }
}
