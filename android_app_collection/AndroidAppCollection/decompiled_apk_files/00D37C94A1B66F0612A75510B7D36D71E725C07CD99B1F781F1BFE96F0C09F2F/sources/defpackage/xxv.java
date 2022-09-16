package defpackage;
/* compiled from: PG */
/* renamed from: xxv  reason: default package */
/* loaded from: classes4.dex */
public final class xxv implements ajpy {
    public final Object a;
    public long b;

    public xxv(Object obj, long j) {
        this.a = obj;
        this.b = j;
    }

    @Override // defpackage.ajpy
    public final ajpy e(ajpy ajpyVar) {
        if (ajpyVar instanceof xxv) {
            xxv xxvVar = (xxv) ajpyVar;
            xxvVar.b = Math.max(this.b, xxvVar.b);
        }
        return ajpyVar;
    }
}
