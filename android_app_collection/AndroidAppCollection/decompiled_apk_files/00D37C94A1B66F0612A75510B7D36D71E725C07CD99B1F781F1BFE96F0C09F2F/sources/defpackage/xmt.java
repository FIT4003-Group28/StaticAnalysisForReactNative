package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: xmt  reason: default package */
/* loaded from: classes4.dex */
public final class xmt extends xni {
    public final Set a;

    public xmt(xmh xmhVar, ajyj ajyjVar, aqbw aqbwVar, xyb xybVar, xyd xydVar, aacz aaczVar) {
        super(xmhVar, ajyjVar, aqbwVar, xybVar, xydVar, aaczVar);
        this.a = new HashSet();
    }

    private final void l(xms xmsVar) {
        for (xmd xmdVar : this.a) {
            xmsVar.a(xmdVar);
        }
    }

    @Override // defpackage.xni, defpackage.xmd
    public final void c(final aqav aqavVar) {
        super.c(aqavVar);
        l(new xms() { // from class: xmo
            @Override // defpackage.xms
            public final void a(xmd xmdVar) {
                xmdVar.c(aqav.this);
            }
        });
    }

    @Override // defpackage.xni, defpackage.xmd
    public final void d() {
        super.d();
        l(xmr.a);
    }

    @Override // defpackage.xni, defpackage.xmd
    public final void e(final aqav aqavVar) {
        super.e(aqavVar);
        l(new xms() { // from class: xmp
            @Override // defpackage.xms
            public final void a(xmd xmdVar) {
                aqav aqavVar2;
                int i;
                aqav aqavVar3 = aqav.this;
                if (aqavVar3 == null) {
                    return;
                }
                aqax aqaxVar = xmdVar.a().c;
                if (aqaxVar == null) {
                    aqaxVar = aqax.a;
                }
                if (aqaxVar.b == 62285947) {
                    aqavVar2 = (aqav) aqaxVar.c;
                } else {
                    aqavVar2 = aqav.a;
                }
                aopa mo52toBuilder = aqavVar3.mo52toBuilder();
                if (aqavVar2.e != 31 || (i = aqgn.h(((Integer) aqavVar2.f).intValue())) == 0) {
                    i = 1;
                }
                mo52toBuilder.copyOnWrite();
                aqav aqavVar4 = (aqav) mo52toBuilder.instance;
                aqavVar4.f = Integer.valueOf(i - 1);
                aqavVar4.e = 31;
                if ((aqavVar2.c & 1024) != 0) {
                    apzg apzgVar = aqavVar2.D;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    mo52toBuilder.copyOnWrite();
                    aqav aqavVar5 = (aqav) mo52toBuilder.instance;
                    apzgVar.getClass();
                    aqavVar5.D = apzgVar;
                    aqavVar5.c |= 1024;
                }
                if ((aqavVar2.b & 65536) != 0) {
                    apok apokVar = aqavVar2.q;
                    if (apokVar == null) {
                        apokVar = apok.a;
                    }
                    mo52toBuilder.copyOnWrite();
                    aqav aqavVar6 = (aqav) mo52toBuilder.instance;
                    apokVar.getClass();
                    aqavVar6.q = apokVar;
                    aqavVar6.b |= 65536;
                }
                apzl apzlVar = aqavVar2.t;
                if (apzlVar == null) {
                    apzlVar = apzl.a;
                }
                apzk apzkVar = apzlVar.c;
                if (apzkVar == null) {
                    apzkVar = apzk.a;
                }
                if ((apzkVar.b & 4) != 0) {
                    apzl apzlVar2 = ((aqav) mo52toBuilder.instance).t;
                    if (apzlVar2 == null) {
                        apzlVar2 = apzl.a;
                    }
                    if ((apzlVar2.b & 1) != 0) {
                        apzl apzlVar3 = ((aqav) mo52toBuilder.instance).t;
                        if (apzlVar3 == null) {
                            apzlVar3 = apzl.a;
                        }
                        aopa mo52toBuilder2 = apzlVar3.mo52toBuilder();
                        apzl apzlVar4 = ((aqav) mo52toBuilder.instance).t;
                        if (apzlVar4 == null) {
                            apzlVar4 = apzl.a;
                        }
                        apzk apzkVar2 = apzlVar4.c;
                        if (apzkVar2 == null) {
                            apzkVar2 = apzk.a;
                        }
                        aopa mo52toBuilder3 = apzkVar2.mo52toBuilder();
                        apok apokVar2 = apzkVar.e;
                        if (apokVar2 == null) {
                            apokVar2 = apok.a;
                        }
                        mo52toBuilder3.copyOnWrite();
                        apzk apzkVar3 = (apzk) mo52toBuilder3.instance;
                        apokVar2.getClass();
                        apzkVar3.e = apokVar2;
                        apzkVar3.b |= 4;
                        mo52toBuilder2.copyOnWrite();
                        apzl apzlVar5 = (apzl) mo52toBuilder2.instance;
                        apzk apzkVar4 = (apzk) mo52toBuilder3.mo39build();
                        apzkVar4.getClass();
                        apzlVar5.c = apzkVar4;
                        apzlVar5.b |= 1;
                        mo52toBuilder.copyOnWrite();
                        aqav aqavVar7 = (aqav) mo52toBuilder.instance;
                        apzl apzlVar6 = (apzl) mo52toBuilder2.mo39build();
                        apzlVar6.getClass();
                        aqavVar7.t = apzlVar6;
                        aqavVar7.b |= 4194304;
                    }
                }
                xmdVar.e((aqav) mo52toBuilder.mo39build());
            }
        });
    }

    @Override // defpackage.xni, defpackage.xmd
    public final void f(final aqav aqavVar, final aqav aqavVar2) {
        super.f(aqavVar, aqavVar2);
        l(new xms() { // from class: xmq
            @Override // defpackage.xms
            public final void a(xmd xmdVar) {
                xmdVar.f(aqav.this, aqavVar2);
            }
        });
    }

    public final void i() {
        aqbo aqboVar = this.b.f;
        if (aqboVar == null) {
            aqboVar = aqbo.a;
        }
        if ((aqboVar.b & 1) != 0) {
            aqbo aqboVar2 = this.b.f;
            if (aqboVar2 == null) {
                aqboVar2 = aqbo.a;
            }
            aqbm aqbmVar = aqboVar2.c;
            if (aqbmVar == null) {
                aqbmVar = aqbm.a;
            }
            for (aqax aqaxVar : this.c.a(aqbmVar)) {
                super.c(aqaxVar.b == 62285947 ? (aqav) aqaxVar.c : null);
            }
        }
    }
}
