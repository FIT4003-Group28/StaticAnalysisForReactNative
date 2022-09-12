package defpackage;

import com.google.android.apps.gmm.map.ui.CompassButtonView;
/* compiled from: PG */
/* renamed from: amzp  reason: default package */
/* loaded from: classes2.dex */
public enum amzp {
    SMALL(cjxf.SMALL),
    MOD_SMALL(cjxf.MOD_SMALL),
    MEDIUM(cjxf.MEDIUM),
    LARGE(cjxf.LARGE),
    EXTRA_LARGE(cjxf.EXTRA_LARGE);
    
    public final cqtv f;
    public final cqtv g;

    amzp(cjxf cjxfVar) {
        cqtv b = cjxh.b(cjxfVar);
        this.g = cqsg.d(b, cqrp.d(8.0d));
        if (CompassButtonView.h(cjxfVar)) {
            this.f = cqrp.d(2.0d);
        } else {
            this.f = cqsg.d(cqsg.f(cqsg.g(cjxh.c(cjxfVar), b), Float.valueOf(0.5f)), CompassButtonView.a);
        }
    }
}
