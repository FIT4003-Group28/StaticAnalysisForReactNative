package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.List;
/* compiled from: PG */
/* renamed from: kow  reason: default package */
/* loaded from: classes3.dex */
public final class kow extends aien {
    private final fgj e;

    public kow(fgj fgjVar) {
        this.e = fgjVar;
    }

    public final void a(WatchNextResponseModel watchNextResponseModel) {
        audg audgVar;
        if (watchNextResponseModel == null || (audgVar = watchNextResponseModel.g) == null) {
            return;
        }
        amuf f = amuk.f();
        int i = -1;
        int i2 = 0;
        for (audf audfVar : audgVar.i) {
            if ((audfVar.b & 1) != 0) {
                audk audkVar = audfVar.c;
                if (audkVar == null) {
                    audkVar = audk.a;
                }
                boolean z = audkVar.k;
                if (true == z) {
                    i = i2;
                }
                if (z || (audkVar.b & 2048) == 0) {
                    fgj fgjVar = this.e;
                    apzg apzgVar = audkVar.m;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    f.h(fgjVar.c(apzgVar));
                    i2++;
                }
            }
        }
        kov kovVar = new kov(f.g(), i);
        amuk amukVar = kovVar.a;
        if (amukVar.isEmpty()) {
            return;
        }
        int max = Math.max(0, kovVar.b);
        int b = b(0);
        i(b, amukVar);
        if (b != 0) {
            synchronized (this) {
                ((List) this.a.get(0)).subList(0, b).clear();
                int i3 = this.c;
                super.n(b);
                for (aies aiesVar : this.b) {
                    aiesVar.c(0, b);
                }
                super.d(i3);
            }
        }
        h(max);
    }
}
