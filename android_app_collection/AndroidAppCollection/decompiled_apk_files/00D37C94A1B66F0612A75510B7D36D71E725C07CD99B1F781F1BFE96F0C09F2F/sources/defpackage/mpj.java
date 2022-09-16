package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: mpj  reason: default package */
/* loaded from: classes3.dex */
final class mpj {
    private final View a;
    private final CharSequence b;
    private final CharSequence c;

    public mpj(View view, CharSequence charSequence, CharSequence charSequence2) {
        this.a = view;
        this.b = charSequence;
        this.c = charSequence2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.a.setContentDescription(z ? this.c : this.b);
    }
}
