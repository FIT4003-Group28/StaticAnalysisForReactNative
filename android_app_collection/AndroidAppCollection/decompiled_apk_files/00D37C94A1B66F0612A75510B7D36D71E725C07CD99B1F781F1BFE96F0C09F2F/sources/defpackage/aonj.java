package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: PG */
/* renamed from: aonj  reason: default package */
/* loaded from: classes.dex */
public abstract class aonj implements aoqt {
    @Deprecated
    protected static void addAll(Iterable iterable, Collection collection) {
        addAll(iterable, (List) collection);
    }

    private static void addAllCheckingNulls(Iterable iterable, List list) {
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj != null) {
                list.add(obj);
            } else {
                int size2 = list.size();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Element at index ");
                sb.append(size2 - size);
                sb.append(" is null.");
                String sb2 = sb.toString();
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        break;
                    }
                    list.remove(size3);
                }
                throw new NullPointerException(sb2);
            }
        }
    }

    private String getReadingExceptionMessage(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 60 + String.valueOf(str).length());
        sb.append("Reading ");
        sb.append(name);
        sb.append(" from a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static aorx newUninitializedMessageException(aoqu aoquVar) {
        return new aorx();
    }

    @Override // defpackage.aoqt
    /* renamed from: clone */
    public abstract aonj mo43clone();

    protected abstract aonj internalMergeFrom(aonk aonkVar);

    public boolean mergeDelimitedFrom(InputStream inputStream) {
        return mergeDelimitedFrom(inputStream, aoos.a());
    }

    @Override // defpackage.aoqt
    /* renamed from: mergeFrom */
    public aonj mo28mergeFrom(aoob aoobVar) {
        try {
            aoog l = aoobVar.l();
            m30mergeFrom(l);
            l.B(0);
            return this;
        } catch (aopx e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
        }
    }

    /* renamed from: mergeFrom */
    public abstract aonj m31mergeFrom(aoog aoogVar, aoos aoosVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public static void addAll(Iterable iterable, List list) {
        aopv.h(iterable);
        if (iterable instanceof aoqf) {
            List h = ((aoqf) iterable).h();
            aoqf aoqfVar = (aoqf) list;
            int size = list.size();
            for (Object obj : h) {
                if (obj != null) {
                    if (obj instanceof aoob) {
                        aoqfVar.i((aoob) obj);
                    } else {
                        aoqfVar.add((String) obj);
                    }
                } else {
                    int size2 = aoqfVar.size();
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2 - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    int size3 = aoqfVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            break;
                        }
                        aoqfVar.remove(size3);
                    }
                    throw new NullPointerException(sb2);
                }
            }
        } else if (iterable instanceof aorc) {
            list.addAll((Collection) iterable);
        } else {
            addAllCheckingNulls(iterable, list);
        }
    }

    public boolean mergeDelimitedFrom(InputStream inputStream, aoos aoosVar) {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        m34mergeFrom((InputStream) new aoni(inputStream, aoog.K(read, inputStream)), aoosVar);
        return true;
    }

    /* renamed from: mergeFrom */
    public aonj m29mergeFrom(aoob aoobVar, aoos aoosVar) {
        try {
            aoog l = aoobVar.l();
            m31mergeFrom(l, aoosVar);
            l.B(0);
            return this;
        } catch (aopx e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
        }
    }

    /* renamed from: mergeFrom */
    public aonj m30mergeFrom(aoog aoogVar) {
        return m31mergeFrom(aoogVar, aoos.a());
    }

    @Override // defpackage.aoqt
    /* renamed from: mergeFrom */
    public aonj mo32mergeFrom(aoqu aoquVar) {
        if (!mo50getDefaultInstanceForType().getClass().isInstance(aoquVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return internalMergeFrom((aonk) aoquVar);
    }

    /* renamed from: mergeFrom */
    public aonj m33mergeFrom(InputStream inputStream) {
        aoog M = aoog.M(inputStream);
        m30mergeFrom(M);
        M.B(0);
        return this;
    }

    /* renamed from: mergeFrom */
    public aonj m34mergeFrom(InputStream inputStream, aoos aoosVar) {
        aoog M = aoog.M(inputStream);
        m31mergeFrom(M, aoosVar);
        M.B(0);
        return this;
    }

    @Override // defpackage.aoqt
    /* renamed from: mergeFrom */
    public aonj mo35mergeFrom(byte[] bArr) {
        return m36mergeFrom(bArr, 0, bArr.length);
    }

    /* renamed from: mergeFrom */
    public aonj m36mergeFrom(byte[] bArr, int i, int i2) {
        try {
            aoog Q = aoog.Q(bArr, i, i2);
            m30mergeFrom(Q);
            Q.B(0);
            return this;
        } catch (aopx e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
        }
    }

    /* renamed from: mergeFrom */
    public aonj m37mergeFrom(byte[] bArr, int i, int i2, aoos aoosVar) {
        try {
            aoog Q = aoog.Q(bArr, i, i2);
            m31mergeFrom(Q, aoosVar);
            Q.B(0);
            return this;
        } catch (aopx e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
        }
    }

    @Override // defpackage.aoqt
    /* renamed from: mergeFrom */
    public aonj mo38mergeFrom(byte[] bArr, aoos aoosVar) {
        return m37mergeFrom(bArr, 0, bArr.length, aoosVar);
    }
}
