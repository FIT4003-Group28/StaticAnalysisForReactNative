package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: jel  reason: default package */
/* loaded from: classes7.dex */
final class jel extends ContextWrapper {
    public jel(Context context) {
        super(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Resources resources = super.getResources();
        return new jek(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
    }
}
