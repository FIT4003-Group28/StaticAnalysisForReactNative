package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cbzr  reason: default package */
/* loaded from: classes4.dex */
final class cbzr extends jmv implements cbzs {
    public final String a;
    public final dbsg<ccaf> b;
    public final dbsg<ccan> c;

    public cbzr(int i, String str, dbsg<ccaf> dbsgVar, dbsg<ccan> dbsgVar2) {
        super(i);
        this.a = str;
        this.b = dbsgVar;
        this.c = dbsgVar2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        if (this.c.a()) {
            this.c.b().b = true;
        }
        if (this.b.a()) {
            this.b.b().a(this.a);
        }
    }
}
