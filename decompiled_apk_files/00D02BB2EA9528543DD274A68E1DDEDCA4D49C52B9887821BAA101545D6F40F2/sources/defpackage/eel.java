package defpackage;

import android.animation.Animator;
import android.view.View;
/* compiled from: PG */
/* renamed from: eel  reason: default package */
/* loaded from: classes6.dex */
final class eel extends bvou {
    final /* synthetic */ Animator a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eel(View view, Animator animator) {
        super(view);
        this.a = animator;
    }

    @Override // defpackage.bvou
    public final void a() {
        this.a.start();
    }
}
