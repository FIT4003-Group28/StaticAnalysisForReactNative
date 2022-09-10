package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ashm  reason: default package */
/* loaded from: classes2.dex */
public final class ashm extends cqmt<asho> {
    cpwy a = null;

    @Override // defpackage.cqmt
    protected final cqmr<asho> a(cqjz<asho> cqjzVar) {
        View view = cqjzVar.c;
        if (gct.a(view.getContext().getResources().getConfiguration())) {
            this.a = view instanceof cpwy ? (cpwy) view : null;
        }
        return new ashl(this, view);
    }
}
