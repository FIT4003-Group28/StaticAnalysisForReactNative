package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: PG */
/* renamed from: biwx  reason: default package */
/* loaded from: classes3.dex */
final class biwx extends ClickableSpan {
    final /* synthetic */ dxio a;

    public biwx(dxio dxioVar) {
        this.a = dxioVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ((anhg) this.a.a()).C();
    }
}
