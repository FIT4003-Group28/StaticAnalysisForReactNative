package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: dcex  reason: default package */
/* loaded from: classes5.dex */
final class dcex<K, V> extends dcdm<K, V> {
    private static final long serialVersionUID = 0;
    private final Comparator<? super K> a;

    public dcex(dcey<K, V> dceyVar) {
        super(dceyVar);
        this.a = dceyVar.comparator();
    }

    @Override // defpackage.dcdm
    public final /* bridge */ /* synthetic */ dcdg a(int i) {
        return new dcew(this.a);
    }
}
