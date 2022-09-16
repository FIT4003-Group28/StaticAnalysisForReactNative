package defpackage;
/* compiled from: PG */
/* renamed from: afgi  reason: default package */
/* loaded from: classes.dex */
final class afgi extends afes {
    public final ovm a;

    public afgi(ovm ovmVar) {
        this.a = ovmVar;
    }

    @Override // defpackage.afes
    public final int a() {
        return this.a.c;
    }

    @Override // defpackage.afes
    public final int b() {
        return this.a.e;
    }

    @Override // defpackage.afes
    public final int c() {
        return this.a.d;
    }

    @Override // defpackage.afes
    public final String d() {
        return amps.d(this.a.a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof afgi) && this.a.equals(((afgi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
