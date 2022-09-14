package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.IdentityHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cqkc  reason: default package */
/* loaded from: classes.dex */
public final class cqkc implements View.OnClickListener, View.OnLongClickListener {
    @dzsi
    private Map<cqis<View.OnClickListener>, View.OnClickListener> a;
    @dzsi
    private Map<cqis<View.OnClickListener>, View.OnLongClickListener> b;

    public static final cqkc a(View view) {
        cqkc cqkcVar = (cqkc) view.getTag(R.id.click_manager);
        if (cqkcVar == null) {
            boolean isLongClickable = view.isLongClickable();
            cqkc cqkcVar2 = new cqkc();
            view.setOnClickListener(cqkcVar2);
            view.setOnLongClickListener(cqkcVar2);
            view.setTag(R.id.click_manager, cqkcVar2);
            if (isLongClickable) {
                return cqkcVar2;
            }
            view.setLongClickable(false);
            return cqkcVar2;
        }
        return cqkcVar;
    }

    public final void b(cqis<View.OnClickListener> cqisVar, @dzsi View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            if (this.a == null) {
                this.a = new IdentityHashMap();
            }
            this.a.put(cqisVar, onClickListener);
            return;
        }
        Map<cqis<View.OnClickListener>, View.OnClickListener> map = this.a;
        if (map == null) {
            return;
        }
        map.remove(cqisVar);
    }

    public final void c(cqis<View.OnClickListener> cqisVar, @dzsi View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener != null) {
            if (this.b == null) {
                this.b = new IdentityHashMap();
            }
            this.b.put(cqisVar, onLongClickListener);
            return;
        }
        Map<cqis<View.OnClickListener>, View.OnLongClickListener> map = this.b;
        if (map == null) {
            return;
        }
        map.remove(cqisVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Map<cqis<View.OnClickListener>, View.OnClickListener> map = this.a;
        if (map == null) {
            return;
        }
        dcdc r = dcdc.r(map.values());
        int size = r.size();
        for (int i = 0; i < size; i++) {
            ((View.OnClickListener) r.get(i)).onClick(view);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Map<cqis<View.OnClickListener>, View.OnLongClickListener> map = this.b;
        if (map == null) {
            return false;
        }
        dcdc r = dcdc.r(map.values());
        int size = r.size();
        for (int i = 0; i < size; i++) {
            ((View.OnLongClickListener) r.get(i)).onLongClick(view);
        }
        return !r.isEmpty();
    }
}
