package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: ynq  reason: default package */
/* loaded from: classes7.dex */
public abstract class ynq<T extends Serializable> implements Serializable, jae {
    private boolean a;
    private boolean b;
    private final String c;
    @dzsi
    private final ddho d;
    @dzsi
    private transient ynp<T> e;

    public ynq(String str, @dzsi ddho ddhoVar, boolean z) {
        this(str, ddhoVar, z, true);
    }

    public ynq(String str, @dzsi ddho ddhoVar, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = ddhoVar;
    }

    @Override // defpackage.jae
    public Boolean a() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.jae
    public Boolean b() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.jae
    @dzsi
    public cqtd c() {
        return null;
    }

    @Override // defpackage.jae
    public CharSequence d() {
        return this.c;
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        this.a = !this.a;
        k();
        return cqkl.a;
    }

    @Override // defpackage.jae
    @dzsi
    public cjtd g() {
        if (this.d == null) {
            return null;
        }
        cjta b = cjtd.b();
        b.d = this.d;
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = this.a ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        return b.a();
    }

    @Override // defpackage.jae
    public jic h() {
        return null;
    }

    @Override // defpackage.jae
    public String i() {
        return "";
    }

    public void j(@dzsi ynp<T> ynpVar) {
        this.e = ynpVar;
    }

    public void k() {
        ynp<T> ynpVar = this.e;
        if (ynpVar != null) {
            dqtz dqtzVar = (dqtz) l();
            cqkx.p(((yod) ynpVar).a.d);
        }
    }

    public abstract T l();
}
