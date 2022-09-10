package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: PG */
/* renamed from: arlm  reason: default package */
/* loaded from: classes2.dex */
final class arlm extends ClickableSpan {
    final /* synthetic */ cjql a;
    final /* synthetic */ arln b;

    public arlm(arln arlnVar, cjql cjqlVar) {
        this.b = arlnVar;
        this.a = cjqlVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.f();
        cjql cjqlVar = this.a;
        if (cjqlVar != null) {
            this.b.ae.j(cjqlVar, cjtd.a(dtxw.F));
        }
        this.b.ad.k();
    }
}
