package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bakn  reason: default package */
/* loaded from: classes2.dex */
public final class bakn extends bakr {
    public bakn(bahp bahpVar, int i) {
        super(bahpVar, i, false, i);
    }

    @Override // defpackage.bakq, defpackage.bala
    public final int c(bald baldVar, String str, int i) {
        int i2;
        char charAt;
        int c = super.c(baldVar, str, i);
        if (c >= 0 && c != (i2 = this.b + i)) {
            if (this.c && ((charAt = str.charAt(i)) == '-' || charAt == '+')) {
                i2++;
            }
            return c > i2 ? (i2 + 1) ^ (-1) : c < i2 ? c ^ (-1) : c;
        }
        return c;
    }
}
