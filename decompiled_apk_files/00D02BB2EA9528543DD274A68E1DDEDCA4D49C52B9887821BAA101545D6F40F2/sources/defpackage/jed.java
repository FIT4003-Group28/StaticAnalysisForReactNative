package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: jed  reason: default package */
/* loaded from: classes7.dex */
final class jed implements View.OnClickListener {
    final /* synthetic */ jef a;

    public jed(jef jefVar) {
        this.a = jefVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jef jefVar = this.a;
        jefVar.setExpanded(!jefVar.b, null);
    }
}
