package defpackage;
/* compiled from: PG */
/* renamed from: dcsz  reason: default package */
/* loaded from: classes.dex */
public final class dcsz implements dcsp {
    public final String a;
    public final boolean b;
    public final boolean c;

    public dcsz() {
        this("", true, true);
    }

    public dcsz(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.dcsp
    public final dcrl a(String str) {
        return new dctb(this.a, str, this.b, this.c);
    }
}
