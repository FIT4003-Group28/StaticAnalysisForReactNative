package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: arzz  reason: default package */
/* loaded from: classes2.dex */
public final class arzz {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final CharSequence h;
    public final CharSequence i;
    public final CharSequence j;
    public final CharSequence k;
    public final CharSequence l;
    @dzsi
    public final arzy m;
    @dzsi
    private Bitmap n;

    public arzz(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, CharSequence charSequence6, CharSequence charSequence7, CharSequence charSequence8, CharSequence charSequence9, CharSequence charSequence10, CharSequence charSequence11, CharSequence charSequence12, @dzsi arzy arzyVar) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = charSequence4;
        this.e = charSequence5;
        this.f = charSequence6;
        this.g = charSequence7;
        this.h = charSequence8;
        this.i = charSequence9;
        this.j = charSequence10;
        this.k = charSequence11;
        this.l = charSequence12;
        this.m = arzyVar;
    }

    @dzsi
    public final Bitmap a() {
        arzy arzyVar = this.m;
        if (arzyVar == null) {
            return null;
        }
        if (this.n == null) {
            this.n = asaa.a(arzyVar.a, arzyVar.b, arzyVar.c);
        }
        return this.n;
    }
}
