package defpackage;

import android.content.Context;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: lrr  reason: default package */
/* loaded from: classes7.dex */
class lrr implements lru {
    final /* synthetic */ lrt a;

    public lrr(lrt lrtVar) {
        this.a = lrtVar;
    }

    @Override // defpackage.lru
    public cqkl a() {
        this.a.b.run();
        return cqkl.a;
    }

    @Override // defpackage.lru
    public CharSequence b() {
        atmi p = this.a.a.p();
        Context context = this.a.d.d;
        return TextUtils.concat(p.am(), " · ", p.d());
    }
}
