package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: rkv  reason: default package */
/* loaded from: classes4.dex */
final class rkv implements Runnable {
    private final rku a;
    private final int b;
    private final Throwable c;
    private final byte[] d;
    private final String e;
    private final Map f;

    public rkv(String str, rku rkuVar, int i, Throwable th, byte[] bArr, Map map) {
        qnm.b(rkuVar);
        this.a = rkuVar;
        this.b = i;
        this.c = th;
        this.d = bArr;
        this.e = str;
        this.f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.e, this.b, this.c, this.d, this.f);
    }
}
