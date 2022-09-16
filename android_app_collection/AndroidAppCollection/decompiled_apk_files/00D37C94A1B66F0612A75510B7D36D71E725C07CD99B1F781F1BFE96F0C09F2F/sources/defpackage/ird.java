package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ird  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ird implements ajry {
    public final /* synthetic */ irh a;
    private final /* synthetic */ int b;

    public /* synthetic */ ird(irh irhVar) {
        this.a = irhVar;
    }

    public /* synthetic */ ird(irh irhVar, int i) {
        this.b = i;
        this.a = irhVar;
    }

    @Override // defpackage.ajry
    public final ajru b(ViewGroup viewGroup) {
        int i = this.b;
        if (i == 0) {
            final irh irhVar = this.a;
            yag yagVar = irhVar.an;
            xzh xzhVar = new xzh() { // from class: irc
                @Override // defpackage.xzh
                public final void a() {
                    irh.this.dismiss();
                }
            };
            xyw xywVar = irhVar.as;
            Context context = (Context) yagVar.a.get();
            context.getClass();
            aafo aafoVar = (aafo) yagVar.b.get();
            aafoVar.getClass();
            ycs ycsVar = (ycs) yagVar.c.get();
            ycsVar.getClass();
            xzv xzvVar = (xzv) yagVar.d.get();
            xzvVar.getClass();
            xywVar.getClass();
            return new yaf(context, aafoVar, ycsVar, xzvVar, viewGroup, xzhVar, xywVar);
        } else if (i == 1) {
            final irh irhVar2 = this.a;
            xzn xznVar = irhVar2.am;
            xzh xzhVar2 = new xzh() { // from class: irc
                @Override // defpackage.xzh
                public final void a() {
                    irh.this.dismiss();
                }
            };
            Context context2 = (Context) xznVar.a.get();
            context2.getClass();
            aafo aafoVar2 = (aafo) xznVar.b.get();
            aafoVar2.getClass();
            ydq ydqVar = (ydq) xznVar.c.get();
            ydqVar.getClass();
            yal yalVar = (yal) xznVar.d.get();
            yalVar.getClass();
            xzv xzvVar2 = (xzv) xznVar.e.get();
            xzvVar2.getClass();
            return new xzm(context2, viewGroup, aafoVar2, ydqVar, yalVar, xzvVar2, xzhVar2);
        } else {
            irh irhVar3 = this.a;
            yao yaoVar = irhVar3.ap;
            Context context3 = (Context) yaoVar.a.get();
            context3.getClass();
            viewGroup.getClass();
            return new yan(context3, (yaa) yaoVar.b.get(), (xzf) yaoVar.c.get(), viewGroup, irhVar3);
        }
    }
}
