package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cjhr  reason: default package */
/* loaded from: classes4.dex */
final class cjhr extends cjhf {
    public CharSequence a;
    public jhp b;
    public CharSequence c;
    public Integer d;
    public View.OnClickListener e;
    public Boolean f;
    public cqtv g;
    public cqtv h;
    public cjtd i;
    public Boolean j;

    @Override // defpackage.cjhf
    public final void b(cqtv cqtvVar) {
        this.h = cqtvVar;
    }

    @Override // defpackage.cjhf
    public final cjhg a() {
        String str = this.a == null ? " text" : "";
        if (this.d == null) {
            str = str.concat(" maxLineCount");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" hasMultipleInlineLinks");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" paddingTop");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" paddingBottom");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" screenReaderFocusable");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cjhs(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }
}
