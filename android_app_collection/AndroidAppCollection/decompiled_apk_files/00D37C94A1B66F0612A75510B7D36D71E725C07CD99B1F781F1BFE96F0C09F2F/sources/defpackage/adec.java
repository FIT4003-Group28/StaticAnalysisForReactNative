package defpackage;
/* compiled from: PG */
/* renamed from: adec  reason: default package */
/* loaded from: classes.dex */
public final class adec implements adfv {
    private final bgo a;

    public adec(bgo bgoVar) {
        this.a = bgoVar;
    }

    @Override // defpackage.adfv
    public final boolean rk(bhc bhcVar) {
        if (bhcVar.i() || bhcVar.m == 3) {
            return false;
        }
        bhd.c();
        return bhd.a().r != bhcVar && bhcVar.g && bhcVar.n(this.a);
    }
}
