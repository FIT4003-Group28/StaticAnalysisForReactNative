package defpackage;

import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: dyku  reason: default package */
/* loaded from: classes6.dex */
final class dyku implements dyqi {
    private final AtomicLong a = new AtomicLong();

    @Override // defpackage.dyqi
    public final void a() {
        this.a.getAndAdd(1L);
    }
}
