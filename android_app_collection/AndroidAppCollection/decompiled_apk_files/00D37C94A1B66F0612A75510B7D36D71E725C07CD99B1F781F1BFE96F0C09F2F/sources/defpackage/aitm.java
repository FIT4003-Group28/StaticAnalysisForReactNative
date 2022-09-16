package defpackage;
/* compiled from: PG */
/* renamed from: aitm  reason: default package */
/* loaded from: classes.dex */
public final class aitm {
    public final azpa a = azpa.ar();
    public final azpa b = azpa.ar();
    public final yve c;
    public final axxb d;

    public aitm(axxb axxbVar, yve yveVar) {
        this.d = axxbVar;
        this.c = yveVar;
    }

    public final aitl a() {
        return new aitl(this.c, this.a, this.b, this.d);
    }

    public final ankt b() {
        if (this.d.b().booleanValue()) {
            ampq ampqVar = (ampq) this.a.at();
            boolean z = false;
            if (ampqVar != null && ampqVar.h() && ((Boolean) ampqVar.c()).booleanValue()) {
                z = true;
            }
            return anlz.q(Boolean.valueOf(z));
        }
        return anii.h(this.c.a(), aihl.o, anjk.a);
    }

    public final ankt c() {
        if (this.d.b().booleanValue()) {
            ampq ampqVar = (ampq) this.a.at();
            boolean z = false;
            if (ampqVar != null && ampqVar.h()) {
                z = true;
            }
            return anlz.q(Boolean.valueOf(z));
        }
        return anii.h(this.c.a(), aihl.q, anjk.a);
    }
}
