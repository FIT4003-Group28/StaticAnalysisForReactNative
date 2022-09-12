package defpackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcew  reason: default package */
/* loaded from: classes5.dex */
public final class dcew<K, V> extends dcdg<K, V> {
    private transient Object[] c;
    private transient Object[] d;
    private final Comparator<? super K> e;

    public dcew(Comparator<? super K> comparator) {
        dbsk.s(comparator);
        this.e = comparator;
        this.c = new Object[4];
        this.d = new Object[4];
    }

    @Override // defpackage.dcdg
    public final /* bridge */ /* synthetic */ dcdn b() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return new dcey(new dcms(dcdc.f(this.c[0]), this.e), dcdc.f(this.d[0]));
            }
            Object[] copyOf = Arrays.copyOf(this.c, i);
            Arrays.sort(copyOf, this.e);
            Object[] objArr = new Object[this.b];
            for (int i2 = 0; i2 < this.b; i2++) {
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (this.e.compare(copyOf[i3], copyOf[i2]) == 0) {
                        String valueOf = String.valueOf(copyOf[i3]);
                        String valueOf2 = String.valueOf(copyOf[i2]);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
                        sb.append("keys required to be distinct but compared as equal: ");
                        sb.append(valueOf);
                        sb.append(" and ");
                        sb.append(valueOf2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                objArr[Arrays.binarySearch(copyOf, this.c[i2], this.e)] = this.d[i2];
            }
            return new dcey(new dcms(dcdc.B(copyOf), this.e), dcdc.B(objArr));
        }
        return dcey.e(this.e);
    }

    @Override // defpackage.dcdg
    public final /* bridge */ /* synthetic */ dcdg c(Map map) {
        super.c(map);
        return this;
    }

    @Override // defpackage.dcdg
    public final /* bridge */ /* synthetic */ void e(Iterable iterable) {
        super.e(iterable);
    }

    @Override // defpackage.dcdg
    public final /* bridge */ /* synthetic */ void f(Object obj, Object obj2) {
        int i = this.b + 1;
        int length = this.c.length;
        if (i > length) {
            int e = dccq.e(length, i);
            this.c = Arrays.copyOf(this.c, e);
            this.d = Arrays.copyOf(this.d, e);
        }
        dbzb.a(obj, obj2);
        Object[] objArr = this.c;
        int i2 = this.b;
        objArr[i2] = obj;
        this.d[i2] = obj2;
        this.b = i2 + 1;
    }
}
