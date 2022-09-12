package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: blzi  reason: default package */
/* loaded from: classes3.dex */
final class blzi implements Runnable {
    final /* synthetic */ View a;

    public blzi(View view) {
        this.a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.setVisibility(8);
    }
}
