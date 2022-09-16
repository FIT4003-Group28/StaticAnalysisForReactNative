package defpackage;

import android.content.res.Resources;
import com.google.android.youtube.R;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: itl  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class itl implements Callable {
    public final /* synthetic */ its a;
    private final /* synthetic */ int b;

    public /* synthetic */ itl(its itsVar, int i) {
        this.b = i;
        this.a = itsVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.b == 0) {
            return ampq.i((aawr) this.a.b.a().c());
        }
        Resources resources = this.a.c;
        aopa createBuilder = aruk.a.createBuilder();
        aopa createBuilder2 = arul.a.createBuilder();
        aopa createBuilder3 = atxm.a.createBuilder();
        createBuilder3.aF(its.c("FEwhat_to_watch", resources.getString(R.string.home), arhr.PIVOT_HOME));
        createBuilder3.aF(its.c("FEexplore", resources.getString(R.string.explore), arhr.TAB_EXPLORE));
        createBuilder3.aF(its.c("FEsubscriptions", resources.getString(R.string.subscriptions), arhr.PIVOT_SUBSCRIPTIONS));
        createBuilder3.aF(its.c("FElibrary", resources.getString(R.string.library), arhr.PIVOT_LIBRARY));
        createBuilder2.copyOnWrite();
        arul arulVar = (arul) createBuilder2.instance;
        atxm atxmVar = (atxm) createBuilder3.mo39build();
        atxmVar.getClass();
        arulVar.c = atxmVar;
        arulVar.b = 117866661;
        arul arulVar2 = (arul) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        aruk arukVar = (aruk) createBuilder.instance;
        arulVar2.getClass();
        aopu aopuVar = arukVar.d;
        if (!aopuVar.c()) {
            arukVar.d = aopi.mutableCopy(aopuVar);
        }
        arukVar.d.add(arulVar2);
        return new aawr((aruk) createBuilder.mo39build());
    }
}
