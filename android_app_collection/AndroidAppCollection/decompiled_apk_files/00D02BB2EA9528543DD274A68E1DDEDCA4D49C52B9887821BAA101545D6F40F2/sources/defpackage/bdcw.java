package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bdcw  reason: default package */
/* loaded from: classes3.dex */
public final class bdcw implements View.OnAttachStateChangeListener {
    final /* synthetic */ bdcy a;

    public bdcw(bdcy bdcyVar) {
        this.a = bdcyVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        bdcy bdcyVar = this.a;
        ilo c = bdcyVar.d.c();
        if (c != null) {
            if (!c.ai().equals(akqi.a)) {
                befw befwVar = bdcyVar.b;
                befu p = befv.p();
                p.j(bdcyVar.d);
                ((befp) p).d = bdcyVar.c;
                befwVar.d(p.m());
            } else if (bdcyVar.a == null) {
            } else {
                aaae aaaeVar = bdcyVar.f;
                if (aaaeVar != null) {
                    aaaeVar.b();
                }
                bdcyVar.f = bdcyVar.e.a(bdcyVar.d, new aaag(bdcyVar.a));
                bdcyVar.f.a(null);
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
