package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: afwx  reason: default package */
/* loaded from: classes.dex */
public final class afwx {
    static final long a;
    static final yjn b;
    public final yjs c;

    static {
        long seconds = TimeUnit.MINUTES.toSeconds(10L);
        a = seconds;
        TimeUnit.MINUTES.toSeconds(30L);
        b = new yjn(1, (int) seconds);
    }

    public afwx(yjs yjsVar) {
        this.c = yjsVar;
    }
}
