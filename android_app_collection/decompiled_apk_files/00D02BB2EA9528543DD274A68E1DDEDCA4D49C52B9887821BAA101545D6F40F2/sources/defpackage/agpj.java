package defpackage;
/* compiled from: PG */
/* renamed from: agpj  reason: default package */
/* loaded from: classes2.dex */
class agpj implements agpi {
    private final cqix<?> a;

    public agpj(cqix<?> cqixVar) {
        this.a = cqixVar;
    }

    @Override // defpackage.agpi
    public cqix<?> a() {
        return this.a;
    }

    public boolean equals(@dzsi Object obj) {
        return (obj instanceof agpj) && this.a.equals(((agpj) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
