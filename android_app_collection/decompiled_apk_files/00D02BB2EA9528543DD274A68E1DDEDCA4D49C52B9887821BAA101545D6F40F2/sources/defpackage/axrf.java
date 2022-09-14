package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: axrf  reason: default package */
/* loaded from: classes.dex */
public final class axrf {
    private final AtomicBoolean a = new AtomicBoolean();

    public final boolean a() {
        return this.a.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(boolean z) {
        this.a.set(z);
    }
}
