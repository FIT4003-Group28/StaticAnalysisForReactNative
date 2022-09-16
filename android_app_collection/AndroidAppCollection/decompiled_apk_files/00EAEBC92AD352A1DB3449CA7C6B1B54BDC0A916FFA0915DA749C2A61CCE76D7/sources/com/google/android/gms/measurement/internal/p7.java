package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import c.e.a.b.d.g.va;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public final class p7 extends f5 {

    /* renamed from: c  reason: collision with root package name */
    private volatile q7 f7586c;

    /* renamed from: d  reason: collision with root package name */
    private q7 f7587d;

    /* renamed from: e  reason: collision with root package name */
    protected q7 f7588e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Activity, q7> f7589f;

    /* renamed from: g  reason: collision with root package name */
    private Activity f7590g;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f7591h;
    private volatile q7 i;
    private q7 j;
    private boolean k;
    private final Object l;
    private String m;

    public p7(d5 d5Var) {
        super(d5Var);
        this.l = new Object();
        this.f7589f = new ConcurrentHashMap();
    }

    private static String a(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    private final void a(Activity activity, q7 q7Var, boolean z) {
        q7 q7Var2;
        q7 q7Var3 = this.f7586c == null ? this.f7587d : this.f7586c;
        if (q7Var.f7615b == null) {
            q7Var2 = new q7(q7Var.f7614a, activity != null ? a(activity.getClass().getCanonicalName()) : null, q7Var.f7616c, q7Var.f7618e);
        } else {
            q7Var2 = q7Var;
        }
        this.f7587d = this.f7586c;
        this.f7586c = q7Var2;
        a().a(new r7(this, q7Var2, q7Var3, b().b(), z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Bundle bundle, q7 q7Var, q7 q7Var2, long j) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        a(q7Var, q7Var2, j, true, j().a((String) null, "screen_view", bundle, (List<String>) null, true, true));
    }

    public static void a(q7 q7Var, Bundle bundle, boolean z) {
        if (bundle == null || q7Var == null || (bundle.containsKey("_sc") && !z)) {
            if (bundle == null || q7Var != null || !z) {
                return;
            }
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
            return;
        }
        String str = q7Var.f7614a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = q7Var.f7615b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", q7Var.f7616c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(q7 q7Var, q7 q7Var2, long j, boolean z, Bundle bundle) {
        boolean z2;
        q7 q7Var3;
        g();
        boolean z3 = false;
        if (l().a(r.U)) {
            z2 = z && this.f7588e != null;
            if (z2) {
                a(this.f7588e, true, j);
            }
        } else {
            if (z && (q7Var3 = this.f7588e) != null) {
                a(q7Var3, true, j);
            }
            z2 = false;
        }
        if (q7Var2 == null || q7Var2.f7616c != q7Var.f7616c || !z9.c(q7Var2.f7615b, q7Var.f7615b) || !z9.c(q7Var2.f7614a, q7Var.f7614a)) {
            z3 = true;
        }
        if (z3) {
            Bundle bundle2 = new Bundle();
            if (l().a(r.D0)) {
                bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            }
            a(q7Var, bundle2, true);
            if (q7Var2 != null) {
                String str = q7Var2.f7614a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = q7Var2.f7615b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", q7Var2.f7616c);
            }
            if (l().a(r.U) && z2) {
                long b2 = (!va.a() || !l().a(r.W) || !c.e.a.b.d.g.ia.a() || !l().a(r.A0)) ? t().f7223e.b() : t().a(j);
                if (b2 > 0) {
                    j().a(bundle2, b2);
                }
            }
            String str3 = "auto";
            if (l().a(r.D0)) {
                if (!l().r().booleanValue()) {
                    bundle2.putLong("_mt", 1L);
                }
                if (q7Var.f7618e) {
                    str3 = "app";
                }
            }
            o().b(str3, "_vs", bundle2);
        }
        this.f7588e = q7Var;
        if (l().a(r.D0) && q7Var.f7618e) {
            this.j = q7Var;
        }
        q().a(q7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(q7 q7Var, boolean z, long j) {
        n().a(b().b());
        if (!t().a(q7Var != null && q7Var.f7617d, z, j) || q7Var == null) {
            return;
        }
        q7Var.f7617d = false;
    }

    private final q7 d(Activity activity) {
        com.google.android.gms.common.internal.s.a(activity);
        q7 q7Var = this.f7589f.get(activity);
        if (q7Var == null) {
            q7 q7Var2 = new q7(null, a(activity.getClass().getCanonicalName()), j().s());
            this.f7589f.put(activity, q7Var2);
            q7Var = q7Var2;
        }
        return (l().a(r.D0) && this.i != null) ? this.i : q7Var;
    }

    @Override // com.google.android.gms.measurement.internal.f5
    protected final boolean A() {
        return false;
    }

    public final q7 B() {
        e();
        return this.f7586c;
    }

    public final q7 a(boolean z) {
        x();
        g();
        if (!l().a(r.D0) || !z) {
            return this.f7588e;
        }
        q7 q7Var = this.f7588e;
        return q7Var != null ? q7Var : this.j;
    }

    public final void a(Activity activity) {
        if (l().a(r.D0)) {
            synchronized (this.l) {
                this.k = true;
                if (activity != this.f7590g) {
                    synchronized (this.l) {
                        this.f7590g = activity;
                        this.f7591h = false;
                    }
                    if (l().a(r.C0) && l().r().booleanValue()) {
                        this.i = null;
                        a().a(new v7(this));
                    }
                }
            }
        }
        if (l().a(r.C0) && !l().r().booleanValue()) {
            this.f7586c = this.i;
            a().a(new u7(this));
            return;
        }
        a(activity, d(activity), false);
        a n = n();
        n.a().a(new e3(n, n.b().b()));
    }

    public final void a(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!l().r().booleanValue() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f7589f.put(activity, new q7(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void a(Activity activity, String str, String str2) {
        if (!l().r().booleanValue()) {
            c().y().a("setCurrentScreen cannot be called while screen reporting is disabled.");
        } else if (this.f7586c == null) {
            c().y().a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f7589f.get(activity) == null) {
            c().y().a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = a(activity.getClass().getCanonicalName());
            }
            boolean c2 = z9.c(this.f7586c.f7615b, str2);
            boolean c3 = z9.c(this.f7586c.f7614a, str);
            if (c2 && c3) {
                c().y().a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                c().y().a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 != null && (str2.length() <= 0 || str2.length() > 100)) {
                c().y().a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            } else {
                c().B().a("Setting current screen to name, class", str == null ? "null" : str, str2);
                q7 q7Var = new q7(str, str2, j().s());
                this.f7589f.put(activity, q7Var);
                a(activity, q7Var, true);
            }
        }
    }

    public final void a(Bundle bundle) {
        String str;
        if (!l().a(r.D0)) {
            c().y().a("Manual screen reporting is disabled.");
            return;
        }
        synchronized (this.l) {
            if (!this.k) {
                c().y().a("Cannot log screen view event when the app is in the background.");
                return;
            }
            String str2 = null;
            if (bundle != null) {
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > 100)) {
                    c().y().a("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > 100)) {
                    c().y().a("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                } else {
                    str = string;
                    str2 = string2;
                }
            } else {
                str = null;
            }
            if (str2 == null) {
                str2 = this.f7590g != null ? a(this.f7590g.getClass().getCanonicalName()) : "Activity";
            }
            String str3 = str2;
            if (this.f7591h && this.f7586c != null) {
                this.f7591h = false;
                boolean c2 = z9.c(this.f7586c.f7615b, str3);
                boolean c3 = z9.c(this.f7586c.f7614a, str);
                if (c2 && c3) {
                    c().y().a("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            c().B().a("Logging screen view with name, class", str == null ? "null" : str, str3 == null ? "null" : str3);
            q7 q7Var = this.f7586c == null ? this.f7587d : this.f7586c;
            q7 q7Var2 = new q7(str, str3, j().s(), true);
            this.f7586c = q7Var2;
            this.f7587d = q7Var;
            this.i = q7Var2;
            a().a(new s7(this, bundle, q7Var2, q7Var, b().b()));
        }
    }

    public final void a(String str, q7 q7Var) {
        g();
        synchronized (this) {
            if (this.m == null || this.m.equals(str) || q7Var != null) {
                this.m = str;
            }
        }
    }

    public final void b(Activity activity) {
        if (l().a(r.D0)) {
            synchronized (this.l) {
                this.k = false;
                this.f7591h = true;
            }
        }
        long b2 = b().b();
        if (l().a(r.C0) && !l().r().booleanValue()) {
            this.f7586c = null;
            a().a(new t7(this, b2));
            return;
        }
        q7 d2 = d(activity);
        this.f7587d = this.f7586c;
        this.f7586c = null;
        a().a(new w7(this, d2, b2));
    }

    public final void b(Activity activity, Bundle bundle) {
        q7 q7Var;
        if (!l().r().booleanValue() || bundle == null || (q7Var = this.f7589f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", q7Var.f7616c);
        bundle2.putString("name", q7Var.f7614a);
        bundle2.putString("referrer_name", q7Var.f7615b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void c(Activity activity) {
        synchronized (this.l) {
            if (activity == this.f7590g) {
                this.f7590g = null;
            }
        }
        if (!l().r().booleanValue()) {
            return;
        }
        this.f7589f.remove(activity);
    }
}
