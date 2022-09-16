package defpackage;

import com.google.android.libraries.youtube.ads.model.PlayerAd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: emw  reason: default package */
/* loaded from: classes3.dex */
public final class emw implements ynl {
    private final aafo a;
    private final PriorityQueue b = new PriorityQueue();
    private long c;
    private boolean d;

    public emw(aafo aafoVar) {
        this.a = aafoVar;
    }

    public final void a() {
        this.b.clear();
        this.c = 0L;
        this.d = false;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        Collection emptyList;
        long round;
        if (i != -1) {
            if (i == 0) {
                if (((wxo) obj).a() == wzq.VIDEO_ENDED) {
                    while (!this.b.isEmpty()) {
                        this.a.c(((emv) this.b.poll()).b, null);
                    }
                }
                a();
                return null;
            } else if (i != 1) {
                if (i == 2) {
                    if (((ahhw) obj).c() != aika.VIDEO_REQUESTED) {
                        return null;
                    }
                    this.d = true;
                    return null;
                } else if (i == 3) {
                    ahhx ahhxVar = (ahhx) obj;
                    if (this.d) {
                        return null;
                    }
                    long e = ahhxVar.e();
                    if (e < this.c) {
                        return null;
                    }
                    while (!this.b.isEmpty() && e >= ((emv) this.b.peek()).a) {
                        this.a.c(((emv) this.b.poll()).b, null);
                    }
                    this.c = e;
                    return null;
                } else {
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unsupported op code: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                wxr wxrVar = (wxr) obj;
                if (wxrVar.a() != wxq.AD_VIDEO_PLAY_REQUESTED) {
                    return null;
                }
                a();
                PlayerAd c = wxrVar.c();
                if (c == null) {
                    return null;
                }
                for (apbf apbfVar : c.y()) {
                    long millis = TimeUnit.SECONDS.toMillis(c.c());
                    if ((apbfVar.b & 1) != 0) {
                        apbg apbgVar = apbfVar.c;
                        if (apbgVar == null) {
                            apbgVar = apbg.a;
                        }
                        int c2 = apdw.c(apbgVar.b);
                        if (c2 == 0) {
                            c2 = 1;
                        }
                        int i2 = c2 - 1;
                        if (i2 == 1) {
                            round = Math.round(apbgVar.c * ((float) millis));
                        } else if (i2 == 2) {
                            round = apbgVar.d;
                        } else {
                            emptyList = Collections.emptyList();
                        }
                        ArrayList arrayList = new ArrayList();
                        if ((apbfVar.b & 2) != 0) {
                            apzg apzgVar = apbfVar.d;
                            if (apzgVar == null) {
                                apzgVar = apzg.a;
                            }
                            arrayList.add(new emv(round, apzgVar));
                        }
                        if ((apbfVar.b & 4) != 0) {
                            apzg apzgVar2 = apbfVar.e;
                            if (apzgVar2 == null) {
                                apzgVar2 = apzg.a;
                            }
                            arrayList.add(new emv(round, apzgVar2));
                        }
                        emptyList = amuk.o(arrayList);
                    } else {
                        emptyList = Collections.emptyList();
                    }
                    this.b.addAll(emptyList);
                }
                return null;
            }
        }
        return new Class[]{wxo.class, wxr.class, ahhw.class, ahhx.class};
    }
}
