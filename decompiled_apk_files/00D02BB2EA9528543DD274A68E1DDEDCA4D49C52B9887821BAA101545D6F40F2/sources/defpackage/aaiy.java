package defpackage;

import java.util.List;
/* renamed from: aaiy  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class aaiy {
    @dzsi
    public static aaja a(final List<aajb> list) {
        if (list.isEmpty()) {
            return null;
        }
        return new aaja(list) { // from class: aaiz
            private final List a;

            {
                this.a = list;
            }

            @Override // defpackage.aaja
            public List a() {
                return this.a;
            }
        };
    }
}
