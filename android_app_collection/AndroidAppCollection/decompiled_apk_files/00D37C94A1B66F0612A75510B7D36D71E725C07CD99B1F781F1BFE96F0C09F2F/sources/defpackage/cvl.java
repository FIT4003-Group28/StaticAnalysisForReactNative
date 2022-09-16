package defpackage;
/* compiled from: PG */
/* renamed from: cvl  reason: default package */
/* loaded from: classes3.dex */
public final class cvl {
    public volatile boolean a;

    public static cvl a() {
        return new cvl();
    }

    public final void b() {
        if (!this.a) {
            return;
        }
        throw new IllegalStateException("Already released");
    }
}
