package defpackage;

import android.net.Uri;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: xxx  reason: default package */
/* loaded from: classes4.dex */
public final class xxx {
    public final ajqa a;
    public ajrs b;
    private final Map c = new WeakHashMap();

    public xxx(ajqa ajqaVar) {
        this.a = ajqaVar;
    }

    static final Uri l(String str) {
        return ajqa.g(1, "comment", str, "creator_heart_button");
    }

    static final Uri m(String str) {
        return ajqa.g(1, "comment", str, "like_button");
    }

    public static final Uri n(String str) {
        return ajqa.g(1, "comment", str, "poll_renderer");
    }

    public static final Uri o(String str) {
        return ajqa.g(1, "comment", str, "poll_status");
    }

    private static final Uri p(String str) {
        return ajqa.g(1, "comment", str, "dislike_button");
    }

    public final apos a(String str, apzk apzkVar, boolean z) {
        apos aposVar;
        apok apokVar = apzkVar.d;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 2) != 0) {
            apok apokVar2 = apzkVar.d;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            aposVar = apokVar2.d;
            if (aposVar == null) {
                aposVar = apos.a;
            }
        } else {
            aposVar = null;
        }
        return (apos) e(p(str), aposVar, apos.class, apzkVar.h, z);
    }

    public final apos b(String str, apzk apzkVar, boolean z) {
        apos aposVar;
        apok apokVar = apzkVar.c;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 2) != 0) {
            apok apokVar2 = apzkVar.c;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            aposVar = apokVar2.d;
            if (aposVar == null) {
                aposVar = apos.a;
            }
        } else {
            aposVar = null;
        }
        return (apos) e(m(str), aposVar, apos.class, apzkVar.h, z);
    }

    public final aqal c(aqav aqavVar, boolean z) {
        aufe aufeVar;
        aplq aplqVar = aqavVar.B;
        if (aplqVar == null) {
            aplqVar = aplq.a;
        }
        if (aplqVar.b == 99391126) {
            aplq aplqVar2 = aqavVar.B;
            if (aplqVar2 == null) {
                aplqVar2 = aplq.a;
            }
            if (aplqVar2.b == 99391126) {
                aufeVar = (aufe) aplqVar2.c;
            } else {
                aufeVar = aufe.a;
            }
        } else {
            aufeVar = null;
        }
        if (aufeVar != null) {
            aqal b = aqal.b(aqavVar.H);
            if (b == null) {
                b = aqal.COMMENT_POLL_STATUS_UNKNOWN;
            }
            if (b != aqal.COMMENT_POLL_STATUS_UNKNOWN) {
                Uri o = o(aqavVar.i);
                aqal b2 = aqal.b(aqavVar.H);
                if (b2 == null) {
                    b2 = aqal.COMMENT_POLL_STATUS_UNKNOWN;
                }
                return (aqal) e(o, b2, aqal.class, aufeVar.k, z);
            }
        }
        aqal b3 = aqal.b(aqavVar.H);
        return b3 == null ? aqal.COMMENT_POLL_STATUS_UNKNOWN : b3;
    }

    public final aqji d(String str, apzk apzkVar, boolean z) {
        aqji aqjiVar;
        aqjj aqjjVar = apzkVar.f;
        if (aqjjVar == null) {
            aqjjVar = aqjj.a;
        }
        if ((aqjjVar.b & 1) != 0) {
            aqjj aqjjVar2 = apzkVar.f;
            if (aqjjVar2 == null) {
                aqjjVar2 = aqjj.a;
            }
            aqjiVar = aqjjVar2.c;
            if (aqjiVar == null) {
                aqjiVar = aqji.a;
            }
        } else {
            aqjiVar = null;
        }
        return (aqji) e(l(str), aqjiVar, aqji.class, apzkVar.h, z);
    }

    public final Object e(Uri uri, Object obj, Class cls, long j, boolean z) {
        if (obj != null && j != 0) {
            xxv xxvVar = (xxv) this.a.b(uri);
            if (xxvVar == null || xxvVar.b < j) {
                if ((xxvVar == null && z) || (xxvVar != null && xxvVar.b < j)) {
                    this.a.d(uri, new xxv(obj, j));
                }
            } else {
                return cls.cast(xxvVar.a);
            }
        }
        return obj;
    }

    public final void f(Uri uri, xxw xxwVar) {
        xxu xxuVar = new xxu(this, xxwVar);
        this.a.h(uri, xxuVar);
        this.c.put(xxwVar, xxuVar);
    }

    public final void g(xxw xxwVar) {
        ajpz ajpzVar = (ajpz) this.c.remove(xxwVar);
        if (ajpzVar != null) {
            this.a.e(ajpzVar);
        }
    }

    public final void h(String str, long j, apos aposVar, apos aposVar2) {
        if (j == 0) {
            return;
        }
        if (aposVar != null) {
            this.a.c(m(str), new xxv(aposVar, j));
        }
        if (aposVar2 == null) {
            return;
        }
        this.a.c(p(str), new xxv(aposVar2, j));
    }

    public final void i(String str, long j, aqji aqjiVar) {
        if (j == 0 || aqjiVar == null) {
            return;
        }
        this.a.c(l(str), new xxv(aqjiVar, j));
    }

    public final void j(String str, aufe aufeVar) {
        if (aufeVar == null || aufeVar.k == 0) {
            return;
        }
        this.a.c(n(str), new xxv(aufeVar, aufeVar.k));
    }

    public final void k(String str, long j, aqal aqalVar) {
        if (j == 0 || aqalVar == aqal.COMMENT_POLL_STATUS_UNKNOWN) {
            return;
        }
        this.a.c(o(str), new xxv(aqalVar, j));
    }
}
