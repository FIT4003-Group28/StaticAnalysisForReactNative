package defpackage;

import android.os.Looper;
/* compiled from: PG */
/* renamed from: anai  reason: default package */
/* loaded from: classes.dex */
public final class anai {
    public static final anai c = new anai(Looper.getMainLooper().getThread(), "Not on the main thread");
    public final Thread a;
    public final String b;

    private anai(Thread thread, String str) {
        this.a = thread;
        this.b = str;
    }
}
