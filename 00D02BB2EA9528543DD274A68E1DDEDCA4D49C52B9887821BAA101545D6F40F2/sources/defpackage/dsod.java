package defpackage;

import defpackage.dsod;
import defpackage.dsoe;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: PG */
/* renamed from: dsod  reason: default package */
/* loaded from: classes.dex */
public abstract class dsod<MessageType extends dsoe<MessageType, BuilderType>, BuilderType extends dsod<MessageType, BuilderType>> implements dssi {
    public static <T> void bv(Iterable<T> iterable, List<? super T> list) {
        dsrk.h(iterable);
        if (iterable instanceof dsrt) {
            List<?> h = ((dsrt) iterable).h();
            dsrt dsrtVar = (dsrt) list;
            int size = list.size();
            for (Object obj : h) {
                if (obj != null) {
                    if (obj instanceof dspd) {
                        dsrtVar.f((dspd) obj);
                    } else {
                        dsrtVar.add((String) obj);
                    }
                } else {
                    int size2 = dsrtVar.size();
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2 - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    int size3 = dsrtVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            break;
                        }
                        dsrtVar.remove(size3);
                    }
                    throw new NullPointerException(sb2);
                }
            }
        } else if (!(iterable instanceof dsss)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size4 = list.size();
            for (T t : iterable) {
                if (t != null) {
                    list.add(t);
                } else {
                    int size5 = list.size();
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(size5 - size4);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    int size6 = list.size();
                    while (true) {
                        size6--;
                        if (size6 < size4) {
                            break;
                        }
                        list.remove(size6);
                    }
                    throw new NullPointerException(sb4);
                }
            }
        } else {
            list.addAll((Collection) iterable);
        }
    }

    public abstract void bA(dspj dspjVar, dsqa dsqaVar);

    public BuilderType bB(byte[] bArr, int i) {
        throw null;
    }

    protected abstract void bC(MessageType messagetype);

    public void bE(byte[] bArr, int i, dsqa dsqaVar) {
        throw null;
    }

    @Override // 
    /* renamed from: bs */
    public abstract BuilderType clone();

    @Override // defpackage.dssi
    /* renamed from: bt */
    public final BuilderType by(byte[] bArr) {
        return bB(bArr, bArr.length);
    }

    @Override // defpackage.dssi
    /* renamed from: bu */
    public final BuilderType bx(byte[] bArr, dsqa dsqaVar) {
        bE(bArr, bArr.length, dsqaVar);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dssi
    public final /* bridge */ /* synthetic */ dssi bw(dssj dssjVar) {
        if (Qw().getClass().isInstance(dssjVar)) {
            bC((dsoe) dssjVar);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // defpackage.dssi
    /* renamed from: bz */
    public final void bD(dspd dspdVar) {
        try {
            dspj s = dspdVar.s();
            bA(s, dsqa.b());
            s.b(0);
        } catch (dsrm e) {
            throw e;
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 70);
            sb.append("Reading ");
            sb.append(name);
            sb.append(" from a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }
}
