package defpackage;
/* compiled from: PG */
/* renamed from: iyb  reason: default package */
/* loaded from: classes7.dex */
public class iyb implements jbi {
    private final CharSequence a;

    public iyb(CharSequence charSequence) {
        this.a = charSequence;
    }

    public boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof iyb) {
            return this.a.toString().contentEquals(((iyb) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.toString().hashCode();
    }

    @Override // defpackage.jbi
    public CharSequence m() {
        return this.a;
    }
}
