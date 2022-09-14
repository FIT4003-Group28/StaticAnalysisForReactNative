package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: alzq  reason: default package */
/* loaded from: classes2.dex */
public final class alzq {
    private final dzsj<akwu> a;
    private final alyl b;

    public alzq(dzsj<akwu> dzsjVar, alyl alylVar) {
        this.a = dzsjVar;
        this.b = alylVar;
    }

    public final dmxh a(dmxl dmxlVar) {
        dmxh dmxhVar;
        String m;
        dmxj dmxjVar;
        dmxp dmxpVar = this.a.a().e().b;
        if (dmxpVar == null) {
            dmxpVar = dmxp.c;
        }
        Iterator<dmxj> it = dmxpVar.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                dmxhVar = null;
                break;
            }
            dmxj next = it.next();
            dmxl b = dmxl.b(next.b);
            if (b == null) {
                b = dmxl.UNKNOWN;
                continue;
            }
            if (b == dmxlVar) {
                dmxhVar = next.c;
                if (dmxhVar == null) {
                    dmxhVar = dmxh.j;
                }
            }
        }
        if (!this.b.k().equals("") && this.b.l() && (m = this.b.m()) != null && (dmxjVar = this.a.a().g().b.get(m)) != null) {
            dmxl b2 = dmxl.b(dmxjVar.b);
            if (b2 == null) {
                b2 = dmxl.UNKNOWN;
            }
            if (b2.equals(dmxlVar) && (dmxjVar.a & 2) != 0) {
                dmxh dmxhVar2 = dmxjVar.c;
                return dmxhVar2 == null ? dmxh.j : dmxhVar2;
            }
        }
        return dmxhVar;
    }
}
