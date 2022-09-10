package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azwg  reason: default package */
/* loaded from: classes3.dex */
public final class azwg extends azwm {
    final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azwg(long j, String str) {
        super("", 0L, j);
        this.a = str;
    }

    @Override // defpackage.azwm
    public final String e(@dzsi Context context) {
        return this.a;
    }

    @Override // defpackage.azwm
    @dzsi
    public final azxm<?> h() {
        return null;
    }

    @Override // defpackage.azwm
    public final azwh<?> i() {
        throw new UnsupportedOperationException();
    }
}
