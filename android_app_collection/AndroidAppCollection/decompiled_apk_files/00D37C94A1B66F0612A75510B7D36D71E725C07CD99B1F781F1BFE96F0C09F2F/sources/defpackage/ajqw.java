package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.LinkedList;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: ajqw  reason: default package */
/* loaded from: classes.dex */
public final class ajqw extends ajqf {
    private final SparseArray b = new SparseArray(16);

    private final Queue g(int i) {
        Queue queue = (Queue) this.b.get(i);
        if (queue == null) {
            LinkedList linkedList = new LinkedList();
            this.b.put(i, linkedList);
            return linkedList;
        }
        return queue;
    }

    @Override // defpackage.ajqf
    protected final ajru a(int i) {
        return (ajru) g(i).poll();
    }

    @Override // defpackage.ajsa
    public final void b(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            view.getContext();
            afus.b(2, 2, "View must not have a parent when recycled.");
            if (parent instanceof ViewGroup) {
                if (parent instanceof RecyclerView) {
                    afus.b(2, 2, "Cannot call removeView on a RecyclerView parent.");
                } else {
                    ((ViewGroup) parent).removeView(view);
                }
            }
        }
        int d = akel.d(view);
        ajru g = akel.g(view);
        if (d == -1 || g == null) {
            return;
        }
        akel.k(g, this);
        g(d).offer(g);
    }
}
