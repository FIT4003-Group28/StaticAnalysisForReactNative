package defpackage;

import android.os.Looper;
import android.view.View;
/* compiled from: PG */
/* renamed from: axll  reason: default package */
/* loaded from: classes2.dex */
public final class axll extends ayoi {
    private final View a;

    public axll(View view) {
        this.a = view;
    }

    @Override // defpackage.ayoi
    protected final void f(ayom ayomVar) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ayomVar.sj(banl.m());
            ayomVar.b(new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName()));
            return;
        }
        axlk axlkVar = new axlk(this.a, ayomVar);
        ayomVar.sj(axlkVar);
        this.a.setOnClickListener(axlkVar);
    }
}
