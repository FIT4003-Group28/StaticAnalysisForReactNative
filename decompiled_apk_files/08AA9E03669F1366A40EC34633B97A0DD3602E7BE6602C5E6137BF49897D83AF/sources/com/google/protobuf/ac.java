package com.google.protobuf;
/* compiled from: MessageLite.java */
/* loaded from: classes.dex */
public interface ac extends ad {

    /* compiled from: MessageLite.java */
    /* loaded from: classes.dex */
    public interface a extends ad, Cloneable {
        a c(g gVar, p pVar);

        ac t();
    }

    a D();

    ai<? extends ac> getParserForType();

    int getSerializedSize();

    byte[] toByteArray();

    f toByteString();

    void writeTo(h hVar);
}
