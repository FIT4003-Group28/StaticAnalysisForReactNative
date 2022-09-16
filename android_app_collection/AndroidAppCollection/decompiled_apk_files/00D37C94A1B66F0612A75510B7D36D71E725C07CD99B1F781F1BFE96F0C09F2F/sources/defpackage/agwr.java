package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: agwr  reason: default package */
/* loaded from: classes.dex */
public final class agwr {
    public agql a;
    public int b = -1;
    public int c = 1;
    private final ArrayList d = new ArrayList();

    public final agws a() {
        int i;
        int i2;
        agql agqlVar = this.a;
        if (agqlVar == null || (i = this.b) < 0 || (i2 = this.c) == 1) {
            throw new IllegalArgumentException("OfflineStreamVerificationResult.Builder not properly initialized");
        }
        ArrayList arrayList = this.d;
        return new agws(agqlVar, i, i2, (atqc[]) arrayList.toArray(new atqc[arrayList.size()]));
    }

    public final void b(long j) {
        aopa createBuilder = atqc.a.createBuilder();
        int a = this.a.a();
        createBuilder.copyOnWrite();
        atqc atqcVar = (atqc) createBuilder.instance;
        atqcVar.b |= 1;
        atqcVar.c = a;
        createBuilder.copyOnWrite();
        atqc atqcVar2 = (atqc) createBuilder.instance;
        atqcVar2.b |= 2;
        atqcVar2.d = j;
        this.d.add((atqc) createBuilder.mo39build());
    }
}
