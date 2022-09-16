package defpackage;
/* compiled from: PG */
/* renamed from: tmo  reason: default package */
/* loaded from: classes4.dex */
public final class tmo implements tli {
    private final tlf a;

    public tmo(tlf tlfVar) {
        this.a = tlfVar;
    }

    @Override // defpackage.tli
    public final ankt a(tlp tlpVar) {
        if (tlpVar instanceof tng) {
            tng tngVar = (tng) tlpVar;
            if (tngVar.a().qn(tmq.a)) {
                tmp tmpVar = (tmp) tngVar.a().qm(tmq.a);
                int g = tnk.g(tmpVar.d);
                if (g == 0) {
                    g = 1;
                }
                int i = g - 1;
                if (i == 1) {
                    if ((tmpVar.b & 1) != 0) {
                        return anlz.q(tlf.a(tmpVar.c));
                    }
                    throw new IllegalArgumentException("GAIA type must have a name");
                } else if (i == 2) {
                    return anlz.q(new tlf(3, null));
                } else {
                    if (i == 3) {
                        return anlz.q(tlf.b());
                    }
                    if (i != 4) {
                        throw new IllegalArgumentException("Unknown type");
                    }
                    return anlz.q(this.a);
                }
            }
        }
        return anlz.q(null);
    }
}
