package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mls  reason: default package */
/* loaded from: classes3.dex */
final class mls {
    private final flx a;
    private final akfb b;
    private final FrameLayout c;

    public mls(ViewGroup viewGroup, flx flxVar, akfb akfbVar) {
        this.a = flxVar;
        this.b = akfbVar;
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.sub_menu_container);
        this.c = frameLayout;
        frameLayout.addView(flxVar.c);
        frameLayout.setVisibility(8);
    }

    public final void a(ajrs ajrsVar, auxr auxrVar, atnh atnhVar) {
        argj argjVar;
        if (auxrVar == null) {
            this.c.setVisibility(8);
            return;
        }
        this.c.setVisibility(0);
        this.a.oK(ajrsVar, auxrVar);
        if (atnhVar == null) {
            argjVar = null;
        } else if (atnhVar.b == 102716411) {
            argjVar = (argj) atnhVar.c;
        } else {
            argjVar = argj.a;
        }
        if (argjVar == null) {
            return;
        }
        this.b.b(argjVar, this.c, atnhVar, ajrsVar.a);
    }
}
