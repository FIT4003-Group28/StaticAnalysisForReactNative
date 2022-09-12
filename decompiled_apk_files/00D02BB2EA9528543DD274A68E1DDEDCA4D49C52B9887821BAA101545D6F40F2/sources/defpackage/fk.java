package defpackage;

import android.animation.Animator;
import android.view.animation.Animation;
/* compiled from: PG */
/* renamed from: fk  reason: default package */
/* loaded from: classes.dex */
final class fk {
    public final Animation a;
    public final Animator b;

    public fk(Animator animator) {
        this.a = null;
        this.b = animator;
    }

    public fk(Animation animation) {
        this.a = animation;
        this.b = null;
        if (animation != null) {
            return;
        }
        throw new IllegalStateException("Animation cannot be null");
    }
}
