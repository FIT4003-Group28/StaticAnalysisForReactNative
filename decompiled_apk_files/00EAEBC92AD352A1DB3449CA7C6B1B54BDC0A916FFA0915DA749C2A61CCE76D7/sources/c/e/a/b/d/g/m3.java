package c.e.a.b.d.g;

import c.e.a.b.d.g.l3;
import c.e.a.b.d.g.m3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public abstract class m3<MessageType extends m3<MessageType, BuilderType>, BuilderType extends l3<MessageType, BuilderType>> implements k6 {
    protected int zza = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> void a(Iterable<T> iterable, List<? super T> list) {
        e5.a(iterable);
        if (iterable instanceof v5) {
            List<?> k = ((v5) iterable).k();
            v5 v5Var = (v5) list;
            int size = list.size();
            for (Object obj : k) {
                if (obj == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(v5Var.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = v5Var.size() - 1; size2 >= size; size2--) {
                        v5Var.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (obj instanceof v3) {
                    v5Var.a((v3) obj);
                } else {
                    v5Var.add((String) obj);
                }
            }
        } else if (iterable instanceof v6) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T t : iterable) {
                if (t == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(t);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // c.e.a.b.d.g.k6
    public final v3 d() {
        try {
            d4 c2 = v3.c(b());
            a(c2.b());
            return c2.a();
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    public final byte[] f() {
        try {
            byte[] bArr = new byte[b()];
            j4 a2 = j4.a(bArr);
            a(a2);
            a2.b();
            return bArr;
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        throw new UnsupportedOperationException();
    }
}
