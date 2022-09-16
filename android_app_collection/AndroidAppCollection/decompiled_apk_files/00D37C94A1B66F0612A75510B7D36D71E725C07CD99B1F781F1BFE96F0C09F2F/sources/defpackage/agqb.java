package defpackage;

import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: agqb  reason: default package */
/* loaded from: classes.dex */
public final class agqb {
    private static final Set d = Collections.unmodifiableSet(new HashSet(Arrays.asList(18, 93, 134, 243)));
    private static final Set e = Collections.unmodifiableSet(new HashSet(Arrays.asList(22, 95, 136, 247)));
    public attl a;
    public final Spanned b;
    public final Spanned c;

    @Deprecated
    private agqb(aqzu aqzuVar, attl attlVar) {
        arag aragVar;
        attl attlVar2 = attl.UNKNOWN_FORMAT_TYPE;
        this.a = attlVar;
        arag aragVar2 = null;
        if ((aqzuVar.b & 1) != 0) {
            aragVar = aqzuVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        this.b = ajgl.b(aragVar);
        if ((aqzuVar.b & 2) != 0 && (aragVar2 = aqzuVar.d) == null) {
            aragVar2 = arag.a;
        }
        this.c = ajgl.b(aragVar2);
    }

    public static amuk a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            agqb agqbVar = (agqb) it.next();
            aopa createBuilder = aqnl.a.createBuilder();
            String obj = agqbVar.b.toString();
            createBuilder.copyOnWrite();
            aqnl aqnlVar = (aqnl) createBuilder.instance;
            obj.getClass();
            aqnlVar.b |= 1;
            aqnlVar.c = obj;
            String obj2 = agqbVar.c.toString();
            createBuilder.copyOnWrite();
            aqnl aqnlVar2 = (aqnl) createBuilder.instance;
            obj2.getClass();
            aqnlVar2.b |= 4;
            aqnlVar2.e = obj2;
            attl attlVar = agqbVar.a;
            createBuilder.copyOnWrite();
            aqnl aqnlVar3 = (aqnl) createBuilder.instance;
            aqnlVar3.d = attlVar.k;
            aqnlVar3.b |= 2;
            arrayList.add((aqnl) createBuilder.mo39build());
        }
        return amuk.o(arrayList);
    }

    public static List b(List list) {
        arag h;
        arag h2;
        aopi mo39build;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aqnl aqnlVar = (aqnl) it.next();
            aopa createBuilder = attk.a.createBuilder();
            if ((aqnlVar.b & 1) == 0) {
                h = ajgl.h("");
            } else {
                h = ajgl.h(aqnlVar.c);
            }
            createBuilder.copyOnWrite();
            attk attkVar = (attk) createBuilder.instance;
            h.getClass();
            attkVar.c = h;
            attkVar.b |= 1;
            if ((aqnlVar.b & 4) == 0) {
                h2 = ajgl.h("");
            } else {
                h2 = ajgl.h(aqnlVar.e);
            }
            createBuilder.copyOnWrite();
            attk attkVar2 = (attk) createBuilder.instance;
            h2.getClass();
            attkVar2.d = h2;
            attkVar2.b |= 2;
            if ((aqnlVar.b & 2) == 0) {
                mo39build = createBuilder.mo39build();
            } else {
                attl b = attl.b(aqnlVar.d);
                if (b == null) {
                    b = attl.UNKNOWN_FORMAT_TYPE;
                }
                createBuilder.copyOnWrite();
                attk attkVar3 = (attk) createBuilder.instance;
                attkVar3.e = b.k;
                attkVar3.b |= 4;
                mo39build = createBuilder.mo39build();
            }
            arrayList.add(new agqb((attk) mo39build));
        }
        return arrayList;
    }

    public static List c(attp attpVar) {
        String str;
        ArrayList arrayList = new ArrayList();
        attn attnVar = attpVar.g;
        if (attnVar == null) {
            attnVar = attn.a;
        }
        aqzv aqzvVar = attnVar.b;
        if (aqzvVar == null) {
            aqzvVar = aqzv.a;
        }
        if (aqzvVar.c.size() <= 0) {
            if (aqzvVar.b.size() <= 0) {
                for (attk attkVar : attpVar.e) {
                    aopa createBuilder = aqnl.a.createBuilder();
                    String str2 = "";
                    if ((attkVar.b & 1) != 0) {
                        arag aragVar = attkVar.c;
                        if (aragVar == null) {
                            aragVar = arag.a;
                        }
                        str = ajgl.b(aragVar).toString();
                    } else {
                        str = str2;
                    }
                    createBuilder.copyOnWrite();
                    aqnl aqnlVar = (aqnl) createBuilder.instance;
                    str.getClass();
                    aqnlVar.b |= 1;
                    aqnlVar.c = str;
                    if ((attkVar.b & 2) != 0) {
                        arag aragVar2 = attkVar.d;
                        if (aragVar2 == null) {
                            aragVar2 = arag.a;
                        }
                        str2 = ajgl.b(aragVar2).toString();
                    }
                    createBuilder.copyOnWrite();
                    aqnl aqnlVar2 = (aqnl) createBuilder.instance;
                    str2.getClass();
                    aqnlVar2.b |= 4;
                    aqnlVar2.e = str2;
                    if ((attkVar.b & 4) != 0) {
                        attl b = attl.b(attkVar.e);
                        if (b == null) {
                            b = attl.UNKNOWN_FORMAT_TYPE;
                        }
                        createBuilder.copyOnWrite();
                        aqnl aqnlVar3 = (aqnl) createBuilder.instance;
                        aqnlVar3.d = b.k;
                        aqnlVar3.b |= 2;
                    }
                    if ((attkVar.b & 8) != 0) {
                        attj b2 = attj.b(attkVar.f);
                        if (b2 == null) {
                            b2 = attj.OFFLINEABILITY_AVAILABILITY_TYPE_UNKNOWN;
                        }
                        createBuilder.copyOnWrite();
                        aqnl aqnlVar4 = (aqnl) createBuilder.instance;
                        aqnlVar4.f = b2.e;
                        aqnlVar4.b |= 8;
                    }
                    if ((attkVar.b & 16) != 0) {
                        boolean z = attkVar.g;
                        createBuilder.copyOnWrite();
                        aqnl aqnlVar5 = (aqnl) createBuilder.instance;
                        aqnlVar5.b |= 16;
                        aqnlVar5.g = z;
                    }
                    arrayList.add((aqnl) createBuilder.mo39build());
                }
            } else {
                for (aqzu aqzuVar : aqzvVar.b) {
                    arrayList.add(e(aqzuVar));
                }
            }
        } else {
            for (aqzu aqzuVar2 : aqzvVar.c) {
                arrayList.add(e(aqzuVar2));
            }
        }
        return arrayList;
    }

    @Deprecated
    public static Map d(attp attpVar) {
        HashMap hashMap = new HashMap();
        attn attnVar = attpVar.g;
        if (attnVar == null) {
            attnVar = attn.a;
        }
        aqzv aqzvVar = attnVar.b;
        if (aqzvVar == null) {
            aqzvVar = aqzv.a;
        }
        if (aqzvVar.c.size() <= 0) {
            attn attnVar2 = attpVar.g;
            if (attnVar2 == null) {
                attnVar2 = attn.a;
            }
            aqzv aqzvVar2 = attnVar2.b;
            if (aqzvVar2 == null) {
                aqzvVar2 = aqzv.a;
            }
            if (aqzvVar2.b.size() <= 0) {
                for (attk attkVar : attpVar.e) {
                    attl b = attl.b(attkVar.e);
                    if (b == null) {
                        b = attl.UNKNOWN_FORMAT_TYPE;
                    }
                    hashMap.put(b, new agqb(attkVar));
                }
            } else {
                attn attnVar3 = attpVar.g;
                if (attnVar3 == null) {
                    attnVar3 = attn.a;
                }
                aqzv aqzvVar3 = attnVar3.b;
                if (aqzvVar3 == null) {
                    aqzvVar3 = aqzv.a;
                }
                for (aqzu aqzuVar : aqzvVar3.b) {
                    attl f = f(aqzuVar);
                    if (hashMap.get(f) != null) {
                        String valueOf = String.valueOf(f);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                        sb.append("Overwriting format for: ");
                        sb.append(valueOf);
                        zep.l(sb.toString());
                    }
                    hashMap.put(f, new agqb(aqzuVar, f));
                }
            }
        } else {
            attn attnVar4 = attpVar.g;
            if (attnVar4 == null) {
                attnVar4 = attn.a;
            }
            aqzv aqzvVar4 = attnVar4.b;
            if (aqzvVar4 == null) {
                aqzvVar4 = aqzv.a;
            }
            for (aqzu aqzuVar2 : aqzvVar4.c) {
                attl f2 = f(aqzuVar2);
                if (hashMap.get(f2) != null) {
                    String valueOf2 = String.valueOf(f2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
                    sb2.append("Overwriting format for: ");
                    sb2.append(valueOf2);
                    zep.l(sb2.toString());
                }
                hashMap.put(f2, new agqb(aqzuVar2, f2));
            }
        }
        return hashMap;
    }

    private static aqnl e(aqzu aqzuVar) {
        String str;
        aopa createBuilder = aqnl.a.createBuilder();
        String str2 = "";
        if ((aqzuVar.b & 1) != 0) {
            arag aragVar = aqzuVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            str = ajgl.b(aragVar).toString();
        } else {
            str = str2;
        }
        createBuilder.copyOnWrite();
        aqnl aqnlVar = (aqnl) createBuilder.instance;
        str.getClass();
        aqnlVar.b |= 1;
        aqnlVar.c = str;
        if ((aqzuVar.b & 2) != 0) {
            arag aragVar2 = aqzuVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            str2 = ajgl.b(aragVar2).toString();
        }
        createBuilder.copyOnWrite();
        aqnl aqnlVar2 = (aqnl) createBuilder.instance;
        str2.getClass();
        aqnlVar2.b |= 4;
        aqnlVar2.e = str2;
        attl f = f(aqzuVar);
        createBuilder.copyOnWrite();
        aqnl aqnlVar3 = (aqnl) createBuilder.instance;
        aqnlVar3.d = f.k;
        aqnlVar3.b |= 2;
        return (aqnl) createBuilder.mo39build();
    }

    private static attl f(aqzu aqzuVar) {
        Set set = d;
        aqzt aqztVar = aqzuVar.e;
        if (aqztVar == null) {
            aqztVar = aqzt.a;
        }
        if (set.contains(Integer.valueOf(aqztVar.b))) {
            return attl.SD;
        }
        Set set2 = e;
        aqzt aqztVar2 = aqzuVar.e;
        if (aqztVar2 == null) {
            aqztVar2 = aqzt.a;
        }
        if (set2.contains(Integer.valueOf(aqztVar2.b))) {
            return attl.HD;
        }
        return attl.LD;
    }

    @Deprecated
    public agqb(attk attkVar) {
        this.a = attl.UNKNOWN_FORMAT_TYPE;
        attl b = attl.b(attkVar.e);
        this.a = b == null ? attl.UNKNOWN_FORMAT_TYPE : b;
        arag aragVar = attkVar.c;
        this.b = ajgl.b(aragVar == null ? arag.a : aragVar);
        arag aragVar2 = attkVar.d;
        this.c = ajgl.b(aragVar2 == null ? arag.a : aragVar2);
    }

    @Deprecated
    public agqb(attl attlVar, Spanned spanned, Spanned spanned2) {
        attl attlVar2 = attl.UNKNOWN_FORMAT_TYPE;
        this.a = attlVar;
        this.b = spanned;
        this.c = spanned2;
    }
}
