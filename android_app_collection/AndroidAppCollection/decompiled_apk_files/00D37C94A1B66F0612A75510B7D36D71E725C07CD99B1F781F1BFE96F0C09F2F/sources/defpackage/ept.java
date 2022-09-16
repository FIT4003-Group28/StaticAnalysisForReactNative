package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ept  reason: default package */
/* loaded from: classes3.dex */
public final class ept implements aafl {
    private final gbh a;
    private final yni b;
    private final jsc c;

    public ept(gbh gbhVar, yni yniVar, jsc jscVar) {
        gbhVar.getClass();
        this.a = gbhVar;
        yniVar.getClass();
        this.b = yniVar;
        this.c = jscVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        PaneDescriptor b;
        if (map == null || !map.containsKey("com.google.android.libraries.youtube.rendering.presenter.PresentContext")) {
            b = this.c.b(apzgVar);
        } else {
            ajrs ajrsVar = (ajrs) map.get("com.google.android.libraries.youtube.rendering.presenter.PresentContext");
            b = this.c.c(apzgVar, ajrsVar.j("nested_fragment_key", false), ajrsVar.j("selection_panel", false));
        }
        this.b.d(new ewr());
        this.a.d(b);
    }
}
