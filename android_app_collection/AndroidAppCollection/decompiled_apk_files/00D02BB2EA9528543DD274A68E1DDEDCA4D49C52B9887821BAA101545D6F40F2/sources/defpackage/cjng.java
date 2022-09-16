package defpackage;

import android.app.Activity;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: cjng  reason: default package */
/* loaded from: classes4.dex */
public final class cjng implements awnl {
    private static final ddho b = dtxu.cV;
    private final transient ckcw a;

    public cjng(ckcw ckcwVar) {
        this.a = ckcwVar;
    }

    private static void c(cjqy cjqyVar, ddho ddhoVar) {
        cjqyVar.i(cjtd.a(ddhoVar));
    }

    @Override // defpackage.awnl
    public final awnn a() {
        return awnn.UDC_CONSENT;
    }

    @Override // defpackage.awnl
    public final void b(Activity activity, int i, Intent intent) {
        cjqy tr = ((cjqz) btsr.a(cjqz.class)).tr();
        if (i == -1) {
            c(tr, dtxu.cW);
            ((ckco) this.a.a(ckid.b)).a(ckib.a(2));
        } else if (i == 0) {
            c(tr, dtxu.cX);
            ((ckco) this.a.a(ckid.b)).a(ckib.a(4));
        } else if (i != 100) {
        } else {
            tr.r(new cjsz(b));
            ((ckco) this.a.a(ckid.b)).a(ckib.a(1));
        }
    }
}
