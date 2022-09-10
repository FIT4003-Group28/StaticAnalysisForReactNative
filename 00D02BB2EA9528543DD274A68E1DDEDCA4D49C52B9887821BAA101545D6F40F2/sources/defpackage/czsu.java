package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: PG */
/* renamed from: czsu  reason: default package */
/* loaded from: classes5.dex */
final class czsu extends ClickableSpan {
    final /* synthetic */ String a;
    final /* synthetic */ czsv b;

    public czsu(czsv czsvVar, String str) {
        this.b = czsvVar;
        this.a = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.Y(new Intent("android.intent.action.VIEW", Uri.parse(this.a)));
    }
}
