package defpackage;

import com.google.android.apps.youtube.app.ui.inline.DefaultInlinePlayerControls;
/* compiled from: PG */
/* renamed from: mcc  reason: default package */
/* loaded from: classes3.dex */
public final class mcc extends fdm {
    public boolean a;
    final /* synthetic */ DefaultInlinePlayerControls b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcc(DefaultInlinePlayerControls defaultInlinePlayerControls, feh fehVar) {
        super(fehVar);
        this.b = defaultInlinePlayerControls;
    }

    @Override // defpackage.feg
    public final void kF() {
        this.a = false;
        DefaultInlinePlayerControls defaultInlinePlayerControls = this.b;
        if (defaultInlinePlayerControls.c == null || defaultInlinePlayerControls.a != 0) {
            return;
        }
        defaultInlinePlayerControls.i();
    }

    @Override // defpackage.feg
    public final void nr() {
        this.a = true;
    }
}
