package com.google.protobuf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: WireFormat.java */
/* loaded from: classes.dex */
public final class ay {

    /* renamed from: a  reason: collision with root package name */
    static final int f4403a = a(1, 3);

    /* renamed from: b  reason: collision with root package name */
    static final int f4404b = a(1, 4);

    /* renamed from: c  reason: collision with root package name */
    static final int f4405c = a(2, 0);

    /* renamed from: d  reason: collision with root package name */
    static final int f4406d = a(3, 2);

    /* compiled from: WireFormat.java */
    /* loaded from: classes.dex */
    enum c {
        LOOSE { // from class: com.google.protobuf.ay.c.1
            @Override // com.google.protobuf.ay.c
            Object a(g gVar) {
                return gVar.j();
            }
        },
        STRICT { // from class: com.google.protobuf.ay.c.2
            @Override // com.google.protobuf.ay.c
            Object a(g gVar) {
                return gVar.k();
            }
        },
        LAZY { // from class: com.google.protobuf.ay.c.3
            @Override // com.google.protobuf.ay.c
            Object a(g gVar) {
                return gVar.l();
            }
        };

        abstract Object a(g gVar);
    }

    public static int a(int i) {
        return i & 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, int i2) {
        return (i << 3) | i2;
    }

    public static int b(int i) {
        return i >>> 3;
    }

    /* compiled from: WireFormat.java */
    /* loaded from: classes.dex */
    public enum b {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf((float) BitmapDescriptorFactory.HUE_RED)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(false),
        STRING(""),
        BYTE_STRING(f.f4423a),
        ENUM(null),
        MESSAGE(null);
        
        private final Object j;

        b(Object obj) {
            this.j = obj;
        }
    }

    /* compiled from: WireFormat.java */
    /* loaded from: classes.dex */
    public enum a {
        DOUBLE(b.DOUBLE, 1),
        FLOAT(b.FLOAT, 5),
        INT64(b.LONG, 0),
        UINT64(b.LONG, 0),
        INT32(b.INT, 0),
        FIXED64(b.LONG, 1),
        FIXED32(b.INT, 5),
        BOOL(b.BOOLEAN, 0),
        STRING(b.STRING, 2) { // from class: com.google.protobuf.ay.a.1
            @Override // com.google.protobuf.ay.a
            public boolean c() {
                return false;
            }
        },
        GROUP(b.MESSAGE, 3) { // from class: com.google.protobuf.ay.a.2
            @Override // com.google.protobuf.ay.a
            public boolean c() {
                return false;
            }
        },
        MESSAGE(b.MESSAGE, 2) { // from class: com.google.protobuf.ay.a.3
            @Override // com.google.protobuf.ay.a
            public boolean c() {
                return false;
            }
        },
        BYTES(b.BYTE_STRING, 2) { // from class: com.google.protobuf.ay.a.4
            @Override // com.google.protobuf.ay.a
            public boolean c() {
                return false;
            }
        },
        UINT32(b.INT, 0),
        ENUM(b.ENUM, 0),
        SFIXED32(b.INT, 5),
        SFIXED64(b.LONG, 1),
        SINT32(b.INT, 0),
        SINT64(b.LONG, 0);
        
        private final b s;
        private final int t;

        public boolean c() {
            return true;
        }

        a(b bVar, int i) {
            this.s = bVar;
            this.t = i;
        }

        public b a() {
            return this.s;
        }

        public int b() {
            return this.t;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(g gVar, a aVar, c cVar) {
        switch (aVar) {
            case DOUBLE:
                return Double.valueOf(gVar.b());
            case FLOAT:
                return Float.valueOf(gVar.c());
            case INT64:
                return Long.valueOf(gVar.e());
            case UINT64:
                return Long.valueOf(gVar.d());
            case INT32:
                return Integer.valueOf(gVar.f());
            case FIXED64:
                return Long.valueOf(gVar.g());
            case FIXED32:
                return Integer.valueOf(gVar.h());
            case BOOL:
                return Boolean.valueOf(gVar.i());
            case BYTES:
                return gVar.l();
            case UINT32:
                return Integer.valueOf(gVar.m());
            case SFIXED32:
                return Integer.valueOf(gVar.o());
            case SFIXED64:
                return Long.valueOf(gVar.p());
            case SINT32:
                return Integer.valueOf(gVar.q());
            case SINT64:
                return Long.valueOf(gVar.r());
            case STRING:
                return cVar.a(gVar);
            case GROUP:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case MESSAGE:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case ENUM:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
