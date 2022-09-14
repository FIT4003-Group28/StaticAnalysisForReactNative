package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: mob  reason: default package */
/* loaded from: classes7.dex */
public final class mob {
    final Drawable a;
    private final Context b;
    private final Drawable c;

    public mob(Context context) {
        this.b = context;
        this.a = nqu.Y().a.a(context);
        this.c = nqu.Y().b.a(context);
    }

    public final iuu a(float f) {
        String format = String.format(Locale.getDefault(), "%.1f ", Float.valueOf(Math.max(0.0f, Math.min(5.0f, f))));
        iuv iuvVar = nql.bw;
        return iva.h(TextUtils.concat(npq.a(format, iuvVar.a.c(this.b)), npq.b(this.a)), TextUtils.concat(npq.a(format, iuvVar.b.c(this.b)), npq.b(this.c)));
    }
}
