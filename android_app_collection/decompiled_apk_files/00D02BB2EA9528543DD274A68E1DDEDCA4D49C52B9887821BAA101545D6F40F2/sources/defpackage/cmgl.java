package defpackage;

import android.text.Layout;
/* compiled from: PG */
/* renamed from: cmgl  reason: default package */
/* loaded from: classes5.dex */
final class cmgl {
    public final cmfw a;
    public final int b;

    public cmgl(CharSequence charSequence, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        cmfv cmfvVar = new cmfv();
        cmfvVar.a = charSequence;
        cmfvVar.c = alignment;
        cmfvVar.b(f, 0);
        cmfvVar.d = i;
        cmfvVar.e = f2;
        cmfvVar.f = i2;
        cmfvVar.i = -3.4028235E38f;
        if (z) {
            cmfvVar.l = i3;
            cmfvVar.k = true;
        }
        this.a = cmfvVar.a();
        this.b = i4;
    }
}
