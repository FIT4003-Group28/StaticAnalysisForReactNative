package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aftc  reason: default package */
/* loaded from: classes.dex */
public final class aftc implements afsw {
    private final atxg a;

    public aftc(int i, List list) {
        aopa createBuilder = atxg.a.createBuilder();
        createBuilder.copyOnWrite();
        atxg atxgVar = (atxg) createBuilder.instance;
        atxgVar.b |= 1;
        atxgVar.c = i;
        createBuilder.copyOnWrite();
        atxg atxgVar2 = (atxg) createBuilder.instance;
        aopq aopqVar = atxgVar2.d;
        if (!aopqVar.c()) {
            atxgVar2.d = aopi.mutableCopy(aopqVar);
        }
        aonk.addAll((Iterable) list, (List) atxgVar2.d);
        createBuilder.copyOnWrite();
        atxg atxgVar3 = (atxg) createBuilder.instance;
        atxgVar3.b |= 2;
        atxgVar3.e = 60;
        createBuilder.copyOnWrite();
        atxg atxgVar4 = (atxg) createBuilder.instance;
        atxgVar4.b |= 4;
        atxgVar4.f = true;
        this.a = (atxg) createBuilder.mo39build();
    }

    @Override // defpackage.afsw
    public final int a() {
        return this.a.c;
    }

    @Override // defpackage.afsw
    public final int b() {
        return this.a.e;
    }

    @Override // defpackage.afsw
    public final List c() {
        return this.a.d;
    }

    @Override // defpackage.afsw
    public final boolean d() {
        return this.a.f;
    }

    public aftc(atxg atxgVar) {
        atxgVar.getClass();
        this.a = atxgVar;
    }
}
