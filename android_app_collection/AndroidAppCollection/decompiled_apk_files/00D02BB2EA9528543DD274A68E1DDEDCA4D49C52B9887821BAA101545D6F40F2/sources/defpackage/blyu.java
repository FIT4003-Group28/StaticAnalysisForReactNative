package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: blyu  reason: default package */
/* loaded from: classes3.dex */
final class blyu implements Runnable {
    final /* synthetic */ View a;

    public blyu(View view) {
        this.a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.setClickable(true);
    }
}
