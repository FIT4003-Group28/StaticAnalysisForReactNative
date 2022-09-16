package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: aaca  reason: default package */
/* loaded from: classes.dex */
public final class aaca {
    public final aacb a;
    public boolean b;
    private final aabw e;
    final aypf d = new aypf();
    public final AtomicBoolean c = new AtomicBoolean(false);

    public aaca(aabw aabwVar, aacb aacbVar) {
        this.e = aabwVar;
        this.a = aacbVar;
    }

    public final void a(boolean z, int i) {
        if (this.c.compareAndSet(false, true)) {
            this.b = z;
            if (z) {
                this.a.a = i;
                this.d.d(this.e.a().v(new aabz(this)).S(new aabz(this, 1)));
                return;
            }
            this.e.b(false);
        }
    }
}
