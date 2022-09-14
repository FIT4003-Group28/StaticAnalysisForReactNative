package c.e.a.b.d.g;
/* JADX WARN: Init of enum l can be incorrect */
/* JADX WARN: Init of enum m can be incorrect */
/* JADX WARN: Init of enum n can be incorrect */
/* JADX WARN: Init of enum o can be incorrect */
/* loaded from: classes.dex */
public enum h8 {
    DOUBLE(p8.DOUBLE, 1),
    FLOAT(p8.FLOAT, 5),
    INT64(p8.LONG, 0),
    UINT64(p8.LONG, 0),
    INT32(p8.INT, 0),
    FIXED64(p8.LONG, 1),
    FIXED32(p8.INT, 5),
    BOOL(p8.BOOLEAN, 0),
    STRING(r1, 2) { // from class: c.e.a.b.d.g.k8
    },
    GROUP(r1, 3) { // from class: c.e.a.b.d.g.j8
    },
    MESSAGE(r1, 2) { // from class: c.e.a.b.d.g.m8
    },
    BYTES(r1, 2) { // from class: c.e.a.b.d.g.l8
    },
    UINT32(p8.INT, 0),
    ENUM(p8.ENUM, 0),
    SFIXED32(p8.INT, 5),
    SFIXED64(p8.LONG, 1),
    SINT32(p8.INT, 0),
    SINT64(p8.LONG, 0);
    

    /* renamed from: b  reason: collision with root package name */
    private final p8 f4197b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4198c;

    static {
        final p8 p8Var = p8.STRING;
        final p8 p8Var2 = p8.MESSAGE;
        final p8 p8Var3 = p8.MESSAGE;
        final p8 p8Var4 = p8.BYTE_STRING;
    }

    h8(p8 p8Var, int i) {
        this.f4197b = p8Var;
        this.f4198c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* synthetic */ h8(p8 p8Var, int i, i8 i8Var) {
        this(p8Var, i);
    }
}
