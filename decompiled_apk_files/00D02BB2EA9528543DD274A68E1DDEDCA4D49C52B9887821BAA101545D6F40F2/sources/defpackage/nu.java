package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nu  reason: default package */
/* loaded from: classes7.dex */
public final class nu extends nz<Boolean> {
    public nu(Class cls) {
        super(R.id.tag_screen_reader_focusable, cls);
    }

    @Override // defpackage.nz
    public final /* bridge */ /* synthetic */ void a(View view, Boolean bool) {
        view.setScreenReaderFocusable(bool.booleanValue());
    }

    @Override // defpackage.nz
    public final /* bridge */ /* synthetic */ Boolean b(View view) {
        return Boolean.valueOf(view.isScreenReaderFocusable());
    }

    @Override // defpackage.nz
    public final /* bridge */ /* synthetic */ boolean c(Boolean bool, Boolean bool2) {
        return !f(bool, bool2);
    }
}
