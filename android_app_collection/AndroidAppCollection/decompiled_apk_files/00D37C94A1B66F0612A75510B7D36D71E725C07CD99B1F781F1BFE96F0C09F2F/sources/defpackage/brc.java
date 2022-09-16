package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: brc  reason: default package */
/* loaded from: classes2.dex */
public final class brc implements blq {
    final /* synthetic */ Context a;

    public brc(Context context) {
        this.a = context;
    }

    @Override // defpackage.blq
    public final blr a(blp blpVar) {
        blo a = blp.a(this.a);
        a.b = blpVar.b;
        a.c = blpVar.c;
        a.d = true;
        return new blz().a(a.a());
    }
}
