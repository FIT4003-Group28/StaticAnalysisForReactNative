package defpackage;
/* compiled from: PG */
/* renamed from: aqi  reason: default package */
/* loaded from: classes2.dex */
final class aqi extends aqx {
    final String a;
    final aqh b;

    public aqi(String str, aqh aqhVar) {
        this.a = str;
        this.b = aqhVar;
    }

    @Override // defpackage.aqx
    public final void a(int i) {
        aqh aqhVar;
        String str = this.a;
        if (str == null || (aqhVar = this.b) == null) {
            return;
        }
        aqhVar.d(str, i);
    }

    @Override // defpackage.aqx
    public final void b(int i) {
        aqh aqhVar;
        String str = this.a;
        if (str == null || (aqhVar = this.b) == null) {
            return;
        }
        aqhVar.e(str, i);
    }
}
