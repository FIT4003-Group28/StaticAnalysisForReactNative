package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;
/* compiled from: PG */
/* renamed from: aobt  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aobt implements rvd {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ aobt(String str) {
        this.a = str;
    }

    public /* synthetic */ aobt(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.rvd
    public final rve a(Object obj) {
        if (this.b == 0) {
            String str = this.a;
            aocs aocsVar = (aocs) obj;
            int i = FirebaseMessaging.h;
            rve b = aocsVar.b(new aocp("U", str));
            aocsVar.f();
            return b;
        }
        String str2 = this.a;
        aocs aocsVar2 = (aocs) obj;
        int i2 = FirebaseMessaging.h;
        rve b2 = aocsVar2.b(new aocp("S", str2));
        aocsVar2.f();
        return b2;
    }
}
