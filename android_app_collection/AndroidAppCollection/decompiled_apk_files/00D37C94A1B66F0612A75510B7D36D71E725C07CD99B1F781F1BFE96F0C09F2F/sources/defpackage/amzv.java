package defpackage;

import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: amzv  reason: default package */
/* loaded from: classes.dex */
public abstract class amzv extends anae implements anap {
    /* JADX INFO: Access modifiers changed from: protected */
    public amzv(Level level) {
        super(level);
    }

    @Override // defpackage.anae
    protected final andm a() {
        return andk.a;
    }

    @Override // defpackage.anae
    protected final boolean b(anai anaiVar) {
        int a;
        int i;
        anbj j = j();
        int b = j.b();
        int i2 = 0;
        while (true) {
            if (i2 >= b) {
                break;
            } else if (j.c(i2).a != "eye3tag") {
                i2++;
            } else if (j.d(anac.a) == null && j.d(anac.g) == null) {
                n(anac.g, anau.SMALL);
            }
        }
        anad anadVar = this.c;
        if (anadVar != null) {
            if (anaiVar != null) {
                Integer num = (Integer) anadVar.d(anac.b);
                anam anamVar = (anam) this.c.d(anac.c);
                anad anadVar2 = this.c;
                anak anakVar = anan.a;
                Object obj = anakVar.a.get(anaiVar);
                if (obj == null) {
                    obj = new anan();
                    Object putIfAbsent = anakVar.a.putIfAbsent(anaiVar, obj);
                    if (putIfAbsent != null) {
                        obj = putIfAbsent;
                    } else {
                        int i3 = anadVar2.b;
                        anaj anajVar = null;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (anac.d.equals(anadVar2.c(i4))) {
                                Object e = anadVar2.e(i4);
                                if (e instanceof anaq) {
                                    if (anajVar == null) {
                                        anajVar = new anaj(anakVar, anaiVar);
                                    }
                                    ((anaq) e).a();
                                }
                            }
                        }
                    }
                }
                anan ananVar = (anan) obj;
                if (num != null) {
                    if (ananVar.b.getAndIncrement() % num.intValue() != 0) {
                        return false;
                    }
                }
                if (anamVar != null) {
                    long j2 = this.b;
                    long j3 = ananVar.c.get();
                    long nanos = anamVar.a.toNanos(5000L) + j3;
                    if (nanos < 0 || ((j2 < nanos && j3 != 0) || !ananVar.c.compareAndSet(j3, j2))) {
                        ananVar.d.incrementAndGet();
                        return false;
                    }
                    anamVar.b = ananVar.d.getAndSet(0);
                }
            }
            anau anauVar = (anau) this.c.d(anac.g);
            if (anauVar != null) {
                anas anasVar = anac.g;
                anad anadVar3 = this.c;
                if (anadVar3 != null && (a = anadVar3.a(anasVar)) >= 0) {
                    int i5 = a + a;
                    int i6 = i5 + 2;
                    while (true) {
                        i = anadVar3.b;
                        if (i6 >= i + i) {
                            break;
                        }
                        Object obj2 = anadVar3.a[i6];
                        if (!obj2.equals(anasVar)) {
                            Object[] objArr = anadVar3.a;
                            objArr[i5] = obj2;
                            objArr[i5 + 1] = objArr[i6 + 1];
                            i5 += 2;
                        }
                        i6 += 2;
                    }
                    anadVar3.b = i - ((i6 - i5) >> 1);
                    while (i5 < i6) {
                        anadVar3.a[i5] = null;
                        i5++;
                    }
                }
                n(anac.a, new anal((Throwable) j().d(anac.a), anauVar, andp.b(anae.class, anauVar.f)));
            }
        }
        return true;
    }
}
