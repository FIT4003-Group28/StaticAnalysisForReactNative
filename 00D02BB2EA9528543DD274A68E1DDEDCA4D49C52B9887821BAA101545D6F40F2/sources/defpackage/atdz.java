package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: atdz  reason: default package */
/* loaded from: classes2.dex */
public final class atdz {
    public static atee a(Context context, bvly bvlyVar, bvlo bvloVar, boolean z) {
        return new atee(bvlyVar, bvloVar, cqrp.d(true != z ? 36.66666793823242d : 168.0500030517578d).e(context), cqrp.d(1.3333333730697632d).e(context), cqrp.d(6.0d).e(context), z);
    }

    public static ated b(Context context, int i, int i2, int i3, int i4, int i5, int i6) {
        Resources resources = context.getResources();
        int e = atnp.b().e(context);
        int e2 = atnp.a().e(context);
        atec atecVar = new atec(i, i2, i3, e, e2);
        atec atecVar2 = new atec(i4, i5, i6, e, e2);
        atec a = atec.a(resources, R.color.quantum_greywhite1000, R.color.quantum_grey, R.color.quantum_greywhite1000, e, e2);
        return new ated(atecVar, atecVar2, a, a);
    }
}
