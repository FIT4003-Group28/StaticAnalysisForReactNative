package defpackage;
/* compiled from: PG */
/* renamed from: aakv  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aakv implements ayqe {
    public static final /* synthetic */ aakv a = new aakv();

    private /* synthetic */ aakv() {
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        auqk auqkVar = (auqk) obj;
        int i = auqkVar.b;
        if ((i & 16) == 0) {
            if ((i & 65536) != 0) {
                auuf auufVar = auqkVar.v;
                if (auufVar == null) {
                    auufVar = auuf.a;
                }
                auuh auuhVar = auufVar.r;
                if (auuhVar == null) {
                    auuhVar = auuh.a;
                }
                if ((auuhVar.b & 8) != 0) {
                    return ampq.j(new aald(auufVar));
                }
                auuh auuhVar2 = auufVar.r;
                if (auuhVar2 == null) {
                    auuhVar2 = auuh.a;
                }
                if ((auuhVar2.b & 4) != 0) {
                    return ampq.j(new aakp(auufVar));
                }
                if ((auufVar.b & 4194304) != 0) {
                    auuh auuhVar3 = auufVar.r;
                    if (auuhVar3 == null) {
                        auuhVar3 = auuh.a;
                    }
                    aonk aonkVar = null;
                    if (auuhVar3 != null) {
                        int i2 = auuhVar3.b;
                        if ((i2 & 1) != 0) {
                            aonkVar = auuhVar3.c;
                            if (aonkVar == null) {
                                aonkVar = arcy.a;
                            }
                        } else if ((i2 & 2) != 0) {
                            aonkVar = auuhVar3.d;
                            if (aonkVar == null) {
                                aonkVar = arex.a;
                            }
                        } else if ((i2 & 4) != 0) {
                            aonkVar = auuhVar3.e;
                            if (aonkVar == null) {
                                aonkVar = arha.a;
                            }
                        } else if ((i2 & 8) != 0) {
                            aonkVar = auuhVar3.f;
                            if (aonkVar == null) {
                                aonkVar = avwm.a;
                            }
                        } else if ((i2 & 16) != 0) {
                            aonkVar = auuhVar3.g;
                            if (aonkVar == null) {
                                aonkVar = autt.a;
                            }
                        } else if ((i2 & 32) != 0) {
                            aonkVar = auuhVar3.h;
                            if (aonkVar == null) {
                                aonkVar = auts.a;
                            }
                        } else if ((i2 & 64) != 0) {
                            aonkVar = auuhVar3.i;
                            if (aonkVar == null) {
                                aonkVar = arhc.a;
                            }
                        } else if ((i2 & 128) != 0) {
                            aonkVar = auuhVar3.j;
                            if (aonkVar == null) {
                                aonkVar = atfa.a;
                            }
                        } else if ((i2 & 256) != 0) {
                            aonkVar = auuhVar3.k;
                            if (aonkVar == null) {
                                aonkVar = avqf.a;
                            }
                        } else if ((i2 & 512) != 0 && (aonkVar = auuhVar3.l) == null) {
                            aonkVar = avrz.a;
                        }
                    }
                    if (aonkVar != null) {
                        return ampq.j(auufVar);
                    }
                }
            } else {
                aoqu a2 = aakx.a(auqkVar);
                if (a2 != null) {
                    return ampq.j(a2);
                }
            }
            return amon.a;
        }
        aslq aslqVar = auqkVar.j;
        if (aslqVar == null) {
            aslqVar = aslq.a;
        }
        return ampq.j(new aakq(aslqVar));
    }
}
