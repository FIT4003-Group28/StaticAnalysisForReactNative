package defpackage;
/* compiled from: PG */
/* renamed from: abyc  reason: default package */
/* loaded from: classes2.dex */
public final class abyc {
    public final bbul a;
    public final akfa b;
    public final cqat c;

    public abyc(bbul bbulVar, akfa akfaVar, cqat cqatVar) {
        this.a = bbulVar;
        this.b = akfaVar;
        this.c = cqatVar;
    }

    public static long a(dhpf dhpfVar) {
        int i = dhpfVar.a;
        int i2 = 1;
        int i3 = (i & 1) != 0 ? dhpfVar.b : 1;
        if ((i & 2) != 0) {
            i2 = dhpfVar.c;
        }
        return new eaol(i3, i2, dhpfVar.d, dhpfVar.e, dhpfVar.f, (byte[]) null).a;
    }
}
