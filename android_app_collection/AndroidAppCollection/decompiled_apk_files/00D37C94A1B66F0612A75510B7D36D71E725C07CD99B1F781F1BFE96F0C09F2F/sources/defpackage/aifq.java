package defpackage;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.TextView;
import j$.time.Duration;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aifq  reason: default package */
/* loaded from: classes.dex */
public final class aifq {
    public aigd b;
    public aigd c;
    public final View d;
    public final aifs e;
    public boolean f;
    public TextView g;
    public boolean h;
    public yye i;
    private static final Duration j = Duration.ofMillis(200);
    private static final Duration k = Duration.ofMillis(200);
    private static final Duration l = Duration.ofMillis(200);
    public static final Duration a = Duration.ofSeconds(1);

    public aifq(View view, aifs aifsVar) {
        this.d = view;
        this.e = aifsVar;
    }

    public final aigd a(int i, int i2, int i3) {
        aigc a2 = aigd.a();
        a2.c(j);
        Duration duration = l;
        a2.b(amuk.t(aigb.a(0.0f, 1.0f, duration), aigb.a(1.0f, 1.0f, k), aigb.a(1.0f, 0.0f, duration)));
        a2.d(amuk.t(this.d.findViewById(i), this.d.findViewById(i2), this.d.findViewById(i3)));
        a2.a = new aifp(this);
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (!this.f) {
            return;
        }
        AnimatorSet animatorSet = this.b.a;
        if (animatorSet != null && animatorSet.isStarted()) {
            return;
        }
        this.b.c();
        this.c.c();
    }
}
