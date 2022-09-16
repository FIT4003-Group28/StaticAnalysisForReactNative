package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: aixp  reason: default package */
/* loaded from: classes.dex */
public final class aixp implements aixo {
    private final zie a = new zie(Collections.emptyMap());
    private final zib b = aiwv.e();
    private final zdt c;

    public aixp(zdt zdtVar) {
        this.c = zdtVar;
    }

    @Override // defpackage.aixo
    public final void a(aixr aixrVar, pwu pwuVar, long j, int i) {
        aixrVar.b(j);
        try {
            try {
                aixy a = ((aixz) this.a.b(new yun(ByteBuffer.wrap(pwuVar.a, pwuVar.b, i)), this.b)).a();
                pwuVar.G(pwuVar.b + pwuVar.a());
                if (j == 0) {
                    aixrVar.a(aixy.a(this.c, j));
                    return;
                }
                zdt zdtVar = this.c;
                ArrayList arrayList = new ArrayList();
                if (!a.a.isEmpty()) {
                    int i2 = 0;
                    while (i2 < a.a.size() - 1) {
                        int i3 = i2 + 1;
                        arrayList.add(new aixw(((Long) a.a.get(i2)).longValue() + j, ((Long) a.a.get(i3)).longValue() + j, a.b(((Long) a.a.get(i2)).longValue()), zdtVar));
                        i2 = i3;
                    }
                }
                aixrVar.a(arrayList);
            } catch (IOException | zia unused) {
                aixrVar.a(aixy.a(this.c, j));
                pwuVar.G(pwuVar.b + pwuVar.a());
            }
        } catch (Throwable th) {
            pwuVar.G(pwuVar.b + pwuVar.a());
            throw th;
        }
    }
}
