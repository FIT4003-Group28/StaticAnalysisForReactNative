package defpackage;

import defpackage.dssj;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bvrt  reason: default package */
/* loaded from: classes.dex */
public final class bvrt<T extends dssj> implements Serializable {
    @dzsi
    private volatile transient T a;
    @dzsi
    private byte[] b;

    private bvrt() {
        this.b = null;
        this.a = null;
    }

    private bvrt(T t) {
        this.b = null;
        this.a = t;
    }

    @dzsi
    public static <T extends dssj> bvrt<T> a(@dzsi T t) {
        if (t == null) {
            return null;
        }
        return new bvrt<>(t);
    }

    public static <T extends dssj> bvrt<T> b(T t) {
        return new bvrt<>(t);
    }

    public static <T extends dssj, CU extends dccr<T>, CSB extends dccq<bvrt<T>>, CS extends dccr<bvrt<T>>> CS c(@dzsi CU cu, CSB csb) {
        if (cu != null) {
            dcpd it = cu.iterator();
            while (it.hasNext()) {
                ((dccx) csb).g(a((dssj) it.next()));
            }
        }
        return ((dccx) csb).f();
    }

    public static <T extends dssj, CU extends dccr<T>, CUB extends dccq<T>, CS extends dccr<bvrt<T>>> CU d(@dzsi CS cs, CUB cub, dssr<T> dssrVar, T t) {
        if (cs != null) {
            dcpd it = cs.iterator();
            while (it.hasNext()) {
                bvrt bvrtVar = (bvrt) it.next();
                ((dccx) cub).g(bvrtVar == null ? t : bvrtVar.e(dssrVar, t));
            }
        }
        return ((dccx) cub).f();
    }

    @dzsi
    public static <T extends dssj> T f(@dzsi bvrt<T> bvrtVar, dssr<T> dssrVar, T t) {
        if (bvrtVar == null) {
            return null;
        }
        return bvrtVar.e(dssrVar, t);
    }

    public static <T extends dssj, LU extends List<T>, LS extends List<bvrt<T>>> void g(@dzsi LS ls, LU lu, dssr<T> dssrVar, T t) {
        if (ls != null) {
            Iterator it = ls.iterator();
            while (it.hasNext()) {
                bvrt bvrtVar = (bvrt) it.next();
                lu.add(bvrtVar == null ? null : bvrtVar.e(dssrVar, t));
            }
        }
    }

    public static <T extends dssj, LU extends List<T>, LS extends List<bvrt<T>>> void h(@dzsi LU lu, LS ls) {
        if (lu != null) {
            Iterator it = lu.iterator();
            while (it.hasNext()) {
                ls.add(a((dssj) it.next()));
            }
        }
    }

    private final synchronized byte[] i() {
        byte[] bArr = this.b;
        if (bArr == null) {
            T t = this.a;
            dbsk.s(t);
            return t.bS();
        }
        return bArr;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        byte[] bArr = new byte[objectInputStream.readInt()];
        this.b = bArr;
        objectInputStream.readFully(bArr);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        byte[] i = i();
        objectOutputStream.writeInt(i.length);
        objectOutputStream.write(i);
    }

    public final T e(dssr<T> dssrVar, T t) {
        T t2 = this.a;
        if (t2 != null) {
            return t2;
        }
        synchronized (this) {
            T t3 = this.a;
            if (t3 != null) {
                return t3;
            }
            try {
                T i = dssrVar.i((byte[]) dbsk.s(this.b), dsqa.c());
                this.a = i;
                this.b = null;
                return i;
            } catch (dsrm unused) {
                return t;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.equals(i(), ((bvrt) obj).i());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(i());
    }

    public final synchronized String toString() {
        StringBuilder sb;
        String arrays = this.a == null ? Arrays.toString((byte[]) dbsk.s(this.b)) : this.a.toString();
        sb = new StringBuilder(String.valueOf(arrays).length() + 19);
        sb.append("SerializableProto{");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
