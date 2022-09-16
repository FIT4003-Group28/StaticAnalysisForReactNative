package defpackage;

import io.grpc.Status;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: aydu  reason: default package */
/* loaded from: classes2.dex */
public abstract class aydu implements ayml {
    @Override // defpackage.ayml
    public final void d() {
        aykb aykbVar;
        aydn aydnVar;
        if (((aykb) v()).f || (aydnVar = (aykbVar = (aykb) v()).j) == null || aydnVar.a() <= 0) {
            return;
        }
        aykbVar.b(false, true);
    }

    @Override // defpackage.ayml
    public final void f() {
        aydt p = p();
        ayjx ayjxVar = p.d;
        ayjxVar.a = p;
        p.a = ayjxVar;
    }

    @Override // defpackage.ayml
    public final void g(int i) {
        aydt p = p();
        ayfc ayfcVar = p.a;
        int i2 = aynn.a;
        ayds aydsVar = new ayds(p, i);
        synchronized (((ayhi) p).r) {
            aydsVar.run();
        }
    }

    @Override // defpackage.ayml
    public final void h(axyr axyrVar) {
        ((aykb) v()).b = axyrVar;
    }

    @Override // defpackage.ayml
    public final void n(InputStream inputStream) {
        int a;
        try {
            if (!((aykb) v()).f) {
                ayha v = v();
                if (((aykb) v).f) {
                    throw new IllegalStateException("Framer already closed");
                }
                ((aykb) v).g++;
                int i = ((aykb) v).h + 1;
                ((aykb) v).h = i;
                ((aykb) v).i = 0L;
                ((aykb) v).e.h(i);
                axyr axyrVar = ((aykb) v).b;
                axyq axyqVar = axyp.a;
                try {
                    int available = inputStream.available();
                    if (available != 0 && axyrVar != axyqVar) {
                        ayjy ayjyVar = new ayjy();
                        try {
                            a = aykb.a(inputStream, ayjyVar);
                            ayjyVar.close();
                            int i2 = ((aykb) v).a;
                            if (i2 >= 0 && a > i2) {
                                throw Status.j.withDescription(String.format("message too large %d > %d", Integer.valueOf(a), Integer.valueOf(((aykb) v).a))).d();
                            }
                            ((aykb) v).c(ayjyVar, true);
                        } catch (Throwable th) {
                            ayjyVar.close();
                            throw th;
                        }
                    } else if (available != -1) {
                        ((aykb) v).i = available;
                        int i3 = ((aykb) v).a;
                        if (i3 >= 0 && available > i3) {
                            throw Status.j.withDescription(String.format("message too large %d > %d", Integer.valueOf(available), Integer.valueOf(((aykb) v).a))).d();
                        }
                        ((aykb) v).d.clear();
                        ((aykb) v).d.put((byte) 0).putInt(available);
                        if (((aykb) v).j == null) {
                            ((aykb) v).j = banl.p(((aykb) v).d.position() + available);
                        }
                        ((aykb) v).d(((aykb) v).d.array(), 0, ((aykb) v).d.position());
                        a = aykb.a(inputStream, ((aykb) v).c);
                    } else {
                        ayjy ayjyVar2 = new ayjy();
                        a = aykb.a(inputStream, ayjyVar2);
                        int i4 = ((aykb) v).a;
                        if (i4 >= 0 && a > i4) {
                            throw Status.j.withDescription(String.format("message too large %d > %d", Integer.valueOf(a), Integer.valueOf(((aykb) v).a))).d();
                        }
                        ((aykb) v).c(ayjyVar2, false);
                    }
                    if (available != -1 && a != available) {
                        throw Status.n.withDescription(String.format("Message length inaccurate %s != %s", Integer.valueOf(a), Integer.valueOf(available))).d();
                    }
                    long j = a;
                    ((aykb) v).e.j(j);
                    ((aykb) v).e.k(((aykb) v).i);
                    ((aykb) v).e.i(((aykb) v).h, ((aykb) v).i, j);
                } catch (IOException e) {
                    throw Status.n.withDescription("Failed to frame message").c(e).d();
                } catch (RuntimeException e2) {
                    throw Status.n.withDescription("Failed to frame message").c(e2).d();
                }
            }
        } finally {
            ayhf.f(inputStream);
        }
    }

    @Override // defpackage.ayml
    public boolean o() {
        throw null;
    }

    public abstract aydt p();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract ayha v();
}
