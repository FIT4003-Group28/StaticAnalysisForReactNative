package defpackage;

import android.media.MediaFormat;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.libraries.youtube.metadataeditor.geo.Place;
import com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: acay  reason: default package */
/* loaded from: classes.dex */
public final class acay implements abzn {
    final acti a;
    final aazg b;
    final aazj c;
    final aayh d;
    final aaya e;
    final aayc f;
    final aayn g;
    final aayf h;
    final aayj i;
    final aazu j;
    final aazl k;
    final aazn l;
    final abdu m;
    final Handler n;
    final Executor o;
    final Executor p;
    final snc q;

    public acay(acti actiVar, aazg aazgVar, aazj aazjVar, aayh aayhVar, aaya aayaVar, aayc aaycVar, aayn aaynVar, aayf aayfVar, aayj aayjVar, aazu aazuVar, aazl aazlVar, aazn aaznVar, abdu abduVar, Handler handler, Executor executor, Executor executor2, snc sncVar) {
        this.a = actiVar;
        this.b = aazgVar;
        this.c = aazjVar;
        this.d = aayhVar;
        this.e = aayaVar;
        this.f = aaycVar;
        this.g = aaynVar;
        this.h = aayfVar;
        this.i = aayjVar;
        this.j = aazuVar;
        this.k = aazlVar;
        this.l = aaznVar;
        this.m = abduVar;
        this.n = handler;
        this.o = executor;
        this.p = executor2;
        this.q = sncVar;
    }

    public static String n(cff cffVar) {
        if (cffVar.b == null) {
            return cffVar.toString();
        }
        String valueOf = String.valueOf(cffVar);
        int i = cffVar.b.a;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append(valueOf);
        sb.append(" - ");
        sb.append(i);
        return sb.toString();
    }

    public static final int o(int i) {
        switch (i - 1) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
            default:
                return 1;
            case 19:
                return 19;
            case 20:
                return 20;
            case 21:
                return 21;
        }
    }

    public static final int p(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 == 2) {
                return 21;
            }
            if (i2 == 3) {
                return 22;
            }
            if (i2 == 5) {
                return 2;
            }
            if (i2 == 6) {
                return 33;
            }
            if (i2 == 9) {
                return 32;
            }
            return i2 != 13 ? 1 : 27;
        }
        return 4;
    }

    @Override // defpackage.abzn
    public final void a(final String str, final abzf abzfVar) {
        aqxo.p(!str.isEmpty());
        abdt a = this.m.a();
        a.a = str;
        a.i();
        ylx.k(this.m.d(a), this.o, new ylv() { // from class: abzr
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                acay acayVar = acay.this;
                final abzf abzfVar2 = abzfVar;
                if (th instanceof cff) {
                    String valueOf = String.valueOf(acay.n((cff) th));
                    zep.b(valueOf.length() != 0 ? "Error deleting video: ".concat(valueOf) : new String("Error deleting video: "));
                } else {
                    zep.d("Error deleting video: ", th);
                }
                acayVar.n.post(new Runnable() { // from class: abzx
                    @Override // java.lang.Runnable
                    public final void run() {
                        abzf abzfVar3 = abzf.this;
                        if (abzfVar3 != null) {
                            abzfVar3.b();
                        }
                    }
                });
            }
        }, new ylw() { // from class: abzt
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                abzf abzfVar2 = abzf.this;
                String str2 = str;
                asgb asgbVar = (asgb) obj;
                if (abzfVar2 != null) {
                    abzfVar2.a(str2);
                }
            }
        });
    }

    @Override // defpackage.abzn
    public final void b(String str, abzg abzgVar) {
        aayc aaycVar = this.f;
        aayb aaybVar = new aayb(aaycVar.e, aaycVar.a.c());
        aaybVar.a = str;
        aayc aaycVar2 = this.f;
        aaycVar2.b.e(aaybVar, new acaj(this, abzgVar));
    }

    @Override // defpackage.abzn
    public final void c(abzh abzhVar) {
        abzhVar.getClass();
        aayf aayfVar = this.h;
        aayfVar.b.e(new aaye(aayfVar.e, aayfVar.a.c()), new acas(this.n, this.a, abzhVar));
    }

    @Override // defpackage.abzn
    public final void d(String str, avxr avxrVar, abzj abzjVar) {
        abzjVar.getClass();
        aayj aayjVar = this.i;
        aayi aayiVar = new aayi(aayjVar.e, aayjVar.a.c());
        if (str != null) {
            aayiVar.a = str;
        }
        if (avxrVar != null) {
            aayiVar.b = avxrVar;
        }
        aayj aayjVar2 = this.i;
        aayjVar2.b.e(aayiVar, new acav(this.n, this.a, abzjVar));
    }

    @Override // defpackage.abzn
    public final void e(String str, abzk abzkVar) {
        aqxo.p(!str.isEmpty());
        abzkVar.getClass();
        aazn aaznVar = this.l;
        aazm aazmVar = new aazm(aaznVar.e, aaznVar.a.c());
        aazmVar.a = str;
        aazn aaznVar2 = this.l;
        aaznVar2.c(asdb.a, aaznVar2.b, aayx.l, aayd.t).e(aazmVar, new acap(this, abzkVar));
    }

    @Override // defpackage.abzn
    public final void f(String str, final abzl abzlVar) {
        aqxo.p(!str.isEmpty());
        abzlVar.getClass();
        aayn aaynVar = this.g;
        aaym aaymVar = new aaym(aaynVar.e, aaynVar.a.c());
        aaymVar.a = str;
        aayn aaynVar2 = this.g;
        ylx.k(aaynVar2.b.b(aaymVar, this.p), this.o, new ylv() { // from class: abzs
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                acay acayVar = acay.this;
                if (th instanceof cff) {
                    cff cffVar = (cff) th;
                    String valueOf = String.valueOf(acay.n(cffVar));
                    zep.b(valueOf.length() != 0 ? "Error updating broadcast participant: ".concat(valueOf) : new String("Error updating broadcast participant: "));
                    cew cewVar = cffVar.b;
                    if (cewVar == null || cewVar.a != 403) {
                        abxa.b().n(20, 1, cffVar);
                        acayVar.n.post(new qvl(10));
                        return;
                    }
                    abxa.b().n(20, 2, cffVar);
                    acayVar.n.post(new qvl(13));
                    return;
                }
                zep.d("Error updating broadcast participant: ", th);
                acayVar.n.post(new qvl(11));
            }
        }, new ylw() { // from class: abzv
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                aunb aunbVar;
                acay acayVar = acay.this;
                final abzl abzlVar2 = abzlVar;
                final aseg asegVar = (aseg) obj;
                for (aunb aunbVar2 : asegVar.c) {
                    if (aunbVar2.qn(asuf.a)) {
                        asue asueVar = (asue) aunbVar2.qm(asuf.a);
                        int x = akzj.x(asueVar.d);
                        if (x == 0) {
                            x = 1;
                        }
                        int i = asueVar.b;
                        if (i != 5) {
                            if (i == 6 && ((aunb) asueVar.c).qn(ConfirmDialogRendererOuterClass.confirmDialogRenderer)) {
                                if (asueVar.b == 6) {
                                    aunbVar = (aunb) asueVar.c;
                                } else {
                                    aunbVar = aunb.a;
                                }
                                aqft aqftVar = (aqft) aunbVar.qm(ConfirmDialogRendererOuterClass.confirmDialogRenderer);
                            }
                        } else {
                            ajgl.b((arag) asueVar.c).toString();
                        }
                        if (x == 2) {
                            abxa.b().n(20, 2, null);
                            acayVar.n.post(new qvl(14));
                            return;
                        }
                    }
                    aunb aunbVar3 = asegVar.d;
                    if (aunbVar3 == null) {
                        aunbVar3 = aunb.a;
                    }
                    if (!aunbVar3.qn(ElementRendererOuterClass.elementRenderer)) {
                        abxa.b().n(20, 1, null);
                        acayVar.n.post(new qvl(12));
                        return;
                    }
                }
                acayVar.n.post(new Runnable() { // from class: abzp
                    @Override // java.lang.Runnable
                    public final void run() {
                        abzl.this.n(asegVar);
                    }
                });
            }
        });
    }

    @Override // defpackage.abzn
    public final void g(String str, final ackn acknVar) {
        aaya aayaVar = this.e;
        aaxz aaxzVar = new aaxz(aayaVar.e, aayaVar.a.c());
        aaxzVar.a = str;
        aaya aayaVar2 = this.e;
        ylx.k(aayaVar2.b.b(aaxzVar, this.p), this.o, new ylv() { // from class: abzo
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                acay acayVar = acay.this;
                ackn acknVar2 = acknVar;
                cff cffVar = (cff) th;
                zep.c("Error calling AddBroadcastParticipant", acay.n(cffVar));
                cew cewVar = cffVar.b;
                if (cewVar == null || cewVar.a != 403) {
                    abxa.b().n(19, 1, cffVar);
                    acayVar.n.post(new abzw(acknVar2));
                    return;
                }
                abxa.b().n(19, 2, cffVar);
                acayVar.n.post(new abzw(acknVar2, 1));
            }
        }, new ylw() { // from class: abzu
            /* JADX WARN: Removed duplicated region for block: B:37:0x0073 A[SYNTHETIC] */
            @Override // defpackage.ylw, defpackage.zdt
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r10) {
                /*
                    r9 = this;
                    acay r0 = defpackage.acay.this
                    ackn r1 = r2
                    arkt r10 = (defpackage.arkt) r10
                    aopu r10 = r10.c
                    java.util.Iterator r10 = r10.iterator()
                Lc:
                    boolean r2 = r10.hasNext()
                    r3 = 2
                    if (r2 == 0) goto L8c
                    java.lang.Object r2 = r10.next()
                    aunb r2 = (defpackage.aunb) r2
                    aopg r4 = defpackage.asuf.a
                    boolean r4 = r2.qn(r4)
                    r5 = 1
                    r6 = 0
                    if (r4 == 0) goto L69
                    aopg r4 = defpackage.asuf.a
                    java.lang.Object r2 = r2.qm(r4)
                    asue r2 = (defpackage.asue) r2
                    int r4 = r2.d
                    int r4 = defpackage.akzj.x(r4)
                    if (r4 != 0) goto L34
                    goto L35
                L34:
                    r5 = r4
                L35:
                    int r4 = r2.b
                    r7 = 5
                    if (r4 != r7) goto L46
                    java.lang.Object r2 = r2.c
                    arag r2 = (defpackage.arag) r2
                    android.text.Spanned r2 = defpackage.ajgl.b(r2)
                    r2.toString()
                    goto L69
                L46:
                    r7 = 6
                    if (r4 != r7) goto L69
                    java.lang.Object r4 = r2.c
                    aunb r4 = (defpackage.aunb) r4
                    aopg r8 = com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass.confirmDialogRenderer
                    boolean r4 = r4.qn(r8)
                    if (r4 == 0) goto L69
                    int r4 = r2.b
                    if (r4 != r7) goto L5e
                    java.lang.Object r2 = r2.c
                    aunb r2 = (defpackage.aunb) r2
                    goto L60
                L5e:
                    aunb r2 = defpackage.aunb.a
                L60:
                    aopg r4 = com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass.confirmDialogRenderer
                    java.lang.Object r2 = r2.qm(r4)
                    aqft r2 = (defpackage.aqft) r2
                    goto L6a
                L69:
                    r2 = r6
                L6a:
                    r4 = 4
                    if (r5 == r3) goto L74
                    r3 = 14
                    if (r5 == r3) goto L74
                    if (r5 != r4) goto Lc
                    r5 = 4
                L74:
                    abxa r10 = defpackage.abxa.b()
                    r3 = 19
                    int r4 = defpackage.acay.o(r5)
                    r10.n(r3, r4, r6)
                    android.os.Handler r10 = r0.n
                    abzq r0 = new abzq
                    r0.<init>()
                    r10.post(r0)
                    return
                L8c:
                    android.os.Handler r10 = r0.n
                    abzw r0 = new abzw
                    r0.<init>(r1, r3)
                    r10.post(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.abzu.a(java.lang.Object):void");
            }
        });
    }

    @Override // defpackage.abzn
    public final void h(String str, boolean z, boolean z2, MediaFormat mediaFormat, abxt abxtVar) {
        aqxo.p(!str.isEmpty());
        if (!z) {
            mediaFormat.getClass();
        }
        int integer = mediaFormat == null ? 0 : mediaFormat.getInteger("height");
        aazj aazjVar = this.c;
        aazi aaziVar = new aazi(aazjVar.e, aazjVar.a.c());
        aaziVar.b = str;
        aaziVar.c = "YouTube Mobile Stream";
        if (z) {
            aaziVar.d = 10005;
        } else {
            aaziVar.d = aazi.a.get(integer, 10003);
        }
        aaziVar.s = z ? 1 : 0;
        aazj aazjVar2 = this.c;
        aazjVar2.c(arps.a, aazjVar2.b, aayx.i, aayd.q).e(aaziVar, new acad(this, z2, abxtVar));
    }

    @Override // defpackage.abzn
    public final void i(String str, abxw abxwVar) {
        aqxo.p(!str.isEmpty());
        aazl aazlVar = this.k;
        aazk aazkVar = new aazk(aazlVar.e, aazlVar.a.c());
        aazkVar.a = str;
        aazl aazlVar2 = this.k;
        aazlVar2.c(ascx.a, aazlVar2.b, aayx.k, aayd.s).e(aazkVar, new acam(this, abxwVar));
    }

    @Override // defpackage.abzn
    public final void j(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, arpk arpkVar, int i, int i2, Place place, Date date, String str3, abze abzeVar) {
        abzeVar.getClass();
        aazg aazgVar = this.b;
        aazf aazfVar = new aazf(aazgVar.e, aazgVar.a.c());
        aazfVar.F = i;
        if (str != null) {
            aazfVar.c = str;
        }
        if (str2 != null) {
            aazfVar.d = str2;
        }
        if (bool != null) {
            aazfVar.a = Boolean.valueOf(bool.booleanValue());
        }
        if (bool2 != null) {
            aazfVar.b = Boolean.valueOf(bool2.booleanValue());
        }
        if (bool3 != null) {
            aazfVar.t = Boolean.valueOf(bool3.booleanValue());
        }
        if (bool4 != null) {
            aazfVar.v = bool4;
        }
        if (arpkVar != null) {
            Boolean valueOf = Boolean.valueOf(arpkVar.c);
            Boolean valueOf2 = Boolean.valueOf(arpkVar.d);
            Boolean valueOf3 = Boolean.valueOf(arpkVar.e);
            String str4 = arpkVar.f;
            Boolean valueOf4 = Boolean.valueOf(arpkVar.g);
            String str5 = arpkVar.h;
            if ((arpkVar.b & 1) != 0) {
                aazfVar.s = Boolean.valueOf(valueOf.booleanValue());
                if (valueOf.booleanValue() && (arpkVar.b & 2) != 0) {
                    aazfVar.u = Boolean.valueOf(valueOf2.booleanValue());
                }
            }
            if ((arpkVar.b & 4) != 0) {
                aazfVar.w = valueOf3;
            }
            if (!TextUtils.isEmpty(str4)) {
                aazfVar.x = str4;
            }
            if ((arpkVar.b & 16) != 0) {
                aazfVar.y = valueOf4;
            }
            if (!TextUtils.isEmpty(str5)) {
                aazfVar.z = str5;
            }
        }
        if (place != null) {
            String str6 = place.a;
            String str7 = place.b;
            aazfVar.A = str6;
            aazfVar.B = str7;
        }
        if (date != null) {
            aazfVar.C = Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(date.getTime()));
        }
        if (str3 != null) {
            aazfVar.D = str3;
        }
        if (i2 != 0) {
            aazfVar.E = i2;
        }
        aazg aazgVar2 = this.b;
        aazgVar2.c(arpi.a, aazgVar2.b, aayx.h, aayd.p).e(aazfVar, new acaa(this, abzeVar));
    }

    @Override // defpackage.abzn
    public final void k(asvk asvkVar, String str, int i, abzi abziVar) {
        aayh aayhVar = this.d;
        aayg aaygVar = new aayg(aayhVar.e, aayhVar.a.c());
        aaygVar.a = asvkVar;
        aaygVar.b = str;
        aaygVar.c = i;
        aayh aayhVar2 = this.d;
        aayhVar2.b.e(aaygVar, new acag(this, abziVar));
    }

    @Override // defpackage.abzn
    public final void l(aopa aopaVar, abzm abzmVar) {
        this.j.b(aopaVar, new acax(this.n, abzmVar), null);
    }

    @Override // defpackage.abzn
    public final aopa m(String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, arpk arpkVar, arpl arplVar, int i, int i2, abzd abzdVar, Date date, abzd abzdVar2, byte[] bArr) {
        long seconds;
        aopa createBuilder;
        aopa createBuilder2;
        str.getClass();
        aopa createBuilder3 = arxl.a.createBuilder();
        createBuilder3.copyOnWrite();
        arxl arxlVar = (arxl) createBuilder3.instance;
        arxlVar.b |= 2;
        arxlVar.e = str;
        if (str2 != null) {
            aopa createBuilder4 = arxg.a.createBuilder();
            createBuilder4.copyOnWrite();
            arxg arxgVar = (arxg) createBuilder4.instance;
            arxgVar.b |= 1;
            arxgVar.c = str2;
            createBuilder3.copyOnWrite();
            arxl arxlVar2 = (arxl) createBuilder3.instance;
            arxg arxgVar2 = (arxg) createBuilder4.mo39build();
            arxgVar2.getClass();
            arxlVar2.f = arxgVar2;
            arxlVar2.b |= 8;
        }
        if (str3 != null) {
            aopa createBuilder5 = arwt.a.createBuilder();
            createBuilder5.copyOnWrite();
            arwt arwtVar = (arwt) createBuilder5.instance;
            arwtVar.b |= 1;
            arwtVar.c = str3;
            createBuilder3.copyOnWrite();
            arxl arxlVar3 = (arxl) createBuilder3.instance;
            arwt arwtVar2 = (arwt) createBuilder5.mo39build();
            arwtVar2.getClass();
            arxlVar3.g = arwtVar2;
            arxlVar3.b |= 16;
        }
        aopa createBuilder6 = arwv.a.createBuilder();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            createBuilder6.copyOnWrite();
            arwv arwvVar = (arwv) createBuilder6.instance;
            arwvVar.b |= 1;
            arwvVar.c = booleanValue;
        }
        if (bool2 != null) {
            aopa createBuilder7 = assw.a.createBuilder();
            aopa createBuilder8 = assx.a.createBuilder();
            boolean booleanValue2 = bool2.booleanValue();
            createBuilder7.copyOnWrite();
            assw asswVar = (assw) createBuilder7.instance;
            asswVar.b |= 2;
            asswVar.d = booleanValue2;
            createBuilder8.copyOnWrite();
            assx.a((assx) createBuilder8.instance);
            createBuilder6.copyOnWrite();
            arwv arwvVar2 = (arwv) createBuilder6.instance;
            assw asswVar2 = (assw) createBuilder7.mo39build();
            asswVar2.getClass();
            arwvVar2.d = asswVar2;
            arwvVar2.b |= 2;
            createBuilder6.copyOnWrite();
            arwv arwvVar3 = (arwv) createBuilder6.instance;
            assx assxVar = (assx) createBuilder8.mo39build();
            assxVar.getClass();
            arwvVar3.e = assxVar;
            arwvVar3.b |= 4;
        }
        int i3 = ((arwv) createBuilder6.instance).b;
        if ((i3 & 1) != 0 || (i3 & 2) != 0) {
            createBuilder3.copyOnWrite();
            arxl arxlVar4 = (arxl) createBuilder3.instance;
            arwv arwvVar4 = (arwv) createBuilder6.mo39build();
            arwvVar4.getClass();
            arxlVar4.t = arwvVar4;
            arxlVar4.b |= 67108864;
        }
        if (bool3 != null) {
            aopa createBuilder9 = arwr.a.createBuilder();
            boolean booleanValue3 = bool3.booleanValue();
            createBuilder9.copyOnWrite();
            arwr arwrVar = (arwr) createBuilder9.instance;
            arwrVar.b |= 1;
            arwrVar.c = booleanValue3;
            createBuilder3.copyOnWrite();
            arxl arxlVar5 = (arxl) createBuilder3.instance;
            arwr arwrVar2 = (arwr) createBuilder9.mo39build();
            arwrVar2.getClass();
            arxlVar5.l = arwrVar2;
            arxlVar5.b |= 8192;
        }
        if (bool4 != null) {
            aopa createBuilder10 = arxd.a.createBuilder();
            boolean booleanValue4 = bool4.booleanValue();
            createBuilder10.copyOnWrite();
            arxd arxdVar = (arxd) createBuilder10.instance;
            arxdVar.b |= 1;
            arxdVar.c = booleanValue4;
            createBuilder3.copyOnWrite();
            arxl arxlVar6 = (arxl) createBuilder3.instance;
            arxd arxdVar2 = (arxd) createBuilder10.mo39build();
            arxdVar2.getClass();
            arxlVar6.v = arxdVar2;
            arxlVar6.c |= 131072;
        }
        if (arplVar != null) {
            arpkVar.getClass();
            if (arplVar.b) {
                arxl arxlVar7 = (arxl) createBuilder3.instance;
                if ((arxlVar7.b & 16777216) == 0) {
                    createBuilder2 = arxc.a.createBuilder();
                } else {
                    arxc arxcVar = arxlVar7.r;
                    if (arxcVar == null) {
                        arxcVar = arxc.a;
                    }
                    createBuilder2 = arxcVar.mo52toBuilder();
                }
                boolean z = arpkVar.c;
                createBuilder2.copyOnWrite();
                arxc arxcVar2 = (arxc) createBuilder2.instance;
                arxcVar2.b |= 1;
                arxcVar2.c = z;
                createBuilder3.copyOnWrite();
                arxl arxlVar8 = (arxl) createBuilder3.instance;
                arxc arxcVar3 = (arxc) createBuilder2.mo39build();
                arxcVar3.getClass();
                arxlVar8.r = arxcVar3;
                arxlVar8.b |= 16777216;
            }
            if (arplVar.c) {
                arxl arxlVar9 = (arxl) createBuilder3.instance;
                if ((arxlVar9.b & 16777216) == 0) {
                    createBuilder = arxc.a.createBuilder();
                } else {
                    arxc arxcVar4 = arxlVar9.r;
                    if (arxcVar4 == null) {
                        arxcVar4 = arxc.a;
                    }
                    createBuilder = arxcVar4.mo52toBuilder();
                }
                boolean z2 = arpkVar.d;
                createBuilder.copyOnWrite();
                arxc arxcVar5 = (arxc) createBuilder.instance;
                arxcVar5.b |= 2;
                arxcVar5.d = z2;
                createBuilder3.copyOnWrite();
                arxl arxlVar10 = (arxl) createBuilder3.instance;
                arxc arxcVar6 = (arxc) createBuilder.mo39build();
                arxcVar6.getClass();
                arxlVar10.r = arxcVar6;
                arxlVar10.b |= 16777216;
            }
            if (arplVar.g) {
                aopa createBuilder11 = arwy.a.createBuilder();
                String str4 = arpkVar.h;
                createBuilder11.copyOnWrite();
                arwy arwyVar = (arwy) createBuilder11.instance;
                str4.getClass();
                arwyVar.b |= 1;
                arwyVar.c = str4;
                createBuilder11.copyOnWrite();
                arwy arwyVar2 = (arwy) createBuilder11.instance;
                arwyVar2.d = 1;
                arwyVar2.b |= 2;
                createBuilder3.copyOnWrite();
                arxl arxlVar11 = (arxl) createBuilder3.instance;
                arwy arwyVar3 = (arwy) createBuilder11.mo39build();
                arwyVar3.getClass();
                arxlVar11.s = arwyVar3;
                arxlVar11.b |= 33554432;
            } else if (arplVar.f && !arpkVar.g) {
                aopa createBuilder12 = arwy.a.createBuilder();
                createBuilder12.copyOnWrite();
                arwy arwyVar4 = (arwy) createBuilder12.instance;
                arwyVar4.d = 2;
                arwyVar4.b |= 2;
                createBuilder3.copyOnWrite();
                arxl arxlVar12 = (arxl) createBuilder3.instance;
                arwy arwyVar5 = (arwy) createBuilder12.mo39build();
                arwyVar5.getClass();
                arxlVar12.s = arwyVar5;
                arxlVar12.b |= 33554432;
            }
            if (arplVar.e) {
                aqxo.y((arpkVar.b & 8) != 0);
                aopa createBuilder13 = arxh.a.createBuilder();
                String str5 = arpkVar.f;
                createBuilder13.copyOnWrite();
                arxh arxhVar = (arxh) createBuilder13.instance;
                str5.getClass();
                arxhVar.b |= 1;
                arxhVar.c = str5;
                createBuilder3.copyOnWrite();
                arxl arxlVar13 = (arxl) createBuilder3.instance;
                arxh arxhVar2 = (arxh) createBuilder13.mo39build();
                arxhVar2.getClass();
                arxlVar13.p = arxhVar2;
                arxlVar13.b |= 1048576;
            } else if (arplVar.d) {
                aopa createBuilder14 = arwz.a.createBuilder();
                boolean z3 = arpkVar.e;
                createBuilder14.copyOnWrite();
                arwz arwzVar = (arwz) createBuilder14.instance;
                arwzVar.b |= 1;
                arwzVar.c = z3;
                createBuilder3.copyOnWrite();
                arxl arxlVar14 = (arxl) createBuilder3.instance;
                arwz arwzVar2 = (arwz) createBuilder14.mo39build();
                arwzVar2.getClass();
                arxlVar14.n = arwzVar2;
                arxlVar14.b |= 65536;
            }
        }
        if (i2 != 0) {
            aopa createBuilder15 = arxf.a.createBuilder();
            createBuilder15.copyOnWrite();
            arxf arxfVar = (arxf) createBuilder15.instance;
            arxfVar.d = i2 - 1;
            arxfVar.b |= 2;
            createBuilder15.copyOnWrite();
            arxf arxfVar2 = (arxf) createBuilder15.instance;
            arxfVar2.c = 1;
            arxfVar2.b |= 1;
            createBuilder3.copyOnWrite();
            arxl arxlVar15 = (arxl) createBuilder3.instance;
            arxf arxfVar3 = (arxf) createBuilder15.mo39build();
            arxfVar3.getClass();
            arxlVar15.w = arxfVar3;
            arxlVar15.c |= 262144;
        }
        if (i != 0) {
            aopa createBuilder16 = arxb.a.createBuilder();
            createBuilder16.copyOnWrite();
            arxb arxbVar = (arxb) createBuilder16.instance;
            arxbVar.c = i - 1;
            arxbVar.b |= 1;
            createBuilder3.copyOnWrite();
            arxl arxlVar16 = (arxl) createBuilder3.instance;
            arxb arxbVar2 = (arxb) createBuilder16.mo39build();
            arxbVar2.getClass();
            arxlVar16.h = arxbVar2;
            arxlVar16.b |= 32;
        }
        if (!abzdVar.c()) {
            aopa createBuilder17 = arwx.a.createBuilder();
            if (abzdVar.d()) {
                createBuilder17.copyOnWrite();
                arwx arwxVar = (arwx) createBuilder17.instance;
                arwxVar.g = 2;
                arwxVar.b |= 16;
            } else {
                String str6 = ((Place) abzdVar.b()).a;
                createBuilder17.copyOnWrite();
                arwx arwxVar2 = (arwx) createBuilder17.instance;
                str6.getClass();
                arwxVar2.b |= 8;
                arwxVar2.f = str6;
                String str7 = ((Place) abzdVar.b()).b;
                createBuilder17.copyOnWrite();
                arwx arwxVar3 = (arwx) createBuilder17.instance;
                str7.getClass();
                arwxVar3.b |= 4;
                arwxVar3.e = str7;
            }
            createBuilder3.copyOnWrite();
            arxl arxlVar17 = (arxl) createBuilder3.instance;
            arwx arwxVar4 = (arwx) createBuilder17.mo39build();
            arwxVar4.getClass();
            arxlVar17.m = arwxVar4;
            arxlVar17.b |= 32768;
        }
        if (date != null) {
            long time = date.getTime();
            if (time == 0) {
                seconds = TimeUnit.MILLISECONDS.toSeconds(this.q.c());
            } else {
                seconds = TimeUnit.MILLISECONDS.toSeconds(time);
            }
            aopa createBuilder18 = arww.a.createBuilder();
            createBuilder18.copyOnWrite();
            arww arwwVar = (arww) createBuilder18.instance;
            arwwVar.b |= 1;
            arwwVar.c = seconds;
            createBuilder3.copyOnWrite();
            arxl arxlVar18 = (arxl) createBuilder3.instance;
            arww arwwVar2 = (arww) createBuilder18.mo39build();
            arwwVar2.getClass();
            arxlVar18.u = arwwVar2;
            arxlVar18.b |= 134217728;
        }
        if (!abzdVar2.c()) {
            aopa createBuilder19 = arwu.a.createBuilder();
            if (abzdVar2.d()) {
                createBuilder19.copyOnWrite();
                arwu arwuVar = (arwu) createBuilder19.instance;
                arwuVar.b |= 2;
                arwuVar.d = true;
            } else {
                String str8 = (String) abzdVar2.b();
                createBuilder19.copyOnWrite();
                arwu arwuVar2 = (arwu) createBuilder19.instance;
                str8.getClass();
                arwuVar2.b |= 1;
                arwuVar2.c = str8;
                aopa createBuilder20 = arws.a.createBuilder();
                int i4 = abww.b;
                int i5 = i4 - 1;
                if (i4 != 0) {
                    createBuilder20.copyOnWrite();
                    arws arwsVar = (arws) createBuilder20.instance;
                    arwsVar.b |= 1;
                    arwsVar.c = i5;
                    arws arwsVar2 = (arws) createBuilder20.mo39build();
                    createBuilder3.copyOnWrite();
                    arxl arxlVar19 = (arxl) createBuilder3.instance;
                    arwsVar2.getClass();
                    arxlVar19.k = arwsVar2;
                    arxlVar19.b |= 512;
                } else {
                    throw null;
                }
            }
            createBuilder3.copyOnWrite();
            arxl arxlVar20 = (arxl) createBuilder3.instance;
            arwu arwuVar3 = (arwu) createBuilder19.mo39build();
            arwuVar3.getClass();
            arxlVar20.o = arwuVar3;
            arxlVar20.b |= 524288;
        }
        if (bArr != null) {
            aopa createBuilder21 = arxi.a.createBuilder();
            createBuilder21.copyOnWrite();
            arxi arxiVar = (arxi) createBuilder21.instance;
            arxiVar.c = 3;
            arxiVar.b |= 1;
            aopa createBuilder22 = arwo.a.createBuilder();
            aoob x = aoob.x(bArr);
            createBuilder22.copyOnWrite();
            arwo arwoVar = (arwo) createBuilder22.instance;
            arwoVar.b = 1;
            arwoVar.c = x;
            createBuilder21.copyOnWrite();
            arxi arxiVar2 = (arxi) createBuilder21.instance;
            arwo arwoVar2 = (arwo) createBuilder22.mo39build();
            arwoVar2.getClass();
            arxiVar2.d = arwoVar2;
            arxiVar2.b |= 4;
            createBuilder3.copyOnWrite();
            arxl arxlVar21 = (arxl) createBuilder3.instance;
            arxi arxiVar3 = (arxi) createBuilder21.mo39build();
            arxiVar3.getClass();
            arxlVar21.q = arxiVar3;
            arxlVar21.b |= 4194304;
        }
        return createBuilder3;
    }
}
