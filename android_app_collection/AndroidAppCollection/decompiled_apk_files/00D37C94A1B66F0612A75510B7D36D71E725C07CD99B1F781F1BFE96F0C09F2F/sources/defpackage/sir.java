package defpackage;

import android.util.Size;
/* compiled from: PG */
/* renamed from: sir  reason: default package */
/* loaded from: classes4.dex */
public final class sir {
    public final amuk a;
    public final Size b;

    public sir(amuk amukVar, Size size) {
        this.a = amukVar;
        this.b = size;
    }

    public static Size a(Size size, int i) {
        return (i == 0 || i == 2) ? new Size(size.getHeight(), size.getWidth()) : size;
    }
}
