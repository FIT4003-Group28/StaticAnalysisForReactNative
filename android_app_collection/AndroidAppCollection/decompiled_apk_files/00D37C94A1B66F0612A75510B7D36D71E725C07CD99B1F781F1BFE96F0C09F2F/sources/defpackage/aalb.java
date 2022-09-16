package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: aalb  reason: default package */
/* loaded from: classes.dex */
public final class aalb {
    public final int a;
    public final int b;
    private final zer c;

    public aalb(Uri uri, int i, int i2) {
        uri.getClass();
        this.c = new aala(uri);
        this.a = i;
        this.b = i2;
    }

    public final Uri a() {
        return (Uri) this.c.get();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aalb) {
            aalb aalbVar = (aalb) obj;
            if (this.c.get() == null) {
                return aalbVar.c.get() == null;
            } else if (((Uri) this.c.get()).equals(aalbVar.c.get()) && this.a == aalbVar.a && this.b == aalbVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.c.get() == null ? 0 : ((Uri) this.c.get()).hashCode()) + 31) * 31) + this.a) * 31) + this.b;
    }

    public aalb(avhm avhmVar) {
        avhmVar.getClass();
        this.c = new aakz(avhmVar.c);
        this.a = avhmVar.d;
        this.b = avhmVar.e;
    }
}
