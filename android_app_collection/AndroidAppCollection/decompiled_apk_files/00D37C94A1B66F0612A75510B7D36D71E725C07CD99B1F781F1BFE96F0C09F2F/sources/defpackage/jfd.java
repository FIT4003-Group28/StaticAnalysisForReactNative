package defpackage;
/* compiled from: PG */
/* renamed from: jfd  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jfd implements azqb {
    public final /* synthetic */ jff a;
    private final /* synthetic */ int b;

    public /* synthetic */ jfd(jff jffVar, int i) {
        this.b = i;
        this.a = jffVar;
    }

    @Override // defpackage.azqb
    public final Object get() {
        if (this.b == 0) {
            jff jffVar = this.a;
            return Boolean.valueOf(((agrf) jffVar.e.get()).a().i().a(jffVar.h) > 0);
        }
        return Boolean.valueOf(Boolean.FALSE.equals(this.a.p));
    }
}
