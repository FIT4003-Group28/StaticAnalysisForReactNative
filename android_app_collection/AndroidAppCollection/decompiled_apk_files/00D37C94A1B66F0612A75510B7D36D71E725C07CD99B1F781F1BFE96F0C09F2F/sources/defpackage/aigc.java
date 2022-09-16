package defpackage;

import android.animation.Animator;
import j$.time.Duration;
import java.util.List;
/* compiled from: PG */
/* renamed from: aigc  reason: default package */
/* loaded from: classes.dex */
public final class aigc {
    public Animator.AnimatorListener a;
    private Duration b;
    private amuk c;
    private amuk d;

    public final void b(List list) {
        this.d = amuk.o(list);
    }

    public final void c(Duration duration) {
        if (duration != null) {
            this.b = duration;
            return;
        }
        throw new NullPointerException("Null delayBetweenAnimationsInSequence");
    }

    public final void d(List list) {
        this.c = amuk.o(list);
    }

    public final aigd a() {
        amuk amukVar;
        amuk amukVar2;
        Duration duration = this.b;
        if (duration == null || (amukVar = this.c) == null || (amukVar2 = this.d) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" delayBetweenAnimationsInSequence");
            }
            if (this.c == null) {
                sb.append(" views");
            }
            if (this.d == null) {
                sb.append(" animationSteps");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new aigd(duration, amukVar, amukVar2, this.a);
    }
}
