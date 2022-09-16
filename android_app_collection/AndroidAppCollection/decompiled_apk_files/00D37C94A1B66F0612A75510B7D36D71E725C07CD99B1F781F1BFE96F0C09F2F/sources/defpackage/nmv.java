package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: nmv  reason: default package */
/* loaded from: classes3.dex */
public final class nmv {
    public final AtomicReference a = new AtomicReference();

    public final void a(nml nmlVar) {
        this.a.set(new WeakReference(nmlVar));
    }
}
