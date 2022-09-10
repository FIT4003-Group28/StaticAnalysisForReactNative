package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: blhe  reason: default package */
/* loaded from: classes3.dex */
public final class blhe extends blho {
    public final dcdc<blho> a;
    public dcdc<blhd> b;
    public final HashSet<String> c;
    public final HashSet<String> d;

    public blhe(blhw blhwVar, dcdc<blho> dcdcVar) {
        super(blhwVar);
        this.c = new HashSet<>();
        this.d = new HashSet<>();
        this.a = dcdcVar;
        this.b = c(dcdcVar);
    }

    public static dcdc<blhd> c(dcdc<blho> dcdcVar) {
        dccx F = dcdc.F();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            F.g(new blhd(dcdcVar.get(i)));
        }
        return F.f();
    }

    @Override // defpackage.blho
    public final boolean a() {
        dcdc<blhd> dcdcVar = this.b;
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (dcdcVar.get(i).a.a()) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    @Override // defpackage.blho
    protected final void b() {
        dcdc<blhd> dcdcVar = this.b;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            final blhd blhdVar = dcdcVar.get(i);
            final Runnable runnable = new Runnable(this) { // from class: blhb
                private final blhe a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2;
                    blhe blheVar = this.a;
                    dcdc<blhd> dcdcVar2 = blheVar.b;
                    int size2 = dcdcVar2.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        int i4 = i3 + 1;
                        if (dcdcVar2.get(i3).b == null) {
                            return;
                        }
                        i3 = i4;
                    }
                    blhx d = blhy.d();
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    dcdc<blhd> dcdcVar3 = blheVar.b;
                    int size3 = dcdcVar3.size();
                    int i5 = 0;
                    while (i5 < size3) {
                        blhd blhdVar2 = dcdcVar3.get(i5);
                        blhy blhyVar = blhdVar2.b;
                        dbsk.s(blhyVar);
                        dcdc<cdjd> a = blhyVar.a();
                        int size4 = a.size();
                        for (int i6 = 0; i6 < size4; i6++) {
                            cdjd cdjdVar = a.get(i6);
                            Integer num = (Integer) hashMap.get(cdjdVar.a().g());
                            if (num != null) {
                                arrayList.set(num.intValue(), cdjdVar);
                            } else if (blheVar.c.add(cdjdVar.a().g())) {
                                hashMap.put(cdjdVar.a().g(), Integer.valueOf(arrayList.size()));
                                arrayList.add(cdjdVar);
                            }
                        }
                        blhy blhyVar2 = blhdVar2.b;
                        dbsk.s(blhyVar2);
                        dcdc<dwfl> b = blhyVar2.b();
                        int size5 = b.size();
                        int i7 = 0;
                        while (true) {
                            i2 = i5 + 1;
                            if (i7 < size5) {
                                dwfl dwflVar = b.get(i7);
                                if (blheVar.d.add(dwflVar.d)) {
                                    arrayList2.add(dwflVar);
                                }
                                i7++;
                            }
                        }
                        i5 = i2;
                    }
                    d.e(arrayList);
                    d.d(arrayList2);
                    blheVar.b = blhe.c(blheVar.a);
                    blheVar.f(d.c());
                }
            };
            if (blhdVar.a.a()) {
                blhdVar.a.e(new blhn(blhdVar, runnable) { // from class: blhc
                    private final blhd a;
                    private final Runnable b;

                    {
                        this.a = blhdVar;
                        this.b = runnable;
                    }

                    @Override // defpackage.blhn
                    public final void a(blhy blhyVar) {
                        blhd blhdVar2 = this.a;
                        Runnable runnable2 = this.b;
                        blhdVar2.b = blhyVar;
                        runnable2.run();
                    }
                });
            } else {
                blhdVar.b = blhy.a;
                runnable.run();
            }
        }
    }
}
