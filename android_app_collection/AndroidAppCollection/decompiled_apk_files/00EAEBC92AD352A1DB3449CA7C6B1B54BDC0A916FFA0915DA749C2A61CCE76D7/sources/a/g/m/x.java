package a.g.m;

import android.os.Build;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public final class x {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(a.g.c.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && v.y(viewGroup) == null) ? false : true;
    }
}
