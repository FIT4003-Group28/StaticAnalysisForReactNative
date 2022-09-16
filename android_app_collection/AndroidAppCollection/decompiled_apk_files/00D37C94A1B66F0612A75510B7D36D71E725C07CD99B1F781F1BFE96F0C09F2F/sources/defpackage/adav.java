package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: adav  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adav implements ampg {
    public final /* synthetic */ adid a;
    private final /* synthetic */ int b;

    public /* synthetic */ adav(adid adidVar) {
        this.a = adidVar;
    }

    public /* synthetic */ adav(adid adidVar, int i) {
        this.b = i;
        this.a = adidVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            adid adidVar = this.a;
            String str = adbe.a;
            if (((Boolean) obj).booleanValue()) {
                return Optional.empty();
            }
            return Optional.of(adidVar);
        }
        adid adidVar2 = this.a;
        long j = adao.a;
        for (Map.Entry entry : Collections.unmodifiableMap(((awts) obj).c).entrySet()) {
            awtp awtpVar = (awtp) entry.getValue();
            awtq awtqVar = awtpVar.d;
            if (awtqVar == null) {
                awtqVar = awtq.a;
            }
            int g = awwc.g(awtqVar.g);
            if (g != 0 && g == 2) {
                awtq awtqVar2 = awtpVar.d;
                if (awtqVar2 == null) {
                    awtqVar2 = awtq.a;
                }
                if (awtqVar2.d.isEmpty()) {
                    continue;
                } else {
                    awtq awtqVar3 = awtpVar.d;
                    if (awtqVar3 == null) {
                        awtqVar3 = awtq.a;
                    }
                    if (TextUtils.equals(awtqVar3.d, adidVar2.g)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
