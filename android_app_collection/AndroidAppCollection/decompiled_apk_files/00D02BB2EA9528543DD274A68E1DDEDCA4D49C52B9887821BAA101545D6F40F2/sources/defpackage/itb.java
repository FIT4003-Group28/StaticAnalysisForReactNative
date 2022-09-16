package defpackage;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: itb  reason: default package */
/* loaded from: classes.dex */
public class itb {
    final AtomicBoolean l = new AtomicBoolean(false);
    final AtomicBoolean m = new AtomicBoolean(false);
    final AtomicBoolean n = new AtomicBoolean(false);

    public final void A(boolean z) {
        this.n.set(z);
    }

    public void Ns() {
        this.l.set(true);
    }

    public void Nt() {
        this.m.set(true);
    }

    public void Nu() {
        this.l.set(false);
        this.m.set(false);
        this.n.set(false);
    }

    public void PX() {
        this.n.set(true);
    }

    public void PY() {
        this.n.set(false);
    }

    public void Po() {
        this.m.set(false);
    }

    public void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final boolean v() {
        return this.l.get();
    }

    public final boolean w() {
        return this.m.get();
    }

    @Deprecated
    public final boolean x() {
        return this.n.get();
    }

    public final void y(boolean z) {
        this.l.set(z);
    }

    public final void z(boolean z) {
        this.m.set(z);
    }
}
