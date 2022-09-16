package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aata  reason: default package */
/* loaded from: classes.dex */
public final class aata extends aaqs {
    public final List a;
    public final List b;
    public long c;
    public long d;
    public int s;
    public float t;
    public int u;
    private final List v;
    private final List w;

    public aata(aaqf aaqfVar, afvm afvmVar) {
        super("offline/auto_offline", aaqfVar, afvmVar);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arle.a.createBuilder();
        long j = this.c;
        createBuilder.copyOnWrite();
        arle arleVar = (arle) createBuilder.instance;
        arleVar.b |= 2;
        arleVar.d = j;
        long j2 = this.d;
        createBuilder.copyOnWrite();
        arle arleVar2 = (arle) createBuilder.instance;
        arleVar2.b |= 4;
        arleVar2.e = j2;
        int i = this.s;
        createBuilder.copyOnWrite();
        arle arleVar3 = (arle) createBuilder.instance;
        arleVar3.b |= 8;
        arleVar3.f = i;
        float f = this.t;
        createBuilder.copyOnWrite();
        arle arleVar4 = (arle) createBuilder.instance;
        arleVar4.b |= 16;
        arleVar4.g = f;
        int i2 = this.u;
        createBuilder.copyOnWrite();
        arle arleVar5 = (arle) createBuilder.instance;
        arleVar5.b |= 32;
        arleVar5.h = i2;
        List list = this.a;
        createBuilder.copyOnWrite();
        arle arleVar6 = (arle) createBuilder.instance;
        aopu aopuVar = arleVar6.i;
        if (!aopuVar.c()) {
            arleVar6.i = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll((Iterable) list, (List) arleVar6.i);
        List list2 = this.b;
        createBuilder.copyOnWrite();
        arle arleVar7 = (arle) createBuilder.instance;
        aopu aopuVar2 = arleVar7.k;
        if (!aopuVar2.c()) {
            arleVar7.k = aopi.mutableCopy(aopuVar2);
        }
        aonk.addAll((Iterable) list2, (List) arleVar7.k);
        List list3 = this.v;
        createBuilder.copyOnWrite();
        arle arleVar8 = (arle) createBuilder.instance;
        aopu aopuVar3 = arleVar8.l;
        if (!aopuVar3.c()) {
            arleVar8.l = aopi.mutableCopy(aopuVar3);
        }
        aonk.addAll((Iterable) list3, (List) arleVar8.l);
        List list4 = this.w;
        createBuilder.copyOnWrite();
        arle arleVar9 = (arle) createBuilder.instance;
        aopu aopuVar4 = arleVar9.j;
        if (!aopuVar4.c()) {
            arleVar9.j = aopi.mutableCopy(aopuVar4);
        }
        aonk.addAll((Iterable) list4, (List) arleVar9.j);
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        boolean z = true;
        aqxo.p(this.c >= 0);
        aqxo.p(this.d >= 0);
        aqxo.p(true);
        float f = this.t;
        aqxo.p(f >= 0.0f && f <= 1.0f);
        if (this.u < 0) {
            z = false;
        }
        aqxo.p(z);
    }
}
