package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: drf  reason: default package */
/* loaded from: classes3.dex */
public abstract class drf {
    final List a = new ArrayList();

    public abstract dqz a(String str, dpu dpuVar, List list);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dqz b(String str) {
        if (this.a.contains(dqt.h(str))) {
            String valueOf = String.valueOf(str);
            throw new UnsupportedOperationException(valueOf.length() != 0 ? "Command not implemented: ".concat(valueOf) : new String("Command not implemented: "));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
