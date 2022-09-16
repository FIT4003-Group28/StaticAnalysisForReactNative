package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: afmi  reason: default package */
/* loaded from: classes.dex */
public final class afmi {
    public int a;

    public final float a(aufg aufgVar, List list, int i, int i2) {
        if (i != 0) {
            float f = 0.0f;
            while (i2 < list.size()) {
                f += ((Float) list.get(i2)).floatValue() * a(aufgVar, list, i - 1, i2);
                i2++;
            }
            return f;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        return aufgVar.d.d(i3);
    }
}
