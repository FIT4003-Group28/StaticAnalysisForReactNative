package defpackage;
/* compiled from: PG */
/* renamed from: anag  reason: default package */
/* loaded from: classes.dex */
final class anag extends anah {
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private int f = 0;

    public anag(String str, String str2, int i, String str3) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
    }

    @Override // defpackage.anah
    public final int a() {
        return (char) this.d;
    }

    @Override // defpackage.anah
    public final String b() {
        return this.b.replace('/', '.');
    }

    @Override // defpackage.anah
    public final String c() {
        return this.e;
    }

    @Override // defpackage.anah
    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anag) {
            anag anagVar = (anag) obj;
            if (this.b.equals(anagVar.b) && this.c.equals(anagVar.c) && this.d == anagVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f;
        if (i == 0) {
            int hashCode = ((((this.b.hashCode() + 4867) * 31) + this.c.hashCode()) * 31) + this.d;
            this.f = hashCode;
            return hashCode;
        }
        return i;
    }
}
