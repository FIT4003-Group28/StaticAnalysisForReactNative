package defpackage;

import android.widget.FrameLayout;
import com.google.android.libraries.onegoogle.account.disc.RingView;
/* compiled from: PG */
/* renamed from: uku  reason: default package */
/* loaded from: classes4.dex */
public final class uku {
    public final RingView a;
    private final int b;
    private final int c;
    private final int d;

    static {
        new ukt(Integer.class);
    }

    public uku(RingView ringView, int i, int i2) {
        this.a = ringView;
        uks uksVar = new uks(ringView.getResources());
        int round = Math.round(uksVar.b(i));
        this.c = round;
        int c = uksVar.c(i);
        this.b = c;
        int i3 = (i2 - c) / 2;
        this.d = i3;
        ringView.setLayoutParams(new FrameLayout.LayoutParams(i2, i2));
        ringView.setPadding(i3, i3, i3, i3);
        ringView.b = round;
        ringView.c = c / 2;
        ringView.setVisibility(0);
    }
}
