package defpackage;
/* compiled from: PG */
/* renamed from: amvd  reason: default package */
/* loaded from: classes.dex */
public final class amvd extends amua {
    public amxq a;
    boolean b;

    public amvd() {
        this(4);
    }

    public final amvg a() {
        amxq amxqVar = this.a;
        amxqVar.getClass();
        if (amxqVar.c == 0) {
            return amyf.a;
        }
        this.b = true;
        return new amyf(amxqVar);
    }

    public final void b(Object obj, int i) {
        amxq amxqVar = this.a;
        amxqVar.getClass();
        if (i == 0) {
            return;
        }
        if (this.b) {
            this.a = new amxq(amxqVar);
        }
        this.b = false;
        obj.getClass();
        amxq amxqVar2 = this.a;
        amxqVar2.l(obj, i + amxqVar2.b(obj));
    }

    @Override // defpackage.amua
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        throw null;
    }

    public amvd(int i) {
        this.b = false;
        this.a = new amxq(i);
    }
}
