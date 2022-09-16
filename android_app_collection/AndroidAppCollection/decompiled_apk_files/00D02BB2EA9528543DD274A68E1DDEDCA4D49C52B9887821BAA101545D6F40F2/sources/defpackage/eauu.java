package defpackage;
/* compiled from: PG */
/* renamed from: eauu  reason: default package */
/* loaded from: classes6.dex */
final class eauu implements eaus {
    private final String a;

    public eauu(String str) {
        this.a = str;
    }

    @Override // defpackage.eaus
    public final int a(int i) {
        return this.a.length();
    }

    @Override // defpackage.eaus
    public final void b(StringBuffer stringBuffer, int i) {
        stringBuffer.append(this.a);
    }
}
