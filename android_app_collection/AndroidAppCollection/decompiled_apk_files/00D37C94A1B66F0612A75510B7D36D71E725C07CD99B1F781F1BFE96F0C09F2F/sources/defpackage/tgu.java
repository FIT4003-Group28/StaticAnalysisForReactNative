package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: tgu  reason: default package */
/* loaded from: classes4.dex */
public final class tgu implements tcw {
    private final String b;
    private final thu c;
    private final Executor d;
    private final ajiy e;
    private final aolu f;

    public tgu(aolu aoluVar, thu thuVar, Executor executor, ajiy ajiyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f = aoluVar;
        this.c = thuVar;
        this.d = executor;
        String b = thuVar.b();
        this.b = b;
        this.e = ajiyVar;
        thuVar.d(b);
    }

    @Override // defpackage.tcw
    public final tcy a(int i) {
        return new tgw(this.b, i, this.c, this.d);
    }

    @Override // defpackage.tcw
    public final boolean b() {
        return this.e.a(thq.COMMAND_EXECUTION);
    }
}
