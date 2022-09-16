package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: mju  reason: default package */
/* loaded from: classes3.dex */
public final class mju implements ajry {
    private final Context a;
    private final amqo b;
    private final ajmy c;
    private final aafo d;
    private final ajyc e;
    private final snc f;
    private final lmu g;
    private final jkv h;
    private final aadd i;
    private final ftb j;
    private final kua k;

    public mju(Context context, amqo amqoVar, ajmy ajmyVar, aafo aafoVar, ajyc ajycVar, snc sncVar, lmu lmuVar, jkv jkvVar, aadd aaddVar, ftb ftbVar, kua kuaVar) {
        this.a = context;
        this.b = amqoVar;
        this.c = ajmyVar;
        this.d = aafoVar;
        this.e = ajycVar;
        this.f = sncVar;
        this.g = lmuVar;
        this.h = jkvVar;
        this.i = aaddVar;
        this.j = ftbVar;
        this.k = kuaVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [ajrx, java.lang.Object] */
    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return new mjv(this.a, this.c, this.b.get(), this.d, this.e, this.f, viewGroup, this.g, this.h, this.i, this.j, this.k);
    }
}
