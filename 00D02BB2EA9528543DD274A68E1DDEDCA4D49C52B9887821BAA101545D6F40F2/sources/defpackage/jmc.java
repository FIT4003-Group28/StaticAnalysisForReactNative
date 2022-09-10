package defpackage;

import android.view.View;
/* compiled from: PG */
@Deprecated
/* renamed from: jmc  reason: default package */
/* loaded from: classes.dex */
public final class jmc implements jlp {
    public static final dcqe a = dcqe.c("jmc");
    private final dbsg<cjqy> b;
    private final dbsg<cjqq> c;

    @Deprecated
    public jmc() {
        this.b = dbpy.a;
        this.c = dbpy.a;
    }

    public jmc(cjqy cjqyVar, cjqq cjqqVar) {
        this.b = dbsg.i(cjqyVar);
        this.c = dbsg.i(cjqqVar);
    }

    @Override // defpackage.jlp
    public final jlo a(CharSequence charSequence, View view) {
        jma jmaVar = new jma(charSequence, view);
        if (this.b.a()) {
            jmaVar.g = dbsg.i(this.b.b());
        }
        if (this.c.a()) {
            jmaVar.h = dbsg.i(this.c.b());
        }
        return jmaVar;
    }
}
