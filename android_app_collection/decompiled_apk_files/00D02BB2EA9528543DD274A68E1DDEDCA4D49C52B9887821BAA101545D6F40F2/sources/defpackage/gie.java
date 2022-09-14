package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: gie  reason: default package */
/* loaded from: classes6.dex */
public final class gie extends cqtd {
    final cqtd a;

    public gie(cqtd cqtdVar) {
        super(new Object[]{cqtdVar});
        this.a = cqtdVar;
    }

    public static gid b(gib gibVar) {
        gid gidVar = new gid();
        ghy ghyVar = (ghy) gibVar;
        gidVar.a = ghyVar.a;
        gidVar.c = ghyVar.b;
        return gidVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        return this.a.a(context);
    }
}
