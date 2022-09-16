package defpackage;
/* compiled from: PG */
/* renamed from: atsv  reason: default package */
/* loaded from: classes2.dex */
public final class atsv<T> extends btrh<T> {
    public atsv(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    public static void b(btrm btrmVar, Object obj) {
        btrmVar.a(obj);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        atst atstVar = (atst) this.a;
        crqw crqwVar = ((crht) obj).a;
        atsu atsuVar = atstVar.a;
        crqw crqwVar2 = atsuVar.e;
        if (crqwVar != crqwVar2 || ((crqy) crqwVar2).g == 1) {
            return;
        }
        atsuVar.d(true);
        atsu atsuVar2 = atstVar.a;
        if (atsuVar2.b) {
            return;
        }
        atsuVar2.a = false;
        b(atsuVar2.g, atstVar);
    }
}
