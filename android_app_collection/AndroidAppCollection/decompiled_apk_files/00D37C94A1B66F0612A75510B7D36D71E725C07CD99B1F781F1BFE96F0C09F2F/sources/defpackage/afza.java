package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.net.NetworkException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afza  reason: default package */
/* loaded from: classes.dex */
public final class afza implements yqw {
    public final ankx a;
    private final yqw b;
    private final Executor c;
    private final afyq d;

    public afza(afyq afyqVar, ankx ankxVar, yqw yqwVar, Executor executor) {
        this.d = afyqVar;
        this.a = ankxVar;
        this.b = yqwVar;
        this.c = executor;
    }

    @Override // defpackage.yqw
    public final yua a(final yua yuaVar) {
        if (!yuaVar.j().isPresent()) {
            return this.b.a(yuaVar);
        }
        ylx.k(b(yuaVar), this.c, new ylv() { // from class: afyu
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                cff cffVar;
                yua yuaVar2 = yua.this;
                if (th instanceof cff) {
                    cffVar = (cff) th;
                } else {
                    cffVar = new cff(th);
                }
                yuaVar2.o(cffVar);
            }
        }, new afyv(yuaVar));
        return yuaVar;
    }

    @Override // defpackage.yqw
    public final ankt b(final yua yuaVar) {
        Optional j = yuaVar.j();
        if (!j.isPresent()) {
            return this.b.b(yuaVar);
        }
        avmo avmoVar = avmo.a;
        afyq afyqVar = this.d;
        ankx ankxVar = (ankx) afyqVar.a.get();
        ankxVar.getClass();
        afyn afynVar = (afyn) afyqVar.b.get();
        afynVar.getClass();
        snc sncVar = (snc) afyqVar.c.get();
        sncVar.getClass();
        avmoVar.getClass();
        return d(yuaVar, aqxo.i(new amqo() { // from class: afyw
            @Override // defpackage.amqo
            public final Object get() {
                yua yuaVar2 = yua.this;
                try {
                    aopa createBuilder = awxf.a.createBuilder();
                    String m = yuaVar2.m();
                    createBuilder.copyOnWrite();
                    m.getClass();
                    ((awxf) createBuilder.instance).c = m;
                    amuk amukVar = (amuk) Collection.EL.stream(yuaVar2.f().entrySet()).map(adgi.h).collect(amsf.a);
                    createBuilder.copyOnWrite();
                    awxf awxfVar = (awxf) createBuilder.instance;
                    aopu aopuVar = awxfVar.d;
                    if (!aopuVar.c()) {
                        awxfVar.d = aopi.mutableCopy(aopuVar);
                    }
                    aonk.addAll((Iterable) amukVar, (List) awxfVar.d);
                    aoob x = aoob.x(yuaVar2.qA());
                    createBuilder.copyOnWrite();
                    ((awxf) createBuilder.instance).e = x;
                    String f = zav.f(yuaVar2.j);
                    createBuilder.copyOnWrite();
                    ((awxf) createBuilder.instance).b = f;
                    return (awxf) createBuilder.mo39build();
                } catch (ceq e) {
                    throw new afyz(e);
                }
            }
        }), new afyp(ankxVar, afynVar, sncVar, (awvn) j.get()), false);
    }

    @Override // defpackage.yqw
    public final void c() {
        this.b.c();
    }

    public final ankt d(final yua yuaVar, final amqo amqoVar, final afyo afyoVar, boolean z) {
        yua yudVar;
        if (z) {
            try {
                yudVar = new yud(yuaVar, (awxf) amqoVar.get());
            } catch (afyz e) {
                return anlz.q(cfb.a(e.a));
            }
        } else {
            yudVar = yuaVar;
        }
        return anhq.i(this.b.b(yudVar), cff.class, new anir() { // from class: afyy
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                ankt p;
                amuk amukVar;
                final afza afzaVar = afza.this;
                final afyo afyoVar2 = afyoVar;
                final yua yuaVar2 = yuaVar;
                final amqo amqoVar2 = amqoVar;
                final cff cffVar = (cff) obj;
                if (cffVar instanceof cfd) {
                    cew cewVar = ((cfd) cffVar).b;
                    aopa createBuilder = awxg.a.createBuilder();
                    int i = cewVar.a;
                    createBuilder.copyOnWrite();
                    ((awxg) createBuilder.instance).b = i;
                    aoob x = aoob.x(cewVar.b);
                    createBuilder.copyOnWrite();
                    awxg.checkByteStringIsUtf8(x);
                    ((awxg) createBuilder.instance).c = x.E();
                    List list = cewVar.d;
                    if (list == null) {
                        amukVar = amuk.q();
                    } else {
                        amukVar = (amuk) Collection.EL.stream(list).map(adgi.g).collect(amsf.a);
                    }
                    createBuilder.copyOnWrite();
                    awxg awxgVar = (awxg) createBuilder.instance;
                    aopu aopuVar = awxgVar.d;
                    if (!aopuVar.c()) {
                        awxgVar.d = aopi.mutableCopy(aopuVar);
                    }
                    aonk.addAll((Iterable) amukVar, (List) awxgVar.d);
                    awxg awxgVar2 = (awxg) createBuilder.mo39build();
                    p = anlz.q(awvm.ACTION_TYPE_GIVE_UP);
                } else if (cffVar instanceof cfe) {
                    p = afyoVar2.a();
                } else if (cffVar instanceof cev) {
                    Throwable cause = cffVar.getCause();
                    if (!(cause instanceof NetworkException)) {
                        p = anlz.p(cffVar);
                    } else {
                        ((NetworkException) cause).getErrorCode();
                        p = afyoVar2.a();
                    }
                } else {
                    p = anlz.p(cffVar);
                }
                return anhq.h(anii.i(anko.q(p), new anir() { // from class: afyx
                    @Override // defpackage.anir
                    public final ankt a(Object obj2) {
                        afza afzaVar2 = afza.this;
                        cff cffVar2 = cffVar;
                        yua yuaVar3 = yuaVar2;
                        amqo amqoVar3 = amqoVar2;
                        afyo afyoVar3 = afyoVar2;
                        awvm awvmVar = awvm.ACTION_TYPE_UNKNOWN;
                        int ordinal = ((awvm) obj2).ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                return afzaVar2.d(yuaVar3, amqoVar3, afyoVar3, true);
                            }
                            if (ordinal == 2) {
                                return anlz.p(cffVar2);
                            }
                            if (ordinal != 3) {
                                throw new AssertionError();
                            }
                        }
                        return anlz.p(cffVar2);
                    }
                }, afzaVar.a), cff.class, adrz.n, anjk.a);
            }
        }, this.a);
    }
}
