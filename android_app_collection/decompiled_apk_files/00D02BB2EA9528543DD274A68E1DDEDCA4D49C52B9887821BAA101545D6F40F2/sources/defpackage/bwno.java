package defpackage;

import android.os.SystemClock;
import java.util.List;
/* compiled from: PG */
/* renamed from: bwno  reason: default package */
/* loaded from: classes4.dex */
public final class bwno extends bttk<dvto, dvts> {
    public final dvto a;
    public final boolean b;
    public final boolean c;
    @dzsi
    public final dtjs d;
    @dzsi
    public volatile dvts e;
    public long f;
    @dzsi
    public bwjl g;

    public bwno(dvto dvtoVar, @dzsi btlu btluVar, boolean z, boolean z2, @dzsi dtjs dtjsVar) {
        dunt duntVar = dunt.UNKNOWN_REQUEST_ID;
        bvrj bvrjVar = bvrj.CURRENT;
        this.a = dvtoVar;
        this.i = btluVar == null ? btlu.b : btluVar;
        this.b = z;
        this.c = z2;
        this.d = dtjsVar;
    }

    @Override // defpackage.bttu
    protected final synchronized void a(@dzsi bttq bttqVar) {
        List<bwjj> remove;
        dtkj dtkjVar;
        dtja dtjaVar;
        ckha ckhaVar;
        ckha ckhaVar2;
        bwjl bwjlVar = this.g;
        if (bwjlVar != null) {
            bvrj.UI_THREAD.c();
            if (bttqVar == null) {
                ckcw ckcwVar = bwjlVar.b;
                long elapsedRealtime = this.f == 0 ? -1L : SystemClock.elapsedRealtime() - this.f;
                if (elapsedRealtime >= 0) {
                    dtnd dtndVar = this.a.b;
                    if (dtndVar == null) {
                        dtndVar = dtnd.l;
                    }
                    dtjb dtjbVar = dtndVar.e;
                    if (dtjbVar == null) {
                        dtjbVar = dtjb.h;
                    }
                    dvts dvtsVar = this.e;
                    ckha ckhaVar3 = null;
                    if (dvtsVar == null) {
                        dtjaVar = dtja.INVALID_UI_TYPE;
                    } else {
                        dtnd dtndVar2 = this.a.b;
                        if (dtndVar2 == null) {
                            dtndVar2 = dtnd.l;
                        }
                        dtjb dtjbVar2 = dtndVar2.e;
                        if (dtjbVar2 == null) {
                            dtjbVar2 = dtjb.h;
                        }
                        dtiy b = dtiy.b(dtjbVar2.d);
                        if (b == null) {
                            b = dtiy.FETCH_ON_DEMAND;
                        }
                        if (b != dtiy.FETCH_ON_DEMAND) {
                            dtnh dtnhVar = dvtsVar.a;
                            if (dtnhVar == null) {
                                dtnhVar = dtnh.g;
                            }
                            dsrj<dtmr> dsrjVar = dtnhVar.c;
                            int size = dsrjVar.size();
                            while (true) {
                                size--;
                                if (size < 0) {
                                    dtkjVar = null;
                                    break;
                                }
                                dtmr dtmrVar = dsrjVar.get(size);
                                if ((dtmrVar.a & 32) != 0) {
                                    dtkjVar = dtmrVar.g;
                                    if (dtkjVar == null) {
                                        dtkjVar = dtkj.d;
                                    }
                                }
                            }
                            if (dtkjVar == null || !dtkjVar.b || (dtkjVar.a & 2) == 0) {
                                dtjaVar = dtja.INVALID_UI_TYPE;
                            } else {
                                dtlv dtlvVar = dtkjVar.c;
                                if (dtlvVar == null) {
                                    dtlvVar = dtlv.f;
                                }
                                dtjaVar = bwnd.a(dtlvVar.d);
                            }
                        } else if (new dsrh(dtjbVar2.b, dtjb.c).size() == 1) {
                            dtjaVar = dtjb.c.a(Integer.valueOf(dtjbVar2.b.f(0)));
                        } else {
                            dtjaVar = dtja.INVALID_UI_TYPE;
                        }
                    }
                    dtiy b2 = dtiy.b(dtjbVar.d);
                    if (b2 == null) {
                        b2 = dtiy.FETCH_ON_DEMAND;
                    }
                    if (dtjaVar == dtja.GUIDE) {
                        int ordinal = b2.ordinal();
                        if (ordinal == 0) {
                            ckhaVar3 = ckhv.a;
                        } else if (ordinal == 1) {
                            ckhaVar3 = ckhv.c;
                        } else if (ordinal == 3) {
                            ckhaVar3 = ckhv.e;
                        }
                    } else if (dtjaVar == dtja.ROVER) {
                        int ordinal2 = b2.ordinal();
                        if (ordinal2 == 0) {
                            ckhaVar3 = ckhv.b;
                        } else if (ordinal2 == 1) {
                            ckhaVar3 = ckhv.d;
                        } else if (ordinal2 == 3) {
                            ckhaVar3 = ckhv.f;
                        }
                    }
                    if (ckhaVar3 != null) {
                        ((ckcp) ckcwVar.a(ckhaVar3)).a(elapsedRealtime);
                        dvts dvtsVar2 = this.e;
                        dbsk.s(dvtsVar2);
                        dvtq dvtqVar = dvtsVar2.d;
                        if (dvtqVar == null) {
                            dvtqVar = dvtq.c;
                        }
                        if ((dvtqVar.a & 1) != 0) {
                            dvtq dvtqVar2 = dvtsVar2.d;
                            if (dvtqVar2 == null) {
                                dvtqVar2 = dvtq.c;
                            }
                            long j = dvtqVar2.b;
                            if (j > 0 && j < elapsedRealtime) {
                                if (ckhaVar3 == ckhv.a) {
                                    ckhaVar = ckhv.g;
                                } else if (ckhaVar3 == ckhv.b) {
                                    ckhaVar = ckhv.h;
                                } else if (ckhaVar3 == ckhv.c) {
                                    ckhaVar = ckhv.i;
                                } else if (ckhaVar3 == ckhv.d) {
                                    ckhaVar = ckhv.j;
                                } else if (ckhaVar3 == ckhv.e) {
                                    ckhaVar = ckhv.k;
                                } else if (ckhaVar3 != ckhv.f) {
                                    throw new IllegalArgumentException(ckhaVar3.toString());
                                } else {
                                    ckhaVar = ckhv.l;
                                }
                                ((ckcp) ckcwVar.a(ckhaVar)).a(j);
                                if (ckhaVar3 == ckhv.a) {
                                    ckhaVar2 = ckhv.m;
                                } else if (ckhaVar3 == ckhv.b) {
                                    ckhaVar2 = ckhv.n;
                                } else if (ckhaVar3 == ckhv.c) {
                                    ckhaVar2 = ckhv.o;
                                } else if (ckhaVar3 == ckhv.d) {
                                    ckhaVar2 = ckhv.p;
                                } else if (ckhaVar3 == ckhv.e) {
                                    ckhaVar2 = ckhv.q;
                                } else if (ckhaVar3 != ckhv.f) {
                                    throw new IllegalArgumentException(ckhaVar3.toString());
                                } else {
                                    ckhaVar2 = ckhv.r;
                                }
                                ((ckcp) ckcwVar.a(ckhaVar2)).a(elapsedRealtime - j);
                            }
                        }
                    }
                    int i = dtjbVar.d;
                    new dsrh(dtjbVar.b, dtjb.c);
                }
            }
            synchronized (bwjlVar) {
                remove = bwjlVar.f.remove(this);
            }
            if (remove != null) {
                for (int i2 = 0; i2 < remove.size(); i2++) {
                    remove.get(i2).b(this.e, bttqVar);
                }
            } else {
                bvoo.h("Untracked request: %s", this);
            }
        }
    }

    @Override // defpackage.bttu
    public final synchronized void i() {
        List<bwjj> remove;
        super.i();
        bwjl bwjlVar = this.g;
        if (bwjlVar != null) {
            synchronized (bwjlVar) {
                remove = bwjlVar.f.remove(this);
            }
            if (remove != null) {
                for (int i = 0; i < remove.size(); i++) {
                    remove.get(i).a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bttu
    public final dbsb k() {
        dbsb k = super.k();
        dtnd dtndVar = this.a.b;
        if (dtndVar == null) {
            dtndVar = dtnd.l;
        }
        dtjb dtjbVar = dtndVar.e;
        if (dtjbVar == null) {
            dtjbVar = dtjb.h;
        }
        dtiy b = dtiy.b(dtjbVar.d);
        if (b == null) {
            b = dtiy.FETCH_ON_DEMAND;
        }
        k.b("fetchType", b);
        dtnd dtndVar2 = this.a.b;
        if (dtndVar2 == null) {
            dtndVar2 = dtnd.l;
        }
        dtjb dtjbVar2 = dtndVar2.e;
        if (dtjbVar2 == null) {
            dtjbVar2 = dtjb.h;
        }
        k.b("uiType", new dsrh(dtjbVar2.b, dtjb.c));
        dtnd dtndVar3 = this.a.b;
        if (dtndVar3 == null) {
            dtndVar3 = dtnd.l;
        }
        k.b("requestToken", dtndVar3.i);
        return k;
    }
}
