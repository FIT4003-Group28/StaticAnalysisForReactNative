package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nv  reason: default package */
/* loaded from: classes.dex */
public final class nv extends nz<CharSequence> {
    public nv(Class cls) {
        super(R.id.tag_accessibility_pane_title, cls, 8, 28);
    }

    @Override // defpackage.nz
    public final /* bridge */ /* synthetic */ void a(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    @Override // defpackage.nz
    public final /* bridge */ /* synthetic */ CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    @Override // defpackage.nz
    public final /* bridge */ /* synthetic */ boolean c(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
