package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aasw  reason: default package */
/* loaded from: classes.dex */
public final class aasw extends aars {
    private final aarl a;

    public aasw(aaqj aaqjVar, aaqf aaqfVar, yqw yqwVar) {
        super(aaqfVar, yqwVar);
        this.a = c(arlb.a, aaqjVar, aass.c, iho.k);
    }

    public final aasv a(afvm afvmVar, String str, boolean z) {
        return new aasv(this.e, afvmVar, str, z);
    }

    public final ankt b(aasv aasvVar, Executor executor) {
        return this.a.b(aasvVar, executor);
    }
}
