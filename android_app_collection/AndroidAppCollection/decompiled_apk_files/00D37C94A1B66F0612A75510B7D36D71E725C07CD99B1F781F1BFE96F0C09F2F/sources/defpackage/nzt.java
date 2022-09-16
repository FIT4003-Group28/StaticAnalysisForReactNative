package defpackage;

import android.graphics.Rect;
import android.view.View;
/* compiled from: PG */
/* renamed from: nzt  reason: default package */
/* loaded from: classes3.dex */
abstract class nzt extends nzu {
    public nzt(nzy nzyVar, View view) {
        super(nzyVar, view);
    }

    @Override // defpackage.nzu, defpackage.nzn
    public final Rect b() {
        return h(this.d.d(1));
    }

    @Override // defpackage.nzu, defpackage.nzn
    public final Rect c() {
        return h(this.d.c());
    }

    public abstract Rect h(nxe nxeVar);
}
