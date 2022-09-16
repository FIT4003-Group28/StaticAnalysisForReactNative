package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.google.protos.youtube.api.innertube.RelatedChipEndpoint$RelatedChipCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gls  reason: default package */
/* loaded from: classes3.dex */
public final class gls implements aafl {
    public static final /* synthetic */ int c = 0;
    private static final ajxo d = new ioj(1);
    public final yzj a;
    public final acti b;
    private final ajxh e;

    public gls(yzj yzjVar, acti actiVar, glr glrVar) {
        this.a = yzjVar;
        this.b = actiVar;
        this.e = glrVar;
    }

    public static void b(final ajrw ajrwVar, View view) {
        final int integer = view.getResources().getInteger(17694720);
        final ajrv ajrvVar = new ajrv() { // from class: gln
            @Override // defpackage.ajrv
            public final void m(ajru ajruVar, Object obj) {
                int i = integer;
                int i2 = gls.c;
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(i);
                ajruVar.a().startAnimation(alphaAnimation);
            }
        };
        ajrwVar.g(ajrvVar);
        view.post(new Runnable() { // from class: glp
            @Override // java.lang.Runnable
            public final void run() {
                ajrw ajrwVar2 = ajrw.this;
                ajrv ajrvVar2 = ajrvVar;
                int i = gls.c;
                ajrwVar2.i(ajrvVar2);
            }
        });
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        odd oddVar;
        ajwb ajwbVar;
        RelatedChipEndpoint$RelatedChipCommand relatedChipEndpoint$RelatedChipCommand = (RelatedChipEndpoint$RelatedChipCommand) apzgVar.qm(RelatedChipEndpoint$RelatedChipCommand.relatedChipCommand);
        if (relatedChipEndpoint$RelatedChipCommand == null || (oddVar = (odd) map.get("sectionController")) == null || (ajwbVar = (ajwb) map.get("sectionListController")) == null) {
            return;
        }
        View q = ajwbVar.q();
        ajrj ajrjVar = ajwbVar.e;
        if (!(q instanceof RecyclerView) || !(ajrjVar instanceof ajrj)) {
            return;
        }
        b(ajwbVar.f, q);
        if (relatedChipEndpoint$RelatedChipCommand.b != 3 || !((Boolean) relatedChipEndpoint$RelatedChipCommand.c).booleanValue()) {
            oddVar.h();
        } else {
            oddVar.g();
        }
        RecyclerView recyclerView = (RecyclerView) q;
        recyclerView.ab(Math.max(0, ajrjVar.j(oddVar.lA())));
        if (relatedChipEndpoint$RelatedChipCommand.b == 3 && ((Boolean) relatedChipEndpoint$RelatedChipCommand.c).booleanValue()) {
            return;
        }
        aumx aumxVar = relatedChipEndpoint$RelatedChipCommand.b == 1 ? (aumx) ((aqgx) relatedChipEndpoint$RelatedChipCommand.c).qm(aumx.b) : null;
        if (aumxVar == null) {
            return;
        }
        this.e.E = new glq(oddVar, new glm(this, ajwbVar, recyclerView, map));
        this.e.D = new ajxb() { // from class: glo
            @Override // defpackage.ajxb
            public final void a(cff cffVar, ajfz ajfzVar) {
                gls.this.a.e(cffVar);
            }
        };
        this.e.Z(ajna.g(aumxVar), d);
    }
}
