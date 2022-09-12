package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bnlx  reason: default package */
/* loaded from: classes3.dex */
public final class bnlx implements dbty<View.OnLayoutChangeListener> {
    final /* synthetic */ bnly a;

    public bnlx(bnly bnlyVar) {
        this.a = bnlyVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ View.OnLayoutChangeListener a() {
        return new bnlw(this);
    }
}
