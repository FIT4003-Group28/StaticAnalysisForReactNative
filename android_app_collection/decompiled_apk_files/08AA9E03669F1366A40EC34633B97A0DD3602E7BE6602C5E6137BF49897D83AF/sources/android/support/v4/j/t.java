package android.support.v4.j;

import android.os.Build;
import android.support.a.a;
import android.view.ViewGroup;
/* compiled from: ViewGroupCompat.java */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    static final c f534a;

    /* compiled from: ViewGroupCompat.java */
    /* loaded from: classes.dex */
    static class c {
        c() {
        }

        public boolean a(ViewGroup viewGroup) {
            Boolean bool = (Boolean) viewGroup.getTag(a.C0003a.tag_transition_group);
            return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && s.g(viewGroup) == null) ? false : true;
        }
    }

    /* compiled from: ViewGroupCompat.java */
    /* loaded from: classes.dex */
    static class a extends c {
        a() {
        }
    }

    /* compiled from: ViewGroupCompat.java */
    /* loaded from: classes.dex */
    static class b extends a {
        b() {
        }

        @Override // android.support.v4.j.t.c
        public boolean a(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f534a = new b();
        } else if (Build.VERSION.SDK_INT >= 18) {
            f534a = new a();
        } else {
            f534a = new c();
        }
    }

    public static boolean a(ViewGroup viewGroup) {
        return f534a.a(viewGroup);
    }
}
