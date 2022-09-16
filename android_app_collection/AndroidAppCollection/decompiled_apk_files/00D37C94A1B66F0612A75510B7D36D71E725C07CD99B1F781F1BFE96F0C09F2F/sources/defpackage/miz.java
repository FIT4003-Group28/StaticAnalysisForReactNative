package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: miz  reason: default package */
/* loaded from: classes3.dex */
public final class miz implements ajry {
    private final Context a;
    private final ajmy b;
    private final ajxz c;
    private final aafo d;
    private final akfb e;
    private final akem f;

    public miz(Context context, ajmy ajmyVar, ajxz ajxzVar, aafo aafoVar, akfb akfbVar, akem akemVar) {
        context.getClass();
        this.a = context;
        ajmyVar.getClass();
        this.b = ajmyVar;
        ajxzVar.getClass();
        this.c = ajxzVar;
        aafoVar.getClass();
        this.d = aafoVar;
        akfbVar.getClass();
        this.e = akfbVar;
        this.f = akemVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return new mja(this.a, viewGroup, this.b, this.c, this.d, this.e, this.f);
    }
}
