package defpackage;

import android.content.Context;
import android.widget.Toast;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bweh  reason: default package */
/* loaded from: classes4.dex */
public final class bweh {
    public final gga a;
    public final btxv b;
    public final Executor c;
    public final buxu d;

    public bweh(gga ggaVar, btxv btxvVar, buxu buxuVar, Executor executor) {
        this.a = ggaVar;
        this.b = btxvVar;
        this.d = buxuVar;
        this.c = executor;
    }

    public static void a(String str, Context context) {
        bvrj.UI_THREAD.c();
        Toast.makeText(context, str, 1).show();
    }
}
