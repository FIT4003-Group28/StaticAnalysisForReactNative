package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: uve  reason: default package */
/* loaded from: classes4.dex */
public final class uve {
    public final azzj a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final azyz f;
    public final String g;
    public final azzk h;

    public uve(azzj azzjVar, Long l, Long l2, Long l3, Long l4, azyz azyzVar, String str, azzk azzkVar) {
        this.a = azzjVar;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = l4;
        this.f = azyzVar;
        this.g = str;
        this.h = azzkVar;
    }

    public final String toString() {
        return String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", this.b, this.c, this.d, this.e, this.g);
    }
}
