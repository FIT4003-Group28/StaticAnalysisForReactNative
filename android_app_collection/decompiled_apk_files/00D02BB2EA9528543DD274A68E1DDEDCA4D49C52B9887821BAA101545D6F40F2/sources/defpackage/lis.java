package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: lis  reason: default package */
/* loaded from: classes7.dex */
public final class lis implements not {
    private final not a;
    private final lwq b;

    public lis(not notVar, lwq lwqVar) {
        dbsk.s(notVar);
        this.a = notVar;
        dbsk.s(lwqVar);
        this.b = lwqVar;
    }

    @Override // defpackage.not
    public final ViewGroup a() {
        return this.a.a();
    }

    @Override // defpackage.not
    public final void b(noe noeVar, View view) {
        this.b.q(lwo.IN_HEADER);
        this.a.b(noeVar, view);
    }
}
