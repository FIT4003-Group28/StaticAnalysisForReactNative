package defpackage;

import android.app.AlertDialog;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import com.google.protos.youtube.api.innertube.MenuEndpointOuterClass$MenuEndpoint;
import j$.util.Optional;
import j$.util.function.Supplier;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gkj  reason: default package */
/* loaded from: classes3.dex */
public final class gkj implements aafl {
    public static final /* synthetic */ int a = 0;
    private final dt b;
    private final aafo c;
    private final ajxz d;
    private final ajrh e;
    private final ltu f;
    private final acth g;
    private final aakn h;
    private final ajgz i;
    private final lmm j;

    public gkj(dt dtVar, aafo aafoVar, ajxz ajxzVar, ajrh ajrhVar, ltu ltuVar, acth acthVar, aakn aaknVar, lmm lmmVar, ajgz ajgzVar) {
        dtVar.getClass();
        this.b = dtVar;
        aafoVar.getClass();
        this.c = aafoVar;
        ajxzVar.getClass();
        this.d = ajxzVar;
        this.e = ajrhVar;
        this.f = ltuVar;
        this.g = acthVar;
        this.h = aaknVar;
        this.j = lmmVar;
        this.i = ajgzVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        ateu ateuVar;
        arag aragVar;
        ateu ateuVar2;
        ates atesVar = ((MenuEndpointOuterClass$MenuEndpoint) apzgVar.qm(MenuEndpointOuterClass$MenuEndpoint.menuEndpoint)).c;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        if ((atesVar.b & 1) != 0) {
            ates atesVar2 = ((MenuEndpointOuterClass$MenuEndpoint) apzgVar.qm(MenuEndpointOuterClass$MenuEndpoint.menuEndpoint)).c;
            if (atesVar2 == null) {
                atesVar2 = ates.a;
            }
            atep atepVar = atesVar2.c;
            if (atepVar == null) {
                atepVar = atep.a;
            }
            atep atepVar2 = atepVar;
            View view = (View) zew.K(map, "com.google.android.libraries.youtube.rendering.elements.sender_view", View.class);
            Object I = zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
            if (atepVar2.k || ((Boolean) Optional.ofNullable((Bundle) zew.K(map, "com.google.android.libraries.youtube.innertube.bundle", Bundle.class)).map(eoo.q).orElse(false)).booleanValue()) {
                akbc.b(this.b, atepVar2, this.c, this.d, map, this.g, this.h, this.j);
            } else if (view == null) {
                dt dtVar = this.b;
                aafo aafoVar = this.c;
                ajxz ajxzVar = this.d;
                ajrh ajrhVar = this.e;
                fku fkuVar = new fku(atepVar2, aafoVar, this.i, I);
                AlertDialog.Builder builder = new AlertDialog.Builder(dtVar);
                atev atevVar = atepVar2.d;
                if (atevVar == null) {
                    atevVar = atev.a;
                }
                if (atevVar.b == 82258301) {
                    ateuVar = (ateu) atevVar.c;
                } else {
                    ateuVar = ateu.a;
                }
                arag aragVar2 = null;
                if ((ateuVar.b & 1) != 0) {
                    atev atevVar2 = atepVar2.d;
                    if (atevVar2 == null) {
                        atevVar2 = atev.a;
                    }
                    if (atevVar2.b == 82258301) {
                        ateuVar2 = (ateu) atevVar2.c;
                    } else {
                        ateuVar2 = ateu.a;
                    }
                    aragVar = ateuVar2.c;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                Spanned b = ajgl.b(aragVar);
                if (b != null) {
                    builder.setTitle(b);
                }
                if (atepVar2.c.size() > 0) {
                    ajqw ajqwVar = new ajqw();
                    ajqwVar.f(aten.class, new fkt(dtVar, ajxzVar));
                    ajrg a2 = ajrhVar.a(ajqwVar);
                    ajsm ajsmVar = new ajsm();
                    for (aten atenVar : atepVar2.c) {
                        ajsmVar.add(atenVar);
                    }
                    a2.h(ajsmVar);
                    builder.setAdapter(a2, fkuVar);
                }
                atei ateiVar = atepVar2.e;
                if (ateiVar == null) {
                    ateiVar = atei.a;
                }
                ateh atehVar = ateiVar.b;
                if (atehVar == null) {
                    atehVar = ateh.a;
                }
                if ((atehVar.b & 1) != 0) {
                    atei ateiVar2 = atepVar2.e;
                    if (ateiVar2 == null) {
                        ateiVar2 = atei.a;
                    }
                    ateh atehVar2 = ateiVar2.b;
                    if (atehVar2 == null) {
                        atehVar2 = ateh.a;
                    }
                    aragVar2 = atehVar2.c;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                }
                Spanned b2 = ajgl.b(aragVar2);
                if (b2 != null) {
                    builder.setNegativeButton(b2, fkuVar);
                }
                builder.setCancelable(true);
                fkuVar.j(builder.create());
                fkuVar.k();
            } else {
                ltu ltuVar = this.f;
                Optional ofNullable = Optional.ofNullable((acti) zew.K(map, "com.google.android.libraries.youtube.logging.interaction_logger", acti.class));
                final acth acthVar = this.g;
                acthVar.getClass();
                ltuVar.a(atepVar2, view, I, (acti) ofNullable.orElseGet(new Supplier() { // from class: gki
                    @Override // j$.util.function.Supplier
                    /* renamed from: get */
                    public final Object mo515get() {
                        return acth.this.oi();
                    }
                }));
            }
        }
    }
}
