package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: agvj  reason: default package */
/* loaded from: classes.dex */
public final class agvj extends aaqs {
    public final List a;
    public long b;

    public agvj(aaqf aaqfVar, afvm afvmVar) {
        super("offline/offline_video_playback_position_sync", aaqfVar, afvmVar);
        this.a = new ArrayList();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = atsn.a.createBuilder();
        List list = this.a;
        createBuilder.copyOnWrite();
        atsn atsnVar = (atsn) createBuilder.instance;
        aopu aopuVar = atsnVar.d;
        if (!aopuVar.c()) {
            atsnVar.d = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll((Iterable) list, (List) atsnVar.d);
        long j = this.b;
        createBuilder.copyOnWrite();
        atsn atsnVar2 = (atsn) createBuilder.instance;
        atsnVar2.b |= 2;
        atsnVar2.e = j;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aqxo.p(this.b >= 0);
        aqxo.p(!this.a.isEmpty());
    }
}
