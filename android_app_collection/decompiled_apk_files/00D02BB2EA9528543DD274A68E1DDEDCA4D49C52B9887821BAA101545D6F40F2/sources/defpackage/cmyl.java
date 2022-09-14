package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: cmyl  reason: default package */
/* loaded from: classes5.dex */
public final class cmyl implements cmyw {
    public static ViewGroup b(ViewGroup viewGroup, View view) {
        if (view == null || view == viewGroup) {
            return viewGroup;
        }
        ViewGroup viewGroup2 = view.getParent() instanceof ViewGroup ? (ViewGroup) view.getParent() : null;
        return viewGroup2 == null ? viewGroup : c(viewGroup2) ? viewGroup2 : b(viewGroup, viewGroup2);
    }

    public static boolean c(ViewGroup viewGroup) {
        return cnje.c(viewGroup) && cnje.d(viewGroup) == 1;
    }

    @Override // defpackage.cmyw
    public final View a(ViewGroup viewGroup, View view, int i, boolean z) {
        throw null;
    }
}
