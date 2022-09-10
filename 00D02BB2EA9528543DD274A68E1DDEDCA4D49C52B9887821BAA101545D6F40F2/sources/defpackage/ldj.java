package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ldj  reason: default package */
/* loaded from: classes7.dex */
public class ldj implements lcy {
    private final Context a;
    private final audn b;
    private int c;

    public ldj(Context context, audn audnVar, cqhn cqhnVar) {
        this.a = context;
        dbsk.s(audnVar);
        this.b = audnVar;
        dbsk.s(cqhnVar);
        this.c = cqrp.d(10.0d).e(context);
    }

    @Override // defpackage.lcs
    public void a(int i) {
        if (this.c == i) {
            return;
        }
        this.c = i;
        cqkx.p(this);
    }

    @Override // defpackage.lcs
    public cqtv b() {
        return cqrp.d(jmj.e(this.a, this.c));
    }

    @Override // defpackage.lcy
    public audn c() {
        return this.b;
    }
}
