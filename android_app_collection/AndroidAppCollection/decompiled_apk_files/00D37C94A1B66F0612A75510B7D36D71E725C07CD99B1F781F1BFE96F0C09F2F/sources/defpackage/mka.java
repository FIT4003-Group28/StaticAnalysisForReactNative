package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.protos.youtube.api.innertube.HintRendererOuterClass;
/* compiled from: PG */
/* renamed from: mka  reason: default package */
/* loaded from: classes3.dex */
public final class mka implements ajru {
    public final View a;
    public final mjz b = new mjz(this);
    public RecyclerView c;
    private final akfb d;

    public mka(Context context, akfb akfbVar) {
        this.d = akfbVar;
        View view = new View(context);
        this.a = view;
        view.setMinimumHeight(1);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arga argaVar = (arga) obj;
        aunb aunbVar = argaVar.b;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        argj argjVar = (argj) ajjh.l(aunbVar, HintRendererOuterClass.hintRenderer);
        if (argjVar == null) {
            return;
        }
        Object c = ajrsVar.c("sectionListController");
        RecyclerView recyclerView = c instanceof ajzq ? ((ajzq) c).f60J : null;
        this.c = recyclerView;
        if (recyclerView != null) {
            recyclerView.post(new mjy(this));
        }
        this.d.b(argjVar, this.a, argaVar, ajrsVar.a);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            recyclerView.post(new mjy(this, 1));
        }
    }
}
