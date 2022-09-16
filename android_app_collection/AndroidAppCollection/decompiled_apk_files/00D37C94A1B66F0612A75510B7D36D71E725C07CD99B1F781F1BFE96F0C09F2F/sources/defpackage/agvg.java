package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: agvg  reason: default package */
/* loaded from: classes.dex */
public final class agvg extends aaqs {
    public final aadd a;
    public final List b;
    public long c;
    public long d;
    public int s;
    public float t;

    public agvg(aaqf aaqfVar, afvm afvmVar, aadd aaddVar) {
        super("offline/playlist_sync_check", aaqfVar, afvmVar);
        this.a = aaddVar;
        this.b = new ArrayList();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = aryo.a.createBuilder();
        long j = this.c;
        createBuilder.copyOnWrite();
        aryo aryoVar = (aryo) createBuilder.instance;
        aryoVar.b |= 2;
        aryoVar.e = j;
        long j2 = this.d;
        createBuilder.copyOnWrite();
        aryo aryoVar2 = (aryo) createBuilder.instance;
        aryoVar2.b |= 4;
        aryoVar2.f = j2;
        int i = this.s;
        createBuilder.copyOnWrite();
        aryo aryoVar3 = (aryo) createBuilder.instance;
        aryoVar3.b |= 8;
        aryoVar3.g = i;
        float f = this.t;
        createBuilder.copyOnWrite();
        aryo aryoVar4 = (aryo) createBuilder.instance;
        aryoVar4.b |= 16;
        aryoVar4.h = f;
        List list = this.b;
        createBuilder.copyOnWrite();
        aryo aryoVar5 = (aryo) createBuilder.instance;
        aopu aopuVar = aryoVar5.d;
        if (!aopuVar.c()) {
            aryoVar5.d = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll((Iterable) list, (List) aryoVar5.d);
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        boolean z = true;
        aqxo.y(this.b.size() > 0);
        aqxo.p(this.c >= 0);
        aqxo.p(this.d >= 0);
        aqxo.p(true);
        float f = this.t;
        if (f < 0.0f || f > 1.0f) {
            z = false;
        }
        aqxo.p(z);
    }
}
