package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
/* compiled from: PG */
/* renamed from: iju  reason: default package */
/* loaded from: classes6.dex */
final class iju extends ijy {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final Paint h;
    public final Paint i;
    public final Paint j;
    public final TextPaint k;

    public iju(int i, int i2, int i3, int i4, int i5, int i6, int i7, Paint paint, Paint paint2, Paint paint3, TextPaint textPaint) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = paint;
        this.i = paint2;
        this.j = paint3;
        this.k = textPaint;
    }

    @Override // defpackage.ijy
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ijy
    public final int b() {
        return this.b;
    }

    @Override // defpackage.ijy
    public final int c() {
        return this.c;
    }

    @Override // defpackage.ijy
    public final int d() {
        return this.d;
    }

    @Override // defpackage.ijy
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ijy) {
            ijy ijyVar = (ijy) obj;
            if (this.a == ijyVar.a() && this.b == ijyVar.b() && this.c == ijyVar.c() && this.d == ijyVar.d() && this.e == ijyVar.e() && this.f == ijyVar.f() && this.g == ijyVar.g() && this.h.equals(ijyVar.h()) && this.i.equals(ijyVar.i()) && this.j.equals(ijyVar.j()) && this.k.equals(ijyVar.k())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ijy
    public final int f() {
        return this.f;
    }

    @Override // defpackage.ijy
    public final int g() {
        return this.g;
    }

    @Override // defpackage.ijy
    public final Paint h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
    }

    @Override // defpackage.ijy
    public final Paint i() {
        return this.i;
    }

    @Override // defpackage.ijy
    public final Paint j() {
        return this.j;
    }

    @Override // defpackage.ijy
    public final TextPaint k() {
        return this.k;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.i);
        String valueOf3 = String.valueOf(this.j);
        String valueOf4 = String.valueOf(this.k);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 271 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("CalloutConstants{caretWidth=");
        sb.append(i);
        sb.append(", caretHeight=");
        sb.append(i2);
        sb.append(", cornerRadius=");
        sb.append(i3);
        sb.append(", bottomMargin=");
        sb.append(i4);
        sb.append(", topMargin=");
        sb.append(i5);
        sb.append(", textHorizontalPadding=");
        sb.append(i6);
        sb.append(", textVerticalPadding=");
        sb.append(i7);
        sb.append(", fillPaint=");
        sb.append(valueOf);
        sb.append(", keyShadowPaint=");
        sb.append(valueOf2);
        sb.append(", ambientShadowPaint=");
        sb.append(valueOf3);
        sb.append(", labelPaint=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
