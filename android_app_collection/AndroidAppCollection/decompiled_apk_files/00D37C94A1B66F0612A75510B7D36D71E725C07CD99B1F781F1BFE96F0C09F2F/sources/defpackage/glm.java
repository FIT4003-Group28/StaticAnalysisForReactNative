package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Map;
/* compiled from: PG */
/* renamed from: glm  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class glm {
    public final /* synthetic */ gls a;
    public final /* synthetic */ ajwb b;
    public final /* synthetic */ RecyclerView c;
    public final /* synthetic */ Map d;

    public /* synthetic */ glm(gls glsVar, ajwb ajwbVar, RecyclerView recyclerView, Map map) {
        this.a = glsVar;
        this.b = ajwbVar;
        this.c = recyclerView;
        this.d = map;
    }

    public final void a(aoob aoobVar) {
        gls glsVar = this.a;
        ajwb ajwbVar = this.b;
        RecyclerView recyclerView = this.c;
        Map map = this.d;
        gls.b(ajwbVar.f, recyclerView);
        Object obj = map.get("chipSelected");
        apvg apvgVar = obj instanceof apvg ? (apvg) obj : null;
        if (apvgVar == null || (apvgVar.b & 4096) == 0 || aoobVar == null) {
            return;
        }
        glsVar.b.o(new acte(aoobVar), new acte(apvgVar.l));
    }
}
