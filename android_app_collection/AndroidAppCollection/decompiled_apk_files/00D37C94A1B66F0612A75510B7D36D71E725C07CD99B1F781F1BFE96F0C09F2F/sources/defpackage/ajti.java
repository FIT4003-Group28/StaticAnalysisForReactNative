package defpackage;
/* compiled from: PG */
/* renamed from: ajti  reason: default package */
/* loaded from: classes.dex */
public final class ajti {
    public final ajru a;
    public final long b;
    public final Runnable c;
    public final Runnable d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public ajti() {
    }

    public ajti(ajru ajruVar, long j, Runnable runnable, Runnable runnable2, int i, int i2, int i3, int i4) {
        this.a = ajruVar;
        this.b = j;
        this.c = runnable;
        this.d = runnable2;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static ajth a() {
        return new ajth();
    }

    public final ajti b(ajtg ajtgVar) {
        ajth a = a();
        a.g(this.a);
        a.f(this.c);
        a.e(this.d);
        a.b(ajtgVar.a);
        a.c(ajtgVar.b);
        a.d(ajtgVar.c);
        a.h(ajtgVar.d);
        a.i(ajtgVar.e);
        return a.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajti) {
            ajti ajtiVar = (ajti) obj;
            if (this.a.equals(ajtiVar.a) && this.b == ajtiVar.b && this.c.equals(ajtiVar.c) && this.d.equals(ajtiVar.d) && this.e == ajtiVar.e && this.f == ajtiVar.f && this.g == ajtiVar.g && this.h == ajtiVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return ((((((((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int i = this.e;
        int i2 = this.f;
        int i3 = this.g;
        int i4 = this.h;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 147 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("MoveParameters{presenter=");
        sb.append(valueOf);
        sb.append(", duration=");
        sb.append(j);
        sb.append(", onStart=");
        sb.append(valueOf2);
        sb.append(", onEnd=");
        sb.append(valueOf3);
        sb.append(", fromX=");
        sb.append(i);
        sb.append(", fromY=");
        sb.append(i2);
        sb.append(", toX=");
        sb.append(i3);
        sb.append(", toY=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
