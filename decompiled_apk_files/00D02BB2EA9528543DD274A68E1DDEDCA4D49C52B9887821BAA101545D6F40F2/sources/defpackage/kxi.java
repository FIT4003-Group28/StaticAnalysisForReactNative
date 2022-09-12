package defpackage;

import android.graphics.Rect;
import java.util.List;
/* compiled from: PG */
/* renamed from: kxi  reason: default package */
/* loaded from: classes7.dex */
public final class kxi extends kxn {
    public Integer a;
    public Rect b;
    private Boolean d;
    private Boolean e;
    private Boolean f;
    private Integer g;
    private Integer h;
    private Integer i;
    private Integer j;
    private dcdc<Rect> k;

    @Override // defpackage.kxn
    public final void b(List<Rect> list) {
        this.k = dcdc.r(list);
    }

    @Override // defpackage.kxn
    public final void c() {
        this.g = 0;
    }

    @Override // defpackage.kxn
    public final void d(int i) {
        this.h = Integer.valueOf(i);
    }

    @Override // defpackage.kxn
    public final void e(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.kxn
    public final void f(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.kxn
    public final void g(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.kxn
    public final void h() {
        this.j = 0;
    }

    @Override // defpackage.kxn
    public final void i() {
        this.i = 0;
    }

    @Override // defpackage.kxn
    public final kxo a() {
        String str = this.d == null ? " hasHeader" : "";
        if (this.e == null) {
            str = str.concat(" hasSidePanel");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" hasCustomMargin");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" customMargin");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" endSideMargin");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" startSideMargin");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" bottomMargin");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" width");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" cards");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new kxj(this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.intValue(), this.h.intValue(), this.i.intValue(), this.a.intValue(), this.j.intValue(), this.b, this.k);
    }
}
