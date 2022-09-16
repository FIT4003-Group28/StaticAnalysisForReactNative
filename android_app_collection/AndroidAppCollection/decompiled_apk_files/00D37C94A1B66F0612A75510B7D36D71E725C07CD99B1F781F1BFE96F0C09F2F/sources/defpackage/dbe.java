package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.litho.ComponentHost;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbe  reason: default package */
/* loaded from: classes3.dex */
public final class dbe extends cyr {
    public SparseArray a;

    public dbe() {
        super("HostComponent");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dbe a() {
        return new dbe();
    }

    @Override // defpackage.czb
    protected final int F() {
        return 45;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final dcm I() {
        return dfz.m ? new daf() : super.I();
    }

    @Override // defpackage.czb
    protected final Object L(Context context) {
        return new ComponentHost(new cyv(context));
    }

    @Override // defpackage.czb
    protected final void S(cyv cyvVar, Object obj) {
        ((ComponentHost) obj).setAlpha(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void W(cyv cyvVar, Object obj) {
        ComponentHost componentHost = (ComponentHost) obj;
        if (componentHost.isPressed()) {
            componentHost.setPressed(false);
        }
    }

    @Override // defpackage.czb
    protected final boolean ai(cyr cyrVar, cyr cyrVar2) {
        return true;
    }

    @Override // defpackage.czb
    public final int aj() {
        return 3;
    }

    @Override // defpackage.cyr
    public final boolean e(cyr cyrVar) {
        return this == cyrVar;
    }

    @Override // defpackage.cyr, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((cyr) obj);
    }

    @Override // defpackage.cyr
    public final SparseArray g() {
        return this.a;
    }

    @Override // defpackage.cyr
    public final boolean u() {
        return this.a != null;
    }
}
