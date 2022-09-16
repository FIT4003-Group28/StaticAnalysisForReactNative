package defpackage;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: li  reason: default package */
/* loaded from: classes3.dex */
final class li {
    public static final ArrayList a = new ArrayList();
    public WeakHashMap b = null;
    private SparseArray d = null;
    public WeakReference c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static li a(View view) {
        li liVar = (li) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (liVar == null) {
            li liVar2 = new li();
            view.setTag(R.id.tag_unhandled_key_event_manager, liVar2);
            return liVar2;
        }
        return liVar;
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
            } while (!((lh) arrayList.get(size)).a());
            return true;
        }
        return false;
    }

    public final SparseArray b() {
        if (this.d == null) {
            this.d = new SparseArray();
        }
        return this.d;
    }

    public final View c(View view, KeyEvent keyEvent) {
        View c;
        WeakHashMap weakHashMap = this.b;
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
