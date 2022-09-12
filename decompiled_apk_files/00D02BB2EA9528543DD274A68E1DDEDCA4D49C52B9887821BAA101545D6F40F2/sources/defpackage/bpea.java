package defpackage;

import android.text.Html;
/* compiled from: PG */
/* renamed from: bpea  reason: default package */
/* loaded from: classes3.dex */
public class bpea implements bpvz {
    private final boxf a;
    private final ff b;

    public bpea(boxf boxfVar, ff ffVar) {
        this.a = boxfVar;
        this.b = ffVar;
    }

    @Override // defpackage.bpvz
    public cqtd a() {
        int i = this.a.j;
        if (i == 0) {
            return cqtt.c();
        }
        return cqrt.f(i);
    }

    @Override // defpackage.bpvz
    public CharSequence b() {
        return Html.fromHtml(this.b.getString(this.a.i));
    }

    @Override // defpackage.bpvz
    public cjtd c() {
        return cjtd.a(this.a.l);
    }

    @Override // defpackage.bpvz
    public Boolean d() {
        return Boolean.valueOf(this.a.equals(boxf.DIRECTIONALITY_HINT));
    }

    @Override // defpackage.bpvz
    public boxf e() {
        return this.a;
    }
}
