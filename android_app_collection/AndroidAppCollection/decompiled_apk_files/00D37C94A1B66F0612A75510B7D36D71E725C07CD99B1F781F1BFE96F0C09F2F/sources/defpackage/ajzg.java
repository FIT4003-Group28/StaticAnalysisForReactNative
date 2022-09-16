package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ajzg  reason: default package */
/* loaded from: classes.dex */
public class ajzg extends ajxl implements ynl {
    private final ajrj a;
    public final ajsm h;
    public final ajsm m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajzg(aari aariVar, ajyi ajyiVar, yni yniVar, yzj yzjVar, acti actiVar) {
        super(aariVar, yniVar, yzjVar, actiVar);
        ajyiVar.get();
        ajyiVar.a(aueq.class);
        yniVar.g(this);
        ajrj ajrjVar = new ajrj();
        this.a = ajrjVar;
        ajsm ajsmVar = new ajsm();
        this.h = ajsmVar;
        ajsm ajsmVar2 = new ajsm();
        this.m = ajsmVar2;
        ajrjVar.m(ajsmVar);
        ajrjVar.m(this.i);
        ajrjVar.m(ajsmVar2);
    }

    private static amuk m(aueq aueqVar) {
        if (aueqVar.e.size() == 0) {
            return amuk.q();
        }
        ArrayList arrayList = new ArrayList(aueqVar.e.size());
        for (auer auerVar : aueqVar.e) {
            int i = auerVar.b;
            if ((i & 1) != 0) {
                atof atofVar = auerVar.c;
                if (atofVar == null) {
                    atofVar = atof.a;
                }
                arrayList.add(ajna.g(atofVar));
            } else if ((i & 2) != 0) {
                augq augqVar = auerVar.d;
                if (augqVar == null) {
                    augqVar = augq.a;
                }
                arrayList.add(ajna.g(augqVar));
            }
        }
        return amuk.o(arrayList);
    }

    private final amuk n(aueq aueqVar) {
        if (aueqVar.d.size() == 0) {
            return amuk.q();
        }
        ArrayList arrayList = new ArrayList(aueqVar.d.size());
        for (aues auesVar : aueqVar.d) {
            aopa mo52toBuilder = auesVar.mo52toBuilder();
            aues auesVar2 = (aues) mo52toBuilder.instance;
            int i = auesVar2.b;
            if ((i & 1) != 0) {
                auex auexVar = auesVar2.c;
                if (auexVar == null) {
                    auexVar = auex.a;
                }
                aopc aopcVar = (aopc) auexVar.mo52toBuilder();
                aopcVar.e(aueu.b, aueqVar.f);
                mo52toBuilder.copyOnWrite();
                aues auesVar3 = (aues) mo52toBuilder.instance;
                auex auexVar2 = (auex) aopcVar.mo39build();
                auexVar2.getClass();
                auesVar3.c = auexVar2;
                auesVar3.b |= 1;
                auex auexVar3 = ((aues) mo52toBuilder.instance).c;
                if (auexVar3 == null) {
                    auexVar3 = auex.a;
                }
                arrayList.add(auexVar3);
            } else if ((i & 8) == 0) {
                d(arrayList, (aues) mo52toBuilder.mo39build());
            } else {
                aqio aqioVar = auesVar2.f;
                if (aqioVar == null) {
                    aqioVar = aqio.a;
                }
                arrayList.add(aqioVar);
            }
        }
        return amuk.o(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajxl
    public final void C(Object obj, int i) {
        this.h.add(i, obj);
    }

    @Override // defpackage.ajxl
    public final void G(Object obj) {
        if (obj != null) {
            this.h.remove(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(final abbn abbnVar) {
        this.h.m(new ampt() { // from class: ajzf
            @Override // defpackage.ampt
            public final boolean a(Object obj) {
                abbn abbnVar2 = abbn.this;
                if (obj instanceof auex) {
                    auex auexVar = (auex) obj;
                    return ((String) auexVar.qm(aueu.b)).equals(abbnVar2.a) && auexVar.o.equals(abbnVar2.b);
                }
                return false;
            }
        });
    }

    protected void d(List list, aues auesVar) {
    }

    protected void k(aueq aueqVar) {
    }

    @Override // defpackage.ajxl, defpackage.ynl
    public Class[] ky(Class cls, Object obj, int i) {
        if (cls == ajzg.class) {
            if (i == -1) {
                return new Class[]{abbn.class};
            }
            if (i == 0) {
                c((abbn) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return aolu.r(this, obj, i);
    }

    public void l(aueq aueqVar) {
        if (aueqVar == null) {
            super.lB();
            this.h.clear();
            this.m.clear();
            return;
        }
        ls(m(aueqVar));
        amuk n = n(aueqVar);
        int size = this.h.size();
        int i = 0;
        for (Object obj : n) {
            if (i < size) {
                this.h.n(i, obj);
            } else {
                this.h.add(i, obj);
            }
            i++;
        }
        if (i < size) {
            this.h.h(i, size - i);
        }
        k(aueqVar);
    }

    @Override // defpackage.ajxl, defpackage.ajyj
    public final ajqm lA() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajxh
    public final /* bridge */ /* synthetic */ void lz(Object obj, ajfy ajfyVar) {
        aueq aueqVar = (aueq) obj;
        super.lz(aueqVar, ajfyVar);
        if (aueqVar == null) {
            return;
        }
        if (ajfyVar != ajfy.RELOAD) {
            ls(m(aueqVar));
            this.h.addAll(n(aueqVar));
            k(aueqVar);
            return;
        }
        l(aueqVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajxh
    public final /* bridge */ /* synthetic */ Object np(auna aunaVar) {
        if (aunaVar == null || !aunaVar.qn(aueq.b)) {
            return null;
        }
        return (aueq) aunaVar.qm(aueq.b);
    }
}
