package defpackage;

import android.graphics.Typeface;
/* compiled from: PG */
/* renamed from: dacy  reason: default package */
/* loaded from: classes5.dex */
public final class dacy extends dadf {
    private final Typeface a;
    private final dacx b;
    private boolean c;

    public dacy(dacx dacxVar, Typeface typeface) {
        this.a = typeface;
        this.b = dacxVar;
    }

    private final void d(Typeface typeface) {
        if (!this.c) {
            this.b.a(typeface);
        }
    }

    @Override // defpackage.dadf
    public final void a(Typeface typeface, boolean z) {
        d(typeface);
    }

    @Override // defpackage.dadf
    public final void b(int i) {
        d(this.a);
    }

    public final void c() {
        this.c = true;
    }
}
