package defpackage;

import android.util.Pair;
import java.lang.ref.ReferenceQueue;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: zfi  reason: default package */
/* loaded from: classes4.dex */
public final class zfi extends AbstractMap implements Map {
    public zfg[] a;
    public volatile int b;
    private final ReferenceQueue c;
    private int d;
    private final int e;
    private int f;
    private Set g;
    private Collection h;
    private final ynh i;

    public zfi(ynh ynhVar) {
        aqxo.q(true, "capacity < 0: 256");
        this.i = ynhVar;
        this.d = 0;
        this.a = new zfg[256];
        this.e = 7500;
        d();
        this.c = new ReferenceQueue();
    }

    public static int a(Object obj) {
        int hashCode = obj.hashCode();
        int i = hashCode + ((hashCode << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    private final void d() {
        this.f = (int) ((this.a.length * this.e) / 10000);
    }

    private final void e() {
        HashSet<Pair> hashSet = null;
        while (true) {
            zfg zfgVar = (zfg) this.c.poll();
            if (zfgVar == null) {
                break;
            }
            if (hashSet == null) {
                hashSet = new HashSet();
            }
            hashSet.add(Pair.create(zfgVar, zfgVar.c));
            c(zfgVar);
        }
        if (hashSet == null || hashSet.isEmpty()) {
            return;
        }
        ynh ynhVar = this.i;
        ynhVar.a.d.writeLock().lock();
        try {
            for (Pair pair : hashSet) {
                Set<ynk> set = (Set) pair.second;
                if (set != null && !set.isEmpty()) {
                    for (ynk ynkVar : set) {
                        ynhVar.a.n(ynkVar);
                    }
                }
            }
        } finally {
            ynhVar.a.d.writeLock().unlock();
        }
    }

    public final zfg b(Object obj) {
        e();
        if (obj != null) {
            int a = a(obj);
            zfg[] zfgVarArr = this.a;
            for (zfg zfgVar = zfgVarArr[(a & Integer.MAX_VALUE) % zfgVarArr.length]; zfgVar != null; zfgVar = zfgVar.d) {
                if (obj.equals(zfgVar.get())) {
                    return zfgVar;
                }
            }
            return null;
        }
        for (zfg zfgVar2 = this.a[0]; zfgVar2 != null; zfgVar2 = zfgVar2.d) {
            if (zfgVar2.b) {
                return zfgVar2;
            }
        }
        return null;
    }

    public final void c(zfg zfgVar) {
        int i = zfgVar.a;
        zfg[] zfgVarArr = this.a;
        int length = (i & Integer.MAX_VALUE) % zfgVarArr.length;
        zfg zfgVar2 = null;
        for (zfg zfgVar3 = zfgVarArr[length]; zfgVar3 != null; zfgVar3 = zfgVar3.d) {
            if (zfgVar == zfgVar3) {
                this.b++;
                if (zfgVar2 == null) {
                    this.a[length] = zfgVar3.d;
                } else {
                    zfgVar2.d = zfgVar3.d;
                }
                this.d--;
                return;
            }
            zfgVar2 = zfgVar3;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (this.d > 0) {
            this.d = 0;
            Arrays.fill(this.a, (Object) null);
            this.b++;
            do {
            } while (this.c.poll() != null);
        }
    }

    @Override // java.util.AbstractMap
    protected final Object clone() {
        zfi zfiVar = (zfi) super.clone();
        zfiVar.g = null;
        zfiVar.h = null;
        return zfiVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return b(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        e();
        if (obj != null) {
            int length = this.a.length;
            while (true) {
                length--;
                if (length < 0) {
                    return false;
                }
                for (zfg zfgVar = this.a[length]; zfgVar != null; zfgVar = zfgVar.d) {
                    if ((zfgVar.get() != null || zfgVar.b) && obj.equals(zfgVar.c)) {
                        return true;
                    }
                }
            }
        } else {
            int length2 = this.a.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    return false;
                }
                for (zfg zfgVar2 = this.a[length2]; zfgVar2 != null; zfgVar2 = zfgVar2.d) {
                    if ((zfgVar2.get() != null || zfgVar2.b) && zfgVar2.c == null) {
                        return true;
                    }
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        e();
        return new zfb(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        e();
        if (obj != null) {
            int a = a(obj);
            zfg[] zfgVarArr = this.a;
            for (zfg zfgVar = zfgVarArr[(a & Integer.MAX_VALUE) % zfgVarArr.length]; zfgVar != null; zfgVar = zfgVar.d) {
                if (obj.equals(zfgVar.get())) {
                    return zfgVar.c;
                }
            }
            return null;
        }
        for (zfg zfgVar2 = this.a[0]; zfgVar2 != null; zfgVar2 = zfgVar2.d) {
            if (zfgVar2.b) {
                return zfgVar2.c;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        e();
        if (this.g == null) {
            this.g = new zfc(this);
        }
        return this.g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        zfg zfgVar;
        int i;
        e();
        int i2 = 0;
        if (obj != null) {
            int a = a(obj);
            zfg[] zfgVarArr = this.a;
            i = (a & Integer.MAX_VALUE) % zfgVarArr.length;
            zfgVar = zfgVarArr[i];
            while (zfgVar != null && !obj.equals(zfgVar.get())) {
                zfgVar = zfgVar.d;
            }
        } else {
            zfgVar = this.a[0];
            while (zfgVar != null && !zfgVar.b) {
                zfgVar = zfgVar.d;
            }
            i = 0;
        }
        if (zfgVar == null) {
            int i3 = 1;
            this.b++;
            int i4 = this.d + 1;
            this.d = i4;
            if (i4 > this.f) {
                int length = this.a.length;
                int i5 = length + length;
                if (i5 != 0) {
                    i3 = i5;
                }
                zfg[] zfgVarArr2 = new zfg[i3];
                int i6 = 0;
                while (true) {
                    zfg[] zfgVarArr3 = this.a;
                    if (i6 >= zfgVarArr3.length) {
                        break;
                    }
                    zfg zfgVar2 = zfgVarArr3[i6];
                    while (zfgVar2 != null) {
                        int i7 = zfgVar2.b ? 0 : (zfgVar2.a & Integer.MAX_VALUE) % i3;
                        zfg zfgVar3 = zfgVar2.d;
                        zfgVar2.d = zfgVarArr2[i7];
                        zfgVarArr2[i7] = zfgVar2;
                        zfgVar2 = zfgVar3;
                    }
                    i6++;
                }
                this.a = zfgVarArr2;
                d();
                if (obj != null) {
                    i2 = (Integer.MAX_VALUE & a(obj)) % this.a.length;
                }
            } else {
                i2 = i;
            }
            zfg zfgVar4 = new zfg(obj, obj2, this.c);
            zfg[] zfgVarArr4 = this.a;
            zfgVar4.d = zfgVarArr4[i2];
            zfgVarArr4[i2] = zfgVar4;
            return null;
        }
        Object obj3 = zfgVar.c;
        zfgVar.c = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        if (map.entrySet() != null) {
            super.putAll(map);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zfg zfgVar;
        zfg zfgVar2;
        e();
        int i = 0;
        if (obj != null) {
            int a = a(obj);
            zfg[] zfgVarArr = this.a;
            i = (a & Integer.MAX_VALUE) % zfgVarArr.length;
            zfgVar = zfgVarArr[i];
            zfgVar2 = null;
            while (zfgVar != null && !obj.equals(zfgVar.get())) {
                zfgVar2 = zfgVar;
                zfgVar = zfgVar.d;
            }
        } else {
            zfgVar = this.a[0];
            zfgVar2 = null;
            while (zfgVar != null && !zfgVar.b) {
                zfgVar2 = zfgVar;
                zfgVar = zfgVar.d;
            }
        }
        if (zfgVar != null) {
            this.b++;
            if (zfgVar2 == null) {
                this.a[i] = zfgVar.d;
            } else {
                zfgVar2.d = zfgVar.d;
            }
            this.d--;
            return zfgVar.c;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        e();
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        e();
        if (this.h == null) {
            this.h = new zfe(this);
        }
        return this.h;
    }
}
