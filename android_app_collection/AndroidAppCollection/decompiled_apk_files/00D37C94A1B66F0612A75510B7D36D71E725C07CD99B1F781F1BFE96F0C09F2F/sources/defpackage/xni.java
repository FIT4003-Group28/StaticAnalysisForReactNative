package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: xni  reason: default package */
/* loaded from: classes4.dex */
public class xni implements xmd {
    private final xmh a;
    public aqbw b;
    protected final xyb c;
    private final ajyj d;
    private final xyd e;
    private final aacz f;

    public xni(xmh xmhVar, ajyj ajyjVar, aqbw aqbwVar, xyb xybVar, xyd xydVar, aacz aaczVar) {
        this.a = xmhVar;
        this.d = ajyjVar;
        this.b = aqbwVar;
        this.c = xybVar;
        this.e = xydVar;
        this.f = aaczVar;
    }

    private static final boolean i(aqav aqavVar, aqav aqavVar2) {
        return (aqavVar == null || aqavVar2 == null || (aqavVar.b & 1) == 0 || !aqavVar.i.equals(aqavVar2.i)) ? false : true;
    }

    @Override // defpackage.xmd
    public final aqbw a() {
        return this.b;
    }

    @Override // defpackage.xmd
    public final void b(aqav aqavVar) {
        if (h()) {
            ajyj ajyjVar = this.d;
            if ((ajyjVar instanceof ajxh) && ((ajxh) ajyjVar).af(ajfy.NEXT)) {
                return;
            }
        }
        j(aqavVar);
    }

    @Override // defpackage.xmd
    public void c(aqav aqavVar) {
        aqav aqavVar2;
        if (aqavVar == null) {
            return;
        }
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
            List a = this.c.a(aqbmVar);
            int i = 0;
            while (true) {
                if (i >= a.size()) {
                    break;
                }
                aqax aqaxVar = (aqax) a.get(i);
                if (aqaxVar.b == 62285947) {
                    aqavVar2 = (aqav) aqaxVar.c;
                } else {
                    aqavVar2 = aqav.a;
                }
                if (i(aqavVar, aqavVar2)) {
                    amuf amufVar = new amuf();
                    amufVar.j(a.subList(0, i));
                    if (i < a.size() - 1) {
                        amufVar.j(a.subList(i + 1, a.size()));
                    }
                    this.c.b(aqbmVar, amufVar.g());
                    aqavVar = aqavVar2;
                } else {
                    i++;
                }
            }
        }
        xmh xmhVar = this.a;
        ArrayList arrayList = new ArrayList(zew.L(xmhVar.a, this.b));
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((xmg) arrayList.get(i2)).l(aqavVar);
        }
    }

    @Override // defpackage.xmd
    public void d() {
        xmh xmhVar = this.a;
        ArrayList arrayList = new ArrayList(zew.L(xmhVar.a, this.b));
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((xmg) arrayList.get(i)).m();
        }
    }

    @Override // defpackage.xmd
    public void e(aqav aqavVar) {
        if (aqavVar == null) {
            return;
        }
        aopa createBuilder = aqax.a.createBuilder();
        createBuilder.copyOnWrite();
        aqax aqaxVar = (aqax) createBuilder.instance;
        aqaxVar.c = aqavVar;
        aqaxVar.b = 62285947;
        aqax aqaxVar2 = (aqax) createBuilder.mo39build();
        aopa mo52toBuilder = this.b.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        aqbw aqbwVar = (aqbw) mo52toBuilder.instance;
        aqaxVar2.getClass();
        aqbwVar.c = aqaxVar2;
        aqbwVar.b |= 1;
        k((aqbw) mo52toBuilder.mo39build());
    }

    @Override // defpackage.xmd
    public void f(aqav aqavVar, aqav aqavVar2) {
        aqav aqavVar3;
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
            if (!this.c.a(aqbmVar).isEmpty()) {
                List a = this.c.a(aqbmVar);
                int i = 0;
                while (true) {
                    if (i >= a.size()) {
                        break;
                    }
                    aqax aqaxVar = (aqax) a.get(i);
                    if (aqaxVar.b == 62285947) {
                        aqavVar3 = (aqav) aqaxVar.c;
                    } else {
                        aqavVar3 = aqav.a;
                    }
                    if (i(aqavVar3, aqavVar)) {
                        xyd xydVar = this.e;
                        xydVar.c(aqavVar2, xydVar.a(aqavVar3));
                        aopa createBuilder = aqax.a.createBuilder();
                        createBuilder.copyOnWrite();
                        aqax aqaxVar2 = (aqax) createBuilder.instance;
                        aqavVar2.getClass();
                        aqaxVar2.c = aqavVar2;
                        aqaxVar2.b = 62285947;
                        amuf amufVar = new amuf();
                        amufVar.j(a.subList(0, i));
                        amufVar.h((aqax) createBuilder.mo39build());
                        if (i < a.size() - 1) {
                            amufVar.j(a.subList(i + 1, a.size()));
                        }
                        this.c.b(aqbmVar, amufVar.g());
                        aqavVar = aqavVar3;
                    } else {
                        i++;
                    }
                }
            }
        }
        xmh xmhVar = this.a;
        ArrayList arrayList = new ArrayList(zew.L(xmhVar.a, this.b));
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((xmg) arrayList.get(i2)).o(aqavVar, aqavVar2);
        }
    }

    @Override // defpackage.xmd
    public final void g(aqav aqavVar, aqav aqavVar2) {
        this.e.c(aqavVar2, aqavVar);
        ArrayList arrayList = new ArrayList(zew.L(this.a.b, aqavVar2));
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((xmf) arrayList.get(i)).d(aqavVar2);
        }
    }

    @Override // defpackage.xmd
    public final boolean h() {
        return this.d instanceof xma;
    }

    public final void j(aqav aqavVar) {
        aopa createBuilder = aqax.a.createBuilder();
        if (aqavVar != null) {
            createBuilder.copyOnWrite();
            aqax aqaxVar = (aqax) createBuilder.instance;
            aqaxVar.c = aqavVar;
            aqaxVar.b = 62285947;
        }
        aqbo aqboVar = this.b.f;
        if (aqboVar == null) {
            aqboVar = aqbo.a;
        }
        if ((aqboVar.b & 1) == 0) {
            aopa createBuilder2 = aqbo.a.createBuilder();
            aopa createBuilder3 = aqbm.a.createBuilder();
            String uuid = UUID.randomUUID().toString();
            createBuilder3.copyOnWrite();
            aqbm aqbmVar = (aqbm) createBuilder3.instance;
            uuid.getClass();
            aqbmVar.c |= 4096;
            aqbmVar.i = uuid;
            aqbm aqbmVar2 = (aqbm) createBuilder3.mo39build();
            createBuilder2.copyOnWrite();
            aqbo aqboVar2 = (aqbo) createBuilder2.instance;
            aqbmVar2.getClass();
            aqboVar2.c = aqbmVar2;
            aqboVar2.b |= 1;
            aqbo aqboVar3 = (aqbo) createBuilder2.mo39build();
            aopa mo52toBuilder = this.b.mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            aqbw aqbwVar = (aqbw) mo52toBuilder.instance;
            aqboVar3.getClass();
            aqbwVar.f = aqboVar3;
            aqbwVar.b |= 32;
            k((aqbw) mo52toBuilder.mo39build());
        }
        aqbo aqboVar4 = this.b.f;
        if (aqboVar4 == null) {
            aqboVar4 = aqbo.a;
        }
        aqbm aqbmVar3 = aqboVar4.c;
        if (aqbmVar3 == null) {
            aqbmVar3 = aqbm.a;
        }
        amuf amufVar = new amuf();
        amufVar.j(this.c.a(aqbmVar3));
        amufVar.h((aqax) createBuilder.mo39build());
        this.c.b(aqbmVar3, amufVar.g());
        ArrayList arrayList = new ArrayList(zew.L(this.a.a, this.b));
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((xmg) arrayList.get(i)).k(aqavVar);
        }
    }

    public final void k(aqbw aqbwVar) {
        aqav aqavVar;
        aqav aqavVar2;
        xmh xmhVar = this.a;
        aqbw aqbwVar2 = this.b;
        ArrayList arrayList = new ArrayList(zew.L(xmhVar.a, aqbwVar2));
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xmg xmgVar = (xmg) arrayList.get(i);
            zew.M(xmhVar.a, aqbwVar, xmgVar);
            xmhVar.b(aqbwVar2, xmgVar);
        }
        aqax aqaxVar = this.b.c;
        if (aqaxVar == null) {
            aqaxVar = aqax.a;
        }
        if (aqaxVar.b == 62285947) {
            aqax aqaxVar2 = this.b.c;
            if (aqaxVar2 == null) {
                aqaxVar2 = aqax.a;
            }
            if (aqaxVar2.b == 62285947) {
                aqavVar = (aqav) aqaxVar2.c;
            } else {
                aqavVar = aqav.a;
            }
        } else {
            aqavVar = null;
        }
        ajyj ajyjVar = this.d;
        if (ajyjVar instanceof ajzu) {
            ((ajzu) ajyjVar).O(this.b, aqbwVar);
        }
        this.b = aqbwVar;
        apzt apztVar = this.f.b().z;
        if (apztVar == null) {
            apztVar = apzt.a;
        }
        if (apztVar.b) {
            aqax aqaxVar3 = aqbwVar.c;
            if (aqaxVar3 == null) {
                aqaxVar3 = aqax.a;
            }
            if (aqaxVar3.b == 62285947) {
                aqavVar2 = (aqav) aqaxVar3.c;
            } else {
                aqavVar2 = aqav.a;
            }
            xmh xmhVar2 = this.a;
            ArrayList arrayList2 = new ArrayList(zew.L(xmhVar2.a, this.b));
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((xmg) arrayList2.get(i2)).n(aqavVar, aqavVar2);
            }
        }
    }
}
