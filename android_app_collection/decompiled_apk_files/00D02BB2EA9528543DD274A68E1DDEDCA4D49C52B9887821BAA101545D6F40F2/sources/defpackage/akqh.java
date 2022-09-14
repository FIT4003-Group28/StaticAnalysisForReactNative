package defpackage;
/* compiled from: PG */
/* renamed from: akqh  reason: default package */
/* loaded from: classes.dex */
public final class akqh extends akqi {
    public akqh(long j, long j2) {
        super(j, j2);
    }

    @dzsi
    public static akqh a(@dzsi String str) {
        akqi f = akqi.f(str);
        if (f != null) {
            return new akqh(f.b, f.c);
        }
        return null;
    }

    @Override // defpackage.akqi
    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof akqh) && this.c == ((akqh) obj).c;
    }

    @Override // defpackage.akqi
    public final int hashCode() {
        long j = this.c;
        return (int) (j ^ (j >>> 32));
    }
}
