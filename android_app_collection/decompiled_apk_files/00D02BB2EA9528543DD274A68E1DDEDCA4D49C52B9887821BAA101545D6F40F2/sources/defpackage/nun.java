package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: nun  reason: default package */
/* loaded from: classes7.dex */
public final class nun implements Serializable {
    private static final AtomicInteger d = new AtomicInteger();
    public final String a;
    public final String b;
    @dzsi
    public final dvnp c;
    private final bvrt<dtid> e;

    public nun(dtid dtidVar, String str, @dzsi dvnp dvnpVar) {
        this.e = bvrt.b(dtidVar);
        this.a = str;
        this.c = dvnpVar;
        StringBuilder sb = new StringBuilder();
        sb.append(System.nanoTime());
        sb.append(':');
        sb.append(d.incrementAndGet());
        this.b = sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dtid a() {
        return this.e.e((dssr) dtid.d.cu(7), dtid.d);
    }
}
