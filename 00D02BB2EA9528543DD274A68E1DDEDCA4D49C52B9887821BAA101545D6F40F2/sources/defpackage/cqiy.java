package defpackage;

import android.view.View;
import defpackage.cqkp;
import java.lang.ref.WeakReference;
import java.util.List;
/* compiled from: PG */
/* renamed from: cqiy  reason: default package */
/* loaded from: classes.dex */
public class cqiy<V extends cqkp> extends cqjz<V> {
    public cqiy(View view, cqho cqhoVar, cqja<V> cqjaVar, cqjg cqjgVar, cqiw<V> cqiwVar, boolean z) {
        super(view, cqhoVar, cqjaVar, cqjgVar, cqiwVar, z);
    }

    @Override // defpackage.cqjz
    public final void c(@dzsi V v, @dzsi V v2) {
        List<WeakReference<cqiy<V>>> a;
        cqkr q = this.g.q();
        if (v != null && (a = q.a(v, false)) != null) {
            int size = a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (a.get(size).get() == this) {
                    a.remove(size);
                }
            }
        }
        if (v2 == null) {
            return;
        }
        List<WeakReference<cqiy<V>>> a2 = q.a(v2, true);
        int size2 = a2.size();
        for (int i = 0; i < size2; i++) {
            if (a2.get(i).get() == this) {
                return;
            }
        }
        a2.add(new WeakReference<>(this));
    }
}
