package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ajqb  reason: default package */
/* loaded from: classes.dex */
public abstract class ajqb implements ajru {
    private final ajrx a;
    private final ajqi b;
    private final ViewGroup c;

    public ajqb(Context context, ajrx ajrxVar, ajsa ajsaVar) {
        ajrxVar.getClass();
        this.a = ajrxVar;
        ViewGroup d = d(context);
        this.c = d;
        this.b = e(context, ajsaVar);
        ajrxVar.c(d);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a.a();
    }

    protected abstract ViewGroup d(Context context);

    protected abstract ajqi e(Context context, ajsa ajsaVar);

    protected void f(int i, ajrs ajrsVar, ajqo ajqoVar) {
    }

    protected void g(ajrs ajrsVar, ajqo ajqoVar) {
        throw null;
    }

    @Override // defpackage.ajru
    /* renamed from: h */
    public final void oK(ajrs ajrsVar, ajqo ajqoVar) {
        this.c.removeAllViews();
        int i = ajqoVar.a;
        f(i, ajrsVar, ajqoVar);
        for (int i2 = 0; i2 < i; i2++) {
            Object b = ajqoVar.b(i2);
            ajqi ajqiVar = this.b;
            ajrs d = ajqiVar.d(ajrsVar);
            d.f("rowData", new ajqx(i2, i));
            i(ajqiVar.f(d, b, this.c), ajqoVar, i2);
        }
        g(ajrsVar, ajqoVar);
        this.a.e(ajrsVar);
    }

    protected abstract void i(View view, ajqo ajqoVar, int i);

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.b.e(this.c);
    }
}
