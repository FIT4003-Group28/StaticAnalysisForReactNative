package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: akon  reason: default package */
/* loaded from: classes.dex */
public final class akon implements ajry {
    private final Context a;
    private final ajmy b;
    private final aafo c;
    private final ajxz d;
    private final akoo e;

    public akon(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, akoo akooVar) {
        this.a = context;
        this.b = ajmyVar;
        this.c = aafoVar;
        this.d = ajxzVar;
        this.e = akooVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return new akop(this.a, this.b, this.c, this.d, this.e);
    }
}
