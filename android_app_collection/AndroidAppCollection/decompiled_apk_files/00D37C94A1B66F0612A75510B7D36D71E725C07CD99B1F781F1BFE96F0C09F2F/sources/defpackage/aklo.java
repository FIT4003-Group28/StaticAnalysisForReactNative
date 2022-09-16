package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aklo  reason: default package */
/* loaded from: classes.dex */
public final class aklo extends ajwd implements aklk, akpd {
    public final Context a;
    public final aklw b;
    public final ajxz c;
    public final aafo d;
    private final ajsm e;
    private final List f = new ArrayList();

    public aklo(avnm avnmVar, Context context, aklw aklwVar, ajxz ajxzVar, aafo aafoVar) {
        ajsm ajsmVar = new ajsm();
        this.e = ajsmVar;
        ajsmVar.mG(new kxi(5));
        ajsmVar.mG(new kxi(6));
        this.a = context;
        this.b = aklwVar;
        this.c = ajxzVar;
        this.d = aafoVar;
        for (aunb aunbVar : avnmVar.b) {
            if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
                apoj apojVar = (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer);
                this.f.add(apojVar);
                this.e.add(apojVar);
            }
        }
        aklwVar.i(true);
    }

    @Override // defpackage.aklk
    public final void b(List list) {
    }

    @Override // defpackage.aklk
    public final void c(ajsa ajsaVar) {
        ajsaVar.f(apoj.class, new ajry() { // from class: akln
            @Override // defpackage.ajry
            public final ajru b(ViewGroup viewGroup) {
                aklo akloVar = aklo.this;
                return new akpe(akloVar.a, akloVar, akloVar.c, akloVar.d);
            }
        });
    }

    @Override // defpackage.ajyj
    public final ajqm lA() {
        return this.e;
    }
}
