package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: npw  reason: default package */
/* loaded from: classes7.dex */
public final class npw extends cqss {
    private final cqss a;
    private final cqss b;

    public npw(cqss cqssVar, cqss cqssVar2) {
        super(new Object[]{cqssVar, cqssVar2});
        dbsk.s(cqssVar);
        this.a = cqssVar;
        dbsk.s(cqssVar2);
        this.b = cqssVar2;
    }

    @Override // defpackage.cqsj, defpackage.cqur
    public final boolean NJ() {
        return true;
    }

    @Override // defpackage.cqss, defpackage.cqtd
    public final Drawable a(Context context) {
        if (((npz) context).a().booleanValue()) {
            return this.b.a(context);
        }
        return this.a.a(context);
    }

    @Override // defpackage.cqss
    public final int b(Context context) {
        return ((cqta) (((npz) context).a().booleanValue() ? this.b : this.a)).a;
    }

    @Override // defpackage.cqss
    public final ColorStateList c(Context context) {
        if (((npz) context).a().booleanValue()) {
            return this.b.c(context);
        }
        return this.a.c(context);
    }
}
