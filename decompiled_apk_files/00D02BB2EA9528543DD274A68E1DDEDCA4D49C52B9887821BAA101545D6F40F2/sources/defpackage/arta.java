package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
/* compiled from: PG */
/* renamed from: arta  reason: default package */
/* loaded from: classes2.dex */
final class arta implements cqjb<aryd, ColorFilter> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ ColorFilter a(aryd arydVar, Context context) {
        return new PorterDuffColorFilter(ibl.b().b(context), PorterDuff.Mode.SRC_IN);
    }
}
