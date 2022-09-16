package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
/* compiled from: PG */
/* renamed from: aonk  reason: default package */
/* loaded from: classes.dex */
public abstract class aonk implements aoqu {
    protected int memoizedHashCode = 0;

    @Deprecated
    protected static void addAll(Iterable iterable, Collection collection) {
        aonj.addAll(iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(aoob aoobVar) {
        if (aoobVar.q()) {
            return;
        }
        throw new IllegalArgumentException("Byte string is not UTF-8.");
    }

    private String getSerializingExceptionMessage(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + String.valueOf(str).length());
        sb.append("Serializing ");
        sb.append(name);
        sb.append(" to a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(aorm aormVar) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize == -1) {
            int a = aormVar.a(this);
            setMemoizedSerializedSize(a);
            return a;
        }
        return memoizedSerializedSize;
    }

    public aoqy mutableCopy() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public aorx newUninitializedMessageException() {
        return new aorx();
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aoqu
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            aool ak = aool.ak(bArr);
            writeTo(ak);
            ak.an();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    @Override // defpackage.aoqu
    public aoob toByteString() {
        try {
            int serializedSize = getSerializedSize();
            aoob aoobVar = aoob.b;
            byte[] bArr = new byte[serializedSize];
            aool ak = aool.ak(bArr);
            writeTo(ak);
            return aoyt.k(ak, bArr);
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    @Override // defpackage.aoqu
    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        aool al = aool.al(outputStream, aool.V(aool.ae(serializedSize) + serializedSize));
        al.D(serializedSize);
        writeTo(al);
        al.i();
    }

    @Override // defpackage.aoqu
    public void writeTo(OutputStream outputStream) {
        aool al = aool.al(outputStream, aool.V(getSerializedSize()));
        writeTo(al);
        al.i();
    }

    public static void addAll(Iterable iterable, List list) {
        aonj.addAll(iterable, list);
    }
}
