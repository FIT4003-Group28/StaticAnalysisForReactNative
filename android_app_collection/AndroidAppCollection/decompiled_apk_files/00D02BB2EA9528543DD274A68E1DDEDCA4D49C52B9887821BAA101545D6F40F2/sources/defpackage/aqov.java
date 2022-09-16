package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import com.google.android.apps.gmm.messaging.common.ConfigurableCurvularLayoutView;
/* compiled from: PG */
/* renamed from: aqov  reason: default package */
/* loaded from: classes2.dex */
public class aqov {
    private final Activity a;
    private final dxio<apzy> b;
    private final dxio<aqav> c;

    public aqov(Activity activity, dxio<apzy> dxioVar, dxio<aqav> dxioVar2) {
        this.a = activity;
        this.b = dxioVar;
        this.c = dxioVar2;
    }

    public final cvav a(ctyy ctyyVar, cvbp cvbpVar, dbsl<cufw> dbslVar, cvau cvauVar, final mw<ConfigurableCurvularLayoutView> mwVar) {
        cvar cvarVar = new cvar();
        if (this.b.a().b()) {
            cvarVar.a.add(new cumq(this.a, ctyyVar, this.c.a().a()));
        }
        csui a = this.c.a().a();
        csuk c = this.c.a().c();
        csug d = this.c.a().d();
        csuf f = this.c.a().f();
        this.c.a().i();
        cvbi cvbiVar = new cvbi(cvbpVar, a, c, d, f, ctyyVar, cvarVar, dbslVar);
        cvbiVar.e = cvauVar;
        cvbpVar.setOnEmptyInboxInflateListener(new ViewStub.OnInflateListener(mwVar) { // from class: aqou
            private final mw a;

            {
                this.a = mwVar;
            }

            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view) {
                mw mwVar2 = this.a;
                if (view instanceof ConfigurableCurvularLayoutView) {
                    mwVar2.a((ConfigurableCurvularLayoutView) view);
                } else {
                    bvoo.d(new IllegalStateException("ConfigurableCurvularLayoutView on empty inbox inflation not found."));
                }
            }
        });
        return cvbiVar;
    }
}
