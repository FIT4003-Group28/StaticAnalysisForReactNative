package defpackage;

import android.text.TextUtils;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: akho  reason: default package */
/* loaded from: classes.dex */
public final class akho {
    public static final int[] a;
    public static final int b;
    public int c;
    public boolean d;
    public String e;
    public List f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int[] k;
    public boolean l;
    public int m;
    public String n;
    public int o = 1;
    private long p;
    private int q;
    private int r;
    private Set s;
    private final snc t;

    static {
        int[] iArr = {0, 1, 2, 3, 4, 5, 5, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8};
        a = iArr;
        b = iArr[19] + 1;
    }

    public akho(snc sncVar) {
        this.t = sncVar;
    }

    private final int h(int i) {
        List list = this.f;
        int size = list == null ? -1 : list.size() - 1;
        if (i < -1 || i > size) {
            return -1;
        }
        return i;
    }

    public final ascj a(String str) {
        int i;
        Integer num;
        akhp akhpVar = new akhp();
        akhpVar.a(-1);
        akhpVar.f(-1);
        akhpVar.b(0);
        akhpVar.c(-1);
        akhpVar.e(-1);
        akhpVar.i(0);
        akhpVar.h(0);
        akhpVar.l(1);
        akhpVar.d(amyg.a);
        akhpVar.k(false);
        akhpVar.g(0);
        akhpVar.j(0);
        akhpVar.p = null;
        akhpVar.o = null;
        if (!TextUtils.isEmpty(this.n)) {
            akhpVar.p = this.n;
        }
        if (str != null) {
            akhpVar.a = str;
            akhpVar.b = this.e;
            akhpVar.a(h(this.h));
            akhpVar.f(h(this.g));
            if (this.d) {
                i = this.c > 1 ? 3 : 1;
            } else {
                i = this.c > 0 ? 2 : 0;
            }
            akhpVar.b(i);
            akhpVar.e = this.f;
            akhpVar.c(this.q);
            akhpVar.e(this.r);
            akhpVar.i((int) (this.t.d() - this.p));
            akhpVar.l(this.o);
            akhpVar.d(this.s);
            akhpVar.g(this.j);
            akhpVar.j(this.i);
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int[] iArr = this.k;
                if (i2 >= iArr.length) {
                    break;
                }
                long j = iArr[i2];
                if (j == 0) {
                    i3++;
                } else {
                    if (sb.length() > 0) {
                        sb.append("j");
                    }
                    if (i3 == 1) {
                        sb.append("0j");
                    } else if (i3 > 1) {
                        sb.append(i2);
                        sb.append("-");
                    }
                    sb.append(j);
                    i3 = 0;
                }
                i2++;
            }
            akhpVar.o = sb.toString();
            akhpVar.k(this.l);
            akhpVar.h(this.m);
            String str2 = akhpVar.a;
            if (str2 == null || (num = akhpVar.c) == null || akhpVar.d == null || akhpVar.f == null || akhpVar.g == null || akhpVar.h == null || akhpVar.i == null || akhpVar.j == null || akhpVar.k == null || akhpVar.q == 0 || akhpVar.l == null || akhpVar.m == null || akhpVar.n == null) {
                StringBuilder sb2 = new StringBuilder();
                if (akhpVar.a == null) {
                    sb2.append(" clientName");
                }
                if (akhpVar.c == null) {
                    sb2.append(" assistedQueryIndex");
                }
                if (akhpVar.d == null) {
                    sb2.append(" lastVisibleSuggestionIndex");
                }
                if (akhpVar.f == null) {
                    sb2.append(" experimentTriggered");
                }
                if (akhpVar.g == null) {
                    sb2.append(" firstEditTimeMillis");
                }
                if (akhpVar.h == null) {
                    sb2.append(" lastEditTimeMillis");
                }
                if (akhpVar.i == null) {
                    sb2.append(" sessionDurationMillis");
                }
                if (akhpVar.j == null) {
                    sb2.append(" zeroPrefixSuggestionsEnabled");
                }
                if (akhpVar.k == null) {
                    sb2.append(" numZeroPrefixSuggestionsShown");
                }
                if (akhpVar.q == 0) {
                    sb2.append(" searchMethod");
                }
                if (akhpVar.l == null) {
                    sb2.append(" inputMethods");
                }
                if (akhpVar.m == null) {
                    sb2.append(" maxRoundTripTimeMsec");
                }
                if (akhpVar.n == null) {
                    sb2.append(" totalRoundTripTimeMsec");
                }
                String valueOf = String.valueOf(sb2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb3.append("Missing required properties:");
                sb3.append(valueOf);
                throw new IllegalStateException(sb3.toString());
            }
            akhq akhqVar = new akhq(str2, akhpVar.b, num.intValue(), akhpVar.d.intValue(), akhpVar.e, akhpVar.f.intValue(), akhpVar.g.intValue(), akhpVar.h.intValue(), akhpVar.i.intValue(), akhpVar.j.booleanValue(), akhpVar.k.intValue(), akhpVar.q, akhpVar.l, akhpVar.m.intValue(), akhpVar.n.intValue(), akhpVar.o, akhpVar.p);
            zgh.m(akhqVar.a);
            aopa createBuilder = ascj.a.createBuilder();
            String str3 = akhqVar.a;
            createBuilder.copyOnWrite();
            ascj ascjVar = (ascj) createBuilder.instance;
            str3.getClass();
            ascjVar.b |= 4;
            ascjVar.e = str3;
            String str4 = akhqVar.b;
            if (str4 != null) {
                createBuilder.copyOnWrite();
                ascj ascjVar2 = (ascj) createBuilder.instance;
                ascjVar2.b |= 64;
                ascjVar2.i = str4;
            }
            List list = akhqVar.e;
            if (list != null && !list.isEmpty()) {
                int i4 = akhqVar.c;
                if (i4 >= 0) {
                    asci a2 = akhq.a((akhl) akhqVar.e.get(i4), akhqVar.c);
                    createBuilder.copyOnWrite();
                    ascj ascjVar3 = (ascj) createBuilder.instance;
                    a2.getClass();
                    ascjVar3.j = a2;
                    ascjVar3.b |= 256;
                }
                if (akhqVar.d >= 0) {
                    for (int i5 = 0; i5 <= akhqVar.d; i5++) {
                        asci a3 = akhq.a((akhl) akhqVar.e.get(i5), i5);
                        createBuilder.copyOnWrite();
                        ascj ascjVar4 = (ascj) createBuilder.instance;
                        a3.getClass();
                        aopu aopuVar = ascjVar4.k;
                        if (!aopuVar.c()) {
                            ascjVar4.k = aopi.mutableCopy(aopuVar);
                        }
                        ascjVar4.k.add(a3);
                    }
                }
            }
            if (akhqVar.f != 0) {
                aopa createBuilder2 = ascg.a.createBuilder();
                int i6 = akhqVar.f;
                createBuilder2.copyOnWrite();
                ascg ascgVar = (ascg) createBuilder2.instance;
                ascgVar.b |= 4;
                ascgVar.c = i6;
                createBuilder.copyOnWrite();
                ascj ascjVar5 = (ascj) createBuilder.instance;
                ascg ascgVar2 = (ascg) createBuilder2.mo39build();
                ascgVar2.getClass();
                ascjVar5.h = ascgVar2;
                ascjVar5.b |= 32;
            }
            int i7 = akhqVar.g;
            if (i7 >= 0) {
                createBuilder.copyOnWrite();
                ascj ascjVar6 = (ascj) createBuilder.instance;
                ascjVar6.b |= 16384;
                ascjVar6.o = i7;
            }
            int i8 = akhqVar.h;
            if (i8 >= 0) {
                createBuilder.copyOnWrite();
                ascj ascjVar7 = (ascj) createBuilder.instance;
                ascjVar7.b |= 32768;
                ascjVar7.p = i8;
            }
            int i9 = akhqVar.i;
            createBuilder.copyOnWrite();
            ascj ascjVar8 = (ascj) createBuilder.instance;
            ascjVar8.b |= 8192;
            ascjVar8.n = i9;
            boolean z = akhqVar.j;
            createBuilder.copyOnWrite();
            ascj ascjVar9 = (ascj) createBuilder.instance;
            ascjVar9.b |= 512;
            ascjVar9.l = z;
            int i10 = akhqVar.k;
            createBuilder.copyOnWrite();
            ascj ascjVar10 = (ascj) createBuilder.instance;
            ascjVar10.b |= 1024;
            ascjVar10.m = i10;
            createBuilder.copyOnWrite();
            ascj ascjVar11 = (ascj) createBuilder.instance;
            ascjVar11.c = 4;
            ascjVar11.b |= 1;
            createBuilder.copyOnWrite();
            ascj ascjVar12 = (ascj) createBuilder.instance;
            ascjVar12.d = 1;
            ascjVar12.b |= 2;
            int i11 = akhqVar.q;
            createBuilder.copyOnWrite();
            ascj ascjVar13 = (ascj) createBuilder.instance;
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            }
            ascjVar13.f = i12;
            ascjVar13.b |= 16;
            Set<asch> set = akhqVar.l;
            createBuilder.copyOnWrite();
            ascj ascjVar14 = (ascj) createBuilder.instance;
            aopq aopqVar = ascjVar14.g;
            if (!aopqVar.c()) {
                ascjVar14.g = aopi.mutableCopy(aopqVar);
            }
            for (asch aschVar : set) {
                ascjVar14.g.g(aschVar.k);
            }
            int i13 = akhqVar.m;
            createBuilder.copyOnWrite();
            ascj ascjVar15 = (ascj) createBuilder.instance;
            ascjVar15.b |= 262144;
            ascjVar15.q = i13;
            int i14 = akhqVar.n;
            createBuilder.copyOnWrite();
            ascj ascjVar16 = (ascj) createBuilder.instance;
            ascjVar16.b |= 524288;
            ascjVar16.r = i14;
            String str5 = akhqVar.o;
            if (str5 != null) {
                createBuilder.copyOnWrite();
                ascj ascjVar17 = (ascj) createBuilder.instance;
                ascjVar17.b |= 1048576;
                ascjVar17.s = str5;
            }
            String str6 = akhqVar.p;
            if (str6 != null) {
                createBuilder.copyOnWrite();
                ascj ascjVar18 = (ascj) createBuilder.instance;
                ascjVar18.b |= 4194304;
                ascjVar18.t = str6;
            }
            return (ascj) createBuilder.mo39build();
        }
        throw new NullPointerException("Null clientName");
    }

    public final void b(String str) {
        this.o = 2;
        this.e = str;
    }

    public final void c() {
        int d = (int) (this.t.d() - this.p);
        if (this.q == -1) {
            this.q = d;
        }
        this.r = d;
    }

    public final void d() {
        this.s.add(asch.KEYBOARD);
        c();
    }

    public final void e() {
        this.s.add(asch.QUERY_BUILDER);
        c();
    }

    public final void f() {
        this.o = 16;
        this.s.add(asch.SPEECH);
    }

    public final void g() {
        this.c = 0;
        this.d = false;
        this.p = this.t.d();
        this.q = -1;
        this.r = -1;
        this.o = 1;
        this.s = EnumSet.noneOf(asch.class);
        this.g = -1;
        this.h = -1;
        this.i = 0;
        this.j = 0;
        this.k = new int[b + 1];
        this.l = false;
    }
}
