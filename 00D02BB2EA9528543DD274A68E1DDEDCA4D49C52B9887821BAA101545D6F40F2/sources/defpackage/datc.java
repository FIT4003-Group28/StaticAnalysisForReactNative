package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: PG */
/* renamed from: datc  reason: default package */
/* loaded from: classes5.dex */
public abstract class datc {
    private static final WeakHashMap<Class<?>, Field> a = new WeakHashMap<>();
    private static final Lock b = new ReentrantLock();

    private final datg s() {
        datg d = d();
        if (d == null) {
            d = c();
        }
        dbsk.b(d != null, "no JSON input found");
        return d;
    }

    private final datg t() {
        datg s = s();
        datg datgVar = datg.START_ARRAY;
        int ordinal = s.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                s = c();
                boolean z = true;
                if (s != datg.FIELD_NAME && s != datg.END_OBJECT) {
                    z = false;
                }
                dbsk.b(z, s);
            }
            return s;
        }
        return c();
    }

    private final void u(Field field, Map<String, Object> map, Type type, ArrayList<Type> arrayList) {
        datg t = t();
        while (t == datg.FIELD_NAME) {
            String f = f();
            c();
            map.put(f, v(field, type, arrayList, true));
            t = c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:249:0x0409 A[Catch: IllegalArgumentException -> 0x0465, TryCatch #2 {IllegalArgumentException -> 0x0465, blocks: (B:14:0x002d, B:15:0x0039, B:16:0x003c, B:263:0x0442, B:264:0x0464, B:18:0x0042, B:21:0x0049, B:23:0x0050, B:25:0x0058, B:27:0x0060, B:29:0x006d, B:31:0x0075, B:33:0x0082, B:36:0x008d, B:39:0x0093, B:44:0x009f, B:46:0x00ac, B:47:0x00af, B:50:0x00b4, B:53:0x00bd, B:55:0x00c4, B:60:0x00d2, B:64:0x00db, B:69:0x00e5, B:74:0x00ef, B:79:0x00f8, B:84:0x0101, B:89:0x010a, B:92:0x010f, B:93:0x0133, B:94:0x0134, B:96:0x013d, B:98:0x0146, B:100:0x014f, B:102:0x0158, B:104:0x0161, B:106:0x016a, B:108:0x016f, B:112:0x0185, B:123:0x01a7, B:126:0x01b1, B:129:0x01ba, B:130:0x01bf, B:116:0x018d, B:118:0x0195, B:120:0x019d, B:132:0x01c8, B:165:0x0291, B:170:0x029e, B:176:0x02b2, B:178:0x02b8, B:180:0x02bd, B:182:0x02c5, B:184:0x02cd, B:187:0x02d5, B:189:0x02dc, B:191:0x02e0, B:192:0x02e9, B:194:0x02fd, B:196:0x0305, B:215:0x036c, B:218:0x0372, B:222:0x0382, B:224:0x039b, B:226:0x03a7, B:232:0x03b4, B:234:0x03c0, B:236:0x03ca, B:235:0x03c5, B:227:0x03ac, B:197:0x0311, B:199:0x0315, B:201:0x0322, B:203:0x0328, B:206:0x032d, B:207:0x0334, B:208:0x0335, B:212:0x0364, B:210:0x0354, B:211:0x0360, B:174:0x02a9, B:175:0x02ae, B:136:0x01dd, B:140:0x01f0, B:159:0x0281, B:238:0x03e2, B:242:0x03ed, B:247:0x03f9, B:249:0x0409, B:255:0x041e, B:256:0x0426, B:258:0x042a, B:260:0x0438, B:252:0x0411, B:254:0x0419, B:137:0x01e2, B:139:0x01ea, B:142:0x01f5, B:143:0x0208, B:145:0x020e, B:150:0x0225, B:154:0x0254, B:156:0x025c, B:158:0x027c), top: B:276:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x042a A[Catch: IllegalArgumentException -> 0x0465, LOOP:4: B:256:0x0426->B:258:0x042a, LOOP_END, TryCatch #2 {IllegalArgumentException -> 0x0465, blocks: (B:14:0x002d, B:15:0x0039, B:16:0x003c, B:263:0x0442, B:264:0x0464, B:18:0x0042, B:21:0x0049, B:23:0x0050, B:25:0x0058, B:27:0x0060, B:29:0x006d, B:31:0x0075, B:33:0x0082, B:36:0x008d, B:39:0x0093, B:44:0x009f, B:46:0x00ac, B:47:0x00af, B:50:0x00b4, B:53:0x00bd, B:55:0x00c4, B:60:0x00d2, B:64:0x00db, B:69:0x00e5, B:74:0x00ef, B:79:0x00f8, B:84:0x0101, B:89:0x010a, B:92:0x010f, B:93:0x0133, B:94:0x0134, B:96:0x013d, B:98:0x0146, B:100:0x014f, B:102:0x0158, B:104:0x0161, B:106:0x016a, B:108:0x016f, B:112:0x0185, B:123:0x01a7, B:126:0x01b1, B:129:0x01ba, B:130:0x01bf, B:116:0x018d, B:118:0x0195, B:120:0x019d, B:132:0x01c8, B:165:0x0291, B:170:0x029e, B:176:0x02b2, B:178:0x02b8, B:180:0x02bd, B:182:0x02c5, B:184:0x02cd, B:187:0x02d5, B:189:0x02dc, B:191:0x02e0, B:192:0x02e9, B:194:0x02fd, B:196:0x0305, B:215:0x036c, B:218:0x0372, B:222:0x0382, B:224:0x039b, B:226:0x03a7, B:232:0x03b4, B:234:0x03c0, B:236:0x03ca, B:235:0x03c5, B:227:0x03ac, B:197:0x0311, B:199:0x0315, B:201:0x0322, B:203:0x0328, B:206:0x032d, B:207:0x0334, B:208:0x0335, B:212:0x0364, B:210:0x0354, B:211:0x0360, B:174:0x02a9, B:175:0x02ae, B:136:0x01dd, B:140:0x01f0, B:159:0x0281, B:238:0x03e2, B:242:0x03ed, B:247:0x03f9, B:249:0x0409, B:255:0x041e, B:256:0x0426, B:258:0x042a, B:260:0x0438, B:252:0x0411, B:254:0x0419, B:137:0x01e2, B:139:0x01ea, B:142:0x01f5, B:143:0x0208, B:145:0x020e, B:150:0x0225, B:154:0x0254, B:156:0x025c, B:158:0x027c), top: B:276:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0438 A[Catch: IllegalArgumentException -> 0x0465, TryCatch #2 {IllegalArgumentException -> 0x0465, blocks: (B:14:0x002d, B:15:0x0039, B:16:0x003c, B:263:0x0442, B:264:0x0464, B:18:0x0042, B:21:0x0049, B:23:0x0050, B:25:0x0058, B:27:0x0060, B:29:0x006d, B:31:0x0075, B:33:0x0082, B:36:0x008d, B:39:0x0093, B:44:0x009f, B:46:0x00ac, B:47:0x00af, B:50:0x00b4, B:53:0x00bd, B:55:0x00c4, B:60:0x00d2, B:64:0x00db, B:69:0x00e5, B:74:0x00ef, B:79:0x00f8, B:84:0x0101, B:89:0x010a, B:92:0x010f, B:93:0x0133, B:94:0x0134, B:96:0x013d, B:98:0x0146, B:100:0x014f, B:102:0x0158, B:104:0x0161, B:106:0x016a, B:108:0x016f, B:112:0x0185, B:123:0x01a7, B:126:0x01b1, B:129:0x01ba, B:130:0x01bf, B:116:0x018d, B:118:0x0195, B:120:0x019d, B:132:0x01c8, B:165:0x0291, B:170:0x029e, B:176:0x02b2, B:178:0x02b8, B:180:0x02bd, B:182:0x02c5, B:184:0x02cd, B:187:0x02d5, B:189:0x02dc, B:191:0x02e0, B:192:0x02e9, B:194:0x02fd, B:196:0x0305, B:215:0x036c, B:218:0x0372, B:222:0x0382, B:224:0x039b, B:226:0x03a7, B:232:0x03b4, B:234:0x03c0, B:236:0x03ca, B:235:0x03c5, B:227:0x03ac, B:197:0x0311, B:199:0x0315, B:201:0x0322, B:203:0x0328, B:206:0x032d, B:207:0x0334, B:208:0x0335, B:212:0x0364, B:210:0x0354, B:211:0x0360, B:174:0x02a9, B:175:0x02ae, B:136:0x01dd, B:140:0x01f0, B:159:0x0281, B:238:0x03e2, B:242:0x03ed, B:247:0x03f9, B:249:0x0409, B:255:0x041e, B:256:0x0426, B:258:0x042a, B:260:0x0438, B:252:0x0411, B:254:0x0419, B:137:0x01e2, B:139:0x01ea, B:142:0x01f5, B:143:0x0208, B:145:0x020e, B:150:0x0225, B:154:0x0254, B:156:0x025c, B:158:0x027c), top: B:276:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0441 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac A[Catch: IllegalArgumentException -> 0x0465, TryCatch #2 {IllegalArgumentException -> 0x0465, blocks: (B:14:0x002d, B:15:0x0039, B:16:0x003c, B:263:0x0442, B:264:0x0464, B:18:0x0042, B:21:0x0049, B:23:0x0050, B:25:0x0058, B:27:0x0060, B:29:0x006d, B:31:0x0075, B:33:0x0082, B:36:0x008d, B:39:0x0093, B:44:0x009f, B:46:0x00ac, B:47:0x00af, B:50:0x00b4, B:53:0x00bd, B:55:0x00c4, B:60:0x00d2, B:64:0x00db, B:69:0x00e5, B:74:0x00ef, B:79:0x00f8, B:84:0x0101, B:89:0x010a, B:92:0x010f, B:93:0x0133, B:94:0x0134, B:96:0x013d, B:98:0x0146, B:100:0x014f, B:102:0x0158, B:104:0x0161, B:106:0x016a, B:108:0x016f, B:112:0x0185, B:123:0x01a7, B:126:0x01b1, B:129:0x01ba, B:130:0x01bf, B:116:0x018d, B:118:0x0195, B:120:0x019d, B:132:0x01c8, B:165:0x0291, B:170:0x029e, B:176:0x02b2, B:178:0x02b8, B:180:0x02bd, B:182:0x02c5, B:184:0x02cd, B:187:0x02d5, B:189:0x02dc, B:191:0x02e0, B:192:0x02e9, B:194:0x02fd, B:196:0x0305, B:215:0x036c, B:218:0x0372, B:222:0x0382, B:224:0x039b, B:226:0x03a7, B:232:0x03b4, B:234:0x03c0, B:236:0x03ca, B:235:0x03c5, B:227:0x03ac, B:197:0x0311, B:199:0x0315, B:201:0x0322, B:203:0x0328, B:206:0x032d, B:207:0x0334, B:208:0x0335, B:212:0x0364, B:210:0x0354, B:211:0x0360, B:174:0x02a9, B:175:0x02ae, B:136:0x01dd, B:140:0x01f0, B:159:0x0281, B:238:0x03e2, B:242:0x03ed, B:247:0x03f9, B:249:0x0409, B:255:0x041e, B:256:0x0426, B:258:0x042a, B:260:0x0438, B:252:0x0411, B:254:0x0419, B:137:0x01e2, B:139:0x01ea, B:142:0x01f5, B:143:0x0208, B:145:0x020e, B:150:0x0225, B:154:0x0254, B:156:0x025c, B:158:0x027c), top: B:276:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af A[Catch: IllegalArgumentException -> 0x0465, TryCatch #2 {IllegalArgumentException -> 0x0465, blocks: (B:14:0x002d, B:15:0x0039, B:16:0x003c, B:263:0x0442, B:264:0x0464, B:18:0x0042, B:21:0x0049, B:23:0x0050, B:25:0x0058, B:27:0x0060, B:29:0x006d, B:31:0x0075, B:33:0x0082, B:36:0x008d, B:39:0x0093, B:44:0x009f, B:46:0x00ac, B:47:0x00af, B:50:0x00b4, B:53:0x00bd, B:55:0x00c4, B:60:0x00d2, B:64:0x00db, B:69:0x00e5, B:74:0x00ef, B:79:0x00f8, B:84:0x0101, B:89:0x010a, B:92:0x010f, B:93:0x0133, B:94:0x0134, B:96:0x013d, B:98:0x0146, B:100:0x014f, B:102:0x0158, B:104:0x0161, B:106:0x016a, B:108:0x016f, B:112:0x0185, B:123:0x01a7, B:126:0x01b1, B:129:0x01ba, B:130:0x01bf, B:116:0x018d, B:118:0x0195, B:120:0x019d, B:132:0x01c8, B:165:0x0291, B:170:0x029e, B:176:0x02b2, B:178:0x02b8, B:180:0x02bd, B:182:0x02c5, B:184:0x02cd, B:187:0x02d5, B:189:0x02dc, B:191:0x02e0, B:192:0x02e9, B:194:0x02fd, B:196:0x0305, B:215:0x036c, B:218:0x0372, B:222:0x0382, B:224:0x039b, B:226:0x03a7, B:232:0x03b4, B:234:0x03c0, B:236:0x03ca, B:235:0x03c5, B:227:0x03ac, B:197:0x0311, B:199:0x0315, B:201:0x0322, B:203:0x0328, B:206:0x032d, B:207:0x0334, B:208:0x0335, B:212:0x0364, B:210:0x0354, B:211:0x0360, B:174:0x02a9, B:175:0x02ae, B:136:0x01dd, B:140:0x01f0, B:159:0x0281, B:238:0x03e2, B:242:0x03ed, B:247:0x03f9, B:249:0x0409, B:255:0x041e, B:256:0x0426, B:258:0x042a, B:260:0x0438, B:252:0x0411, B:254:0x0419, B:137:0x01e2, B:139:0x01ea, B:142:0x01f5, B:143:0x0208, B:145:0x020e, B:150:0x0225, B:154:0x0254, B:156:0x025c, B:158:0x027c), top: B:276:0x002d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object v(java.lang.reflect.Field r18, java.lang.reflect.Type r19, java.util.ArrayList<java.lang.reflect.Type> r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 1200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.datc.v(java.lang.reflect.Field, java.lang.reflect.Type, java.util.ArrayList, boolean):java.lang.Object");
    }

    public abstract dasy a();

    public abstract void b();

    public abstract datg c();

    public abstract datg d();

    public abstract String e();

    public abstract String f();

    public abstract byte g();

    public abstract short h();

    public abstract int i();

    public abstract float j();

    public abstract long k();

    public abstract double l();

    public abstract BigInteger m();

    public abstract BigDecimal n();

    public final <T> T o(Class<T> cls) {
        try {
            return (T) q(cls, false);
        } finally {
            b();
        }
    }

    public final String p(Set<String> set) {
        datg t = t();
        while (t == datg.FIELD_NAME) {
            String f = f();
            c();
            if (set.contains(f)) {
                return f;
            }
            r();
            t = c();
        }
        return null;
    }

    public final Object q(Type type, boolean z) {
        try {
            if (!Void.class.equals(type)) {
                s();
            }
            Object v = v(null, type, new ArrayList<>(), true);
            if (z) {
                b();
            }
            return v;
        } catch (Throwable th) {
            if (z) {
                b();
            }
            throw th;
        }
    }

    public abstract void r();
}
