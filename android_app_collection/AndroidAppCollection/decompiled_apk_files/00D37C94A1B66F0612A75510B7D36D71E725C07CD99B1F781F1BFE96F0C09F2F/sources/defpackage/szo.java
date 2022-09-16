package defpackage;

import com.youtube.android.libraries.elements.templates.EkoProcessor;
import java.io.IOException;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: szo  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class szo implements ayqe {
    public final /* synthetic */ szp a;
    public final /* synthetic */ awnk b;
    public final /* synthetic */ tcs c;
    private final /* synthetic */ int d;

    public /* synthetic */ szo(szp szpVar, awnk awnkVar, tcs tcsVar) {
        this.a = szpVar;
        this.b = awnkVar;
        this.c = tcsVar;
    }

    public /* synthetic */ szo(szp szpVar, awnk awnkVar, tcs tcsVar, int i) {
        this.d = i;
        this.a = szpVar;
        this.b = awnkVar;
        this.c = tcsVar;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        if (this.d != 0) {
            szp szpVar = this.a;
            awnk awnkVar = this.b;
            tcs tcsVar = this.c;
            tet tetVar = (tet) obj;
            tcu tcuVar = (tcu) szpVar.b.get();
            awlp awlpVar = awnkVar.d;
            if (awlpVar == null) {
                awlpVar = awlp.a;
            }
            try {
                axmi a = EkoProcessor.a(awlpVar.toByteArray(), tag.a(tetVar).a, szpVar.c);
                if (!a.a.f()) {
                    String valueOf = String.valueOf(a.a.getDescription());
                    throw new ted(valueOf.length() != 0 ? "Eko processor error: ".concat(valueOf) : new String("Eko processor error: "));
                }
                byte[] bArr = a.b;
                bArr.getClass();
                return tcuVar.d((awmt) aopi.parseFrom(awmt.a, bArr, aoos.b()), tcsVar, 1);
            } catch (IOException e) {
                throw new ted("Invalid eko template", e);
            }
        }
        szp szpVar2 = this.a;
        awnk awnkVar2 = this.b;
        tcs tcsVar2 = this.c;
        awnk awnkVar3 = (awnk) obj;
        aopc aopcVar = (aopc) awos.a.createBuilder();
        aopg aopgVar = awnm.b;
        aopa createBuilder = awnm.a.createBuilder();
        awlp awlpVar2 = awnkVar2.d;
        if (awlpVar2 == null) {
            awlpVar2 = awlp.a;
        }
        aoob byteString = awlpVar2.toByteString();
        createBuilder.copyOnWrite();
        awnm awnmVar = (awnm) createBuilder.instance;
        awnmVar.c |= 1;
        awnmVar.d = byteString;
        aopcVar.e(aopgVar, (awnm) createBuilder.mo39build());
        awos awosVar = (awos) aopcVar.mo39build();
        awmy awmyVar = awnkVar2.c;
        if (awmyVar == null) {
            awmyVar = awmy.a;
        }
        int i = ((awna) awmyVar.qm(awna.b)).d;
        aopa createBuilder2 = awmx.a.createBuilder();
        createBuilder2.copyOnWrite();
        awmx awmxVar = (awmx) createBuilder2.instance;
        awosVar.getClass();
        awmxVar.d = awosVar;
        awmxVar.c |= 2;
        awmy awmyVar2 = awnkVar2.c;
        if (awmyVar2 == null) {
            awmyVar2 = awmy.a;
        }
        createBuilder2.copyOnWrite();
        awmx awmxVar2 = (awmx) createBuilder2.instance;
        awmyVar2.getClass();
        awmxVar2.f = awmyVar2;
        awmxVar2.c |= 16;
        try {
            byte[] bArr2 = new byte[6];
            aool ak = aool.ak(bArr2);
            ak.B(i, 2);
            ak.D(0);
            try {
                awnc awncVar = (awnc) aopi.parseFrom(awnc.a, bArr2);
                createBuilder2.copyOnWrite();
                awmx awmxVar3 = (awmx) createBuilder2.instance;
                awncVar.getClass();
                awmxVar3.e = awncVar;
                awmxVar3.c |= 8;
                final awmx awmxVar4 = (awmx) createBuilder2.mo39build();
                final tdb tdbVar = szpVar2.a;
                return ayoi.z(new Callable() { // from class: tae
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i2;
                        int i3;
                        int i4;
                        awmx awmxVar5 = awmx.this;
                        tdb tdbVar2 = tdbVar;
                        awnc awncVar2 = awmxVar5.e;
                        if (awncVar2 == null) {
                            awncVar2 = awnc.a;
                        }
                        tet d = tet.d(awncVar2);
                        if ((awmxVar5.c & 16) == 0) {
                            return azpm.aI(d);
                        }
                        awmy awmyVar3 = awmxVar5.f;
                        if (awmyVar3 == null) {
                            awmyVar3 = awmy.a;
                        }
                        awna awnaVar = awmyVar3.qn(awna.b) ? (awna) awmyVar3.qm(awna.b) : null;
                        awnp awnpVar = awmyVar3.qn(awnp.b) ? (awnp) awmyVar3.qm(awnp.b) : null;
                        if (awnaVar == null && awnpVar == null) {
                            return azpm.aI(d);
                        }
                        if (awnaVar == null || awnpVar == null || (i3 = awnaVar.d) == (i4 = awnpVar.c)) {
                            amum h = amup.h();
                            if (awnaVar != null) {
                                i2 = awnaVar.d;
                                amum h2 = amup.h();
                                for (awnb awnbVar : awnaVar.c) {
                                    if ((awnbVar.b & 1) != 0) {
                                        h2.f(awnbVar.c, Integer.valueOf(awnbVar.d));
                                    }
                                }
                                h.h(h2.b());
                            } else {
                                i2 = 0;
                            }
                            if (awnpVar != null) {
                                i2 = awnpVar.c;
                                h.h(amup.k("/environment", Integer.valueOf(awnpVar.d)));
                            }
                            return tck.d(tag.a(d), i2, h.b(), tdbVar2, null);
                        }
                        StringBuilder sb = new StringBuilder(108);
                        sb.append("ComponentType localEntitiesConfig.resultField=");
                        sb.append(i3);
                        sb.append(", environmentEntitiesConfig.resultField=");
                        sb.append(i4);
                        throw new ted(sb.toString());
                    }
                }).an(tet.b).c(new szo(szpVar2, awnkVar2, tcsVar2, 1));
            } catch (aopx e2) {
                throw new ted("Invalid model", e2);
            }
        } catch (IOException e3) {
            throw new ted("Invalid model creation", e3);
        }
    }
}
