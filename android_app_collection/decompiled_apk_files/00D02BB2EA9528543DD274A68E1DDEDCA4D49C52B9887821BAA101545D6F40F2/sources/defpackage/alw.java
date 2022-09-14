package defpackage;
/* compiled from: PG */
/* renamed from: alw  reason: default package */
/* loaded from: classes2.dex */
final class alw implements alx {
    static final alw a = new alw();

    private alw() {
    }

    @Override // defpackage.alx
    public final int a(CharSequence charSequence, int i) {
        int i2 = 2;
        for (int i3 = 0; i3 < i && i2 == 2; i3++) {
            i2 = ama.b(Character.getDirectionality(charSequence.charAt(i3)));
        }
        return i2;
    }
}
