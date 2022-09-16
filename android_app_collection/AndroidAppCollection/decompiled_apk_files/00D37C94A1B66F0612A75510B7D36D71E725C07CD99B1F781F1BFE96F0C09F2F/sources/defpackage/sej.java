package defpackage;

import android.graphics.Color;
import java.util.Map;
/* compiled from: PG */
/* renamed from: sej  reason: default package */
/* loaded from: classes4.dex */
public final class sej {
    public int b = 0;
    public Map c = shp.h();
    public final int[] a = new int[8];

    public sej(String[] strArr) {
        for (int i = 0; i < 8; i++) {
            this.a[i] = Color.parseColor(strArr[i]);
        }
    }
}
