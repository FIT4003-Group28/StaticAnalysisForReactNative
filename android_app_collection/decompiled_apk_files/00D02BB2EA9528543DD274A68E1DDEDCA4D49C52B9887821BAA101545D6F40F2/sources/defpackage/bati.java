package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: bati  reason: default package */
/* loaded from: classes3.dex */
public final class bati {
    public final AtomicBoolean a = new AtomicBoolean(false);

    public final void a() {
        this.a.set(false);
    }

    public final void b() {
        if (!this.a.get()) {
            return;
        }
        throw new batj();
    }
}
