package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: mjg  reason: default package */
/* loaded from: classes3.dex */
public final class mjg {
    public final CharSequence a;
    public final CharSequence b;
    public boolean c;

    public mjg(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = TextUtils.equals(charSequence, charSequence2);
    }
}
