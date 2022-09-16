package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import java.io.IOException;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: jnj  reason: default package */
/* loaded from: classes3.dex */
public final class jnj implements itb {
    public final azqb a;
    public final azqb b;
    private final ayor c;

    public jnj(ayor ayorVar, azqb azqbVar, azqb azqbVar2) {
        this.c = ayorVar;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    @Override // defpackage.itb
    public final ayoc a(aatf aatfVar) {
        Object p;
        amqo amqoVar = new amqo() { // from class: jni
            @Override // defpackage.amqo
            public final Object get() {
                final jnj jnjVar = jnj.this;
                return jnjVar.b(new Callable() { // from class: jng
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        arlt arltVar;
                        BrowseResponseModel browseResponseModel;
                        jnk jnkVar = (jnk) jnj.this.a.get();
                        arlt arltVar2 = null;
                        if (!eog.aI((aacz) jnkVar.c.get()) || !((yrj) jnkVar.g.get()).p()) {
                            arltVar = null;
                        } else {
                            aopa createBuilder = asxr.a.createBuilder();
                            createBuilder.copyOnWrite();
                            asxr asxrVar = (asxr) createBuilder.instance;
                            asxrVar.b |= 1;
                            asxrVar.c = true;
                            boolean h = ((fcl) jnkVar.f.get()).h();
                            createBuilder.copyOnWrite();
                            asxr asxrVar2 = (asxr) createBuilder.instance;
                            asxrVar2.b |= 4;
                            asxrVar2.e = h;
                            aacj c = ((aacg) jnkVar.d.get()).c();
                            if (c.b.a() == aacm.AVAILABLE || c.b.a() == aacm.STALE) {
                                arltVar = (arlt) c.a;
                                createBuilder.copyOnWrite();
                                asxr asxrVar3 = (asxr) createBuilder.instance;
                                asxrVar3.b |= 2;
                                asxrVar3.d = true;
                            } else {
                                arltVar = null;
                            }
                            arrf a = arrh.a();
                            a.copyOnWrite();
                            ((arrh) a.instance).cQ((asxr) createBuilder.mo39build());
                            ((acrr) jnkVar.e.get()).c((arrh) a.mo39build());
                        }
                        if (arltVar == null) {
                            try {
                                etd etdVar = (etd) jnkVar.a.get();
                                arltVar = (arlt) etdVar.b().c();
                                if (arltVar == null) {
                                    arltVar = ess.c(etdVar.e.a());
                                }
                            } catch (IOException unused) {
                                arltVar = null;
                            }
                            if (arltVar == null) {
                                try {
                                    browseResponseModel = ((etd) jnkVar.a.get()).g();
                                } catch (IOException unused2) {
                                    browseResponseModel = null;
                                }
                                if (browseResponseModel != null && browseResponseModel.a != null) {
                                    ess essVar = (ess) jnkVar.b.get();
                                    arlt c2 = ess.c(browseResponseModel.a);
                                    if (c2 != null) {
                                        ((etd) jnkVar.a.get()).l(c2);
                                        arltVar2 = c2;
                                    }
                                }
                                return ampq.i(arltVar2).b(jgl.m);
                            }
                        }
                        arltVar2 = arltVar;
                        return ampq.i(arltVar2).b(jgl.m);
                    }
                });
            }
        };
        ampg ampgVar = new ampg() { // from class: jnf
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                final jnj jnjVar = jnj.this;
                final String str = (String) obj;
                return jnjVar.b(new Callable() { // from class: jnh
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        agqh e;
                        jnj jnjVar2 = jnj.this;
                        String str2 = str;
                        jnl jnlVar = (jnl) jnjVar2.b.get();
                        ylr.b();
                        zgh.m(str2);
                        arlt arltVar = null;
                        if (((fcl) jnlVar.a.get()).j() && (e = ((agrf) jnlVar.b.get()).a().i().e(str2)) != null) {
                            jml jmlVar = (jml) jnlVar.c.get();
                            auqh auqhVar = (auqh) jmlVar.g(agqh.class, auqh.class, e, null);
                            aucu aucuVar = (aucu) jmlVar.g(agqh.class, aucu.class, e, null);
                            if (auqhVar != null && aucuVar != null) {
                                aopa createBuilder = avfo.a.createBuilder();
                                createBuilder.copyOnWrite();
                                avfo avfoVar = (avfo) createBuilder.instance;
                                avfoVar.b |= 8;
                                avfoVar.f = true;
                                aopa createBuilder2 = avfk.a.createBuilder();
                                createBuilder2.copyOnWrite();
                                avfk avfkVar = (avfk) createBuilder2.instance;
                                avfkVar.c = auqhVar;
                                avfkVar.b |= 1;
                                createBuilder.copyOnWrite();
                                avfo avfoVar2 = (avfo) createBuilder.instance;
                                avfk avfkVar2 = (avfk) createBuilder2.mo39build();
                                avfkVar2.getClass();
                                avfoVar2.k = avfkVar2;
                                avfoVar2.b |= 8192;
                                avfo avfoVar3 = (avfo) createBuilder.mo39build();
                                aopa createBuilder3 = arlw.a.createBuilder();
                                createBuilder3.copyOnWrite();
                                arlw arlwVar = (arlw) createBuilder3.instance;
                                avfoVar3.getClass();
                                arlwVar.c = avfoVar3;
                                arlwVar.b = 58174010;
                                arlw arlwVar2 = (arlw) createBuilder3.mo39build();
                                aopc aopcVar = (aopc) arlt.a.createBuilder();
                                arpa arpaVar = arpa.a;
                                aopcVar.copyOnWrite();
                                arlt arltVar2 = (arlt) aopcVar.instance;
                                arpaVar.getClass();
                                arltVar2.c = arpaVar;
                                arltVar2.b |= 1;
                                aopa createBuilder4 = arlo.a.createBuilder();
                                createBuilder4.copyOnWrite();
                                arlo arloVar = (arlo) createBuilder4.instance;
                                arloVar.c = aucuVar;
                                arloVar.b = 53272665;
                                aopcVar.copyOnWrite();
                                arlt arltVar3 = (arlt) aopcVar.instance;
                                arlo arloVar2 = (arlo) createBuilder4.mo39build();
                                arloVar2.getClass();
                                arltVar3.d = arloVar2;
                                arltVar3.b |= 2;
                                aopa createBuilder5 = arlu.a.createBuilder();
                                aopa createBuilder6 = armc.a.createBuilder();
                                createBuilder6.copyOnWrite();
                                armc armcVar = (armc) createBuilder6.instance;
                                arlwVar2.getClass();
                                armcVar.a();
                                armcVar.c.add(arlwVar2);
                                createBuilder5.copyOnWrite();
                                arlu arluVar = (arlu) createBuilder5.instance;
                                armc armcVar2 = (armc) createBuilder6.mo39build();
                                armcVar2.getClass();
                                arluVar.c = armcVar2;
                                arluVar.b = 58173949;
                                aopcVar.copyOnWrite();
                                arlt arltVar4 = (arlt) aopcVar.instance;
                                arlu arluVar2 = (arlu) createBuilder5.mo39build();
                                arluVar2.getClass();
                                arltVar4.f = arluVar2;
                                arltVar4.b |= 64;
                                arltVar = (arlt) aopcVar.mo39build();
                            }
                        }
                        return ampq.i(arltVar).b(jgl.n);
                    }
                });
            }
        };
        String str = aatfVar.c;
        if ("FElibrary".equals(str)) {
            p = amqoVar.get();
        } else {
            String c = elk.c(str);
            if (amps.e(c)) {
                p = ayoc.p();
            } else {
                p = ampgVar.apply(c);
            }
        }
        return (ayoc) p;
    }

    public final ayoc b(Callable callable) {
        return ayoc.u(callable).F(this.c).h(hqc.e).f();
    }
}
