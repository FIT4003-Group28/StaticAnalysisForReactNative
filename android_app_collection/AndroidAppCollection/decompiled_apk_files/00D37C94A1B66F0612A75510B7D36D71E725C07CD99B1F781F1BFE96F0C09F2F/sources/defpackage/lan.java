package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: lan  reason: default package */
/* loaded from: classes3.dex */
final class lan {
    private final Context a;
    private final aafo b;
    private final ajmy c;
    private final akbn d;
    private final ajxz e;
    private final fmh f;
    private final fnz g;
    private final akep h;
    private final akem i;

    public lan(Context context, aafo aafoVar, ajmy ajmyVar, akep akepVar, akbn akbnVar, ajxz ajxzVar, fmh fmhVar, fnz fnzVar, akem akemVar) {
        this.a = context;
        this.b = aafoVar;
        this.c = ajmyVar;
        this.h = akepVar;
        this.d = akbnVar;
        this.e = ajxzVar;
        this.f = fmhVar;
        this.g = fnzVar;
        this.i = akemVar;
    }

    public final lal a(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return new lao(this.a, this.b, this.c, this.h, this.d, this.e, this.f, this.g, this.i, viewGroup);
        }
        return new lam(this.a, this.b, this.c, this.h, this.d, this.e, this.f, this.g, this.i, viewGroup);
    }
}
