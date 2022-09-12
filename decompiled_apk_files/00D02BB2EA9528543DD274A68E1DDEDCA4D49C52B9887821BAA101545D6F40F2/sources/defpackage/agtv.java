package defpackage;
/* compiled from: PG */
/* renamed from: agtv  reason: default package */
/* loaded from: classes2.dex */
class agtv implements jbi {
    private final CharSequence a;
    private final agtu b;

    public agtv(CharSequence charSequence, agtu agtuVar) {
        this.a = charSequence;
        this.b = agtuVar;
    }

    public int hashCode() {
        return this.b.ordinal();
    }

    @Override // defpackage.jbi
    public CharSequence m() {
        return this.a;
    }
}
