package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: aeia  reason: default package */
/* loaded from: classes.dex */
public final class aeia extends aflh {
    public static final aehz b = new aehy();
    private static final AtomicInteger c = new AtomicInteger();
    private final aepf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeia(ati atiVar, aepf aepfVar) {
        super(atiVar);
        afms.a(atiVar);
        afms.a(aepfVar);
        this.d = aepfVar;
    }

    @Override // defpackage.aflh, defpackage.ati, defpackage.asv
    public final long h(asy asyVar) {
        zgp b2 = zgp.b(asyVar.a);
        AtomicInteger atomicInteger = c;
        b2.g("rn", String.valueOf(atomicInteger.incrementAndGet()));
        if (asyVar.c == 2 && "/initplayback".equals(asyVar.a.getPath())) {
            b2.g("srn", String.valueOf(atomicInteger.incrementAndGet()));
        }
        aepk j = this.d.j();
        if (j != aepk.a) {
            long j2 = j.b;
            int i = j.c;
            StringBuilder sb = new StringBuilder(32);
            sb.append(j2 / 8);
            sb.append(":");
            sb.append(i);
            b2.h("bwe", sb.toString());
            b2.h("nt", Integer.toString(j.d.B));
        }
        return super.h(asyVar.d(b2.a()));
    }
}
