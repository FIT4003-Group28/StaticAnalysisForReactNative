package defpackage;

import com.google.protos.youtube.api.innertube.CommentSectionRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: xma  reason: default package */
/* loaded from: classes4.dex */
public final class xma extends ajxl implements xmg, ynl {
    public xlz a;
    public xly b;
    private final aqbu c;
    private final xyb d;
    private final xmt e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xma(ajyi ajyiVar, yni yniVar, yzj yzjVar, xmh xmhVar, ajin ajinVar, aacz aaczVar, aqbw aqbwVar, aari aariVar, acti actiVar, xyb xybVar, xyd xydVar) {
        super(aariVar, yniVar, yzjVar, actiVar);
        aqbu aqbuVar;
        aqav aqavVar;
        ajyiVar.get();
        this.d = xybVar;
        ajyiVar.a(aqbw.class);
        aqbv aqbvVar = aqbwVar.i;
        if (((aqbvVar == null ? aqbv.a : aqbvVar).b & 1) != 0) {
            aqbv aqbvVar2 = aqbwVar.i;
            aqbuVar = (aqbvVar2 == null ? aqbv.a : aqbvVar2).c;
            if (aqbuVar == null) {
                aqbuVar = aqbu.a;
            }
        } else {
            aqbuVar = null;
        }
        this.c = aqbuVar;
        xmt xmtVar = new xmt(xmhVar, this, aqbwVar, xybVar, xydVar, aaczVar);
        this.e = xmtVar;
        this.i.mG(new ajyl(this));
        this.i.mG(new xme(xmtVar));
        aqax aqaxVar = aqbwVar.c;
        if ((aqaxVar == null ? aqax.a : aqaxVar).b != 62285947) {
            aunb aunbVar = aqbwVar.d;
            if ((aunbVar == null ? aunb.a : aunbVar).qn(ElementRendererOuterClass.elementRenderer)) {
                aunb aunbVar2 = aqbwVar.d;
                aunbVar2 = aunbVar2 == null ? aunb.a : aunbVar2;
                akab akabVar = new akab();
                akabVar.b(ajinVar);
                aqtb aqtbVar = (aqtb) aunbVar2.qm(ElementRendererOuterClass.elementRenderer);
                aopa createBuilder = aslt.a.createBuilder();
                createBuilder.copyOnWrite();
                aslt asltVar = (aslt) createBuilder.instance;
                aqtbVar.getClass();
                asltVar.av = aqtbVar;
                asltVar.h |= 1048576;
                D(akabVar.a(amuk.r((aslt) createBuilder.mo39build())));
                yniVar.g(this);
            }
        } else {
            aqax aqaxVar2 = aqbwVar.c;
            aqaxVar2 = aqaxVar2 == null ? aqax.a : aqaxVar2;
            if (aqaxVar2.b == 62285947) {
                aqavVar = (aqav) aqaxVar2.c;
            } else {
                aqavVar = aqav.a;
            }
            B(aqavVar);
        }
        aunb aunbVar3 = aqbwVar.e;
        if ((aunbVar3 == null ? aunb.a : aunbVar3).qn(CommentSectionRendererOuterClass.backstageSubscribeBarRenderer)) {
            aunb aunbVar4 = aqbwVar.e;
            B((aunbVar4 == null ? aunb.a : aunbVar4).qm(CommentSectionRendererOuterClass.backstageSubscribeBarRenderer));
        }
        aqbh aqbhVar = aqbwVar.g;
        if (((aqbhVar == null ? aqbh.a : aqbhVar).b & 1) != 0) {
            aqbh aqbhVar2 = aqbwVar.g;
            aqbg aqbgVar = (aqbhVar2 == null ? aqbh.a : aqbhVar2).c;
            B(aqbgVar == null ? aqbg.a : aqbgVar);
        }
        aqbo aqboVar = aqbwVar.f;
        if (((aqboVar == null ? aqbo.a : aqboVar).b & 1) != 0) {
            aqbo aqboVar2 = aqbwVar.f;
            aqbm aqbmVar = (aqboVar2 == null ? aqbo.a : aqboVar2).c;
            p(aqbmVar == null ? aqbm.a : aqbmVar, false);
        }
        xmhVar.a(aqbwVar, this);
    }

    private final void p(aqbm aqbmVar, boolean z) {
        if (r()) {
            int size = this.i.size();
            Object obj = this.i.get(size - 1);
            Object obj2 = this.i.size() > 1 ? this.i.get(size - 2) : null;
            if (obj2 == null || !(obj2 instanceof aqbu)) {
                if (obj instanceof aqbu) {
                    super.G(obj);
                }
            } else {
                super.G(obj2);
            }
        }
        ArrayList arrayList = new ArrayList(aqbmVar.e.size());
        for (aqbt aqbtVar : aqbmVar.e) {
            if ((aqbtVar.b & 1) != 0) {
                atof atofVar = aqbtVar.c;
                if (atofVar == null) {
                    atofVar = atof.a;
                }
                arrayList.add(ajna.g(atofVar));
            }
        }
        ls(arrayList);
        for (aqax aqaxVar : this.d.a(aqbmVar)) {
            if (!z) {
                B(aqaxVar.b == 62285947 ? (aqav) aqaxVar.c : null);
            } else {
                this.e.j(aqaxVar.b == 62285947 ? (aqav) aqaxVar.c : null);
            }
        }
        aqbu aqbuVar = this.c;
        if (aqbuVar != null) {
            B(aqbuVar);
        }
    }

    private final void q() {
        xlz xlzVar = this.a;
        if (xlzVar != null) {
            nlc nlcVar = (nlc) xlzVar;
            if (!nlc.E(nlcVar.o)) {
                return;
            }
            nlcVar.o = nlc.F(nlcVar.o, true);
        }
    }

    private final boolean r() {
        int size = this.i.size();
        Object obj = null;
        Object obj2 = size > 0 ? this.i.get(size - 1) : null;
        if (size > 1) {
            obj = this.i.get(size - 2);
        }
        return (obj2 instanceof aqbu) || (obj instanceof aqbu);
    }

    public final void i(xmd xmdVar) {
        if (xmdVar != null) {
            this.e.a.add(xmdVar);
        }
    }

    @Override // defpackage.xmg
    public final void k(aqav aqavVar) {
        if (r()) {
            C(aqavVar, this.i.size() - 1);
        } else {
            B(aqavVar);
        }
        q();
    }

    @Override // defpackage.ajxl, defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (cls == xma.class) {
            if (i == -1) {
                return new Class[]{aabk.class};
            }
            if (i == 0) {
                G(((aabk) obj).b());
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return aolu.r(this, obj, i);
    }

    @Override // defpackage.xmg
    public final void l(aqav aqavVar) {
        G(aqavVar);
        q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajxh
    public final /* bridge */ /* synthetic */ void lz(Object obj, ajfy ajfyVar) {
        auxr auxrVar;
        aqbm aqbmVar = (aqbm) obj;
        super.lz(aqbmVar, ajfyVar);
        if (aqbmVar == null) {
            return;
        }
        if (ajfyVar == ajfy.RELOAD) {
            xmt xmtVar = this.e;
            aqbh aqbhVar = xmtVar.b.g;
            if (aqbhVar == null) {
                aqbhVar = aqbh.a;
            }
            aqbg aqbgVar = aqbhVar.c;
            if (aqbgVar == null) {
                aqbgVar = aqbg.a;
            }
            aqbn aqbnVar = aqbgVar.f;
            if (aqbnVar == null) {
                aqbnVar = aqbn.a;
            }
            if (aqbnVar.b == 76818770) {
                aqbh aqbhVar2 = xmtVar.b.g;
                if (aqbhVar2 == null) {
                    aqbhVar2 = aqbh.a;
                }
                aqbg aqbgVar2 = aqbhVar2.c;
                if (aqbgVar2 == null) {
                    aqbgVar2 = aqbg.a;
                }
                aopa mo52toBuilder = aqbgVar2.mo52toBuilder();
                aqbn aqbnVar2 = aqbgVar2.f;
                if (aqbnVar2 == null) {
                    aqbnVar2 = aqbn.a;
                }
                aopa mo52toBuilder2 = aqbnVar2.mo52toBuilder();
                aqbn aqbnVar3 = aqbgVar2.f;
                if (aqbnVar3 == null) {
                    aqbnVar3 = aqbn.a;
                }
                if (aqbnVar3.b == 76818770) {
                    auxrVar = (auxr) aqbnVar3.c;
                } else {
                    auxrVar = auxr.a;
                }
                aopa mo52toBuilder3 = auxrVar.mo52toBuilder();
                mo52toBuilder3.copyOnWrite();
                ((auxr) mo52toBuilder3.instance).c = auxr.emptyProtobufList();
                for (auxq auxqVar : auxrVar.c) {
                    aopa mo52toBuilder4 = auxqVar.mo52toBuilder();
                    mo52toBuilder4.copyOnWrite();
                    auxq auxqVar2 = (auxq) mo52toBuilder4.instance;
                    auxqVar2.b |= 4;
                    auxqVar2.g = false;
                    mo52toBuilder3.copyOnWrite();
                    auxr auxrVar2 = (auxr) mo52toBuilder3.instance;
                    auxq auxqVar3 = (auxq) mo52toBuilder4.mo39build();
                    auxqVar3.getClass();
                    auxrVar2.a();
                    auxrVar2.c.add(auxqVar3);
                }
                auxr auxrVar3 = (auxr) mo52toBuilder3.mo39build();
                mo52toBuilder2.copyOnWrite();
                aqbn aqbnVar4 = (aqbn) mo52toBuilder2.instance;
                auxrVar3.getClass();
                aqbnVar4.c = auxrVar3;
                aqbnVar4.b = 76818770;
                mo52toBuilder.copyOnWrite();
                aqbg aqbgVar3 = (aqbg) mo52toBuilder.instance;
                aqbn aqbnVar5 = (aqbn) mo52toBuilder2.mo39build();
                aqbnVar5.getClass();
                aqbgVar3.f = aqbnVar5;
                aqbgVar3.b |= 8;
                aqbg aqbgVar4 = (aqbg) mo52toBuilder.mo39build();
                aopa mo52toBuilder5 = xmtVar.b.mo52toBuilder();
                aqbh aqbhVar3 = xmtVar.b.g;
                if (aqbhVar3 == null) {
                    aqbhVar3 = aqbh.a;
                }
                aopa mo52toBuilder6 = aqbhVar3.mo52toBuilder();
                mo52toBuilder6.copyOnWrite();
                aqbh aqbhVar4 = (aqbh) mo52toBuilder6.instance;
                aqbgVar4.getClass();
                aqbhVar4.c = aqbgVar4;
                aqbhVar4.b |= 1;
                mo52toBuilder5.copyOnWrite();
                aqbw aqbwVar = (aqbw) mo52toBuilder5.instance;
                aqbh aqbhVar5 = (aqbh) mo52toBuilder6.mo39build();
                aqbhVar5.getClass();
                aqbwVar.g = aqbhVar5;
                aqbwVar.b |= 64;
                xmtVar.k((aqbw) mo52toBuilder5.mo39build());
            }
            this.e.i();
            p(aqbmVar, true);
            return;
        }
        p(aqbmVar, true);
    }

    @Override // defpackage.xmg
    public final void m() {
        lB();
        q();
        xly xlyVar = this.b;
        if (xlyVar != null) {
            xlyVar.a();
        }
    }

    @Override // defpackage.xmg
    public final void n(aqav aqavVar, aqav aqavVar2) {
        I(aqavVar, aqavVar2);
        q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajxh
    public final /* bridge */ /* synthetic */ Object np(auna aunaVar) {
        if (aunaVar == null || !aunaVar.qn(aqbm.b)) {
            return null;
        }
        return (aqbm) aunaVar.qm(aqbm.b);
    }

    @Override // defpackage.xmg
    public final void o(aqav aqavVar, aqav aqavVar2) {
        I(aqavVar, aqavVar2);
        q();
    }
}
