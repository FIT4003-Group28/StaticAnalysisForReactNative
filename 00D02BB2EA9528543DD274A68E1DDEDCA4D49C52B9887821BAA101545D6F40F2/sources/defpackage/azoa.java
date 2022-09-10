package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azoa  reason: default package */
/* loaded from: classes3.dex */
public final class azoa implements aznm<Long> {
    final /* synthetic */ azxm a;
    final /* synthetic */ String b;
    final /* synthetic */ azwm c;
    final /* synthetic */ azof d;

    public azoa(azof azofVar, azxm azxmVar, String str, azwm azwmVar) {
        this.d = azofVar;
        this.a = azxmVar;
        this.b = str;
        this.c = azwmVar;
    }

    @Override // defpackage.aznm
    public final /* bridge */ /* synthetic */ Long a() {
        aznl aznlVar = aznl.ADD;
        try {
            aznp p = aznn.p(this.a.b(), this.b);
            if (p != null) {
                aznlVar = p.e == aznl.ADD ? aznl.ADD : aznl.UPDATE;
            }
        } catch (IllegalArgumentException unused) {
        }
        return Long.valueOf(aznn.q(azof.n(this.a, this.c, this.b, aznlVar)));
    }
}
