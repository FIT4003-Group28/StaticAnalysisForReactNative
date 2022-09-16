package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agus  reason: default package */
/* loaded from: classes.dex */
public class agus implements aguu {
    private final aguv a;
    private final agvf b;
    private final snc c;
    private final SharedPreferences d;
    private final aadd e;
    private final agkp f;
    private final yni g;

    public agus(aguv aguvVar, agvf agvfVar, snc sncVar, SharedPreferences sharedPreferences, aadd aaddVar, agkp agkpVar, yni yniVar) {
        this.a = aguvVar;
        this.b = agvfVar;
        this.c = sncVar;
        this.d = sharedPreferences;
        this.e = aaddVar;
        this.f = agkpVar;
        this.g = yniVar;
    }

    private static int h(long j) {
        if (j < 0) {
            return Integer.MAX_VALUE;
        }
        return Math.max(1, (int) j);
    }

    private final int i(String str, agvx agvxVar, atrv atrvVar, long j) {
        atrvVar.getClass();
        agur agurVar = new agur(atrvVar, j);
        this.d.edit().putString(zhn.q("offline_refresh_continuation_token_%s", str), agurVar.a).putLong(zhn.q("offline_refresh_continuation_expiration_%s", str), agurVar.b).apply();
        int i = atrvVar.c;
        if (i > this.f.d()) {
            this.a.e(str, i);
            String.format(Locale.US, "[Offline] Schedule deferred continuation in %d seconds", Integer.valueOf(i));
            return 0;
        }
        String.format(Locale.US, "[Offline] Schedule continuation in %d seconds", Integer.valueOf(i));
        if (i > 0) {
            try {
                Thread.sleep(TimeUnit.SECONDS.toMillis(i));
            } catch (InterruptedException e) {
                zep.d("[Offline] Thread.sleep interrupted: ", e);
                return 1;
            }
        }
        return j(str, agvxVar, atrvVar.b, j);
    }

    private final int j(String str, agvx agvxVar, String str2, long j) {
        arzi arziVar;
        zgh.m(str2);
        agve a = this.b.a();
        str2.getClass();
        a.b = str2;
        try {
            arzh b = this.b.b(a);
            String.format(Locale.US, "[Offline] Offlined video set update count: %d", Integer.valueOf(b.d.size()));
            if ((b.b & 2) != 0) {
                arziVar = b.e;
                if (arziVar == null) {
                    arziVar = arzi.a;
                }
            } else {
                arziVar = null;
            }
            String.valueOf(String.valueOf(arziVar)).length();
            if (b.d.size() > 0) {
                f(str, agvxVar, b.d, b.f, j);
            }
            arzi arziVar2 = b.e;
            if (arziVar2 == null) {
                arziVar2 = arzi.a;
            }
            if ((1 & arziVar2.b) == 0) {
                m(str);
                return 2;
            }
            arzi arziVar3 = b.e;
            if (arziVar3 == null) {
                arziVar3 = arzi.a;
            }
            atrv atrvVar = arziVar3.c;
            if (atrvVar == null) {
                atrvVar = atrv.a;
            }
            return i(str, agvxVar, atrvVar, j);
        } catch (aart unused) {
            this.g.d(new agoj());
            return 1;
        }
    }

    private final arzh k(Collection collection) {
        arzi arziVar;
        ylr.b();
        agve a = this.b.a();
        collection.getClass();
        a.a = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a.a.add((arzm) ((aopa) it.next()).mo39build());
        }
        arzh b = this.b.b(a);
        b.d.size();
        if ((b.b & 2) != 0) {
            arziVar = b.e;
            if (arziVar == null) {
                arziVar = arzi.a;
            }
        } else {
            arziVar = null;
        }
        String.valueOf(String.valueOf(arziVar)).length();
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0011 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.Collection l(defpackage.agvx r24, java.util.Set r25, long r26) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agus.l(agvx, java.util.Set, long):java.util.Collection");
    }

    private final void m(String str) {
        this.d.edit().remove(zhn.q("offline_refresh_continuation_token_%s", str)).remove(zhn.q("offline_refresh_continuation_expiration_%s", str)).apply();
    }

    private final void n() {
        this.g.d(new agol());
    }

    private final void o(agvx agvxVar, List list, long j) {
        ylr.b();
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arzn arznVar = (arzn) it.next();
            atse atseVar = arznVar.b;
            if (atseVar == null) {
                atseVar = atse.a;
            }
            for (arzo arzoVar : arznVar.c) {
                String str = arzoVar.d;
                int ak = akel.ak(atseVar.h);
                if (ak == 0 || ak != 2) {
                    atru atruVar = atru.OFFLINE_REFRESH_ACTION_UNKNOWN;
                    int ak2 = akel.ak(atseVar.h);
                    int i = 1;
                    if (ak2 == 0) {
                        ak2 = 1;
                    }
                    int i2 = ak2 - 1;
                    if (i2 == 2) {
                        sb.append("DELETE");
                    } else if (i2 == 3) {
                        sb.append("DISABLE");
                    } else if (i2 == 4) {
                        sb.append("REFRESH");
                    } else if (i2 == 5) {
                        sb.append("REFRESH_AD");
                    } else if (i2 == 6) {
                        sb.append("DELETE_AD");
                    } else {
                        sb.append("UNEXPECTED_ACTION_");
                        int ak3 = akel.ak(atseVar.h);
                        if (ak3 != 0) {
                            i = ak3;
                        }
                        sb.append(i - 1);
                    }
                    sb.append(" video ");
                    sb.append(str);
                    sb.append("\n");
                }
                e(arzoVar, atseVar, agvxVar, j, agvxVar.l().b(str));
            }
        }
        String valueOf = String.valueOf(sb.toString());
        if (valueOf.length() != 0) {
            "[Offline] Offline refresh results: ".concat(valueOf);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
        if (r1 == 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0133, code lost:
        if (r1 == 1) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010e A[Catch: all -> 0x014b, TryCatch #1 {, blocks: (B:4:0x0005, B:8:0x003c, B:10:0x0043, B:14:0x005b, B:17:0x0060, B:19:0x0069, B:21:0x006f, B:24:0x0078, B:27:0x007f, B:34:0x0094, B:36:0x009a, B:38:0x00ae, B:39:0x00b0, B:41:0x00b4, B:44:0x00bb, B:45:0x00c0, B:47:0x00c6, B:49:0x00d0, B:51:0x00d7, B:50:0x00d4, B:53:0x00dd, B:55:0x00e9, B:60:0x0109, B:62:0x010e, B:64:0x0112, B:65:0x0114, B:67:0x0119, B:69:0x011d, B:70:0x011f, B:72:0x0123, B:73:0x0125, B:57:0x00fd, B:52:0x00da, B:81:0x013a, B:83:0x0140, B:84:0x0146), top: B:94:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.aguu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized int a(java.lang.String r17, defpackage.agvx r18) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agus.a(java.lang.String, agvx):int");
    }

    @Override // defpackage.aguu
    public final arzh b(agvx agvxVar, Set set) {
        long c = this.c.c();
        try {
            arzh k = k(l(agvxVar, set, c));
            o(agvxVar, k.d, c);
            return k;
        } catch (aart unused) {
            return null;
        }
    }

    @Override // defpackage.aguu
    public final synchronized void c(String str, agvx agvxVar) {
        ylr.b();
        m(str);
        this.d.edit().remove(zhn.q("offline_refresh_video_ids_%s", str)).apply();
        this.a.h();
        HashSet hashSet = new HashSet();
        for (agqv agqvVar : agvxVar.m().j()) {
            if (agqvVar.p()) {
                hashSet.add(agqvVar.m());
            }
        }
        if (hashSet.isEmpty()) {
            n();
            return;
        }
        d(str, hashSet);
        this.a.d(str);
    }

    final void d(String str, Set set) {
        this.d.edit().putStringSet(zhn.q("offline_refresh_video_ids_%s", str), set).apply();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
        if (r5 != 5) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(defpackage.arzo r12, defpackage.atse r13, defpackage.agvx r14, long r15, defpackage.agqu r17) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agus.e(arzo, atse, agvx, long, agqu):void");
    }

    final void f(String str, agvx agvxVar, List list, int i, long j) {
        o(agvxVar, list, j);
        if (i > 0) {
            this.a.f(str, i);
        }
    }

    protected final void g(agvx agvxVar, long j, atse atseVar, agqu agquVar) {
        agwd l = agvxVar.l();
        agqt agqtVar = new agqt();
        agqtVar.a = agquVar.a;
        agqtVar.c = agquVar.c;
        agqtVar.e = agquVar.e;
        agqtVar.b = atseVar;
        agqtVar.d = j;
        if (l.k(agqtVar.a())) {
            this.g.d(new agof(agquVar.a));
            return;
        }
        String str = agquVar.a;
        zep.b(str.length() != 0 ? "[Offline] UpdateVideoPolicy failed for video ".concat(str) : new String("[Offline] UpdateVideoPolicy failed for video "));
    }
}
