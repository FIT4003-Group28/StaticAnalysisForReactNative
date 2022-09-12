package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: nqm  reason: default package */
/* loaded from: classes7.dex */
public final class nqm extends cqqh {
    private final aufc a;
    private final cjqy d;
    private final bvjj e;
    private final ite f;

    public nqm(Context context, dehp dehpVar, aufc aufcVar, cjqy cjqyVar, bvjj bvjjVar, ite iteVar) {
        super(context, new cqhw(), dehpVar, true);
        dbsk.s(aufcVar);
        this.a = aufcVar;
        dbsk.s(cjqyVar);
        this.d = cjqyVar;
        dbsk.s(bvjjVar);
        this.e = bvjjVar;
        this.f = iteVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqqh, defpackage.cqie
    public final void a(List<cqkv> list) {
        list.add(new nro());
        list.add(new nrg(this, this.a, this.e));
        list.add(new iuj());
        list.add(new iub(this.d, this.f));
        list.add(new ackf(this.d, this.e, this.f));
        super.a(list);
    }
}
