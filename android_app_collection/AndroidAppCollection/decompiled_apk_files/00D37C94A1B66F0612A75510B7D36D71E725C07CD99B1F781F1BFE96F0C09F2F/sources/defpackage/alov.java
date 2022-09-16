package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: alov  reason: default package */
/* loaded from: classes.dex */
public final class alov implements bpn {
    public int a;
    public int b;
    private final WeakReference c;

    public alov(TabLayout tabLayout) {
        this.c = new WeakReference(tabLayout);
    }

    @Override // defpackage.bpn
    public final void a(int i) {
        this.a = this.b;
        this.b = i;
    }

    @Override // defpackage.bpn
    public final void b(int i, float f, int i2) {
        TabLayout tabLayout = (TabLayout) this.c.get();
        if (tabLayout != null) {
            int i3 = this.b;
            boolean z = false;
            boolean z2 = i3 != 2 || this.a == 1;
            if (i3 != 2 || this.a != 0) {
                z = true;
            }
            tabLayout.j(i, f, z2, z);
        }
    }

    @Override // defpackage.bpn
    public final void c(int i) {
        TabLayout tabLayout = (TabLayout) this.c.get();
        if (tabLayout == null || tabLayout.a() == i || i >= tabLayout.b()) {
            return;
        }
        int i2 = this.b;
        boolean z = false;
        if (i2 == 0 || (i2 == 2 && this.a == 0)) {
            z = true;
        }
        tabLayout.h(tabLayout.c(i), z);
    }
}
