package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wp  reason: default package */
/* loaded from: classes7.dex */
public final class wp extends zq {
    final /* synthetic */ wq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp(wq wqVar, View view) {
        super(view);
        this.a = wqVar;
    }

    @Override // defpackage.zq
    public final vx a() {
        wr wrVar = this.a.a.l;
        if (wrVar == null) {
            return null;
        }
        return wrVar.b();
    }

    @Override // defpackage.zq
    public final boolean b() {
        this.a.a.j();
        return true;
    }

    @Override // defpackage.zq
    public final boolean c() {
        wt wtVar = this.a.a;
        if (wtVar.n != null) {
            return false;
        }
        wtVar.k();
        return true;
    }
}
