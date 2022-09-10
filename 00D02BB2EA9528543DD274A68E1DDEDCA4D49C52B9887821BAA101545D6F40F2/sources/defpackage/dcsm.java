package defpackage;

import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: dcsm  reason: default package */
/* loaded from: classes.dex */
final class dcsm implements dcrj {
    private final String a;
    private final dcrj b;

    public dcsm(RuntimeException runtimeException, dcrj dcrjVar) {
        Object[] i;
        StringBuilder sb = new StringBuilder("LOGGING ERROR: ");
        sb.append(runtimeException.getMessage());
        sb.append("\n  original message: ");
        if (dcrjVar.h() == null) {
            sb.append(dcrjVar.j());
        } else {
            sb.append(dcrjVar.h().b);
            sb.append("\n  original arguments:");
            for (Object obj : dcrjVar.i()) {
                sb.append("\n    ");
                sb.append(dcrn.a(obj));
            }
        }
        dcrp l = dcrjVar.l();
        if (l.a() > 0) {
            sb.append("\n  metadata:");
            for (int i2 = 0; i2 < l.a(); i2++) {
                sb.append("\n    ");
                sb.append(l.b(i2));
                sb.append(": ");
                sb.append(l.c(i2));
            }
        }
        sb.append("\n  level: ");
        sb.append(dcrjVar.d());
        sb.append("\n  timestamp (nanos): ");
        sb.append(dcrjVar.e());
        sb.append("\n  class: ");
        sb.append(dcrjVar.g().a());
        sb.append("\n  method: ");
        sb.append(dcrjVar.g().b());
        sb.append("\n  line number: ");
        sb.append(dcrjVar.g().c());
        this.a = sb.toString();
        this.b = dcrjVar;
    }

    @Override // defpackage.dcrj
    public final Level d() {
        return this.b.d().intValue() > Level.WARNING.intValue() ? this.b.d() : Level.WARNING;
    }

    @Override // defpackage.dcrj
    public final long e() {
        return this.b.e();
    }

    @Override // defpackage.dcrj
    public final String f() {
        return this.b.f();
    }

    @Override // defpackage.dcrj
    public final dcqp g() {
        return this.b.g();
    }

    @Override // defpackage.dcrj
    public final dcsl h() {
        return null;
    }

    @Override // defpackage.dcrj
    public final Object[] i() {
        throw new IllegalStateException();
    }

    @Override // defpackage.dcrj
    public final Object j() {
        return this.a;
    }

    @Override // defpackage.dcrj
    public final boolean k() {
        return false;
    }

    @Override // defpackage.dcrj
    public final dcrp l() {
        return dcro.a;
    }
}
