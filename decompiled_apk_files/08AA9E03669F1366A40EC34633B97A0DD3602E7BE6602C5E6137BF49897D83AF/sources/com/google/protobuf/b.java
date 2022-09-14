package com.google.protobuf;

import com.google.protobuf.ac;
import com.google.protobuf.b;
import com.google.protobuf.b.a;
import com.google.protobuf.f;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: AbstractMessageLite.java */
/* loaded from: classes.dex */
public abstract class b<MessageType extends b<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements ac {
    protected int memoizedHashCode = 0;

    @Override // com.google.protobuf.ac
    public f toByteString() {
        try {
            f.e b2 = f.b(getSerializedSize());
            writeTo(b2.b());
            return b2.a();
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    @Override // com.google.protobuf.ac
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            h a2 = h.a(bArr);
            writeTo(a2);
            a2.c();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    public void writeTo(OutputStream outputStream) {
        h a2 = h.a(outputStream, h.a(getSerializedSize()));
        writeTo(a2);
        a2.a();
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        h a2 = h.a(outputStream, h.a(h.r(serializedSize) + serializedSize));
        a2.q(serializedSize);
        writeTo(a2);
        a2.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public as newUninitializedMessageException() {
        return new as(this);
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    protected static void checkByteStringIsUtf8(f fVar) {
        if (!fVar.f()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    protected static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        a.a(iterable, collection);
    }

    /* compiled from: AbstractMessageLite.java */
    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends b<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements ac.a {
        @Override // com.google.protobuf.ac.a
        /* renamed from: b */
        public abstract BuilderType c(g gVar, p pVar);

        @Override // 
        /* renamed from: d */
        public abstract BuilderType clone();

        public BuilderType b(f fVar, p pVar) {
            try {
                g g = fVar.g();
                c(g, pVar);
                g.a(0);
                return this;
            } catch (u e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(a("ByteString"), e2);
            }
        }

        /* compiled from: AbstractMessageLite.java */
        /* renamed from: com.google.protobuf.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0079a extends FilterInputStream {

            /* renamed from: a  reason: collision with root package name */
            private int f4420a;

            /* JADX INFO: Access modifiers changed from: package-private */
            public C0079a(InputStream inputStream, int i) {
                super(inputStream);
                this.f4420a = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f4420a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() {
                if (this.f4420a <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f4420a--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i2) {
                if (this.f4420a <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, this.f4420a));
                if (read >= 0) {
                    this.f4420a -= read;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j) {
                long skip = super.skip(Math.min(j, this.f4420a));
                if (skip >= 0) {
                    this.f4420a = (int) (this.f4420a - skip);
                }
                return skip;
            }
        }

        private String a(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        protected static <T> void a(Iterable<T> iterable, Collection<? super T> collection) {
            t.a(iterable);
            if (iterable instanceof y) {
                a(((y) iterable).d());
                collection.addAll((Collection) iterable);
            } else if (iterable instanceof Collection) {
                if (!(iterable instanceof aj)) {
                    a((Iterable<?>) iterable);
                }
                collection.addAll((Collection) iterable);
            } else {
                for (T t : iterable) {
                    t.a(t);
                    collection.add(t);
                }
            }
        }

        private static void a(Iterable<?> iterable) {
            Iterator<?> it = iterable.iterator();
            while (it.hasNext()) {
                t.a(it.next());
            }
        }
    }
}
