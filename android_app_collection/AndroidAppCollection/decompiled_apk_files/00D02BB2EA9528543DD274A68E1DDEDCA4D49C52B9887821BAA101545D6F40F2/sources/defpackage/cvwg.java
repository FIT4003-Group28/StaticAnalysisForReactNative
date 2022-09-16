package defpackage;

import android.graphics.Path;
import android.util.Property;
import com.google.android.libraries.onegoogle.account.disc.RingView;
/* compiled from: PG */
/* renamed from: cvwg  reason: default package */
/* loaded from: classes5.dex */
final class cvwg extends Property<RingView, Integer> {
    public cvwg(Class cls) {
        super(cls, "ringThickness");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Integer get(RingView ringView) {
        return Integer.valueOf(ringView.d);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(RingView ringView, Integer num) {
        RingView ringView2 = ringView;
        int intValue = num.intValue();
        if (intValue == ringView2.d) {
            return;
        }
        boolean z = true;
        dbsk.m(ringView2.b != -1, "setRingThickness should be called before setCurrThickness");
        if (ringView2.c == -1) {
            z = false;
        }
        dbsk.m(z, "setRingRadius should be called before setCurrThickness");
        ringView2.d = intValue;
        int i = ringView2.c;
        int i2 = ringView2.b;
        ringView2.a.reset();
        Path path = ringView2.a;
        float f = ringView2.c;
        path.addCircle(f, f, (i - i2) + intValue, Path.Direction.CW);
        ringView2.invalidate();
    }
}
