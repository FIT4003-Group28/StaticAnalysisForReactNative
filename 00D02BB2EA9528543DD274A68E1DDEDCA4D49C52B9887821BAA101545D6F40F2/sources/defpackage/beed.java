package defpackage;

import android.os.Build;
/* compiled from: PG */
/* renamed from: beed  reason: default package */
/* loaded from: classes3.dex */
public final class beed extends beeb {
    public beed() {
        super(true, 16, true);
    }

    @Override // defpackage.beeb, defpackage.cqiw
    protected final cqmj<beer> a() {
        cqmj<beer> a = super.a();
        if (Build.VERSION.SDK_INT >= 29) {
            a.g(cqgr.a(new bnhx()));
        } else {
            a.g(cqgr.a(new beec()));
        }
        return a;
    }
}
