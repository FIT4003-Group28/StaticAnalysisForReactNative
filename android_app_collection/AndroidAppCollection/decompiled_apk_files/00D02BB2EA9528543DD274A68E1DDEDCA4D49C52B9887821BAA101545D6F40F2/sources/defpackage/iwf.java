package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: iwf  reason: default package */
/* loaded from: classes6.dex */
public class iwf implements jae {
    private Boolean a;
    private Boolean b;
    private final cqsn c;
    private final Context d;
    private final ddho e;

    public iwf(Context context, cqsn cqsnVar, @dzsi cqtd cqtdVar, ddho ddhoVar) {
        this.a = false;
        this.b = true;
        this.c = cqsnVar;
        this.d = context;
        this.e = ddhoVar;
    }

    @Override // defpackage.jae
    public Boolean a() {
        return this.b;
    }

    @Override // defpackage.jae
    public Boolean b() {
        return this.a;
    }

    @Override // defpackage.jae
    @dzsi
    public cqtd c() {
        return null;
    }

    @Override // defpackage.jae
    public CharSequence d() {
        return this.c.a(this.d).toString();
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        this.a = Boolean.valueOf(!this.a.booleanValue());
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.jae
    public cjtd g() {
        return cjtd.a(this.e);
    }

    @Override // defpackage.jae
    public jic h() {
        return null;
    }

    @Override // defpackage.jae
    public String i() {
        return "";
    }

    public iwf(Context context, cqsn cqsnVar, ddho ddhoVar) {
        this(context, cqsnVar, null, ddhoVar);
    }
}
