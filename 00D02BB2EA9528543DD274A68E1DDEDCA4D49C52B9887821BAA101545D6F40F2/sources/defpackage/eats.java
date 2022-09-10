package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eats  reason: default package */
/* loaded from: classes.dex */
public final class eats extends eatw {
    public eats(eaop eaopVar, int i) {
        super(eaopVar, i, false, i);
    }

    @Override // defpackage.eatv, defpackage.eauf
    public final int e(eaui eauiVar, String str, int i) {
        int i2;
        char charAt;
        int e = super.e(eauiVar, str, i);
        if (e >= 0 && e != (i2 = this.b + i)) {
            if (this.c && ((charAt = str.charAt(i)) == '-' || charAt == '+')) {
                i2++;
            }
            return e > i2 ? (i2 + 1) ^ (-1) : e < i2 ? e ^ (-1) : e;
        }
        return e;
    }
}
