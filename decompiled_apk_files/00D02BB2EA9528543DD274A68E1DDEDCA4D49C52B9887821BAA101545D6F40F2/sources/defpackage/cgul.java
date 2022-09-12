package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cgul  reason: default package */
/* loaded from: classes4.dex */
public final class cgul implements View.OnAttachStateChangeListener {
    public final cqat a;
    public final String b;
    public long c = 0;
    private final cjqy d;
    @dzsi
    private cjqv e;

    public cgul(cqat cqatVar, cjqy cjqyVar, String str) {
        this.a = cqatVar;
        this.d = cjqyVar;
        this.b = str;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.c > 0) {
            return;
        }
        cguk cgukVar = new cguk(this);
        this.e = cgukVar;
        this.d.z(cgukVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        cjqv cjqvVar = this.e;
        if (cjqvVar != null) {
            this.d.A(cjqvVar);
            this.e = null;
        }
    }
}
