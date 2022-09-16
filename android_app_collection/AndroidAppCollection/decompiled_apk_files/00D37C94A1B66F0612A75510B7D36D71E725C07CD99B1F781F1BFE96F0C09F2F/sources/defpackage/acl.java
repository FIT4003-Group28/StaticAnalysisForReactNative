package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: acl  reason: default package */
/* loaded from: classes.dex */
public final class acl extends acx {
    public static final Executor a = new qrj(1);
    private static volatile acl c;
    public final acx b;
    private final acx d;

    private acl() {
        acm acmVar = new acm();
        this.d = acmVar;
        this.b = acmVar;
    }

    public static acl a() {
        if (c != null) {
            return c;
        }
        synchronized (acl.class) {
            if (c == null) {
                c = new acl();
            }
        }
        return c;
    }

    public final boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
