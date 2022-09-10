package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acop  reason: default package */
/* loaded from: classes2.dex */
public final class acop extends cqmt<acpa> {
    @Override // defpackage.cqmt
    protected final cqmr<acpa> a(cqjz<acpa> cqjzVar) {
        View view = cqjzVar.c;
        view.addOnAttachStateChangeListener(new acon());
        return new acoo(view);
    }
}
