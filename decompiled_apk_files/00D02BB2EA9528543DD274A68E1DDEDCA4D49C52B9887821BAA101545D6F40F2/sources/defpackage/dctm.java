package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dctm  reason: default package */
/* loaded from: classes.dex */
public final class dctm extends dctg {
    public static final dctm a = new dctm();

    private dctm() {
    }

    @Override // defpackage.dctg
    public final long a() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public final String toString() {
        return "Default millisecond precision clock";
    }
}
