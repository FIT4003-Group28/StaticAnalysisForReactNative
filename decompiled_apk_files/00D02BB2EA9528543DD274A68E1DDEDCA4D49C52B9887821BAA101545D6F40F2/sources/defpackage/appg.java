package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: appg  reason: default package */
/* loaded from: classes2.dex */
final class appg extends cqtd {
    public appg(Object[] objArr) {
        super(objArr);
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        azz a = azz.a(context, R.drawable.audio_indicator_24dp_animation);
        dbuh.d(a);
        bvrj.UI_THREAD.c();
        a.c(new appf(new Handler(), a));
        a.start();
        return a;
    }
}
