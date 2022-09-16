package defpackage;
/* compiled from: PG */
/* renamed from: eaun  reason: default package */
/* loaded from: classes6.dex */
public final class eaun {
    public final eaux a;
    public final eauw b;
    private final eapo c;

    public eaun(eaux eauxVar, eauw eauwVar) {
        this.a = eauxVar;
        this.b = eauwVar;
        this.c = null;
    }

    private eaun(eaux eauxVar, eauw eauwVar, eapo eapoVar) {
        this.a = eauxVar;
        this.b = eauwVar;
        this.c = eapoVar;
    }

    public final void a(eapo eapoVar) {
        if (eapoVar == this.c) {
            return;
        }
        new eaun(this.a, this.b, eapoVar);
    }
}
