package defpackage;
/* compiled from: PG */
/* renamed from: ajre  reason: default package */
/* loaded from: classes.dex */
public final class ajre {
    public final ampq a;
    public final ampq b;
    public final ampq c;

    public ajre() {
        this.a = amon.a;
        this.b = amon.a;
        this.c = amon.a;
    }

    public ajre(aqtd aqtdVar) {
        ampq ampqVar;
        ampq ampqVar2;
        if (aqtdVar.c && (aqtdVar.b & 8) != 0) {
            ampqVar = ampq.j(Integer.valueOf((int) aqtdVar.f));
        } else {
            ampqVar = amon.a;
        }
        this.a = ampqVar;
        if ((aqtdVar.b & 4) != 0) {
            ampqVar2 = ampq.j(Float.valueOf(aqtdVar.e));
        } else {
            ampqVar2 = amon.a;
        }
        this.b = ampqVar2;
        this.c = (aqtdVar.b & 2) != 0 ? ampq.j(Float.valueOf(aqtdVar.d)) : amon.a;
    }
}
