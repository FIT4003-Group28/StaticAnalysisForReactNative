package defpackage;

import android.text.TextUtils;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: byv  reason: default package */
/* loaded from: classes.dex */
public final class byv {
    public byz a = byz.b;
    public String b;
    private final boolean c;
    private int d;
    private int e;

    public byv(boolean z) {
        this.c = z;
    }

    public final bza a() {
        if (TextUtils.isEmpty(this.b)) {
            String valueOf = String.valueOf(this.b);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Name must be non-null and non-empty, but given: ".concat(valueOf) : new String("Name must be non-null and non-empty, but given: "));
        }
        return new bza(new ThreadPoolExecutor(this.d, this.e, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new byx(this.b, this.c)));
    }

    public final void b(int i) {
        this.d = i;
        this.e = i;
    }
}
