package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: njf  reason: default package */
/* loaded from: classes3.dex */
public class njf extends akaw {
    private final Drawable a;

    public njf(Context context, String str) {
        super(context, str);
        this.a = zag.f(context, 2131233342, R.attr.ytTextPrimary);
    }

    @Override // defpackage.akaw
    public final void a(boolean z) {
        super.a(z);
        this.e = z ? this.a : null;
    }
}
