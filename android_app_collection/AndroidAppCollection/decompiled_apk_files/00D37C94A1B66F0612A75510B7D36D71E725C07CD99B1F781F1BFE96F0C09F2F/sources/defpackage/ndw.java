package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ndw  reason: default package */
/* loaded from: classes3.dex */
public final class ndw implements ajry {
    private final Context a;
    private final aafo b;
    private final ajmy c;

    public ndw(Context context, ajmy ajmyVar, aafo aafoVar) {
        this.a = context;
        this.c = ajmyVar;
        this.b = aafoVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return new ndx(this.a, this.c, this.b, viewGroup);
    }
}
