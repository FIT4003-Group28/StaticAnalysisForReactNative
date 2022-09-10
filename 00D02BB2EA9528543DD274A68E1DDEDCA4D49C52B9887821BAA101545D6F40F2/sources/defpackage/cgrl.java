package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cgrl  reason: default package */
/* loaded from: classes4.dex */
public class cgrl implements cgrd<dwjx> {
    public final btpc a;
    public final Activity b;
    public final cgrc c;
    @dzsi
    public cgsh d = null;
    public final bvam e;

    public cgrl(btpc btpcVar, Activity activity, bvam bvamVar, cgrc cgrcVar) {
        this.a = btpcVar;
        this.b = activity;
        this.e = bvamVar;
        this.c = cgrcVar;
    }

    @Override // defpackage.cgrd
    public final void a(btzy btzyVar) {
        cgsh cgshVar = this.d;
        if (cgshVar != null) {
            cgshVar.g(null);
        }
    }

    @Override // defpackage.cgrd
    public final void b() {
        cgsh cgshVar = this.d;
        if (cgshVar != null) {
            cgshVar.g(null);
        }
    }

    @Override // defpackage.cgrd
    public final /* bridge */ /* synthetic */ void c(dwjx dwjxVar) {
        dwjx dwjxVar2 = dwjxVar;
        bvrj.UI_THREAD.c();
        cgsh cgshVar = this.d;
        if (cgshVar != null) {
            cgshVar.g(dwjxVar2);
        }
    }
}
