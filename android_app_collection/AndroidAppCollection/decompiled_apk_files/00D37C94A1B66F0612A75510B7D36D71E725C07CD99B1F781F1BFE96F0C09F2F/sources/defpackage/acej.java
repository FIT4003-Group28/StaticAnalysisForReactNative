package defpackage;

import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
/* compiled from: PG */
/* renamed from: acej  reason: default package */
/* loaded from: classes.dex */
public final class acej implements abwy {
    final /* synthetic */ ScreencastHostService a;
    private final int b;

    public acej(ScreencastHostService screencastHostService, boolean z) {
        this.a = screencastHostService;
        this.b = b(z);
    }

    private static final int b(boolean z) {
        return z ? 4 : 2;
    }

    @Override // defpackage.abwy
    public final void a(Object obj) {
        if (obj instanceof astf) {
            astf astfVar = (astf) obj;
            int i = this.b;
            astfVar.copyOnWrite();
            asth asthVar = (asth) astfVar.instance;
            asth asthVar2 = asth.a;
            asthVar.e = i - 1;
            asthVar.b |= 4;
            boolean z = true;
            if (this.a.getResources().getConfiguration().orientation != 1) {
                z = false;
            }
            astfVar.copyOnWrite();
            asth asthVar3 = (asth) astfVar.instance;
            asthVar3.d = b(z) - 1;
            asthVar3.b |= 2;
        }
    }
}
