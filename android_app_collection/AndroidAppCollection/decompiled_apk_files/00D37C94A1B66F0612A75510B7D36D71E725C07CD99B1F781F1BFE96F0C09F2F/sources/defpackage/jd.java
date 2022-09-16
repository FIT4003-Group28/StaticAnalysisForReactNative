package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: jd  reason: default package */
/* loaded from: classes3.dex */
public final class jd {
    public final String a;
    public final CharSequence b;
    public final int c;
    public Bundle d;

    public jd(String str, CharSequence charSequence, int i) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
        }
        if (TextUtils.isEmpty(charSequence)) {
            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
        }
        if (i != 0) {
            this.a = str;
            this.b = charSequence;
            this.c = i;
            return;
        }
        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
    }
}
