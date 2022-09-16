package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: ancr  reason: default package */
/* loaded from: classes.dex */
public final class ancr extends ancv {
    public static final ancr a = new ancr(ancx.a);
    public final AtomicReference b;

    public ancr(ancv ancvVar) {
        this.b = new AtomicReference(ancvVar);
    }

    @Override // defpackage.ancv
    public final anbj a() {
        return ((ancv) this.b.get()).a();
    }

    @Override // defpackage.ancv
    public final andd b() {
        return ((ancv) this.b.get()).b();
    }

    @Override // defpackage.ancv
    public final void c(String str, Level level, boolean z) {
        ((ancv) this.b.get()).c(str, level, z);
    }
}
