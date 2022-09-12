package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
/* compiled from: PG */
/* renamed from: azb  reason: default package */
/* loaded from: classes3.dex */
final class azb {
    private final ViewGroupOverlay a;

    public azb(ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    public final void a(View view) {
        this.a.add(view);
    }

    public final void b(View view) {
        this.a.remove(view);
    }
}
