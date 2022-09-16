package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: akof  reason: default package */
/* loaded from: classes.dex */
public final class akof implements ajry {
    private final Context a;
    private final aafo b;
    private final ajsk c;
    private final acti d;
    private final Runnable e;
    private final akog f;

    public akof(Context context, aafo aafoVar, ajsk ajskVar, acti actiVar, Runnable runnable, akog akogVar) {
        this.a = context;
        this.b = aafoVar;
        this.c = ajskVar;
        this.d = actiVar;
        this.e = runnable;
        this.f = akogVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return new akoh(this.a, this.b, this.c, this.d, this.f, this.e);
    }
}
