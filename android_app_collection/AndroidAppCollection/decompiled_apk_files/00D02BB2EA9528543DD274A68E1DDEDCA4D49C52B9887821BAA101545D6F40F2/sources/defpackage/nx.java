package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nx  reason: default package */
/* loaded from: classes.dex */
public final class nx extends nz<Boolean> {
    public nx(Class cls) {
        super(R.id.tag_accessibility_heading, cls);
    }

    @Override // defpackage.nz
    public final /* bridge */ /* synthetic */ void a(View view, Boolean bool) {
        view.setAccessibilityHeading(bool.booleanValue());
    }

    @Override // defpackage.nz
    public final /* bridge */ /* synthetic */ Boolean b(View view) {
        return Boolean.valueOf(view.isAccessibilityHeading());
    }

    @Override // defpackage.nz
    public final /* bridge */ /* synthetic */ boolean c(Boolean bool, Boolean bool2) {
        return !f(bool, bool2);
    }
}
