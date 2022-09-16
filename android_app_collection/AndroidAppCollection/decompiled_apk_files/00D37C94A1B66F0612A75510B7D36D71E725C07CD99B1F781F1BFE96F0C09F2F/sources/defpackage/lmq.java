package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: lmq  reason: default package */
/* loaded from: classes3.dex */
public final class lmq extends ltu implements ynl {
    private final dt h;
    private final aafo i;
    private final aakn j;
    private final ajxz k;
    private final lmm l;

    public lmq(Context context, yni yniVar, aafo aafoVar, ajyi ajyiVar, ajrh ajrhVar, lmm lmmVar, aakn aaknVar, ajyz ajyzVar, dt dtVar, ajxz ajxzVar) {
        super(context, yniVar, aafoVar, ajyiVar, ajrhVar, lmmVar, aaknVar, ajyzVar);
        this.i = aafoVar;
        this.h = dtVar;
        this.l = lmmVar;
        this.j = aaknVar;
        this.k = ajxzVar;
    }

    @Override // defpackage.ltu, defpackage.ajzv, defpackage.ajyh
    public final void a(atep atepVar, View view, Object obj, acti actiVar) {
        this.e = obj;
        this.f = actiVar;
        akbc.b(this.h, atepVar, this.i, this.k, c(), new kge(actiVar, 2), this.j, this.l);
    }

    @Override // defpackage.ltu, defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (cls == lmq.class) {
            if (i == -1) {
                return new Class[]{isw.class};
            }
            if (i == 0) {
                b((isw) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return lmr.a(this, obj, i);
    }
}
