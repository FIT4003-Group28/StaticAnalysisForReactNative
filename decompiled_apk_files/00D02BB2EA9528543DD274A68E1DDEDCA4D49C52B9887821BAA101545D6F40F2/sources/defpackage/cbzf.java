package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cbzf  reason: default package */
/* loaded from: classes4.dex */
public abstract class cbzf implements cbzj {
    private static void f(boolean z, int i, String str, int i2, int i3, cbzi cbziVar) {
        if (i3 == i2 || z) {
            return;
        }
        cbziVar.a(i2 - i, i3, str.substring(i2, i3));
    }

    @Override // defpackage.cbzj
    public final void a(String str, cbzi cbziVar) {
        boolean z = false;
        int i = 0;
        int i2 = 0;
        boolean z2 = true;
        int i3 = 0;
        boolean z3 = true;
        while (i2 < str.length()) {
            int codePointAt = str.codePointAt(i2);
            int charCount = Character.charCount(codePointAt);
            if (z) {
                if (c(codePointAt)) {
                    if (!b(codePointAt)) {
                        z2 = false;
                    }
                } else {
                    f(z2, i3, str, i, i2, cbziVar);
                    i = i2;
                    z = false;
                }
            } else if (!z3 || !d(codePointAt)) {
                z3 = e(codePointAt);
            } else {
                i = i2 + charCount;
                i3 = charCount;
                z = true;
                z2 = true;
                z3 = true;
            }
            i2 += charCount;
        }
        if (z) {
            f(z2, i3, str, i, str.length(), cbziVar);
        }
    }

    protected abstract boolean b(int i);
}
