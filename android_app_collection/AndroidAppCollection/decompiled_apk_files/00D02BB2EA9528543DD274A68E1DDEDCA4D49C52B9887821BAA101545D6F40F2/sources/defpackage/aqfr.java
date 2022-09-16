package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqfr  reason: default package */
/* loaded from: classes2.dex */
public final class aqfr extends ClickableSpan {
    final /* synthetic */ aqfu a;

    public aqfr(aqfu aqfuVar) {
        this.a = aqfuVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.p.a().a();
    }
}
