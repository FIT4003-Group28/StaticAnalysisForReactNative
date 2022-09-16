package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: vav  reason: default package */
/* loaded from: classes4.dex */
public final class vav implements var {
    private static final amzy c = amzy.l("com/google/android/libraries/performance/primes/transmitter/impl/HashedNamesTransmitter");
    final /* synthetic */ akwo a;
    final /* synthetic */ aktl b;

    public vav() {
    }

    public vav(aktl aktlVar, akwo akwoVar) {
        this.b = aktlVar;
        this.a = akwoVar;
    }

    @Override // defpackage.var
    public final void a(baax baaxVar) {
        ((amzw) ((amzw) c.d()).i("com/google/android/libraries/performance/primes/transmitter/impl/HashedNamesTransmitter", "send", 20, "HashedNamesTransmitter.java")).s("unhashed: %s", baaxVar);
        aopa mo52toBuilder = baaxVar.mo52toBuilder();
        vau.b(vau.a, mo52toBuilder);
        azzb azzbVar = ((baax) mo52toBuilder.instance).k;
        if (azzbVar == null) {
            azzbVar = azzb.a;
        }
        boolean z = true;
        if ((azzbVar.b & 1) != 0) {
            azzb azzbVar2 = ((baax) mo52toBuilder.instance).k;
            if (azzbVar2 == null) {
                azzbVar2 = azzb.a;
            }
            azza azzaVar = azzbVar2.c;
            if (azzaVar == null) {
                azzaVar = azza.a;
            }
            aopa mo52toBuilder2 = azzaVar.mo52toBuilder();
            vau.b(vau.b, mo52toBuilder2);
            azzb azzbVar3 = ((baax) mo52toBuilder.instance).k;
            if (azzbVar3 == null) {
                azzbVar3 = azzb.a;
            }
            aopa mo52toBuilder3 = azzbVar3.mo52toBuilder();
            mo52toBuilder3.copyOnWrite();
            azzb azzbVar4 = (azzb) mo52toBuilder3.instance;
            azza azzaVar2 = (azza) mo52toBuilder2.mo39build();
            azzaVar2.getClass();
            azzbVar4.c = azzaVar2;
            azzbVar4.b |= 1;
            mo52toBuilder.copyOnWrite();
            baax baaxVar2 = (baax) mo52toBuilder.instance;
            azzb azzbVar5 = (azzb) mo52toBuilder3.mo39build();
            azzbVar5.getClass();
            baaxVar2.k = azzbVar5;
            baaxVar2.b |= 512;
        }
        baak baakVar = ((baax) mo52toBuilder.instance).h;
        if (baakVar == null) {
            baakVar = baak.a;
        }
        if ((baakVar.b & 256) != 0) {
            baak baakVar2 = ((baax) mo52toBuilder.instance).h;
            if (baakVar2 == null) {
                baakVar2 = baak.a;
            }
            angl anglVar = baakVar2.k;
            if (anglVar == null) {
                anglVar = angl.a;
            }
            aopa mo52toBuilder4 = anglVar.mo52toBuilder();
            angk angkVar = ((angl) mo52toBuilder4.instance).c;
            if (angkVar == null) {
                angkVar = angk.a;
            }
            aopa mo52toBuilder5 = angkVar.mo52toBuilder();
            String str = ((angk) mo52toBuilder5.instance).d;
            if (!str.isEmpty()) {
                long longValue = anuw.a(str).longValue();
                mo52toBuilder5.copyOnWrite();
                angk angkVar2 = (angk) mo52toBuilder5.instance;
                angkVar2.b |= 4;
                angkVar2.e = longValue;
                mo52toBuilder5.copyOnWrite();
                angk angkVar3 = (angk) mo52toBuilder5.instance;
                angkVar3.b &= -3;
                angkVar3.d = angk.a.d;
            }
            angk angkVar4 = (angk) mo52toBuilder5.mo39build();
            mo52toBuilder4.copyOnWrite();
            angl anglVar2 = (angl) mo52toBuilder4.instance;
            angkVar4.getClass();
            anglVar2.c = angkVar4;
            anglVar2.b |= 1;
            List<angk> unmodifiableList = Collections.unmodifiableList(anglVar2.d);
            mo52toBuilder4.copyOnWrite();
            ((angl) mo52toBuilder4.instance).d = angl.emptyProtobufList();
            for (angk angkVar5 : unmodifiableList) {
                aopa mo52toBuilder6 = angkVar5.mo52toBuilder();
                String str2 = ((angk) mo52toBuilder6.instance).d;
                if (!str2.isEmpty()) {
                    long longValue2 = anuw.a(str2).longValue();
                    mo52toBuilder6.copyOnWrite();
                    angk angkVar6 = (angk) mo52toBuilder6.instance;
                    angkVar6.b |= 4;
                    angkVar6.e = longValue2;
                    mo52toBuilder6.copyOnWrite();
                    angk angkVar7 = (angk) mo52toBuilder6.instance;
                    angkVar7.b &= -3;
                    angkVar7.d = angk.a.d;
                }
                angk angkVar8 = (angk) mo52toBuilder6.mo39build();
                mo52toBuilder4.copyOnWrite();
                angl anglVar3 = (angl) mo52toBuilder4.instance;
                angkVar8.getClass();
                anglVar3.a();
                anglVar3.d.add(angkVar8);
            }
            baak baakVar3 = ((baax) mo52toBuilder.instance).h;
            if (baakVar3 == null) {
                baakVar3 = baak.a;
            }
            aopa mo52toBuilder7 = baakVar3.mo52toBuilder();
            angl anglVar4 = (angl) mo52toBuilder4.mo39build();
            mo52toBuilder7.copyOnWrite();
            baak baakVar4 = (baak) mo52toBuilder7.instance;
            anglVar4.getClass();
            baakVar4.k = anglVar4;
            baakVar4.b |= 256;
            baak baakVar5 = (baak) mo52toBuilder7.mo39build();
            mo52toBuilder.copyOnWrite();
            baax baaxVar3 = (baax) mo52toBuilder.instance;
            baakVar5.getClass();
            baaxVar3.h = baakVar5;
            baaxVar3.b |= 64;
        }
        baaq baaqVar = ((baax) mo52toBuilder.instance).j;
        if (baaqVar == null) {
            baaqVar = baaq.a;
        }
        if (baaqVar.k.size() != 0) {
            baaq baaqVar2 = ((baax) mo52toBuilder.instance).j;
            if (baaqVar2 == null) {
                baaqVar2 = baaq.a;
            }
            aopa mo52toBuilder8 = baaqVar2.mo52toBuilder();
            for (int i = 0; i < ((baaq) mo52toBuilder8.instance).k.size(); i++) {
                aopa mo52toBuilder9 = ((baap) ((baaq) mo52toBuilder8.instance).k.get(i)).mo52toBuilder();
                if (!TextUtils.isEmpty(((baap) mo52toBuilder9.instance).c)) {
                    mo52toBuilder9.copyOnWrite();
                    ((baap) mo52toBuilder9.instance).d = baap.emptyLongList();
                    List a = vau.a(((baap) mo52toBuilder9.instance).c);
                    mo52toBuilder9.copyOnWrite();
                    baap baapVar = (baap) mo52toBuilder9.instance;
                    aopt aoptVar = baapVar.d;
                    if (!aoptVar.c()) {
                        baapVar.d = aopi.mutableCopy(aoptVar);
                    }
                    aonk.addAll((Iterable) a, (List) baapVar.d);
                }
                mo52toBuilder9.copyOnWrite();
                baap baapVar2 = (baap) mo52toBuilder9.instance;
                baapVar2.b &= -2;
                baapVar2.c = baap.a.c;
                mo52toBuilder8.copyOnWrite();
                baaq baaqVar3 = (baaq) mo52toBuilder8.instance;
                baap baapVar3 = (baap) mo52toBuilder9.mo39build();
                baapVar3.getClass();
                aopu aopuVar = baaqVar3.k;
                if (!aopuVar.c()) {
                    baaqVar3.k = aopi.mutableCopy(aopuVar);
                }
                baaqVar3.k.set(i, baapVar3);
            }
            mo52toBuilder.copyOnWrite();
            baax baaxVar4 = (baax) mo52toBuilder.instance;
            baaq baaqVar4 = (baaq) mo52toBuilder8.mo39build();
            baaqVar4.getClass();
            baaxVar4.j = baaqVar4;
            baaxVar4.b |= 256;
        }
        azzw azzwVar = ((baax) mo52toBuilder.instance).g;
        if (azzwVar == null) {
            azzwVar = azzw.a;
        }
        if (azzwVar.b.size() != 0) {
            azzw azzwVar2 = ((baax) mo52toBuilder.instance).g;
            if (azzwVar2 == null) {
                azzwVar2 = azzw.a;
            }
            aopa mo52toBuilder10 = azzwVar2.mo52toBuilder();
            for (int i2 = 0; i2 < ((azzw) mo52toBuilder10.instance).b.size(); i2++) {
                aopa mo52toBuilder11 = ((azzv) ((azzw) mo52toBuilder10.instance).b.get(i2)).mo52toBuilder();
                if (!TextUtils.isEmpty(((azzv) mo52toBuilder11.instance).v)) {
                    mo52toBuilder11.copyOnWrite();
                    ((azzv) mo52toBuilder11.instance).w = azzv.emptyLongList();
                    List a2 = vau.a(((azzv) mo52toBuilder11.instance).v);
                    mo52toBuilder11.copyOnWrite();
                    azzv azzvVar = (azzv) mo52toBuilder11.instance;
                    aopt aoptVar2 = azzvVar.w;
                    if (!aoptVar2.c()) {
                        azzvVar.w = aopi.mutableCopy(aoptVar2);
                    }
                    aonk.addAll((Iterable) a2, (List) azzvVar.w);
                }
                mo52toBuilder11.copyOnWrite();
                azzv azzvVar2 = (azzv) mo52toBuilder11.instance;
                azzvVar2.b &= -524289;
                azzvVar2.v = azzv.a.v;
                mo52toBuilder10.copyOnWrite();
                azzw azzwVar3 = (azzw) mo52toBuilder10.instance;
                azzv azzvVar3 = (azzv) mo52toBuilder11.mo39build();
                azzvVar3.getClass();
                azzwVar3.a();
                azzwVar3.b.set(i2, azzvVar3);
            }
            mo52toBuilder.copyOnWrite();
            baax baaxVar5 = (baax) mo52toBuilder.instance;
            azzw azzwVar4 = (azzw) mo52toBuilder10.mo39build();
            azzwVar4.getClass();
            baaxVar5.g = azzwVar4;
            baaxVar5.b |= 32;
        }
        baaa baaaVar = ((baax) mo52toBuilder.instance).n;
        if (baaaVar == null) {
            baaaVar = baaa.a;
        }
        if (baaaVar.e.size() != 0) {
            baaa baaaVar2 = ((baax) mo52toBuilder.instance).n;
            if (baaaVar2 == null) {
                baaaVar2 = baaa.a;
            }
            aopa mo52toBuilder12 = baaaVar2.mo52toBuilder();
            for (int i3 = 0; i3 < ((baaa) mo52toBuilder12.instance).e.size(); i3++) {
                aopa mo52toBuilder13 = ((baab) ((baaa) mo52toBuilder12.instance).e.get(i3)).mo52toBuilder();
                vau.b(vau.c, mo52toBuilder13);
                mo52toBuilder12.copyOnWrite();
                baaa baaaVar3 = (baaa) mo52toBuilder12.instance;
                baab baabVar = (baab) mo52toBuilder13.mo39build();
                baabVar.getClass();
                aopu aopuVar2 = baaaVar3.e;
                if (!aopuVar2.c()) {
                    baaaVar3.e = aopi.mutableCopy(aopuVar2);
                }
                baaaVar3.e.set(i3, baabVar);
            }
            mo52toBuilder.copyOnWrite();
            baax baaxVar6 = (baax) mo52toBuilder.instance;
            baaa baaaVar4 = (baaa) mo52toBuilder12.mo39build();
            baaaVar4.getClass();
            baaxVar6.n = baaaVar4;
            baaxVar6.b |= 16384;
        }
        baax baaxVar7 = (baax) mo52toBuilder.mo39build();
        aveo aveoVar = this.a.b;
        if (baaxVar7 == null || (baaxVar7.b & 64) == 0) {
            z = false;
        }
        akuc akucVar = new akuc(aveoVar, baaxVar7, z);
        baak baakVar6 = baaxVar7.h;
        if (baakVar6 == null) {
            baakVar6 = baak.a;
        }
        int j = azst.j(baakVar6.g);
        if (j == 0 || j != 6) {
            if (akucVar.c()) {
                this.b.a.f(akucVar);
                return;
            } else {
                this.b.a.d(akucVar);
                return;
            }
        }
        avfd avfdVar = this.b.b.get().e;
        if (avfdVar == null) {
            avfdVar = avfd.a;
        }
        if (!avfdVar.r) {
            return;
        }
        this.b.c.c(akucVar);
    }
}
