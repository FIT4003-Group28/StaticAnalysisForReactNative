package defpackage;

import android.animation.Animator;
import java.util.ArrayDeque;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: aked  reason: default package */
/* loaded from: classes.dex */
public final class aked {
    private final Queue a;

    public aked() {
        this(null);
    }

    private final Animator.AnimatorListener d() {
        return new akec(this);
    }

    private final synchronized void e() {
        if (this.a.peek() != null && !((Animator) this.a.peek()).isStarted()) {
            ((Animator) this.a.peek()).start();
        }
    }

    public final synchronized void a(Animator animator) {
        Animator clone = animator.clone();
        while (!this.a.isEmpty()) {
            ((Animator) this.a.peek()).cancel();
        }
        clone.addListener(d());
        this.a.add(clone);
        e();
    }

    public final synchronized void b(Animator animator) {
        Animator clone = animator.clone();
        clone.addListener(d());
        this.a.add(clone);
        e();
    }

    public final synchronized void c(Animator animator) {
        if (this.a.peek() != animator) {
            return;
        }
        this.a.remove();
        e();
    }

    public aked(byte[] bArr) {
        this.a = new ArrayDeque();
    }
}
