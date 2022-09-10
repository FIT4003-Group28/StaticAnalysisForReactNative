package defpackage;

import java.io.PrintWriter;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: crct  reason: default package */
/* loaded from: classes5.dex */
public final class crct implements crem {
    static final cren a = cren.MUTED;
    static final cren b = cren.UNMUTED;
    private final Set<crek> c = dcnm.c();
    private final bvjj d;
    private final Executor e;
    private boolean f;
    private cren g;
    private boolean h;

    public crct(bvjj bvjjVar, Executor executor) {
        this.d = bvjjVar;
        this.e = executor;
        this.f = bvjjVar.m(bvjk.bU, false);
        cren a2 = cren.a(bvjjVar.s(bvjk.bV, cren.UNMUTED.d));
        this.g = a2 == null ? cren.UNMUTED : a2;
    }

    private final void m(boolean z) {
        this.f = z;
        this.d.S(bvjk.bU, z);
    }

    private final void n(cren crenVar) {
        this.g = crenVar;
        this.d.W(bvjk.bV, crenVar.d);
    }

    private final synchronized void o() {
        for (final crek crekVar : this.c) {
            Executor executor = this.e;
            crekVar.getClass();
            executor.execute(new Runnable(crekVar) { // from class: crcs
                private final crek a;

                {
                    this.a = crekVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a();
                }
            });
        }
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        printWriter.println(str.concat("MuteControllerImpl:"));
        String valueOf = String.valueOf(e());
        StringBuilder sb = new StringBuilder(str.length() + 13 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append("  muteLevel: ");
        sb.append(valueOf);
        printWriter.println(sb.toString());
        boolean z = this.f;
        StringBuilder sb2 = new StringBuilder(str.length() + 22);
        sb2.append(str);
        sb2.append("  binaryIsMuted: ");
        sb2.append(z);
        printWriter.println(sb2.toString());
        String valueOf2 = String.valueOf(this.g);
        StringBuilder sb3 = new StringBuilder(str.length() + 18 + String.valueOf(valueOf2).length());
        sb3.append(str);
        sb3.append("  multiMuteLevel: ");
        sb3.append(valueOf2);
        printWriter.println(sb3.toString());
        boolean z2 = this.h;
        StringBuilder sb4 = new StringBuilder(str.length() + 23);
        sb4.append(str);
        sb4.append("  allowMultiMute: ");
        sb4.append(z2);
        printWriter.println(sb4.toString());
    }

    @Override // defpackage.crem
    public final synchronized void a(crek crekVar) {
        this.c.add(crekVar);
    }

    @Override // defpackage.crem
    public final synchronized void b(crek crekVar) {
        this.c.remove(crekVar);
    }

    @Override // defpackage.crem
    public final synchronized cren[] d() {
        return this.h ? cren.values() : new cren[]{b, a};
    }

    @Override // defpackage.crem
    public final synchronized cren e() {
        if (this.f) {
            return a;
        } else if (this.h) {
            return this.g;
        } else {
            return b;
        }
    }

    @Override // defpackage.crem
    public final synchronized cren f() {
        if (this.f) {
            return a;
        }
        return this.g;
    }

    @Override // defpackage.crem
    public final synchronized boolean g() {
        return this.f;
    }

    @Override // defpackage.crem
    public final synchronized boolean h(crej crejVar) {
        return crejVar.k.d.e > e().e;
    }

    @Override // defpackage.crem
    public final synchronized void i(cren crenVar) {
        if (crenVar == e()) {
            return;
        }
        if (crenVar.equals(a)) {
            m(true);
        } else {
            m(false);
            if (this.h) {
                n(crenVar);
            }
        }
        o();
    }

    @Override // defpackage.crem
    public final synchronized void j(cren crenVar) {
        if (crenVar == f()) {
            return;
        }
        if (crenVar.equals(a)) {
            m(true);
        } else {
            m(false);
            n(crenVar);
        }
        o();
    }

    @Override // defpackage.crem
    public final synchronized void k() {
        if (g()) {
            return;
        }
        n(b);
        m(false);
        o();
    }

    @Override // defpackage.crem
    public final void l(boolean z) {
        if (this.h != z) {
            this.h = z;
            o();
        }
    }
}
