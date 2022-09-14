package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bbbh  reason: default package */
/* loaded from: classes3.dex */
class bbbh extends bazl {
    final /* synthetic */ bbbk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbbh(bbbk bbbkVar, Activity activity, cjqy cjqyVar, String str, String str2, ddho ddhoVar) {
        super(activity, cjqyVar, str, str2, ddhoVar);
        this.c = bbbkVar;
    }

    @Override // defpackage.bayn
    public Boolean a() {
        return Boolean.valueOf(this.c.f());
    }

    @Override // defpackage.bazl, defpackage.bayn
    public cqkl b() {
        this.c.b.a("answers_cards_android");
        return cqkl.a;
    }

    @Override // defpackage.bazl, defpackage.bayn
    @dzsi
    public acpa c() {
        return bbbk.e(this.c.d);
    }
}
