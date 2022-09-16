package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcde  reason: default package */
/* loaded from: classes.dex */
public class dcde<K, V> extends dced<K, V> implements dcha<K, V> {
    private static final long serialVersionUID = 0;

    public dcde(dcdn<K, dcdc<V>> dcdnVar, int i) {
        super(dcdnVar, i);
    }

    public static <K, V> dcdd<K, V> a() {
        return new dcdd<>();
    }

    public static <K, V> dcde<K, V> b(dcka<? extends K, ? extends V> dckaVar) {
        if (dckaVar.D()) {
            return dcax.a;
        }
        if (dckaVar instanceof dcde) {
            dcde<K, V> dcdeVar = (dcde) dckaVar;
            if (!dcdeVar.o()) {
                return dcdeVar;
            }
        }
        return i(dckaVar.L().entrySet());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> dcde<K, V> i(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection) {
        if (collection.isEmpty()) {
            return dcax.a;
        }
        dcdg dcdgVar = new dcdg(collection.size());
        int i = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            dcdc r = dcdc.r(entry.getValue());
            if (!r.isEmpty()) {
                dcdgVar.f(key, r);
                i += r.size();
            }
        }
        return new dcde<>(dcdgVar.b(), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Invalid key count ");
            sb.append(readInt);
            throw new InvalidObjectException(sb.toString());
        }
        dcdg p = dcdn.p();
        int i = 0;
        for (int i2 = 0; i2 < readInt; i2++) {
            Object readObject = objectInputStream.readObject();
            int readInt2 = objectInputStream.readInt();
            if (readInt2 > 0) {
                dccx F = dcdc.F();
                for (int i3 = 0; i3 < readInt2; i3++) {
                    F.g(objectInputStream.readObject());
                }
                p.f(readObject, F.f());
                i += readInt2;
            } else {
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Invalid value count ");
                sb2.append(readInt2);
                throw new InvalidObjectException(sb2.toString());
            }
        }
        try {
            dceb.a.a(this, p.b());
            dceb.b.b(this, i);
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        dcmz.c(this, objectOutputStream);
    }

    @Override // defpackage.dcha
    @Deprecated
    public final /* bridge */ /* synthetic */ List d(Object obj) {
        throw null;
    }

    @Override // defpackage.dcha
    @Deprecated
    public final /* bridge */ /* synthetic */ List e(Object obj, Iterable iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dced
    /* renamed from: g */
    public final dcdc<V> h(K k) {
        dcdc<V> dcdcVar = (dcdc) this.b.get(k);
        return dcdcVar == null ? dcdc.e() : dcdcVar;
    }
}
