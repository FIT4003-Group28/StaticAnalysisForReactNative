package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bzeg  reason: default package */
/* loaded from: classes4.dex */
public final class bzeg implements Serializable {
    public final amte a;
    public final int b;
    public final ddrz c;

    private bzeg(amte amteVar, int i, ddrz ddrzVar) {
        this.a = amteVar;
        this.b = i;
        this.c = ddrzVar;
    }

    @dzsi
    public static bzeg a(amte amteVar, int i, ddrz ddrzVar) {
        bzeg bzegVar;
        int i2;
        if (amteVar != null && (i2 = (bzegVar = new bzeg(amteVar, i, ddrzVar)).b) >= 0 && i2 < bzegVar.a.a.n() && bzegVar.a.c(bzegVar.b) == dqvj.TRANSIT) {
            return bzegVar;
        }
        return null;
    }
}
