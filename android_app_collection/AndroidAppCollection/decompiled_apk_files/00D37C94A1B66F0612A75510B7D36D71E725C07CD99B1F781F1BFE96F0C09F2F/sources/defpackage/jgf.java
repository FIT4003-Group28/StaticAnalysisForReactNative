package defpackage;

import j$.util.Optional;
import j$.util.function.Supplier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: jgf  reason: default package */
/* loaded from: classes3.dex */
public final class jgf {
    static final long a = TimeUnit.HOURS.toMillis(12);
    public final Executor b;
    private final agnd c;
    private final snc d;
    private final fbx e;

    public jgf(Executor executor, agnd agndVar, snc sncVar, fbx fbxVar) {
        this.b = executor;
        this.c = agndVar;
        this.d = sncVar;
        this.e = fbxVar;
    }

    public static boolean f(asaa asaaVar) {
        return !aijr.i(asaaVar);
    }

    public static boolean h(avkl avklVar, avkm avkmVar) {
        return avkl.TRANSFER_STATE_TRANSFERRING.equals(avklVar) && avkm.TRANSFER_FAILURE_REASON_EXTERNAL_FILESYSTEM_WRITE.equals(avkmVar);
    }

    public static boolean i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int g = aqvb.g(((auzy) it.next()).f);
            if (g != 0 && g == 4) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(avkl avklVar) {
        return avkl.TRANSFER_STATE_FAILED.equals(avklVar) || avkl.TRANSFER_STATE_UNKNOWN.equals(avklVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ankt a(final Optional optional, final Optional optional2) {
        if (!optional.isPresent() || !optional2.isPresent()) {
            return anlz.q(jiq.TRANSFER_WAITING_IN_QUEUE);
        }
        final avkp g = ((atyp) optional.get()).g();
        if (g == null) {
            return anlz.q(jiq.TRANSFER_PENDING_USER_APPROVAL);
        }
        return anii.h(anko.q(this.c.b(aakj.g(((atyp) optional.get()).d()))), new ampg() { // from class: jgc
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                Optional of;
                jgf jgfVar = jgf.this;
                Optional optional3 = optional;
                Optional optional4 = optional2;
                final avkp avkpVar = g;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                atss atssVar = (atss) optional4.get();
                final avkl transferState = avkpVar.getTransferState();
                avkm failureReason = avkpVar.getFailureReason();
                asaj asajVar = (asaj) aaqp.c(((atyp) optional3.get()).getPlayerResponseBytes().I(), asaj.a);
                if (asajVar == null) {
                    asajVar = asaj.a;
                }
                asaa asaaVar = asajVar.f;
                if (asaaVar == null) {
                    asaaVar = asaa.a;
                }
                List streamProgress = avkpVar.getStreamProgress();
                if (booleanValue || jgf.j(transferState) || jgfVar.g(atssVar) || jgf.h(transferState, failureReason) || jgf.f(asaaVar) || jgf.i(streamProgress)) {
                    if (jgf.f(asaaVar) && aijr.j(asaaVar)) {
                        of = Optional.of(jiq.ERROR_PENDING_PLAYABILITY_ACTION);
                    } else if (jgf.f(asaaVar)) {
                        of = Optional.of(jiq.ERROR_NOT_PLAYABLE);
                    } else if (booleanValue) {
                        of = Optional.of(jiq.ERROR_EXPIRED_RENTAL);
                    } else if (jgfVar.g(atssVar)) {
                        if (jgfVar.e(atssVar)) {
                            of = Optional.of(jiq.ERROR_EXPIRED);
                        } else {
                            of = Optional.of(jiq.ERROR_POLICY);
                        }
                    } else if (!jgf.i(streamProgress)) {
                        if (!avkl.TRANSFER_STATE_FAILED.equals(transferState) || !avkm.TRANSFER_FAILURE_REASON_FILESYSTEM_WRITE.equals(failureReason)) {
                            if (jgf.j(transferState)) {
                                of = Optional.of(jiq.ERROR_GENERIC);
                            } else if (jgf.h(transferState, failureReason)) {
                                of = Optional.of(jiq.ERROR_DISK_SD_CARD);
                            }
                        } else {
                            of = Optional.of(jiq.ERROR_DISK);
                        }
                    } else {
                        of = Optional.of(jiq.ERROR_STREAMS_MISSING);
                    }
                    return (jiq) of.orElseGet(new Supplier() { // from class: jge
                        @Override // j$.util.function.Supplier
                        /* renamed from: get */
                        public final Object mo515get() {
                            avkp avkpVar2 = avkp.this;
                            avkl avklVar = transferState;
                            if (!avkl.TRANSFER_STATE_COMPLETE.equals(avklVar)) {
                                long j = 0;
                                long j2 = 0;
                                for (auzy auzyVar : avkpVar2.getStreamProgress()) {
                                    j += auzyVar.d;
                                    j2 += auzyVar.c;
                                }
                                if ((j > 0 ? ((float) j2) / ((float) j) : 0.0f) != 1.0f) {
                                    if (avkl.TRANSFER_STATE_PAUSED_BY_USER.equals(avklVar)) {
                                        return jiq.TRANSFER_PAUSED;
                                    }
                                    if (avkl.TRANSFER_STATE_TRANSFERRING.equals(avklVar)) {
                                        return jiq.TRANSFER_IN_PROGRESS;
                                    }
                                    return jiq.TRANSFER_WAITING_IN_QUEUE;
                                }
                            }
                            return jiq.PLAYABLE;
                        }
                    });
                }
                of = Optional.empty();
                return (jiq) of.orElseGet(new Supplier() { // from class: jge
                    @Override // j$.util.function.Supplier
                    /* renamed from: get */
                    public final Object mo515get() {
                        avkp avkpVar2 = avkp.this;
                        avkl avklVar = transferState;
                        if (!avkl.TRANSFER_STATE_COMPLETE.equals(avklVar)) {
                            long j = 0;
                            long j2 = 0;
                            for (auzy auzyVar : avkpVar2.getStreamProgress()) {
                                j += auzyVar.d;
                                j2 += auzyVar.c;
                            }
                            if ((j > 0 ? ((float) j2) / ((float) j) : 0.0f) != 1.0f) {
                                if (avkl.TRANSFER_STATE_PAUSED_BY_USER.equals(avklVar)) {
                                    return jiq.TRANSFER_PAUSED;
                                }
                                if (avkl.TRANSFER_STATE_TRANSFERRING.equals(avklVar)) {
                                    return jiq.TRANSFER_IN_PROGRESS;
                                }
                                return jiq.TRANSFER_WAITING_IN_QUEUE;
                            }
                        }
                        return jiq.PLAYABLE;
                    }
                });
            }
        }, this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ankt b(Optional optional, Optional optional2) {
        return anii.h(anko.q(a(optional, optional2)), gvq.t, this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ankt c(final Optional optional, final Optional optional2) {
        if (!optional.isPresent() || !optional2.isPresent()) {
            return anlz.q(false);
        }
        return anii.i(anii.h(anko.q(this.c.a(aakj.g(((atyp) optional.get()).d()))), gvq.u, this.b), new anir() { // from class: jgd
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                jgf jgfVar = jgf.this;
                Optional optional3 = optional;
                Optional optional4 = optional2;
                Optional optional5 = (Optional) obj;
                atyp atypVar = (atyp) optional3.get();
                atss atssVar = (atss) optional4.get();
                if (optional5.isPresent()) {
                    return anlz.q(Boolean.valueOf(((aqqx) optional5.get()).d));
                }
                return anii.h(anko.q(jgfVar.a(Optional.of(atypVar), Optional.of(atssVar))), new ehf(jgfVar.g(atssVar), 7), jgfVar.b);
            }
        }, this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ankt d(Optional optional, Optional optional2) {
        return anii.h(anko.q(a(optional, optional2)), new jgb(optional), this.b);
    }

    public final boolean e(atss atssVar) {
        atse atseVar;
        boolean z;
        int as;
        long c = this.d.c();
        long longValue = atssVar.getExpirationTimestamp().longValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            atseVar = (atse) aopi.parseFrom(atse.a, atssVar.getOfflineStateBytes(), aoos.b());
        } catch (aopx e) {
            zep.d("Failed to get Offline State.", e);
            atseVar = atse.a;
        }
        long convert = longValue - timeUnit.convert(atseVar.g, TimeUnit.SECONDS);
        if (this.e.d() && (as = akel.as(atssVar.getOfflineFutureUnplayableInfo().d)) != 0 && as == 2) {
            if (((atssVar.getOfflineFutureUnplayableInfo() == null || atssVar.getOfflineFutureUnplayableInfo().c < 0) ? 0L : Math.max((atssVar.getLastUpdatedTimestampSeconds().longValue() + atssVar.getOfflineFutureUnplayableInfo().c) - TimeUnit.MILLISECONDS.toSeconds(this.d.c()), 0L)) == 0) {
                z = true;
                return c <= atssVar.getExpirationTimestamp().longValue() || c < convert - a || z;
            }
        }
        z = false;
        if (c <= atssVar.getExpirationTimestamp().longValue()) {
        }
    }

    public final boolean g(atss atssVar) {
        return !atssVar.getAction().equals(atsp.OFFLINE_VIDEO_POLICY_ACTION_OK) || e(atssVar);
    }
}
