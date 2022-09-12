package defpackage;

import com.google.android.apps.gmm.base.views.scalebar.ScalebarView;
/* compiled from: PG */
/* renamed from: jiv  reason: default package */
/* loaded from: classes.dex */
public final class jiv<T> extends btrh<T> {
    private final int d;

    public jiv(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            alhw alhwVar = (alhw) obj;
            ScalebarView scalebarView = ((jir) this.a).a;
            scalebarView.s = alhwVar.a == alje.FIRST_FINGER_DOWN;
            if (scalebarView.k.isRunning() || !scalebarView.s) {
                if (alhwVar.a != alje.LAST_FINGER_UP) {
                    return;
                }
                scalebarView.d();
                return;
            }
            scalebarView.k.cancel();
            return;
        }
        jir jirVar = (jir) this.a;
        jirVar.a.p = ((afwq) obj).a(afwm.SATELLITE);
        ScalebarView scalebarView2 = jirVar.a;
        scalebarView2.e(scalebarView2.p, scalebarView2.a());
    }
}
