package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cgrr  reason: default package */
/* loaded from: classes4.dex */
public class cgrr extends cgrk {
    public cgrr(btpc btpcVar, Activity activity, buwz buwzVar, cgrc cgrcVar) {
        super(btpcVar, activity, buwzVar, cgrcVar);
    }

    @Override // defpackage.cgrd
    public final void a(btzy btzyVar) {
        cgsh cgshVar = this.d;
        if (cgshVar != null) {
            cgshVar.e(null);
        }
    }

    @Override // defpackage.cgrd
    public final void b() {
        cgsh cgshVar = this.d;
        if (cgshVar != null) {
            cgshVar.e(null);
        }
    }

    @Override // defpackage.cgrd
    public final /* bridge */ /* synthetic */ void c(dwhd dwhdVar) {
        dwhd dwhdVar2 = dwhdVar;
        bvrj.UI_THREAD.c();
        cgsh cgshVar = this.d;
        if (cgshVar != null) {
            cgshVar.e(dwhdVar2);
        }
    }
}
