package defpackage;

import com.google.protos.youtube.api.innertube.HomeAdsPanelHideCommandOuterClass;
import com.google.protos.youtube.api.innertube.HomeAdsPanelShowCommandOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: enh  reason: default package */
/* loaded from: classes3.dex */
public final class enh implements aafl {
    private final mas a;
    private final /* synthetic */ int b;

    public enh(mas masVar) {
        this.a = masVar;
    }

    public enh(mas masVar, int i) {
        this.b = i;
        this.a = masVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (this.b == 0) {
            if (this.a == null || !apzgVar.qn(HomeAdsPanelShowCommandOuterClass.homeAdsPanelShowCommand)) {
                return;
            }
            argo argoVar = (argo) apzgVar.qm(HomeAdsPanelShowCommandOuterClass.homeAdsPanelShowCommand);
            if ((argoVar.b & 1) == 0) {
                return;
            }
            mas masVar = this.a;
            String str = argoVar.c;
            if (!masVar.a.containsKey(str)) {
                return;
            }
            argn argnVar = (argn) masVar.a.get(str);
            masVar.c.push(argnVar);
            if (masVar.c.size() == 1) {
                masVar.d.a();
                maq a = masVar.a();
                a.a.qv(a.b.getSupportFragmentManager(), null);
            }
            masVar.a().a(argnVar);
        } else if (this.a == null || !apzgVar.qn(HomeAdsPanelHideCommandOuterClass.homeAdsPanelHideCommand)) {
        } else {
            argm argmVar = (argm) apzgVar.qm(HomeAdsPanelHideCommandOuterClass.homeAdsPanelHideCommand);
            if ((argmVar.b & 1) == 0) {
                return;
            }
            mas masVar2 = this.a;
            String str2 = argmVar.c;
            argn argnVar2 = (argn) masVar2.c.peek();
            if (argnVar2 == null || !argnVar2.c.equals(str2)) {
                return;
            }
            masVar2.c.pop();
            if (masVar2.c.isEmpty()) {
                masVar2.a().a.dismiss();
            } else {
                masVar2.a().a((argn) masVar2.c.peek());
            }
        }
    }
}
