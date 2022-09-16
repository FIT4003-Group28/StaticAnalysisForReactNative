package defpackage;
/* compiled from: PG */
/* renamed from: iay  reason: default package */
/* loaded from: classes3.dex */
final class iay implements ajyi {
    final /* synthetic */ ajsa a;
    final /* synthetic */ ajry b;

    public iay(ajsa ajsaVar, ajry ajryVar) {
        this.a = ajsaVar;
        this.b = ajryVar;
    }

    @Override // defpackage.ajyi
    public final void a(Class cls) {
        if (aten.class.isAssignableFrom(cls)) {
            this.a.f(aten.class, this.b);
        }
    }

    @Override // defpackage.amqo
    public final /* bridge */ /* synthetic */ Object get() {
        return this.a;
    }
}
