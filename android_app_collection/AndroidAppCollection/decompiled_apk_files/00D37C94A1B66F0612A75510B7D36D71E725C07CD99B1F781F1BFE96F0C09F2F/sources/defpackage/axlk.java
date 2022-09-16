package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: axlk  reason: default package */
/* loaded from: classes2.dex */
final class axlk extends ayoy implements View.OnClickListener {
    private final View a;
    private final ayom b;

    public axlk(View view, ayom ayomVar) {
        this.a = view;
        this.b = ayomVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ayoy
    public final void a() {
        this.a.setOnClickListener(null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!e()) {
            this.b.c(axlj.a);
        }
    }
}
