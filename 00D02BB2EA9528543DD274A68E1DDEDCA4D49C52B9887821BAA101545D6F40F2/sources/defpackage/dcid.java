package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcid  reason: default package */
/* loaded from: classes5.dex */
public final class dcid<K, V> implements dchw<K, V, dcie<K, V>, dcif<K, V>> {
    public static final dcid<?, ?> a = new dcid<>();

    @Override // defpackage.dchw
    public final dcic a() {
        return dcic.STRONG;
    }

    @Override // defpackage.dchw
    public final dcic b() {
        return dcic.STRONG;
    }

    @Override // defpackage.dchw
    public final /* bridge */ /* synthetic */ dchv c(dcia dciaVar, Object obj, int i, dchv dchvVar) {
        dcif dcifVar = (dcif) dciaVar;
        return new dcie(obj, i, (dcie) dchvVar);
    }

    @Override // defpackage.dchw
    public final /* bridge */ /* synthetic */ dchv d(dcia dciaVar, dchv dchvVar, dchv dchvVar2) {
        dcif dcifVar = (dcif) dciaVar;
        dcie dcieVar = (dcie) dchvVar;
        dcie dcieVar2 = new dcie(dcieVar.a, dcieVar.b, (dcie) dchvVar2);
        dcieVar2.d = dcieVar.d;
        return dcieVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dchw
    public final /* bridge */ /* synthetic */ void e(dcia dciaVar, dchv dchvVar, Object obj) {
        dcif dcifVar = (dcif) dciaVar;
        ((dcie) dchvVar).d = obj;
    }

    @Override // defpackage.dchw
    public final /* bridge */ /* synthetic */ dcia f(dciv dcivVar, int i) {
        return new dcif(dcivVar, i);
    }
}
