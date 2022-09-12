package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: awkm  reason: default package */
/* loaded from: classes3.dex */
final class awkm implements avoy {
    final /* synthetic */ awkq a;

    public awkm(awkq awkqVar) {
        this.a = awkqVar;
    }

    @Override // defpackage.avoy
    public final void a(avpd avpdVar) {
        long j = awkq.a;
        avoq avoqVar = (avoq) avpdVar;
        this.a.i = avoqVar.a;
        if (this.a.i == null) {
            return;
        }
        String a = bvom.a(Locale.getDefault());
        if (!avoqVar.c.a && a.equals(this.a.k)) {
            return;
        }
        this.a.a(avoqVar.b, 0);
        this.a.k = a;
    }
}
