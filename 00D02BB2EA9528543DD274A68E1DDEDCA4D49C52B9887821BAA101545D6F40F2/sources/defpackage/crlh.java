package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: crlh  reason: default package */
/* loaded from: classes5.dex */
public final class crlh {
    private final List<dozz> a = new ArrayList();
    private final dbsl<dozz> b;
    private final dcdn<doyd, Integer> c;
    private final Integer d;
    private amub e;

    public crlh(dbsl<dozz> dbslVar, dcdn<doyd, Integer> dcdnVar, Integer num) {
        this.b = dbslVar;
        this.c = dcdnVar;
        this.d = num;
    }

    public final void a(cqzw cqzwVar) {
        dozs dozsVar;
        this.a.clear();
        amub amubVar = cqzwVar.g;
        this.e = amubVar;
        dpeq dpeqVar = amubVar.s;
        if (dpeqVar == null) {
            return;
        }
        double d = cqzwVar.b;
        for (dozz dozzVar : dpeqVar.e) {
            if (dozzVar.b == 22) {
                dozsVar = (dozs) dozzVar.c;
            } else {
                dozsVar = dozs.q;
            }
            dozl dozlVar = dozsVar.j;
            if (dozlVar == null) {
                dozlVar = dozl.e;
            }
            if (dozlVar.b > d && this.b.a(dozzVar)) {
                this.a.add(dozzVar);
            }
        }
    }

    @dzsi
    public final dozz b(cqzw cqzwVar) {
        dozs dozsVar;
        amub amubVar = this.e;
        if (amubVar == null || !amubVar.equals(cqzwVar.g)) {
            a(cqzwVar);
        }
        if (!this.a.isEmpty()) {
            int B = cqzwVar.g.B(cqzwVar.b);
            ListIterator<dozz> listIterator = this.a.listIterator();
            while (true) {
                if (!listIterator.hasNext()) {
                    break;
                }
                dozz next = listIterator.next();
                amub amubVar2 = cqzwVar.g;
                if (next.b == 22) {
                    dozsVar = (dozs) next.c;
                } else {
                    dozsVar = dozs.q;
                }
                dozl dozlVar = dozsVar.j;
                if (dozlVar == null) {
                    dozlVar = dozl.e;
                }
                int B2 = B - amubVar2.B(dozlVar.b);
                doyd b = doyd.b(next.t);
                if (b == null) {
                    b = doyd.INCIDENT_OTHER;
                }
                Integer num = this.c.get(b);
                if (num == null) {
                    num = this.d;
                }
                if (B2 <= num.intValue()) {
                    listIterator.remove();
                    if (B2 > 0) {
                        return next;
                    }
                }
            }
        }
        return null;
    }
}
