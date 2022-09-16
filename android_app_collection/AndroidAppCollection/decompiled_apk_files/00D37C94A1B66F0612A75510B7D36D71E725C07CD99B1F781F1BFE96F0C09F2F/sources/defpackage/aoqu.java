package defpackage;

import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: aoqu  reason: default package */
/* loaded from: classes.dex */
public interface aoqu extends aoqv {
    aorb getParserForType();

    int getSerializedSize();

    /* renamed from: newBuilderForType */
    aoqt mo51newBuilderForType();

    /* renamed from: toBuilder */
    aoqt mo52toBuilder();

    byte[] toByteArray();

    aoob toByteString();

    void writeDelimitedTo(OutputStream outputStream);

    void writeTo(aool aoolVar);

    void writeTo(OutputStream outputStream);
}
