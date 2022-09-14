package defpackage;

import android.view.View;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: bbdz  reason: default package */
/* loaded from: classes3.dex */
final class bbdz implements Callable<Integer> {
    final /* synthetic */ bbea a;

    public bbdz(bbea bbeaVar) {
        this.a = bbeaVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Integer call() {
        bbea bbeaVar = this.a;
        View d = cqkx.d(((geb) bbeaVar).a, bbeaVar.w());
        return Integer.valueOf(d != null ? d.getHeight() : 0);
    }
}
