package defpackage;

import com.google.android.youtube.R;
import j$.util.Comparator$CC;
import java.util.Collections;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: icj  reason: default package */
/* loaded from: classes3.dex */
public final class icj implements ynl {
    aukz a = null;
    final /* synthetic */ ico b;

    public icj(ico icoVar) {
        this.b = icoVar;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        int binarySearch;
        if (i != -1) {
            if (i == 0) {
                final gaf gafVar = (gaf) obj;
                this.b.mJ().runOnUiThread(new Runnable() { // from class: ici
                    @Override // java.lang.Runnable
                    public final void run() {
                        icj icjVar = icj.this;
                        gaf gafVar2 = gafVar;
                        aspb a = gafVar2.a();
                        if (icjVar.b.rb() != null) {
                            aulr aJ = icjVar.b.aJ();
                            aspb aspbVar = null;
                            if (aJ != null) {
                                boolean z = true;
                                int i2 = aJ.b & 1;
                                if (i2 != 0) {
                                    asow asowVar = aJ.c;
                                    if (asowVar == null) {
                                        asowVar = asow.a;
                                    }
                                    if (1 != i2) {
                                        z = false;
                                    }
                                    aspbVar = aspb.b(icjVar.b.ai.a(hqp.c(z, asowVar)).d);
                                    if (aspbVar == null) {
                                        aspbVar = aspb.LIKE;
                                    }
                                }
                            }
                            if (a == aspb.INDIFFERENT && aspbVar == aspb.DISLIKE) {
                                zdg.c(icjVar.b.rb(), icjVar.b.bh, icjVar.b.rb().getString(R.string.reel_accessibility_undislike_announcement));
                            } else if (a == aspb.INDIFFERENT) {
                                zdg.c(icjVar.b.rb(), icjVar.b.bh, icjVar.b.rb().getString(R.string.reel_accessibility_unlike_announcement));
                            } else if (a == aspb.LIKE) {
                                zdg.c(icjVar.b.rb(), icjVar.b.bh, icjVar.b.rb().getString(R.string.reel_accessibility_like_announcement));
                            } else if (a == aspb.DISLIKE) {
                                zdg.c(icjVar.b.rb(), icjVar.b.bh, icjVar.b.rb().getString(R.string.reel_accessibility_dislike_announcement));
                            }
                        }
                        icjVar.b.ai.a.put(gafVar2.b(), gafVar2.a());
                    }
                });
                return null;
            } else if (i == 1) {
                ampq g = ((isw) obj).g();
                if (!g.h()) {
                    return null;
                }
                this.a = (aukz) g.c();
                iai iaiVar = this.b.af;
                aukz aukzVar = this.a;
                aukzVar.getClass();
                if (iaiVar.t(new iah(4, (aukzVar.b & 2) != 0 ? aukzVar.d : null, aukzVar)) != 1) {
                    return null;
                }
                this.b.aL();
                if (zdg.e(this.b.rb())) {
                    return null;
                }
                this.b.aM(actj.LIGHTWEIGHT_PLAYER_AUTO_DISMISS);
                return null;
            } else if (i == 2) {
                wgg wggVar = wgg.STARTED;
                int ordinal = ((wgh) obj).a().ordinal();
                if ((ordinal != 1 && ordinal != 2) || !this.b.aD.t()) {
                    return null;
                }
                this.b.av.Z();
                this.b.ag.ll();
                return null;
            } else if (i == 3) {
                aawj aawjVar = (aawj) obj;
                if (!(aawjVar.c() instanceof aukz) || !aawjVar.c().equals(this.a)) {
                    return null;
                }
                iai iaiVar2 = this.b.af;
                long f = iaiVar2.f();
                hzs hzsVar = iaiVar2.m;
                iaj iajVar = hzsVar.e;
                if (iajVar != null && hzsVar.B(iajVar.a) == -1) {
                    synchronized (hzsVar.d) {
                        binarySearch = Collections.binarySearch(hzsVar.d, hzsVar.e, Comparator$CC.comparing(glk.o));
                        if (binarySearch < 0) {
                            binarySearch = -(binarySearch + 1);
                        }
                        hzsVar.d.add(binarySearch, hzsVar.e);
                        hzsVar.e = null;
                    }
                    hzsVar.ol(hzsVar.A(binarySearch));
                }
                int B = iaiVar2.m.B(f);
                if (B != -1) {
                    iaiVar2.x = B;
                }
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{gaf.class, isw.class, wgh.class, aawj.class};
    }
}
