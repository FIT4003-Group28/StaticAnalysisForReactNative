package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: cpf  reason: default package */
/* loaded from: classes5.dex */
public abstract class cpf {
    public static cpe d(Locale locale) {
        dbsk.s(locale);
        cpc cpcVar = new cpc();
        if (locale != null) {
            cpcVar.a = locale;
            cpcVar.c(false);
            cpcVar.b(false);
            return cpcVar;
        }
        throw new NullPointerException("Null locale");
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract Locale c();
}
