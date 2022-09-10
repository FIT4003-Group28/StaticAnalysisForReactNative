package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.lang.ref.WeakReference;
import java.util.logging.Level;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqbj  reason: default package */
/* loaded from: classes2.dex */
public final class aqbj implements crzp<ContactId> {
    private final WeakReference<aqbo> a;

    public aqbj(aqbo aqboVar) {
        this.a = new WeakReference<>(aqboVar);
    }

    @Override // defpackage.crzp
    public final void On(crzm<ContactId> crzmVar) {
        dehn<dbsg<ctyy>> j;
        aqbo aqboVar = this.a.get();
        ContactId l = crzmVar.l();
        if (aqboVar == null || l == null) {
            return;
        }
        aqboVar.h.remove(l);
        if (l.a().equals(aqboVar.a.a().o())) {
            j = aqboVar.g(aqda.e(l));
        } else {
            j = aqboVar.j(l);
        }
        Level level = Level.INFO;
        String valueOf = String.valueOf(l);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
        sb.append("Failed to refresh registration on invalidation for user ");
        sb.append(valueOf);
        deha.q(j, new aqbd(level, sb.toString()), dege.a);
    }
}
