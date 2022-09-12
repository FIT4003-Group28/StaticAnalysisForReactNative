package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: caim  reason: default package */
/* loaded from: classes4.dex */
final class caim extends cqtd {
    public caim(Object[] objArr) {
        super(objArr);
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        Drawable mutate = context.getResources().getDrawable(R.drawable.quantum_gradient_bar_top).mutate();
        mutate.setAlpha(190);
        return mutate;
    }
}
