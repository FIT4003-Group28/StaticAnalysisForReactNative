package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
/* compiled from: PG */
/* renamed from: begx  reason: default package */
/* loaded from: classes3.dex */
public final class begx {
    public final bwqv a;
    public final begy b;
    final ValueAnimator c;
    final ValueAnimator d;
    @dzsi
    public bwrs<ilo> e;
    @dzsi
    public ilo f;
    public final bwrr<ilo> g = new begv(this);
    private final cqkf<jbn> h;
    private final Animator.AnimatorListener i;

    public begx(bwqv bwqvVar, cqkj cqkjVar, begy begyVar) {
        begw begwVar = new begw(this);
        this.i = begwVar;
        this.a = bwqvVar;
        this.b = begyVar;
        cqkf<jbn> e = cqkjVar.e(new gtc());
        this.h = e;
        e.e(begyVar);
        ValueAnimator duration = eib.d(e.c()).setDuration(167L);
        this.c = duration;
        duration.setStartDelay(83L);
        ValueAnimator duration2 = eib.c(e.c()).setDuration(117L);
        this.d = duration2;
        duration2.addListener(begwVar);
    }

    public final View a() {
        return this.h.c();
    }
}
