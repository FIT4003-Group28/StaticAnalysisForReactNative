package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cznl  reason: default package */
/* loaded from: classes.dex */
public final class cznl implements cznk {
    private static final Charset e;
    private static final List<cznl> f;
    public volatile cznj a;
    private final String d;
    private final Object c = new Object();
    private final Map<String, czni<?>> b = new HashMap(10);

    static {
        new cznl("");
        e = Charset.forName("UTF-8");
        f = new ArrayList();
    }

    private cznl(String str) {
        this.d = str;
    }

    public static synchronized cznl a(String str) {
        synchronized (cznl.class) {
            for (cznl cznlVar : f) {
                if (cznlVar.d.equals(str)) {
                    return cznlVar;
                }
            }
            cznl cznlVar2 = new cznl(str);
            f.add(cznlVar2);
            return cznlVar2;
        }
    }

    public static long d(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(e));
            return ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final cznb b(String str, cznf<?>... cznfVarArr) {
        synchronized (this.c) {
            cznb cznbVar = (cznb) this.b.get(str);
            if (cznbVar != null) {
                cznbVar.f(cznfVarArr);
                return cznbVar;
            }
            cznb cznbVar2 = new cznb(str, this, cznfVarArr);
            this.b.put(cznbVar2.b, cznbVar2);
            return cznbVar2;
        }
    }

    public final cznd c(String str, cznf<?>... cznfVarArr) {
        synchronized (this.c) {
            cznd czndVar = (cznd) this.b.get(str);
            if (czndVar != null) {
                czndVar.f(cznfVarArr);
                return czndVar;
            }
            cznd czndVar2 = new cznd(str, this, cznfVarArr);
            this.b.put(czndVar2.b, czndVar2);
            return czndVar2;
        }
    }

    public final dbml e() {
        boolean z;
        ArrayList arrayList;
        dfef bK;
        ArrayList arrayList2 = new ArrayList();
        synchronized (this.c) {
            Iterator<czni<?>> it = this.b.values().iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                czni<?> next = it.next();
                cznf<?>[] cznfVarArr = next.c;
                HashMap hashMap = new HashMap(10);
                cznh cznhVar = new cznh(next.b, next.c);
                synchronized (next.a) {
                    cznhVar.c = next.d;
                    cznhVar.d = next.e;
                    next.d = hashMap;
                    next.e = 0;
                }
                arrayList2.add(cznhVar);
            }
        }
        dbmk bZ = dbml.b.bZ();
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            cznh cznhVar2 = (cznh) arrayList2.get(i);
            if (cznhVar2.d == 0) {
                bK = null;
                arrayList = arrayList2;
            } else {
                dfdy bZ2 = dfef.e.bZ();
                long d = d(cznhVar2.a);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = z;
                }
                dfef dfefVar = (dfef) bZ2.b;
                dfefVar.a |= 2;
                dfefVar.b = d;
                for (cznf<?> cznfVar : cznhVar2.b) {
                    long d2 = d(cznfVar.a);
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = z;
                    }
                    dfef dfefVar2 = (dfef) bZ2.b;
                    dsri dsriVar = dfefVar2.c;
                    if (!dsriVar.a()) {
                        dfefVar2.c = dsqw.ci(dsriVar);
                    }
                    dfefVar2.c.d(d2);
                }
                for (Map.Entry entry : cznhVar2.c.entrySet()) {
                    dfdz bZ3 = dfee.d.bZ();
                    czmw czmwVar = (czmw) entry.getKey();
                    czmx czmxVar = (czmx) entry.getValue();
                    String str = cznhVar2.a;
                    ArrayList arrayList3 = new ArrayList(czmwVar.b.length);
                    int i2 = 0;
                    while (i2 < czmwVar.b.length) {
                        dfea bZ4 = dfeb.c.bZ();
                        Object obj = czmwVar.b[i2];
                        ArrayList arrayList4 = arrayList2;
                        if (obj instanceof String) {
                            String str2 = (String) obj;
                            if (bZ4.c) {
                                bZ4.bF();
                                bZ4.c = false;
                            }
                            dfeb dfebVar = (dfeb) bZ4.b;
                            str2.getClass();
                            dfebVar.a = 1;
                            dfebVar.b = str2;
                        } else if (obj instanceof Integer) {
                            int intValue = ((Integer) obj).intValue();
                            if (bZ4.c) {
                                bZ4.bF();
                                bZ4.c = false;
                            }
                            dfeb dfebVar2 = (dfeb) bZ4.b;
                            dfebVar2.a = 2;
                            dfebVar2.b = Integer.valueOf(intValue);
                        } else if (obj instanceof Boolean) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            if (bZ4.c) {
                                bZ4.bF();
                                bZ4.c = false;
                            }
                            dfeb dfebVar3 = (dfeb) bZ4.b;
                            dfebVar3.a = 3;
                            dfebVar3.b = Boolean.valueOf(booleanValue);
                        } else {
                            String valueOf = String.valueOf(obj);
                            StringBuilder sb = new StringBuilder(str.length() + 56 + String.valueOf(valueOf).length());
                            sb.append("Metric ");
                            sb.append(str);
                            sb.append(" has field ");
                            sb.append(i2);
                            sb.append(" with an unexpected value: ");
                            sb.append(valueOf);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        arrayList3.add(bZ4.bK());
                        i2++;
                        arrayList2 = arrayList4;
                    }
                    ArrayList arrayList5 = arrayList2;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dfee dfeeVar = (dfee) bZ3.b;
                    dsrj<dfeb> dsrjVar = dfeeVar.b;
                    if (!dsrjVar.a()) {
                        dfeeVar.b = dsqw.cl(dsrjVar);
                    }
                    dsod.bv(arrayList3, dfeeVar.b);
                    dfed a = czmxVar.a();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dfee dfeeVar2 = (dfee) bZ3.b;
                    a.getClass();
                    dfeeVar2.c = a;
                    dfeeVar2.a |= 1;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dfef dfefVar3 = (dfef) bZ2.b;
                    dfee bK2 = bZ3.bK();
                    bK2.getClass();
                    dsrj<dfee> dsrjVar2 = dfefVar3.d;
                    if (!dsrjVar2.a()) {
                        dfefVar3.d = dsqw.cl(dsrjVar2);
                    }
                    dfefVar3.d.add(bK2);
                    arrayList2 = arrayList5;
                }
                arrayList = arrayList2;
                bK = bZ2.bK();
            }
            if (bK != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dbml dbmlVar = (dbml) bZ.b;
                bK.getClass();
                dsrj<dfef> dsrjVar3 = dbmlVar.a;
                if (!dsrjVar3.a()) {
                    dbmlVar.a = dsqw.cl(dsrjVar3);
                }
                dbmlVar.a.add(bK);
            }
            i++;
            arrayList2 = arrayList;
            z = false;
        }
        return bZ.bK();
    }
}
