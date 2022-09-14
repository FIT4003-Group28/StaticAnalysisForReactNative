package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dguv  reason: default package */
/* loaded from: classes6.dex */
public final class dguv<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator<Comparable> f = new dguo();
    final Comparator<? super K> a;
    dguu<K, V> b;
    int c;
    int d;
    final dguu<K, V> e;
    private dguq g;
    private dgus h;

    public dguv() {
        Comparator<Comparable> comparator = f;
        this.c = 0;
        this.d = 0;
        this.e = new dguu<>();
        this.a = comparator;
    }

    private final void f(dguu<K, V> dguuVar, dguu<K, V> dguuVar2) {
        dguu<K, V> dguuVar3 = dguuVar.a;
        dguuVar.a = null;
        if (dguuVar2 != null) {
            dguuVar2.a = dguuVar3;
        }
        if (dguuVar3 == null) {
            this.b = dguuVar2;
        } else if (dguuVar3.b == dguuVar) {
            dguuVar3.b = dguuVar2;
        } else {
            dguuVar3.c = dguuVar2;
        }
    }

    private final void g(dguu<K, V> dguuVar, boolean z) {
        while (dguuVar != null) {
            dguu<K, V> dguuVar2 = dguuVar.b;
            dguu<K, V> dguuVar3 = dguuVar.c;
            int i = 0;
            int i2 = dguuVar2 != null ? dguuVar2.h : 0;
            int i3 = dguuVar3 != null ? dguuVar3.h : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                dguu<K, V> dguuVar4 = dguuVar3.b;
                dguu<K, V> dguuVar5 = dguuVar3.c;
                int i5 = dguuVar5 != null ? dguuVar5.h : 0;
                if (dguuVar4 != null) {
                    i = dguuVar4.h;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    h(dguuVar);
                } else {
                    i(dguuVar3);
                    h(dguuVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                dguu<K, V> dguuVar6 = dguuVar2.b;
                dguu<K, V> dguuVar7 = dguuVar2.c;
                int i7 = dguuVar7 != null ? dguuVar7.h : 0;
                if (dguuVar6 != null) {
                    i = dguuVar6.h;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    i(dguuVar);
                } else {
                    h(dguuVar2);
                    i(dguuVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                dguuVar.h = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                dguuVar.h = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            dguuVar = dguuVar.a;
        }
    }

    private final void h(dguu<K, V> dguuVar) {
        dguu<K, V> dguuVar2 = dguuVar.b;
        dguu<K, V> dguuVar3 = dguuVar.c;
        dguu<K, V> dguuVar4 = dguuVar3.b;
        dguu<K, V> dguuVar5 = dguuVar3.c;
        dguuVar.c = dguuVar4;
        if (dguuVar4 != null) {
            dguuVar4.a = dguuVar;
        }
        f(dguuVar, dguuVar3);
        dguuVar3.b = dguuVar;
        dguuVar.a = dguuVar3;
        int i = 0;
        int max = Math.max(dguuVar2 != null ? dguuVar2.h : 0, dguuVar4 != null ? dguuVar4.h : 0) + 1;
        dguuVar.h = max;
        if (dguuVar5 != null) {
            i = dguuVar5.h;
        }
        dguuVar3.h = Math.max(max, i) + 1;
    }

    private final void i(dguu<K, V> dguuVar) {
        dguu<K, V> dguuVar2 = dguuVar.b;
        dguu<K, V> dguuVar3 = dguuVar.c;
        dguu<K, V> dguuVar4 = dguuVar2.b;
        dguu<K, V> dguuVar5 = dguuVar2.c;
        dguuVar.b = dguuVar5;
        if (dguuVar5 != null) {
            dguuVar5.a = dguuVar;
        }
        f(dguuVar, dguuVar2);
        dguuVar2.c = dguuVar;
        dguuVar.a = dguuVar2;
        int i = 0;
        int max = Math.max(dguuVar3 != null ? dguuVar3.h : 0, dguuVar5 != null ? dguuVar5.h : 0) + 1;
        dguuVar.h = max;
        if (dguuVar4 != null) {
            i = dguuVar4.h;
        }
        dguuVar2.h = Math.max(max, i) + 1;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    final dguu<K, V> a(K k, boolean z) {
        int i;
        dguu<K, V> dguuVar;
        Comparator<? super K> comparator = this.a;
        dguu<K, V> dguuVar2 = this.b;
        if (dguuVar2 != null) {
            Comparable comparable = comparator == f ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(dguuVar2.f);
                } else {
                    i = comparator.compare(k, (K) dguuVar2.f);
                }
                if (i == 0) {
                    return dguuVar2;
                }
                dguu<K, V> dguuVar3 = i < 0 ? dguuVar2.b : dguuVar2.c;
                if (dguuVar3 == null) {
                    break;
                }
                dguuVar2 = dguuVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        dguu<K, V> dguuVar4 = this.e;
        if (dguuVar2 == null) {
            if (comparator != f || (k instanceof Comparable)) {
                dguuVar = new dguu<>(null, k, dguuVar4, dguuVar4.e);
                this.b = dguuVar;
            } else {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
        } else {
            dguuVar = new dguu<>(dguuVar2, k, dguuVar4, dguuVar4.e);
            if (i < 0) {
                dguuVar2.b = dguuVar;
            } else {
                dguuVar2.c = dguuVar;
            }
            g(dguuVar2, true);
        }
        this.c++;
        this.d++;
        return dguuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final dguu<K, V> b(Object obj) {
        if (obj != 0) {
            try {
                return a(obj, false);
            } catch (ClassCastException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dguu<K, V> c(Map.Entry<?, ?> entry) {
        dguu<K, V> b = b(entry.getKey());
        if (b != null) {
            V v = b.g;
            Object value = entry.getValue();
            if (v != value && (v == null || !v.equals(value))) {
                return null;
            }
            return b;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.b = null;
        this.c = 0;
        this.d++;
        dguu<K, V> dguuVar = this.e;
        dguuVar.e = dguuVar;
        dguuVar.d = dguuVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return b(obj) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(dguu<K, V> dguuVar, boolean z) {
        dguu<K, V> dguuVar2;
        dguu<K, V> dguuVar3;
        int i;
        if (z) {
            dguu<K, V> dguuVar4 = dguuVar.e;
            dguuVar4.d = dguuVar.d;
            dguuVar.d.e = dguuVar4;
        }
        dguu<K, V> dguuVar5 = dguuVar.b;
        dguu<K, V> dguuVar6 = dguuVar.c;
        dguu<K, V> dguuVar7 = dguuVar.a;
        int i2 = 0;
        if (dguuVar5 == null || dguuVar6 == null) {
            if (dguuVar5 != null) {
                f(dguuVar, dguuVar5);
                dguuVar.b = null;
            } else if (dguuVar6 != null) {
                f(dguuVar, dguuVar6);
                dguuVar.c = null;
            } else {
                f(dguuVar, null);
            }
            g(dguuVar7, false);
            this.c--;
            this.d++;
            return;
        }
        if (dguuVar5.h > dguuVar6.h) {
            do {
                dguuVar3 = dguuVar5;
                dguuVar5 = dguuVar5.c;
            } while (dguuVar5 != null);
        } else {
            do {
                dguuVar2 = dguuVar6;
                dguuVar6 = dguuVar6.b;
            } while (dguuVar6 != null);
            dguuVar3 = dguuVar2;
        }
        d(dguuVar3, false);
        dguu<K, V> dguuVar8 = dguuVar.b;
        if (dguuVar8 != null) {
            i = dguuVar8.h;
            dguuVar3.b = dguuVar8;
            dguuVar8.a = dguuVar3;
            dguuVar.b = null;
        } else {
            i = 0;
        }
        dguu<K, V> dguuVar9 = dguuVar.c;
        if (dguuVar9 != null) {
            i2 = dguuVar9.h;
            dguuVar3.c = dguuVar9;
            dguuVar9.a = dguuVar3;
            dguuVar.c = null;
        }
        dguuVar3.h = Math.max(i, i2) + 1;
        f(dguuVar, dguuVar3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dguu<K, V> e(Object obj) {
        dguu<K, V> b = b(obj);
        if (b != null) {
            d(b, true);
        }
        return b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        dguq dguqVar = this.g;
        if (dguqVar != null) {
            return dguqVar;
        }
        dguq dguqVar2 = new dguq(this);
        this.g = dguqVar2;
        return dguqVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        dguu<K, V> b = b(obj);
        if (b != null) {
            return b.g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        dgus dgusVar = this.h;
        if (dgusVar != null) {
            return dgusVar;
        }
        dgus dgusVar2 = new dgus(this);
        this.h = dgusVar2;
        return dgusVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        dguu<K, V> e = e(obj);
        if (e != null) {
            return e.g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        dguu<K, V> a = a(k, true);
        V v2 = a.g;
        a.g = v;
        return v2;
    }
}
