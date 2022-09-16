package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: lap  reason: default package */
/* loaded from: classes3.dex */
public final class lap extends ajsl {
    private final Context a;
    private final lan b;
    private final FrameLayout c;
    private lal d;
    private lal e;

    public lap(Context context, aafo aafoVar, ajmy ajmyVar, akep akepVar, akbn akbnVar, ajxz ajxzVar, fmh fmhVar, fnz fnzVar, akem akemVar) {
        this.a = context;
        this.b = new lan(context, aafoVar, ajmyVar, akepVar, akbnVar, ajxzVar, fmhVar, fnzVar, akemVar);
        this.c = new FrameLayout(context);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        lal lalVar;
        awdt awdtVar = (awdt) obj;
        if (zew.y(this.a)) {
            if (this.e == null) {
                this.e = this.b.a(this.c, 2);
            }
            lalVar = this.e;
        } else {
            if (this.d == null) {
                this.d = this.b.a(this.c, 1);
            }
            lalVar = this.d;
        }
        this.c.removeAllViews();
        this.c.addView(lalVar.a);
        lalVar.oK(ajrsVar, awdtVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((awdt) obj).n.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        lal lalVar = this.d;
        if (lalVar != null) {
            lalVar.qZ(ajsaVar);
        }
        lal lalVar2 = this.e;
        if (lalVar2 != null) {
            lalVar2.qZ(ajsaVar);
        }
    }
}
