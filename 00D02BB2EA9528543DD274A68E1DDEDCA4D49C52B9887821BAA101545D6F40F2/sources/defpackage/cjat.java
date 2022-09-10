package defpackage;

import android.text.Html;
import android.text.Spanned;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cjat  reason: default package */
/* loaded from: classes4.dex */
public class cjat implements cfhd {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ cjax b;

    public cjat(cjax cjaxVar, CharSequence charSequence) {
        this.b = cjaxVar;
        this.a = charSequence;
    }

    @Override // defpackage.cfhd
    public Spanned a() {
        return Html.fromHtml(this.a.toString());
    }

    @Override // defpackage.cfhd
    public List<cfhc> b() {
        return this.b.e;
    }

    @Override // defpackage.cfhd
    public cjtd c() {
        return cjtd.b;
    }

    @Override // defpackage.cfhd
    public Spanned d() {
        return Html.fromHtml(this.b.c.toString());
    }

    @Override // defpackage.cfhd
    public Spanned e() {
        return Html.fromHtml(this.b.d.toString());
    }
}
