package defpackage;

import java.util.Random;
/* compiled from: PG */
/* renamed from: rhr  reason: default package */
/* loaded from: classes7.dex */
public final class rhr {
    private final cqat a;
    private final Random b;

    public rhr(cqat cqatVar, Random random) {
        this.a = cqatVar;
        this.b = random;
    }

    public final String a() {
        String valueOf = String.valueOf(String.format("%010X", Long.valueOf(this.a.b() - 1382659200000L)));
        String valueOf2 = String.valueOf(String.format("%06X", Integer.valueOf(this.b.nextInt(16777215) + 1)));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }
}
