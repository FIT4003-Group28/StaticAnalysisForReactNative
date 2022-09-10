package defpackage;
/* compiled from: PG */
/* renamed from: aigm  reason: default package */
/* loaded from: classes2.dex */
public abstract class aigm implements aihd {
    public final eapd b;
    public final eaow c;

    public aigm(eapd eapdVar, eaow eaowVar) {
        this.b = eapdVar;
        this.c = eaowVar;
    }

    public abstract ailh a(ailh ailhVar);

    public abstract aill b();

    @Override // defpackage.aihd
    public final eapd d() {
        return this.b;
    }

    @Override // defpackage.aihd
    public final eaow e() {
        return this.c;
    }
}
