package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
/* compiled from: PG */
/* renamed from: ajby  reason: default package */
/* loaded from: classes2.dex */
final class ajby implements cqjb<ajbz, ColorFilter> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ ColorFilter a(ajbz ajbzVar, Context context) {
        return new PorterDuffColorFilter(ajca.e(ajbzVar).b(context), PorterDuff.Mode.SRC_IN);
    }
}
