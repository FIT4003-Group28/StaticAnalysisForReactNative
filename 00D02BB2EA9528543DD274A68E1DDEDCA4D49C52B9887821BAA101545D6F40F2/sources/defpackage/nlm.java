package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: nlm  reason: default package */
/* loaded from: classes7.dex */
public final class nlm {
    private final dzsj<arpm> a;
    private final bvrb b;
    private final nln c;
    private final Context d;

    public nlm(dzsj<arpm> dzsjVar, bvrb bvrbVar, nln nlnVar, Context context) {
        this.a = dzsjVar;
        this.b = bvrbVar;
        this.c = nlnVar;
        this.d = context;
    }

    public final nll a() {
        return new nll(this.a.a(), this.b, this.c, this.d);
    }
}
