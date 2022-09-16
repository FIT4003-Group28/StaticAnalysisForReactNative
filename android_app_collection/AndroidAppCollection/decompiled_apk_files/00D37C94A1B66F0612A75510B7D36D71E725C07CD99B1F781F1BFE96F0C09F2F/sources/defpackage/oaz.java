package defpackage;

import android.view.View;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: oaz  reason: default package */
/* loaded from: classes3.dex */
public final class oaz implements View.OnClickListener {
    final /* synthetic */ oba a;
    private final /* synthetic */ int b;

    public oaz(oba obaVar) {
        this.a = obaVar;
    }

    public /* synthetic */ oaz(oba obaVar, int i) {
        this.b = i;
        this.a = obaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            final oba obaVar = this.a;
            dt dtVar = obaVar.a;
            ates atesVar = obaVar.l.z;
            if (atesVar == null) {
                atesVar = ates.a;
            }
            atep atepVar = atesVar.c;
            if (atepVar == null) {
                atepVar = atep.a;
            }
            akbc.b(dtVar, atepVar, obaVar.d, obaVar.g, amup.l("com.google.android.libraries.youtube.innertube.endpoint.tag", obaVar.l, "com.google.android.libraries.youtube.logging.interaction_logger", obaVar.b), new acth() { // from class: oay
                @Override // defpackage.acth
                public final acti oi() {
                    return oba.this.b;
                }
            }, obaVar.h, obaVar.p);
        } else if (oba.c(this.a.m)) {
            this.a.f.b();
            HashMap hashMap = new HashMap();
            hashMap.put("ALLOW_RELOAD", true);
            oba obaVar2 = this.a;
            aafo aafoVar = obaVar2.d;
            apzg apzgVar = obaVar2.m.l;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, hashMap);
        } else {
            oba obaVar3 = this.a;
            obaVar3.e.G(!obaVar3.k.isSelected());
        }
    }
}
