package defpackage;

import android.app.Activity;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: awny  reason: default package */
/* loaded from: classes.dex */
public final class awny extends afhx {
    public static final dbsl<afga> a = awnx.a;
    private final Activity b;

    public awny(Intent intent, @dzsi String str, gga ggaVar) {
        super(intent, str, afid.OOB_FLOW_ONLY);
        this.b = ggaVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        this.b.setResult(-1);
        this.b.finish();
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_OOB_FLOW_ONLY;
    }
}
