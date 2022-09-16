package defpackage;

import com.google.android.libraries.youtube.livecreation.controller.StreamConfig;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
/* compiled from: PG */
/* renamed from: acee  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acee implements zdt {
    public final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ acee(boolean z) {
        this.a = z;
    }

    public /* synthetic */ acee(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.b == 0) {
            int i = ScreencastHostService.s;
            ((StreamConfig) obj).o = this.a;
            return;
        }
        boolean z = this.a;
        hax haxVar = (hax) obj;
        if (haxVar == null) {
            return;
        }
        haxVar.aF(z);
    }
}
