package defpackage;
/* compiled from: PG */
/* renamed from: jey  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jey implements azqb {
    public final /* synthetic */ jfa a;
    private final /* synthetic */ int b;

    public /* synthetic */ jey(jfa jfaVar, int i) {
        this.b = i;
        this.a = jfaVar;
    }

    @Override // defpackage.azqb
    public final Object get() {
        if (this.b == 0) {
            return Boolean.valueOf(Boolean.FALSE.equals(this.a.p));
        }
        jfa jfaVar = this.a;
        return Boolean.valueOf(((agrf) jfaVar.e.get()).a().i().a(jfaVar.h) > 0);
    }
}
