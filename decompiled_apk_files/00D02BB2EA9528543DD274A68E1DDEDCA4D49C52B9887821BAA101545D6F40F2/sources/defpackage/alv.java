package defpackage;
/* compiled from: PG */
/* renamed from: alv  reason: default package */
/* loaded from: classes2.dex */
final class alv implements alx {
    static final alv a = new alv();

    private alv() {
    }

    @Override // defpackage.alx
    public final int a(CharSequence charSequence, int i) {
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            int a2 = ama.a(Character.getDirectionality(charSequence.charAt(i2)));
            if (a2 == 0) {
                return 0;
            }
            if (a2 == 1) {
                z = true;
            }
        }
        return z ? 1 : 2;
    }
}
