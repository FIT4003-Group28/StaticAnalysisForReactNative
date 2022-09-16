package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
/* compiled from: PG */
/* renamed from: veu  reason: default package */
/* loaded from: classes4.dex */
public final class veu {
    public final vet a;
    public Animator b = new AnimatorSet();

    public veu(vet vetVar) {
        this.a = vetVar;
    }

    public final void a() {
        if (this.b.isStarted()) {
            this.b.end();
        }
    }
}
