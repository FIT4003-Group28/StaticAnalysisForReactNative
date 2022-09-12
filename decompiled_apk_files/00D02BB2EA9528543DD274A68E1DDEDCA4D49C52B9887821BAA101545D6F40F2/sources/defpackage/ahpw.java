package defpackage;
/* compiled from: PG */
/* renamed from: ahpw  reason: default package */
/* loaded from: classes2.dex */
public final class ahpw<T> extends btrh<T> {
    public ahpw(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        ahoi ahoiVar;
        ahpv ahpvVar = (ahpv) this.a;
        if (!((crmi) obj).a || (ahoiVar = ahpvVar.a) == null || !ahoiVar.d()) {
            return;
        }
        ahoi ahoiVar2 = ahpvVar.a;
        if (!ahoiVar2.d()) {
            return;
        }
        ahoiVar2.nativeDidReroute(ahoiVar2.c);
    }
}
