package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amul  reason: default package */
/* loaded from: classes.dex */
public class amul extends amvb implements amwg {
    private static final long serialVersionUID = 0;

    public amul(amup amupVar, int i) {
        super(amupVar, i);
    }

    public static amul b(amxc amxcVar) {
        return ((amro) amxcVar).b == 0 ? amta.a : c(amxcVar.r().entrySet());
    }

    public static amul c(Collection collection) {
        if (collection.isEmpty()) {
            return amta.a;
        }
        amum amumVar = new amum(collection.size());
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            amuk o = amuk.o((Collection) entry.getValue());
            if (!o.isEmpty()) {
                amumVar.f(key, o);
                i += o.size();
            }
        }
        return new amul(amumVar.b(), i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Invalid key count ");
            sb.append(readInt);
            throw new InvalidObjectException(sb.toString());
        }
        amum h = amup.h();
        int i = 0;
        for (int i2 = 0; i2 < readInt; i2++) {
            Object readObject = objectInputStream.readObject();
            int readInt2 = objectInputStream.readInt();
            if (readInt2 > 0) {
                amuf f = amuk.f();
                for (int i3 = 0; i3 < readInt2; i3++) {
                    f.h(objectInputStream.readObject());
                }
                h.f(readObject, f.g());
                i += readInt2;
            } else {
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Invalid value count ");
                sb2.append(readInt2);
                throw new InvalidObjectException(sb2.toString());
            }
        }
        try {
            try {
                amuz.a.a.set(this, h.b());
                try {
                    amuz.b.a.set(this, Integer.valueOf(i));
                } catch (IllegalAccessException e) {
                    throw new AssertionError(e);
                }
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        } catch (IllegalArgumentException e3) {
            throw ((InvalidObjectException) new InvalidObjectException(e3.getMessage()).initCause(e3));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        amyv.n(this, objectOutputStream);
    }

    public final amuk a(Object obj) {
        amuk amukVar = (amuk) this.b.get(obj);
        return amukVar == null ? amuk.q() : amukVar;
    }

    @Override // defpackage.amwg
    public final /* bridge */ /* synthetic */ List e(Object obj) {
        throw null;
    }

    @Override // defpackage.amwg
    @Deprecated
    public final /* bridge */ /* synthetic */ List f(Object obj) {
        throw new UnsupportedOperationException();
    }
}
