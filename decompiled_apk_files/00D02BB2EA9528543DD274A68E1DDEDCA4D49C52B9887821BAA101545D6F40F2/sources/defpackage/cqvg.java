package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
/* compiled from: PG */
/* renamed from: cqvg  reason: default package */
/* loaded from: classes.dex */
public final class cqvg extends cqrt implements cqvj {
    private final Typeface c;

    public cqvg(int i, Typeface typeface) {
        super(i);
        this.c = typeface;
    }

    @Override // defpackage.cqvj
    public final Typeface a(Context context) {
        try {
            Typeface a = ka.a(context, this.a);
            return a == null ? this.c : a;
        } catch (Resources.NotFoundException unused) {
            return this.c;
        }
    }
}
