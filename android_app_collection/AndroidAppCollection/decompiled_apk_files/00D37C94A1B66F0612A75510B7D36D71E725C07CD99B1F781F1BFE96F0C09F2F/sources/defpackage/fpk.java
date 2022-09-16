package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: fpk  reason: default package */
/* loaded from: classes3.dex */
public final class fpk implements ajry {
    private final Context a;
    private final gem b;
    private final ajmy c;
    private final aafo d;
    private final akbn e;

    public fpk(Context context, gem gemVar, ajmy ajmyVar, aafo aafoVar, akbn akbnVar) {
        this.a = context;
        this.b = gemVar;
        this.c = ajmyVar;
        this.d = aafoVar;
        this.e = akbnVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return new fpl(this.a, viewGroup, this.b, this.c, this.d, this.e);
    }
}
