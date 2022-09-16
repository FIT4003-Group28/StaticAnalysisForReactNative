package defpackage;

import android.text.Layout;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: psu  reason: default package */
/* loaded from: classes4.dex */
public final class psu {
    public static final Comparator a = fay.g;
    public final psg b;
    public final int c;

    public psu(CharSequence charSequence, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        psf psfVar = new psf();
        psfVar.a = charSequence;
        psfVar.c = alignment;
        psfVar.b(f, 0);
        psfVar.e = i;
        psfVar.f = f2;
        psfVar.g = i2;
        psfVar.h = -3.4028235E38f;
        if (z) {
            psfVar.k = i3;
            psfVar.j = true;
        }
        this.b = psfVar.a();
        this.c = i4;
    }
}
