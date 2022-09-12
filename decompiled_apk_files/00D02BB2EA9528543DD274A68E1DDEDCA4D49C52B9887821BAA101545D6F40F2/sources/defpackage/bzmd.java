package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bzmd  reason: default package */
/* loaded from: classes.dex */
public final class bzmd implements bzmi {
    private final gga b;
    private final cqkj c;
    private final btrm d;
    private cps e = new cpr().a();
    @dzsi
    public View a = null;

    public bzmd(gga ggaVar, cqkj cqkjVar, btrm btrmVar) {
        this.b = ggaVar;
        this.c = cqkjVar;
        this.d = btrmVar;
    }

    private static boolean f(View view, cpr cprVar) {
        if (view.getTag(R.id.overlay_tutorial_highlighted_view) != null) {
            return false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            boolean[] zArr = new boolean[childCount];
            boolean z = true;
            for (int i = 0; i < childCount; i++) {
                boolean f = f(viewGroup.getChildAt(i), cprVar);
                zArr[i] = f;
                z &= f;
            }
            if (!z) {
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (zArr[i2]) {
                        cprVar.b(childAt);
                    }
                }
            }
            if (true != z) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r0 != false) goto L6;
     */
    @Override // defpackage.bzmi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r3 = this;
            gga r0 = r3.b
            r1 = 2131429210(0x7f0b075a, float:1.8480086E38)
            android.view.View r0 = r0.findViewById(r1)
            defpackage.dbsk.s(r0)
            r1 = 8
            r0.setVisibility(r1)
            gga r0 = r3.b
            boolean r0 = defpackage.csld.a(r0)
            android.view.View r2 = r3.a
            if (r2 != 0) goto L20
            if (r0 == 0) goto L1e
            goto L22
        L1e:
            r0 = 0
            return r0
        L20:
            if (r0 == 0) goto L27
        L22:
            gga r0 = r3.b
            defpackage.csld.b(r0)
        L27:
            android.view.View r0 = r3.a
            if (r0 == 0) goto L40
            r0.setVisibility(r1)
            r1 = 0
            r3.a = r1
            cps r1 = r3.e
            r1.b()
            btrm r1 = r3.d
            bznt r2 = new bznt
            r2.<init>(r0)
            r1.b(r2)
        L40:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzmd.a():boolean");
    }

    @Override // defpackage.bzmi
    public final boolean b() {
        return this.a != null;
    }

    @Override // defpackage.bzmi
    @dzsi
    public final <V extends cqkp> void c(cqiw<V> cqiwVar) {
        e(cqiwVar, null, null, null);
    }

    @Override // defpackage.bzmi
    @dzsi
    @Deprecated
    public final void d(int i, int i2, List<Integer> list, List<View> list2, @dzsi bzmn bzmnVar) {
        bzoo bzooVar;
        View findViewById;
        if (b()) {
            return;
        }
        ViewStub viewStub = (ViewStub) this.b.findViewById(i);
        if (viewStub == null) {
            bzooVar = (bzoo) this.b.findViewById(i2);
            if (bzooVar == null) {
                return;
            }
        } else {
            bzooVar = (bzoo) viewStub.inflate();
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            int intValue = num.intValue();
            if (intValue != -1 && (findViewById = this.b.findViewById(intValue)) != null) {
                arrayList.add(findViewById);
            }
        }
        cpr cprVar = new cpr();
        for (View view : list2) {
            cprVar.b(view);
        }
        this.e.b();
        cps a = cprVar.a();
        this.e = a;
        a.a();
        bzooVar.a(arrayList, bzmnVar);
        bzooVar.setVisibility(0);
        View findViewById2 = this.b.findViewById(R.id.tutorial_container);
        dbsk.s(findViewById2);
        findViewById2.setVisibility(0);
        this.a = bzooVar;
    }

    @Override // defpackage.bzmi
    @dzsi
    public final <V extends cqkp> void e(cqiw<V> cqiwVar, @dzsi V v, @dzsi List<View> list, @dzsi bzmn bzmnVar) {
        if (b()) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.b.findViewById(R.id.tutorial_container);
        dbsk.s(viewGroup);
        viewGroup.removeAllViews();
        cqkf c = this.c.c(cqiwVar, viewGroup);
        if (v != null) {
            c.e(v);
        }
        View c2 = c.c();
        this.a = c2;
        if ((c2 instanceof bzoo) && list != null) {
            dbsk.s(c2);
            bzoo bzooVar = (bzoo) c2;
            for (View view : list) {
                view.setTag(R.id.overlay_tutorial_highlighted_view, Boolean.TRUE);
            }
            View findViewById = this.b.findViewById(R.id.mainmap_container);
            dbsk.s(findViewById);
            cpr cprVar = new cpr();
            if (f(findViewById, cprVar)) {
                cprVar.b(findViewById);
            }
            for (View view2 : list) {
                view2.setTag(R.id.overlay_tutorial_highlighted_view, null);
            }
            cps a = cprVar.a();
            this.e = a;
            a.a();
            bzooVar.a(list, bzmnVar);
        }
        viewGroup.setVisibility(0);
        dbsk.s(c2);
        c2.setVisibility(0);
    }
}
