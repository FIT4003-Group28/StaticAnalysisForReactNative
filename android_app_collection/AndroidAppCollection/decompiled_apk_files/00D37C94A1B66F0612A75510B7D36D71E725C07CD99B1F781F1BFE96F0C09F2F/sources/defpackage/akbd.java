package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: akbd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akbd implements zdt {
    public final /* synthetic */ akbb a;
    private final /* synthetic */ int b;

    public /* synthetic */ akbd(akbb akbbVar, int i) {
        this.b = i;
        this.a = akbbVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.b == 0) {
            this.a.f = (Drawable) obj;
            return;
        }
        this.a.e = (Drawable) obj;
    }
}
