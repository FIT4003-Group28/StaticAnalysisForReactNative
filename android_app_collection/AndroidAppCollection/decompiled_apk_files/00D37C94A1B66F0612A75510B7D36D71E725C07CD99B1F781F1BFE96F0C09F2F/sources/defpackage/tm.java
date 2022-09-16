package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tm  reason: default package */
/* loaded from: classes4.dex */
public final class tm extends wc {
    final /* synthetic */ tn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm(tn tnVar, View view) {
        super(view);
        this.a = tnVar;
    }

    @Override // defpackage.wc
    public final sx a() {
        to toVar = this.a.a.k;
        if (toVar == null) {
            return null;
        }
        return toVar.a();
    }

    @Override // defpackage.wc
    public final boolean b() {
        this.a.a.m();
        return true;
    }

    @Override // defpackage.wc
    public final boolean c() {
        tq tqVar = this.a.a;
        if (tqVar.m != null) {
            return false;
        }
        tqVar.k();
        return true;
    }
}
