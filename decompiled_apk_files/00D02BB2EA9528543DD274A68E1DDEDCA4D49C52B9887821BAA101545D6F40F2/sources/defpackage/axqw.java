package defpackage;

import android.text.Html;
/* compiled from: PG */
/* renamed from: axqw  reason: default package */
/* loaded from: classes3.dex */
public class axqw implements axqv {
    private final String a;

    public axqw(String str) {
        this.a = str;
    }

    @Override // defpackage.axqv
    public CharSequence a() {
        return Html.fromHtml(this.a);
    }
}
