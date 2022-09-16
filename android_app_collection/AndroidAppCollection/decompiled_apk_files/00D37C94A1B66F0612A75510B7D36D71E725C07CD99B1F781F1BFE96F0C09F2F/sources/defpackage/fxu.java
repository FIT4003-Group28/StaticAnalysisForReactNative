package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: fxu  reason: default package */
/* loaded from: classes3.dex */
public final class fxu extends ges {
    private final aacz b;

    public fxu(View view, ger gerVar, aacz aaczVar) {
        super(view, gerVar);
        this.b = aaczVar;
    }

    @Override // defpackage.ges
    protected final float a() {
        asxj asxjVar = this.b.b().e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        return asxjVar.aV / 100.0f;
    }

    @Override // defpackage.ges
    protected final float b() {
        asxj asxjVar = this.b.b().e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        return asxjVar.aW / 100.0f;
    }
}
