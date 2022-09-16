package defpackage;
/* compiled from: PG */
/* renamed from: dur  reason: default package */
/* loaded from: classes3.dex */
public final class dur extends dux {
    private final dtw h;
    private long i;

    public dur(dtq dtqVar, aopa aopaVar, int i, dtw dtwVar) {
        super(dtqVar, "yOElNmKLikQbWbYlZO7eS7cS10eTGa3vu7bY/6J83fArIj+16FMluTqHzp+DnExg", "vukmknkXmiaeXRGZhbZXDM0DkkvkO8XxmNkNdqrMEQc=", aopaVar, i, 53);
        this.h = dtwVar;
        if (dtwVar != null) {
            this.i = dtwVar.a();
        }
    }

    @Override // defpackage.dux
    protected final void a() {
        if (this.h != null) {
            aopa aopaVar = this.g;
            long longValue = ((Long) this.d.invoke(null, Long.valueOf(this.i))).longValue();
            aopaVar.copyOnWrite();
            dnw dnwVar = (dnw) aopaVar.instance;
            dnw dnwVar2 = dnw.a;
            dnwVar.c |= 16384;
            dnwVar.N = longValue;
        }
    }
}
