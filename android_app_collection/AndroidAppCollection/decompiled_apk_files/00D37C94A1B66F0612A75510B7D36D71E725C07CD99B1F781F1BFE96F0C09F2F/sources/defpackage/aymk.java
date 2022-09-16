package defpackage;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: aymk  reason: default package */
/* loaded from: classes2.dex */
public final class aymk {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final azqj[] b;

    static {
        new aymk(new azqj[0], null, null);
    }

    public aymk(azqj[] azqjVarArr, byte[] bArr, byte[] bArr2) {
        this.b = azqjVarArr;
    }

    public static aymk m(azqj[] azqjVarArr, axyb axybVar, ayat ayatVar) {
        aymk aymkVar = new aymk(azqjVarArr, null, null);
        for (azqj azqjVar : azqjVarArr) {
            azqjVar.m(axybVar, ayatVar);
        }
        return aymkVar;
    }

    public final void a() {
        for (azqj azqjVar : this.b) {
            azqjVar.a();
        }
    }

    public final void b(ayat ayatVar) {
        for (azqj azqjVar : this.b) {
            azqjVar.d(ayatVar);
        }
    }

    public final void c() {
        for (azqj azqjVar : this.b) {
            azqjVar.g();
        }
    }

    public final void d(int i) {
        for (azqj azqjVar : this.b) {
            azqjVar.b(i);
        }
    }

    public final void e(int i, long j, long j2) {
        for (azqj azqjVar : this.b) {
            azqjVar.c(i, j, j2);
        }
    }

    public final void f(long j) {
        for (azqj azqjVar : this.b) {
            azqjVar.e(j);
        }
    }

    public final void g(long j) {
        for (azqj azqjVar : this.b) {
            azqjVar.f(j);
        }
    }

    public final void h(int i) {
        for (azqj azqjVar : this.b) {
            azqjVar.h(i);
        }
    }

    public final void i(int i, long j, long j2) {
        for (azqj azqjVar : this.b) {
            azqjVar.i(i, j, j2);
        }
    }

    public final void j(long j) {
        for (azqj azqjVar : this.b) {
            azqjVar.j(j);
        }
    }

    public final void k(long j) {
        for (azqj azqjVar : this.b) {
            azqjVar.k(j);
        }
    }

    public final void l(Status status) {
        if (this.a.compareAndSet(false, true)) {
            for (azqj azqjVar : this.b) {
                azqjVar.l(status);
            }
        }
    }
}
