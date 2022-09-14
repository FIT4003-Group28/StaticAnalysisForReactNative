package com.google.protobuf;

import com.google.protobuf.ac;
import com.google.protobuf.b;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: AbstractParser.java */
/* loaded from: classes.dex */
public abstract class c<MessageType extends ac> implements ai<MessageType> {

    /* renamed from: a  reason: collision with root package name */
    private static final p f4421a = p.d();

    private as a(MessageType messagetype) {
        if (messagetype instanceof b) {
            return ((b) messagetype).newUninitializedMessageException();
        }
        return new as(messagetype);
    }

    private MessageType b(MessageType messagetype) {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw a((c<MessageType>) messagetype).a().a(messagetype);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.ai
    /* renamed from: a */
    public MessageType b(g gVar, p pVar) {
        return (MessageType) b((c<MessageType>) ((ac) d(gVar, pVar)));
    }

    @Override // com.google.protobuf.ai
    /* renamed from: a */
    public MessageType b(g gVar) {
        return b(gVar, f4421a);
    }

    public MessageType a(f fVar, p pVar) {
        try {
            g g = fVar.g();
            MessageType messagetype = (MessageType) d(g, pVar);
            try {
                g.a(0);
                return messagetype;
            } catch (u e) {
                throw e.a(messagetype);
            }
        } catch (u e2) {
            throw e2;
        }
    }

    @Override // com.google.protobuf.ai
    /* renamed from: b */
    public MessageType c(f fVar, p pVar) {
        return b((c<MessageType>) a(fVar, pVar));
    }

    public MessageType a(byte[] bArr, int i, int i2, p pVar) {
        try {
            g a2 = g.a(bArr, i, i2);
            MessageType messagetype = (MessageType) d(a2, pVar);
            try {
                a2.a(0);
                return messagetype;
            } catch (u e) {
                throw e.a(messagetype);
            }
        } catch (u e2) {
            throw e2;
        }
    }

    public MessageType b(byte[] bArr, int i, int i2, p pVar) {
        return b((c<MessageType>) a(bArr, i, i2, pVar));
    }

    @Override // com.google.protobuf.ai
    /* renamed from: a */
    public MessageType b(byte[] bArr, p pVar) {
        return b(bArr, 0, bArr.length, pVar);
    }

    @Override // com.google.protobuf.ai
    /* renamed from: a */
    public MessageType b(byte[] bArr) {
        return b(bArr, f4421a);
    }

    public MessageType a(InputStream inputStream, p pVar) {
        g a2 = g.a(inputStream);
        MessageType messagetype = (MessageType) d(a2, pVar);
        try {
            a2.a(0);
            return messagetype;
        } catch (u e) {
            throw e.a(messagetype);
        }
    }

    @Override // com.google.protobuf.ai
    /* renamed from: b */
    public MessageType f(InputStream inputStream, p pVar) {
        return b((c<MessageType>) a(inputStream, pVar));
    }

    @Override // com.google.protobuf.ai
    /* renamed from: a */
    public MessageType d(InputStream inputStream) {
        return f(inputStream, f4421a);
    }

    public MessageType c(InputStream inputStream, p pVar) {
        try {
            int read = inputStream.read();
            if (read != -1) {
                return a(new b.a.C0079a(inputStream, g.a(read, inputStream)), pVar);
            }
            return null;
        } catch (IOException e) {
            throw new u(e);
        }
    }

    @Override // com.google.protobuf.ai
    /* renamed from: d */
    public MessageType e(InputStream inputStream, p pVar) {
        return b((c<MessageType>) c(inputStream, pVar));
    }

    @Override // com.google.protobuf.ai
    /* renamed from: b */
    public MessageType c(InputStream inputStream) {
        return e(inputStream, f4421a);
    }
}
