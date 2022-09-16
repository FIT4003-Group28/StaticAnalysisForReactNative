package defpackage;

import android.content.Context;
import android.graphics.Typeface;
/* compiled from: PG */
/* renamed from: tfr  reason: default package */
/* loaded from: classes4.dex */
public final class tfr implements tfj {
    private final teb a;

    public tfr(teb tebVar) {
        this.a = tebVar;
    }

    @Override // defpackage.tfj
    public final Typeface a(Context context, String str) {
        return b(context, str, 0);
    }

    @Override // defpackage.tfj
    public final Typeface b(Context context, String str, int i) {
        if (str.startsWith("fonts/")) {
            try {
                return Typeface.createFromAsset(context.getAssets(), str);
            } catch (RuntimeException e) {
                teb tebVar = this.a;
                String valueOf = String.valueOf(str);
                tebVar.d(22, valueOf.length() != 0 ? "Failed to load font ".concat(valueOf) : new String("Failed to load font "), e);
                return null;
            }
        }
        return null;
    }
}
