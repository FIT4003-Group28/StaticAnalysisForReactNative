package defpackage;

import java.io.IOException;
import java.net.Socket;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyvy  reason: default package */
/* loaded from: classes6.dex */
public final class dyvy implements eajx {
    public final dyvz c;
    @dzsi
    public eajx f;
    @dzsi
    public Socket g;
    private final dyuz h;
    public final Object a = new Object();
    public final eaiz b = new eaiz();
    public boolean d = false;
    public boolean e = false;
    private boolean i = false;

    public dyvy(dyuz dyuzVar, dyvz dyvzVar) {
        dbsk.t(dyuzVar, "executor");
        this.h = dyuzVar;
        this.c = dyvzVar;
    }

    @Override // defpackage.eajx
    public final eaka b() {
        return eaka.f;
    }

    @Override // defpackage.eajx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.h.execute(new dyvw(this));
    }

    @Override // defpackage.eajx
    public final void a(eaiz eaizVar, long j) {
        if (this.i) {
            throw new IOException("closed");
        }
        int i = dyzn.a;
        synchronized (this.a) {
            this.b.a(eaizVar, j);
            if (!this.d && !this.e && this.b.g() > 0) {
                this.d = true;
                this.h.execute(new dyvu(this));
            }
        }
    }

    @Override // defpackage.eajx, java.io.Flushable
    public final void flush() {
        if (this.i) {
            throw new IOException("closed");
        }
        int i = dyzn.a;
        synchronized (this.a) {
            if (this.e) {
                return;
            }
            this.e = true;
            this.h.execute(new dyvv(this));
        }
    }
}
