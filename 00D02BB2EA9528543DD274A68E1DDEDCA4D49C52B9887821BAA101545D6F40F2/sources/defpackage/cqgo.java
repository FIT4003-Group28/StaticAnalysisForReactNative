package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqgo  reason: default package */
/* loaded from: classes5.dex */
public final class cqgo implements Runnable {
    final /* synthetic */ Integer a;
    final /* synthetic */ View b;
    final /* synthetic */ cqkp c;
    final /* synthetic */ cqgq d;

    public cqgo(cqgq cqgqVar, Integer num, View view, cqkp cqkpVar) {
        this.d = cqgqVar;
        this.a = num;
        this.b = view;
        this.c = cqkpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cqkp cqkpVar;
        Integer num = this.a;
        if (num != null) {
            this.b.setVisibility(num.intValue());
        }
        cqgp<?> cqgpVar = this.d.i;
        if (cqgpVar == null || (cqkpVar = this.c) == null) {
            return;
        }
        cqgpVar.a(this.b, cqkpVar);
    }
}
