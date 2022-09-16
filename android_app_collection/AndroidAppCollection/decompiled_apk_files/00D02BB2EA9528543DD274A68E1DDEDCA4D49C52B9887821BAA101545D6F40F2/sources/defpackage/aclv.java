package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aclv  reason: default package */
/* loaded from: classes.dex */
public final class aclv {
    static final cqis<View.OnClickListener> a = cqis.a();
    public final cjqy b;

    public aclv(cjqy cjqyVar) {
        this.b = cjqyVar;
    }

    public final void a(Object obj, View view, cqjz<?> cqjzVar) {
        cqkc.a(view).b(a, obj == null ? null : new aclu(this, obj, cqjzVar));
    }
}
