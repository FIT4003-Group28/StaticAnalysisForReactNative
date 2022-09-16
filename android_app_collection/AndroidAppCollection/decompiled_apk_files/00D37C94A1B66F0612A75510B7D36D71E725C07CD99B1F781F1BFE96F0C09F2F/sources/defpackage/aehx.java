package defpackage;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: aehx  reason: default package */
/* loaded from: classes.dex */
public final class aehx {
    public final ati a;
    public final aehw b;
    public final aenr c;
    private final ScheduledExecutorService d;
    private Future e;

    public aehx(ati atiVar, ScheduledExecutorService scheduledExecutorService, aenr aenrVar) {
        afms.a(atiVar);
        this.a = atiVar;
        afms.a(scheduledExecutorService);
        this.d = scheduledExecutorService;
        afms.a(aenrVar);
        this.c = aenrVar;
        this.b = new aehw(new aehv() { // from class: aehs
            @Override // defpackage.aehv
            public final void a(int i, int i2, ByteBuffer byteBuffer) {
                aenr aenrVar2 = aehx.this.c;
                try {
                    aenq aenqVar = aenrVar2.c;
                    if (aenqVar.e == null) {
                        orm a = orm.a(i);
                        if (a == null) {
                            aenqVar.b = orm.UNKNOWN;
                            aenm aenmVar = aenqVar.a;
                            StringBuilder sb = new StringBuilder(54);
                            sb.append("OnesieMultipartWrapper: Unknown part type: ");
                            sb.append(i);
                            aenmVar.h(new aenn(109, sb.toString()));
                            return;
                        }
                        aenqVar.b = a;
                        if (aenqVar.b != orm.MEDIA && aenqVar.b != orm.ONESIE_ENCRYPTED_MEDIA && aenqVar.b != orm.MEDIA_END) {
                            aenqVar.e = ByteBuffer.allocate(byteBuffer.remaining() + i2);
                            aenqVar.d = ByteBuffer.allocate(0);
                        }
                        if (byteBuffer.remaining() > 0) {
                            int a2 = aefn.a(byteBuffer.get(byteBuffer.position()));
                            aenqVar.e = ByteBuffer.allocate((byteBuffer.remaining() + i2) - a2);
                            aenqVar.d = ByteBuffer.allocate(a2);
                        } else {
                            aenqVar.e = ByteBuffer.allocate(0);
                            aenqVar.d = ByteBuffer.allocate(0);
                        }
                    }
                    aenq.a(byteBuffer, aenqVar.d);
                    aenq.a(byteBuffer, aenqVar.e);
                    if (i2 != 0) {
                        return;
                    }
                    aenqVar.e.rewind();
                    aenqVar.d.rewind();
                    if (aenqVar.c != null && aenqVar.b != orm.ONESIE_DATA) {
                        aenqVar.d(aenqVar.c);
                    }
                    ByteBuffer byteBuffer2 = aenqVar.e;
                    if (byteBuffer2 == null) {
                        aenqVar.a.h(new aenn(110, "OnesieMultipartWrapper: Part completed with no data present."));
                        if (aenqVar.b != orm.ONESIE_HEADER) {
                            aenqVar.c = null;
                        }
                        aenqVar.e = null;
                        return;
                    }
                    orm ormVar = orm.UNKNOWN;
                    switch (aenqVar.b.ordinal()) {
                        case 1:
                            aenqVar.c = (org) ((aopa) org.a.createBuilder().mo38mergeFrom(byteBuffer2.array(), aoos.b())).mo39build();
                            break;
                        case 2:
                            org orgVar = aenqVar.c;
                            if (orgVar != null) {
                                aenqVar.c(orgVar, byteBuffer2.array());
                                break;
                            } else {
                                aenqVar.a.h(new aenn(110, "OnesieMultipartWrapper: OnesieData present without succeeding OnesieHeader"));
                                break;
                            }
                        case 3:
                        case 5:
                        case 6:
                            ByteBuffer byteBuffer3 = aenqVar.d;
                            if (byteBuffer3 != null) {
                                Integer b = aefn.b(byteBuffer3);
                                String str = "MEDIA";
                                if (b == null) {
                                    Object[] objArr = new Object[1];
                                    if (aenqVar.b == orm.ONESIE_ENCRYPTED_MEDIA) {
                                        str = "ONESIE_ENCRYPTED_MEDIA";
                                    } else if (aenqVar.b != orm.MEDIA) {
                                        str = "MEDIA_END";
                                    }
                                    objArr[0] = str;
                                    throw new aenn(111, String.format("UMP part %s with missing embedded header id", objArr));
                                }
                                if (aenqVar.f.containsKey(b) && aenqVar.g.containsKey(b)) {
                                    if (aenqVar.b != orm.MEDIA_END) {
                                        if (aenqVar.b == orm.ONESIE_ENCRYPTED_MEDIA) {
                                            aenqVar.b(byteBuffer2.array(), b, false, true);
                                            break;
                                        } else {
                                            aenqVar.b(byteBuffer2.array(), b, false, false);
                                            break;
                                        }
                                    } else {
                                        aenqVar.b(new byte[0], b, true, false);
                                        break;
                                    }
                                }
                                aenm aenmVar2 = aenqVar.a;
                                Object[] objArr2 = new Object[1];
                                if (aenqVar.b == orm.ONESIE_ENCRYPTED_MEDIA) {
                                    str = "ONESIE_ENCRYPTED_MEDIA";
                                } else if (aenqVar.b != orm.MEDIA) {
                                    str = "MEDIA_END";
                                }
                                objArr2[0] = str;
                                aenmVar2.h(new aenn(111, String.format("OnesieMultipartWrapper UMP part %s passed with unseen header id", objArr2)));
                                break;
                            } else {
                                throw new aenn(111, String.format("UMP part %s with null header id", aenqVar.b.name()));
                            }
                            break;
                        case 4:
                            orc orcVar = (orc) aopi.parseFrom(orc.a, byteBuffer2.array());
                            if ((orcVar.b & 1) != 0) {
                                aenqVar.f.put(Integer.valueOf(orcVar.c), orcVar);
                                aenqVar.g.put(Integer.valueOf(orcVar.c), Long.valueOf((orcVar.b & 32) != 0 ? orcVar.h : 0L));
                                break;
                            } else {
                                aenqVar.a.h(new aenn(111, "OnesieMultipartWrapper: MediaHeader does not contain HeaderId"));
                                break;
                            }
                        case 7:
                            aqfn aqfnVar = (aqfn) aopi.parseFrom(aqfn.a, byteBuffer2.array(), aoos.b());
                            break;
                        case 8:
                            orj orjVar = (orj) aopi.parseFrom(orj.a, byteBuffer2.array(), aoos.b());
                            aenm aenmVar3 = aenqVar.a;
                            ((aeks) aenmVar3).f(orjVar.c);
                            ((aeks) aenmVar3).a.e(orjVar);
                            break;
                        case 9:
                            oqx oqxVar = (oqx) aopi.parseFrom(oqx.a, byteBuffer2.array(), aoos.b());
                            aenm aenmVar4 = aenqVar.a;
                            ((aeks) aenmVar4).f(oqxVar.d);
                            ((aeks) aenmVar4).a.d(oqxVar);
                            break;
                        case 10:
                            ori oriVar = (ori) aopi.parseFrom(ori.a, byteBuffer2.array(), aoos.b());
                            aenm aenmVar5 = aenqVar.a;
                            ((aeks) aenmVar5).f(oriVar.b);
                            ((aeks) aenmVar5).a.f(oriVar);
                            break;
                        case 11:
                            ori oriVar2 = (ori) aopi.parseFrom(ori.a, byteBuffer2.array(), aoos.b());
                            ((aeks) aenqVar.a).a.r();
                            break;
                        case 13:
                            oqw oqwVar = (oqw) aopi.parseFrom(oqw.a, byteBuffer2.array(), aoos.b());
                            aenqVar.a.e(oqwVar.d, amvn.p(oqwVar.c));
                            break;
                    }
                    if (aenqVar.b != orm.ONESIE_HEADER) {
                        aenqVar.c = null;
                    }
                    aenqVar.e = null;
                } catch (aenn | aopx e) {
                    aenrVar2.b.d(e);
                }
            }
        });
    }

    public final synchronized void a() {
        Future future = this.e;
        if (future != null) {
            future.cancel(true);
            this.e = null;
        }
    }

    public final synchronized void b(asy asyVar) {
        if (this.e == null) {
            this.e = this.d.submit(new aehu(this, asyVar));
        }
    }

    public static boolean c(Map map) {
        if (map == null) {
            throw new aeht(3, "Response headers missing");
        }
        List list = (List) map.get("Content-Type");
        if (list == null) {
            throw new aeht(3, "Content-Type header missing");
        }
        return ((String) list.get(0)).contains("application/vnd.yt-ump");
    }
}
