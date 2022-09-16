package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: aeqe  reason: default package */
/* loaded from: classes.dex */
public final class aeqe implements aeqf {
    public final acrr a;
    public final ankw b;
    private final aaed c;

    public aeqe(aaed aaedVar, acrr acrrVar, ankw ankwVar) {
        this.c = aaedVar;
        this.a = acrrVar;
        this.b = ankwVar;
    }

    @Override // defpackage.aeqf
    public final void a(final String str, final azpm azpmVar) {
        aopa createBuilder = tpw.a.createBuilder();
        createBuilder.copyOnWrite();
        tpw tpwVar = (tpw) createBuilder.instance;
        tpwVar.b |= 1;
        tpwVar.c = "tf-lite-bandwidth-model";
        int hashCode = str.hashCode();
        createBuilder.copyOnWrite();
        tpw tpwVar2 = (tpw) createBuilder.instance;
        tpwVar2.b |= 4;
        tpwVar2.e = hashCode;
        aopa createBuilder2 = tpv.a.createBuilder();
        createBuilder2.copyOnWrite();
        tpv tpvVar = (tpv) createBuilder2.instance;
        tpvVar.b |= 1;
        tpvVar.c = "tf-lite-bandwidth-model.tflite";
        createBuilder2.copyOnWrite();
        tpv tpvVar2 = (tpv) createBuilder2.instance;
        tpvVar2.e = 1;
        tpvVar2.b |= 8;
        createBuilder2.copyOnWrite();
        tpv tpvVar3 = (tpv) createBuilder2.instance;
        str.getClass();
        tpvVar3.b |= 2;
        tpvVar3.d = str;
        createBuilder.copyOnWrite();
        tpw tpwVar3 = (tpw) createBuilder.instance;
        tpv tpvVar4 = (tpv) createBuilder2.mo39build();
        tpvVar4.getClass();
        aopu aopuVar = tpwVar3.g;
        if (!aopuVar.c()) {
            tpwVar3.g = aopi.mutableCopy(aopuVar);
        }
        tpwVar3.g.add(tpvVar4);
        anhq.h(anko.q(this.c.b((tpw) createBuilder.mo39build())), IOException.class, new ampg() { // from class: aeqb
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                aeqe aeqeVar = aeqe.this;
                String str2 = str;
                IOException iOException = (IOException) obj;
                aopa createBuilder3 = avgf.a.createBuilder();
                createBuilder3.copyOnWrite();
                avgf avgfVar = (avgf) createBuilder3.instance;
                avgfVar.d = 1;
                avgfVar.b |= 2;
                createBuilder3.copyOnWrite();
                avgf avgfVar2 = (avgf) createBuilder3.instance;
                avgfVar2.c = 1;
                avgfVar2.b = 1 | avgfVar2.b;
                createBuilder3.copyOnWrite();
                avgf avgfVar3 = (avgf) createBuilder3.instance;
                str2.getClass();
                avgfVar3.b |= 4;
                avgfVar3.e = str2;
                arrf a = arrh.a();
                a.copyOnWrite();
                ((arrh) a.instance).dI((avgf) createBuilder3.mo39build());
                aeqeVar.a.c((arrh) a.mo39build());
                return null;
            }
        }, this.b);
        this.c.a().as(new ayqb() { // from class: aeqd
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                aeqe aeqeVar = aeqe.this;
                final azpm azpmVar2 = azpmVar;
                anii.h(anko.q(((aaev) obj).d()), new ampg() { // from class: aeqc
                    @Override // defpackage.ampg
                    public final Object apply(Object obj2) {
                        azpm.this.c((ByteBuffer) obj2);
                        return null;
                    }
                }, aeqeVar.b);
            }
        });
    }
}
