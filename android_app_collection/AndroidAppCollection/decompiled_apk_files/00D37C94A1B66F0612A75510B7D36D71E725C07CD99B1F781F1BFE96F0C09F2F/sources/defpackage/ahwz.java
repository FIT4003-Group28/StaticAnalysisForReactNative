package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: ahwz  reason: default package */
/* loaded from: classes.dex */
public final class ahwz implements aiby {
    public final ahwx g;
    public volatile boolean h;
    public boolean k;
    private final aafo l;
    private long m;
    public final Map a = DesugarCollections.synchronizedMap(new HashMap());
    public final Map b = DesugarCollections.synchronizedMap(new HashMap());
    public final Map c = DesugarCollections.synchronizedMap(new HashMap());
    public final Map d = DesugarCollections.synchronizedMap(new HashMap());
    public final Map e = DesugarCollections.synchronizedMap(new HashMap());
    public final Map f = DesugarCollections.synchronizedMap(new HashMap());
    public Optional j = Optional.empty();
    public Optional i = Optional.empty();

    public ahwz(aafo aafoVar, ahwx ahwxVar) {
        this.l = aafoVar;
        this.g = ahwxVar;
    }

    private final void o(long j, int i, aicb aicbVar) {
        Optional ofNullable = Optional.ofNullable(m(aicbVar));
        if (!ofNullable.isPresent()) {
            return;
        }
        TimelineMarker timelineMarker = null;
        if (aicbVar.equals(aicb.TIMESTAMP_MARKER)) {
            int length = ((TimelineMarker[]) ofNullable.get()).length;
            while (true) {
                length--;
                if (length >= 0) {
                    if (((TimelineMarker[]) ofNullable.get())[length].a <= j) {
                        timelineMarker = ((TimelineMarker[]) ofNullable.get())[length];
                        break;
                    }
                } else {
                    break;
                }
            }
            p(timelineMarker, aicbVar, i);
            return;
        }
        TimelineMarker[] timelineMarkerArr = (TimelineMarker[]) ofNullable.get();
        int length2 = timelineMarkerArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                break;
            }
            TimelineMarker timelineMarker2 = timelineMarkerArr[i2];
            if (timelineMarker2.a(j)) {
                timelineMarker = timelineMarker2;
                break;
            }
            i2++;
        }
        p(timelineMarker, aicbVar, i);
    }

    private final void p(TimelineMarker timelineMarker, aicb aicbVar, int i) {
        TimelineMarker timelineMarker2 = (TimelineMarker) this.b.get(aicbVar);
        if (akzj.f(timelineMarker, timelineMarker2)) {
            return;
        }
        if (timelineMarker != null) {
            this.b.put(aicbVar, timelineMarker);
        } else {
            this.b.remove(aicbVar);
        }
        f(timelineMarker, aicbVar, i, timelineMarker2);
    }

    public final TimelineMarker a(aicb aicbVar) {
        return (TimelineMarker) this.b.get(aicbVar);
    }

    public final Optional b(aicb aicbVar) {
        TimelineMarker[] timelineMarkerArr;
        Optional ofNullable = Optional.ofNullable(m(aicbVar));
        if (!ofNullable.isPresent() || ((TimelineMarker[]) ofNullable.get()).length == 0) {
            return Optional.empty();
        }
        TimelineMarker timelineMarker = (TimelineMarker) this.b.get(aicbVar);
        if (timelineMarker != null) {
            long j = timelineMarker.b;
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                for (TimelineMarker timelineMarker2 : (TimelineMarker[]) ofNullable.get()) {
                    if (timelineMarker2.a(j2)) {
                        return Optional.of(timelineMarker2);
                    }
                }
                return Optional.empty();
            }
        }
        return Optional.empty();
    }

    public final Optional c(aicb aicbVar) {
        TimelineMarker[] timelineMarkerArr;
        Optional ofNullable = Optional.ofNullable(m(aicbVar));
        if (!ofNullable.isPresent() || ((TimelineMarker[]) ofNullable.get()).length == 0) {
            return Optional.empty();
        }
        TimelineMarker timelineMarker = (TimelineMarker) this.b.get(aicbVar);
        if (timelineMarker != null) {
            long j = timelineMarker.a;
            if (j > 0) {
                long j2 = j - 1;
                for (TimelineMarker timelineMarker2 : (TimelineMarker[]) ofNullable.get()) {
                    if (timelineMarker2.a(j2)) {
                        return Optional.of(timelineMarker2);
                    }
                }
                return Optional.empty();
            }
        }
        return Optional.empty();
    }

    public final void d(String str, apzg apzgVar) {
        if (apzgVar == null) {
            return;
        }
        this.f.put(str, apzgVar);
    }

    public final void e(boolean z, Optional optional) {
        apzg apzgVar;
        this.b.clear();
        this.j = optional;
        if (!optional.isPresent()) {
            return;
        }
        Map map = (Map) this.c.get(optional.get());
        if (map != null) {
            for (aicb aicbVar : map.keySet()) {
                if (!z) {
                    this.d.remove(aicbVar);
                } else {
                    this.d.put(aicbVar, (ahwn) map.get(aicbVar));
                }
                Set<ahwy> set = (Set) this.a.get(aicbVar);
                if (set == null) {
                    return;
                }
                for (ahwy ahwyVar : set) {
                    ahwyVar.c(aicbVar, z);
                }
                if (z) {
                    o(this.m, 0, aicbVar);
                }
            }
            this.g.a(amuk.o(this.d.values()));
        }
        if (z || (apzgVar = (apzg) this.f.get(optional.get())) == null) {
            return;
        }
        this.l.a(apzgVar);
    }

    public final void f(TimelineMarker timelineMarker, aicb aicbVar, int i, TimelineMarker timelineMarker2) {
        apzg apzgVar;
        apzg apzgVar2;
        if (timelineMarker != null && (apzgVar2 = timelineMarker.f) != null) {
            this.l.a(apzgVar2);
        }
        if (timelineMarker == null && this.j.isPresent() && this.e.containsKey(this.j.get()) && (apzgVar = (apzg) this.e.get(this.j.get())) != null) {
            this.l.a(apzgVar);
        }
        Set<ahwy> set = (Set) this.a.get(aicbVar);
        if (set == null) {
            return;
        }
        for (ahwy ahwyVar : set) {
            ahwyVar.nD(timelineMarker2, timelineMarker, aicbVar, i);
        }
    }

    public final void g(String str, boolean z) {
        if (!TextUtils.equals(str, (CharSequence) this.j.orElse(null))) {
            if (!z) {
                return;
            }
            e(true, Optional.ofNullable(str));
        } else if (z) {
        } else {
            e(false, Optional.ofNullable(str));
            e(true, this.i);
        }
    }

    public final void i(aicb aicbVar, ahwy ahwyVar) {
        Set set = (Set) this.a.get(aicbVar);
        if (set == null) {
            set = new CopyOnWriteArraySet();
            this.a.put(aicbVar, set);
        }
        set.add(ahwyVar);
    }

    public final void j(long j, int i) {
        arhr arhrVar;
        if (this.k) {
            return;
        }
        this.m = j;
        for (aicb aicbVar : aicb.values()) {
            o(j, i, aicbVar);
        }
        ahwx ahwxVar = this.g;
        if (i != 2) {
            return;
        }
        azpb azpbVar = ahwxVar.b;
        Optional empty = Optional.empty();
        Iterator it = ahwxVar.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ahww ahwwVar = (ahww) it.next();
            if (ahwwVar.a <= j && ahwwVar.b > j) {
                ahwl ahwlVar = new ahwl();
                arhr arhrVar2 = ahwwVar.d;
                if (arhrVar2 != null) {
                    ahwlVar.b = arhrVar2;
                    CharSequence charSequence = ahwwVar.c;
                    if (charSequence != null) {
                        ahwlVar.a = charSequence;
                        CharSequence charSequence2 = ahwlVar.a;
                        if (charSequence2 == null || (arhrVar = ahwlVar.b) == null) {
                            StringBuilder sb = new StringBuilder();
                            if (ahwlVar.a == null) {
                                sb.append(" label");
                            }
                            if (ahwlVar.b == null) {
                                sb.append(" icon");
                            }
                            String valueOf = String.valueOf(sb);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                            sb2.append("Missing required properties:");
                            sb2.append(valueOf);
                            throw new IllegalStateException(sb2.toString());
                        }
                        empty = Optional.of(new ahwm(charSequence2, arhrVar));
                    } else {
                        throw new NullPointerException("Null label");
                    }
                } else {
                    throw new NullPointerException("Null icon");
                }
            }
        }
        azpbVar.c(empty);
    }

    public final void k(String str, aicb aicbVar, TimelineMarker[] timelineMarkerArr, apzg apzgVar) {
        n(str, aicbVar, new ahwn(timelineMarkerArr), apzgVar);
    }

    public final void l(aicb aicbVar, ahwy ahwyVar) {
        Set set = (Set) this.a.get(aicbVar);
        if (set == null) {
            return;
        }
        set.remove(ahwyVar);
    }

    public final TimelineMarker[] m(aicb aicbVar) {
        ahwn ahwnVar = (ahwn) this.d.get(aicbVar);
        if (ahwnVar == null) {
            return null;
        }
        return (TimelineMarker[]) ahwnVar.a.toArray(new TimelineMarker[0]);
    }

    public final void n(String str, aicb aicbVar, ahwn ahwnVar, apzg apzgVar) {
        Map synchronizedMap;
        if (this.c.containsKey(str)) {
            synchronizedMap = (Map) this.c.get(str);
        } else {
            synchronizedMap = DesugarCollections.synchronizedMap(new HashMap());
            this.c.put(str, synchronizedMap);
        }
        if (synchronizedMap != null) {
            synchronizedMap.put(aicbVar, ahwnVar);
            Set<ahwy> set = (Set) this.a.get(aicbVar);
            if (set != null) {
                for (ahwy ahwyVar : set) {
                    ahwyVar.nw(aicbVar);
                }
            }
        }
        if (apzgVar != null) {
            this.e.put(str, apzgVar);
        }
    }

    @Override // defpackage.aiby
    public final void nt(int i, long j) {
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        this.h = z;
        if (i == 4 || i == 5) {
            return;
        }
        j(j, 2);
    }
}
