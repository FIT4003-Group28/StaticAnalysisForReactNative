package defpackage;

import android.view.View;
import defpackage.cuvv;
/* compiled from: PG */
/* renamed from: aqej  reason: default package */
/* loaded from: classes2.dex */
public final class aqej<V extends View & cuvv> extends cqiw<aqek<V>> {
    private final Class<V> a;
    private final cqjg b;

    public aqej(Class<V> cls, cqjg cqjgVar) {
        super(cls, cqjgVar);
        this.a = cls;
        this.b = cqjgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aqek<V>> a() {
        cqmh cqmhVar = new cqmh(this.a, new cqmp[0]);
        cqmhVar.f(cqgr.aT(this.b), cqgr.ch(cquz.b), cqgr.dk(aqei.a));
        return cqmhVar;
    }
}
