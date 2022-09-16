package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import com.google.android.libraries.elements.interfaces.IntersectionSubscription;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: sya  reason: default package */
/* loaded from: classes4.dex */
final class sya implements tes {
    private final sxz a;
    private final Rect b = new Rect();
    private final Rect c = new Rect();
    private final Rect d = new Rect();

    public sya(Map map) {
        this.a = new sxz(map);
    }

    @Override // defpackage.tes
    public final ter a(String str, Object obj) {
        sxz sxzVar = this.a;
        Map map = sxzVar.b;
        if (map == null) {
            map = new HashMap();
            sxzVar.b = map;
        }
        Set set = sxzVar.c;
        if (set == null) {
            set = new afy();
            sxzVar.c = set;
        }
        Class<?> cls = obj.getClass();
        final teq teqVar = (teq) map.get(cls);
        if (teqVar == null) {
            azqb azqbVar = null;
            for (Class<?> cls2 = cls; cls2 != null && cls2 != Object.class; cls2 = cls2.getSuperclass()) {
                azqbVar = (azqb) sxzVar.a.get(cls2);
                if (azqbVar != null) {
                    break;
                }
            }
            if (azqbVar == null) {
                String valueOf = String.valueOf(cls);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
                sb.append("Cannot find Provider<CollectionScrollStrategy> for ");
                sb.append(valueOf);
                throw new ted(sb.toString());
            }
            teqVar = (teq) azqbVar.get();
            map.put(cls, teqVar);
            set.add(teqVar);
        }
        if (teqVar.a == null) {
            teqVar.a = Collections.newSetFromMap(new WeakHashMap());
        }
        final IntersectionSubscription subscribe = teqVar.b.subscribe(str, (IntersectionObserver) obj);
        final ter terVar = new ter() { // from class: sxy
            @Override // defpackage.ter
            public final void a() {
                IntersectionSubscription intersectionSubscription = IntersectionSubscription.this;
                if (intersectionSubscription != null) {
                    intersectionSubscription.cancel();
                }
            }
        };
        Set set2 = teqVar.a;
        if (set2 != null) {
            set2.add(terVar);
        }
        return new ter() { // from class: tep
            @Override // defpackage.ter
            public final void a() {
                teq teqVar2 = teq.this;
                ter terVar2 = terVar;
                terVar2.a();
                Set set3 = teqVar2.a;
                if (set3 != null) {
                    set3.remove(terVar2);
                }
            }
        };
    }

    @Override // defpackage.tes
    public final void b(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        xw xwVar = recyclerView.n;
        if (!(xwVar instanceof LinearLayoutManager)) {
            return;
        }
        Set<teq> a = this.a.a();
        char c = 0;
        loop0: while (true) {
            z = false;
            for (teq teqVar : a) {
                if (z || teqVar.a()) {
                    z = true;
                }
            }
        }
        if (!z) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) xwVar;
        recyclerView.getGlobalVisibleRect(this.b);
        int J2 = linearLayoutManager.J();
        int L = linearLayoutManager.L();
        while (J2 <= L) {
            View S = xwVar.S(J2);
            if (S != null) {
                Object tag = S.getTag(333384171);
                if (tag instanceof String) {
                    String str = (String) tag;
                    for (teq teqVar2 : a) {
                        if (teqVar2.a()) {
                            S.getGlobalVisibleRect(this.c);
                            Rect rect = this.b;
                            Rect rect2 = this.c;
                            Rect rect3 = this.d;
                            int[] iArr = new int[2];
                            S.getLocationOnScreen(iArr);
                            int width = iArr[c] + S.getWidth();
                            if (rect2.right > rect.left && rect2.right < rect.right) {
                                width = rect2.right;
                            }
                            int height = iArr[1] + S.getHeight();
                            xw xwVar2 = xwVar;
                            if (rect2.bottom > rect.top && rect2.bottom < rect.bottom) {
                                height = rect2.bottom;
                            }
                            rect3.set(iArr[0], iArr[1], width, height);
                            teqVar2.b.onScroll(str, this.d, this.c, this.b, i, i2);
                            xwVar = xwVar2;
                            c = 0;
                        }
                    }
                }
            }
            J2++;
            xwVar = xwVar;
            c = 0;
        }
    }

    @Override // defpackage.tes
    public final boolean c() {
        return !this.a.a().isEmpty();
    }
}
