package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: suz  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class suz implements svy {
    private final /* synthetic */ int c;
    public static final /* synthetic */ suz b = new suz(1);
    public static final /* synthetic */ suz a = new suz();

    private /* synthetic */ suz() {
    }

    private /* synthetic */ suz(int i) {
        this.c = i;
    }

    @Override // defpackage.svy
    public final cyp a(cyv cyvVar, tda tdaVar, Object obj, String str, aodt aodtVar, suc sucVar, List list) {
        if (this.c == 0) {
            axmw axmwVar = (axmw) obj;
            String str2 = sva.a;
            sux a2 = suy.a(cyvVar);
            a2.h(sva.b(aodtVar));
            a2.g(list);
            int b2 = axmwVar.b(4);
            if (b2 != 0 && axmwVar.b.get(b2 + axmwVar.a) != 0) {
                a2.T();
                String str3 = sva.a;
                int andIncrement = sva.b.getAndIncrement();
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 11);
                sb.append(str3);
                sb.append(andIncrement);
                a2.C(sb.toString());
            }
            return a2;
        }
        axmq axmqVar = (axmq) obj;
        sux a3 = suy.a(cyvVar);
        a3.h(sva.b(aodtVar));
        a3.g(list);
        int b3 = axmqVar.b(6);
        long j = 0;
        int i = (int) (b3 != 0 ? axmqVar.b.getInt(b3 + axmqVar.a) & 4294967295L : 0L);
        if (i != 0) {
            a3.a.f = Integer.valueOf(i);
        }
        int b4 = axmqVar.b(4);
        if (b4 != 0) {
            j = axmqVar.b.getInt(b4 + axmqVar.a) & 4294967295L;
        }
        int i2 = (int) j;
        if (i2 != 0) {
            a3.a.w = Integer.valueOf(i2);
        }
        aodt c = sva.c(aodtVar);
        if (c != null && c.X() != null) {
            a3.a.v = c.X();
        }
        axml axmlVar = new axml();
        if (!tfy.m(aodtVar, axmlVar) || !aodq.r(axmlVar, 14)) {
            a3.u(true);
        } else {
            a3.u(axmlVar.aG());
        }
        return a3;
    }
}
