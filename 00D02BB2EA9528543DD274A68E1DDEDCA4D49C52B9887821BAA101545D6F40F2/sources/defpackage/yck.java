package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: yck  reason: default package */
/* loaded from: classes7.dex */
public class yck implements xzq {
    @dzsi
    private final CharSequence a;

    private yck(@dzsi CharSequence charSequence) {
        this.a = charSequence;
    }

    public static yck b(dgaw dgawVar, Context context) {
        return new yck(bvtb.h(context, dgawVar));
    }

    @Override // defpackage.xzq
    @dzsi
    public CharSequence a() {
        return this.a;
    }
}
