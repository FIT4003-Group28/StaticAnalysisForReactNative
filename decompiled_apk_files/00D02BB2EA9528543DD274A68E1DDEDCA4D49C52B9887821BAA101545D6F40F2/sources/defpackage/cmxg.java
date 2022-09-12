package defpackage;

import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: cmxg  reason: default package */
/* loaded from: classes5.dex */
final class cmxg implements cmyw {
    private final View b(ViewGroup viewGroup, ViewGroup viewGroup2, View view, int i, boolean z) {
        int nextFocusDownId;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup2, view, i);
        if (viewGroup2 == viewGroup) {
            return findNextFocus;
        }
        if (cnje.c(viewGroup2)) {
            if (findNextFocus != null) {
                if (cmwk.a("CAR.PROJECTION.SEARCH", 3)) {
                    int i2 = cnjc.a;
                }
                return findNextFocus;
            }
            int d = cnje.d(viewGroup2);
            if (d == 1) {
                if (cmwk.a("CAR.PROJECTION.SEARCH", 3)) {
                    int i3 = cnjc.a;
                }
                return view;
            } else if (d == 2 && z) {
                if (cmwk.a("CAR.PROJECTION.SEARCH", 3)) {
                    int i4 = cnjc.a;
                }
                return view;
            } else {
                if (i == 66) {
                    nextFocusDownId = viewGroup2.getNextFocusRightId();
                } else if (i == 17) {
                    nextFocusDownId = viewGroup2.getNextFocusLeftId();
                } else if (i == 33) {
                    nextFocusDownId = viewGroup2.getNextFocusUpId();
                } else {
                    nextFocusDownId = i == 130 ? viewGroup2.getNextFocusDownId() : -1;
                }
                if (nextFocusDownId != -1) {
                    if (nextFocusDownId == view.getId()) {
                        if (cmwk.a("CAR.PROJECTION.SEARCH", 3)) {
                            int i5 = cnjc.a;
                        }
                        return view;
                    }
                    return viewGroup.findViewById(nextFocusDownId);
                }
            }
        }
        ViewGroup c = c(viewGroup2, viewGroup);
        if (cmwk.a("CAR.PROJECTION.SEARCH", 3)) {
            int i6 = cnjc.a;
        }
        return b(viewGroup, c, view, i, z);
    }

    private final ViewGroup c(View view, ViewGroup viewGroup) {
        if (view == viewGroup) {
            return viewGroup;
        }
        ViewGroup viewGroup2 = view.getParent() instanceof ViewGroup ? (ViewGroup) view.getParent() : null;
        return viewGroup2 == null ? viewGroup : cnje.c(viewGroup2) ? viewGroup2 : c(viewGroup2, viewGroup);
    }

    @Override // defpackage.cmyw
    public final View a(ViewGroup viewGroup, View view, int i, boolean z) {
        return b(viewGroup, c(view, viewGroup), view, i, z);
    }
}
