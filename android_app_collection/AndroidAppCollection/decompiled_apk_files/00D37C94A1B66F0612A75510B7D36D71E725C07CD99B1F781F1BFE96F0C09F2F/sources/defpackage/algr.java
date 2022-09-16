package defpackage;
/* compiled from: PG */
/* renamed from: algr  reason: default package */
/* loaded from: classes.dex */
public final class algr {
    public volatile boolean a = false;

    public final boolean a() {
        boolean z;
        synchronized (this) {
            z = this.a;
        }
        return z;
    }
}
