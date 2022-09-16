package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import j$.util.function.IntConsumer;
import j$.util.function.IntPredicate;
import j$.util.stream.IntStream;
/* compiled from: PG */
/* renamed from: ahyd  reason: default package */
/* loaded from: classes.dex */
public final class ahyd implements ahxy, airt, ynl {
    public final airr a;
    public final ahxz b;

    public ahyd(airr airrVar, ahxz ahxzVar) {
        this.a = airrVar;
        ahxzVar.getClass();
        this.b = ahxzVar;
        ((jxr) ahxzVar).c.a(this);
    }

    public final void a(aesr aesrVar) {
        ((jxr) this.b).b.g(aesrVar.i());
        if (aesrVar.i()) {
            FormatStreamModel e = aesrVar.e();
            final aalv[] k = aesrVar.k();
            final String q = e != null ? e.q() : null;
            IntStream.CC.range(0, k.length).filter(new IntPredicate() { // from class: ahyc
                @Override // j$.util.function.IntPredicate
                public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                    return intPredicate.getClass();
                }

                @Override // j$.util.function.IntPredicate
                public final /* synthetic */ IntPredicate negate() {
                    return IntPredicate.CC.$default$negate(this);
                }

                @Override // j$.util.function.IntPredicate
                public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
                    return intPredicate.getClass();
                }

                @Override // j$.util.function.IntPredicate
                public final boolean test(int i) {
                    aalv[] aalvVarArr = k;
                    return aalvVarArr[i].a.equals(q);
                }
            }).findFirst().ifPresent(new IntConsumer() { // from class: ahyb
                @Override // j$.util.function.IntConsumer
                public final void accept(int i) {
                    ahyd ahydVar = ahyd.this;
                    aalv[] aalvVarArr = k;
                    jxr jxrVar = (jxr) ahydVar.b;
                    jxrVar.c.b(aalvVarArr, i);
                    String str = null;
                    if (aalvVarArr != null && i >= 0 && i < aalvVarArr.length) {
                        str = aalvVarArr[i].b;
                    }
                    jxrVar.b.d(str);
                }

                @Override // j$.util.function.IntConsumer
                public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return intConsumer.getClass();
                }
            });
        }
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().k.h(aiwv.n(airwVar.aB(), 4096L)).h(aiwv.l(1)).aa(new ayqb() { // from class: ahya
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ahyd.this.a((aesr) obj);
            }
        }, ahqs.l)};
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                a((aesr) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{aesr.class};
    }
}
