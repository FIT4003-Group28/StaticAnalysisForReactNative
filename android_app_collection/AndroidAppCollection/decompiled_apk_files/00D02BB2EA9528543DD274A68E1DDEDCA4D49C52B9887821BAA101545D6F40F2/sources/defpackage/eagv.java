package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eagv  reason: default package */
/* loaded from: classes6.dex */
public final class eagv extends eaex {
    final /* synthetic */ int a;
    final /* synthetic */ eahe c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eagv(eahe eaheVar, Object[] objArr, int i) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.c = eaheVar;
        this.a = i;
    }

    @Override // defpackage.eaex
    public final void c() {
        synchronized (this.c) {
            this.c.s.remove(Integer.valueOf(this.a));
        }
    }
}
