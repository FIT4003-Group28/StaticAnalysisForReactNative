package defpackage;

import android.app.Application;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bsoh  reason: default package */
/* loaded from: classes4.dex */
public final class bsoh {
    public final btrm a;
    public final dehq b;
    private final Application c;

    public bsoh(Application application, btrm btrmVar, dehq dehqVar) {
        this.c = application;
        this.a = btrmVar;
        this.b = dehqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ghs<brve> a(brwk brwkVar, boolean z, int i, Runnable runnable, Runnable runnable2) {
        int i2 = 1;
        brwu aH = brwkVar.aH(!z, i, runnable, runnable2);
        ilo aH2 = aH.A().aH();
        cqix fT = cqgr.fT(new bsqd(), aH);
        String string = this.c.getString(R.string.ACCESSIBILITY_TRAVERSAL_CARD, new Object[]{aH.Q()});
        if (true == aH.A().L().booleanValue()) {
            i2 = 2;
        }
        bsob d = bsob.d(i2, aH2.ai());
        cjta c = cjtd.c(aH2.ca());
        c.d = dtyb.bN;
        return new ghs<>(fT, string, false, d, c.a(), aH.x());
    }
}
