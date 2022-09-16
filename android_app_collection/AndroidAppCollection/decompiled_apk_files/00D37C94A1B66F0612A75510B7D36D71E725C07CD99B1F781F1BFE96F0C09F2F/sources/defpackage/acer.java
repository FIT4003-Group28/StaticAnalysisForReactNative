package defpackage;

import java.lang.Thread;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acer  reason: default package */
/* loaded from: classes.dex */
public final class acer {
    public final Thread.UncaughtExceptionHandler a = new aceq(this);
    public boolean b;
    public Thread c;
    public Thread.UncaughtExceptionHandler d;
    final /* synthetic */ aces e;

    public acer(aces acesVar) {
        this.e = acesVar;
    }

    public final void a() {
        Thread thread = this.c;
        if (thread != null) {
            thread.setUncaughtExceptionHandler(this.d);
            this.d = null;
            this.c = null;
        }
    }
}
