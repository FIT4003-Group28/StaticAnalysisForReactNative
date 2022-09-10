package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: xu  reason: default package */
/* loaded from: classes7.dex */
public final class xu extends zq {
    final /* synthetic */ yb a;
    final /* synthetic */ ye b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(ye yeVar, View view, yb ybVar) {
        super(view);
        this.b = yeVar;
        this.a = ybVar;
    }

    @Override // defpackage.zq
    public final vx a() {
        return this.a;
    }

    @Override // defpackage.zq
    public final boolean b() {
        if (!this.b.b.m()) {
            this.b.b();
            return true;
        }
        return true;
    }
}
