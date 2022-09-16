package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: npx  reason: default package */
/* loaded from: classes7.dex */
public final class npx extends cqtd {
    private final cqtd a;
    private final cqtd b;

    public npx(cqtd cqtdVar, cqtd cqtdVar2) {
        super(new Object[]{cqtdVar, cqtdVar2});
        this.a = cqtdVar;
        this.b = cqtdVar2;
    }

    @Override // defpackage.cqsj, defpackage.cqur
    public final boolean NJ() {
        return true;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        if (((npz) context).a().booleanValue()) {
            return this.b.a(context);
        }
        return this.a.a(context);
    }
}
