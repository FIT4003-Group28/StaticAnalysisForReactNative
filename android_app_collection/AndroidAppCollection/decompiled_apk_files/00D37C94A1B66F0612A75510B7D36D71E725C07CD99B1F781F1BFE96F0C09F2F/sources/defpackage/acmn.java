package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: acmn  reason: default package */
/* loaded from: classes.dex */
public final class acmn implements ajry {
    private final Context a;
    private final ajmy b;
    private final ajxz c;
    private final abtc d;
    private final aafo e;
    private final Executor f;
    private final acmp g;

    public acmn(Context context, ajmy ajmyVar, ajxz ajxzVar, abtc abtcVar, aafo aafoVar, Executor executor, acmp acmpVar) {
        this.a = context;
        this.b = ajmyVar;
        this.c = ajxzVar;
        this.d = abtcVar;
        this.e = aafoVar;
        this.f = executor;
        this.g = acmpVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return new acmo(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
