package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.List;
/* compiled from: PG */
/* renamed from: ctpn  reason: default package */
/* loaded from: classes5.dex */
final class ctpn extends ctqp {
    private dcdc<ContactId> a;

    @Override // defpackage.ctqp
    public final void b(List<ContactId> list) {
        this.a = dcdc.r(list);
    }

    @Override // defpackage.ctqp
    public final ctqq a() {
        String str = this.a == null ? " contactIds" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new ctpo(this.a);
    }
}
