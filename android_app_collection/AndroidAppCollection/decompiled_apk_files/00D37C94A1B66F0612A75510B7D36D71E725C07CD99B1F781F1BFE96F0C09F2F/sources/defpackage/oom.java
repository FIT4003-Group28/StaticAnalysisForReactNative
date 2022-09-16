package defpackage;
/* compiled from: PG */
/* renamed from: oom  reason: default package */
/* loaded from: classes3.dex */
public final class oom implements amqo {
    final /* synthetic */ oon a;
    private final /* synthetic */ int b;

    public oom(oon oonVar) {
        this.a = oonVar;
    }

    public oom(oon oonVar, int i) {
        this.b = i;
        this.a = oonVar;
    }

    public final String a() {
        if (this.b == 0) {
            return String.valueOf(this.a.d.getPackageName()).concat(".api");
        }
        return alyz.a(this.a.d);
    }

    @Override // defpackage.amqo
    public final /* bridge */ /* synthetic */ Object get() {
        if (this.b == 0) {
            return a();
        }
        return a();
    }
}
