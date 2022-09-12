package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Space;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: acxe  reason: default package */
/* loaded from: classes.dex */
public final class acxe {
    private static final int a = 2131427985;
    private static final int b = 2131427983;
    private static final int c = 2131428020;
    private static final int d = 2131427981;
    private static final int e = 2131427986;
    private static final dcdc<Integer> f = dcdc.g(Integer.valueOf((int) R.id.scrollable_card_stream_container), Integer.valueOf((int) R.id.side_panel_card_stream_container));
    private static final dcdc<Integer> g = dcdc.g(Integer.valueOf((int) R.id.explore_tab_home_bottom_sheet), Integer.valueOf((int) R.id.informal_transit_tab_home_bottom_sheet));
    private final Activity h;
    private final int i;

    public acxe(Activity activity) {
        this.h = activity;
        this.i = jmj.a(activity, 8);
    }

    private static boolean b(ViewGroup viewGroup, Point point, int i, Set<acxd> set) {
        for (View view : c(viewGroup)) {
            if (view.getVisibility() == 0) {
                int width = view.getWidth();
                int height = view.getHeight();
                if (width != 0 && height != 0) {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    int i4 = (height + i3) - 1;
                    if ((width + i2) - 1 > 0 && i2 < point.x && i4 > 0 && i3 < point.y - i) {
                        if (view.getTag(b) != null) {
                            set.add(acxd.ERROR);
                        }
                        if (view.getTag(c) == Boolean.TRUE) {
                            set.add(acxd.IMAGES_LOADING);
                        }
                        if (view.getTag(d) == Boolean.TRUE) {
                            set.add(acxd.ACTIONABLE_CONTENT);
                        }
                        if (view.getTag(a) == null && !(view instanceof ProgressBar)) {
                            if ((view instanceof ViewGroup) && !b((ViewGroup) view, point, i, set)) {
                                return false;
                            }
                        } else {
                            set.add(acxd.CONTENT_LOADING);
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    private static List<View> c(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof Space)) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final acxd a() {
        RecyclerView recyclerView;
        aegc aegcVar;
        Point point = new Point();
        this.h.getWindowManager().getDefaultDisplay().getSize(point);
        View findViewById = this.h.findViewById(e);
        int i = 0;
        int height = findViewById != null ? findViewById.getHeight() : 0;
        dcdc<Integer> dcdcVar = g;
        int size = dcdcVar.size();
        int i2 = 0;
        while (true) {
            recyclerView = null;
            if (i2 >= size) {
                aegcVar = null;
                break;
            }
            View findViewById2 = this.h.findViewById(dcdcVar.get(i2).intValue());
            if (findViewById2 != null && (findViewById2 instanceof aegc)) {
                aegcVar = (aegc) findViewById2;
                break;
            }
            i2++;
        }
        if (aegcVar == null || aegcVar.c() > this.i + height) {
            View findViewById3 = this.h.findViewById(R.id.side_panel);
            jjf jjfVar = findViewById3 instanceof jjf ? (jjf) findViewById3 : null;
            if (jjfVar == null || !jjfVar.f()) {
                dcdc<Integer> dcdcVar2 = f;
                int size2 = dcdcVar2.size();
                while (true) {
                    if (i < size2) {
                        View findViewById4 = this.h.findViewById(dcdcVar2.get(i).intValue());
                        if (findViewById4 != null && (findViewById4 instanceof RecyclerView)) {
                            recyclerView = (RecyclerView) findViewById4;
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
                if (recyclerView == null) {
                    return acxd.CONTENT_LOADING;
                }
                if (c(recyclerView).isEmpty()) {
                    return acxd.CONTENT_LOADING;
                }
                EnumSet noneOf = EnumSet.noneOf(acxd.class);
                b(recyclerView, point, height, noneOf);
                return noneOf.contains(acxd.CONTENT_LOADING) ? noneOf.contains(acxd.ACTIONABLE_CONTENT) ? acxd.ACTIONABLE_CONTENT : acxd.CONTENT_LOADING : noneOf.contains(acxd.ERROR) ? acxd.ERROR : noneOf.contains(acxd.IMAGES_LOADING) ? acxd.IMAGES_LOADING : acxd.LOADED_WITH_IMAGES;
            }
            return acxd.SHEET_COLLAPSED;
        }
        return acxd.SHEET_COLLAPSED;
    }
}
