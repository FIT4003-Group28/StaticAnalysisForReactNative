package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cio  reason: default package */
/* loaded from: classes.dex */
public final class cio implements ciu<Drawable> {
    private final int a;
    private final boolean b;
    private cip c;

    public cio(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.ciu
    public final cit<Drawable> a(int i) {
        if (i == 5) {
            return cir.a;
        }
        if (this.c == null) {
            this.c = new cip(this.a, this.b);
        }
        return this.c;
    }
}
