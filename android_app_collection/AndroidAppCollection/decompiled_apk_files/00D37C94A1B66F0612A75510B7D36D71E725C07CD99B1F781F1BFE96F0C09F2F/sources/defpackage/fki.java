package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: fki  reason: default package */
/* loaded from: classes3.dex */
public final class fki implements ajry {
    private final Context a;
    private final wkb b;
    private final wmk c;

    public fki(Context context, wkb wkbVar, wmk wmkVar) {
        this.a = context;
        this.b = wkbVar;
        this.c = wmkVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return new fkj(this.a, viewGroup, this.b, this.c);
    }
}
