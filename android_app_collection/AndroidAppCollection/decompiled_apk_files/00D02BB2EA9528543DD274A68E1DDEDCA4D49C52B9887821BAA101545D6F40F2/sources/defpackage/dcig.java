package defpackage;

import java.lang.ref.ReferenceQueue;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcig  reason: default package */
/* loaded from: classes.dex */
public final class dcig<K, V> implements dchw<K, V, dcih<K, V>, dcii<K, V>> {
    public static final dcig<?, ?> a = new dcig<>();

    @Override // defpackage.dchw
    public final dcic a() {
        return dcic.STRONG;
    }

    @Override // defpackage.dchw
    public final dcic b() {
        return dcic.WEAK;
    }

    @Override // defpackage.dchw
    public final /* bridge */ /* synthetic */ dchv c(dcia dciaVar, Object obj, int i, dchv dchvVar) {
        dcii dciiVar = (dcii) dciaVar;
        return new dcih(obj, i, (dcih) dchvVar);
    }

    @Override // defpackage.dchw
    public final /* bridge */ /* synthetic */ dchv d(dcia dciaVar, dchv dchvVar, dchv dchvVar2) {
        dcii dciiVar = (dcii) dciaVar;
        dcih dcihVar = (dcih) dchvVar;
        dcih dcihVar2 = (dcih) dchvVar2;
        if (dcia.k(dcihVar)) {
            return null;
        }
        ReferenceQueue<V> referenceQueue = dciiVar.h;
        dcih<K, V> dcihVar3 = new dcih<>(dcihVar.a, dcihVar.b, dcihVar2);
        dcihVar3.d = dcihVar.d.a(referenceQueue, dcihVar3);
        return dcihVar3;
    }

    @Override // defpackage.dchw
    public final /* bridge */ /* synthetic */ void e(dcia dciaVar, dchv dchvVar, Object obj) {
        dcih dcihVar = (dcih) dchvVar;
        ReferenceQueue<V> referenceQueue = ((dcii) dciaVar).h;
        dcis<K, V, dcih<K, V>> dcisVar = dcihVar.d;
        dcihVar.d = new dcit(referenceQueue, obj, dcihVar);
        dcisVar.clear();
    }

    @Override // defpackage.dchw
    public final /* bridge */ /* synthetic */ dcia f(dciv dcivVar, int i) {
        return new dcii(dcivVar, i);
    }
}
