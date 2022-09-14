package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: alwe  reason: default package */
/* loaded from: classes.dex */
public final class alwe implements Serializable {
    public static final bnuw a = bnuw.c(0, 0);
    private static final dcqe g = dcqe.c("alwe");
    @dzsi
    public final String b;
    @dzsi
    public final List<alwd> c;
    public final bnuw d;
    public final int e;
    @dzsi
    public transient Bitmap f;

    public alwe(Bitmap bitmap) {
        this.b = null;
        this.e = 1;
        this.c = null;
        this.f = bitmap;
        this.d = a;
    }

    private alwe(String str, bnuw bnuwVar, int i) {
        if (i <= 0) {
            bvoo.h("superSampleRatio must be greater than or equal to %s.", 1);
        }
        this.b = str;
        this.e = Math.max(i, 1);
        this.c = null;
        this.f = null;
        this.d = bnuwVar;
    }

    public static alwe a(Iterable<dmum> iterable) {
        bnuw bnuwVar = a;
        ArrayList a2 = dchl.a();
        Iterator<dmum> it = iterable.iterator();
        int i = -1;
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            dmum next = it.next();
            String d = next.d();
            int o = next.p() ? next.o() : -16777216;
            if (next.r()) {
                i2 = next.q();
            }
            a2.add(new alwd(d, o, i2));
            if (i == -1) {
                i = next.h() ? next.g() : -1;
            }
            if (!bnuwVar.d() && next.l() && next.n()) {
                bnuwVar = bnuw.c(next.k(), next.m());
            }
        }
        int max = Math.max(i, 1);
        if (a2.size() == 1) {
            String str = ((alwd) a2.get(0)).a;
            if (str.startsWith("data:") || str.startsWith("//") || str.contains("://")) {
                return new alwe(str, bnuwVar, max);
            }
        }
        return new alwe(a2, max);
    }

    public static alwe b(dmvr dmvrVar, Iterable<dmum> iterable, dzjj<alwd> dzjjVar, dmue dmueVar) {
        ArrayList a2 = dchl.a();
        int i = 0;
        int i2 = -1;
        while (true) {
            int i3 = -16777216;
            if (i >= dmvrVar.b) {
                break;
            }
            int b = dmvrVar.b(i);
            dmum p = dmueVar.p(b);
            if (!dzjjVar.d(b)) {
                String a3 = alyp.a(p.d(), p.f(), p.e(), dmueVar);
                if (p.p()) {
                    i3 = p.o();
                }
                alwd alwdVar = new alwd(a3, i3, p.r() ? p.q() : 0);
                dzjjVar.a(b, alwdVar);
                a2.add(alwdVar);
            } else {
                a2.add(dzjjVar.i(b));
            }
            if (i2 == -1) {
                i2 = p.h() ? p.g() : -1;
            }
            i++;
        }
        for (dmum dmumVar : iterable) {
            a2.add(new alwd(alyp.a(dmumVar.d(), dmumVar.f(), dmumVar.e(), dmueVar), dmumVar.p() ? dmumVar.o() : -16777216, dmumVar.r() ? dmumVar.q() : 0));
            if (i2 == -1) {
                i2 = dmumVar.h() ? dmumVar.g() : -1;
            }
        }
        return new alwe(a2, Math.max(i2, 1));
    }

    public static alwe c(Iterable<dmoh> iterable) {
        Object b;
        bnuw bnuwVar = a;
        ArrayList a2 = dchl.a();
        Iterator<dmoh> it = iterable.iterator();
        int i = -1;
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            dmoh next = it.next();
            String str = next.b;
            int i3 = next.a;
            int i4 = (i3 & 32) != 0 ? next.f : -16777216;
            if ((i3 & 64) != 0) {
                i2 = next.g;
            }
            dsqv<dmoh, akvs> dsqvVar = akvt.a;
            next.f(dsqvVar);
            Object l = next.V.l(dsqvVar.d);
            if (l == null) {
                b = dsqvVar.b;
            } else {
                b = dsqvVar.b(l);
            }
            a2.add(new alwd(str, i4, i2, (akvs) b));
            if (i == -1) {
                i = (next.a & 4) != 0 ? next.c : -1;
            }
            if (!bnuwVar.d()) {
                int i5 = next.a;
                if ((i5 & 8) != 0 && (i5 & 16) != 0) {
                    bnuwVar = bnuw.c(next.d, next.e);
                }
            }
        }
        int max = Math.max(i, 1);
        if (a2.size() == 1) {
            String str2 = ((alwd) a2.get(0)).a;
            if (str2.startsWith("data:") || str2.startsWith("//") || str2.contains("://")) {
                return new alwe(str2, bnuwVar, max);
            }
        }
        return new alwe(a2, max);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt == 0) {
            this.f = null;
            return;
        }
        byte[] bArr = new byte[readInt];
        objectInputStream.readFully(bArr);
        ClassLoader classLoader = getClass().getClassLoader();
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, readInt);
        obtain.setDataPosition(0);
        Parcelable readParcelable = obtain.readParcelable(classLoader);
        obtain.recycle();
        this.f = (Bitmap) readParcelable;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        Bitmap bitmap = this.f;
        if (bitmap == null) {
            objectOutputStream.writeInt(0);
            return;
        }
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(bitmap, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        objectOutputStream.writeInt(marshall.length);
        objectOutputStream.write(marshall);
    }

    public final boolean d() {
        return this.f != null;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alwe)) {
            return false;
        }
        alwe alweVar = (alwe) obj;
        return dbsd.a(this.b, alweVar.b) && dbsd.a(this.c, alweVar.c) && dbsd.a(this.f, alweVar.f) && this.e == alweVar.e && dbsd.a(this.d, alweVar.d);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = str != null ? str.hashCode() + 31 : 1;
        List<alwd> list = this.c;
        if (list != null) {
            hashCode = (hashCode * 31) + list.hashCode();
        }
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            hashCode = (hashCode * 31) + bitmap.hashCode();
        }
        return (((hashCode * 31) + this.e) * 31) + this.d.hashCode();
    }

    public alwe(List<alwd> list, int i) {
        if (i <= 0) {
            bvoo.h("superSampleRatio must be greater than or equal to %s.", 1);
        }
        this.c = list;
        this.e = Math.max(i, 1);
        this.b = null;
        this.f = null;
        this.d = a;
    }
}
