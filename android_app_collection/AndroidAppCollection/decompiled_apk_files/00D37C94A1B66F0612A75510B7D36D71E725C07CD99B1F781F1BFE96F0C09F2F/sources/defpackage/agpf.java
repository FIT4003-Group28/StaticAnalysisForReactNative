package defpackage;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: agpf  reason: default package */
/* loaded from: classes.dex */
public final class agpf implements agry {
    private final azqb a;
    private final aahf b;
    private final axxh c;

    public agpf(azqb azqbVar, aahf aahfVar, axxh axxhVar) {
        this.a = azqbVar;
        this.b = aahfVar;
        this.c = axxhVar;
    }

    @Override // defpackage.agry
    public final agrx a(atrf atrfVar) {
        return agrx.a;
    }

    @Override // defpackage.agry
    public final ankt b(afvm afvmVar, atrf atrfVar) {
        String g = aakj.g(atrfVar.d);
        int aq = akel.aq(atrfVar.c);
        if (aq == 0) {
            aq = 1;
        }
        int i = aq - 1;
        if (i != 1) {
            if (i == 2) {
                agpj e = ((agrf) this.a.get()).a().e();
                if (e == null) {
                    return anlz.q(agru.b);
                }
                agpj.w(e.l(g));
                return anlz.q(agru.a);
            }
            return anlz.q(agru.c);
        }
        atrc atrcVar = atrfVar.e;
        if (atrcVar == null) {
            atrcVar = atrc.b;
        }
        aahe c = this.b.c();
        agpj e2 = ((agrf) this.a.get()).a().e();
        if (e2 == null) {
            return anlz.q(agru.b);
        }
        awkx awkxVar = (awkx) c.f(((asva) atrcVar.qm(asva.b)).d).g(awkx.class).W();
        if (awkxVar == null) {
            return anlz.q(agru.c);
        }
        avhn thumbnail = awkxVar.getThumbnail();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        ayqi.c((AtomicReference) this.c.a.a.V(axxd.e).B().an(false).S(new ldk(atomicBoolean, 8)));
        awkx awkxVar2 = null;
        aalc b = atomicBoolean.get() ? e2.b(g, new aalc(thumbnail)) : null;
        if (b == null || b.a.isEmpty()) {
            try {
                e2.s(g, thumbnail);
                b = e2.d(g, new aalc(thumbnail));
            } catch (IOException unused) {
                return anlz.q(agru.c);
            } catch (ExecutionException unused2) {
                return anlz.q(agru.b);
            }
        }
        aahe c2 = this.b.c();
        try {
            aopa mo52toBuilder = ((awky) aopi.parseFrom(awky.a, awkxVar.c(), aoos.b())).mo52toBuilder();
            avhn e3 = b.e();
            mo52toBuilder.copyOnWrite();
            awky awkyVar = (awky) mo52toBuilder.instance;
            e3.getClass();
            awkyVar.j = e3;
            awkyVar.c |= 128;
            awkxVar2 = new awkv(((awky) mo52toBuilder.mo39build()).mo52toBuilder()).a(c2);
        } catch (aopx unused3) {
            zep.b("could not parse persist YtMainVideoEntity");
        }
        if (awkxVar2 != null) {
            try {
                aahy c3 = ((aaik) c).c();
                c3.d(awkxVar2);
                c3.b().T();
            } catch (RuntimeException e4) {
                if (e4.getCause() instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                    return anlz.q(agru.b);
                }
                return anlz.q(agru.c);
            }
        }
        return anlz.q(agru.a);
    }

    @Override // defpackage.agry
    public final ankt c(afvm afvmVar, amuk amukVar) {
        throw new UnsupportedOperationException();
    }
}
