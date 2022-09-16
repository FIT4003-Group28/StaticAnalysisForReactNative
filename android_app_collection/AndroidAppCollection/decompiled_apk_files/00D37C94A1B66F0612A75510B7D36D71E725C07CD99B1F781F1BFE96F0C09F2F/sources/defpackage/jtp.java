package defpackage;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: jtp  reason: default package */
/* loaded from: classes3.dex */
public final class jtp implements jut, jua {
    public final joc a;
    public final aagi b;
    public final faw c;
    public final faw d;
    public final jua e;
    public final Executor f;
    public final fbu g;
    private final Map h;

    public jtp(Map map, joc jocVar, aagi aagiVar, faw fawVar, faw fawVar2, jua juaVar, Executor executor, fbu fbuVar) {
        this.h = map;
        this.a = jocVar;
        this.b = aagiVar;
        this.c = fawVar;
        this.d = fawVar2;
        this.e = juaVar;
        this.f = executor;
        this.g = fbuVar;
    }

    @Override // defpackage.jut
    public final amuk a(jnb jnbVar) {
        try {
            return (amuk) ((anie) anii.i(anko.q(anii.i(anko.q(this.e.d()), new anir() { // from class: jtl
                @Override // defpackage.anir
                public final ankt a(Object obj) {
                    final jtp jtpVar = jtp.this;
                    if (((Boolean) obj).booleanValue()) {
                        return zna.r(jtpVar.c.b(fau.a().a()).z(new ayqe() { // from class: jtn
                            @Override // defpackage.ayqe
                            public final Object a(Object obj2) {
                                jtp jtpVar2 = jtp.this;
                                if (((fav) obj2).a != 0) {
                                    return ayos.D(true);
                                }
                                return jtpVar2.d.b(fau.a().a()).E(jnx.h);
                            }
                        }));
                    }
                    return anlz.q(true);
                }
            }, this.f)), new jtm(this, jnbVar, 1), this.f)).get();
        } catch (InterruptedException | ExecutionException unused) {
            return amuk.q();
        }
    }

    public final ampq b(jtv jtvVar, ampq ampqVar, jnb jnbVar) {
        jus jusVar = (jus) this.h.get(jtvVar);
        jusVar.getClass();
        amuk a = jusVar.a(ampqVar).a(jnbVar);
        return a.isEmpty() ? amon.a : ampq.j((jur) a.get(0));
    }

    public final ampq c(jtv jtvVar, Class cls, ampq ampqVar, jnb jnbVar) {
        ampq b = b(jtvVar, ampqVar, jnbVar);
        return b.h() ? ampq.j((aoqu) cls.cast(((jur) b.c()).a)) : amon.a;
    }

    @Override // defpackage.jua
    public final ankt d() {
        throw null;
    }
}
