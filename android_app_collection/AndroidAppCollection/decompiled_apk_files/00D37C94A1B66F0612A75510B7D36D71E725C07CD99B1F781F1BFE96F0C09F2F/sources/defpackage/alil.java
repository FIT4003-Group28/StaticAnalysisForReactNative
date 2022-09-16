package defpackage;

import android.view.View;
import j$.util.Objects;
/* compiled from: PG */
/* renamed from: alil  reason: default package */
/* loaded from: classes.dex */
final class alil implements kj {
    final /* synthetic */ alip a;

    public alil(alip alipVar) {
        this.a = alipVar;
    }

    @Override // defpackage.kj
    public final mb a(View view, mb mbVar) {
        alip alipVar = this.a;
        mb mbVar2 = true != lj.af(alipVar) ? null : mbVar;
        if (!Objects.equals(alipVar.h, mbVar2)) {
            alipVar.h = mbVar2;
            alipVar.requestLayout();
        }
        return mbVar.n();
    }
}
