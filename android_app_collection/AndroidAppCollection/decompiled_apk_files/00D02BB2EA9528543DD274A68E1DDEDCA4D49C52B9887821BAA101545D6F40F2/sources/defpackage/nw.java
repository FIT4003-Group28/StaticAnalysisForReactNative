package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nw  reason: default package */
/* loaded from: classes.dex */
public final class nw extends nz<CharSequence> {
    public nw(Class cls) {
        super(R.id.tag_state_description, cls, 64, 30);
    }

    @Override // defpackage.nz
    public final /* bridge */ /* synthetic */ void a(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    @Override // defpackage.nz
    public final /* bridge */ /* synthetic */ CharSequence b(View view) {
        return view.getStateDescription();
    }

    @Override // defpackage.nz
    public final /* bridge */ /* synthetic */ boolean c(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
