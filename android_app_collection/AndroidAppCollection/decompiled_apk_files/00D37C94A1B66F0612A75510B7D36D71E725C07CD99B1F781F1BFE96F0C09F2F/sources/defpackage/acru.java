package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: acru  reason: default package */
/* loaded from: classes.dex */
final class acru implements Runnable {
    final /* synthetic */ cff a;
    final /* synthetic */ acrw b;

    public acru(acrw acrwVar, cff cffVar) {
        this.b = acrwVar;
        this.a = cffVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aopa a = this.b.a.a();
        ArrayList arrayList = new ArrayList();
        for (aopa aopaVar : this.b.b) {
            arrf a2 = arrh.a();
            try {
                a2.m29mergeFrom(((oro) aopaVar.instance).e, aoos.b());
                if (!this.b.f.b.d.contains(((arrh) a2.instance).b())) {
                    arrayList.add((arrh) a2.mo39build());
                }
            } catch (aopx e) {
                this.b.f.e(String.valueOf(getClass().getCanonicalName()).concat(" could not deserialize ClientEvent when retryOnError."), e);
            }
        }
        if (!arrayList.isEmpty()) {
            a.copyOnWrite();
            arrj arrjVar = arrj.a;
            ((arrj) a.instance).f = arrj.emptyProtobufList();
            a.ah(arrayList);
            arrj arrjVar2 = (arrj) a.mo39build();
            acrw acrwVar = this.b;
            String str = acrwVar.c;
            afuq afuqVar = acrwVar.d;
            String str2 = afuqVar.a;
            boolean z = afuqVar.b;
            aopa aopaVar2 = null;
            if (!TextUtils.isEmpty(str) && arrjVar2 != null) {
                aopaVar2 = oro.a.createBuilder();
                aoob byteString = arrjVar2.toByteString();
                aopaVar2.copyOnWrite();
                oro oroVar = (oro) aopaVar2.instance;
                oroVar.b |= 4;
                oroVar.e = byteString;
                aopaVar2.copyOnWrite();
                oro oroVar2 = (oro) aopaVar2.instance;
                oroVar2.b |= 2;
                oroVar2.d = "event_logging_fixed_batch_retry";
                aopaVar2.copyOnWrite();
                oro oroVar3 = (oro) aopaVar2.instance;
                str.getClass();
                oroVar3.b |= 16;
                oroVar3.g = str;
                if (!TextUtils.isEmpty(str2)) {
                    aopaVar2.copyOnWrite();
                    oro oroVar4 = (oro) aopaVar2.instance;
                    str2.getClass();
                    oroVar4.b |= 128;
                    oroVar4.j = str2;
                }
                aopaVar2.copyOnWrite();
                oro oroVar5 = (oro) aopaVar2.instance;
                oroVar5.b |= 256;
                oroVar5.k = z;
            }
            if (aopaVar2 == null) {
                return;
            }
            this.b.f.d("Store back to delayeEventService for retrying.");
            acrx acrxVar = this.b.f;
            acrxVar.c.i(acrxVar.a(), new ArrayList(Arrays.asList(aopaVar2)), this.a);
        }
    }
}
