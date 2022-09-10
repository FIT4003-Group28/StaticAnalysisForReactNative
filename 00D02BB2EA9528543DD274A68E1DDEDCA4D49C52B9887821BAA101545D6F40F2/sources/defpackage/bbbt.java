package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bbbt  reason: default package */
/* loaded from: classes3.dex */
class bbbt extends bazl {
    final /* synthetic */ bbbv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbbt(bbbv bbbvVar, Activity activity, cjqy cjqyVar, String str, String str2, ddho ddhoVar) {
        super(activity, cjqyVar, str, str2, ddhoVar);
        this.c = bbbvVar;
    }

    @Override // defpackage.bayn
    public Boolean a() {
        return Boolean.valueOf(!this.c.QI().isEmpty());
    }

    @Override // defpackage.bazl, defpackage.bayn
    public cqkl b() {
        this.c.b.C();
        return cqkl.a;
    }
}
