package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yya  reason: default package */
/* loaded from: classes4.dex */
public final class yya implements View.OnClickListener {
    final /* synthetic */ yyd a;
    private final /* synthetic */ int b;

    public yya(yyd yydVar) {
        this.a = yydVar;
    }

    public yya(yyd yydVar, int i) {
        this.b = i;
        this.a = yydVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            yyd yydVar = this.a;
            int indexOf = yydVar.j.indexOf(view);
            yyc yycVar = yydVar.l;
            if (yycVar == null) {
                return;
            }
            okq okqVar = (okq) yycVar;
            okqVar.q(indexOf).flatMap(meg.r).ifPresent(new okj(okqVar));
            return;
        }
        yyd yydVar2 = this.a;
        yydVar2.m(yydVar2.j.indexOf(view), true);
    }
}
