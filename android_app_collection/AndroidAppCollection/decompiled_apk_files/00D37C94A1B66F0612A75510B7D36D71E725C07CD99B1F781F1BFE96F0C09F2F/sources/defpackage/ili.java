package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ili  reason: default package */
/* loaded from: classes3.dex */
public final class ili extends ilk {
    public View a;
    public final /* synthetic */ iln b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ili(iln ilnVar) {
        super(ilnVar);
        this.b = ilnVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ilk
    public final void a(boolean z) {
        this.a.setVisibility(true != z ? 8 : 0);
    }
}
