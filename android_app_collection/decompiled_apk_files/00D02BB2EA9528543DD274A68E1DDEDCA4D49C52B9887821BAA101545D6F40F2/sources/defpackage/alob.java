package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: alob  reason: default package */
/* loaded from: classes.dex */
final class alob {
    public final Object a = new Object();
    public final List<Runnable> b = new ArrayList();
    public final List<Runnable> c = new ArrayList();
    public final aktt d = new aloa(this);

    public final void a(Runnable runnable) {
        synchronized (this.a) {
            this.b.add(runnable);
        }
    }
}
