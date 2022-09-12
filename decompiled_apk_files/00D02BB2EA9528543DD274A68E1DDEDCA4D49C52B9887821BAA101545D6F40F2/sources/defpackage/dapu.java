package defpackage;

import android.widget.ScrollView;
import com.google.android.setupdesign.view.BottomScrollView;
/* compiled from: PG */
/* renamed from: dapu  reason: default package */
/* loaded from: classes5.dex */
public final class dapu implements daqa {
    private final dapt a;

    public dapu(dapt daptVar, ScrollView scrollView) {
        this.a = daptVar;
        if (scrollView instanceof BottomScrollView) {
            BottomScrollView bottomScrollView = (BottomScrollView) scrollView;
            return;
        }
        String valueOf = String.valueOf(scrollView);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("Cannot set non-BottomScrollView. Found=");
        sb.append(valueOf);
        sb.toString();
    }

    @Override // defpackage.daqa
    public final void a() {
        this.a.a(false);
    }

    @Override // defpackage.daqa
    public final void b() {
        this.a.a(true);
    }
}
