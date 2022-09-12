package defpackage;
/* compiled from: PG */
/* renamed from: cbzv  reason: default package */
/* loaded from: classes4.dex */
public final class cbzv implements cbzi {
    public boolean a = false;
    private final CharSequence b;

    public cbzv(CharSequence charSequence) {
        this.b = charSequence;
    }

    @Override // defpackage.cbzi
    public final void a(int i, int i2, String str) {
        boolean z = false;
        if (i == 0 && i2 == this.b.length()) {
            z = true;
        }
        this.a = z;
    }
}
