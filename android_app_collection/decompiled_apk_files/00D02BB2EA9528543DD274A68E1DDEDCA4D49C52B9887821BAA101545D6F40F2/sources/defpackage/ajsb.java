package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: ajsb  reason: default package */
/* loaded from: classes2.dex */
public final class ajsb {
    public static String a(Resources resources, alp alpVar, int i, Object... objArr) {
        Object[] objArr2 = new Object[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            objArr2[i2] = alpVar.b(objArr[i2].toString());
        }
        return resources.getString(i, objArr2);
    }
}
