package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/* compiled from: PG */
/* renamed from: abxc  reason: default package */
/* loaded from: classes.dex */
public final class abxc {
    public static aoqu a(ObjectInputStream objectInputStream, aoqu aoquVar, Class cls) {
        int readInt = objectInputStream.readInt();
        if (readInt <= 0) {
            if (readInt == 0) {
                return aoquVar;
            }
            return null;
        }
        try {
            byte[] bArr = new byte[readInt];
            objectInputStream.readFully(bArr);
            return (aoqu) cls.cast(aoquVar.mo52toBuilder().mo38mergeFrom(bArr, aoos.b()).mo39build());
        } catch (aopx e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void b(ObjectOutputStream objectOutputStream, aoqu aoquVar) {
        int serializedSize = aoquVar == null ? -1 : aoquVar.getSerializedSize();
        objectOutputStream.writeInt(serializedSize);
        if (serializedSize > 0) {
            aoquVar.writeTo(objectOutputStream);
        }
    }
}
