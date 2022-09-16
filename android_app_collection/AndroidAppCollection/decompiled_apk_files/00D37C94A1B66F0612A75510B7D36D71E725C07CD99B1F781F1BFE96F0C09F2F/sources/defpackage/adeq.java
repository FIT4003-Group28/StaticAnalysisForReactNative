package defpackage;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: adeq  reason: default package */
/* loaded from: classes.dex */
public final class adeq {
    public static final String a = zep.a("MDX.MediaRouteFilter");
    private static final int[] h = {1, 2, 3, 4, 5, 6, 7};
    public final boolean b;
    public final Executor c;
    public final adgj d;
    private final adfv e;
    private final adnq f;
    private final String g;

    public adeq(adnq adnqVar, adef adefVar, boolean z, bgo bgoVar, String str, Executor executor, adgj adgjVar) {
        this(adnqVar, adefVar, z, new adec(bgoVar), str, executor, adgjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static atbu[] d() {
        int length = h.length;
        atbu[] atbuVarArr = new atbu[7];
        int i = 0;
        while (true) {
            int[] iArr = h;
            int length2 = iArr.length;
            if (i < 7) {
                aopa createBuilder = atbu.a.createBuilder();
                int i2 = iArr[i];
                createBuilder.copyOnWrite();
                atbu atbuVar = (atbu) createBuilder.instance;
                int i3 = i2 - 1;
                if (i2 != 0) {
                    atbuVar.c = i3;
                    atbuVar.b |= 1;
                    createBuilder.copyOnWrite();
                    atbu atbuVar2 = (atbu) createBuilder.instance;
                    atbuVar2.b |= 2;
                    atbuVar2.d = 0;
                    atbuVarArr[i] = (atbu) createBuilder.mo39build();
                    i++;
                } else {
                    throw null;
                }
            } else {
                return atbuVarArr;
            }
        }
    }

    public static final boolean e(bhc bhcVar) {
        return adgj.c(bhcVar) != null;
    }

    private final boolean f(bhc bhcVar) {
        return adgl.d(this.f, bhcVar);
    }

    private final boolean g(bhc bhcVar, Set set) {
        adit aditVar;
        adid adidVar = (adid) this.f.c(bhcVar.q);
        if (adidVar != null && (aditVar = adidVar.n) != null) {
            String replace = aditVar.c.replace("-", "").replace("uuid:", "");
            if (replace.length() >= 16 && set.contains(replace)) {
                return true;
            }
        }
        return false;
    }

    private static final String h(bhc bhcVar, CastDevice castDevice) {
        String b = castDevice.b();
        if (TextUtils.isEmpty(b)) {
            zep.m(a, "empty cast device Id, fallback to parsing route Id");
            b = bhcVar.c;
        }
        String replace = b.replace("-", "");
        return replace.substring(replace.lastIndexOf(":") + 1);
    }

    public final List a(amuk amukVar, Map map) {
        HashSet hashSet = new HashSet();
        for (bhc bhcVar : map.keySet()) {
            Optional optional = (Optional) map.get(bhcVar);
            if (optional != null && optional.isPresent()) {
                hashSet.add(h(bhcVar, (CastDevice) optional.get()));
            }
        }
        ArrayList arrayList = new ArrayList(amukVar);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bhc bhcVar2 = (bhc) it.next();
            if (amps.e(this.g) || Arrays.asList(this.g.split(",")).contains(bhcVar2.d)) {
                Optional optional2 = (Optional) map.get(bhcVar2);
                if (this.e.rk(bhcVar2)) {
                    if (!adgl.i(bhcVar2) || !g(bhcVar2, hashSet)) {
                        if (optional2 == null || !optional2.isPresent() || !adgj.b((CastDevice) optional2.get()) || this.b) {
                            if (c(bhcVar2) && f(bhcVar2)) {
                                it.remove();
                            }
                        } else {
                            it.remove();
                        }
                    } else {
                        it.remove();
                    }
                } else {
                    it.remove();
                }
            } else {
                it.remove();
            }
        }
        return arrayList;
    }

    public final void b(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bhc bhcVar = (bhc) it.next();
            if (e(bhcVar)) {
                hashSet.add(h(bhcVar, adgj.c(bhcVar)));
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            bhc bhcVar2 = (bhc) it2.next();
            if (amps.e(this.g) || Arrays.asList(this.g.split(",")).contains(bhcVar2.d)) {
                if (this.e.rk(bhcVar2)) {
                    if (!adgl.i(bhcVar2) || !g(bhcVar2, hashSet)) {
                        if (!adgj.d(bhcVar2) || this.b) {
                            if (c(bhcVar2) && f(bhcVar2)) {
                                it2.remove();
                            }
                        } else {
                            it2.remove();
                        }
                    } else {
                        it2.remove();
                    }
                } else {
                    it2.remove();
                }
            } else {
                it2.remove();
            }
        }
    }

    public final boolean c(bhc bhcVar) {
        adnq adnqVar = this.f;
        if (adgl.i(bhcVar)) {
            adig c = adnqVar.c(bhcVar.q);
            if (c == null) {
                zep.m(adgl.a, "Route was not found in screen monitor");
                return false;
            }
            return ((adid) c).o();
        }
        return false;
    }

    public adeq(adnq adnqVar, adef adefVar, boolean z, adfv adfvVar, String str, Executor executor, adgj adgjVar) {
        adefVar.getClass();
        adnqVar.getClass();
        this.f = adnqVar;
        this.b = z;
        adfvVar.getClass();
        this.e = adfvVar;
        this.g = str;
        this.c = executor;
        this.d = adgjVar;
    }
}
