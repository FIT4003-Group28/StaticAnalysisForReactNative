package defpackage;
/* compiled from: PG */
/* renamed from: cjvn  reason: default package */
/* loaded from: classes4.dex */
public final class cjvn {
    @dzsi
    public cjvm a = null;
    @dzsi
    private cjvm b = null;
    private final cqat c;
    private final ckcw d;

    public cjvn(cqat cqatVar, ckcw ckcwVar) {
        this.c = cqatVar;
        this.d = ckcwVar;
    }

    public final cjvm a(int i) {
        if (i - 1 != 0) {
            cjvm cjvmVar = new cjvm(i, this.c, this.d);
            this.b = cjvmVar;
            return cjvmVar;
        }
        cjvm cjvmVar2 = new cjvm(i, this.c, this.d);
        this.a = cjvmVar2;
        return cjvmVar2;
    }
}
