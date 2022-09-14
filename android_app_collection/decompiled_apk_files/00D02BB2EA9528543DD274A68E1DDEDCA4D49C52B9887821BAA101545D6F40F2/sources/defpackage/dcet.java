package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dcet  reason: default package */
/* loaded from: classes.dex */
public class dcet<K, V> extends dced<K, V> implements dcna<K, V> {
    private static final long serialVersionUID = 0;
    private final transient dcep<V> a;
    public transient dcet<V, K> d;
    private transient dcep<Map.Entry<K, V>> e;

    public dcet(dcdn<K, dcep<V>> dcdnVar, int i) {
        super(dcdnVar, i);
        this.a = B(null);
    }

    @Deprecated
    public static final dcep<V> A() {
        throw new UnsupportedOperationException();
    }

    private static <V> dcep<V> B(Comparator<? super V> comparator) {
        if (comparator == null) {
            return dcmr.a;
        }
        return dcfc.P(comparator);
    }

    public static <K, V> dceq<K, V> a() {
        return new dceq<>();
    }

    public static <K, V> dcet<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        dceq dceqVar = new dceq();
        for (Map.Entry<? extends K, ? extends V> entry : iterable) {
            dceqVar.h(entry.getKey(), entry.getValue());
        }
        return dceqVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        dcen dcfaVar;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
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
                if (comparator == null) {
                    dcfaVar = new dcen();
                } else {
                    dcfaVar = new dcfa(comparator);
                }
                for (int i3 = 0; i3 < readInt2; i3++) {
                    dcfaVar.b(objectInputStream.readObject());
                }
                dcep f = dcfaVar.f();
                if (f.size() == readInt2) {
                    p.f(readObject, f);
                    i += readInt2;
                } else {
                    String valueOf = String.valueOf(readObject);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 40);
                    sb2.append("Duplicate key-value pairs exist for key ");
                    sb2.append(valueOf);
                    throw new InvalidObjectException(sb2.toString());
                }
            } else {
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Invalid value count ");
                sb3.append(readInt2);
                throw new InvalidObjectException(sb3.toString());
            }
        }
        try {
            dceb.a.a(this, p.b());
            dceb.b.b(this, i);
            dces.a.a(this, B(comparator));
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        dcep<V> dcepVar = this.a;
        objectOutputStream.writeObject(dcepVar instanceof dcfc ? ((dcfc) dcepVar).b : null);
        dcmz.c(this, objectOutputStream);
    }

    @Override // defpackage.dcna
    @Deprecated
    public final /* bridge */ /* synthetic */ Set e(Object obj) {
        return A();
    }

    @Override // defpackage.dced
    /* renamed from: g */
    public final dcep<V> h(K k) {
        return (dcep) dbsc.a((dcep) this.b.get(k), this.a);
    }

    @Override // defpackage.dced
    /* renamed from: i */
    public final dcep<Map.Entry<K, V>> s() {
        dcep<Map.Entry<K, V>> dcepVar = this.e;
        if (dcepVar == null) {
            dcer dcerVar = new dcer(this);
            this.e = dcerVar;
            return dcerVar;
        }
        return dcepVar;
    }
}
