package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ddaz  reason: default package */
/* loaded from: classes5.dex */
public final class ddaz extends ddba {
    public ddaz(int i, int i2) {
        super(i, i2);
    }

    public final String toString() {
        dbsb d = dbsc.d("exponentialBackoff");
        d.f("firstDelayMs", this.b);
        d.d("multiplier", 2.0d);
        d.f("tries", this.a);
        return d.toString();
    }
}
