package defpackage;
/* compiled from: PG */
/* renamed from: agcw  reason: default package */
/* loaded from: classes2.dex */
class agcw implements agcv {
    private final cqix<?> a;

    public agcw(cqix<?> cqixVar) {
        this.a = cqixVar;
    }

    @Override // defpackage.agcv
    public cqix<?> a() {
        return this.a;
    }

    public boolean equals(@dzsi Object obj) {
        return (obj instanceof agcw) && this.a.equals(((agcw) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
