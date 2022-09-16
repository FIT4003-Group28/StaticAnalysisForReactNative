package defpackage;

import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: wbz  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class wbz implements ajry {
    public final /* synthetic */ wca a;
    private final /* synthetic */ int b;

    public /* synthetic */ wbz(wca wcaVar) {
        this.a = wcaVar;
    }

    public /* synthetic */ wbz(wca wcaVar, int i) {
        this.b = i;
        this.a = wcaVar;
    }

    @Override // defpackage.ajry
    public final ajru b(ViewGroup viewGroup) {
        int i = this.b;
        if (i == 0) {
            wca wcaVar = this.a;
            return wcaVar.ah.a(wcaVar.af, viewGroup);
        } else if (i == 1) {
            wca wcaVar2 = this.a;
            return wcaVar2.ag.a(wcaVar2.af, viewGroup);
        } else if (i == 2) {
            wca wcaVar3 = this.a;
            return wcaVar3.ai.a(wcaVar3.af, viewGroup);
        } else {
            wca wcaVar4 = this.a;
            return wcaVar4.aj.a(wcaVar4.af, viewGroup);
        }
    }
}
