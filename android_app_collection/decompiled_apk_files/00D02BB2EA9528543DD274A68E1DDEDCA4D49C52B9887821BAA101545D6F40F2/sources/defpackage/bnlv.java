package defpackage;

import android.view.OrientationEventListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bnlv  reason: default package */
/* loaded from: classes3.dex */
public final class bnlv implements dbty<OrientationEventListener> {
    final /* synthetic */ bnly a;

    public bnlv(bnly bnlyVar) {
        this.a = bnlyVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ OrientationEventListener a() {
        return new bnlu(this, this.a.f);
    }
}
