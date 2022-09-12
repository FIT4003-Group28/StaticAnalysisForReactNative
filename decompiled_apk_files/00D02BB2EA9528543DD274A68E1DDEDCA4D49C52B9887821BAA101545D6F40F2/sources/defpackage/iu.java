package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: iu  reason: default package */
/* loaded from: classes6.dex */
public class iu {
    final ArrayList<it> a = new ArrayList<>();
    final HashMap<fd, it> b = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static iu a(ViewGroup viewGroup, gn gnVar) {
        gnVar.ap();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (!(tag instanceof iu)) {
            er erVar = new er();
            viewGroup.setTag(R.id.special_effects_controller_view_tag, erVar);
            return erVar;
        }
        return (iu) tag;
    }

    public final void b(int i, gw gwVar, akq akqVar) {
        if (akqVar.a()) {
            return;
        }
        synchronized (this.a) {
            akq akqVar2 = new akq();
            is isVar = new is(gwVar);
            this.a.add(isVar);
            this.b.put(isVar.a, isVar);
            akqVar.c(new iq(this, isVar, akqVar2));
            isVar.b.add(new ir(this, isVar));
        }
    }
}
