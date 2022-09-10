package defpackage;

import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dysf  reason: default package */
/* loaded from: classes6.dex */
public final class dysf extends dyhj<dysf> {
    private final List<dyey> B;
    private final boolean C;
    private final boolean D;
    private final dysb E;
    dysx<? extends Executor> c;
    public dysx<? extends Executor> d;
    final dyip e;
    public dyif f;
    final String g;
    @dzsi
    String h;
    final String i;
    dyfu j;
    dyfj k;
    long l;
    int m;
    final int n;
    final long o;
    final long p;
    boolean q;
    boolean r;
    final dygj s;
    final boolean t;
    public boolean u;
    public boolean v;
    public final dysa w;
    private static final Logger x = Logger.getLogger(dysf.class.getName());
    static final long a = TimeUnit.MINUTES.toMillis(30);
    static final long b = TimeUnit.SECONDS.toMillis(1);
    private static final dysx<? extends Executor> y = dyvh.c(dyow.l);
    private static final dyfu z = dyfu.b;
    private static final dyfj A = dyfj.a;

    public dysf(String str, dysb dysbVar, @dzsi dysa dysaVar) {
        dysx<? extends Executor> dysxVar = y;
        this.c = dysxVar;
        this.d = dysxVar;
        this.B = new ArrayList();
        dyip a2 = dyip.a();
        this.e = a2;
        this.f = a2.a;
        this.i = "pick_first";
        this.j = z;
        this.k = A;
        this.l = a;
        this.m = 5;
        this.n = 5;
        this.o = 16777216L;
        this.p = 1048576L;
        this.q = false;
        this.s = dygj.b;
        this.t = true;
        this.u = true;
        this.C = true;
        this.D = true;
        this.v = true;
        dbsk.t(str, "target");
        this.g = str;
        this.E = dysbVar;
        this.w = dysaVar;
    }

    static String a(SocketAddress socketAddress) {
        try {
            String valueOf = String.valueOf(socketAddress);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1);
            sb.append("/");
            sb.append(valueOf);
            return new URI("directaddress", "", sb.toString(), null).toString();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    @Override // defpackage.dyhj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dyhi c() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dysf.c():dyhi");
    }

    @Override // defpackage.dyhj
    public final /* bridge */ /* synthetic */ dysf d() {
        this.q = true;
        this.u = false;
        this.v = false;
        return this;
    }

    @Override // defpackage.dyhj
    public final /* bridge */ /* synthetic */ dysf e(@dzsi String str) {
        this.h = str;
        return this;
    }

    @Override // defpackage.dyhj
    public final /* bridge */ /* synthetic */ dysf f(dyey[] dyeyVarArr) {
        this.B.addAll(Arrays.asList(dyeyVarArr));
        return this;
    }

    @Override // defpackage.dyhj
    public final /* bridge */ /* synthetic */ dysf g(Executor executor) {
        if (executor != null) {
            this.c = new dyoj(executor);
        } else {
            this.c = y;
        }
        return this;
    }

    @Override // defpackage.dyhj
    public final /* bridge */ /* synthetic */ void h(dyfj dyfjVar) {
        this.k = dyfjVar;
    }

    @Override // defpackage.dyhj
    public final /* bridge */ /* synthetic */ void i(dyfu dyfuVar) {
        this.j = dyfuVar;
    }

    @Override // defpackage.dyhj
    public final /* bridge */ /* synthetic */ void j(long j, TimeUnit timeUnit) {
        dbsk.f(j > 0, "idle timeout is %s, but must be positive", j);
        this.l = timeUnit.toDays(j) >= 30 ? -1L : Math.max(timeUnit.toMillis(j), b);
    }

    @Override // defpackage.dyhj
    public final /* bridge */ /* synthetic */ void k(Executor executor) {
        if (executor != null) {
            this.d = new dyoj(executor);
        } else {
            this.d = y;
        }
    }

    @Override // defpackage.dyhj
    public final /* bridge */ /* synthetic */ void o() {
        this.m = 3;
    }

    public dysf(SocketAddress socketAddress, String str, dysb dysbVar) {
        dysx<? extends Executor> dysxVar = y;
        this.c = dysxVar;
        this.d = dysxVar;
        this.B = new ArrayList();
        dyip a2 = dyip.a();
        this.e = a2;
        this.f = a2.a;
        this.i = "pick_first";
        this.j = z;
        this.k = A;
        this.l = a;
        this.m = 5;
        this.n = 5;
        this.o = 16777216L;
        this.p = 1048576L;
        this.q = false;
        this.s = dygj.b;
        this.t = true;
        this.u = true;
        this.C = true;
        this.D = true;
        this.v = true;
        this.g = a(socketAddress);
        dbsk.t(dysbVar, "clientTransportFactoryBuilder");
        this.E = dysbVar;
        this.f = new dysd(socketAddress, str);
        this.w = new dyse();
    }
}
