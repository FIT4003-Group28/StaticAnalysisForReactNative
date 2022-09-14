package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: byde  reason: default package */
/* loaded from: classes4.dex */
public final class byde extends bydl {
    public Integer a;
    public Integer b;
    public Context c;
    private Integer d;
    private Integer e;
    private Boolean f;

    @Override // defpackage.bydl
    public final void b(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.bydl
    public final void c(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.bydl
    public final void d(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.bydl
    public final bydm a() {
        String str = this.a == null ? " closedColor" : "";
        if (this.d == null) {
            str = str.concat(" closingOrOpeningSoonColor");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" openColor");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" futureOpenColor");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" useBoldInsteadOfMediumForIncreasedWeight");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" context");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bydf(this.a.intValue(), this.d.intValue(), this.e.intValue(), this.b.intValue(), this.f.booleanValue(), this.c);
    }
}
