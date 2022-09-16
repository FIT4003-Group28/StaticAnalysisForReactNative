package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: vnj  reason: default package */
/* loaded from: classes4.dex */
public final class vnj extends vkt {
    private final aoqu a;

    public vnj(aoqu aoquVar) {
        this.a = aoquVar;
    }

    @Override // defpackage.vkt
    public final ankt a(final IOException iOException, vku vkuVar) {
        if (!(iOException.getCause() instanceof aopx)) {
            return anlz.p(iOException);
        }
        return anhq.i(vkuVar.a(anlz.q(this.a)), IOException.class, new anir() { // from class: vni
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                IOException iOException2 = (IOException) obj;
                throw iOException;
            }
        }, anjk.a);
    }
}
