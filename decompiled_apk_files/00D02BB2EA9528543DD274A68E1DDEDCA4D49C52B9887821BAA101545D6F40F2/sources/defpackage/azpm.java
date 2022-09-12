package defpackage;

import java.util.ArrayList;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: azpm  reason: default package */
/* loaded from: classes.dex */
public final class azpm<T> extends btrh<T> {
    public azpm(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        final azpl azplVar = (azpl) this.a;
        if (((azrh) obj).a() != 2) {
            azplVar.c.b(new Runnable(azplVar) { // from class: azpj
                private final azpl a;

                {
                    this.a = azplVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    azpl azplVar2 = this.a;
                    long j = azplVar2.f.b().d;
                    long b = azplVar2.g.b();
                    try {
                        ArrayList arrayList = new ArrayList();
                        dcpe<azyh> listIterator = azplVar2.e.a().listIterator();
                        while (listIterator.hasNext()) {
                            azyh next = listIterator.next();
                            domf domfVar = next.g().b;
                            if (domfVar == null) {
                                domfVar = domf.d;
                            }
                            if (domfVar.b > 0) {
                                long k = bvop.k(next.j().c - j, b);
                                azyg i = next.i();
                                i.c(k);
                                next = i.b();
                            }
                            arrayList.add(next);
                        }
                        azpp azppVar = azplVar2.f;
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        Collections.sort(arrayList2, azpn.a);
                        ArrayList arrayList3 = new ArrayList();
                        int size = arrayList2.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList3.add(dspd.x(azxm.f.f((azyh) arrayList2.get(i2))));
                        }
                        synchronized (azppVar) {
                            bzok b2 = azppVar.b();
                            dsqp dsqpVar = (dsqp) b2.cu(5);
                            dsqpVar.bC(b2);
                            bzoh bzohVar = (bzoh) dsqpVar;
                            if (bzohVar.c) {
                                bzohVar.bF();
                                bzohVar.c = false;
                            }
                            ((bzok) bzohVar.b).b = bzok.ck();
                            if (bzohVar.c) {
                                bzohVar.bF();
                                bzohVar.c = false;
                            }
                            bzok bzokVar = (bzok) bzohVar.b;
                            bzokVar.b();
                            dsod.bv(arrayList3, bzokVar.b);
                            azppVar.c(bzohVar.bK());
                        }
                    } catch (axxc unused) {
                    }
                }
            });
        }
    }
}
