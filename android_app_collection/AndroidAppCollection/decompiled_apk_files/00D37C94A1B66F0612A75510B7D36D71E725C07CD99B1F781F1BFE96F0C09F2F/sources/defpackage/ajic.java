package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: ajic  reason: default package */
/* loaded from: classes.dex */
public final class ajic implements aafl {
    private final tcu a;

    public ajic(tcu tcuVar) {
        this.a = tcuVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        acti actiVar;
        tcq a = tcs.a();
        ajje a2 = ajjf.a();
        if (map != null && (actiVar = (acti) map.get("com.google.android.libraries.youtube.logging.interaction_logger")) != null) {
            a2.c = actiVar;
            a.d = a2.a();
        }
        a2.d = apzgVar;
        a.d = a2.a();
        this.a.b((awmt) apzgVar.qm(aqtg.a), a.a()).Q();
    }
}
