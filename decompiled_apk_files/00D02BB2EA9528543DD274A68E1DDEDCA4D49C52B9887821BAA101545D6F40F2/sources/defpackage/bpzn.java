package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bpzn  reason: default package */
/* loaded from: classes4.dex */
class bpzn extends bopt {
    final /* synthetic */ jkf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpzn(Context context, bokk bokkVar, String str, String str2, String str3, String str4, Integer num, ddho ddhoVar, cqjg cqjgVar, jkf jkfVar) {
        super(context, bokkVar, str, str2, str3, str4, num, 0, ddhoVar, null, false, false, true, null, cqjgVar, false, null, false, 3);
        this.a = jkfVar;
    }

    @Override // defpackage.bopt
    public void v(boolean z) {
        if (z) {
            this.a.B(jjn.FULLY_EXPANDED);
        }
    }
}
