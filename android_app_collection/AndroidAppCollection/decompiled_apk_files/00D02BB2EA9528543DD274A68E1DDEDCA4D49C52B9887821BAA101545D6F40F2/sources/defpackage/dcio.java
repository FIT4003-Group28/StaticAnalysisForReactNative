package defpackage;

import java.lang.ref.ReferenceQueue;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcio  reason: default package */
/* loaded from: classes5.dex */
public final class dcio<K, V> implements dchw<K, V, dcip<K, V>, dciq<K, V>> {
    public static final dcio<?, ?> a = new dcio<>();

    @Override // defpackage.dchw
    public final dcic a() {
        return dcic.WEAK;
    }

    @Override // defpackage.dchw
    public final dcic b() {
        return dcic.WEAK;
    }

    @Override // defpackage.dchw
    public final /* bridge */ /* synthetic */ dchv c(dcia dciaVar, Object obj, int i, dchv dchvVar) {
        return new dcip(((dciq) dciaVar).h, obj, i, (dcip) dchvVar);
    }

    @Override // defpackage.dchw
    public final /* bridge */ /* synthetic */ dchv d(dcia dciaVar, dchv dchvVar, dchv dchvVar2) {
        dciq dciqVar = (dciq) dciaVar;
        dcip dcipVar = (dcip) dchvVar;
        dcip dcipVar2 = (dcip) dchvVar2;
        if (dcipVar.get() != null && !dcia.k(dcipVar)) {
            ReferenceQueue<K> referenceQueue = dciqVar.h;
            ReferenceQueue<V> referenceQueue2 = dciqVar.i;
            dcip<K, V> dcipVar3 = new dcip<>(referenceQueue, dcipVar.get(), dcipVar.a, dcipVar2);
            dcipVar3.c = dcipVar.c.a(referenceQueue2, dcipVar3);
            return dcipVar3;
        }
        return null;
    }

    @Override // defpackage.dchw
    public final /* bridge */ /* synthetic */ void e(dcia dciaVar, dchv dchvVar, Object obj) {
        dcip dcipVar = (dcip) dchvVar;
        ReferenceQueue<V> referenceQueue = ((dciq) dciaVar).i;
        dcis<K, V, dcip<K, V>> dcisVar = dcipVar.c;
        dcipVar.c = new dcit(referenceQueue, obj, dcipVar);
        dcisVar.clear();
    }

    @Override // defpackage.dchw
    public final /* bridge */ /* synthetic */ dcia f(dciv dcivVar, int i) {
        return new dciq(dcivVar, i);
    }
}
