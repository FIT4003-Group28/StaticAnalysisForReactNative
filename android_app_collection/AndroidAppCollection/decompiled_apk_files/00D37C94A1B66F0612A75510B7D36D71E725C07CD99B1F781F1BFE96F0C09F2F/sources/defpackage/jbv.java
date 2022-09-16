package defpackage;
/* compiled from: PG */
/* renamed from: jbv  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jbv implements ampg {
    public final /* synthetic */ agqv a;
    private final /* synthetic */ int b;

    public /* synthetic */ jbv(agqv agqvVar, int i) {
        this.b = i;
        this.a = agqvVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        agqz agqzVar;
        int i = this.b;
        if (i != 0) {
            boolean z = true;
            if (i == 1) {
                return new jcp((aajs) obj, this.a, 1);
            }
            if (i == 2) {
                return ampr.a(this.a, (Boolean) obj);
            }
            if (i == 3) {
                aqqx aqqxVar = (aqqx) obj;
                return Boolean.valueOf(aqqxVar == null ? this.a.y() : aqqxVar.d);
            } else if (i == 4) {
                agqv agqvVar = this.a;
                Boolean bool = (Boolean) obj;
                if ((agqvVar.i() != agqp.PLAYABLE && !agqvVar.v()) || bool.booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } else if (i == 5) {
                agqv agqvVar2 = this.a;
                Boolean bool2 = (Boolean) obj;
                if (bool2 == null || !bool2.booleanValue()) {
                    z = false;
                }
                if (agss.e(agqvVar2, z)) {
                    if (agqvVar2.E()) {
                        return agqp.TRANSFER_PENDING_USER_APPROVAL;
                    }
                    if (agqvVar2.r()) {
                        return agqp.ERROR_PENDING_PLAYABILITY_ACTION;
                    }
                    if (agqvVar2.w()) {
                        return agqp.ERROR_NOT_PLAYABLE;
                    }
                    if (!z) {
                        agqu agquVar = agqvVar2.j;
                        if (agquVar != null && agqvVar2.x()) {
                            if (agquVar.e()) {
                                return agqp.ERROR_EXPIRED;
                            }
                            return agqp.ERROR_POLICY;
                        } else if (!agqvVar2.a()) {
                            return agqp.ERROR_STREAMS_MISSING;
                        } else {
                            agqe agqeVar = agqe.DELETED;
                            int ordinal = agqvVar2.l.ordinal();
                            if (ordinal == 5) {
                                return agqp.ERROR_DISK;
                            }
                            if (ordinal == 6) {
                                return agqp.ERROR_NETWORK;
                            }
                            if (ordinal == 14) {
                                return agqp.ERROR_STREAMS_OUT_OF_DATE;
                            }
                            return agqp.ERROR_GENERIC;
                        }
                    }
                    return agqp.ERROR_EXPIRED_RENTAL;
                } else if (agqvVar2.b()) {
                    return agqp.PLAYABLE;
                } else {
                    if (!agqvVar2.s()) {
                        if (agqvVar2.C()) {
                            return agqp.TRANSFER_PAUSED;
                        }
                        if (agqvVar2.B()) {
                            if (agqvVar2.z()) {
                                return agqp.ERROR_DISK_SD_CARD;
                            }
                            return agqp.TRANSFER_IN_PROGRESS;
                        }
                        if (agqvVar2.D() && (agqzVar = agqvVar2.o) != null) {
                            int i2 = agqzVar.c;
                            if ((i2 & 2) != 0) {
                                return agqp.TRANSFER_PENDING_NETWORK;
                            }
                            if ((i2 & 8) != 0) {
                                return agqp.TRANSFER_PENDING_WIFI;
                            }
                            if ((i2 & 4096) != 0) {
                                return agqp.TRANSFER_PENDING_STORAGE;
                            }
                        }
                        return agqp.TRANSFER_WAITING_IN_QUEUE;
                    }
                    return agqp.CANDIDATE;
                }
            } else {
                agqv agqvVar3 = this.a;
                Boolean bool3 = (Boolean) obj;
                if (bool3 == null || !bool3.booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(agss.e(agqvVar3, z));
            }
        }
        return new jcp((aajs) obj, this.a);
    }
}
