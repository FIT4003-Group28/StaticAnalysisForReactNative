package defpackage;

import java.util.ArrayDeque;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: chg  reason: default package */
/* loaded from: classes2.dex */
public final class chg {
    public final ArrayDeque a = new ArrayDeque();
    final /* synthetic */ chi b;

    public chg(chi chiVar) {
        this.b = chiVar;
    }

    public final synchronized chf a(cnf cnfVar) {
        chf chfVar;
        chfVar = (chf) this.a.poll();
        if (chfVar == null) {
            chfVar = new chf(this.b);
        }
        System.currentTimeMillis();
        chfVar.b = cnfVar;
        return chfVar;
    }
}
