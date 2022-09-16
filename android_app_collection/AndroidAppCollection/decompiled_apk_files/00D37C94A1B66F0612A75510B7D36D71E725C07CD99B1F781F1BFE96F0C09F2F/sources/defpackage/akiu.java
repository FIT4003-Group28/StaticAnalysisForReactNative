package defpackage;
/* compiled from: PG */
/* renamed from: akiu  reason: default package */
/* loaded from: classes.dex */
public final class akiu implements axyh {
    public static final ayaq a = ayaq.c("Authorization", ayat.a);
    public final ayat b;
    public final String c;

    public akiu(ayat ayatVar, String str) {
        this.b = ayatVar;
        this.c = str;
    }

    @Override // defpackage.axyh
    public final axyg a(ayax ayaxVar, axyd axydVar, axye axyeVar) {
        return new akit(this, axyeVar.a(ayaxVar, axydVar));
    }
}
