package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abmx  reason: default package */
/* loaded from: classes.dex */
public final class abmx extends ClickableSpan {
    final /* synthetic */ ajrs a;
    final /* synthetic */ asrf b;
    final /* synthetic */ abmz c;

    public abmx(abmz abmzVar, ajrs ajrsVar, asrf asrfVar) {
        this.c = abmzVar;
        this.a = ajrsVar;
        this.b = asrfVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        abmz abmzVar = this.c;
        abmzVar.s = true;
        abmzVar.oK(this.a, this.b);
    }
}
