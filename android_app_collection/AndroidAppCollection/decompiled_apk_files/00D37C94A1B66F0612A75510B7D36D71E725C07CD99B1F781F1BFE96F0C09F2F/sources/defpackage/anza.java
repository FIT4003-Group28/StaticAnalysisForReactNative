package defpackage;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
/* compiled from: PG */
/* renamed from: anza  reason: default package */
/* loaded from: classes.dex */
public final class anza implements anys {
    public static final anyq a;
    public static final anyq b;
    private static final Charset d = Charset.forName("UTF-8");
    private static final anyr e;
    public final Map c;
    private OutputStream f;
    private final Map g;
    private final anyr h;
    private final anzk i = new anzk();

    static {
        anyp a2 = anyq.a("key");
        anyv a3 = anyv.a();
        a3.a = 1;
        a2.b(a3.b());
        a = a2.a();
        anyp a4 = anyq.a("value");
        anyv a5 = anyv.a();
        a5.a = 2;
        a4.b(a5.b());
        b = a4.a();
        e = anzb.b;
    }

    public anza(OutputStream outputStream, Map map, Map map2, anyr anyrVar) {
        this.f = outputStream;
        this.c = map;
        this.g = map2;
        this.h = anyrVar;
    }

    private static int g(anyq anyqVar) {
        anyz anyzVar = (anyz) anyqVar.b(anyz.class);
        if (anyzVar != null) {
            return anyzVar.a();
        }
        throw new anyo("Field has no @Protobuf config");
    }

    private static anyz h(anyq anyqVar) {
        anyz anyzVar = (anyz) anyqVar.b(anyz.class);
        if (anyzVar != null) {
            return anyzVar;
        }
        throw new anyo("Field has no @Protobuf config");
    }

    private static ByteBuffer i(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void j(int i) {
        while ((i & (-128)) != 0) {
            this.f.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f.write(i & 127);
    }

    private final void k(long j) {
        while (((-128) & j) != 0) {
            this.f.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f.write(((int) j) & 127);
    }

    private final void l(anyr anyrVar, anyq anyqVar, Object obj, boolean z) {
        anyw anywVar = new anyw();
        try {
            OutputStream outputStream = this.f;
            this.f = anywVar;
            anyrVar.a(obj, this);
            this.f = outputStream;
            long j = anywVar.a;
            anywVar.close();
            if (z && j == 0) {
                return;
            }
            j((g(anyqVar) << 3) | 2);
            k(j);
            anyrVar.a(obj, this);
        } catch (Throwable th) {
            try {
                anywVar.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.anys
    public final /* bridge */ /* synthetic */ void a(anyq anyqVar, long j) {
        d(anyqVar, j, true);
    }

    @Override // defpackage.anys
    public final void b(anyq anyqVar, Object obj) {
        f(anyqVar, obj, true);
    }

    final void c(anyq anyqVar, int i, boolean z) {
        if (!z || i != 0) {
            anyz h = h(anyqVar);
            anyy anyyVar = anyy.DEFAULT;
            int ordinal = h.b().ordinal();
            if (ordinal == 0) {
                j(h.a() << 3);
                j(i);
            } else if (ordinal == 1) {
                j(h.a() << 3);
                j((i + i) ^ (i >> 31));
            } else if (ordinal != 2) {
            } else {
                j((h.a() << 3) | 5);
                this.f.write(i(4).putInt(i).array());
            }
        }
    }

    final void d(anyq anyqVar, long j, boolean z) {
        if (!z || j != 0) {
            anyz h = h(anyqVar);
            anyy anyyVar = anyy.DEFAULT;
            int ordinal = h.b().ordinal();
            if (ordinal == 0) {
                j(h.a() << 3);
                k(j);
            } else if (ordinal == 1) {
                j(h.a() << 3);
                k((j >> 63) ^ (j + j));
            } else if (ordinal != 2) {
            } else {
                j((h.a() << 3) | 1);
                this.f.write(i(8).putLong(j).array());
            }
        }
    }

    public final void e(anyq anyqVar, int i) {
        c(anyqVar, i, true);
    }

    final void f(anyq anyqVar, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            j((g(anyqVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(d);
            j(bytes.length);
            this.f.write(bytes);
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                f(anyqVar, obj2, false);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                l(e, anyqVar, entry, false);
            }
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z && doubleValue == 0.0d) {
                return;
            }
            j((g(anyqVar) << 3) | 1);
            this.f.write(i(8).putDouble(doubleValue).array());
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z && floatValue == 0.0f) {
                return;
            }
            j((g(anyqVar) << 3) | 5);
            this.f.write(i(4).putFloat(floatValue).array());
        } else if (obj instanceof Number) {
            d(anyqVar, ((Number) obj).longValue(), z);
        } else if (obj instanceof Boolean) {
            c(anyqVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            j((g(anyqVar) << 3) | 2);
            j(bArr.length);
            this.f.write(bArr);
        } else {
            anyr anyrVar = (anyr) this.c.get(obj.getClass());
            if (anyrVar != null) {
                l(anyrVar, anyqVar, obj, z);
                return;
            }
            anyt anytVar = (anyt) this.g.get(obj.getClass());
            if (anytVar != null) {
                anytVar.a(obj, this.i);
            } else if (obj instanceof anyx) {
                e(anyqVar, ((anyx) obj).a());
            } else if (obj instanceof Enum) {
                e(anyqVar, ((Enum) obj).ordinal());
            } else {
                l(this.h, anyqVar, obj, z);
            }
        }
    }
}
