package defpackage;

import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: aydv  reason: default package */
/* loaded from: classes2.dex */
public final class aydv implements ayie {
    private final AtomicLong a = new AtomicLong();

    @Override // defpackage.ayie
    public final void a() {
        this.a.getAndAdd(1L);
    }
}
