package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: agvh  reason: default package */
/* loaded from: classes.dex */
public final class agvh extends aaqs {
    public final List a;
    public final List b;

    /* JADX INFO: Access modifiers changed from: protected */
    public agvh(aaqf aaqfVar, afvm afvmVar) {
        super("offline", aaqfVar, afvmVar);
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = aryr.a.createBuilder();
        List list = this.a;
        createBuilder.copyOnWrite();
        aryr aryrVar = (aryr) createBuilder.instance;
        aopu aopuVar = aryrVar.d;
        if (!aopuVar.c()) {
            aryrVar.d = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll((Iterable) list, (List) aryrVar.d);
        List list2 = this.b;
        createBuilder.copyOnWrite();
        aryr aryrVar2 = (aryr) createBuilder.instance;
        aopu aopuVar2 = aryrVar2.e;
        if (!aopuVar2.c()) {
            aryrVar2.e = aopi.mutableCopy(aopuVar2);
        }
        aonk.addAll((Iterable) list2, (List) aryrVar2.e);
        createBuilder.copyOnWrite();
        aryr aryrVar3 = (aryr) createBuilder.instance;
        aryrVar3.b |= 2;
        aryrVar3.f = false;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aqxo.y(this.a.size() > 0 || this.b.size() > 0);
        aqxo.y(true);
    }
}
