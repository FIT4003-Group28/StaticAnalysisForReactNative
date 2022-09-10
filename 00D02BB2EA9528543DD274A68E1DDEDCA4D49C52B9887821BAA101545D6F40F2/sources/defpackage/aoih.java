package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aoih  reason: default package */
/* loaded from: classes2.dex */
public class aoih implements aoig {
    private final jic a;
    private final cjtd b;
    private final View.OnClickListener c;

    public aoih(jic jicVar, cjtd cjtdVar, View.OnClickListener onClickListener) {
        this.a = jicVar;
        this.b = cjtdVar;
        this.c = onClickListener;
    }

    @Override // defpackage.aoig
    public jic a() {
        return this.a;
    }

    @Override // defpackage.aoig
    public cjtd b() {
        return this.b;
    }

    @Override // defpackage.aoig
    public View.OnClickListener c() {
        return this.c;
    }
}
