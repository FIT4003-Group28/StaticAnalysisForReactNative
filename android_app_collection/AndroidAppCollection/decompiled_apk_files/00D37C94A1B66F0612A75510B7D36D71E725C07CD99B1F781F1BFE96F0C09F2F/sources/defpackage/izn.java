package defpackage;

import java.net.ProxySelector;
/* compiled from: PG */
/* renamed from: izn  reason: default package */
/* loaded from: classes3.dex */
public final class izn implements amqo {
    private final /* synthetic */ int a;

    public izn() {
    }

    public izn(int i) {
        this.a = i;
    }

    @Override // defpackage.amqo
    public final /* bridge */ /* synthetic */ Object get() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    return i != 4 ? ProxySelector.getDefault() : amqi.c();
                }
                return new ajsn();
            }
            cmj b = cmm.b();
            b.b(1);
            b.a = "chromium-serializer";
            return b.a();
        }
        return new izl();
    }
}
