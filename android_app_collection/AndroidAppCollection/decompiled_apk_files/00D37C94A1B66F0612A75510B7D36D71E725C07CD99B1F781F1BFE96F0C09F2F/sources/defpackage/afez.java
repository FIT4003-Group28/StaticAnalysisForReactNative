package defpackage;

import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: afez  reason: default package */
/* loaded from: classes.dex */
public final class afez {
    public final Context a;
    public final Intent b;
    public int c = -1;
    public final afjz d;
    private final Intent e;

    public afez(Context context, afjz afjzVar) {
        this.a = context;
        this.d = afjzVar;
        Intent intent = new Intent("android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION");
        this.b = intent;
        intent.putExtra("android.media.extra.PACKAGE_NAME", context.getPackageName());
        Intent intent2 = new Intent("android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION");
        this.e = intent2;
        intent2.putExtra("android.media.extra.PACKAGE_NAME", context.getPackageName());
    }

    public final void a(int i) {
        int e;
        if ((this.d.C() || ((e = aqxo.e(this.d.n().d)) != 0 && e == 3)) && this.c == i && i != -1) {
            this.e.putExtra("android.media.extra.AUDIO_SESSION", i);
            this.a.sendBroadcast(this.e);
            this.c = -1;
        }
    }
}
