package defpackage;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
/* compiled from: PG */
/* renamed from: alou  reason: default package */
/* loaded from: classes.dex */
public final class alou {
    public CharSequence a;
    public CharSequence b;
    public View d;
    public TabLayout f;
    public alox g;
    public int c = -1;
    public final int e = 1;
    public int h = -1;

    public final void b() {
        alox aloxVar = this.g;
        if (aloxVar != null) {
            aloxVar.b();
        }
    }

    public final void a() {
        TabLayout tabLayout = this.f;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.g(this);
    }
}
