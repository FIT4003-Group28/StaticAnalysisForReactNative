package defpackage;

import android.graphics.Typeface;
/* compiled from: PG */
/* renamed from: almn  reason: default package */
/* loaded from: classes.dex */
public final class almn {
    private final Typeface a;
    private final almj b;
    private boolean c;

    public almn() {
    }

    public almn(almj almjVar, Typeface typeface) {
        this.a = typeface;
        this.b = almjVar;
    }

    public final void a() {
        this.c = true;
    }

    public final void b(Typeface typeface) {
        if (!this.c) {
            this.b.a(typeface);
        }
    }

    public final void c() {
        b(this.a);
    }
}
