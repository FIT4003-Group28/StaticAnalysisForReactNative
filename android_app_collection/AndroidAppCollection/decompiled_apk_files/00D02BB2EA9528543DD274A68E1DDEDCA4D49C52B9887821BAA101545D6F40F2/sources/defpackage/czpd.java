package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: PG */
/* renamed from: czpd  reason: default package */
/* loaded from: classes5.dex */
final class czpd extends ClickableSpan {
    final /* synthetic */ czpg a;

    public czpd(czpg czpgVar) {
        this.a = czpgVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.a();
    }
}
