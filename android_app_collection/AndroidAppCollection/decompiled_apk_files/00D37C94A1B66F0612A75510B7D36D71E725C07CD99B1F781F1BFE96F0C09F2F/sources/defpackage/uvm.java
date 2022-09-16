package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: uvm  reason: default package */
/* loaded from: classes4.dex */
public final class uvm {
    public final uvk a;
    public final azqb b;
    public final vag c;
    public final azqb d;
    public final utv e;
    private final uto f;
    private final Executor g;

    public uvm(uvk uvkVar, azqb azqbVar, uto utoVar, vah vahVar, azqb azqbVar2, utv utvVar, Executor executor, axnm axnmVar, azqb azqbVar3) {
        this.a = uvkVar;
        this.f = utoVar;
        this.b = azqbVar;
        this.g = executor;
        this.d = new dzk(azqbVar2, 5);
        Context context = (Context) vahVar.a.get();
        context.getClass();
        Executor executor2 = (Executor) vahVar.b.get();
        executor2.getClass();
        vak vakVar = (vak) vahVar.c.get();
        vakVar.getClass();
        Boolean bool = (Boolean) vahVar.d.get();
        bool.getClass();
        this.c = new vag(context, executor2, vakVar, axnmVar, bool.booleanValue(), azqbVar3);
        this.e = utvVar;
    }

    public final long a(String str) {
        if (this.f.b) {
            return -1L;
        }
        vag vagVar = this.c;
        vac vacVar = vagVar.c;
        int intValue = ((Integer) vacVar.b.get()).intValue();
        if (intValue == 0) {
            return -1L;
        }
        if (intValue != Integer.MAX_VALUE) {
            synchronized (vacVar.a) {
                if (vacVar.d >= intValue) {
                    long j = vacVar.e;
                    snc sncVar = vacVar.c;
                    if (SystemClock.elapsedRealtime() - j <= 1000) {
                        return -1L;
                    }
                }
            }
        }
        int i = vagVar.d;
        val valVar = vagVar.b;
        if (i == 3) {
            return valVar.a(str);
        }
        return -1L;
    }

    public final ankt b(final uvj uvjVar) {
        if (this.f.b) {
            return anlz.o();
        }
        return anlz.t(new Runnable() { // from class: uvl
            @Override // java.lang.Runnable
            public final void run() {
                baaw b;
                int i;
                anbe[] anbeVarArr;
                uvm uvmVar = uvm.this;
                uvj uvjVar2 = uvjVar;
                if (uvjVar2.g) {
                    aopa createBuilder = baaw.a.createBuilder();
                    createBuilder.copyOnWrite();
                    baaw baawVar = (baaw) createBuilder.instance;
                    baawVar.d = 2;
                    baawVar.b |= 4;
                    b = (baaw) createBuilder.mo39build();
                } else {
                    Long l = uvjVar2.f;
                    vag vagVar = uvmVar.c;
                    int i2 = vagVar.d;
                    val valVar = vagVar.b;
                    if (i2 != 3) {
                        b = valVar.d();
                    } else {
                        b = valVar.b(l);
                    }
                }
                if (b.c == -1) {
                    return;
                }
                uvq uvqVar = (uvq) uvmVar.b.get();
                baax baaxVar = uvjVar2.c;
                aopa mo52toBuilder = baaxVar.mo52toBuilder();
                aopa createBuilder2 = baai.a.createBuilder();
                int i3 = uvqVar.h;
                createBuilder2.copyOnWrite();
                baai baaiVar = (baai) createBuilder2.instance;
                baaiVar.e = i3 - 1;
                baaiVar.b |= 4;
                String str = uvqVar.b;
                if (str != null) {
                    createBuilder2.copyOnWrite();
                    baai baaiVar2 = (baai) createBuilder2.instance;
                    baaiVar2.b |= 1;
                    baaiVar2.c = str;
                }
                createBuilder2.copyOnWrite();
                baai baaiVar3 = (baai) createBuilder2.instance;
                baaiVar3.b |= 8;
                baaiVar3.f = 391164026L;
                String str2 = uvqVar.d;
                if (str2 != null) {
                    createBuilder2.copyOnWrite();
                    baai baaiVar4 = (baai) createBuilder2.instance;
                    baaiVar4.b |= 2;
                    baaiVar4.d = str2;
                }
                String str3 = uvqVar.c;
                if (str3 != null) {
                    createBuilder2.copyOnWrite();
                    baai baaiVar5 = (baai) createBuilder2.instance;
                    baaiVar5.b |= 16;
                    baaiVar5.g = str3;
                }
                mo52toBuilder.copyOnWrite();
                baax baaxVar2 = (baax) mo52toBuilder.instance;
                baai baaiVar6 = (baai) createBuilder2.mo39build();
                baaiVar6.getClass();
                baaxVar2.f = baaiVar6;
                baaxVar2.b |= 16;
                if (sre.e(uvqVar.a)) {
                    aopa createBuilder3 = baam.a.createBuilder();
                    long freeSpace = uvqVar.e.a().getFreeSpace();
                    createBuilder3.copyOnWrite();
                    baam baamVar = (baam) createBuilder3.instance;
                    baamVar.b |= 1;
                    baamVar.c = freeSpace / 1024;
                    long longValue = ((Long) uvqVar.f.get()).longValue();
                    createBuilder3.copyOnWrite();
                    baam baamVar2 = (baam) createBuilder3.instance;
                    baamVar2.b = 2 | baamVar2.b;
                    baamVar2.d = longValue;
                    mo52toBuilder.copyOnWrite();
                    baax baaxVar3 = (baax) mo52toBuilder.instance;
                    baam baamVar3 = (baam) createBuilder3.mo39build();
                    baamVar3.getClass();
                    baaxVar3.q = baamVar3;
                    baaxVar3.b |= 2097152;
                }
                amqo amqoVar = uvqVar.g;
                if (!TextUtils.isEmpty(null)) {
                    baah baahVar = baaxVar.p;
                    if (baahVar == null) {
                        baahVar = baah.a;
                    }
                    aopa mo52toBuilder2 = baahVar.mo52toBuilder();
                    if (((baah) mo52toBuilder2.instance).c.isEmpty()) {
                        mo52toBuilder2.copyOnWrite();
                        baah baahVar2 = (baah) mo52toBuilder2.instance;
                        throw null;
                    }
                    String str4 = ((String) null) + "::" + ((baah) mo52toBuilder2.instance).c;
                    mo52toBuilder2.copyOnWrite();
                    baah baahVar3 = (baah) mo52toBuilder2.instance;
                    str4.getClass();
                    baahVar3.b |= 1;
                    baahVar3.c = str4;
                    mo52toBuilder.copyOnWrite();
                    baax baaxVar4 = (baax) mo52toBuilder.instance;
                    baah baahVar4 = (baah) mo52toBuilder2.mo39build();
                    baahVar4.getClass();
                    baaxVar4.p = baahVar4;
                    baaxVar4.b |= 524288;
                }
                aopa mo52toBuilder3 = ((baax) mo52toBuilder.mo39build()).mo52toBuilder();
                mo52toBuilder3.copyOnWrite();
                baax baaxVar5 = (baax) mo52toBuilder3.instance;
                b.getClass();
                baaxVar5.r = b;
                baaxVar5.b |= 33554432;
                utu utuVar = uvjVar2.h;
                if (utuVar != null) {
                    ArrayList arrayList = new ArrayList();
                    int i4 = 0;
                    while (true) {
                        utw[] utwVarArr = utuVar.b;
                        if (i4 >= utwVarArr.length) {
                            break;
                        }
                        utw utwVar = utwVarArr[i4];
                        int i5 = utuVar.c[i4];
                        int max = Math.max(i5 - Math.min(100, 19), 0);
                        int i6 = i5 - max;
                        if (i6 <= 0) {
                            anbeVarArr = new anbe[0];
                        } else {
                            anbe[] anbeVarArr2 = new anbe[i6];
                            for (int i7 = 0; i7 < i6; i7++) {
                                anbeVarArr2[i7] = (anbe) utwVar.a.get((i7 + max) % 20);
                            }
                            int i8 = utwVar.b;
                            if (i5 <= 0) {
                                i = -i5;
                            } else {
                                int i9 = utwVar.c;
                                i = (Integer.MAX_VALUE - i5) - 27;
                            }
                            int i10 = (i - (20 - i6)) + 1;
                            if (i10 >= i6) {
                                anbeVarArr = new anbe[0];
                            } else if (i10 > 0) {
                                int i11 = i6 - i10;
                                anbeVarArr = new anbe[i11];
                                System.arraycopy(anbeVarArr2, i10, anbeVarArr, 0, i11);
                            } else {
                                anbeVarArr = anbeVarArr2;
                            }
                        }
                        for (anbe anbeVar : anbeVarArr) {
                            arrayList.add(new utt(anbeVar, i4));
                        }
                        i4++;
                    }
                    Collections.sort(arrayList, utr.a);
                    aopa createBuilder4 = baal.a.createBuilder();
                    long j = 0;
                    for (int max2 = Math.max(arrayList.size() - 100, 0); max2 < arrayList.size(); max2++) {
                        utt uttVar = (utt) arrayList.get(max2);
                        anbe anbeVar2 = uttVar.a;
                        int i12 = uttVar.b;
                        anah f = anbeVar2.f();
                        String b2 = f.b();
                        String d = f.d();
                        int a = f.a();
                        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 13 + d.length());
                        sb.append(b2);
                        sb.append(".");
                        sb.append(d);
                        sb.append(":");
                        sb.append(a);
                        Long a2 = anuw.a(sb.toString());
                        if (a2 != null) {
                            long longValue2 = a2.longValue();
                            createBuilder4.copyOnWrite();
                            baal baalVar = (baal) createBuilder4.instance;
                            aopt aoptVar = baalVar.b;
                            if (!aoptVar.c()) {
                                baalVar.b = aopi.mutableCopy(aoptVar);
                            }
                            baalVar.b.f(longValue2);
                            long e = anbeVar2.e() / 1000000;
                            long j2 = e - j;
                            createBuilder4.copyOnWrite();
                            baal baalVar2 = (baal) createBuilder4.instance;
                            aopt aoptVar2 = baalVar2.c;
                            if (!aoptVar2.c()) {
                                baalVar2.c = aopi.mutableCopy(aoptVar2);
                            }
                            baalVar2.c.f(j2);
                            createBuilder4.copyOnWrite();
                            baal baalVar3 = (baal) createBuilder4.instance;
                            aopq aopqVar = baalVar3.d;
                            if (!aopqVar.c()) {
                                baalVar3.d = aopi.mutableCopy(aopqVar);
                            }
                            baalVar3.d.g(i12);
                            j = e;
                        }
                    }
                    baal baalVar4 = (baal) createBuilder4.mo39build();
                    mo52toBuilder3.copyOnWrite();
                    baax baaxVar6 = (baax) mo52toBuilder3.instance;
                    baalVar4.getClass();
                    baaxVar6.s = baalVar4;
                    baaxVar6.b |= 67108864;
                }
                String str5 = uvjVar2.a;
                if (uvjVar2.b) {
                    if (str5 == null) {
                        mo52toBuilder3.copyOnWrite();
                        baax baaxVar7 = (baax) mo52toBuilder3.instance;
                        baaxVar7.b &= -32769;
                        baaxVar7.o = baax.a.o;
                    } else {
                        mo52toBuilder3.copyOnWrite();
                        baax baaxVar8 = (baax) mo52toBuilder3.instance;
                        baaxVar8.b |= 32768;
                        baaxVar8.o = str5;
                    }
                } else if (str5 == null) {
                    mo52toBuilder3.copyOnWrite();
                    baax baaxVar9 = (baax) mo52toBuilder3.instance;
                    baaxVar9.b &= -5;
                    baaxVar9.e = baax.a.e;
                } else {
                    mo52toBuilder3.copyOnWrite();
                    baax baaxVar10 = (baax) mo52toBuilder3.instance;
                    baaxVar10.b |= 4;
                    baaxVar10.e = str5;
                }
                Object obj = uvmVar.d.get();
                azzk azzkVar = uvjVar2.d;
                if (obj != null || azzkVar != null) {
                    if (obj != null && azzkVar != null) {
                        aopc aopcVar = (aopc) ((aopi) obj).mo52toBuilder();
                        aopcVar.mergeFrom((aopi) azzkVar);
                        obj = (azzk) aopcVar.mo39build();
                    } else if (obj == null) {
                        azzkVar.getClass();
                        obj = azzkVar;
                    }
                    mo52toBuilder3.copyOnWrite();
                    baax baaxVar11 = (baax) mo52toBuilder3.instance;
                    obj.getClass();
                    baaxVar11.m = (azzk) obj;
                    baaxVar11.b |= 8192;
                }
                String str6 = uvjVar2.e;
                if (str6 != null) {
                    aopa createBuilder5 = baah.a.createBuilder();
                    createBuilder5.copyOnWrite();
                    baah baahVar5 = (baah) createBuilder5.instance;
                    baahVar5.b |= 1;
                    baahVar5.c = str6;
                    mo52toBuilder3.copyOnWrite();
                    baax baaxVar12 = (baax) mo52toBuilder3.instance;
                    baah baahVar6 = (baah) createBuilder5.mo39build();
                    baahVar6.getClass();
                    baaxVar12.p = baahVar6;
                    baaxVar12.b |= 524288;
                }
                uvk uvkVar = uvmVar.a;
                baax baaxVar13 = (baax) mo52toBuilder3.mo39build();
                RuntimeException runtimeException = null;
                for (var varVar : (Set) uvkVar.b.get()) {
                    try {
                        varVar.a(baaxVar13);
                    } catch (RuntimeException e2) {
                        ((amzw) ((amzw) ((amzw) uvk.a.g()).h(e2)).i("com/google/android/libraries/performance/primes/metrics/core/MetricDispatcher", "dispatch", '#', "MetricDispatcher.java")).q("One transmitter failed to send message");
                        if (runtimeException == null) {
                            runtimeException = e2;
                        }
                    }
                }
                if (runtimeException != null) {
                    throw runtimeException;
                }
                vac vacVar = uvmVar.c.c;
                snc sncVar = vacVar.c;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                synchronized (vacVar.a) {
                    vacVar.d++;
                    if (elapsedRealtime - vacVar.e > 1000) {
                        vacVar.d = 0;
                        vacVar.e = elapsedRealtime;
                    }
                }
            }
        }, this.g);
    }

    public final boolean c(String str) {
        return a(str) != -1;
    }
}
