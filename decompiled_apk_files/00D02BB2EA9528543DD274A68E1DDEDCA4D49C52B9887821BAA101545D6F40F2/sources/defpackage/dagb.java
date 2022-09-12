package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
/* compiled from: PG */
/* renamed from: dagb  reason: default package */
/* loaded from: classes5.dex */
public final class dagb {
    public Drawable a;
    public CharSequence b;
    public CharSequence c;
    public View e;
    public dagg g;
    public dage h;
    public int d = -1;
    public final int f = 1;
    public int i = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        dage dageVar = this.h;
        if (dageVar != null) {
            dageVar.c();
        }
    }

    public final void c() {
        this.g = null;
        this.h = null;
        this.a = null;
        this.i = -1;
        this.b = null;
        this.c = null;
        this.d = -1;
        this.e = null;
    }

    public final void d(View view) {
        this.e = view;
        b();
    }

    public final void e(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(charSequence)) {
            this.h.setContentDescription(charSequence);
        }
        this.b = charSequence;
        b();
    }

    public final void a() {
        dagg daggVar = this.g;
        if (daggVar == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        daggVar.o(this);
    }
}
