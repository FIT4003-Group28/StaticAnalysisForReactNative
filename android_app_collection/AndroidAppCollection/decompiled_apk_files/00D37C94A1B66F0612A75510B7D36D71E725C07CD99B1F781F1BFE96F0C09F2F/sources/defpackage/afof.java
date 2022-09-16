package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: afof  reason: default package */
/* loaded from: classes.dex */
public final class afof implements tct {
    public final tdb a;
    private final /* synthetic */ int b;

    public afof(tdb tdbVar) {
        this.a = tdbVar;
    }

    public afof(tdb tdbVar, int i) {
        this.b = i;
        this.a = tdbVar;
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.tct
    public final aooq a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return awop.b;
            }
            if (i == 2) {
                return avfs.b;
            }
            return avft.b;
        }
        return aqfm.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, tcs tcsVar) {
        final String str;
        final String str2;
        int i = this.b;
        if (i == 0) {
            final aqfm aqfmVar = (aqfm) obj;
            if ((aqfmVar.c & 2) != 0) {
                str = aqfmVar.e;
            } else {
                awon awonVar = tcsVar.e;
                if (awonVar != null && (awonVar.qn(awnl.b) || awonVar.qn(awsv.b))) {
                    if (awonVar.qn(awnl.b)) {
                        awma awmaVar = ((awnl) awonVar.qm(awnl.b)).d;
                        if (awmaVar == null) {
                            awmaVar = awma.a;
                        }
                        str = awmaVar.c;
                    } else {
                        str = ((awsv) awonVar.qm(awsv.b)).i;
                    }
                } else {
                    return aynr.f();
                }
            }
            return aynr.t(new aypv() { // from class: afoe
                @Override // defpackage.aypv
                public final void a() {
                    int i2;
                    afof afofVar = afof.this;
                    String str3 = str;
                    aqfm aqfmVar2 = aqfmVar;
                    int i3 = 0;
                    int codePointCount = str3.codePointCount(0, str3.length());
                    if (codePointCount != 0) {
                        i3 = codePointCount;
                    } else if (!aqfmVar2.g) {
                        i2 = 3;
                        tdb tdbVar = afofVar.a;
                        String str4 = aqfmVar2.d;
                        aopa createBuilder = awpf.a.createBuilder();
                        createBuilder.copyOnWrite();
                        awpf awpfVar = (awpf) createBuilder.instance;
                        awpfVar.b |= 1;
                        awpfVar.c = i3;
                        createBuilder.copyOnWrite();
                        awpf awpfVar2 = (awpf) createBuilder.instance;
                        awpfVar2.d = i2 - 1;
                        awpfVar2.b |= 2;
                        tdbVar.b(str4, ((awpf) createBuilder.mo39build()).toByteArray());
                    }
                    i2 = i3 > aqfmVar2.f ? 4 : 2;
                    tdb tdbVar2 = afofVar.a;
                    String str42 = aqfmVar2.d;
                    aopa createBuilder2 = awpf.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    awpf awpfVar3 = (awpf) createBuilder2.instance;
                    awpfVar3.b |= 1;
                    awpfVar3.c = i3;
                    createBuilder2.copyOnWrite();
                    awpf awpfVar22 = (awpf) createBuilder2.instance;
                    awpfVar22.d = i2 - 1;
                    awpfVar22.b |= 2;
                    tdbVar2.b(str42, ((awpf) createBuilder2.mo39build()).toByteArray());
                }
            });
        } else if (i == 1) {
            final awop awopVar = (awop) obj;
            return aynr.t(new aypv(awopVar, null) { // from class: szy
                public final /* synthetic */ awop a;

                @Override // defpackage.aypv
                public final void a() {
                    afof afofVar = afof.this;
                    awop awopVar2 = this.a;
                    afofVar.a.b(awopVar2.c, awopVar2.d.I());
                }
            });
        } else if (i == 2) {
            final avfs avfsVar = (avfs) obj;
            awon awonVar2 = tcsVar.e;
            if (awonVar2 != null) {
                awma awmaVar2 = ((awnl) awonVar2.qm(awnl.b)).d;
                if (awmaVar2 == null) {
                    awmaVar2 = awma.a;
                }
                str2 = awmaVar2.c;
            } else {
                str2 = null;
            }
            return ahfc.h(this.a, avfsVar.c).al(ahfc.g(this.a, avfsVar.d), nti.o).g(new ayqe(str2, avfsVar, null) { // from class: afpg
                public final /* synthetic */ String a;
                public final /* synthetic */ avfs b;

                @Override // defpackage.ayqe
                public final Object a(Object obj2) {
                    return aynr.t(new aypv((Pair) obj2, this.a, this.b, null) { // from class: afpf
                        public final /* synthetic */ Pair a;
                        public final /* synthetic */ String b;
                        public final /* synthetic */ avfs c;

                        /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
                        @Override // defpackage.aypv
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void a() {
                            /*
                                Method dump skipped, instructions count: 297
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.afpf.a():void");
                        }
                    });
                }
            });
        } else {
            final avft avftVar = (avft) obj;
            final int i2 = avftVar.c;
            return ahfc.h(this.a, avftVar.d).al(ahfc.g(this.a, avftVar.e), nti.p).g(new ayqe(i2, avftVar, null) { // from class: afpi
                public final /* synthetic */ int a;
                public final /* synthetic */ avft b;

                @Override // defpackage.ayqe
                public final Object a(Object obj2) {
                    return aynr.t(new aypv((Pair) obj2, this.a, this.b, null) { // from class: afph
                        public final /* synthetic */ Pair a;
                        public final /* synthetic */ int b;
                        public final /* synthetic */ avft c;

                        @Override // defpackage.aypv
                        public final void a() {
                            afof afofVar = afof.this;
                            Pair pair = this.a;
                            int i3 = this.b;
                            avft avftVar2 = this.c;
                            avfu avfuVar = (avfu) pair.first;
                            aopa mo52toBuilder = ((awpv) pair.second).mo52toBuilder();
                            if (i3 >= avfuVar.b.size()) {
                                return;
                            }
                            awpv awpvVar = (awpv) mo52toBuilder.instance;
                            if ((awpvVar.b & 4) == 0 || awpvVar.d != i3) {
                                mo52toBuilder.copyOnWrite();
                                awpv awpvVar2 = (awpv) mo52toBuilder.instance;
                                awpvVar2.b |= 4;
                                awpvVar2.d = i3;
                            } else {
                                ArrayList arrayList = new ArrayList(avfuVar.b);
                                arrayList.remove(i3);
                                aopa mo52toBuilder2 = avfuVar.mo52toBuilder();
                                mo52toBuilder2.copyOnWrite();
                                ((avfu) mo52toBuilder2.instance).b = aopi.emptyProtobufList();
                                mo52toBuilder2.copyOnWrite();
                                avfu avfuVar2 = (avfu) mo52toBuilder2.instance;
                                avfuVar2.a();
                                aonk.addAll((Iterable) arrayList, (List) avfuVar2.b);
                                avfu avfuVar3 = (avfu) mo52toBuilder2.mo39build();
                                afofVar.a.b(avftVar2.d, avfuVar3.toByteArray());
                                aopu aopuVar = avfuVar3.b;
                                avfu avfuVar4 = avftVar2.f;
                                if (avfuVar4 == null) {
                                    avfuVar4 = avfu.a;
                                }
                                boolean i4 = ahfc.i(aopuVar, avfuVar4.b);
                                HashSet hashSet = new HashSet();
                                Iterator it = aopuVar.iterator();
                                int i5 = 2;
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    String str3 = (String) it.next();
                                    if (str3.length() == 1) {
                                        i5 = 6;
                                        break;
                                    } else if (hashSet.contains(str3)) {
                                        i5 = 5;
                                    } else {
                                        hashSet.add(str3);
                                    }
                                }
                                mo52toBuilder.copyOnWrite();
                                awpv awpvVar3 = (awpv) mo52toBuilder.instance;
                                awpvVar3.b |= 16;
                                awpvVar3.e = i4;
                                mo52toBuilder.copyOnWrite();
                                awpv awpvVar4 = (awpv) mo52toBuilder.instance;
                                awpvVar4.f = i5 - 1;
                                awpvVar4.b |= 64;
                                mo52toBuilder.copyOnWrite();
                                awpv awpvVar5 = (awpv) mo52toBuilder.instance;
                                awpvVar5.b &= -5;
                                awpvVar5.d = 0;
                            }
                            afofVar.a.b(avftVar2.e, ((awpv) mo52toBuilder.mo39build()).toByteArray());
                        }
                    });
                }
            });
        }
    }
}
