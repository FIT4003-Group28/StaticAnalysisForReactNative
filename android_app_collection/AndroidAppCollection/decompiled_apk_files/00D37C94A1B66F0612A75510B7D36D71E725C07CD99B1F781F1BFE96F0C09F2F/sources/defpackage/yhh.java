package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.protos.youtube.api.innertube.SectionListRendererOuterClass;
/* compiled from: PG */
/* renamed from: yhh  reason: default package */
/* loaded from: classes4.dex */
public final class yhh implements ajru, akai, ajzs {
    public final RecyclerView a;
    private final ajzq b;
    private aakw c;

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, ajsa] */
    public yhh(Context context, acti actiVar, ajsg ajsgVar, aari aariVar, yni yniVar, ajyk ajykVar, yzj yzjVar, azqb azqbVar, aadd aaddVar, aynx aynxVar) {
        RecyclerView recyclerView = new RecyclerView(context);
        this.a = recyclerView;
        recyclerView.ag(new LinearLayoutManager());
        this.b = new ajzq(null, recyclerView, ajsgVar, new ajyx(), aariVar, yniVar, ajykVar, yzjVar, actiVar, ((ajyi) azqbVar.get()).get(), this, this, aaddVar, aynxVar);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajzs
    public final void c(int i) {
    }

    @Override // defpackage.ajru
    /* renamed from: d */
    public final void oK(ajrs ajrsVar, auyo auyoVar) {
        acti actiVar = ajrsVar.a;
        aunb aunbVar = auyoVar.c;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(SectionListRendererOuterClass.sectionListRenderer)) {
            aunb aunbVar2 = auyoVar.c;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            aakw aakwVar = new aakw((auqh) aunbVar2.qm(SectionListRendererOuterClass.sectionListRenderer));
            this.c = aakwVar;
            this.b.K(aakwVar);
            actiVar.u(new acte(auyoVar.d), null);
        }
    }

    @Override // defpackage.akai
    public final void ll() {
        this.b.ll();
    }

    @Override // defpackage.akai
    public final boolean lm() {
        return false;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
