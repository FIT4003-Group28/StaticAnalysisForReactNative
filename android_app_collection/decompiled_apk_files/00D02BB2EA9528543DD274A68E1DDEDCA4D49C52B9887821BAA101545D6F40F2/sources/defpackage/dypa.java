package defpackage;

import java.nio.charset.Charset;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: dypa  reason: default package */
/* loaded from: classes6.dex */
public abstract class dypa extends dykj {
    private static final dygp<Integer> a;
    private static final dyhs<Integer> b;
    private dyjb c;
    private dyhw d;
    private Charset e;
    private boolean f;

    static {
        dyoz dyozVar = new dyoz();
        a = dyozVar;
        b = dygq.a(":status", dyozVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dypa(int i, dyvi dyviVar, dyvr dyvrVar) {
        super(i, dyviVar, dyvrVar);
        this.e = dbrc.c;
    }

    private static Charset f(dyhw dyhwVar) {
        String str = (String) dyhwVar.h(dyow.f);
        if (str != null) {
            String[] split = str.split("charset=", 2);
            try {
                return Charset.forName(split[split.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return dbrc.c;
    }

    private static void q(dyhw dyhwVar) {
        dyhwVar.j(b);
        dyhwVar.j(dygr.b);
        dyhwVar.j(dygr.a);
    }

    @dzsi
    private static final dyjb r(dyhw dyhwVar) {
        Integer num = (Integer) dyhwVar.h(b);
        if (num == null) {
            return dyjb.l.g("Missing HTTP status code");
        }
        String str = (String) dyhwVar.h(dyow.f);
        if (dyow.c(str)) {
            return null;
        }
        dyjb b2 = dyow.b(num.intValue());
        String valueOf = String.valueOf(str);
        return b2.h(valueOf.length() != 0 ? "invalid content-type: ".concat(valueOf) : new String("invalid content-type: "));
    }

    protected abstract void b(dyjb dyjbVar, boolean z, dyhw dyhwVar);

    /* JADX WARN: Removed duplicated region for block: B:42:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(defpackage.dyhw r7) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dypa.n(dyhw):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(dytj dytjVar, boolean z) {
        dyjb dyjbVar = this.c;
        boolean z2 = false;
        if (dyjbVar != null) {
            String b2 = dytn.b(dytjVar, this.e);
            this.c = dyjbVar.h(b2.length() != 0 ? "DATA-----------------------------\n".concat(b2) : new String("DATA-----------------------------\n"));
            dytjVar.close();
            if (this.c.q.length() <= 1000 && !z) {
                return;
            }
            b(this.c, false, this.d);
        } else if (!this.f) {
            b(dyjb.l.g("headers not received before payload"), false, new dyhw());
        } else {
            try {
                if (this.n) {
                    dykk.r.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                    dytjVar.close();
                } else {
                    try {
                        this.o.d(dytjVar);
                    } catch (Throwable th) {
                        try {
                            c(th);
                        } catch (Throwable th2) {
                            th = th2;
                            if (z2) {
                                dytjVar.close();
                            }
                            throw th;
                        }
                    }
                }
                if (!z) {
                    return;
                }
                this.c = dyjb.l.g("Received unexpected EOS on DATA frame from server.");
                dyhw dyhwVar = new dyhw();
                this.d = dyhwVar;
                h(this.c, false, dyhwVar);
            } catch (Throwable th3) {
                th = th3;
                z2 = true;
            }
        }
    }

    public final void p(dyhw dyhwVar) {
        dyjb g;
        dyjb h;
        dyjb dyjbVar = this.c;
        if (dyjbVar == null && !this.f) {
            dyjbVar = r(dyhwVar);
            this.c = dyjbVar;
            if (dyjbVar != null) {
                this.d = dyhwVar;
            }
        }
        if (dyjbVar == null) {
            dyjb dyjbVar2 = (dyjb) dyhwVar.h(dygr.b);
            if (dyjbVar2 != null) {
                h = dyjbVar2.g((String) dyhwVar.h(dygr.a));
            } else if (this.f) {
                h = dyjb.d.g("missing GRPC status in response");
            } else {
                Integer num = (Integer) dyhwVar.h(b);
                if (num != null) {
                    g = dyow.b(num.intValue());
                } else {
                    g = dyjb.l.g("missing HTTP status code");
                }
                h = g.h("missing GRPC status, inferred error from HTTP status code");
            }
            q(dyhwVar);
            if (this.n) {
                dykk.r.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundTrailersReceived", "Received trailers on closed stream:\n {1}\n {2}", new Object[]{h, dyhwVar});
                return;
            }
            this.j.f();
            h(h, false, dyhwVar);
            return;
        }
        String valueOf = String.valueOf(dyhwVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
        sb.append("trailers: ");
        sb.append(valueOf);
        dyjb h2 = dyjbVar.h(sb.toString());
        this.c = h2;
        b(h2, false, this.d);
    }
}
