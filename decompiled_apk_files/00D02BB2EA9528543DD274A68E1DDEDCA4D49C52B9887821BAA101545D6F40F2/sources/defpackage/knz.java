package defpackage;
/* compiled from: PG */
/* renamed from: knz  reason: default package */
/* loaded from: classes7.dex */
public abstract class knz {
    public static knz d(koa koaVar, CharSequence charSequence, @dzsi cqtd cqtdVar, String str) {
        return new kny(koaVar, charSequence, cqtdVar, str);
    }

    public abstract koa a();

    public abstract CharSequence b();

    @dzsi
    public abstract cqtd c();

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof knz)) {
            return false;
        }
        knz knzVar = (knz) obj;
        return a() == knzVar.a() && b().toString().equals(knzVar.b().toString()) && c() == knzVar.c();
    }
}
