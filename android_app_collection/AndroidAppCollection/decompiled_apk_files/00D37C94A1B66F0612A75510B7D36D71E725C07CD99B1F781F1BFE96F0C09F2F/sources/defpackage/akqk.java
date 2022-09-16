package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: akqk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akqk implements amqo {
    public final /* synthetic */ akqn a;
    private final /* synthetic */ int b;

    public /* synthetic */ akqk(akqn akqnVar, int i) {
        this.b = i;
        this.a = akqnVar;
    }

    @Override // defpackage.amqo
    public final Object get() {
        if (this.b == 0) {
            File file = new File(this.a.a);
            if (!file.exists() || !file.canRead()) {
                return amuk.q();
            }
            return amuk.p(file.listFiles(afjv.b));
        }
        return this.a.b.listFiles(zec.b);
    }
}
