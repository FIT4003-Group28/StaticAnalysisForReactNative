package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: vpl  reason: default package */
/* loaded from: classes4.dex */
public final class vpl implements vpk {
    private static final Charset b;
    private static final List c;
    public volatile vpj a;
    private final String f;
    private final Object e = new Object();
    private final Map d = new HashMap(10);

    static {
        new vpl("");
        b = Charset.forName("UTF-8");
        c = new ArrayList();
    }

    private vpl(String str) {
        this.f = str;
    }

    public static long a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(b));
            return ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static synchronized vpl c(String str) {
        synchronized (vpl.class) {
            for (vpl vplVar : c) {
                if (vplVar.f.equals(str)) {
                    return vplVar;
                }
            }
            vpl vplVar2 = new vpl(str);
            c.add(vplVar2);
            return vplVar2;
        }
    }

    public final vpd b(String str, vpf... vpfVarArr) {
        synchronized (this.e) {
            vpd vpdVar = (vpd) this.d.get(str);
            if (vpdVar != null) {
                vpdVar.f(vpfVarArr);
                return vpdVar;
            }
            vpd vpdVar2 = new vpd(str, this, vpfVarArr);
            this.d.put(vpdVar2.b, vpdVar2);
            return vpdVar2;
        }
    }

    public final amoh d() {
        ArrayList arrayList;
        aoel aoelVar;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this.e) {
            for (vpi vpiVar : this.d.values()) {
                HashMap hashMap = new HashMap(vpiVar.c.length > 0 ? 10 : 1);
                vph vphVar = new vph(vpiVar.b, vpiVar.c);
                synchronized (vpiVar.a) {
                    vphVar.c = vpiVar.d;
                    vphVar.d = vpiVar.e;
                    vpiVar.d = hashMap;
                    vpiVar.e = 0;
                }
                arrayList3.add(vphVar);
            }
        }
        aopa createBuilder = amoh.a.createBuilder();
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            vph vphVar2 = (vph) arrayList3.get(i);
            if (vphVar2.d == 0) {
                aoelVar = null;
                arrayList = arrayList3;
            } else {
                aopa createBuilder2 = aoel.a.createBuilder();
                long a = a(vphVar2.a);
                createBuilder2.copyOnWrite();
                aoel aoelVar2 = (aoel) createBuilder2.instance;
                aoelVar2.b |= 2;
                aoelVar2.c = a;
                for (vpf vpfVar : vphVar2.b) {
                    long a2 = a(vpfVar.a);
                    createBuilder2.copyOnWrite();
                    aoel aoelVar3 = (aoel) createBuilder2.instance;
                    aopt aoptVar = aoelVar3.d;
                    if (!aoptVar.c()) {
                        aoelVar3.d = aopi.mutableCopy(aoptVar);
                    }
                    aoelVar3.d.f(a2);
                }
                for (Map.Entry entry : vphVar2.c.entrySet()) {
                    aopa createBuilder3 = aoek.a.createBuilder();
                    voy voyVar = (voy) entry.getKey();
                    voz vozVar = (voz) entry.getValue();
                    if (vphVar2.b.length > 0) {
                        String str = vphVar2.a;
                        ArrayList arrayList4 = new ArrayList(voyVar.c.length);
                        int i2 = 0;
                        while (i2 < voyVar.c.length) {
                            aopa createBuilder4 = aoei.a.createBuilder();
                            Object obj = voyVar.c[i2];
                            ArrayList arrayList5 = arrayList3;
                            if (obj instanceof String) {
                                String str2 = (String) obj;
                                createBuilder4.copyOnWrite();
                                aoei aoeiVar = (aoei) createBuilder4.instance;
                                str2.getClass();
                                aoeiVar.b = 1;
                                aoeiVar.c = str2;
                            } else if (obj instanceof Integer) {
                                int intValue = ((Integer) obj).intValue();
                                createBuilder4.copyOnWrite();
                                aoei aoeiVar2 = (aoei) createBuilder4.instance;
                                aoeiVar2.b = 2;
                                aoeiVar2.c = Integer.valueOf(intValue);
                            } else if (obj instanceof Boolean) {
                                boolean booleanValue = ((Boolean) obj).booleanValue();
                                createBuilder4.copyOnWrite();
                                aoei aoeiVar3 = (aoei) createBuilder4.instance;
                                aoeiVar3.b = 3;
                                aoeiVar3.c = Boolean.valueOf(booleanValue);
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
                            arrayList4.add((aoei) createBuilder4.mo39build());
                            i2++;
                            arrayList3 = arrayList5;
                        }
                        arrayList2 = arrayList3;
                        createBuilder3.copyOnWrite();
                        aoek aoekVar = (aoek) createBuilder3.instance;
                        aopu aopuVar = aoekVar.c;
                        if (!aopuVar.c()) {
                            aoekVar.c = aopi.mutableCopy(aopuVar);
                        }
                        aonk.addAll((Iterable) arrayList4, (List) aoekVar.c);
                    } else {
                        arrayList2 = arrayList3;
                    }
                    aoej a3 = vozVar.a();
                    createBuilder3.copyOnWrite();
                    aoek aoekVar2 = (aoek) createBuilder3.instance;
                    a3.getClass();
                    aoekVar2.d = a3;
                    aoekVar2.b |= 1;
                    createBuilder2.copyOnWrite();
                    aoel aoelVar4 = (aoel) createBuilder2.instance;
                    aoek aoekVar3 = (aoek) createBuilder3.mo39build();
                    aoekVar3.getClass();
                    aopu aopuVar2 = aoelVar4.e;
                    if (!aopuVar2.c()) {
                        aoelVar4.e = aopi.mutableCopy(aopuVar2);
                    }
                    aoelVar4.e.add(aoekVar3);
                    arrayList3 = arrayList2;
                }
                arrayList = arrayList3;
                aoelVar = (aoel) createBuilder2.mo39build();
            }
            if (aoelVar != null) {
                createBuilder.copyOnWrite();
                amoh amohVar = (amoh) createBuilder.instance;
                aopu aopuVar3 = amohVar.b;
                if (!aopuVar3.c()) {
                    amohVar.b = aopi.mutableCopy(aopuVar3);
                }
                amohVar.b.add(aoelVar);
            }
            i++;
            arrayList3 = arrayList;
        }
        return (amoh) createBuilder.mo39build();
    }

    public final vpg e(String str, vpf... vpfVarArr) {
        synchronized (this.e) {
            vpg vpgVar = (vpg) this.d.get(str);
            if (vpgVar != null) {
                vpgVar.f(vpfVarArr);
                return vpgVar;
            }
            vpg vpgVar2 = new vpg(str, this, vpfVarArr);
            this.d.put(vpgVar2.b, vpgVar2);
            return vpgVar2;
        }
    }
}
