package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: afgj  reason: default package */
/* loaded from: classes.dex */
public final class afgj implements ovo, osy {
    public final afev a;
    private final afft b;

    public afgj(afev afevVar, afft afftVar) {
        this.a = afevVar;
        this.b = afftVar;
    }

    private static long b(ovq ovqVar) {
        if (ovqVar instanceof aevc) {
            return ((aevc) ovqVar).n();
        }
        return ovqVar.h;
    }

    @Override // defpackage.ovo
    public final void a(List list, long j, ovm[] ovmVarArr, ovn ovnVar) {
        long j2;
        int i = ovnVar.a;
        int i2 = ovnVar.b;
        ovm ovmVar = ovnVar.c;
        afer aferVar = new afer(i, i2, ovmVar == null ? null : new afgi(ovmVar));
        long b = list.isEmpty() ? 0L : b((ovq) list.get(list.size() - 1)) - j;
        afev afevVar = this.a;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ovq ovqVar = (ovq) it.next();
            ovm ovmVar2 = ovqVar.c;
            afgi afgiVar = ovmVar2 == null ? null : new afgi(ovmVar2);
            if (ovqVar instanceof aevc) {
                j2 = ((aevc) ovqVar).o();
            } else {
                j2 = ovqVar.g;
            }
            long b2 = b(ovqVar);
            pbn pbnVar = ovqVar.d;
            ovqVar.m();
            arrayList.add(new afet(afgiVar, j2, b2));
        }
        afgi[] afgiVarArr = new afgi[ovmVarArr.length];
        for (int i3 = 0; i3 < ovmVarArr.length; i3++) {
            ovm ovmVar3 = ovmVarArr[i3];
            if (ovmVar3 != null) {
                afgiVarArr[i3] = new afgi(ovmVar3);
            }
        }
        afevVar.a(arrayList, j, b, afgiVarArr, aferVar);
        ovnVar.a = aferVar.a;
        ovnVar.b = aferVar.b;
        afes afesVar = aferVar.c;
        ovnVar.c = afesVar instanceof afgi ? ((afgi) afesVar).a : null;
        afft afftVar = this.b;
        int i4 = aferVar.a;
        aepk aepkVar = aferVar.d;
        if (aepkVar == null) {
            aepkVar = aepk.a;
        }
        aegx aegxVar = aferVar.e;
        if (aegxVar == null) {
            aegxVar = aegx.a;
        }
        afftVar.a(list, i4, aepkVar, aegxVar);
    }

    @Override // defpackage.osy
    public final void k(int i, Object obj) {
        if (i == 0) {
            if (obj instanceof afmv) {
                this.a.g((afmv) obj);
                return;
            }
            i = 0;
        }
        if (i == 1) {
            if (obj instanceof aegx) {
                this.a.f((aegx) obj);
                return;
            }
            i = 1;
        }
        if (i == 4) {
            this.a.d(((Float) obj).floatValue());
        } else if (i == 2) {
            this.a.e();
        } else if (i != 3) {
        } else {
            this.a.b(((Boolean) obj).booleanValue());
        }
    }
}
