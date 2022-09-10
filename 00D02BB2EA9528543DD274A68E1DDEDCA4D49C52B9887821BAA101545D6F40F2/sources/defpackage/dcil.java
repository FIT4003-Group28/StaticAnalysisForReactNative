package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcil  reason: default package */
/* loaded from: classes.dex */
public final class dcil<K, V> implements dchw<K, V, dcim<K, V>, dcin<K, V>> {
    public static final dcil<?, ?> a = new dcil<>();

    @Override // defpackage.dchw
    public final dcic a() {
        return dcic.WEAK;
    }

    @Override // defpackage.dchw
    public final dcic b() {
        return dcic.STRONG;
    }

    @Override // defpackage.dchw
    public final /* bridge */ /* synthetic */ dchv c(dcia dciaVar, Object obj, int i, dchv dchvVar) {
        return new dcim(((dcin) dciaVar).h, obj, i, (dcim) dchvVar);
    }

    @Override // defpackage.dchw
    public final /* bridge */ /* synthetic */ dchv d(dcia dciaVar, dchv dchvVar, dchv dchvVar2) {
        dcin dcinVar = (dcin) dciaVar;
        dcim dcimVar = (dcim) dchvVar;
        dcim dcimVar2 = (dcim) dchvVar2;
        if (dcimVar.get() == null) {
            return null;
        }
        dcim dcimVar3 = new dcim(dcinVar.h, dcimVar.get(), dcimVar.a, dcimVar2);
        dcimVar3.c = dcimVar.c;
        return dcimVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dchw
    public final /* bridge */ /* synthetic */ void e(dcia dciaVar, dchv dchvVar, Object obj) {
        dcin dcinVar = (dcin) dciaVar;
        ((dcim) dchvVar).c = obj;
    }

    @Override // defpackage.dchw
    public final /* bridge */ /* synthetic */ dcia f(dciv dcivVar, int i) {
        return new dcin(dcivVar, i);
    }
}
