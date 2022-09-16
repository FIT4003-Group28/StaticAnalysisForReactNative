package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: zra  reason: default package */
/* loaded from: classes7.dex */
public class zra implements Serializable, jae {
    protected boolean a;
    private final vux b;
    private final String c;
    private final boolean d;
    private final zqz e;
    private final ddho f;

    public zra(vux vuxVar, String str, boolean z, zqz zqzVar, ddho ddhoVar) {
        this.b = vuxVar;
        this.c = str;
        this.a = z;
        this.d = z;
        this.e = zqzVar;
        this.f = ddhoVar;
    }

    @Override // defpackage.jae
    public Boolean a() {
        return true;
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
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.jae
    public cjtd g() {
        return cjtd.a(this.f);
    }

    @Override // defpackage.jae
    public jic h() {
        return null;
    }

    @Override // defpackage.jae
    public String i() {
        return "";
    }

    public dwao j(dwao dwaoVar) {
        return this.e.a(this.a, dwaoVar);
    }

    public boolean k() {
        return this.d;
    }

    public vux l() {
        return this.b;
    }
}
