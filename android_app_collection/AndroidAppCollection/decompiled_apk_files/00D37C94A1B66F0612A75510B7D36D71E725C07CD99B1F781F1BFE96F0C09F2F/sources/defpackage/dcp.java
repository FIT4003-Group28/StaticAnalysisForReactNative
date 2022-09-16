package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentTree;
import com.facebook.yoga.YogaDirection;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dcp  reason: default package */
/* loaded from: classes3.dex */
public final class dcp implements dei {
    private static final Rect p = new Rect();
    private final dms D;
    private den E;
    private dee F;
    public final Map a;
    public long[] b;
    public boolean d;
    public boolean e;
    public dbq h;
    public int[] k;
    public deu m;
    public dqt n;
    public dqt o;
    private boolean t;
    private final cyv u;
    private final dci v;
    private int y;
    private int z;
    public final agb f = new agb();
    public final Rect g = new Rect();
    private final dco w = new dco();
    private final dcn x = new dcn();
    private int A = -1;
    public boolean i = false;
    private int B = -1;
    private int C = -1;
    public final HashSet j = new HashSet();
    public final Map l = new LinkedHashMap();
    private boolean G = false;
    private final Set H = new HashSet();
    private final dak I = new dak();
    private final agb q = new agb();
    private final Map r = new HashMap();
    private final agb s = new agb();
    public boolean c = true;

    public dcp(dci dciVar) {
        this.u = dciVar.t;
        this.v = dciVar;
        this.a = dfz.e ? new HashMap() : null;
        deq deqVar = new deq();
        deqVar.d = YogaDirection.INHERIT;
        dms dmsVar = new dms(dbn.b(new dbn(null, deqVar, dbe.a(), dciVar.u, 0, 0, 0, 0L, 0, dciVar.getContext().getResources().getConfiguration().orientation, null), null), dciVar, dciVar);
        dmsVar.e = new dca(dciVar);
        this.D = dmsVar;
        if (dfz.o) {
            this.m = new deu(dciVar);
        }
    }

    private static void A(dms dmsVar, boolean z) {
        if (!cyr.z(dbn.a(dmsVar).b)) {
            return;
        }
        C((View) dmsVar.a, z);
    }

    private final void B(int i, dmw dmwVar, dbn dbnVar, dbq dbqVar) {
        Object a;
        aflw aflwVar;
        Map e;
        long nanoTime = System.nanoTime();
        long j = dbnVar.h;
        ComponentHost componentHost = (ComponentHost) this.f.f(j);
        if (componentHost == null) {
            int a2 = dbqVar.a(j);
            dmw g = dbqVar.g(a2);
            B(a2, g, (dbn) g.a, dbqVar);
            componentHost = (ComponentHost) this.f.f(j);
        }
        cyr cyrVar = dbnVar.b;
        Context context = this.u.b;
        dcm a3 = czo.a(context, cyrVar);
        if (a3 == null) {
            a = cyrVar.J(context);
        } else {
            a = a3.a(context, cyrVar);
        }
        cyv u = u(cyrVar);
        cyrVar.O(u, a);
        if (cyr.v(cyrVar)) {
            D(dbnVar.j, (ComponentHost) a);
        }
        dms dmsVar = new dms(dmwVar, componentHost, a);
        dmsVar.e = new dca(a);
        this.q.k(this.b[i], dmsVar);
        if (cyrVar.ab()) {
            this.s.k(this.b[i], dmsVar);
        }
        Rect rect = p;
        dbnVar.c(rect);
        componentHost.n(i, dmsVar, rect);
        F(dmsVar);
        i(cyrVar, a);
        dmsVar.c = true;
        dbnVar.c(rect);
        h(dmsVar.a, rect.left, rect.top, rect.right, rect.bottom, true);
        dcn dcnVar = this.x;
        if (dcnVar.n) {
            List list = dcnVar.f;
            double nanoTime2 = System.nanoTime() - nanoTime;
            Double.isNaN(nanoTime2);
            list.add(Double.valueOf(nanoTime2 / 1000000.0d));
            this.x.a.add(cyrVar.o());
            dcn dcnVar2 = this.x;
            dcnVar2.j++;
            List list2 = dcnVar2.e;
            tha thaVar = u.l;
            cyv cyvVar = cyrVar.q;
            String str = null;
            if (cyvVar != null && (aflwVar = cyvVar.m) != null && (e = thaVar.e(aflwVar)) != null) {
                StringBuilder sb = new StringBuilder(e.size() * 16);
                for (Map.Entry entry : e.entrySet()) {
                    sb.append((String) entry.getKey());
                    sb.append(':');
                    sb.append((String) entry.getValue());
                    sb.append(';');
                }
                str = sb.toString();
            }
            list2.add(str);
        }
    }

    private static void C(View view, boolean z) {
        if (view instanceof dci) {
            dci dciVar = (dci) view;
            if (!dciVar.L()) {
                return;
            }
            if (!z) {
                dciVar.B(new Rect(0, 0, view.getWidth(), view.getHeight()), false);
            } else {
                dciVar.A();
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                C(viewGroup.getChildAt(i), z);
            }
        }
    }

    private final void D(long j, ComponentHost componentHost) {
        componentHost.s(true);
        this.f.k(j, componentHost);
    }

    private final void E(ComponentHost componentHost) {
        ArrayList arrayList;
        if (componentHost.w()) {
            if (!componentHost.w()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                int size = componentHost.g.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(dbn.a((dms) componentHost.g.get(i)).g);
                }
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.E.f((def) arrayList.get(i2), null);
            }
        }
    }

    private static void F(dms dmsVar) {
        dbn a = dbn.a(dmsVar);
        cyr cyrVar = a.b;
        if (cyr.z(cyrVar)) {
            View view = (View) dmsVar.a;
            dab dabVar = a.l;
            int i = 2;
            if (dabVar != null) {
                daq daqVar = dabVar.h;
                if (daqVar != null) {
                    cyu c = c(view);
                    if (c == null) {
                        c = new cyu();
                        if (view instanceof ComponentHost) {
                            ComponentHost componentHost = (ComponentHost) view;
                            componentHost.k = c;
                            componentHost.setOnClickListener(c);
                        } else {
                            view.setOnClickListener(c);
                            view.setTag(R.id.component_click_listener, c);
                        }
                    }
                    c.a = daqVar;
                    view.setClickable(true);
                }
                daq daqVar2 = dabVar.j;
                if (daqVar2 != null) {
                    czc e = e(view);
                    if (e == null) {
                        e = new czc();
                        if (view instanceof ComponentHost) {
                            ComponentHost componentHost2 = (ComponentHost) view;
                            componentHost2.l = e;
                            componentHost2.setOnLongClickListener(e);
                        } else {
                            view.setOnLongClickListener(e);
                            view.setTag(R.id.component_long_click_listener, e);
                        }
                    }
                    e.a = daqVar2;
                    view.setLongClickable(true);
                }
                daq daqVar3 = dabVar.i;
                if (daqVar3 != null) {
                    cyw d = d(view);
                    if (d == null) {
                        d = new cyw();
                        if (view instanceof ComponentHost) {
                            ComponentHost componentHost3 = (ComponentHost) view;
                            componentHost3.m = d;
                            componentHost3.setOnFocusChangeListener(d);
                        } else {
                            view.setOnFocusChangeListener(d);
                            view.setTag(R.id.component_focus_change_listener, d);
                        }
                    }
                    d.a = daqVar3;
                }
                daq daqVar4 = dabVar.k;
                if (daqVar4 != null) {
                    czd f = f(view);
                    if (f == null) {
                        f = new czd();
                        n(view, f);
                    }
                    f.a = daqVar4;
                }
                daq daqVar5 = dabVar.l;
                if (daqVar5 != null) {
                    if (view instanceof dba) {
                        dba dbaVar = (dba) view;
                        dah b = dbaVar.b();
                        if (b == null) {
                            b = new dah();
                            dbaVar.r(b);
                        }
                        b.a = daqVar5;
                    } else {
                        czd f2 = f(view);
                        if (f2 == null) {
                            f2 = new czd();
                            n(view, f2);
                        }
                        f2.b = daqVar5;
                    }
                }
                boolean z = view instanceof ComponentHost;
                if (z || dabVar.z()) {
                    view.setTag(R.id.component_node_info, dabVar);
                }
                Object obj = dabVar.b;
                if (z) {
                    ((ComponentHost) view).h = obj;
                } else {
                    view.setTag(obj);
                }
                SparseArray sparseArray = dabVar.c;
                if (sparseArray != null) {
                    if (z) {
                        ((ComponentHost) view).i = sparseArray;
                    } else {
                        int size = sparseArray.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            view.setTag(sparseArray.keyAt(i2), sparseArray.valueAt(i2));
                        }
                    }
                }
                if (dabVar.u() && (view instanceof ViewGroup)) {
                    ((ViewGroup) view).setClipChildren(dabVar.d);
                }
                CharSequence charSequence = dabVar.a;
                if (!TextUtils.isEmpty(charSequence)) {
                    view.setContentDescription(charSequence);
                }
                int i3 = dabVar.o;
                if (i3 == 1) {
                    view.setFocusable(true);
                } else if (i3 == 2) {
                    view.setFocusable(false);
                }
                int i4 = dabVar.p;
                if (i4 == 1) {
                    view.setClickable(true);
                } else if (i4 == 2) {
                    view.setClickable(false);
                }
                int i5 = dabVar.q;
                if (i5 == 1) {
                    view.setEnabled(true);
                } else if (i5 == 2) {
                    view.setEnabled(false);
                }
                int i6 = dabVar.r;
                if (i6 == 1) {
                    view.setSelected(true);
                } else if (i6 == 2) {
                    view.setSelected(false);
                }
                if (dabVar.y()) {
                    float f3 = dabVar.e;
                    view.setScaleX(f3);
                    view.setScaleY(f3);
                }
                if (dabVar.t()) {
                    view.setAlpha(dabVar.f);
                }
                if (dabVar.v()) {
                    view.setRotation(dabVar.g);
                }
                if (dabVar.w()) {
                    view.setRotationX(0.0f);
                }
                if (dabVar.x()) {
                    view.setRotationY(0.0f);
                }
            }
            int i7 = a.e;
            if (i7 != 0) {
                lj.V(view, i7);
            }
            deq deqVar = a.a;
            if (deqVar == null) {
                return;
            }
            int i8 = a.d;
            if (cyr.v(cyrVar)) {
                return;
            }
            Drawable drawable = deqVar.a;
            if (drawable != null) {
                view.setBackground(drawable);
            }
            if (deqVar.b()) {
                Rect rect = deqVar.b;
                int i9 = rect != null ? rect.left : 0;
                Rect rect2 = deqVar.b;
                int i10 = rect2 != null ? rect2.top : 0;
                Rect rect3 = deqVar.b;
                int i11 = rect3 != null ? rect3.right : 0;
                Rect rect4 = deqVar.b;
                view.setPadding(i9, i10, i11, rect4 != null ? rect4.bottom : 0);
            }
            YogaDirection yogaDirection = YogaDirection.INHERIT;
            int ordinal = deqVar.d.ordinal();
            if (ordinal == 1) {
                i = 0;
            } else if (ordinal == 2) {
                i = 1;
            }
            view.setLayoutDirection(i);
        }
    }

    private final void G(boolean z) {
        int c = this.f.c();
        while (true) {
            c--;
            if (c >= 0) {
                ((ComponentHost) this.f.h(c)).s(z);
            } else {
                return;
            }
        }
    }

    private final void H(dms dmsVar) {
        cyr cyrVar = dbn.a(dmsVar).b;
        Object obj = dmsVar.a;
        cyv u = u(cyrVar);
        if (dmsVar.c) {
            cyrVar.as(obj);
            dmsVar.c = false;
        }
        cyrVar.W(u, obj);
    }

    private final void I(cyv cyvVar, dms dmsVar) {
        int b;
        x(dbn.a(dmsVar).g);
        Object obj = dmsVar.a;
        int i = -1;
        if (obj instanceof ComponentHost) {
            ComponentHost componentHost = (ComponentHost) obj;
            for (int a = componentHost.a() - 1; a >= 0; a--) {
                I(cyvVar, componentHost.d(a));
            }
            if (componentHost.a() > 0) {
                throw new IllegalStateException("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
            }
        }
        ComponentHost componentHost2 = (ComponentHost) dmsVar.b;
        componentHost2.i();
        age ageVar = componentHost2.a;
        int i2 = 0;
        if (ageVar.a) {
            ageVar.j();
        }
        while (true) {
            if (i2 >= ageVar.c) {
                break;
            } else if (ageVar.b[i2] == dmsVar) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        componentHost2.t(ageVar.b(i), dmsVar);
        y(dmsVar);
        H(dmsVar);
        if (dbn.a(dmsVar).b.ab() && (b = this.s.b(dmsVar)) > 0) {
            this.s.m(b);
        }
        w(dmsVar);
        try {
            dca.a(dmsVar).b(cyvVar.b, dmsVar, "unmountDisappearingItemChild");
        } catch (dbz e) {
            String message = e.getMessage();
            String v = v(dmsVar);
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 1 + String.valueOf(v).length());
            sb.append(message);
            sb.append(" ");
            sb.append(v);
            throw new RuntimeException(sb.toString());
        }
    }

    private static void J(dms dmsVar, boolean z) {
        dah b;
        czd f;
        cyw d;
        czc e;
        cyu c;
        View view = (View) dmsVar.a;
        dbn a = dbn.a(dmsVar);
        dab dabVar = a.l;
        boolean z2 = true;
        if (dabVar != null) {
            if (dabVar.h != null && (c = c(view)) != null) {
                c.a = null;
            }
            if (dabVar.j != null && (e = e(view)) != null) {
                e.a = null;
            }
            if (dabVar.i != null && (d = d(view)) != null) {
                d.a = null;
            }
            if (dabVar.k != null && (f = f(view)) != null) {
                f.a = null;
            }
            if (dabVar.l != null) {
                if ((view instanceof dba) && (b = ((dba) view).b()) != null) {
                    b.a = null;
                }
                czd f2 = f(view);
                if (f2 != null) {
                    f2.b = null;
                }
            }
            boolean z3 = view instanceof ComponentHost;
            if (z3) {
                ((ComponentHost) view).h = null;
            } else {
                view.setTag(null);
            }
            SparseArray sparseArray = dabVar.c;
            if (z3) {
                ((ComponentHost) view).i = null;
            } else if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    view.setTag(sparseArray.keyAt(i), null);
                }
            }
            if (!dabVar.d && (view instanceof ViewGroup)) {
                ((ViewGroup) view).setClipChildren(true);
            }
            if (!TextUtils.isEmpty(dabVar.a)) {
                view.setContentDescription(null);
            }
            if (dabVar.y()) {
                if (view.getScaleX() != 1.0f) {
                    view.setScaleX(1.0f);
                }
                if (view.getScaleY() != 1.0f) {
                    view.setScaleY(1.0f);
                }
            }
            if (dabVar.t() && view.getAlpha() != 1.0f) {
                view.setAlpha(1.0f);
            }
            if (dabVar.v() && view.getRotation() != 0.0f) {
                view.setRotation(0.0f);
            }
            if (dabVar.w() && view.getRotationX() != 0.0f) {
                view.setRotationX(0.0f);
            }
            if (dabVar.x() && view.getRotationY() != 0.0f) {
                view.setRotationY(0.0f);
            }
        }
        view.setClickable(1 == (dca.a(dmsVar).a & 1));
        view.setLongClickable((dca.a(dmsVar).a & 2) == 2);
        view.setFocusable((dca.a(dmsVar).a & 4) == 4);
        view.setEnabled((dca.a(dmsVar).a & 8) == 8);
        if ((dca.a(dmsVar).a & 16) != 16) {
            z2 = false;
        }
        view.setSelected(z2);
        if (a.e != 0) {
            lj.V(view, 0);
        }
        boolean z4 = view instanceof ComponentHost;
        if (z4 || view.getTag(R.id.component_node_info) != null) {
            view.setTag(R.id.component_node_info, null);
            if (!z4) {
                lj.M(view, null);
            }
        }
        deq deqVar = a.a;
        if (deqVar != null) {
            int i2 = a.d;
            if (z) {
                return;
            }
            if (deqVar.b()) {
                try {
                    view.setPadding(0, 0, 0, 0);
                } catch (NullPointerException e2) {
                    throw new NullPointerException("Component: " + dbn.a(dmsVar).b.o() + ", view: " + view.getClass().getSimpleName() + ", message: " + e2.getMessage());
                }
            }
            if (deqVar.a != null) {
                view.setBackground(null);
            }
            view.setLayoutDirection(2);
        }
    }

    private final boolean K() {
        return this.F != null;
    }

    private final boolean L(int i) {
        int[] iArr = this.k;
        return iArr != null && iArr[i] > 0;
    }

    private final boolean M(dbq dbqVar, int i) {
        dbq dbqVar2;
        def defVar;
        deh dehVar;
        return (!N(dbqVar) || !K() || this.E == null || (dbqVar2 = this.h) == null || (defVar = ((dbn) dbqVar2.g(i).a).g) == null || (dehVar = (deh) this.E.b.a(defVar)) == null || dehVar.c != 2) ? false : true;
    }

    private final boolean N(dbq dbqVar) {
        return this.c && (this.A == dbqVar.p || this.i);
    }

    private static final int O(dbq dbqVar, int i) {
        long j = ((dbn) dbqVar.g(i).a).j;
        int b = dbqVar.b();
        for (int i2 = i + 1; i2 < b; i2++) {
            long j2 = ((dbn) dbqVar.g(i2).a).h;
            while (j2 != j) {
                if (j2 == 0) {
                    return i2 - 1;
                }
                j2 = ((dbn) dbqVar.g(dbqVar.a(j2)).a).h;
            }
        }
        return dbqVar.b() - 1;
    }

    private final void P(dbq dbqVar) {
        List list;
        int i;
        int i2;
        int height;
        int width;
        long[] jArr = this.b;
        long j = 0;
        if (jArr == null) {
            list = Collections.emptyList();
        } else {
            if (jArr.length > 0 && M(dbqVar, 0)) {
                String valueOf = String.valueOf(v(this.D));
                czq.a(2, "MountState:DisappearAnimTargetingRoot", valueOf.length() != 0 ? "Disppear animations cannot target the root LithoView! ".concat(valueOf) : new String("Disppear animations cannot target the root LithoView! "));
            }
            list = null;
            int i3 = 1;
            while (i3 < this.b.length) {
                if (M(dbqVar, i3)) {
                    int O = O(this.h, i3);
                    for (int i4 = i3; i4 <= O; i4++) {
                        if (g(i4) == null) {
                            dmw g = this.h.g(i4);
                            B(i4, g, (dbn) g.a, this.h);
                        }
                    }
                    dms g2 = g(i3);
                    ComponentHost componentHost = (ComponentHost) this.f.f(j);
                    dms g3 = g(i3);
                    ViewParent viewParent = g3.b;
                    if (viewParent != componentHost) {
                        Object obj = g3.a;
                        int i5 = 0;
                        int i6 = 0;
                        while (viewParent != componentHost) {
                            ComponentHost componentHost2 = (ComponentHost) viewParent;
                            i5 += componentHost2.getLeft();
                            i6 += componentHost2.getTop();
                            viewParent = (ComponentHost) componentHost2.getParent();
                        }
                        if (obj instanceof View) {
                            View view = (View) obj;
                            i = i5 + view.getLeft();
                            i2 = i6 + view.getTop();
                            width = i + view.getWidth();
                            height = i2 + view.getHeight();
                        } else {
                            Rect bounds = ((Drawable) obj).getBounds();
                            i = i5 + bounds.left;
                            i2 = i6 + bounds.top;
                            height = i2 + bounds.height();
                            width = i + bounds.width();
                        }
                        g3.b.t(i3, g3);
                        h(obj, i, i2, width, height, false);
                        componentHost.n(i3, g3, p);
                        g3.b = componentHost;
                    }
                    if (i3 == 0) {
                        throw new RuntimeException("Cannot remove disappearing item mappings for root LithoView!");
                    }
                    this.B = i3;
                    this.C = O;
                    for (int i7 = i3; i7 <= O; i7++) {
                        dms g4 = g(i7);
                        this.q.l(this.b[i7]);
                        dbn a = dbn.a(g4);
                        if (a.b.ab()) {
                            this.s.l(this.b[i7]);
                        }
                        if (cyr.v(a.b)) {
                            agb agbVar = this.f;
                            agbVar.m(agbVar.b((ComponentHost) g4.a));
                        }
                    }
                    def defVar = dbn.a(g2).g;
                    dda ddaVar = (dda) this.l.get(defVar);
                    if (ddaVar == null) {
                        ddaVar = new dda();
                        this.l.put(defVar, ddaVar);
                    }
                    ddaVar.e(dbr.a(this.b[i3]), g2);
                    dmr dmrVar = g2.b;
                    Object obj2 = g2.a;
                    if (obj2 instanceof Drawable) {
                        ComponentHost componentHost3 = (ComponentHost) dmrVar;
                        componentHost3.h();
                        hz.p(i3, componentHost3.e, componentHost3.f);
                    } else if (obj2 instanceof View) {
                        ComponentHost componentHost4 = (ComponentHost) dmrVar;
                        componentHost4.j();
                        hz.p(i3, componentHost4.c, componentHost4.d);
                        componentHost4.j = true;
                        componentHost4.m(i3, g2);
                    }
                    ComponentHost componentHost5 = (ComponentHost) dmrVar;
                    componentHost5.i();
                    hz.p(i3, componentHost5.a, componentHost5.b);
                    componentHost5.q();
                    componentHost5.g();
                    componentHost5.g.add(g2);
                    if (list == null) {
                        list = new ArrayList(2);
                    }
                    list.add(Integer.valueOf(i3));
                    list.add(Integer.valueOf(O));
                    i3 = O + 1;
                } else {
                    i3++;
                }
                j = 0;
            }
            if (list == null) {
                list = Collections.emptyList();
            }
        }
        dco dcoVar = this.w;
        dcoVar.c = 0;
        dcoVar.b = 0;
        dcoVar.a = 0;
        if (this.b != null) {
            int i8 = 0;
            int i9 = 0;
            while (true) {
                long[] jArr2 = this.b;
                if (i8 >= jArr2.length) {
                    break;
                }
                int a2 = dbqVar.a(jArr2[i8]);
                Object obj3 = a2 < 0 ? null : dbqVar.g(a2).a;
                int i10 = obj3 == null ? -1 : ((dbn) obj3).i;
                dms g5 = g(i8);
                if (list.size() <= i9 || ((Integer) list.get(i9)).intValue() != i8) {
                    if (i10 == -1) {
                        p(i8, this.f);
                    } else {
                        long j2 = ((dbn) obj3).h;
                        if (g5 != null) {
                            if (g5.b != this.f.f(j2)) {
                                p(i8, this.f);
                                this.w.a++;
                            } else if (i10 != i8) {
                                g5.b.o(g5, i8, i10);
                                this.w.b++;
                            } else {
                                this.w.c++;
                            }
                        }
                    }
                    this.w.a++;
                } else {
                    i8 = ((Integer) list.get(i9 + 1)).intValue();
                    i9 += 2;
                }
                i8++;
            }
        }
        if (this.f.f(0L) == null) {
            D(0L, this.v);
            this.q.k(0L, this.D);
        }
        int b = dbqVar.b();
        long[] jArr3 = this.b;
        if (jArr3 == null || b != jArr3.length) {
            this.b = new long[b];
        }
        for (int i11 = 0; i11 < b; i11++) {
            this.b[i11] = ((dbn) dbqVar.g(i11).a).j;
        }
    }

    private final void Q(ddb ddbVar) {
        dcn dcnVar = this.x;
        if (!dcnVar.n) {
            tha.b(ddbVar);
        } else if (dcnVar.j == 0 || dcnVar.a.isEmpty()) {
            tha.b(ddbVar);
        } else {
            String[] strArr = (String[]) this.x.a.toArray(new String[0]);
            Double[] dArr = (Double[]) this.x.f.toArray(new Double[0]);
            String[] strArr2 = (String[]) this.x.b.toArray(new String[0]);
            Double[] dArr2 = (Double[]) this.x.g.toArray(new Double[0]);
            String[] strArr3 = (String[]) this.x.e.toArray(new String[0]);
            String[] strArr4 = (String[]) this.x.c.toArray(new String[0]);
            Double[] dArr3 = (Double[]) this.x.h.toArray(new Double[0]);
            String[] strArr5 = (String[]) this.x.d.toArray(new String[0]);
            Double[] dArr4 = (Double[]) this.x.i.toArray(new Double[0]);
            tha.d(ddbVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static View b(det detVar, dci dciVar) {
        dab dabVar;
        cyr cyrVar = detVar.a;
        if (!cyr.z(cyrVar)) {
            cyr cyrVar2 = detVar.b;
            if (cyrVar2 != null) {
                cyo cyoVar = cyrVar2.s;
                Object obj = (cyoVar == null || (dabVar = cyoVar.g) == null) ? null : dabVar.b;
                if (obj != null) {
                    return dnt.e(dciVar, obj);
                }
            }
            return null;
        }
        return t(cyrVar, dciVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cyu c(View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost) view).k;
        }
        return (cyu) view.getTag(R.id.component_click_listener);
    }

    static cyw d(View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost) view).m;
        }
        return (cyw) view.getTag(R.id.component_focus_change_listener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static czc e(View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost) view).l;
        }
        return (czc) view.getTag(R.id.component_long_click_listener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static czd f(View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost) view).n;
        }
        return (czd) view.getTag(R.id.component_touch_listener);
    }

    public static void h(Object obj, int i, int i2, int i3, int i4, boolean z) {
        if (obj instanceof View) {
            hz.v((View) obj, i, i2, i3, i4, z);
        } else if (obj instanceof Drawable) {
            ((Drawable) obj).setBounds(i, i2, i3, i4);
        } else {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Unsupported mounted content ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    static void n(View view, czd czdVar) {
        if (view instanceof ComponentHost) {
            ComponentHost componentHost = (ComponentHost) view;
            componentHost.n = czdVar;
            componentHost.setOnTouchListener(czdVar);
            return;
        }
        view.setOnTouchListener(czdVar);
        view.setTag(R.id.component_touch_listener, czdVar);
    }

    private static int s(Rect rect) {
        if (rect.isEmpty()) {
            return 0;
        }
        return rect.width() * rect.height();
    }

    private static View t(cyr cyrVar, ComponentHost componentHost) {
        View t;
        int a = componentHost.a();
        for (int i = 0; i < a; i++) {
            dms d = componentHost.d(i);
            cyr cyrVar2 = dbn.a(d).b;
            if (cyrVar != cyrVar2) {
                if (cyr.v(cyrVar2) && (t = t(cyrVar, (ComponentHost) d.a)) != null) {
                    return t;
                }
            } else {
                return (View) d.a;
            }
        }
        return null;
    }

    private final cyv u(cyr cyrVar) {
        cyv cyvVar = cyrVar.q;
        return cyvVar == null ? this.u : cyvVar;
    }

    private final String v(dms dmsVar) {
        long j;
        int b = this.q.b(dmsVar);
        int i = -1;
        if (b >= 0) {
            j = this.q.d(b);
            int i2 = 0;
            while (true) {
                long[] jArr = this.b;
                if (i2 >= jArr.length) {
                    break;
                } else if (j == jArr[i2]) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            j = -1;
        }
        ComponentTree componentTree = this.v.r;
        String o = componentTree == null ? "<null_component_tree>" : componentTree.b().o();
        int i3 = this.B;
        int i4 = this.C;
        Object obj = dmsVar.a;
        String valueOf = String.valueOf(obj != null ? obj.getClass() : "<null_content>");
        cyr cyrVar = dbn.a(dmsVar).b;
        String o2 = dbn.a(dmsVar).b.o();
        String valueOf2 = String.valueOf(dbn.a(dmsVar).g);
        dmr dmrVar = dmsVar.b;
        String valueOf3 = String.valueOf(dmrVar != null ? dmrVar.getClass() : "<null_host>");
        int i5 = i;
        boolean z = this.f.f(0L) == dmsVar.b;
        int length = String.valueOf(o).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 188 + length2 + String.valueOf(o2).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("rootComponent=");
        sb.append(o);
        sb.append(", index=");
        sb.append(i5);
        sb.append(", mapIndex=");
        sb.append(b);
        sb.append(", id=");
        sb.append(j);
        sb.append(", disappearRange=[");
        sb.append(i3);
        sb.append(",");
        sb.append(i4);
        sb.append("], contentType=");
        sb.append(valueOf);
        sb.append(", component=");
        sb.append(o2);
        sb.append(", transitionId=");
        sb.append(valueOf2);
        sb.append(", host=");
        sb.append(valueOf3);
        sb.append(", isRootHost=");
        sb.append(z);
        return sb.toString();
    }

    private final void w(dms dmsVar) {
        if (this.q.b(dmsVar) >= 0) {
            String valueOf = String.valueOf(v(dmsVar));
            czq.a(2, "MountState:DanglingContentDuringAnim", valueOf.length() != 0 ? "Got dangling mount content during animation: ".concat(valueOf) : new String("Got dangling mount content during animation: "));
        }
    }

    private final void x(def defVar) {
        den denVar = this.E;
        if (denVar == null || defVar == null) {
            return;
        }
        denVar.f(defVar, null);
    }

    private static void y(dms dmsVar) {
        cyr cyrVar = dbn.a(dmsVar).b;
        if (!cyr.z(cyrVar)) {
            return;
        }
        J(dmsVar, cyr.v(cyrVar));
    }

    private final void z() {
        if (this.E == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.j.size());
        int c = this.q.c();
        for (int i = 0; i < c; i++) {
            dms dmsVar = (dms) this.q.h(i);
            dbn a = dbn.a(dmsVar);
            if (a.g != null) {
                int a2 = dbr.a(this.q.d(i));
                dda ddaVar = (dda) linkedHashMap.get(a.g);
                if (ddaVar == null) {
                    ddaVar = new dda();
                    linkedHashMap.put(a.g, ddaVar);
                }
                ddaVar.f(a2, dmsVar.a);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            this.E.f((def) entry.getKey(), (dda) entry.getValue());
        }
        for (Map.Entry entry2 : this.l.entrySet()) {
            dda ddaVar2 = (dda) entry2.getValue();
            dda ddaVar3 = new dda();
            short s = ddaVar2.b;
            for (int i2 = 0; i2 < s; i2++) {
                ddaVar3.e(ddaVar2.a(i2), ((dms) ddaVar2.c(i2)).a);
            }
            this.E.f((def) entry2.getKey(), ddaVar3);
        }
    }

    public final int a() {
        long[] jArr = this.b;
        if (jArr == null) {
            return 0;
        }
        return jArr.length;
    }

    public final dms g(int i) {
        long[] jArr = this.b;
        if (jArr != null && i < jArr.length) {
            return (dms) this.q.f(jArr[i]);
        }
        return null;
    }

    public final void i(cyr cyrVar, Object obj) {
        cyv u = u(cyrVar);
        u.e = "bind";
        cyrVar.P(u, obj);
        u.f();
        dak dakVar = this.I;
        boolean a = dak.a(cyrVar);
        int length = cyr.i.length;
        if (!a) {
            return;
        }
        HashSet hashSet = new HashSet();
        SparseArray g = cyrVar.g();
        for (int i = 0; i < g.size(); i++) {
            int keyAt = g.keyAt(i);
            dal dalVar = (dal) g.valueAt(i);
            View view = (View) obj;
            switch (keyAt) {
                case 1:
                    view.setAlpha(((Float) dalVar.a).floatValue());
                    break;
                case 2:
                    view.setTranslationX(((Float) dalVar.a).floatValue());
                    break;
                case 3:
                    view.setTranslationY(((Float) dalVar.a).floatValue());
                    break;
                case 4:
                    view.setScaleX(((Float) dalVar.a).floatValue());
                    break;
                case 5:
                    view.setScaleY(((Float) dalVar.a).floatValue());
                    break;
                case 6:
                    view.setElevation(((Float) dalVar.a).floatValue());
                    break;
                case 7:
                    view.setBackgroundColor(((Integer) dalVar.a).intValue());
                    break;
                case 8:
                    view.setRotation(((Float) dalVar.a).floatValue());
                    break;
            }
            Set set = (Set) dakVar.a.get(dalVar);
            if (set == null) {
                set = new HashSet();
                dakVar.a.put(dalVar, set);
                dalVar.b.add(dakVar);
            }
            set.add(cyrVar);
            hashSet.add(dalVar);
        }
        int length2 = cyr.i.length;
        dakVar.b.put(cyrVar, hashSet);
        dakVar.c.put(cyrVar, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        deu deuVar = this.m;
        if (deuVar != null) {
            if (deuVar.a.z()) {
                return;
            }
            deuVar.a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.r.keySet()) {
            des desVar = (des) this.r.get(str);
            if (desVar.d) {
                desVar.d = false;
            } else {
                arrayList.add(str);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) arrayList.get(i);
            des desVar2 = (des) this.r.get(str2);
            daq daqVar = desVar2.a;
            daq daqVar2 = desVar2.b;
            daq daqVar3 = desVar2.c;
            if (daqVar != null) {
                czu.j(daqVar, this.v);
            }
            if (desVar2.c()) {
                desVar2.a(false);
                if (daqVar2 != null) {
                    czu.k(daqVar2);
                }
            }
            if (daqVar3 != null) {
                czu.l(daqVar3, 0, 0, 0.0f, 0.0f);
            }
            desVar2.e = false;
            this.r.remove(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(dbq dbqVar, ComponentTree componentTree) {
        if (this.G) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List list = dbqVar.u;
        if (list != null) {
            arrayList.addAll(list);
        }
        componentTree.j(arrayList, dbqVar.m);
        ddz ddzVar = new ddz();
        ddz ddzVar2 = new ddz();
        def defVar = dbqVar.l;
        if (defVar != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                dee deeVar = (dee) arrayList.get(i);
                if (deeVar != null) {
                    czu.w(defVar, deeVar, dfd.c, ddzVar);
                    czu.w(defVar, deeVar, dfd.d, ddzVar2);
                } else {
                    String str = dbqVar.m;
                    String valueOf = String.valueOf(defVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 77 + String.valueOf(valueOf).length());
                    sb.append("NULL_TRANSITION when collecting root bounds anim. Root: ");
                    sb.append(str);
                    sb.append(", root TransitionId: ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
        dee deeVar2 = null;
        if (true != ddzVar.a) {
            ddzVar = null;
        }
        if (true != ddzVar2.a) {
            ddzVar2 = null;
        }
        componentTree.q = ddzVar;
        componentTree.r = ddzVar2;
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == 1) {
                deeVar2 = (dee) arrayList.get(0);
            } else {
                deeVar2 = new deo(arrayList);
            }
        }
        this.F = deeVar2;
        this.G = true;
    }

    public final void l(dda ddaVar) {
        int b;
        x(dbn.a((dms) ddaVar.d()).g);
        short s = ddaVar.b;
        for (int i = 0; i < s; i++) {
            dms dmsVar = (dms) ddaVar.c(i);
            if (ddaVar.a(i) == 3) {
                ComponentHost componentHost = (ComponentHost) dmsVar.a;
                int a = componentHost.a();
                while (true) {
                    a--;
                    if (a < 0) {
                        break;
                    }
                    I(this.u, componentHost.d(a));
                }
                if (componentHost.a() > 0) {
                    throw new IllegalStateException("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
                }
            }
            ComponentHost componentHost2 = (ComponentHost) dmsVar.b;
            componentHost2.g();
            if (!componentHost2.g.remove(dmsVar)) {
                String valueOf = String.valueOf(dbn.a(dmsVar).g);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                sb.append("Tried to remove non-existent disappearing item, transitionId: ");
                sb.append(valueOf);
                throw new RuntimeException(sb.toString());
            }
            Object obj = dmsVar.a;
            if (obj instanceof Drawable) {
                componentHost2.u(dmsVar);
            } else if (obj instanceof View) {
                componentHost2.v((View) obj);
            }
            hz.n(dmsVar);
            y(dmsVar);
            H(dmsVar);
            if (dbn.a(dmsVar).b.ab() && (b = this.s.b(dmsVar)) > 0) {
                this.s.m(b);
            }
            w(dmsVar);
            try {
                dca.a(dmsVar).b(this.u.b, dmsVar, "endUnmountDisappearingItem");
            } catch (dbz e) {
                String message = e.getMessage();
                String v = v(dmsVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 1 + String.valueOf(v).length());
                sb2.append(message);
                sb2.append(" ");
                sb2.append(v);
                throw new RuntimeException(sb2.toString());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x05f8, code lost:
        if (((com.facebook.litho.ComponentHost) r15).a() > 0) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x06d4, code lost:
        if (r0.height() == (r13 ? ((android.graphics.drawable.Drawable) r14).getBounds().height() : ((android.view.View) r14).getHeight())) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x06db, code lost:
        if (r5.af() != false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x06de, code lost:
        if (r6 == false) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x06e1, code lost:
        if (r2 != 1) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x06e5, code lost:
        if ((r3 instanceof defpackage.daj) == false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x06e9, code lost:
        if ((r5 instanceof defpackage.daj) == false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x06ef, code lost:
        if (r3.ah(r3, r5) == false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x06f2, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x06f5, code lost:
        if (r2 != 2) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x06fc, code lost:
        if (r3.Y() != false) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x06ff, code lost:
        r0 = r3.ah(r3, r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ca A[Catch: all -> 0x03b3, TryCatch #0 {, blocks: (B:17:0x0059, B:19:0x005f, B:34:0x00f4, B:22:0x0065, B:23:0x006f, B:25:0x0075, B:26:0x007f, B:27:0x0095, B:29:0x009b, B:30:0x00b4, B:32:0x00dd, B:33:0x00eb, B:38:0x00ff, B:40:0x0107, B:41:0x0111, B:43:0x0117, B:45:0x0127, B:46:0x012b, B:48:0x0131, B:50:0x013a, B:52:0x0140, B:53:0x0147, B:54:0x0155, B:56:0x015b, B:57:0x0164, B:59:0x0168, B:60:0x0170, B:62:0x0176, B:80:0x020f, B:82:0x0216, B:84:0x021a, B:85:0x021e, B:87:0x0224, B:89:0x0230, B:90:0x0234, B:92:0x0240, B:94:0x0244, B:95:0x0247, B:96:0x024e, B:97:0x025d, B:99:0x0263, B:101:0x0279, B:102:0x0284, B:103:0x0288, B:105:0x028e, B:106:0x029a, B:107:0x02a4, B:109:0x02aa, B:111:0x02bc, B:113:0x02c6, B:115:0x02ca, B:117:0x02dc, B:119:0x02e6, B:121:0x02fb, B:123:0x0305, B:124:0x030d, B:125:0x0310, B:126:0x0313, B:128:0x031e, B:129:0x0328, B:131:0x032e, B:133:0x0340, B:135:0x0344, B:136:0x034c, B:138:0x0357, B:139:0x036a, B:141:0x036e, B:145:0x0377, B:147:0x037a, B:64:0x0197, B:65:0x01a8, B:67:0x01ae, B:69:0x01ce, B:72:0x01da, B:74:0x01e6, B:75:0x01f2, B:77:0x01f8, B:79:0x0204), top: B:567:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x031e A[Catch: all -> 0x03b3, TryCatch #0 {, blocks: (B:17:0x0059, B:19:0x005f, B:34:0x00f4, B:22:0x0065, B:23:0x006f, B:25:0x0075, B:26:0x007f, B:27:0x0095, B:29:0x009b, B:30:0x00b4, B:32:0x00dd, B:33:0x00eb, B:38:0x00ff, B:40:0x0107, B:41:0x0111, B:43:0x0117, B:45:0x0127, B:46:0x012b, B:48:0x0131, B:50:0x013a, B:52:0x0140, B:53:0x0147, B:54:0x0155, B:56:0x015b, B:57:0x0164, B:59:0x0168, B:60:0x0170, B:62:0x0176, B:80:0x020f, B:82:0x0216, B:84:0x021a, B:85:0x021e, B:87:0x0224, B:89:0x0230, B:90:0x0234, B:92:0x0240, B:94:0x0244, B:95:0x0247, B:96:0x024e, B:97:0x025d, B:99:0x0263, B:101:0x0279, B:102:0x0284, B:103:0x0288, B:105:0x028e, B:106:0x029a, B:107:0x02a4, B:109:0x02aa, B:111:0x02bc, B:113:0x02c6, B:115:0x02ca, B:117:0x02dc, B:119:0x02e6, B:121:0x02fb, B:123:0x0305, B:124:0x030d, B:125:0x0310, B:126:0x0313, B:128:0x031e, B:129:0x0328, B:131:0x032e, B:133:0x0340, B:135:0x0344, B:136:0x034c, B:138:0x0357, B:139:0x036a, B:141:0x036e, B:145:0x0377, B:147:0x037a, B:64:0x0197, B:65:0x01a8, B:67:0x01ae, B:69:0x01ce, B:72:0x01da, B:74:0x01e6, B:75:0x01f2, B:77:0x01f8, B:79:0x0204), top: B:567:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0ae5  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0b60  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.dbq r30, android.graphics.Rect r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 2925
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcp.m(dbq, android.graphics.Rect, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o() {
        long[] jArr = this.b;
        if (jArr == null) {
            return;
        }
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            dms g = g(i);
            if (g != null && g.c) {
                cyr cyrVar = dbn.a(g).b;
                Object obj = g.a;
                dak dakVar = this.I;
                if (!dak.a(cyrVar)) {
                    int length2 = cyr.i.length;
                } else {
                    dakVar.c.remove(cyrVar);
                    Set<dal> set = (Set) dakVar.b.get(cyrVar);
                    if (set != null) {
                        for (dal dalVar : set) {
                            Set set2 = (Set) dakVar.a.get(dalVar);
                            set2.remove(cyrVar);
                            if (set2.isEmpty()) {
                                dakVar.a.remove(dalVar);
                                dalVar.b.remove(dakVar);
                            }
                        }
                    }
                }
                cyrVar.as(obj);
                g.c = false;
            }
        }
        j();
        deu deuVar = this.m;
        if (deuVar != null) {
            deuVar.a();
        }
        this.e = false;
    }

    public final void p(int i, agb agbVar) {
        deh dehVar;
        dda ddaVar;
        dms g = g(i);
        long nanoTime = System.nanoTime();
        if (g == null) {
            return;
        }
        long j = this.b[i];
        if (j == 0) {
            J(g, true);
            return;
        }
        this.q.l(j);
        Object obj = g.a;
        if ((obj instanceof ComponentHost) && !(obj instanceof dci)) {
            ComponentHost componentHost = (ComponentHost) obj;
            int a = componentHost.a();
            while (true) {
                a--;
                if (a < 0) {
                    break;
                }
                dms d = componentHost.d(a);
                agb agbVar2 = this.q;
                long d2 = agbVar2.d(agbVar2.b(d));
                int length = this.b.length;
                while (true) {
                    length--;
                    if (length >= 0) {
                        if (this.b[length] == d2) {
                            p(length, agbVar);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (componentHost.a() > 0) {
                throw new IllegalStateException("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
            }
        }
        if (obj instanceof dbc) {
            ArrayList arrayList = new ArrayList();
            ((dbc) obj).a(arrayList);
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((dci) arrayList.get(size)).K();
            }
        }
        ((ComponentHost) g.b).t(i, g);
        y(g);
        dbn a2 = dbn.a(g);
        cyr cyrVar = a2.b;
        if (cyr.v(cyrVar)) {
            ComponentHost componentHost2 = (ComponentHost) obj;
            agbVar.m(agbVar.b(componentHost2));
            E(componentHost2);
        }
        H(g);
        boolean z = dfz.a;
        if (dbn.a(g).g != null) {
            int a3 = dbr.a(j);
            def defVar = a2.g;
            den denVar = this.E;
            if (denVar != null && defVar != null && (dehVar = (deh) denVar.b.a(defVar)) != null && (ddaVar = dehVar.b) != null && ddaVar.b(a3) != null) {
                dda ddaVar2 = null;
                if (ddaVar.b > 1) {
                    dda ddaVar3 = new dda(ddaVar);
                    ddaVar3.f(a3, null);
                    ddaVar2 = ddaVar3;
                }
                denVar.g(defVar, dehVar, ddaVar2);
            }
        }
        if (cyrVar.ab()) {
            this.s.l(this.b[i]);
        }
        try {
            dca.a(g).b(this.u.b, g, "unmountItem");
            dcn dcnVar = this.x;
            if (!dcnVar.n) {
                return;
            }
            List list = dcnVar.g;
            double nanoTime2 = System.nanoTime() - nanoTime;
            Double.isNaN(nanoTime2);
            list.add(Double.valueOf(nanoTime2 / 1000000.0d));
            this.x.b.add(cyrVar.o());
            this.x.k++;
        } catch (dbz e) {
            String message = e.getMessage();
            String v = v(g);
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 1 + String.valueOf(v).length());
            sb.append(message);
            sb.append(" ");
            sb.append(v);
            throw new RuntimeException(sb.toString());
        }
    }

    public final void q(dbq dbqVar, int i, boolean z) {
        int O = O(dbqVar, i);
        for (int i2 = i; i2 <= O; i2++) {
            if (z) {
                int[] iArr = this.k;
                iArr[i2] = iArr[i2] + 1;
            } else {
                int[] iArr2 = this.k;
                int i3 = iArr2[i2] - 1;
                iArr2[i2] = i3;
                if (i3 < 0) {
                    czq.a(3, "MountState:InvalidAnimLockIndices", "Decremented animation lock count below 0!");
                    this.k[i2] = 0;
                }
            }
        }
        long j = ((dbn) dbqVar.g(i).a).h;
        while (j != 0) {
            int a = dbqVar.a(j);
            if (z) {
                int[] iArr3 = this.k;
                iArr3[a] = iArr3[a] + 1;
            } else {
                int[] iArr4 = this.k;
                int i4 = iArr4[a] - 1;
                iArr4[a] = i4;
                if (i4 < 0) {
                    czq.a(3, "MountState:InvalidAnimLockIndices", "Decremented animation lock count below 0!");
                    this.k[a] = 0;
                }
            }
            j = ((dbn) dbqVar.g(a).a).h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fe, code lost:
        if (r10.equals(r11) != false) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050 A[Catch: all -> 0x01b6, TRY_ENTER, TryCatch #2 {all -> 0x01b6, blocks: (B:4:0x000a, B:5:0x000f, B:8:0x0017, B:10:0x001d, B:11:0x0020, B:17:0x0039, B:23:0x0050, B:25:0x0054), top: B:120:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054 A[Catch: all -> 0x01b6, TRY_LEAVE, TryCatch #2 {all -> 0x01b6, blocks: (B:4:0x000a, B:5:0x000f, B:8:0x0017, B:10:0x001d, B:11:0x0020, B:17:0x0039, B:23:0x0050, B:25:0x0054), top: B:120:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f A[Catch: all -> 0x01a1, TryCatch #0 {all -> 0x01a1, blocks: (B:31:0x0065, B:33:0x006f, B:35:0x0075, B:37:0x007b, B:40:0x0087, B:42:0x008e, B:44:0x0094, B:46:0x009b, B:47:0x009e, B:52:0x00b4, B:54:0x00c6, B:79:0x0121, B:81:0x0127, B:83:0x0130, B:85:0x0135, B:88:0x015a, B:90:0x015e, B:92:0x0165, B:94:0x0179, B:95:0x0187, B:59:0x00d6, B:73:0x0110, B:75:0x0116, B:77:0x011c, B:62:0x00e1, B:68:0x0100, B:70:0x0106, B:72:0x010c, B:66:0x00fa, B:48:0x00a5, B:100:0x019d, B:104:0x01a9), top: B:116:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0121 A[Catch: all -> 0x01a1, TryCatch #0 {all -> 0x01a1, blocks: (B:31:0x0065, B:33:0x006f, B:35:0x0075, B:37:0x007b, B:40:0x0087, B:42:0x008e, B:44:0x0094, B:46:0x009b, B:47:0x009e, B:52:0x00b4, B:54:0x00c6, B:79:0x0121, B:81:0x0127, B:83:0x0130, B:85:0x0135, B:88:0x015a, B:90:0x015e, B:92:0x0165, B:94:0x0179, B:95:0x0187, B:59:0x00d6, B:73:0x0110, B:75:0x0116, B:77:0x011c, B:62:0x00e1, B:68:0x0100, B:70:0x0106, B:72:0x010c, B:66:0x00fa, B:48:0x00a5, B:100:0x019d, B:104:0x01a9), top: B:116:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0130 A[Catch: all -> 0x01a1, TryCatch #0 {all -> 0x01a1, blocks: (B:31:0x0065, B:33:0x006f, B:35:0x0075, B:37:0x007b, B:40:0x0087, B:42:0x008e, B:44:0x0094, B:46:0x009b, B:47:0x009e, B:52:0x00b4, B:54:0x00c6, B:79:0x0121, B:81:0x0127, B:83:0x0130, B:85:0x0135, B:88:0x015a, B:90:0x015e, B:92:0x0165, B:94:0x0179, B:95:0x0187, B:59:0x00d6, B:73:0x0110, B:75:0x0116, B:77:0x011c, B:62:0x00e1, B:68:0x0100, B:70:0x0106, B:72:0x010c, B:66:0x00fa, B:48:0x00a5, B:100:0x019d, B:104:0x01a9), top: B:116:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0135 A[Catch: all -> 0x01a1, TryCatch #0 {all -> 0x01a1, blocks: (B:31:0x0065, B:33:0x006f, B:35:0x0075, B:37:0x007b, B:40:0x0087, B:42:0x008e, B:44:0x0094, B:46:0x009b, B:47:0x009e, B:52:0x00b4, B:54:0x00c6, B:79:0x0121, B:81:0x0127, B:83:0x0130, B:85:0x0135, B:88:0x015a, B:90:0x015e, B:92:0x0165, B:94:0x0179, B:95:0x0187, B:59:0x00d6, B:73:0x0110, B:75:0x0116, B:77:0x011c, B:62:0x00e1, B:68:0x0100, B:70:0x0106, B:72:0x010c, B:66:0x00fa, B:48:0x00a5, B:100:0x019d, B:104:0x01a9), top: B:116:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015a A[Catch: all -> 0x01a1, TryCatch #0 {all -> 0x01a1, blocks: (B:31:0x0065, B:33:0x006f, B:35:0x0075, B:37:0x007b, B:40:0x0087, B:42:0x008e, B:44:0x0094, B:46:0x009b, B:47:0x009e, B:52:0x00b4, B:54:0x00c6, B:79:0x0121, B:81:0x0127, B:83:0x0130, B:85:0x0135, B:88:0x015a, B:90:0x015e, B:92:0x0165, B:94:0x0179, B:95:0x0187, B:59:0x00d6, B:73:0x0110, B:75:0x0116, B:77:0x011c, B:62:0x00e1, B:68:0x0100, B:70:0x0106, B:72:0x010c, B:66:0x00fa, B:48:0x00a5, B:100:0x019d, B:104:0x01a9), top: B:116:0x0065 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(defpackage.dbq r24, android.graphics.Rect r25, boolean r26, defpackage.ddb r27) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcp.r(dbq, android.graphics.Rect, boolean, ddb):void");
    }
}
