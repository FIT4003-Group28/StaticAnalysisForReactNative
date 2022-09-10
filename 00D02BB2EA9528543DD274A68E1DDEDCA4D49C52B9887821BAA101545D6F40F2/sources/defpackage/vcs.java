package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: vcs  reason: default package */
/* loaded from: classes7.dex */
final class vcs extends cqmj<zbx> {
    final /* synthetic */ vct a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vcs(vct vctVar, cqmp... cqmpVarArr) {
        super(cqmpVarArr);
        this.a = vctVar;
    }

    @Override // defpackage.cqmj
    public final View a(cqkd cqkdVar, int i, int i2, @dzsi Integer num, @dzsi ViewGroup viewGroup, boolean z) {
        zxo b = vei.b(this.a.a, cqkdVar.a(num, viewGroup));
        cqkdVar.d(viewGroup, b, z);
        return b;
    }
}
