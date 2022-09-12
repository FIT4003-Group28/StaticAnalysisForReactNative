package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxse  reason: default package */
/* loaded from: classes5.dex */
public final class cxse {
    private static final String[] a = {"android.permission.READ_CONTACTS"};
    private final Context b;
    private final cxsf c;
    private final boolean d;
    private final cxqo e;
    private boolean f;
    private PeopleKitVisualElementPath g;
    private final List<cxsd> h = new ArrayList();

    public cxse(Context context, cxsf cxsfVar, boolean z, cxqo cxqoVar) {
        this.b = context;
        this.c = cxsfVar;
        this.d = z;
        this.e = cxqoVar;
    }

    public static boolean a(Context context) {
        return Build.VERSION.SDK_INT < 23 ? jc.a(context, "android.permission.READ_CONTACTS") == 0 : akm.d(context, "android.permission.READ_CONTACTS") != -1;
    }

    private final boolean g() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        return !h() || this.c.b();
    }

    private final boolean h() {
        return this.b.getSharedPreferences("SHARED_PREFS_SENDKIT", 0).getBoolean("PERMISSION_PROMPT_SHOWN_BEFORE", false);
    }

    private final boolean i() {
        return a(this.b);
    }

    private final void j(cxof cxofVar, boolean z) {
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.a(new czhc(cxofVar));
        if (z) {
            peopleKitVisualElementPath.a(new czhc(dhjm.I));
        }
        peopleKitVisualElementPath.a(new czhc(dhjm.o));
        PeopleKitVisualElementPath peopleKitVisualElementPath2 = this.g;
        if (peopleKitVisualElementPath2 != null) {
            peopleKitVisualElementPath.c(peopleKitVisualElementPath2);
        }
        this.e.d(4, peopleKitVisualElementPath);
    }

    public final void b(cxsd cxsdVar) {
        this.h.add(cxsdVar);
    }

    public final void c(PeopleKitVisualElementPath peopleKitVisualElementPath) {
        if (!e() || h()) {
            return;
        }
        d(peopleKitVisualElementPath);
    }

    public final void d(PeopleKitVisualElementPath peopleKitVisualElementPath) {
        if (!this.d || i() || !g() || this.f) {
            return;
        }
        cxqo cxqoVar = this.e;
        PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath2.a(new czhc(dhjm.o));
        peopleKitVisualElementPath2.c(peopleKitVisualElementPath);
        cxqoVar.d(-1, peopleKitVisualElementPath2);
        this.f = true;
        this.g = peopleKitVisualElementPath;
        this.c.a(a);
    }

    public final boolean e() {
        return Build.VERSION.SDK_INT >= 23 && this.d && !i() && g();
    }

    public final void f(int i, int[] iArr) {
        this.f = false;
        if (i != 1234) {
            return;
        }
        this.b.getSharedPreferences("SHARED_PREFS_SENDKIT", 0).edit().putBoolean("PERMISSION_PROMPT_SHOWN_BEFORE", true).apply();
        if (iArr.length <= 0 || iArr[0] != 0) {
            for (cxsd cxsdVar : this.h) {
                cxsdVar.b();
            }
            if (g()) {
                j(dhjm.H, false);
                return;
            } else {
                j(dhjm.H, true);
                return;
            }
        }
        for (cxsd cxsdVar2 : this.h) {
            cxsdVar2.a();
        }
        j(dhjm.G, false);
    }
}
