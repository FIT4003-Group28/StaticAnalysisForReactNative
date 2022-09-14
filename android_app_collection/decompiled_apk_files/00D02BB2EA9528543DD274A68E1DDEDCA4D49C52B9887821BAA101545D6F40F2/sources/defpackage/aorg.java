package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: aorg  reason: default package */
/* loaded from: classes2.dex */
public abstract class aorg implements aorf, anha {
    protected final Context a;
    private final anrr b;
    private final dzsj<jkf> c;
    private final cjtd d;

    public aorg(Context context, anrr anrrVar, dzsj<jkf> dzsjVar) {
        this.a = context;
        this.b = anrrVar;
        this.c = dzsjVar;
        cjta b = cjtd.b();
        b.d = dtyi.bF;
        b.b = anrrVar.w();
        if (anrrVar.v().a()) {
            b.g(anrrVar.v().b());
        }
        this.d = b.a();
    }

    @Override // defpackage.anha
    public aogm b() {
        return this.b.b();
    }

    @Override // defpackage.aorf
    public cqss i() {
        return this.b.M().a();
    }

    @Override // defpackage.aorf
    public cqkl j() {
        this.c.a().v();
        return cqkl.a;
    }

    @Override // defpackage.aorf
    public cjtd k() {
        return this.d;
    }

    public dvay l() {
        return this.b.g;
    }
}
