package defpackage;

import java.util.Random;
/* compiled from: PG */
/* renamed from: csnj  reason: default package */
/* loaded from: classes5.dex */
public final class csnj {
    private final Random a = new Random();

    public final boolean a(long j) {
        return j > 0 && j <= 2147483647L && this.a.nextInt((int) j) == 0;
    }
}
