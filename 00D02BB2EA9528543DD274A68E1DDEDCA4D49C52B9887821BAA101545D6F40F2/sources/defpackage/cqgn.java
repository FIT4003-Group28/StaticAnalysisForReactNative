package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqgn  reason: default package */
/* loaded from: classes5.dex */
public final class cqgn implements Runnable {
    final /* synthetic */ Integer a;
    final /* synthetic */ View b;
    final /* synthetic */ cqkp c;
    final /* synthetic */ cqgq d;

    public cqgn(cqgq cqgqVar, Integer num, View view, cqkp cqkpVar) {
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
        cqgp<?> cqgpVar = this.d.h;
        if (cqgpVar == null || (cqkpVar = this.c) == null) {
            return;
        }
        cqgpVar.a(this.b, cqkpVar);
    }
}
