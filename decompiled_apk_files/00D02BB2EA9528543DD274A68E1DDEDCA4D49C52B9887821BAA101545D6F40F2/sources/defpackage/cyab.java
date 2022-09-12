package defpackage;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: cyab  reason: default package */
/* loaded from: classes5.dex */
public final class cyab extends cyac {
    public final Random a = new Random();
    private final AtomicLong c = new AtomicLong(1);
    public final AtomicLong b = new AtomicLong(1);

    @Override // defpackage.cyac
    public final long a() {
        return this.c.getAndIncrement();
    }
}
