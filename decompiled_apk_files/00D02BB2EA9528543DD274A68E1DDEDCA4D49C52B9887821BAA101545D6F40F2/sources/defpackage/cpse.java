package defpackage;

import android.graphics.Color;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cpse  reason: default package */
/* loaded from: classes5.dex */
public final class cpse {
    public final int[] a;
    public int b = 0;
    public Map<String, Integer> c = cpwj.a();

    public cpse(String[] strArr) {
        this.a = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            this.a[i] = Color.parseColor(strArr[i]);
        }
    }
}
