package defpackage;

import android.content.Context;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wr  reason: default package */
/* loaded from: classes7.dex */
public final class wr extends vr {
    final /* synthetic */ wt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr(wt wtVar, Context context, vf vfVar, View view) {
        super(context, vfVar, view, true);
        this.d = wtVar;
        this.b = 8388613;
        h(wtVar.o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vr
    public final void f() {
        vf vfVar = this.d.c;
        if (vfVar != null) {
            vfVar.close();
        }
        this.d.l = null;
        super.f();
    }
}
