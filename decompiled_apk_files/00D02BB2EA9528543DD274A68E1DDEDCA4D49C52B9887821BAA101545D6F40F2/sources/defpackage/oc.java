package defpackage;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: oc  reason: default package */
/* loaded from: classes.dex */
final class oc {
    public static final ArrayList<WeakReference<View>> a = new ArrayList<>();
    public WeakHashMap<View, Boolean> b = null;
    private SparseArray<WeakReference<View>> d = null;
    public WeakReference<KeyEvent> c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static oc b(View view) {
        oc ocVar = (oc) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (ocVar == null) {
            oc ocVar2 = new oc();
            view.setTag(R.id.tag_unhandled_key_event_manager, ocVar2);
            return ocVar2;
        }
        return ocVar;
    }

    public static final boolean d(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList != null) {
            int size = arrayList.size();
            do {
                size--;
                if (size < 0) {
                    return false;
                }
            } while (!((ob) arrayList.get(size)).a());
            return true;
        }
        return false;
    }

    public final SparseArray<WeakReference<View>> a() {
        if (this.d == null) {
            this.d = new SparseArray<>();
        }
        return this.d;
    }

    public final View c(View view, KeyEvent keyEvent) {
        View c;
        WeakHashMap<View, Boolean> weakHashMap = this.b;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        c = c(viewGroup.getChildAt(childCount), keyEvent);
                    }
                } while (c == null);
                return c;
            }
            if (d(view)) {
                return view;
            }
        }
        return null;
    }
}
